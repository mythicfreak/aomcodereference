package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Constraints.</p>
 * 
 * <p>
 * Constraints are used for areas, connections, and objects. 
 * They make sure that objects avoid other objects, 
 * that objects are placed near certain areas and similar restrictions.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Constraint {
	/**Gets constraint ID for given constraint name.*/
	public native int rmConstraintID(string name);
	
	/**Make a constraint that forces something to remain within an area. Returns its ID.*/
	public native int rmCreateAreaConstraint(string name, int areaID);

	/**Make a constraint that forces something to stay away from an area. Returns its ID.*/
	public native int rmCreateAreaDistanceConstraint(string name, int areaID, float distance);

	/**Make a constraint that forces something to remain within a given distance from the areaID. Returns its ID.*/
	public native int rmCreateAreaMaxDistanceConstraint(string name, int areaID, float distance);

	/**Make an area overlap constraint. This prevents areas from overlapping. Returns its ID.*/
	public native int rmCreateAreaOverlapConstraint(string name, int areaID);
	
	/**Make a box constraint and forces something to remain in it. Returns its ID.*/
	public native int rmCreateBoxConstraint(string name, float startX, float startZ, float endX, float endZ, float bufferFraction);

	/**Make a class distance constraint taht forces something to stay away from everything in the given class. Returns its ID.*/
	public native int rmCreateClassDistanceConstraint(string name, int classID, float distance);

	/**Make a constraint that forces something to remain within an area's cliff edge. Returns its ID.*/
	public native int rmCreateCliffEdgeConstraint(string name, int areaID);

	/**Make an area cliff edge distance constraint. Returns its ID.*/
	public native int rmCreateCliffEdgeDistanceConstraint(string name, int areaID, float distance);

	/**Make an area cliff edge max distance constraint. Returns its ID.*/
	public native int rmCreateCliffEdgeMaxDistanceConstraint(string name, int areaID, float distance);

	/**Make a constraint that forces something to remain within an area's cliff ramp edge. Returns its ID.*/
	public native int rmCreateCliffRampConstraint(string name, int areaID);

	/**Make an area cliff ramp edge distance constraint. Returns its ID.*/
	public native int rmCreateCliffRampDistanceConstraint(string name, int areaID, float distance);

	/**Make an area cliff ramp edge max distance constraint. Returns its ID.*/
	public native int rmCreateCliffRampMaxDistanceConstraint(string name, int areaID, float distance);
	
	/**Make a constraint that forces something to remain within an area's edge. Returns its ID.*/
	public native int rmCreateEdgeConstraint(string name, int areaID);

	/**Make an area edge distance constraint and returns its ID*/
	public native int rmCreateEdgeDistanceConstraint(string name, int areaID, float distance);

	/**Make an area edge max distance constraint. Returns its ID.*/
	public native int rmCreateEdgeMaxDistanceConstraint(string name, int areaID, float distance);
	
	/**Make a constraint to avoid terrain with certain a passability.*/
	public native int rmCreateTerrainDistanceConstraint(string name, string type, bool passable, float distance);

	/**Make a constraint to be close to terrain with certain a passability.*/
	public native int rmCreateTerrainMaxDistanceConstraint(string name, string type, bool passable, float distance);
	
	/**Make a type distance constraint.*/
	public native int rmCreateTypeDistanceConstraint(string name, int classID, float distance);
	
	private Constraint()
	{
		
	}
}
