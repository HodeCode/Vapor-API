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

import vapor.view.VaporView;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TabWidget;

/**
 * Fluent variadic Vapor companion to TabWidget, that displays a list of tab
 * labels representing each page in the parent's tab collection. The container
 * object for this widget is TabHost. When the user selects a tab, this object
 * sends a message to the parent container, TabHost, to tell it to switch the
 * displayed page.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from TabWidget
 * @param <X>
 *            A Vapor type derived from VaporTabWidget
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporXTabWidget<T extends TabWidget, X extends VaporTabWidget<T, ?>, self extends VaporXTabWidget<T, X, self>>
		extends VaporXLinearLayout<T, X, self> {

	public VaporXTabWidget(Integer... ids) {
		super(ids);
	}

	public VaporXTabWidget(T... tabWidgets) {
		super(tabWidgets);
	}

	public VaporXTabWidget(X... vaporTabWidgets) {
		super(vaporTabWidgets);
	}

	public VaporXTabWidget(VaporXTabWidget<T, X, ?>... vaporXTabWidgets) {
		super(vaporXTabWidgets);
	}

	public VaporXTabWidget(Object... tabWidgetItems) {
		super(tabWidgetItems);
	}

	/**
	 * Sets the current tab. This method is used to bring a tab to the front of
	 * the Widget, and is used to post to the rest of the UI that a different
	 * tab has been brought to the foreground. Note, this is separate from the
	 * traditional "focus" that is employed from the view logic. For instance, if
	 * we have a list in a tabbed view, a user may be navigating up and down the
	 * list, moving the UI focus (orange highlighting) through the list items.
	 * The cursor movement does not effect the "selected" tab though, because
	 * what is being scrolled through is all on the same tab. The selected tab
	 * only changes when we navigate between tabs (moving from the list view to
	 * the next tabbed view, in this example). To move both the focus AND the
	 * selected tab at once, please use setCurrentTab(int). Normally, the view
	 * logic takes care of adjusting the focus, so unless you're circumventing
	 * the UI, you'll probably just focus your interest here.
	 * 
	 * @param tabIndex
	 *            The tab that you want to indicate as the selected tab (tab
	 *            brought to the front of the widget)
	 * @return this
	 */
	public self itemSelected(int tabIndex) {
		for (X vaporView : members)
			vaporView.itemSelected(tabIndex);
		return (self) this;

	}

	/**
	 * Equivalent fluent Vapor method for invoking dispatchDraw(Canvas), called
	 * by draw to draw the child views.
	 * 
	 * @param canvas
	 *            the canvas on which to draw the view
	 * @return this
	 */
	public self dispatchDraw(Canvas canvas) {
		for (X vaporView : members)
			vaporView.dispatchDraw(canvas);
		return (self) this;

	}

	/**
	 * Sets the drawable to use as a divider between the tab indicators.
	 * 
	 * @param resId
	 *            the resource identifier of the drawable to use as a divider.
	 * @return this
	 */
	public self div(int resId) {
		for (X vaporView : members)
			vaporView.div(resId);
		return (self) this;

	}

	/**
	 * Fluent equivalent Vapor method for invoking onFocusChange(View,boolean),
	 * called when the focus state of a view has changed.
	 * 
	 * @param view
	 *            The view whose state has changed.
	 * @param hasFocus
	 *            The new focus state of v.
	 * @return this
	 */
	public self focusChange(VaporView<? extends View, ?> view, boolean hasFocus) {
		for (X vaporView : members)
			vaporView.focusChange(view, hasFocus);
		return (self) this;

	}

	/**
	 * Sets the current tab and focuses the UI on it. This method makes sure
	 * that the focused tab matches the selected tab, normally at
	 * currentTab(int). Normally this would not be an issue if we go through the
	 * UI, since the UI is responsible for calling TabWidget.onFocusChanged(),
	 * but in the case where we are selecting the tab programmatically, we'll
	 * need to make sure focus keeps up.
	 * 
	 * @param tabIndex
	 *            The tab that you want focused (highlighted in orange) and
	 *            selected (tab brought to the front of the widget)
	 * @return this
	 */
	public self focusTab(int tabIndex) {
		for (X vaporView : members)
			vaporView.focusTab(tabIndex);
		return (self) this;

	}

	/**
	 * Call this method to remove all child views from the ViewGroup.
	 * 
	 * @return this
	 */
	public self removeAll() {
		for (X vaporView : members)
			vaporView.removeAll();
		return (self) this;

	}

	/**
	 * Indicates whether the bottom strips on the tab indicators are drawn or
	 * not.
	 * 
	 * @return
	 */
	public ArrayList<Boolean> strips() {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).strips());
		return _returns;
	}

	/**
	 * Controls whether the bottom strips on the tab indicators are drawn or
	 * not. The default is to draw them. If the user specifies a custom view for
	 * the tab indicators, then the TabHost class calls this method to disable
	 * drawing of the bottom strips.
	 * 
	 * @param stripsEnabled
	 *            true if the bottom strips should be drawn.
	 * @return this
	 */
	public self strips(boolean stripsEnabled) {
		for (X vaporView : members)
			vaporView.strips(stripsEnabled);
		return (self) this;

	}

	/**
	 * Sets the drawable to use as the left part of the strip below the tab
	 * indicators.
	 * 
	 * @param resId
	 *            the resource identifier of the drawable to use as the left
	 *            strip drawable
	 * @return this
	 */
	public self stripLeft(int resId) {
		for (X vaporView : members)
			vaporView.stripLeft(resId);
		return (self) this;

	}

	/**
	 * Sets the drawable to use as the left part of the strip below the tab
	 * indicators.
	 * 
	 * @param leftStripDrawable
	 *            the left strip drawable
	 * @return this
	 */
	public self stripLeft(Drawable leftStripDrawable) {
		for (X vaporView : members)
			vaporView.stripLeft(leftStripDrawable);
		return (self) this;

	}

	/**
	 * Sets the drawable to use as the right part of the strip below the tab
	 * indicators.
	 * 
	 * @param resId
	 *            the resource identifier of the drawable to use as the right
	 *            strip drawable
	 * @return this
	 */
	public self stripRight(int resId) {
		for (X vaporView : members)
			vaporView.stripRight(resId);
		return (self) this;

	}

	/**
	 * Sets the drawable to use as the right part of the strip below the tab
	 * indicators.
	 * 
	 * @param rightStripDrawable
	 *            the right strip drawable
	 * @return this
	 */
	public self stripRight(Drawable rightStripDrawable) {
		for (X vaporView : members)
			vaporView.stripRight(rightStripDrawable);
		return (self) this;

	}

	/**
	 * Returns the number of tab indicator views.
	 * 
	 * @return the number of tab indicator views.
	 */
	public ArrayList<Integer> tabCount() {
		int _size = this.members.size();
		ArrayList<Integer> _returns = new ArrayList<Integer>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).tabCount());
		return _returns;
	}

}