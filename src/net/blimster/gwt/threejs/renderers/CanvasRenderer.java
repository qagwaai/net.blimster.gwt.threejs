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

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.CanvasElement;

/**
 * @author Oliver Damm
 */
public final class CanvasRenderer extends AbstractCanvasRenderer
{

    protected CanvasRenderer()
    {
	super();
    }

    public static CanvasRenderer create(Canvas canvas)
    {

	return CanvasRenderer.create(canvas.getCanvasElement());

    }

    private native static CanvasRenderer create(CanvasElement canvasElement)
    /*-{

		return new $wnd.THREE.CanvasRenderer( {
			canvas : canvasElement
		});

    }-*/;

}
