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
import net.blimster.gwt.threejs.core.UV;

/**
 * This file is generated, do not edit.
 */
public final class UV extends JavaScriptObject
{
	
	protected UV()
	{
		super();
	}
	
	
	public static native UV create()
	/*-{
		
		return new $wnd.THREE.UV();
		
	}-*/;
	
	
	
	public static native UV create(double u, double v)
	/*-{
		
		return new $wnd.THREE.UV(u, v);
		
	}-*/;
	
	
	public final native void setU(double u)
	/*-{
		
		this.u = u;
		
	}-*/;
	
	public final native double getU()
	/*-{
		
		return this.u;
		
	}-*/;
	
	public final native void setV(double v)
	/*-{
		
		this.v = v;
		
	}-*/;
	
	public final native double getV()
	/*-{
		
		return this.v;
		
	}-*/;
	
	
	public final native UV set(double u, double v)
	/*-{
		
		return this.set(u, v);
		
	}-*/;
	
	public final native UV copy(UV uv)
	/*-{
		
		return this.copy(uv);
		
	}-*/;
	
	public final native UV lerpSelf(UV uv, double alpha)
	/*-{
		
		return this.lerpSelf(uv, alpha);
		
	}-*/;
	
	public final native UV clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	
}
