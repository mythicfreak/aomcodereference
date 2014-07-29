package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Object Definitions.</p>
 * 
 * <p>Object Definitions are used to place objects on the map.</p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class ObjectDef {
	/**Set the maximum distance for the object definition (in meters).*/  
	public native void rmSetObjectDefMaxDistance(int defID, float dist);

	/**Set the minimum distance for the object definition (in meters).*/ 
	public native void rmSetObjectDefMinDistance(int defID, float dist);
	
	/**Add specified constraint to given object def.*/ 
	public native bool rmAddObjectDefConstraint(int defID, int constraintID);

	/**Add item to object definition.*/ 
	public native void rmAddObjectDefItem(int defID, string unitName, int count, float clusterDistance);

	/**Add given object def to specified class.*/  
	public native bool rmAddObjectDefToClass(int objectDefID, int classID);
	
	/**Creates an object definition. Returns its ID. */
	public native int rmCreateObjectDef(string name);
	
	/**Returns the number of units placed by this objectDefID.*/
	public native int rmGetNumberUnitsPlaced(int objectDefID);
	
	/**Returns a unit ID that was placed by the objectDefID.*/
	public native int rmGetUnitPlaced(int objectDefID, int index);

	/**Returns the unit ID of a given player that was placed by the objectDefID.*/
	public native int rmGetUnitPlacedOfPlayer(int objectDefID, int playerID);
	
	/**Place object definition for the player at the given area's location.*/
	public native void rmPlaceObjectDefAtAreaLoc(int defID, int playerID, int areaID, long placeCount);

	/**Place object definition at specific location for given player.*/
	public native void rmPlaceObjectDefAtLoc(int defID, int playerID, float xFraction, float zFraction, long placeCount);

	/**Place object definition for the player at the location of a random area in the given class.*/
	public native void rmPlaceObjectDefAtRandomAreaOfClass(int defID, int playerID, int classID, long placeCount);

	/**Place object definition for the player in the given area.*/
	public native void rmPlaceObjectDefInArea(int defID, int playerID, int areaID, long placeCount);

	/**Place object definition for the player in a random area in the given class.*/
	public native void rmPlaceObjectDefInRandomAreaOfClass(int defID, int playerID, int classID, long placeCount);

	/**Place object definition per player.*/
	public native void rmPlaceObjectDefPerPlayer(int defID, bool playerOwned, long placeCount);
	
	/**If off, some objects placed will automatically convert to Mother Nature. (e.g. gold mines).*/
	public native void rmSetIgnoreForceToGaia(bool val);
	
	private ObjectDef() {}
}
