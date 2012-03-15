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
import net.blimster.gwt.threejs.core.Matrix4;
import net.blimster.gwt.threejs.core.Vector3;

/**
 * This file is generated, do not edit.
 */
public final class Vector3 extends JavaScriptObject
{
	
	protected Vector3()
	{
		super();
	}
	
	
	public static native Vector3 create()
	/*-{
		
		return new $wnd.THREE.Vector3();
		
	}-*/;
	
	
	
	public static native Vector3 create(double x, double y, double z)
	/*-{
		
		return new $wnd.THREE.Vector3(x, y, z);
		
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
	
	
	public final native Vector3 set(double x, double y, double z)
	/*-{
		
		return this.set(x, y, z);
		
	}-*/;
	
	public final native Vector3 copy(Vector3 v)
	/*-{
		
		return this.copy(v);
		
	}-*/;
	
	public final native Vector3 clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	public final native Vector3 add(Vector3 v1, Vector3 v2)
	/*-{
		
		return this.add(v1, v2);
		
	}-*/;
	
	public final native Vector3 addSelf(Vector3 v)
	/*-{
		
		return this.addSelf(v);
		
	}-*/;
	
	public final native Vector3 addScalar(double s)
	/*-{
		
		return this.addScalar(s);
		
	}-*/;
	
	public final native Vector3 sub(Vector3 v1, Vector3 v2)
	/*-{
		
		return this.sub(v1, v2);
		
	}-*/;
	
	public final native Vector3 subSelf(Vector3 v)
	/*-{
		
		return this.subSelf(v);
		
	}-*/;
	
	public final native Vector3 multiply(Vector3 v1, Vector3 v2)
	/*-{
		
		return this.multiply(v1, v2);
		
	}-*/;
	
	public final native Vector3 multiplySelf(Vector3 v)
	/*-{
		
		return this.multiplySelf(v);
		
	}-*/;
	
	public final native Vector3 multiplyScalar(double s)
	/*-{
		
		return this.multiplyScalar(s);
		
	}-*/;
	
	public final native Vector3 divideSelf(Vector3 v)
	/*-{
		
		return this.divideSelf(v);
		
	}-*/;
	
	public final native Vector3 divideScalar(double s)
	/*-{
		
		return this.divideScalar(s);
		
	}-*/;
	
	public final native Vector3 negate()
	/*-{
		
		return this.negate();
		
	}-*/;
	
	public final native double dot(Vector3 v)
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
	
	public final native double lengthManhattan()
	/*-{
		
		return this.lengthManhattan();
		
	}-*/;
	
	public final native Vector3 normalize()
	/*-{
		
		return this.normalize();
		
	}-*/;
	
	public final native Vector3 setLength(double l)
	/*-{
		
		return this.setLength(l);
		
	}-*/;
	
	public final native Vector3 lerpSelf(Vector3 v, double alpha)
	/*-{
		
		return this.lerpSelf(v, alpha);
		
	}-*/;
	
	public final native Vector3 cross(Vector3 v1, Vector3 v2)
	/*-{
		
		return this.cross(v1, v2);
		
	}-*/;
	
	public final native Vector3 crossSelf(Vector3 v)
	/*-{
		
		return this.crossSelf(v);
		
	}-*/;
	
	public final native double distanceTo(Vector3 vector)
	/*-{
		
		return this.distanceTo(vector);
		
	}-*/;
	
	public final native double distanceToSquared(Vector3 vector)
	/*-{
		
		return this.distanceToSquared(vector);
		
	}-*/;
	
	public final native Vector3 getPositionFromMatrix(Matrix4 m)
	/*-{
		
		return this.getPositionFromMatrix(m);
		
	}-*/;
	
	public final native Vector3 getRotationFromMatrix(Matrix4 m, double scale)
	/*-{
		
		return this.getRotationFromMatrix(m, scale);
		
	}-*/;
	
	public final native Vector3 getScaleFromMatrix(Matrix4 m)
	/*-{
		
		return this.getScaleFromMatrix(m);
		
	}-*/;
	
	public final native boolean equals(Vector3 v)
	/*-{
		
		return this.equals(v);
		
	}-*/;
	
	public final native boolean isZero()
	/*-{
		
		return this.isZero();
		
	}-*/;
	
	
}
