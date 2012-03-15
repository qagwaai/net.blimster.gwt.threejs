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
import net.blimster.gwt.threejs.core.Vector2;

/**
 * This file is generated, do not edit.
 */
public final class Vector2 extends JavaScriptObject
{
	
	protected Vector2()
	{
		super();
	}
	
	
	public static native Vector2 create()
	/*-{
		
		return new $wnd.THREE.Vector2();
		
	}-*/;
	
	
	
	public static native Vector2 create(double x, double y)
	/*-{
		
		return new $wnd.THREE.Vector2(x, y);
		
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
	
	
	public final native Vector2 set(double x, double y)
	/*-{
		
		return this.set(x, y);
		
	}-*/;
	
	public final native Vector2 copy(Vector2 vector)
	/*-{
		
		return this.copy(vector);
		
	}-*/;
	
	public final native Vector2 clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	public final native Vector2 add(Vector2 v1, Vector2 v2)
	/*-{
		
		return this.add(v1, v2);
		
	}-*/;
	
	public final native Vector2 addSelf(Vector2 v)
	/*-{
		
		return this.addSelf(v);
		
	}-*/;
	
	public final native Vector2 sub(Vector2 v1, Vector2 v2)
	/*-{
		
		return this.sub(v1, v2);
		
	}-*/;
	
	public final native Vector2 subSelf(Vector2 v)
	/*-{
		
		return this.subSelf(v);
		
	}-*/;
	
	public final native Vector2 multiplyScalar(double s)
	/*-{
		
		return this.multiplyScalar(s);
		
	}-*/;
	
	public final native Vector2 divideScalar(double s)
	/*-{
		
		return this.divideScalar(s);
		
	}-*/;
	
	public final native Vector2 negate()
	/*-{
		
		return this.negate();
		
	}-*/;
	
	public final native double dot(Vector2 v)
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
	
	public final native Vector2 normalize()
	/*-{
		
		return this.normalize();
		
	}-*/;
	
	public final native double distanceTo(Vector2 v)
	/*-{
		
		return this.distanceTo(v);
		
	}-*/;
	
	public final native double distanceToSquared(Vector2 v)
	/*-{
		
		return this.distanceToSquared(v);
		
	}-*/;
	
	public final native Vector2 setLength(double l)
	/*-{
		
		return this.setLength(l);
		
	}-*/;
	
	public final native Vector2 lerpSelf(Vector2 v, double alpha)
	/*-{
		
		return this.lerpSelf(v, alpha);
		
	}-*/;
	
	public final native boolean equals(Vector2 v)
	/*-{
		
		return this.equals(v);
		
	}-*/;
	
	public final native boolean isZero()
	/*-{
		
		return this.isZero();
		
	}-*/;
	
	
}
