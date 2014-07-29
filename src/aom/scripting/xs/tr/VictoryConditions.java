package aom.scripting.xs.tr;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of Trigger commands concerning Victory Conditions (VCs).
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public abstract class VictoryConditions {	
	/**
	 * Checks if a player has no more units marked with "LogicalTypeNeededForVictory".
	 * If the result is true, that player will be set defeated.
	 */
	public native void vcCheckConquestVictory();
	
	/**
	 * Checks if 1 team has claimed all town centers, and fires a counter with given duration.
	 * If the counter finishes, the opposite teams will be set defeated.
	 * 
	 * @param countdown the duration of the countdown
	 */
	public native void vcCheckSettlementVictory(int countdown);
	
	/**
	 * Looks for wonder timers to start.
	 * 
	 * @param player the player to be checked for wonders.
	 * @param building the protoname for a wonder ("wonder")
	 * @param countdown the duration of the countdown
	 * 
	 * @note The actual wonder countdown, etc. is handled in C code,
	 * this function's responsibility is just starting things up.
	 */
	public native void vcStartOrUpdateWonderTimer(int player, string building, int countdown);
	
	/**
	 * Returns the current gameplay modeID.
	 */
	public native int vcGetGameplayMode();
	
	//hide constructor
	private VictoryConditions() {}
}
