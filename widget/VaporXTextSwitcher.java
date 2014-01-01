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

/*This file has been autogenerated by the Vapid Tool v1.0 @ 22/12/2012 22:43:14*/
package vapor.widget;

import android.widget.TextSwitcher;

/**
 * Fluent variadic Vapor companion to TextSwitcher, a specialized ViewSwitcher
 * that contains only children of type TextView. A TextSwitcher is useful to
 * animate a label on screen. Whenever text(CharSequence) is called,
 * TextSwitcher animates the current text out and animates the new text in.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from TextSwitcher
 * @param <X>
 *            A Vapor type derived from VaporTextSwitcher
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporXTextSwitcher<T extends TextSwitcher, X extends VaporTextSwitcher<T, ?>, self extends VaporXTextSwitcher<T, X, self>>
		extends VaporXViewSwitcher<T, X, self> {

	public VaporXTextSwitcher(Integer... ids) {
		super(ids);
	}

	public VaporXTextSwitcher(T... textSwitchers) {
		super(textSwitchers);
	}

	public VaporXTextSwitcher(X... vaporTextSwitchers) {
		super(vaporTextSwitchers);
	}

	public VaporXTextSwitcher(
			VaporXTextSwitcher<T, X, ?>... vaporXTextSwitchers) {
		super(vaporXTextSwitchers);
	}

	public VaporXTextSwitcher(Object... textSwitcherItems) {
		super(textSwitcherItems);
	}

	/**
	 * Sets the text of the next view and switches to the next view. This can be
	 * used to animate the old text out and animate the next text in.
	 * 
	 * @param nextViewText
	 *            the new text to display
	 * @return this
	 */
	public self nextText(CharSequence nextViewText) {
		for (X vaporView : members)
			vaporView.nextText(nextViewText);
		return (self) this;

	}

	/**
	 * Sets the text of the text view that is currently showing. This does not
	 * perform the animations.
	 * 
	 * @param currentViewText
	 *            the new text to display
	 * @return this
	 */
	public self text(CharSequence currentViewText) {
		for (X vaporView : members)
			vaporView.text(currentViewText);
		return (self) this;

	}

}