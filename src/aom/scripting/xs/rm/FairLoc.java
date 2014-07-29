package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Fair Locations.</p>
 * <p>
 * These special commands are designed to place critical resources, 
 * such as Settlements and sometimes Gold Mines. 
 * They are expensive and slow, so should not be used for many objects, 
 * but can insure that objects that "must place" are present on a map.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class FairLoc {
	/**Adds some fairLoc placement info.*/ 
	public native int rmAddFairLoc(string unitName, bool forward, bool inside, float minPlayerDist, float maxPlayerDist, float locDist, float edgeDist, bool playerArea, bool teamArea);

	/**Add specified constraint to a fairLoc placement.*/ 
	public native bool rmAddFairLocConstraint(int fairLocID, int constraintID);
	
	/**Gets a player's fairLoc x fraction.*/
	public native float rmFairLocXFraction(int playerID, int index);

	/**Gets a player's fairLoc z fraction.*/
	public native float rmFairLocZFraction(int playerID, int index);

	/**Gets a player's number of fairLocs.*/
	public native int rmGetNumberFairLocs(int playerID);
	
	/**Places down a fairLoc and returns whether or not it was succesful.*/
	public native bool rmPlaceFairLocs();
	
	/**Resets fairLoc placement info.*/
	public native void rmResetFairLocs();
	
	private FairLoc() {}
}
