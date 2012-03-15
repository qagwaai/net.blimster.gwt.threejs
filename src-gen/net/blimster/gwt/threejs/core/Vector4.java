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
import net.blimster.gwt.threejs.core.Vector4;

/**
 * This file is generated, do not edit.
 */
public final class Vector4 extends JavaScriptObject
{
	
	protected Vector4()
	{
		super();
	}
	
	
	public static native Vector4 create()
	/*-{
		
		return new $wnd.THREE.Vector4();
		
	}-*/;
	
	
	
	public static native Vector4 create(double x, double y, double z, double w)
	/*-{
		
		return new $wnd.THREE.Vector4(x, y, z, w);
		
	}-*/;
	
	
	public final native void setX(double x)
	/*-{
		
		this.x = x;
		
	}-*/;
	
	public final native double getX()
	/*-{
		
		return this.x;
		
	}-*/;
	
	public final native void setY(double y)
	/*-{
		
		this.y = y;
		
	}-*/;
	
	public final native double getY()
	/*-{
		
		return this.y;
		
	}-*/;
	
	public final native void setZ(double z)
	/*-{
		
		this.z = z;
		
	}-*/;
	
	public final native double getZ()
	/*-{
		
		return this.z;
		
	}-*/;
	
	public final native void setW(double w)
	/*-{
		
		this.w = w;
		
	}-*/;
	
	public final native double getW()
	/*-{
		
		return this.w;
		
	}-*/;
	
	
	public final native Vector4 set(double x, double y, double z, double w)
	/*-{
		
		return this.set(x, y, z, w);
		
	}-*/;
	
	public final native Vector4 copy(Vector4 v)
	/*-{
		
		return this.copy(v);
		
	}-*/;
	
	public final native Vector4 clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	public final native Vector4 add(Vector4 v1, Vector4 v2)
	/*-{
		
		return this.add(v1, v2);
		
	}-*/;
	
	public final native Vector4 addSelf(Vector4 v)
	/*-{
		
		return this.addSelf(v);
		
	}-*/;
	
	public final native Vector4 sub(Vector4 v1, Vector4 v2)
	/*-{
		
		return this.sub(v1, v2);
		
	}-*/;
	
	public final native Vector4 subSelf(Vector4 v)
	/*-{
		
		return this.subSelf(v);
		
	}-*/;
	
	public final native Vector4 multiplyScalar(double s)
	/*-{
		
		return this.multiplyScalar(s);
		
	}-*/;
	
	public final native Vector4 divideScalar(double s)
	/*-{
		
		return this.divideScalar(s);
		
	}-*/;
	
	public final native Vector4 negate()
	/*-{
		
		return this.negate();
		
	}-*/;
	
	public final native double dot(Vector4 v)
	/*-{
		
		return this.dot(v);
		
	}-*/;
	
	public final native double lengthSq()
	/*-{
		
		return this.lengthSq();
		
	}-*/;
	
	public final native double length()
	/*-{
		
		return this.length();
		
	}-*/;
	
	public final native Vector4 normalize()
	/*-{
		
		return this.normalize();
		
	}-*/;
	
	public final native Vector4 setLength(double l)
	/*-{
		
		return this.setLength(l);
		
	}-*/;
	
	public final native Vector4 lerpSelf(Vector4 v, double alpha)
	/*-{
		
		return this.lerpSelf(v, alpha);
		
	}-*/;
	
	
}
