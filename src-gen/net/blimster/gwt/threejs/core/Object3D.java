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
import net.blimster.gwt.threejs.core.Quaternion;
import net.blimster.gwt.threejs.core.Matrix4;
import net.blimster.gwt.threejs.core.Object3D;
import net.blimster.gwt.threejs.core.Vector3;

/**
 * This file is generated, do not edit.
 */
public abstract class Object3D extends JavaScriptObject
{
	
	protected Object3D()
	{
		super();
	}
	
	
	public static native Object3D create()
	/*-{
		
		return new $wnd.THREE.Object3D();
		
	}-*/;
	
	
	
		
	public final native void setName(String name)
	/*-{
		
		this.name = name;
		
	}-*/;
	
	public final native String getName()
	/*-{
		
		return this.name;
		
	}-*/;
	
	public final native void setId(int id)
	/*-{
		
		this.id = id;
		
	}-*/;
	
	public final native int getId()
	/*-{
		
		return this.id;
		
	}-*/;
	
	public final native void setUp(Vector3 up)
	/*-{
		
		this.up = up;
		
	}-*/;
	
	public final native Vector3 getUp()
	/*-{
		
		return this.up;
		
	}-*/;
	
	public final native void setPosition(Vector3 position)
	/*-{
		
		this.position = position;
		
	}-*/;
	
	public final native Vector3 getPosition()
	/*-{
		
		return this.position;
		
	}-*/;
	
	public final native void setRotation(Vector3 rotation)
	/*-{
		
		this.rotation = rotation;
		
	}-*/;
	
	public final native Vector3 getRotation()
	/*-{
		
		return this.rotation;
		
	}-*/;
	
	public final native void setScale(Vector3 scale)
	/*-{
		
		this.scale = scale;
		
	}-*/;
	
	public final native Vector3 getScale()
	/*-{
		
		return this.scale;
		
	}-*/;
	
	public final native void setEulerOrder(String eulerOrder)
	/*-{
		
		this.eulerOrder = eulerOrder;
		
	}-*/;
	
	public final native String getEulerOrder()
	/*-{
		
		return this.eulerOrder;
		
	}-*/;
	
	public final native void setDynamic(boolean dynamic)
	/*-{
		
		this.dynamic = dynamic;
		
	}-*/;
	
	public final native boolean getDynamic()
	/*-{
		
		return this.dynamic;
		
	}-*/;
	
	public final native void setDoubleSided(boolean doubleSided)
	/*-{
		
		this.doubleSided = doubleSided;
		
	}-*/;
	
	public final native boolean getDoubleSided()
	/*-{
		
		return this.doubleSided;
		
	}-*/;
	
	public final native void setFlipSided(boolean flipSided)
	/*-{
		
		this.flipSided = flipSided;
		
	}-*/;
	
	public final native boolean getFlipSided()
	/*-{
		
		return this.flipSided;
		
	}-*/;
	
	public final native void setRenderDepth(int renderDepth)
	/*-{
		
		this.renderDepth = renderDepth;
		
	}-*/;
	
	public final native int getRenderDepth()
	/*-{
		
		return this.renderDepth;
		
	}-*/;
	
	public final native void setMatrix(Matrix4 matrix)
	/*-{
		
		this.matrix = matrix;
		
	}-*/;
	
	public final native Matrix4 getMatrix()
	/*-{
		
		return this.matrix;
		
	}-*/;
	
	public final native void setMatrixWorld(Matrix4 matrixWorld)
	/*-{
		
		this.matrixWorld = matrixWorld;
		
	}-*/;
	
	public final native Matrix4 getMatrixWorld()
	/*-{
		
		return this.matrixWorld;
		
	}-*/;
	
	public final native void setMatrixRotationWorld(Matrix4 matrixRotationWorld)
	/*-{
		
		this.matrixRotationWorld = matrixRotationWorld;
		
	}-*/;
	
	public final native Matrix4 getMatrixRotationWorld()
	/*-{
		
		return this.matrixRotationWorld;
		
	}-*/;
	
	public final native void setMatrixAutoUpdate(boolean matrixAutoUpdate)
	/*-{
		
		this.matrixAutoUpdate = matrixAutoUpdate;
		
	}-*/;
	
	public final native boolean getMatrixAutoUpdate()
	/*-{
		
		return this.matrixAutoUpdate;
		
	}-*/;
	
	public final native void setMatrixWorldNeedsUpdate(boolean matrixWorldNeedsUpdate)
	/*-{
		
		this.matrixWorldNeedsUpdate = matrixWorldNeedsUpdate;
		
	}-*/;
	
	public final native boolean getMatrixWorldNeedsUpdate()
	/*-{
		
		return this.matrixWorldNeedsUpdate;
		
	}-*/;
	
	public final native void setQuaternion(Quaternion quaternion)
	/*-{
		
		this.quaternion = quaternion;
		
	}-*/;
	
	public final native Quaternion getQuaternion()
	/*-{
		
		return this.quaternion;
		
	}-*/;
	
	public final native void setUseQuaternion(boolean useQuaternion)
	/*-{
		
		this.useQuaternion = useQuaternion;
		
	}-*/;
	
	public final native boolean getUseQuaternion()
	/*-{
		
		return this.useQuaternion;
		
	}-*/;
	
	public final native void setBoundRadius(double boundRadius)
	/*-{
		
		this.boundRadius = boundRadius;
		
	}-*/;
	
	public final native double getBoundRadius()
	/*-{
		
		return this.boundRadius;
		
	}-*/;
	
	public final native void setBoundRadiusScale(double boundRadiusScale)
	/*-{
		
		this.boundRadiusScale = boundRadiusScale;
		
	}-*/;
	
	public final native double getBoundRadiusScale()
	/*-{
		
		return this.boundRadiusScale;
		
	}-*/;
	
	public final native void setVisible(boolean visible)
	/*-{
		
		this.visible = visible;
		
	}-*/;
	
	public final native boolean getVisible()
	/*-{
		
		return this.visible;
		
	}-*/;
	
	public final native void setCastShadow(boolean castShadow)
	/*-{
		
		this.castShadow = castShadow;
		
	}-*/;
	
	public final native boolean getCastShadow()
	/*-{
		
		return this.castShadow;
		
	}-*/;
	
	public final native void setReceiveShadow(boolean receiveShadow)
	/*-{
		
		this.receiveShadow = receiveShadow;
		
	}-*/;
	
	public final native boolean getReceiveShadow()
	/*-{
		
		return this.receiveShadow;
		
	}-*/;
	
	public final native void setFrustumCulled(boolean frustumCulled)
	/*-{
		
		this.frustumCulled = frustumCulled;
		
	}-*/;
	
	public final native boolean getFrustumCulled()
	/*-{
		
		return this.frustumCulled;
		
	}-*/;
	
	
	public final native void translate(double distance, Vector3 axis)
	/*-{
		
		this.translate(distance, axis);
		
	}-*/;
	
	public final native void translateX(double distance)
	/*-{
		
		this.translateX(distance);
		
	}-*/;
	
	public final native void translateY(double distance)
	/*-{
		
		this.translateY(distance);
		
	}-*/;
	
	public final native void translateZ(double distance)
	/*-{
		
		this.translateZ(distance);
		
	}-*/;
	
	public final native void lookAt(Vector3 vector)
	/*-{
		
		this.lookAt(vector);
		
	}-*/;
	
	public final native void add(Object3D object)
	/*-{
		
		this.add(object);
		
	}-*/;
	
	public final native void remove(Object3D object)
	/*-{
		
		this.remove(object);
		
	}-*/;
	
	public final native Object3D getChildByName(String name, boolean doRecurse)
	/*-{
		
		return this.getChildByName(name, doRecurse);
		
	}-*/;
	
	public final native void updateMatrix()
	/*-{
		
		this.updateMatrix();
		
	}-*/;
	
	public final native void updateMatrixWorld(boolean force)
	/*-{
		
		this.updateMatrixWorld(force);
		
	}-*/;
	
	
}
