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
import net.blimster.gwt.threejs.core.Matrix4;
import net.blimster.gwt.threejs.core.Vector3;

/**
 * This file is generated, do not edit.
 */
public final class Matrix4 extends JavaScriptObject
{
	
	protected Matrix4()
	{
		super();
	}
	
	
	public static native Matrix4 create()
	/*-{
		
		return new $wnd.THREE.Matrix4();
		
	}-*/;
	
	
	
		
	
	public final native Matrix4 identity()
	/*-{
		
		return this.identity();
		
	}-*/;
	
	public final native Matrix4 set(double n11, double n12, double n13, double n14, double n21, double n22, double n23, double n24, double n31, double n32, double n33, double n34, double n41, double n42, double n43, double n44)
	/*-{
		
		return this.set(n11, n12, n13, n14, n21, n22, n23, n24, n31, n32, n33, n34, n41, n42, n43, n44);
		
	}-*/;
	
	public final native Matrix4 copy(Matrix4 m)
	/*-{
		
		return this.copy(m);
		
	}-*/;
	
	public final native Matrix4 lookAt(Vector3 eye, Vector3 center, Vector3 up)
	/*-{
		
		return this.lookAt(eye, center, up);
		
	}-*/;
	
	public final native Matrix4 multiply(Matrix4 a, Matrix4 b)
	/*-{
		
		return this.multiply(a, b);
		
	}-*/;
	
	public final native Matrix4 multiplySelf(Matrix4 m)
	/*-{
		
		return this.multiplySelf(m);
		
	}-*/;
	
	public final native Matrix4 multiplyScalar(double s)
	/*-{
		
		return this.multiplyScalar(s);
		
	}-*/;
	
	public final native Vector3 multiplyVector3(Vector3 vector)
	/*-{
		
		return this.multiplyVector3(vector);
		
	}-*/;
	
	public final native Vector3 rotateAxis(Vector3 v)
	/*-{
		
		return this.rotateAxis(v);
		
	}-*/;
	
	public final native Vector4 crossVector(Vector4 a)
	/*-{
		
		return this.crossVector(a);
		
	}-*/;
	
	public final native Matrix4 determinant()
	/*-{
		
		return this.determinant();
		
	}-*/;
	
	public final native Matrix4 transpose()
	/*-{
		
		return this.transpose();
		
	}-*/;
	
	public final native Matrix4 clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	public final native Matrix4 makeTranslation(double x, double y, double z)
	/*-{
		
		return this.makeTranslation(x, y, z);
		
	}-*/;
	
	public final native Matrix4 makeScale(double x, double y, double z)
	/*-{
		
		return this.makeScale(x, y, z);
		
	}-*/;
	
	public final native Matrix4 makeRotationX(double theta)
	/*-{
		
		return this.makeRotationX(theta);
		
	}-*/;
	
	public final native Matrix4 makeRotationY(double theta)
	/*-{
		
		return this.makeRotationY(theta);
		
	}-*/;
	
	public final native Matrix4 makeRotationZ(double theta)
	/*-{
		
		return this.makeRotationZ(theta);
		
	}-*/;
	
	public final native Matrix4 makeRotationAxis(Vector3 axis, double angle)
	/*-{
		
		return this.makeRotationAxis(axis, angle);
		
	}-*/;
	
	
}
