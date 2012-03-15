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
package net.blimster.gwt.threejs.core;

import net.blimster.gwt.threejs.core.Face;
import net.blimster.gwt.threejs.core.Face4;

/**
 * This file is generated, do not edit.
 */
public final class Face4 extends Face
{
	
	protected Face4()
	{
		super();
	}
	
	
	
	
	
	public static native Face4 create(int a, int b, int c, int d)
	/*-{
		
		return new $wnd.THREE.Face4(a, b, c, d);
		
	}-*/;
	
	
	public final native void setD(int d)
	/*-{
		
		this.d = d;
		
	}-*/;
	
	public final native int getD()
	/*-{
		
		return this.d;
		
	}-*/;
	
	
	public final native Face4 clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	
}
