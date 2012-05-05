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

import com.google.gwt.core.client.JavaScriptObject;
import net.blimster.gwt.threejs.core.Vector3;

/**
 * This file is generated, do not edit.
 */
public final class Vertex extends JavaScriptObject
{
	
	protected Vertex()
	{
		super();
	}
	
	
	public static native Vertex create()
	/*-{
		
		return new $wnd.THREE.Vertex();
		
	}-*/;
	
	
	
	public static native Vertex create(Vector3 position)
	/*-{
		
		return new $wnd.THREE.Vertex(position);
		
	}-*/;
	
	
	public final native void setPosition(Vector3 position)
	/*-{
		
		this.position = position;
		
	}-*/;
	
	public final native Vector3 getPosition()
	/*-{
		
		return this.position;
		
	}-*/;
	
	
	
}
