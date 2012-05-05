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
import net.blimster.gwt.threejs.core.Matrix4;
import net.blimster.gwt.threejs.core.UV;
import net.blimster.gwt.threejs.core.Vector3;
import net.blimster.gwt.threejsx.util.Arrays;

/**
 * @author Oliver Damm
 */
public final class HexagonGeometry extends Geometry
{

    protected HexagonGeometry()
    {
	super();
    }

    public static HexagonGeometry create(double radius)
    {
	HexagonGeometry result = Geometry.create().cast();

	Vector3 v = Vector3.create(0.0, radius, 0.0);
	for (int i = 0; i < 6; i++)
	{
	    result.getVertices().push(v.clone());
	    Matrix4.create().makeRotationZ(Math.PI * 2 / 360 * 60).multiplyVector3(v);
	}

	Face3 face = Face3.create(0, 1, 5);
	result.getFaces().push(face);

	face = Face3.create(1, 2, 5);
	result.getFaces().push(face);

	face = Face3.create(2, 4, 5);
	result.getFaces().push(face);

	face = Face3.create(2, 3, 4);
	result.getFaces().push(face);

	result.getFaceVertexUvs().get(0).push(
		Arrays.createArray(UV.create(0.5, 0.0), UV.create(1.0, 0.25), UV.create(0.0, 0.25)));
	result.getFaceVertexUvs().get(0).push(
		Arrays.createArray(UV.create(0.0, 0.25), UV.create(0.0, 0.75), UV.create(1.0, 0.25)));
	result.getFaceVertexUvs().get(0).push(
		Arrays.createArray(UV.create(0.0, 0.75), UV.create(1.0, 0.75), UV.create(1.0, 0.25)));
	result.getFaceVertexUvs().get(0).push(
		Arrays.createArray(UV.create(0.0, 0.75), UV.create(0.5, 1.00), UV.create(1.0, 0.75)));

	result.computeFaceNormals();

	Vector3 normal = Vector3.create();
	for (int i = 0; i < 4; i++)
	{
	    normal.addSelf(result.getFaces().get(i).getNormal());
	}
	normal.normalize();

	for (int i = 0; i < 4; i++)
	{
	    result.getFaces().get(i).getNormal().copy(normal);
	}

	result.computeCentroids();

	return result;
    }

}
