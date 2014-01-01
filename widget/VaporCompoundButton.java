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

package vapor.widget;

import android.os.Parcelable;
import android.widget.Checkable;
import android.widget.CompoundButton;

/**
 * Fluent Vapor companion to CompoundButton, a button with two states, checked
 * and unchecked. When the button is pressed or clicked, the state changes
 * automatically.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from CompoundButton
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public abstract class VaporCompoundButton<T extends CompoundButton, self extends VaporCompoundButton<T, self>>
		extends VaporButton<T, self> implements Checkable {

	public VaporCompoundButton(int id) {
		super(id);
	}

	public VaporCompoundButton(T compoundButton) {
		super(compoundButton);
	}

	/**
	 * Changes the checked state of this button.
	 * 
	 * @param checked
	 *            true to check the button, false to uncheck it
	 * @return self
	 */
	public self checked(boolean checked) {
		view.setChecked(checked);
		return (self) this;
	}

	/**
	 * Register a callback to be invoked when the checked state of this button
	 * changes.
	 * 
	 * @param checkedChangeListener
	 *            the callback to call on checked state change
	 * @return self
	 */
	public self checked(
			vapor.listeners.widget.compoundbutton.$checked checkedChangeListener) {
		view.setOnCheckedChangeListener(checkedChangeListener);
		return (self) this;
	}

	/**
	 * 
	 * @return
	 */
	public boolean checked() {
		return view.isChecked();
	}

	/**
	 * Fluent equivalent Vapor method for invoking
	 * onRestoreInstanceState(Parcelable), a hook allowing a view to re-apply a
	 * representation of its internal state that had previously been generated by
	 * save(). This function will never be called with a null state.
	 * 
	 * @param state
	 *            The frozen state that had previously been returned by save().
	 * @return self
	 */
	public self restore(Parcelable state) {
		view.onRestoreInstanceState(state);
		return (self) this;
	}

	/**
	 * Fluent equivalent Vapor method for invoking onSaveInstanceState(), a hook
	 * allowing a view to generate a representation of its internal state that
	 * can later be used to create a new instance with that same state.
	 * 
	 * @return Returns a Parcelable object containing the view's current dynamic
	 *         state, or null if there is nothing interesting to save. The
	 *         default implementation returns null.
	 */
	public Parcelable save() {
		return view.onSaveInstanceState();
	}

	/**
	 * Change the checked state of the view to the inverse of its current state
	 * 
	 * @return self
	 */
	public self tog() {
		view.toggle();
		return (self) this;
	}

	/* INTERFACE : Checkable */
	/**
	 * NOTE: This method serves to satisfy the Checkable interface, use the
	 * equivalent VAPOR FLUENT method checked() instead
	 */
	public boolean isChecked() {
		return checked();
	}

	/**
	 * NOTE: This method serves to satisfy the Checkable interface, use the
	 * equivalent VAPOR FLUENT method checked(boolean) instead
	 */
	public void setChecked(boolean checked) {
		checked(checked);
	}

	/**
	 * NOTE: This method serves to satisfy the Checkable interface, use the
	 * equivalent VAPOR FLUENT method tog() instead
	 */
	public void toggle() {
		tog();
	}

}
