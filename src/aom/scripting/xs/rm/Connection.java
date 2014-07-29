package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Connections.</p>
 * 
 * <p>
 * Connections are special areas that are used to connect other areas.
 * They are typically used to place land-bridges or mountain-passes among players.
 * Connections must be placed after the areas they are trying to connect, 
 * but often need to be defined before those areas if the area needs the rmAddConnectionArea command.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Connection {
	/**
	 * Adds an area to the connection. This is only valid if you set the connection type is set to cConnectAreas. 
	 * You must specify this while defining the area, after the connection is defined, and before building the connection.
	 */ 
	public native void rmAddConnectionArea(int connectionID, int areaID);

	/**Add specified constraint to a connection.*/  
	public native bool rmAddConnectionConstraint(int connectionID, int constraintID);

	/**Add specified constraint for a connection end point.*/ 
	public native bool rmAddConnectionEndConstraint(int connectionID, int constraintID);

	/**Add specified constraint for a connection start point.*/
	public native bool rmAddConnectionStartConstraint(int connectionID, int constraintID);

	/**Adds a terrain replacement rule to the connection.*/ 
	public native void rmAddConnectionTerrainReplacement(int connectionID, string terrainTypeName, string newTypeName);

	/**Adds the connection to specified class.*/  
	public native void rmAddConnectionToClass(int connectionID, int classID);
	
	/**Builds the given connection.*/
	public native void rmBuildConnection(int connectionID);
	
	/**Creates an connection.*/
	public native void rmCreateConnection(string name);
	
	/**Sets the base height of a connection.*/  
	public native void rmSetConnectionBaseHeight(int connectionID, float width);

	/**Sets the base terrain cost for a connection.*/  
	public native void rmSetConnectionBaseTerrainCost(int connectionID, float cost);

	/**Sets area coherence (0.0-1.0).*/  
	public native void rmSetConnectionCoherence(int connectionID, float width);

	/**Sets how smoothly connection height blends into surroundings.*/  
	public native void rmSetConnectionHeightBlend(int connectionID, float width);

	/**
	 * Sets the position variance of a connection. The connection will normally start at the area's position, but this allows it to vary from that position.
	 * You can set this to -1 for it to pick completely random positions within the starting and ending areas. 
	 * This command is often needed when specifying multiple connections (for example, one within a team and another between teams) so that the connections do not overlap.
	 */
	public native void rmSetConnectionPositionVariance(int connectionID, float variance);

	/**Sets connection edge smoothing distance (distance is number of neighboring points to consider in each direction).*/  
	public native void rmSetConnectionSmoothDistance(int connectionID, float width);

	/**Sets the terrain cost for a connection.*/ 
	public native void rmSetConnectionTerrainCost(int connectionID, string terrainTypeName, float cost);

	public final int cConnectAreas;
	public final int cConnectPlayers;
	public final int cConnectAllies;
	public final int cConnectEnemies;
	
	/**
	 * Sets the connection type.
	 * @param connectionType This command determines which players are connected. The valid values are: 
	 * <li>cConnectAreas: This is the default that is used if you don't call rmSetConnectionType. You have to specify each area to be connected by calling rmAddConnectionArea().</li> 
	 * <li>cConnectPlayers: Connect all player areas.</li>
	 * <li>cConnectAllies: Connect all ally player areas.</li> 
	 * <li>cConnectEnemies: Connect enemy player areas.</li>
	 * 
	 * @param connectAll Set this parameter to true if you want all of the areas to get connected to all of the other areas.
	 * Set it to false to have the areas connected sequentially where the first area gets connected to the second area, 
	 * the second area gets connected to the third area, etc.
	 * 
	 * @param connectPercentage You can use this parameter to reduce the number of connections that are generated.
	 * For example, if you set it to 0.5, then half of the connections will get generated. The ones that are generated are randomly chosen. 
	 * Some ES maps with connections connect all players when player number is small (<6) and uses a connection percentage on larger maps, 
	 * otherwise so many connections can get placed that the barrier (like water or rock) is obscured.
	 */ 
	public native void rmSetConnectionType(int connectionID, int connectionType, bool connectAll, float connectPercentage);

	/**Sets whether a connection warns on failure.*/  
	public native void rmSetConnectionWarnFailure(int connectionID, bool warn);

	/**Sets the width of a connection.*/ 
	public native void rmSetConnectionWidth(int connectionID, float width, float variance);

	private Connection() {
		cConnectAllies = -1;
		cConnectAreas = -1;
		cConnectEnemies = -1;
		cConnectPlayers = -1;
	}
}
