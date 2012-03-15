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
package net.blimster.gwt.threejs.renderers;

import com.google.gwt.core.client.JavaScriptObject;
import net.blimster.gwt.threejs.core.Color;
import net.blimster.gwt.threejs.scenes.Scene;
import net.blimster.gwt.threejs.cameras.Camera;

/**
 * This file is generated, do not edit.
 */
public abstract class Renderer extends JavaScriptObject
{
	
	protected Renderer()
	{
		super();
	}
	
		
	
	public final native void setSize(int width, int height)
	/*-{
		
		this.setSize(width, height);
		
	}-*/;
	
	public final native void setClearColor(Color color, double opacity)
	/*-{
		
		this.setClearColor(color, opacity);
		
	}-*/;
	
	public final native void render(Scene scene, Camera camera)
	/*-{
		
		this.render(scene, camera);
		
	}-*/;
	
	
}
