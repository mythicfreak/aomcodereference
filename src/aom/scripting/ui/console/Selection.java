package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Selections and Finding Units.
 * 
 * @local 	Selection commands are all local.
 * 			Of course certain Auto Sync commands pass along the currently selected unit,
 * 			but the actual UI selection process is completely local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Selection {
	private Selection() {}
	
	/**
	 * Indicates that selection button has been pressed.
	 * When activated, a white selection rectangle is drawn on the screen,
	 * allowing the player to select multiple units.
	 */
	public native void uiSelectionButtonDown();

	/**
	 * Indicates that selection button has been released.
	 * When released, the selection rectangle disappears.
	 */
	public native void uiSelectionButtonUp();

	/**
	 * Double click select at pointer location.
	 * A doubleclick action selects all units of the same type as the unit under the pointer.
	 * 
	 * @param	add
	 * 			If add == 1, the previous selected is extended with this selection.
	 * 			Else, the previous selection is dropped.
	 * 			
	 * @param 	checkAction
	 * 			When checkAction is true, only units that are performing the same action (idle, moving, ...) are selected.
	 */
	public native void uiDoubleClickSelect(int add, bool checkAction);

	/**
	 * Indicates that the add selection button has been pressed.
	 */
	public native void uiAddSelectionButtonDown();

	/**
	 * Indicates that the add selection button has been released.
	 */
	public native void uiAddSelectionButtonUp();

	/**
	 * Toggles the selection button state (pressed or not).
	 */
	public native void uiToggleSelectionButton();

	/**
	 * Indicates that selection button has been pressed.
	 */
	public native void uiMoveSelectionButtonDown();

	/**
	 * Indicates that selection button has been released.
	 */
	public native void uiMoveSelectionButtonUp();

	/**
	 * Indicates that selection button has been pressed.
	 */
	public native void uiMoveSelectionAddButtonDown();

	/**
	 * Indicates that selection button has been released.
	 */
	public native void uiMoveSelectionAddButtonUp();
	
	/**
	 * Selects water at pointer location.
	 * 
	 * @editor
	 */
	public native void uiSelectWaterAtPointer();

	/**
	 * Deselects currently selected water.
	 * 
	 * @editor
	 */
	public native void uiUnSelectWater();
	
	/**
	 * Deselects all selected units. 
	 */
	public native void uiClearSelection();
	
	
	/**
	 * Finds the next idle unit of the given type in the arbitrary order of unit ID, so that it can be called repeatedly to cycle.
	 */
	public native void uiFindIdleType(string typeName);
	
	/**
	 * Finds the next town center that has the town bell active, so that it can be called repeatedly to cycle.
	 */
	public native void uiFindTownBellTC();

	/**
	 * Finds the next unit (idle or not) of the given type in the arbitrary order of unit ID, so that it can be called repeatedly to cycle.
	 */
	public native void uiFindType(string typeName);
}
