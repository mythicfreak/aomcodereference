package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Bases.
 * Bases are virtual areas used by the AI to locate the most important places on the map.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Base {
	/** Set the explicit position that every forward base will use. */
	public native void kbSetForwardBasePosition(vector position);
	/** Adds the given unit to the base. */
	public native bool kbBaseAddUnit(int playerID, int baseID, int unitID);
	/** Removes the given unit to the base. */
	public native bool kbBaseRemoveUnit(int playerID, int baseID, int unitID);
	/** Returns the number of units that match the criteria. */
	public native int kbBaseGetNumberUnits(int playerID, int baseID, int relation, int unitTypeID);
	/** Finds/Creates a 'forward' military base against the given enemy base. */
	public native int kbBaseFindCreateForwardBase(int enemyPlayerID, int enemyBaseID);
	/** Destroys the given base. */
	public native bool kbBaseDestroy(int playerID, int baseID);
	/** Destroys all of the bases for the given player. */
	public native void kbBaseDestroyAll(int playerID);
	/** Gets the location of the base. */
	public native vector kbBaseGetLocation(int playerID, int baseID);
//	/** Gets the last known damage location of the base. */
//	public native vector kbBaseGetLocation(int playerID, int baseID);
	/** Sets the front (and back) of the base. */
	public native bool kbBaseSetFrontVector(int playerID, int baseID, vector frontVector);
	/** Gets the front vector of the base. */
	public native vector kbBaseGetFrontVector(int playerID, int baseID);
	/** Gets the back vector of the base. */
	public native vector kbBaseGetBackVector(int playerID, int baseID);
	/** Returns the number of continuous seconds the base has been under attack. */
	public native int kbBaseGetTimeUnderAttack(int playerID, int baseID);
	/** Gets the under attack flag of the base. */
	public native bool kbBaseGetUnderAttack(int playerID, int baseID);
	/** Sets the active flag of the base. */
	public native bool kbBaseSetActive(int playerID, int baseID, bool active);
	/** Gets the active flag of the base. */
	public native bool kbBaseGetActive(int playerID, int baseID);
	/** Gets the main base ID for the player. */
	public native int kbBaseGetMainID(int playerID);
	/** Sets the main flag of the base. */
	public native bool kbBaseSetMain(int playerID, int baseID, bool main);
	/** Gets the main flag of the base. */
	public native bool kbBaseGetMain(int playerID, int baseID);
	/** Sets the forward flag of the base. */
	public native bool kbBaseSetForward(int playerID, int baseID, bool forward);
	/** Gets the forward flag of the base. */
	public native bool kbBaseGetForward(int playerID, int baseID);
	/** Sets the settlement flag of the base. */
	public native bool kbBaseSetSettlement(int playerID, int baseID, bool settlement);
	/** Gets the settlement flag of the base. */
	public native bool kbBaseGetSettlement(int playerID, int baseID);
	/** Sets the military flag of the base. */
	public native bool kbBaseSetMilitary(int playerID, int baseID, bool military);
	/** Gets the military flag of the base. */
	public native bool kbBaseGetMilitary(int playerID, int baseID);
	/** Gets the military gather point of the base. */
	public native vector kbBaseGetMilitaryGatherPoint(int playerID, int baseID);
	/** Sets the military gather point of the base. */
	public native bool kbBaseSetMilitaryGatherPoint(int playerID, int baseID, vector gatherPoint);
	/** Sets the economy flag of the base. */
	public native bool kbBaseSetEconomy(int playerID, int baseID, bool Economy);
	/** Gets the economy flag of the base. */
	public native bool kbBaseGetEconomy(int playerID, int baseID);
	/** Gets the maximum resource distance of the base. */
	public native float kbBaseGetMaximumResourceDistance(int playerID, int baseID);
	/** Sets the maximum resource distance of the base. */
	public native void kbBaseSetMaximumResourceDistance(int playerID, int baseID, float distance);
	/** Returns the auto base creation value. */
	public native bool kbGetAutoBaseCreate();
	/** Sets the auto base creation value. */
	public native void kbSetAutoBaseCreate(bool v);
	/** Returns the auto base creation distance. */
	public native float kbGetAutoBaseCreateDistance();
	/** Sets the auto base creation distance. */
	public native void kbSetAutoBaseCreateDistance(float v);
	/** Returns the auto base detection value. */
	public native bool kbGetAutoBaseDetect();
	/** Sets the auto base detection value. */
	public native void kbSetAutoBaseDetect(bool v);
	/** Returns the auto base creation distance. */
	public native float kbGetAutoBaseDetectDistance();
	/** Sets the auto base creation distance. */
	public native void kbSetAutoBaseDetectDistance(float v);
	/** Returns the ID of the next base that will be created. */
	public native int kbBaseGetNextID();
	/** Returns the number of bases for the given player. */
	public native int kbBaseGetNumber(int playerID);
	/** Returns the BaseID for the given base. */
	public native int kbBaseGetIDByIndex(int playerID, int index);
	/** Creates a base. */
	public native int kbBaseCreate(int playerID, string name, vector position, float distance);
	
	//hide constructor
	private Base() {}
}
