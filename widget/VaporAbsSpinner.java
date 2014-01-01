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
import android.widget.AbsSpinner;
import android.widget.SpinnerAdapter;

/**
 * Fluent Vapor companion to AbsSpinner, an abstract base class for spinner
 * widgets.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from AbsSpinner
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public abstract class VaporAbsSpinner<T extends AbsSpinner, self extends VaporAbsSpinner<T, self>>
		extends VaporAdapterView<SpinnerAdapter, T, self> {

	public VaporAbsSpinner(int id) {
		super(id);
	}

	public VaporAbsSpinner(T absSpinner) {
		super(absSpinner);
	}

	/**
	 * Returns the adapter currently associated with this widget.
	 * 
	 * @return The adapter used to provide this view's content.
	 */
	public SpinnerAdapter adapter() {
		return view.getAdapter();
	}

	/**
	 * Maps a point to a position in the list.
	 * 
	 * @param x
	 *            X in local coordinate
	 * @param y
	 *            Y in local coordinate
	 * @return The position of the item which contains the specified point, or
	 *         INVALID_POSITION if the point does not intersect an item.
	 */
	public int pointToPos(int x, int y) {
		return view.pointToPosition(x, y);
	}

	/**
	 * Fluent equivalent Vapor method for invoking
	 * onRestoreInstanceState(Parcelable), a hook allowing a view to re-apply a
	 * representation of its internal state that had previously been generated by
	 * onSaveInstanceState().
	 * 
	 * @param state
	 *            The frozen state that had previously been returned by
	 *            onSaveInstanceState().
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
	 *         state, or null if there is nothing interesting to save.
	 */
	public Parcelable save() {
		return view.onSaveInstanceState();
	}

	/**
	 * Sets the currently selected item. To support accessibility subclasses
	 * that override this method must invoke the overriden super method first.
	 * 
	 * @param position
	 *            Index (starting at 0) of the data item to be selected.
	 * @return self
	 */
	public self itemSelected(int position) {
		view.setSelection(position);
		return (self) this;
	}

	/**
	 * Jump directly to a specific item in the adapter data.
	 * 
	 * @param position
	 *            Index (starting at 0) of the data item to be selected.
	 * @param animate
	 * @return self
	 */
	public self select(int position, boolean animate) {
		view.setSelection(position, animate);
		return (self) this;
	}
}