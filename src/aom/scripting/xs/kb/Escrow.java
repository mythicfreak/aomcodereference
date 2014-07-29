package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of KB commands concerning Escrows.
 * Escrows are used by the AI to seperate the available resources in virtual slices.
 * Each of those slices can be used for its own goals.
 * 
 * Typically, an AI will have 3 escrows: a root escrow, an economic escrow and a military escrow.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Escrow {
	//Escrow IDs:
	public final int cRootEscrowID=0;
	public final int cEconomyEscrowID=1;
	public final int cMilitaryEscrowID=2;
	
	/** Creates an escrow. */
	public native int kbEscrowCreate(string name, int resourceID, float percentage, int parentID);
	/** Destroys an escrow. */
	public native bool kbEscrowDestroy(int escrowID, bool promoteChildren);
	/** Returns the ID of the named escrow. */
	public native int kbEscrowGetID(string name);
	/** Returns the percentage of the escrow. */
	public native float kbEscrowGetPercentage(int escrowID, int resourceID);
	/** Sets the percentage of the escrow. */
	public native bool kbEscrowSetPercentage(int escrowID, int resourceID, float percentage);
	/** Sets the cap of the escrow. */
	public native bool kbEscrowSetCap(int escrowID, int resourceID, float cap);
	/** Returns the amount of credits in the given escrow for the given resource. */
	public native float kbEscrowGetAmount(int escrowID, int resourceID);
	/** Removes all credits (and puts them into the root escrow) of the given resource type from the given escrow. */
	public native bool kbEscrowFlush(int escrowID, int resourceID, bool flushChildren);
	/** Reallocates the current resource stockpile into the escrows. */
	public native bool kbEscrowAllocateCurrentResources();
	
	//hide constructor
	private Escrow() {}
}
