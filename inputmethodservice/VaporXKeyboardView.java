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

/*This file has been autogenerated by the Vapid Tool v1.0 @ 22/12/2012 22:43:04*/
package vapor.inputmethodservice;

import java.util.ArrayList;

import vapor.view.VaporView;
import vapor.view.VaporXView;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;

// Checked: 051220121346

/**
 * Fluent variadic Vapor companion to KeyboardView, a view that renders a
 * virtual Keyboard. It handles rendering of keys and detecting key presses and
 * touch movements.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from KeyboardView
 * @param <X>
 *            A Vapor type derived from VaporKeyboardView
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporXKeyboardView<T extends KeyboardView, X extends VaporKeyboardView<T, ?>, self extends VaporXKeyboardView<T, X, self>>
		extends VaporXView<T, X, self> {

	public VaporXKeyboardView(Integer... ids) {
		super(ids);
	}

	public VaporXKeyboardView(T... keyboardViews) {
		super(keyboardViews);
	}

	public VaporXKeyboardView(X... vaporKeyboardViews) {
		super(vaporKeyboardViews);
	}

	public VaporXKeyboardView(
			VaporXKeyboardView<T, X, ?>... vaporXKeyboardViews) {
		super(vaporXKeyboardViews);
	}

	public VaporXKeyboardView(Object... keyboardViewItems) {
		super(keyboardViewItems);
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Boolean> back() {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).back());
		return _returns;
	}

	/**
	 * Fluent equivalent Vapor method for invoking onClick(View)
	 * 
	 * @param view
	 * @return self
	 */
	public self click(VaporView<? extends View, ?> view) {
		for (X vaporView : members)
			vaporView.click(view);
		return (self) this;

	}

	/**
	 * 
	 * @return self
	 */
	public self closing() {
		for (X vaporView : members)
			vaporView.closing();
		return (self) this;

	}

	/**
	 * Fluent equivalent Vapor method for invoking onDetachedFromWindow(),
	 * called when the view is detached from a window. At this point it no
	 * longer has a surface for drawing.
	 * 
	 * @return self
	 */
	public self detached() {
		for (X vaporView : members)
			vaporView.detached();
		return (self) this;

	}

	/**
	 * Invalidates a key so that it will be redrawn on the next repaint. Use
	 * this method if only one key is changing it's content. Any changes that
	 * affect the position or size of the key may not be honored.
	 * 
	 * @param keyIndex
	 *            the index of the key in the attached Keyboard.
	 * @return self
	 */
	public self invalidate(int keyIndex) {
		for (X vaporView : members)
			vaporView.invalidate(keyIndex);
		return (self) this;

	}

	/**
	 * Requests a redraw of the entire keyboard. Calling invalidate() is not
	 * sufficient because the keyboard renders the keys to an off-screen buffer
	 * and an invalidate() only draws the cached buffer.
	 * 
	 * @return self
	 */
	public self invalidateKeys() {
		for (X vaporView : members)
			vaporView.invalidateKeys();
		return (self) this;

	}

	/**
	 * Returns the current keyboard being displayed by this view.
	 * 
	 * @return the currently attached keyboard
	 */
	public ArrayList<Keyboard> keyboard() {
		int _size = this.members.size();
		ArrayList<Keyboard> _returns = new ArrayList<Keyboard>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).keyboard());
		return _returns;
	}

	/**
	 * Attaches a keyboard to this view. The keyboard can be switched at any
	 * time and the view will re-layout itself to accommodate the keyboard.
	 * 
	 * @param keyboard
	 *            the keyboard to display in this view
	 * @return self
	 */
	public self keyboard(Keyboard keyboard) {
		for (X vaporView : members)
			vaporView.keyboard(keyboard);
		return (self) this;

	}

	/**
	 * 
	 * @param keyboardActionListener
	 * @return self
	 */
	public self key(
			vapor.listeners.inputmethodservice.keyboardview.$key keyboardActionListener) {
		for (X vaporView : members)
			vaporView.key(keyboardActionListener);
		return (self) this;

	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return self
	 */
	public self popOffset(int x, int y) {
		for (X vaporView : members)
			vaporView.popOffset(x, y);
		return (self) this;

	}

	/**
	 * 
	 * @param popUpParent
	 * @return self
	 */
	public self popParent(VaporView<? extends View, ?> popUpParent) {
		for (X vaporView : members)
			vaporView.popParent(popUpParent);
		return (self) this;

	}

	/**
	 * Returns the enabled state of the key feedback popup.
	 * 
	 * @return whether or not the key feedback popup is enabled
	 */
	public ArrayList<Boolean> previewable() {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).previewable());
		return _returns;
	}

	/**
	 * Enables or disables the key feedback popup. This is a popup that shows a
	 * magnified version of the depressed key. By default the preview is
	 * enabled.
	 * 
	 * @param previewEnabled
	 *            whether or not to enable the key feedback popup
	 * @return self
	 */
	public self previewable(boolean previewEnabled) {
		for (X vaporView : members)
			vaporView.previewable(previewEnabled);
		return (self) this;

	}

	/**
	 * Returns true if proximity correction is enabled.
	 * 
	 * @return true if proximity correction is enabled.
	 */
	public ArrayList<Boolean> proxCorrect() {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).proxCorrect());
		return _returns;
	}

	/**
	 * When enabled, calls to onKey(int, int[]) will include key codes for
	 * adjacent keys. When disabled, only the primary key code will be reported.
	 * 
	 * @param proximityCorrectionEnabled
	 *            whether or not the proximity correction is enabled
	 * @return self
	 */
	public self proxCorrect(boolean proximityCorrectionEnabled) {
		for (X vaporView : members)
			vaporView.proxCorrect(proximityCorrectionEnabled);
		return (self) this;

	}

	/**
	 * Returns the state of the shift key of the keyboard, if any.
	 * 
	 * @return true if the shift is in a pressed state, false otherwise. If
	 *         there is no shift key on the keyboard or there is no keyboard
	 *         attached, it returns false.
	 */
	public ArrayList<Boolean> shifted() {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).shifted());
		return _returns;
	}

	/**
	 * Sets the state of the shift key of the keyboard, if any.
	 * 
	 * @param shifted
	 *            whether or not to enable the state of the shift key
	 * @return true if the shift key state changed, false if there was no change
	 */
	public ArrayList<Boolean> shifted(boolean shifted) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).shifted(shifted));
		return _returns;
	}

	/**
	 * Fluent equivalent Vapor method for invoking
	 * onSizeChanged(int,int,int,int), called during layout when the size of
	 * this view has changed. If you were just added to the view hierarchy,
	 * you're called with the old values of 0.
	 * 
	 * @param width
	 *            Current width of this view.
	 * @param height
	 *            Current height of this view.
	 * @param oldWidth
	 *            Old width of this view.
	 * @param oldHeight
	 *            Old height of this view.
	 * @return self
	 */
	public self sizeChanged(int width, int height, int oldWidth, int oldHeight) {
		for (X vaporView : members)
			vaporView.sizeChanged(width, height, oldWidth, oldHeight);
		return (self) this;

	}

	/**
	 * 
	 * @param verticalOffset
	 * @return self
	 */
	public self yCorrect(int verticalOffset) {
		for (X vaporView : members)
			vaporView.yCorrect(verticalOffset);
		return (self) this;

	}

}