package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Paths and Attack Routes.
 * Paths are used by the AI to find its way throughout the map, launch attacks etc...
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Path {
	//Transport PathTypes:
	public final int cTransportPathTypePoints=0;
	public final int cTransportPathTypeAreas=1;
	
	//Attack Routes:
	public final int cAttackRouteFrontRight=0;
	public final int cAttackRouteRightFront=1;
	public final int cAttackRouteRightBack=2;
	public final int cAttackRouteBackRight=3;
	public final int cAttackRouteBackLeft=4;
	public final int cAttackRouteLeftBack=5;
	public final int cAttackRouteLeftFront=6;
	public final int cAttackRouteFrontLeft=7;
	
	/** Creates a path with the given name. */
	public native int kbPathCreate(string name);
	/** Destroys the given path. */
	public native bool kbPathDestroy(int pathID);
	/** Returns the number of paths. */
	public native int kbPathGetNumber();
	/** Returns the index'th path ID. */
	public native int kbPathGetIDByIndex(long index);
	/** Returns the name of the given path. */
	public native string kbPathGetName(int pathID);
	/** Returns the length of the given path. */
	public native float kbPathGetLength(int pathID);
	/** Returns the number of waypoints in the given path. */
	public native int kbPathGetNumberWaypoints(int pathID);
	/** Adds the waypoint to the given path. */
	public native bool kbPathAddWaypoint(int pathID, vector waypoint);
	/** Returns the appropriate waypoint from the given path. */
	public native vector kbPathGetWaypoint(int pathID, long waypointNumber);
	/** Returns true if the given unit type can path from pointA to pointB. */
	public native bool kbCanSimPath(vector pointA, vector pointB, long protoUnitTypeID, float range);
	/** Returns true if the given unit type can path from pointA to pointB. */
	public native bool kbCanPath2(vector pointA, vector pointB, long protoUnitTypeID, float range);
	/** Returns the Route ID if successful. */
	public native int kbCreateAttackRoute(string name, int startAreaID, int goalAreaID, int numInitialRoutes);
	/** Returns the Route ID if successful. */
	public native int kbCreateAttackRouteWithPath(string name, vector startPt, vector endPt);
	/** Returns true if the route was deleted. */
	public native bool kbDestroyAttackRoute(int routeID);
	/** Add a new sector to path to. */
	public native bool kbAddAttackRouteSector(int sector);
	/** Ignore this area when finding the route. */
	public native bool kbAddAttackRouteIgnoreID(int ignoreAreaID);
	/** Ignore this area type when finding the route. */
	public native bool kbAddAttackRouteIgnoreType(int ignoreAreaTypeID);
	/** Returns true if path was added to attack route. */
	public native bool kbAttackRouteAddPath(int attackRouteID, int pathID);
	/** Find all the paths to the sector specified. */
	public native bool kbMakeAttackRoutes();
	/** Returns the number of paths from start to goal area. */
	public native int kbGetNumAttackRoutes(long startAreaID, long goalAreaID);
	/** Returns the id of the routes from area1 to area2. */
	public native int kbGetAttackRouteID(long startAreaID, long goalAreaID);
	
	//hide constructor
	private Path() {}
}
