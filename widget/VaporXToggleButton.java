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

import java.util.ArrayList;

import android.widget.ToggleButton;

/**
 * Fluent variadic Vapor companion to ToggleButton, that displays
 * checked/unchecked states as a button with a "light" indicator and by default
 * accompanied with the text "ON" or "OFF".
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from ToggleButton
 * @param <X>
 *            A Vapor type derived from VaporToggleButton
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporXToggleButton<T extends ToggleButton, X extends VaporToggleButton<T, ?>, self extends VaporXToggleButton<T, X, self>>
		extends VaporXCompoundButton<T, X, self> {

	public VaporXToggleButton(Integer... ids) {
		super(ids);
	}

	public VaporXToggleButton(T... toggleButtons) {
		super(toggleButtons);
	}

	public VaporXToggleButton(X... vaporToggleButtons) {
		super(vaporToggleButtons);
	}

	public VaporXToggleButton(
			VaporXToggleButton<T, X, ?>... vaporXToggleButtons) {
		super(vaporXToggleButtons);
	}

	public VaporXToggleButton(Object... toggleButtonItems) {
		super(toggleButtonItems);
	}

	/**
	 * Returns the text for when the button is in the checked state.
	 * 
	 * @return the checked text
	 */
	public ArrayList<CharSequence> checkedText() {
		int _size = this.members.size();
		ArrayList<CharSequence> _returns = new ArrayList<CharSequence>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).checkedText());
		return _returns;
	}

	/**
	 * Sets the text for when the button is in the checked state.
	 * 
	 * @param textOn
	 *            the checked text
	 * @return this
	 */
	public self checkedText(CharSequence textOn) {
		for (X vaporView : members)
			vaporView.checkedText(textOn);
		return (self) this;

	}

	/**
	 * Returns the text for when the button is not in the checked state.
	 * 
	 * @return the unchecked text
	 */
	public ArrayList<CharSequence> uncheckedText() {
		int _size = this.members.size();
		ArrayList<CharSequence> _returns = new ArrayList<CharSequence>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).uncheckedText());
		return _returns;
	}

	/**
	 * Sets the text for when the button is not in the checked state.
	 * 
	 * @param textOff
	 *            The unchecked text
	 * @return this
	 */
	public self uncheckedText(CharSequence textOff) {
		for (X vaporView : members)
			vaporView.uncheckedText(textOff);
		return (self) this;

	}

}