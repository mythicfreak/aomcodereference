package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Gadgets.
 * Gadgets are the building blocks for UIs.
 * 
 * @local Gadget commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Gadget {
	private Gadget() {}
	
	/** Cycles through the active child gadget of a deluxe gadget.*/
	public native void uiCycleGadget(int delta);

	/** Closes (as if clicked on the close button) any active field set.*/
	public native void uiCloseFieldSet();

	/** Closes (as if clicked on the close button) any active dialog.*/
	public native void uiCloseDialog();
	
	/** Acts like the current cycle gadget has been pressed.*/
	public native void uiCycleCurrentActivate();
	
	/** Scrolls the gadget up one unit.
	 * @deprecated
	 */
	public native void gadgetScrollUp();

	/** Scrolls the gadget up one unit.
	 * @deprecated
	 */
	public native void gadgetScrolIDown();

	/** Scrolls the gadget to the left one unit.
	 * @deprecated
	 */
	public native void gadgetscrollLeft();

	/** Scrolls the gadget to the Right one unit.
	 * @deprecated
	 */
	public native void gadgetScrollRight();

	/** Scrolling function for hooking wheel to gadget scrolling.*/
	public native void gadgetWheelScroll();

	/** Shows the requested gadget. */
	public native void gadgetReal(string name);

	/** Hides the named gadget.*/
	public native void gadgetUnreal(string name);

	/** Shows the requested gadget if the game made is not multiplayer.*/
	public native void gadgetRealIfNotMP(string name);

	/** Toggles the visibility of the named gadget.*/
	public native void gadgetToggle(string name);

	/** Refresh the contents of the named gadget.*/
	public native void gadgetRefresh(string name);

	/** Turns gadget flashing on/off.*/
	public native void gadgetFlash(string name, bool flash);
}
