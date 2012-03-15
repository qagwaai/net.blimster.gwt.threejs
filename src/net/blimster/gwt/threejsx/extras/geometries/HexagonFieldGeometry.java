/*
 *
 * This file is part of three4g.
 *
 * three4g is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesse General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * three4g is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public 
 * License along with three4g. If not, see <http://www.gnu.org/licenses/>.
 *
 * (c) 2012 by Oliver Damm, Am Wasserberg 8, 22869 Schenefeld
 *
 * mail: oliver [dot] damm [at] gmx [dot] de
 * web: http://www.blimster.net 
 */
package net.blimster.gwt.threejsx.extras.geometries;

import net.blimster.gwt.threejs.core.Face3;
import net.blimster.gwt.threejs.core.Geometry;
import net.blimster.gwt.threejs.core.Vector2;
import net.blimster.gwt.threejs.core.Vector3;
import net.blimster.gwt.threejs.core.Vertex;

/**
 * @author Oliver Damm
 */
public final class HexagonFieldGeometry extends Geometry
{

    protected HexagonFieldGeometry()
    {
	super();
    }

    public static HexagonFieldGeometry create(double vertexRadius, int hexagonsX, int hexagonsY)
    {
	return create(vertexRadius, hexagonsX, hexagonsY, null);
    }

    public static HexagonFieldGeometry create(double vertexRadius, int hexagonsX, int hexagonsY,
	    HeightProvider heightProvider)
    {
	HexagonFieldGeometry geometry = Geometry.create().cast();
	geometry.init(vertexRadius, hexagonsX, hexagonsY);

	HexagonGeometry template = HexagonGeometry.create(vertexRadius);

	for (int y = 0; y < hexagonsY; y++)
	{
	    for (int x = 0; x < hexagonsX; x++)
	    {
		for (int v = 0; v < 6; v++)
		{
		    Vertex vertex = template.getVertices().get(v);

		    Vector2 hexCenter = HexagonFieldMath.getHexagonCenter(vertexRadius, x, y, hexagonsX, hexagonsY);

		    double vx = vertex.getPosition().getX() + hexCenter.getX();
		    double vy = vertex.getPosition().getY() + hexCenter.getY();
		    double vz = 0.0;

		    if (heightProvider != null)
		    {
			vz = heightProvider.getHeight(vx, vy);
		    }

		    geometry.getVertices().push(Vertex.create(Vector3.create(vx, vy, vz)));
		}
		for (int f = 0; f < 4; f++)
		{
		    Face3 faceTemplate = template.getFaces().get(f).cast();

		    int offset = (y * hexagonsY + x) * 6;
		    Face3 face = Face3.create(faceTemplate.getA() + offset, faceTemplate.getB() + offset, faceTemplate
			    .getC()
			    + offset);
		    face.setMaterialIndex(0);

		    geometry.getFaces().push(face);
		}
	    }
	}

	geometry.computeFaceNormals();

	for (int y = 0; y < hexagonsY; y++)
	{
	    for (int x = 0; x < hexagonsX; x++)
	    {
		Vector3 normal = Vector3.create();
		for (int i = 0; i < 4; i++)
		{
		    normal.addSelf(geometry.getFaces().get((y * hexagonsY + x) * 4 + i).getNormal());
		}
		normal.normalize();
		for (int i = 0; i < 4; i++)
		{
		    geometry.getFaces().get((y * hexagonsY + x) * 4 + i).getNormal().copy(normal);
		}

	    }
	}

	geometry.computeCentroids();

	return geometry;
    }

    public void setHexagonMaterial(int hexagonX, int hexagonY, int materialIndex)
    {
	setHexagonMaterial(hexagonY * getHexagonsY() + hexagonY, materialIndex);
    }

    public void setHexagonMaterial(int hexagonIndex, int materialIndex)
    {
	for (int i = 0; i < 4; i++)
	{
	    getFaces().get(hexagonIndex * 4 + i).setMaterialIndex(materialIndex);
	}
    }

    public int getHexagonIndex(double x, double y)
    {
	return HexagonFieldMath.getHexagonIndex(getVertexRadius(), x, y, getHexagonsX(), getHexagonsX());
    }

    public native double getVertexRadius()
    /*-{

		return this.vertexRadius;

    }-*/;

    public native int getHexagonsX()
    /*-{

		return this.hexagonsX;

    }-*/;

    public native int getHexagonsY()
    /*-{

		return this.hexagonsY;

    }-*/;

    private native void init(double vertexRadius, int hexagonsX, int hexagonsY)
    /*-{

		this.vertexRadius = vertexRadius;
		this.hexagonsX = hexagonsX;
		this.hexagonsY = hexagonsY;

    }-*/;

}
