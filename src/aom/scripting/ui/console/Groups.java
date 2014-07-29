package aom.scripting.ui.console;

/**
 * This class provides a collection of Console commands concerning Groups.
 * 
 * Groups are predefined armies (1-9) that can be accessed and modified through the army banners.
 * 
 * @local Group commands are all local.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Groups {
	private Groups() {}
	
	/** Creates a number group with the currently selected units.*/
	public native void uiCreateNumberGroup(int group);
	
	/** Erases the given number group.*/
	public native void uiClearNumberGroup(int group);

	/** Selects the units in the given number group.*/
	public native void uiSelectNumberGroup(int group);

	/** Adds the units in the given number group to current selection.*/
	public native void uiAddSelectNumberGroup(int group);

	/** Removes current selection from any army.*/
	public native void uiRemoveFromAnyNumberGroup();
	
	/** Moves the camera to see the given number group.*/
	public native void uiLookAtNumberGroup(int group);
}
