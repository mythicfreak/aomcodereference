package aom.scripting.xs.ai;

import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of AI commands concerning Walls.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Wall {
	private Wall() {}
	
	public final int cWallTypeStraight=0;
	public final int cWallTypeRing=1;
	public final int cWallTypeArea=2;
	
	/** Walls in the given area. */
	public native int aiWallInArea(string name, int areaID, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority);
	/** Walls around all 3 areas at once. */
	public native int aiWallInAreas(string name, int areaID1, int areaID2, int areaID3, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority);
	/** Walls from point a to point b. */
	public native int aiWallFromAToB(string name, vector a, vector b, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority);
	/** Walls a ring around the center, with a given radius. */
	public native int aiWallRingAroundPoint(string name, vector center, float radius, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority);
}
