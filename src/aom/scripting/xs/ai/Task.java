package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of AI commands concerning Tasks.
 * Tasks are low level commands that are usually only issued once.
 * As soon as the unit receives another task it will drop the current task and never return to it again unless manually told to.
 * This stands in contrast with plans, who also supervise the units after the task has been given and retask them if necessary.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Task {
	private Task() {}
	
	/** Does a lightweight (no plan) move tasking of the given unit to the given location. */
	public native bool aiTaskUnitMove(int unitID, vector position);
	/** Does a lightweight (no plan) work tasking of the given unit on the given target unit. */
	public native bool aiTaskUnitWork(int unitID, int targetUnitID);
	/** Does a lightweight (no plan) build tasking of the given unit to build the given building. */
	public native bool aiTaskUnitBuild(int unitID, int buildingTypeID, vector position);
	/** Does a lightweight (no plan) train tasking of the given unit for the given target unit type. */
	public native bool aiTaskUnitTrain(int unitID, int unitTypeID);
	/** Does a lightweight (no plan) research tasking of the given unit for the given tech ID. */
	public native bool aiTaskUnitResearch(int unitID, int techID);
	/** Does a lightweight (no plan) research tasking of the given unit for the given special power. */
	public native bool aiTaskUnitSpecialPower(int unitID, int powerID, vector position);
	/** Deletes the given unit. */
	public native bool aiTaskUnitDelete(int unitID);
	/**
	 * Takes the given unit, and transforms it according to the unit transform table in world.
	 * @since AoT 
	 */
	public native bool aiTaskUnitTransform(int unitID);

}
