package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;
import aom.scripting.xs.xs.ExternalSubroutines;

/**
 * This class provides a collection of Trigger commands concerning Units.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Unit {
	private Unit() {}
	
	/** Does a specific amount of damage to HP in instant typeless damage. */
	public native void trDamageUnit(float amt);

	/** Does % percent of a unit's total HP in instant typeless damage. */
	public native void trDamageUnitPercent(float percent);

	/** All units within distance of the selected reference object that match type take damage. */
	public native void trDamageUnitsInArea(int playerID, int unitType, float dist, float damage);
	
	/** Returns true if all selected units are alive */
	public native bool trUnitAlive();

	/** Selects units and makes the build a unit at specified location. */
	public native void trUnitBuildUnit(string protoUnit, vector position);

	/** 
	 * Changes all units in a given radius around the selected units.
	 * @since AoT 
	 */
	public native void trUnitChangeInArea(int fromID, int toID, string fromProto, string toProto, float Dist);

	/**
	 * Set an override name for a specific unit.
	 * Only works in scenarios, not in RMS.
	 */
	public native void trUnitChangeName(string name);

	/** Changes the proto unit for a given set of units. */
	public native void trUnitChangeProtoUnit(string protoUnit);

	/** Converts the selected units to player. */
	public native void trUnitConvert(int playerID);

	/** Creates a new unit. Does not work online. */
	public native void trUnitCreate(string protoName, string scenarioName, float x, float y, float z, int heading, int playerID );

	/** Returns true if all selected units are dead. */
	public native bool trUnitDead();

	/** Removes or kills the selected unit(s) */
	public native void trUnitDelete(bool remove);

	/** Destroys the selected unit(s). */
	public native void trUnitDestroy();

	/** Returns the shortest distance between the trRT units and the point. */
	public native float trUnitDistanceToPoint(float x, float y, float z);

	/** Returns the shortest distance between the trRT units and the given unit. */
	public native float trUnitDistanceToUnit(string unitScenarioName);

	/** Returns the shortest distance between the selected units and the given unit. */
	public native float trUnitDistanceToUnitID(int unitID);

	/** Tasks the selected unit(s) to perform work on the given unit.*/
	public native void trUnitDoWorkOnUnit(string unitScenarioName, int eventID);

	/** Ejects all contained units */
	public native void trUnitEjectContained();

	/** Tasks the selected unit(s) to garrison into another unit. */
	public native void trUnitGarrison(string unitScenarioName, int eventID);

	/** Returns the number of units contained. */
	public native int trUnitGetContained();

	/** Returns the units heading. The angle returned is the angle the unit's face makes with the z-axis of the map. 
	 * Unfortunately it does not say which side, so the result is always in the [0-180] interval. 
	 */
	public native int trUnitGetHeading(string scenarioName);

	/** Returns true if this unit is contained by a matching type unit. */
	public native bool trUnitGetIsContained(string matchType) ;

	/** Returns true if the player can see the selected unit, otherwise returns false. OoS Danger. */
	public native bool trUnitHasLOS(int playerID);

	/** Does something to highlight the units selected */
	public native void trUnitHighlight(int seconds) ;

	/** Determines if the selected units are owned by the player specified */
	public native bool trUnitIsOwnedBy(int playerID);

	/** Returns if the specified unit is selected. */
	public native bool trUnitIsSelected();

	/** Moves all matching units near the selected unit(s) to the given position. */
	public native void trUnitMoveFromArea(float x, float y, float z, int eventID, bool attackMove, int playerID, string unitType, float radius);

	/** Moves the selected unit(s) to the given position. Does not work online. Does not work for mother nature. */
	public native void trUnitMoveToPoint(float x, float y, float z, int eventID, bool attackMove);

	/** Moves the selected unit(s) to the spot occupied by the given unit. Does not work online. Does not work for mother nature. */
	public native void trUnitMoveToUnit(string unitScenarioName, int eventID, bool attackMove);

	/** Checks whether the selected units location matches lush for the given player. */
	public native bool trUnitOnLush(bool lush, int playerID);

	/** Returns the percent complete as 0 to 100. */
	public native int trUnitPercentComplete();

	/** Returns the percent damaged as 0 to 100. */
	public native int trUnitPercentDamaged();

	/** Sets the animations for the selected unit(s) to the given animation. Does not work online. */
	public native void trUnitSetAnimation(string animationName, bool loop, int eventID);

	/** Sets the units heading. Does not work online. The input can range from 0 to 360 degrees. */
	public native void trUnitSetHeading(int degrees);

	/** Set the hit points for all selected units. Does not work online. */
	public native void trUnitSetHP(float hitpoints);

	/** Set the stance for the given set of units. */
	public native void trUnitSetStance(string stance);

	/** Moves units from current position to position specified. Does not work online. */
	public native void trUnitTeleport(float x, float y, float z);

	/** Returns true if the specified unit is selected. */
	public native bool trUnitTypeIsSelected(string protoUnit);

	/** Returns true if the {@link ExternalSubroutines#xsGetContextPlayer() context player} can see the selected unit, and it is on screen. */
	public native bool trUnitVisToPlayer();
	
	/** Sets whether or not units can do their idle processing. */
	public native void trSetUnitIdleProcessing(bool b);
	
	/** Instantly garrisons units inside another unit without considering distance. */
	public native void trImmediateUnitGarrison(string unitScenarioName);
}
