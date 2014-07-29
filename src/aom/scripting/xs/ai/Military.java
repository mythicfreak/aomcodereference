package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;

/**
 * This class provides a collection of AI commands concerning Military.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Military {
	private Military() {}
	
	/** Returns the script-defined most hated player ID for this player. */
	public native int aiGetMostHatedPlayerID();
	/** Returns the playerID for the player the AI thinks it should be attacking. */
	public native int aiCalculateMostHatedPlayerID(int comparePlayerID);
	/** Sets the script-defined most hated player ID for this player. */
	public native void aiSetMostHatedPlayerID(int v);
	/** Returns the script-defined military pop for this player. */
	public native int aiGetAvailableMilitaryPop();
	/** Returns the script-defined military pop for this player. */
	public native int aiGetMilitaryPop();
	/** Set the script-defined military pop for this player. */
	public native void aiSetMilitaryPop(int v);
	/** Returns the militarypriority percentage. */
	public native float aiGetMilitaryPercentage();
	/** Set the military priority percentage. */
	public native void aiSetMilitaryPercentage(float v);
	/** Returns the attack response distance. */
	public native float aiGetAttackResponseDistance();
	/** Set the attack response distance. */
	public native void aiSetAttackResponseDistance(float v);
	/** Turns auto gathering of military units at bases on/off. */
	public native bool aiSetAutoGatherMilitaryUnits(bool v);
	
	
	
	
	
	
	
}
