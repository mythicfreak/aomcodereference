package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Units and Protounits.
 * 
 * @see <a href="{@docRoot}/AI Reference.xs">AoM Reference</a> or  <a href="{@docRoot}/AI XReference.xs">AoT Reference</a>
 * for a complete list of all unit constants and more.>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Unit {
	//KB Unit States:
	public final int cUnitStateNone=0;
	public final int cUnitStateBuilding=1;
	public final int cUnitStateAlive=2;
	public final int cUnitStateDead=4;
	public final int cUnitStateAny=255;
	public final int cUnitStateAliveOrBuilding=3;
	
	//KB TechTree Unit Functions:
	public final int cUnitFunctionBuilder=0;
	public final int cUnitFunctionGatherer=1;
	public final int cUnitFunctionEmpower=2;
	public final int cUnitFunctionFish=3;
	public final int cUnitFunctionWaterTransport=4;
	public final int cUnitFunctionTrade=5;
	public final int cUnitFunctionUnknown=6;
	
	/** Returns amount of pop cap addition provided by the given unit type. This only works on base types. */
	public native int kbGetPopCapAddition(int player, int baseUnitTypeID);
	/** Returns the number of pop slots this unit takes. This only works on base types. */
	public native int kbGetPopSlots(int player, int baseUnitTypeID);
	/** Returns the number of pop slots currently occupied by this unit type. */
	public native int kbGetPopulationSlotsByUnitTypeID(int playerID, int unitTypeID);
	/** Returns the id of the best building to repair. */
	public native int kbFindBestBuildingToRepair(vector position, float distance, float healthRatio, int repairUnderAttackUnitTypeID);
	/** Returns the combat efficiency of the comparison (in terms of playerID1's units). */
	public native float kbGetCombatEfficiency(int playerID1, int unitTypeID1, int playerID2, int unitTypeID2);
	/** 
	 * Updates the knowledge base for all players with the latest info. 
	 * If something's not working, put this in front of it and the problem usually magically disappears.
	 * 
	 * @see aom.scripting.xs.xs.ExternalSubroutines#xsSetContextPlayer(int) xsSetContextPlayer(int player)
	 */
	public native void kbLookAtAllUnitsOnMap();
	/** KB dump for player2's units from player1's perspective. */
	public native void kbDump(int player1, int player2);
	/** KB dump for player2's units of the given type from player1's perspective. */
	public native void kbDumpType(int player1, int player2, string typeName);
	/** Returns the AI cost for the given protoUnit type ID. */
	public native float kbGetProtoUnitAICost(int protoUnitTypeID);
	/** Returns the number of the unit type you are allowed to have. This only works on base types. Returns -1 if there is no limit. */
	public native int kbGetBuildLimit(int player, int baseUnitTypeID);
	/**
	 * Returns a random, valid protounit ID that's of the given type.
	 */
	public native int kbGetRandomEnabledPUID(int unitTypeID, int escrowID);
	/**
	 * Returns the cost of the protounit for the given resource. 
	 * @since AoT 
	 */
	public native float kbUnitCostPerResource(int protoUnitID, int resourceID);
	/** Returns the name of the protounit ID. */
	public native string kbGetProtoUnitName(int protoUnitTypeID);
	/** Returns the base type ID of the unit. */
	public native int kbGetUnitBaseTypeID(int unitID);
	/** Returns the name of the unit type. */
	public native string kbGetUnitTypeName(int unitTypeID);
	/** 
	 * Returns the position of the given unit. 
	 * This was intended to only work for cinematic blocks,
	 * but it turns out to work fine for every unit.
	 */
	public native vector kbGetBlockPosition(string blockName);
	/** 
	 * Returns the UnitID of the given unit. 
	 * This was intended to only work for cinematic blocks,
	 * but it turns out to work fine for every unit.
	 */
	public native int kbGetBlockID(string unitName);
	/** Returns true if the protoUnit is currently available. */
	public native bool kbProtoUnitAvailable(int protoUnitID);
	/** Returns the ID of the protounit. */
	public native int kbGetProtoUnitID(string name);
	/** Returns true if the player can afford the proto unit. */
	public native bool kbCanAffordUnit(int protoUnitTypeID, int escrowID);
	/** Returns a quick unit count of units for a player. */
	public native int kbUnitCount(int player, int unitTypeID, int stateID);
	/** Returns a quick unit count of player2's units from player1's perspective. */
	public native void kbUnitCountConsole(int playerID1, int playerID2, string unitType, string state);
	/** Returns the plan ID for this unit ID. */
	public native int kbUnitGetPlanID(int unitID);
	/** Returns the base ID for this unit ID. */
	public native int kbUnitGetBaseID(int unitID);
	/** Returns the area ID for this unit ID. */
	public native int kbUnitGetAreaID(int unitID);
	/** Returns the army ID for this unit ID. */
	public native int kbUnitGetArmyID(int unitID);
	/** Returns the movementType for this unitTypeID. */
	public native int kbUnitGetMovementType(int unitTypeID);
	/** Returns the current hitpoints for this unit ID. */
	public native float kbUnitGetCurrentHitpoints(int unitID);
	/** Returns the maximum hitpoints for this unit ID. */
	public native float kbUnitGetMaximumHitpoints(int unitID);
	/** Returns the health for this unit ID. */
	public native float kbUnitGetHealth(int unitID);
	/** Returns the current AI cost (worth) for this unit ID. */
	public native float kbUnitGetCurrentAICost(int unitID);
	/** Returns the maximum AI cost (worth) for this unit ID. */
	public native float kbUnitGetMaximumAICost(int unitID);
	/** Returns the position for this unit ID. */
	public native vector kbUnitGetPosition(int unitID);
	/** Returns true if the unit is of the unitTypeID. */
	public native bool kbUnitIsType(int unitID, long unitTypeID);
	/** Returns the actionTypeID of the unit. */
	public native int kbUnitGetActionType(int unitID);
	/** Returns the target unit ID of the given unit. */
	public native int kbUnitGetTargetUnitID(int unitID);
	/** Returns the number of units currently working on the given unit. */
	public native int kbUnitGetNumberWorkers(int unitID);
	/** Returns the index'th worker unit ID. */
	public native int kbUnitGetWorkerID(int unitID, int index);
	/** Returns true if the unit is currently visible to the player. */
	public native bool kbUnitVisible(int unitID);
	
	//hide constructor
	private Unit() {}
}
