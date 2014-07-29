package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning BuildingPlacements.
 * Building Placements are an high level way to define where new structures should be built.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class BuildingPlacement {
	//Building Placement Preferences:
	public final int cBuildingPlacementPreferenceNone=-1;
	public final int cBuildingPlacementPreferenceBack=0;
	public final int cBuildingPlacementPreferenceFront=1;
	public final int cBuildingPlacementPreferenceLeft=2;
	
	//Building Placement Events:
	public final int cBuildingPlacementEventDone=0;
	public final int cBuildingPlacementEventFailed=1;
	
	/** Creates a building placement; returns the ID. */
	public native int kbBuildingPlacementCreate(string name);
	/** Destroys the given building placement. */
	public native bool kbBuildingPlacementDestroy(int id);
	/** Resets the current building placement. */
	public native bool kbBuildingPlacementResetResults();
	/** Selects the given building placement. */
	public native bool kbBuildingPlacementSelect(int id);
	/** Sets event handler function for the current Building Placement and event. */
	public native bool kbBuildingPlacementSetEventHandler(int eventType, string handlerName);
	/** Sets the building type for the current building placement. */
	public native bool kbBuildingPlacementSetBuildingType(int buildingTypeID);
	/** Sets the base ID and location preference for the current building placement. */
	public native bool kbBuildingPlacementSetBaseID(int baseID, int locationPref);
	/** Adds the Area ID - with the given number of border area layers - to the current Building Placement. addCenterInfluence adds a positional influence from the area center. */
	public native bool kbBuildingPlacementAddAreaID(int areaID, int numberBorderAreaLayers, bool addCenterInfluence);
	/** Adds the AreaGroup ID to the current Building Placement. */
	public native bool kbBuildingPlacementAddAreaGroupID(int areaGroupID);
	/** Sets up center position-based Building Placement. */
	public native bool kbBuildingPlacementSetCenterPosition(vector position, float distance, float obstructionRadius);
	/** Adds the unit influence for the current building placement. */
	public native bool kbBuildingPlacementAddUnitInfluence(int typeID, float value, float distance, long kbResourceID);
	/** Adds the position influence for the current building placement. */
	public native bool kbBuildingPlacementAddPositionInfluence(vector position, float value, float distance);
	/** Sets the minimum acceptable value for evaluated spots in the Building Placement. */
	public native bool kbBuildingPlacementSetMinimumValue(float minimumValue);
	/** Starts the placement of current building. */
	public native bool kbBuildingPlacementStart();
	/** Returns the vector result position for given Building Placement ID. */
	public native vector kbBuildingPlacementGetResultPosition(int bpID);
	/** Returns the result value for given Building Placement ID. */
	public native float kbBuildingPlacementGetResultValue(int bpID);
	
	//hide constructor
	private BuildingPlacement() {}
}
