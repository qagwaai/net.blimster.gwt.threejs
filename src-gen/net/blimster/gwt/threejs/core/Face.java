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
import net.blimster.gwt.threejs.core.Color;
import com.google.gwt.core.client.JsArrayInteger;
import net.blimster.gwt.threejs.core.Vector3;
import com.google.gwt.core.client.JsArray;

/**
 * This file is generated, do not edit.
 */
public abstract class Face extends JavaScriptObject
{
	
	protected Face()
	{
		super();
	}
	
		
	public final native void setA(int a)
	/*-{
		
		this.a = a;
		
	}-*/;
	
	public final native int getA()
	/*-{
		
		return this.a;
		
	}-*/;
	
	public final native void setB(int b)
	/*-{
		
		this.b = b;
		
	}-*/;
	
	public final native int getB()
	/*-{
		
		return this.b;
		
	}-*/;
	
	public final native void setC(int c)
	/*-{
		
		this.c = c;
		
	}-*/;
	
	public final native int getC()
	/*-{
		
		return this.c;
		
	}-*/;
	
	public final native void setNormal(Vector3 normal)
	/*-{
		
		this.normal = normal;
		
	}-*/;
	
	public final native Vector3 getNormal()
	/*-{
		
		return this.normal;
		
	}-*/;
	
	public final native void setVertexNormals(JsArray<Vector3> vertexNormals)
	/*-{
		
		this.vertexNormals = vertexNormals;
		
	}-*/;
	
	public final native JsArray<Vector3> getVertexNormals()
	/*-{
		
		return this.vertexNormals;
		
	}-*/;
	
	public final native void setColor(Color color)
	/*-{
		
		this.color = color;
		
	}-*/;
	
	public final native Color getColor()
	/*-{
		
		return this.color;
		
	}-*/;
	
	public final native void setVertexColors(JsArray<Color> vertexColors)
	/*-{
		
		this.vertexColors = vertexColors;
		
	}-*/;
	
	public final native JsArray<Color> getVertexColors()
	/*-{
		
		return this.vertexColors;
		
	}-*/;
	
	public final native void setVertexTangents(JsArray<Vector3> vertexTangents)
	/*-{
		
		this.vertexTangents = vertexTangents;
		
	}-*/;
	
	public final native JsArray<Vector3> getVertexTangents()
	/*-{
		
		return this.vertexTangents;
		
	}-*/;
	
	public final native void setMaterialIndex(int materialIndex)
	/*-{
		
		this.materialIndex = materialIndex;
		
	}-*/;
	
	public final native int getMaterialIndex()
	/*-{
		
		return this.materialIndex;
		
	}-*/;
	
	public final native void setCentroid(Vector3 centroid)
	/*-{
		
		this.centroid = centroid;
		
	}-*/;
	
	public final native Vector3 getCentroid()
	/*-{
		
		return this.centroid;
		
	}-*/;
	
	
	
}
