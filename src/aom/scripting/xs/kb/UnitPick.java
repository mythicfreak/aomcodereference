package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of KB commands concerning Unit Picks.
 * Unit Picks are a high level way to decide what kind of units you wish to train.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class UnitPick {
	/** Creates a unit pick. */
	public native int kbUnitPickCreate(string name);
	/** Destroys the given unit pick. */
	public native bool kbUnitPickDestroy(int upID);
	/** Resets all of the unit pick data. */
	public native bool kbUnitPickResetAll(int upID) ;
	/** Resets the unit pick results. */
	public native bool kbUnitPickResetResults(int upID) ;
	/** Gets the unit pick preference weight. */
	public native float kbUnitPickGetPreferenceWeight(int upID) ;
	/** Sets the unit pick preference weight. */
	public native bool kbUnitPickSetPreferenceWeight(int upID, float v) ;
	/** Sets the unit pick enemy player ID. */
	public native bool kbUnitPickSetEnemyPlayerID(int upID) ;
	/** Sets the unit pick combat efficiency weight. */
	public native bool kbUnitPickSetCombatEfficiencyWeight(int upID) ;
	/** Resets the enemy unit typeIDs for the unit pick combat efficiency calculation. */
	public native bool kbUnitPickResetCombatEfficiencyTypes(int upID) ;
	/** Adds an enemy unit typeID to the unit pick combat efficiency calculation. */
	public native bool kbUnitPickAddCombatEfficiencyType(int upID, int typeID, float weight) ;
	/** Sets the unit pick cost weight. */
	public native bool kbUnitPickSetCostWeight(int upID) ;
	/** Sets the unit pick movement type. */
	public native bool kbUnitPickSetMovementType(int upID, int movementType) ;
	/** Sets the unit pick desired number unit types. */
	public native bool kbUnitPickSetDesiredNumberUnitTypes(int upID, int number, int numberBuildings, bool degradeNumberBuildings) ;
	/** Gets the unit pick desired number unit types. */
	public native int kbUnitPickGetDesiredNumberUnitTypes(int upID) ;
	/** Sets the unit pick desired number buildings for the index'th unit type. */
	public native bool kbUnitPickSetDesiredNumberBuildings(int upID, int index, int numberBuildings) ;
	/** Gets the unit pick desired number buildings for the index'th unit type. */
	public native int kbUnitPickGetDesiredNumberBuildings(int upID, int index) ;
	/** Sets the unit pick desired number unit types. */
	public native bool kbUnitPickSetMinimumNumberUnits(int upID, int number) ;
	/** Gets the unit pick minimum number units. */
	public native int kbUnitPickGetMinimumNumberUnits(int upID) ;
	/** Sets the unit pick desired number unit types. */
	public native bool kbUnitPickSetMaximumNumberUnits(int upID, int number) ;
	/** Gets the unit pick maximum number units. */
	public native int kbUnitPickGetMaximumNumberUnits(int upID) ;
	/** Sets the unit pick desired minimum pop. */
	public native bool kbUnitPickSetMinimumPop(int upID, int number) ;
	/** Gets the unit pick minimum pop. */
	public native int kbUnitPickGetMinimumPop(int upID) ;
	/** Sets the unit pick desired max pop. */
	public native bool kbUnitPickSetMaximumPop(int upID, int number) ;
	/** Gets the unit pick maximum pop. */
	public native int kbUnitPickGetMaximumPop(int upID) ;
	/** Sets the unit pick attack unit type. */
	public native bool kbUnitPickSetAttackUnitType(int upID, int type) ;
	/** Gets the unit pick attack unit type. */
	public native int kbUnitPickGetAttackUnitType(int upID) ;
	/** Sets the unit pick attack unit type. */
	public native bool kbUnitPickSetGoalCombatEfficiencyType(int upID, int type) ;
	/** Gets the unit pick attack unit type. */
	public native int kbUnitPickGetGoalCombatEfficiencyType(int upID) ;
	/** Sets the preferenceFactor for that unit type. */
	public native bool kbUnitPickSetPreferenceFactor(int upID, int unitTypeID, float preferenceFactor) ;
	/** Adjusts the preferenceFactor for that unit type (uses 50.0 as the base if the unit pick doesn't exist yet). */
	public native bool kbUnitPickAdjustPreferenceFactor(int upID, int unitTypeID, float baseFactorAdjustment) ;
	/** Runs the unit pick. */
	public native int kbUnitPickRun(int upID);
	/** Returns the number of unit pick results. */
	public native int kbUnitPickGetNumberResults(int upID) ;
	/** Returns the index'th ProtoUnitID. */
	public native int kbUnitPickGetResult(int upID, int index);
	
	//hide constructor
	private UnitPick() {}
}
