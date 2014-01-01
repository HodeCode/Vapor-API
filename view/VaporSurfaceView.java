/*	Vapor API Terms and Conditions
 *
 *  - You MAY NOT
 *  	- attempt to claim ownership of, or pass off the Vapor source code and materials as your own work unless:
 *
 *  		- used as constituent component in an Android application that you intend to release and/or profit from
 *
 *		- use or redistribute the Vapor source code and materials without explicit attribution to the owning parties
 *
 *  	- advertise Vapor in a misleading, inappropriate or offensive fashion
 *
 * - Indemnity
 * 		You agree to indemnify and hold harmless the authors of the Software and any contributors for any direct, indirect, 
 * 		incidental, or consequential third-party claims, actions or suits, as well as any related expenses, liabilities, damages, 
 * 		settlements or fees arising from your use or misuse of the Software, or a violation of any terms of this license.
 *  
 *  - DISCLAIMER OF WARRANTY
 *  	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, 
 *		WARRANTIES OF QUALITY, PERFORMANCE, NON-INFRINGEMENT, MERCHANTABILITY, OR FITNESS FOR A PARTICULAR PURPOSE.
 *  
 *  - LIMITATIONS OF LIABILITY
 *  	YOU ASSUME ALL RISK ASSOCIATED WITH THE INSTALLATION AND USE OF THE SOFTWARE. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * 		HOLDERS OF THE SOFTWARE BE LIABLE FOR CLAIMS, DAMAGES OR OTHER LIABILITY ARISING FROM, OUT OF, OR IN CONNECTION WITH THE 
 *		SOFTWARE. LICENSE HOLDERS ARE SOLELY RESPONSIBLE FOR DETERMINING THE APPROPRIATENESS OF USE AND ASSUME ALL RISKS ASSOCIATED 
 *		WITH ITS USE, INCLUDING BUT NOT LIMITED TO THE RISKS OF PROGRAM ERRORS, DAMAGE TO EQUIPMENT, LOSS OF DATA OR SOFTWARE PROGRAMS, 
 *		OR UNAVAILABILITY OR INTERRUPTION OF OPERATIONS.
 *  
 *  © Darius Hodaei. License Version 1.1. Last Updated 30/06/2013.
*/

package vapor.view;

import android.graphics.Region;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

// Checked: 061220122132

/**
 * Fluent Vapor companion to SurfaceView, a view that provides a dedicated
 * drawing surface embedded inside of a view hierarchy. You can control the
 * format of this surface and, if you like, its size; the SurfaceView takes care
 * of placing the surface at the correct location on the screen
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from SurfaceView
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporSurfaceView<T extends SurfaceView, self extends VaporSurfaceView<T, self>>
		extends VaporView<T, self> {

	public VaporSurfaceView(int id) {
		super(id);
	}

	public VaporSurfaceView(T surfaceView) {
		super(surfaceView);
	}

	/**
	 * Return the SurfaceHolder providing access and control over this
	 * SurfaceView's underlying surface.
	 * 
	 * @return The holder of the surface.
	 */
	public SurfaceHolder holder() {
		return view.getHolder();
	}

	/**
	 * Control whether the surface view's surface is placed on top of its
	 * window. Normally it is placed behind the window, to allow it to (for the
	 * most part) appear to composite with the views in the hierarchy. By setting
	 * this, you cause it to be placed above the window. This means that none of
	 * the contents of the window this SurfaceView is in will be visible on top
	 * of its surface.
	 * 
	 * Note that this must be set before the surface view's containing window is
	 * attached to the window manager.
	 * 
	 * @param onTopOfWindow
	 * @return self
	 */
	public self onTop(boolean onTopOfWindow) {
		view.setZOrderOnTop(onTopOfWindow);
		return (self) this;
	}

	/**
	 * Control whether the surface view's surface is placed on top of another
	 * regular surface view in the window (but still behind the window itself).
	 * This is typically used to place overlays on top of an underlying media
	 * surface view.
	 * 
	 * Note that this must be set before the surface view's containing window is
	 * attached to the window manager.
	 * 
	 * @param isMediaOverlay
	 * @return self
	 */
	public self overlays(boolean isMediaOverlay) {
		view.setZOrderMediaOverlay(isMediaOverlay);
		return (self) this;
	}

	/**
	 * This is used by the RootView to perform an optimization when the view
	 * hierarchy contains one or several SurfaceView. SurfaceView is always
	 * considered transparent, but its children are not, therefore all View
	 * objects remove themselves from the global transparent region (passed as a
	 * parameter to this function).
	 * 
	 * @param region
	 *            The transparent region for this ViewAncestor (window).
	 * @return Returns true if the effective visibility of the view at this
	 *         point is opaque, regardless of the transparent region; returns
	 *         false if it is possible for underlying windows to be seen behind
	 *         the view.
	 */
	public boolean transparentRegion(Region region) {
		return view.gatherTransparentRegion(region);
	}

}
