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
import com.google.gwt.core.client.JsArrayInteger;
import net.blimster.gwt.threejs.core.Face;
import net.blimster.gwt.threejs.core.Vector3;
import com.google.gwt.core.client.JsArray;import net.blimster.gwt.threejs.core.UV;
import net.blimster.gwt.threejs.materials.Material;

/**
 * This file is generated, do not edit.
 */
public abstract class Geometry extends JavaScriptObject
{
	
	protected Geometry()
	{
		super();
	}
	
	
	public static native Geometry create()
	/*-{
		
		return new $wnd.THREE.Geometry();
		
	}-*/;
	
	
	
		
	public final native void setVertices(JsArray<Vector3> vertices)
	/*-{
		
		this.vertices = vertices;
		
	}-*/;
	
	public final native JsArray<Vector3> getVertices()
	/*-{
		
		return this.vertices;
		
	}-*/;
	
	public final native void setMaterials(JsArray<Material> materials)
	/*-{
		
		this.materials = materials;
		
	}-*/;
	
	public final native JsArray<Material> getMaterials()
	/*-{
		
		return this.materials;
		
	}-*/;
	
	public final native void setFaces(JsArray<Face> faces)
	/*-{
		
		this.faces = faces;
		
	}-*/;
	
	public final native JsArray<Face> getFaces()
	/*-{
		
		return this.faces;
		
	}-*/;
	
	public final native void setFaceVertexUvs(JsArray<JsArray<JsArray<UV>>> faceVertexUvs)
	/*-{
		
		this.faceVertexUvs = faceVertexUvs;
		
	}-*/;
	
	public final native JsArray<JsArray<JsArray<UV>>> getFaceVertexUvs()
	/*-{
		
		return this.faceVertexUvs;
		
	}-*/;
	
	
	public final native void computeCentroids()
	/*-{
		
		this.computeCentroids();
		
	}-*/;
	
	public final native void computeFaceNormals()
	/*-{
		
		this.computeFaceNormals();
		
	}-*/;
	
	public final native void computeVertexNormals()
	/*-{
		
		this.computeVertexNormals();
		
	}-*/;
	
	
}
