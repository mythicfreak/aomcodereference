package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;

/**
 * This class provides a collection of Console commands concerning AI Debugging.
 * 
 * @local AI Debug commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class AIDebug {
	private AIDebug() {}
	
	/** Scans all KB entries for unit duplication.*/
	public native void kbCheckConsistency();
	
	/** Sets the render state of the given base (no int state toggles).*/
	public native void renderBaseID(int playerID, int areaID, int state);

	/** 
	 * Sets the render state for all areas (no arguments toggles).
	 * 
	 * @single
	 */
	public native void renderAreas(int playerID, int state);

	/** 
	 * Sets the render state of the given area (no integer state toggles).
	 * 
	 * @single
	 */
	public native void renderAreaID(int playerID, int areaID, int state);

	/** 
	 * Sets the render state of the given area (no integer state toggles).
	 *
	 * @single
	 */
	public native void renderAreaGroupID(int playerID, int areaGroupID, int state);
	
	/** Toggles whether the AI gatherer distribution window is up, refreshing if first showing.*/
	public native void AIDebugGathererToggle();

	/** Toggles whether the AI pop distribution window is up, refreshing if first showing.*/
	public native void AIDebugPopToggle();

	/** Toggles whether the AI past resource needs window is up, refreshing if first showing.*/
	public native void AIDebugPastResourceNeedToggle();

	/** Toggles whether the KB timed statistics window is up, refreshing if first showing.*/
	public native void AIDebugTimedStatsToggle();

	/** Toggles the showing of building placement value text. Used for AI building calculation. */
	public native void AIDebugToggleBPText();

	/** Brings up the plan debug text for the given plan ID.*/
	public native void uiShowAIDebugInfoPlan(int planID);

	/** Brings up the building placement info for the given ID.*/
	public native void uiShowAIDebugInfoPlacement(int placementID);

	/** Brings up the progression info for the given ID.*/
	public native void uiShowAIDebugInfoProgression(int progressionID);

	/** Brings up the unit info for the given ID.*/
	public native void uiShowAIDebugInfoKBUnit(int unitID);

	/** Brings up the base info for the given ID.*/
	public native void uiShowAIDebugInfoBase(int baseID);

	/** Brings up the area info for the given ID.*/
	public native void uiShowAIDebugInfoArea(int areaID);

	/** Brings up the area info for the given ID.*/
	public native void uiShowAIDebugInfoAreaGroup();

	/** Render the attackRoute info for the given ID.*/
	public native void uiSetKBAttackRouteRender();

	/** Brings up the attackRoute info for the given ID.*/
	public native void uiShowAIDebugInfoAttackRoute();

	/** Render the kbResource info for the given ID. If not set given, will not render the resource.*/
	public native void uiSetKBResourceRender(int resID, bool set);

	/** Brings up the kbResource info for the given ID.*/
	public native void uiShowAIDebugInfoKBResource();

	/** Render the kbArmy info for the given ID. If not set given, will not render the army.*/
	public native void uiSetKBArmyRender(int id, bool set);

	/** Brings up the kbArmy info for the given ID.*/
	public native void uiShowAIDebugInfoKBArmy();

	/** Brings up the kbUnitPick info for the given ID.*/
	public native void uiShowAIDebugInfoKBUnitPick();

	/** Brings up the escrow info for the given ID.*/
	public native void uiShowAIDebugInfoEscrow();

	/** Controls rendering of the building placement info for the given ID.*/
	public native void uiSetBuildingPlacementRender(int id, bool on);
	
	/** Shows the AI debug menu with new data.*/
	public native void AIDebugInfoRefresh();

	/** Toggles whether the AI debug menu is up, refreshing if first showing.*/
	public native void AIDebugInfoToggle();

	/** Toggles whether the AI output window is up, refreshing if first showing.*/
	public native void AIDebugOutputToggle();
}
