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

package vapor.animation;

import vapor.os.VaporBundle;
import vapor.view.VaporView;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;

public class Shake<self extends Shake<self>> extends Anim<self> {

	public static final String AXIS = "axis"; // VERTICAL = "vertical",
												// HORIZONTAL = "horizontal";
	public static final char X = 'X', Y = 'Y';
	protected static final char __AXIS = X;

	public Shake(VaporView<? extends View, ?> view, VaporBundle options) {
		super(view, options);
	}

	public Shake(VaporView<? extends View, ?> view) {
		super(view);
	}

	public char axis() {
		return prop(AXIS, __AXIS);
	}

	public self axis(char axis) {
		String _axis = (axis + "");

		if (axisCheck(axis))
			options.put(AXIS, _axis.toUpperCase().charAt(0));
		return (self) this;
	}

	private boolean axisCheck(char axis) {
		String _axis = (axis + "");
		return (_axis.equalsIgnoreCase(X + "") || _axis
				.equalsIgnoreCase(Y + ""));
	}

	@Override
	public void run() {
		char axis = prop(AXIS, __AXIS);
		if (!axisCheck(axis)) {
			Log.w(logTag(), axis
					+ " is not a valid Axis value for Shake. Resetting to "
					+ __AXIS);
			axis(__AXIS);
			axis = __AXIS;
		}

		View v = view.view();
		float trans = (prop(AXIS, __AXIS) == Y) ? v.getTranslationY() : v
				.getTranslationX();

		String prop = "translation" + axis;

		AnimatorSet as = new AnimatorSet();
		as.playSequentially(ObjectAnimator.ofFloat(v, prop, trans, trans + 5F),
				ObjectAnimator.ofFloat(v, prop, trans - 10F),
				ObjectAnimator.ofFloat(v, prop, trans + 10F),
				ObjectAnimator.ofFloat(v, prop, trans - 10F),
				ObjectAnimator.ofFloat(v, prop, trans, trans + 5F));

		run(as);

	}
}
