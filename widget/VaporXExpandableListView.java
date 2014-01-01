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

/*This file has been autogenerated by the Vapid Tool v1.0 @ 22/12/2012 22:43:13*/
package vapor.widget;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

/**
 * Fluent variadic Vapor companion to ExpandableListView, a view that shows
 * items in a vertically scrolling two-level list. This differs from the
 * ListView by allowing two levels: groups which can individually be expanded to
 * show its children. The items come from the ExpandableListAdapter associated
 * with this view.
 * 
 * @author Darius H (darius@vapor-api.com)
 * @since 1.0
 * @param <T>
 *            A standard Android type derived from ExpandableListView
 * @param <X>
 *            A Vapor type derived from VaporExpandableListView
 * @param <self>
 *            A recursively defined type that provides information for fluent
 *            method invocation
 */
public class VaporXExpandableListView<T extends ExpandableListView, X extends VaporExpandableListView<T, ?>, self extends VaporXExpandableListView<T, X, self>>
		extends VaporXListView<T, X, self> {

	public VaporXExpandableListView(Integer... ids) {
		super(ids);
	}

	public VaporXExpandableListView(T... expandableListViews) {
		super(expandableListViews);
	}

	public VaporXExpandableListView(X... vaporExpandableListViews) {
		super(vaporExpandableListViews);
	}

	public VaporXExpandableListView(
			VaporXExpandableListView<T, X, ?>... vaporXExpandableListViews) {
		super(vaporXExpandableListViews);
	}

	public VaporXExpandableListView(Object... expandableListViewItems) {
		super(expandableListViewItems);
	}

	/**
	 * This method should not be used, use getExpandableListAdapter().
	 * 
	 * @return The adapter currently used to display data in this ListView.
	 */
	@Override
	public ArrayList<ListAdapter> adapter() {
		int _size = this.members.size();
		ArrayList<ListAdapter> _returns = new ArrayList<ListAdapter>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).adapter());
		return _returns;
	}

	/**
	 * Sets the adapter that provides data to this view.
	 * 
	 * @param expandableListAdapter
	 *            The adapter that provides data to this view.
	 * @return self
	 */
	public self adapter(ExpandableListAdapter expandableListAdapter) {
		for (X vaporView : members)
			vaporView.adapter(expandableListAdapter);
		return (self) this;

	}

	/**
	 * This overloaded method should not be used, instead use
	 * setAdapter(ExpandableListAdapter).
	 * 
	 * @param listAdapter
	 *            The ListAdapter which is responsible for maintaining the data
	 *            backing this list and for producing a view to represent an
	 *            item in that data set.
	 * @return self
	 */
	@Override
	public self adapter(ListAdapter listAdapter) {
		for (X vaporView : members)
			vaporView.adapter(listAdapter);
		return (self) this;

	}

	/**
	 * Sets the drawable that will be drawn adjacent to every child in the list.
	 * 
	 * @param childDivider
	 *            The drawable to use.
	 * @return self
	 */
	public self childDiv(Drawable childDivider) {
		for (X vaporView : members)
			vaporView.childDiv(childDivider);
		return (self) this;

	}

	/**
	 * Sets the indicator to be drawn next to a child.
	 * 
	 * @param childIndicator
	 *            The drawable to be used as an indicator. If the child is the
	 *            last child for a group, the state state_last will be set.
	 * @return self
	 */
	public self childIndicator(Drawable childIndicator) {
		for (X vaporView : members)
			vaporView.childIndicator(childIndicator);
		return (self) this;

	}

	/**
	 * Sets the drawing bounds for the child indicator. For either, you can
	 * specify CHILD_INDICATOR_INHERIT to use inherit from the general
	 * indicator's bounds.
	 * 
	 * @param left
	 *            The left position (relative to the left bounds of this View)
	 *            to start drawing the indicator.
	 * @param right
	 *            The right position (relative to the left bounds of this View)
	 *            to end the drawing of the indicator.
	 * @return self
	 */
	public self childIndicatorBounds(int left, int right) {
		for (X vaporView : members)
			vaporView.childIndicatorBounds(left, right);
		return (self) this;

	}

	/**
	 * 
	 * @param childClickListener
	 * @return self
	 */
	public self child(
			vapor.listeners.widget.expandablelistview.$click childClickListener) {
		for (X vaporView : members)
			vaporView.child(childClickListener);
		return (self) this;

	}

	/**
	 * 
	 * @param groupClickListener
	 * @return self
	 */
	public self group(
			vapor.listeners.widget.expandablelistview.group.$click groupClickListener) {
		for (X vaporView : members)
			vaporView.group(groupClickListener);
		return (self) this;

	}

	/**
	 * Collapse a group in the grouped list view
	 * 
	 * @param groupPosition
	 *            position of the group to collapse
	 * @return True if the group was collapsed, false otherwise (if the group
	 *         was already collapsed, this will return false)
	 */
	public ArrayList<Boolean> collapse(int groupPosition) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).collapse(groupPosition));
		return _returns;
	}

	/**
	 * 
	 * @param
	 * @return self
	 */
	public self collapse(
			vapor.listeners.widget.expandablelistview.$collapse groupCollapseListener) {
		for (X vaporView : members)
			vaporView.collapse(groupCollapseListener);
		return (self) this;

	}

	/**
	 * Expand a group in the grouped list view
	 * 
	 * @param groupPosition
	 *            the group to be expanded
	 * @return True if the group was expanded, false otherwise (if the group was
	 *         already expanded, this will return false)
	 */
	public ArrayList<Boolean> expand(int groupPosition) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).expand(groupPosition));
		return _returns;
	}

	/**
	 * Expand a group in the grouped list view
	 * 
	 * @param groupPosition
	 *            the group to be expanded
	 * @param animate
	 *            true if the expanding group should be animated in
	 * @return True if the group was expanded, false otherwise (if the group was
	 *         already expanded, this will return false)
	 */
	public ArrayList<Boolean> expand(int groupPosition, boolean animate) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index)
					.expand(groupPosition, animate));
		return _returns;
	}

	/**
	 * 
	 * @param groupExpandListener
	 * @return self
	 */
	public self expand(
			vapor.listeners.widget.expandablelistview.$expand groupExpandListener) {
		for (X vaporView : members)
			vaporView.expand(groupExpandListener);
		return (self) this;

	}

	/**
	 * Gets the adapter that provides data to this view.
	 * 
	 * @return The adapter that provides data to this view.
	 */
	public ArrayList<ExpandableListAdapter> expandableAdapter() {
		int _size = this.members.size();
		ArrayList<ExpandableListAdapter> _returns = new ArrayList<ExpandableListAdapter>(
				_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).expandableAdapter());
		return _returns;
	}

	/**
	 * Converts a flat list position (the raw position of an item (child or
	 * group) in the list) to a group and/or child position (represented in a
	 * packed position).
	 * 
	 * @param flatListPosition
	 *            The flat list position to be converted.
	 * @return The group and/or child position for the given flat list position
	 *         in packed position representation. #PACKED_POSITION_VALUE_NULL if
	 *         the position corresponds to a header or a footer item.
	 */
	public ArrayList<Long> expandableListPos(int flatListPosition) {
		int _size = this.members.size();
		ArrayList<Long> _returns = new ArrayList<Long>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).expandableListPos(
					flatListPosition));
		return _returns;
	}

	/**
	 * Converts a group and/or child position to a flat list position. This is
	 * useful in situations where the caller needs to use the underlying
	 * ListView's methods.
	 * 
	 * @param packedPosition
	 *            The group and/or child positions to be converted in packed
	 *            position representation. Use getPackedPositionForChild(int,
	 *            int) or getPackedPositionForGroup(int).
	 * @return The flat list position for the given child or group.
	 */
	public ArrayList<Integer> flatListPos(long packedPosition) {
		int _size = this.members.size();
		ArrayList<Integer> _returns = new ArrayList<Integer>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).flatListPos(packedPosition));
		return _returns;
	}

	/**
	 * Whether the given group is currently expanded.
	 * 
	 * @param groupPosition
	 *            The group to check.
	 * @return Whether the group is currently expanded.
	 */
	public ArrayList<Boolean> expanded(int groupPosition) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).expanded(groupPosition));
		return _returns;
	}

	/**
	 * Sets the indicator to be drawn next to a group.
	 * 
	 * @param groupIndicator
	 *            The drawable to be used as an indicator. If the group is
	 *            empty, the state state_empty will be set. If the group is
	 *            expanded, the state state_expanded will be set.
	 * @return self
	 */
	public self groupIndicator(Drawable groupIndicator) {
		for (X vaporView : members)
			vaporView.groupIndicator(groupIndicator);
		return (self) this;

	}

	/**
	 * Sets the drawing bounds for the indicators (at minimum, the group
	 * indicator is affected by this; the child indicator is affected by this if
	 * the child indicator bounds are set to inherit).
	 * 
	 * @param left
	 *            The left position (relative to the left bounds of this View)
	 *            to start drawing the indicator.
	 * @param right
	 *            The right position (relative to the left bounds of this View)
	 *            to end the drawing of the indicator.
	 * @return self
	 */
	public self indicatorBounds(int left, int right) {
		for (X vaporView : members)
			vaporView.indicatorBounds(left, right);
		return (self) this;

	}

	/**
	 * Gets the child position from a packed position that is of
	 * PACKED_POSITION_TYPE_CHILD type (use getPackedPositionType(long)).
	 * 
	 * @param packedPosition
	 *            The packed position from which the child position will be
	 *            returned.
	 * @return The child position portion of the packed position. If this does
	 *         not contain a child, returns -1.
	 */
	public static int packedPosChild(long packedPosition) {
		return ExpandableListView.getPackedPositionChild(packedPosition);
	}

	/**
	 * Returns the packed position representation of a child's position.
	 * 
	 * @param groupPosition
	 *            The child's parent group's position.
	 * @param childPosition
	 *            The child position within the group.
	 * @return The packed position representation of the child (and parent
	 *         group).
	 */
	public static long packedPosForChild(int groupPosition, int childPosition) {
		return ExpandableListView.getPackedPositionForChild(groupPosition,
				childPosition);
	}

	/**
	 * Returns the packed position representation of a group's position.
	 * 
	 * @param groupPosition
	 *            The child's parent group's position.
	 * @return The packed position representation of the group.
	 */
	public static long packedPosForGroup(int groupPosition) {
		return ExpandableListView.getPackedPositionForGroup(groupPosition);
	}

	/**
	 * Gets the group position from a packed position.
	 * 
	 * @param packedPosition
	 *            The packed position from which the group position will be
	 *            returned.
	 * @return The group position portion of the packed position. If this does
	 *         not contain a group, returns -1.
	 */
	public static int packedPosGroup(long packedPosition) {
		return ExpandableListView.getPackedPositionGroup(packedPosition);
	}

	/**
	 * Gets the type of a packed position.
	 * 
	 * @param packedPosition
	 *            The packed position for which to return the type.
	 * @return The type of the position contained within the packed position,
	 *         either PACKED_POSITION_TYPE_CHILD, PACKED_POSITION_TYPE_GROUP, or
	 *         PACKED_POSITION_TYPE_NULL.
	 */
	public static int packedPosType(long packedPosition) {
		return ExpandableListView.getPackedPositionType(packedPosition);
	}

	/**
	 * Sets the selection to the specified child. If the child is in a collapsed
	 * group, the group will only be expanded and child subsequently selected if
	 * shouldExpandGroup is set to true, otherwise the method will return false.
	 * 
	 * @param groupPosition
	 *            The position of the group that contains the child.
	 * @param childPosition
	 *            The position of the child within the group.
	 * @param shouldExpandGroup
	 *            Whether the child's group should be expanded if it is
	 *            collapsed.
	 * @return Whether the selection was successfully set on the child.
	 */
	public ArrayList<Boolean> selectedChild(int groupPosition,
			int childPosition, boolean shouldExpandGroup) {
		int _size = this.members.size();
		ArrayList<Boolean> _returns = new ArrayList<Boolean>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).selectedChild(groupPosition,
					childPosition, shouldExpandGroup));
		return _returns;
	}

	/**
	 * Sets the selection to the specified group.
	 * 
	 * @param groupPosition
	 *            The position of the group that should be selected.
	 * @return self
	 */
	public self selectedGroup(int groupPosition) {
		for (X vaporView : members)
			vaporView.selectedGroup(groupPosition);
		return (self) this;

	}

	/**
	 * Gets the ID of the currently selected group or child. Can return -1 if no
	 * selection.
	 * 
	 * @return The ID of the currently selected group or child. -1 if no
	 *         selection.
	 */
	public ArrayList<Long> selectedId() {
		int _size = this.members.size();
		ArrayList<Long> _returns = new ArrayList<Long>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).selectedId());
		return _returns;
	}

	/**
	 * Gets the position of the currently selected group or child (along with
	 * its type). Can return PACKED_POSITION_VALUE_NULL if no selection.
	 * 
	 * @return A packed position containing the currently selected group or
	 *         child's position and type. #PACKED_POSITION_VALUE_NULL if no
	 *         selection or if selection is on a header or a footer item.
	 */
	public ArrayList<Long> selectedPos() {
		int _size = this.members.size();
		ArrayList<Long> _returns = new ArrayList<Long>(_size);
		for (int _index = 0; _index < _size; _index++)
			_returns.add(this.members.get(_index).selectedPos());
		return _returns;
	}

}