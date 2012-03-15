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

import net.blimster.gwt.threejs.core.Vector2;

/**
 * @author Oliver Damm
 */
public final class HexagonFieldMath
{

    private static double DEGREE_2_RADIAN = 1.0 / 360.0 * Math.PI * 2;

    protected static Vector2 getHexagonCenter(double vertexRadius, int hexagonX, int hexagonY, int hexagonsX,
	    int hexagonsY)
    {
	double a = vertexRadius;
	double b = edgeLength(a) / 2.0;
	double c = Math.sqrt(a * a - b * b);

	double x = hexagonX * c * 2 + hexagonY % 2 * c - c * (hexagonsX - 1);
	double y = hexagonY * b * 3 - b * 1.5 * (hexagonsY - 1);

	return Vector2.create(x, y);
    }

    protected static int getHexagonIndex(double vertexRadius, double x, double y, int hexagonsX, int hexagonsY)
    {
	double a = vertexRadius;
	double b = edgeLength(a) / 2.0;
	double c = Math.sqrt(a * a - b * b);

	int[] indicesX = new int[2];
	indicesX[0] = (int) ((x + c * hexagonsX) / (2 * c));
	indicesX[1] = (int) ((x + c * (hexagonsX - 1)) / (2 * c));

	int[] indicesY = new int[2];
	indicesY[0] = (int) ((y + ((2 * a * hexagonsY) - (b * (hexagonsY - 1))) * 0.5) / (a + b));
	indicesY[1] = (int) ((y + ((2 * a * hexagonsY) - (b * (hexagonsY - 1)) - a - b) * 0.5) / (a + b));

	double minDistance = Double.MAX_VALUE;
	Vector2 pos = Vector2.create(x, y);
	int six = 0;
	int siy = 0;
	for (int iy : indicesY)
	{
	    for (int ix : indicesX)
	    {
		Vector2 center = getHexagonCenter(vertexRadius, ix, iy, hexagonsX, hexagonsY);
		double distance = center.distanceTo(pos);
		if (distance < minDistance)
		{
		    six = ix;
		    siy = iy;
		    minDistance = distance;
		}
	    }
	}

	if (six < 0 || six >= hexagonsX || siy < 0 || siy >= hexagonsY || minDistance > vertexRadius)
	{
	    return -1;
	}

	return siy * hexagonsY + six;

    }

    protected static double edgeLength(double a)
    {
	return 2 * a * Math.sin(60 * DEGREE_2_RADIAN / 2.0);
    }

    protected static double edgeRadius(double a)
    {
	double b = edgeLength(a);
	return Math.sqrt(a * a - b * b / 2);
    }

}
