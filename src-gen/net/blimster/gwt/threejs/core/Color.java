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

/**
 * This file is generated, do not edit.
 */
public final class Color extends JavaScriptObject
{
	
	protected Color()
	{
		super();
	}
	
	
	
	
	
	public static native Color create(int hex)
	/*-{
		
		return new $wnd.THREE.Color(hex);
		
	}-*/;
	
	
	public final native void setR(double r)
	/*-{
		
		this.r = r;
		
	}-*/;
	
	public final native double getR()
	/*-{
		
		return this.r;
		
	}-*/;
	
	public final native void setG(double g)
	/*-{
		
		this.g = g;
		
	}-*/;
	
	public final native double getG()
	/*-{
		
		return this.g;
		
	}-*/;
	
	public final native void setB(double b)
	/*-{
		
		this.b = b;
		
	}-*/;
	
	public final native double getB()
	/*-{
		
		return this.b;
		
	}-*/;
	
	
	public final native Color copy(Color color)
	/*-{
		
		return this.copy(color);
		
	}-*/;
	
	public final native Color copyGammaToLinear(Color color)
	/*-{
		
		return this.copyGammaToLinear(color);
		
	}-*/;
	
	public final native Color copyLinearToGamma(Color color)
	/*-{
		
		return this.copyLinearToGamma(color);
		
	}-*/;
	
	public final native Color convertGammaToLinear()
	/*-{
		
		return this.convertGammaToLinear();
		
	}-*/;
	
	public final native Color convertLinearToGamma()
	/*-{
		
		return this.convertLinearToGamma();
		
	}-*/;
	
	public final native Color setRGB(double r, double g, double b)
	/*-{
		
		return this.setRGB(r, g, b);
		
	}-*/;
	
	public final native Color setHSV(double r, double g, double b)
	/*-{
		
		return this.setHSV(r, g, b);
		
	}-*/;
	
	public final native Color setHex(int hex)
	/*-{
		
		return this.setHex(hex);
		
	}-*/;
	
	public final native int getHex()
	/*-{
		
		return this.getHex();
		
	}-*/;
	
	public final native String getContextStyle()
	/*-{
		
		return this.getContextStyle();
		
	}-*/;
	
	public final native Color clone()
	/*-{
		
		return this.clone();
		
	}-*/;
	
	
}
