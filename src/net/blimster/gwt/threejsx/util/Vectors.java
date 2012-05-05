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
package net.blimster.gwt.threejsx.util;

import net.blimster.gwt.threejs.core.Vector2;

/**
 * @author Oliver Damm
 */
public final class Vectors
{

    private Vectors()
    {
	super();
    }

    public static double angle(Vector2 v1, Vector2 v2)
    {
	double dot = v1.dot(v2);

	double a = Math.sqrt(v1.getX() * v1.getX() + v2.getY() * v2.getY());
	double b = Math.sqrt(v1.getX() * v1.getX() + v2.getY() * v2.getY());

	return Math.acos(dot / (a * b));
    }
}
