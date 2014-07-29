package aom.scripting.xs.tr;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Trigger commands concerning Selections.
 * 
 * <p>
 * Trigger selection is not the same as UI selection. If a unit is selected by triggers, 
 * no visual feedback is shown to the user (no selection circle). However, the idea stays 
 * the same: first select some units, then invoke some command on them.
 * </p>
 * 
 * <p>
 * Contrary to UI selection, the previous Trigger selection is not automatically cleared 
 * when a new selection is made. Common practice is to include {@link #trUnitSelectClear()} 
 * before every new selection.
 * </p>
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Selection {
	private Selection() {}
	
	/** Selects the units in the army specified. This automatically clears the previous selection. */
	 public native void trArmySelect(string army);
	 
	/** Returns the number of currently selected units. */
	public native int trGetNumberSelectedUnitIDs();

	/** Returns the unit ID of the currently selected unit.*/
	public native int trGetSelectedUnitID(int index);
	
	/** Adds the given unit to the trigger selection system. Previous selected units stay selected. Can't hold more than 30 units. */
	public native void trUnitSelect(string unitScenarioName);

	/** Adds the given unit to the trigger selection system. Previous selected units stay selected. Can't hold more than 30 units. */
	public native void trUnitSelectByID(int unitID);

	/** Clears the units in the trigger selection system. */
	public native void trUnitSelectClear();
}
