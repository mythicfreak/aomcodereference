package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Areas.</p>
 * 
 * <p>
 * Areas are regions on a map.
 * They are often irregular in shape, but can be rectangular as well.
 * Some areas are used for placing specific terrain, like a cliff or ocean, 
 * while others are just used as boundaries for other areas.
 * Special types of areas are player areas, which belong to a certain player, 
 * or team areas, which belong to a team.
 * Saying these areas "belong" is just a convenient method 
 * of making sure other areas or objects are placed in that area.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Area {
	/**Adds a class for an area's cliff edge to avoid.*/
	public native void rmAddAreaCliffEdgeAvoidClass(int areaID, int avoidID, float minDist);

	/**Add specified constraint to an area.*/  
	public native bool rmAddAreaConstraint(int areaID, int constraintID);

	/**Adds an area influence point.*/  
	public native void rmAddAreaInfluencePoint(int areaID, float xFraction, float zFraction);

	/**
	 * Adds an area influence segment. You may want an area to grow towards specific points or lines.
	 * A circular area placed at the center of the map with an influence point of 1, 1 will produce a peninsula that protrudes towards 12 o’clock. 
	 * Influence points and segments can be useful in getting areas, such as rivers, to extend beyond the edge of the map. 
	 */
	public native void rmAddAreaInfluenceSegment(int areaID, float xFraction1, float zFraction1, float xFraction2, float zFraction2);

	/**
	 * Add an unit type that the specified area removes.
	 * Sometimes you may want an area to clean itself of objects, such as removing trees from ice.
	 * This will only work if the objects are already placed before the area, which is the reverse of how most ES maps are generated.
	 * You can reference specific units or abstract types, such as "unit" and "building."
	 */
	public native void rmAddAreaRemoveType(int areaID, string typeName);

	/**
	 * Adds a terrain layer to an area. Terrain layers allow you to place a border of one or more textures around an area.
	 * For example, you can have grassDirt50 and grassDirt75 around an area of grass. You can specify multiple layers for an area, 
	 * as long as the minDistance for one starts where the maxDistance for another leaves off. 
	 * Because different textures overlap one another you may need to experiment with distances to get a good effect.
	 * Here is an example:
	 * <code>
	 * rmSetAreaTerrainType(areaID, "GrassA");
	 * rmAddAreaTerrainLayer(areaID, "SnowGrass75", 13, 20);
	 * rmAddAreaTerrainLayer(areaID, "SnowGrass50", 6, 13);
	 * rmAddAreaTerrainLayer(areaID, "SnowGrass25", 0, 6);
	 * </code>
	 */
	public native void rmAddAreaTerrainLayer(int areaID, string terrain, float minDist, float maxDist);

	/**Adds a terrain replacement rule to the area. If you place an area with no terrain specified, it will use the terrain of the parent area (including the base map).
	 * However, specifying terrain replacement will paint an area only when another texture is present.
	 * This command is most useful with connections, where you want to replace water with land where a connection goes across a river, or replace rock with snow for mountain passes.
	 */
	public native void rmAddAreaTerrainReplacement(int areaID, string terrainTypeName, string newTypeName);

	/**Add given area to specified class.*/
	public native bool rmAddAreaToClass(int areaID, int classID);
	
	/**Gets the area ID for given area name.*/
	public native int rmAreaID(string name);
	
	/**
	 * Simultaneously builds all unbuilt areas. This does not include connections.
	 * @see #rmBuildArea(int)
	 */
	public native void rmBuildAllAreas();

	/**
	 * Builds the specified area. Actually builds the area.
	 * Choosing when to use this command can have a big effect on your map. 
	 * For example, if you place each player area one by one, the first few will have enough room to build,
	 * but if after 11 areas, area 12 still needs to be placed, it might have run out of space because the others were to greedy.
	 * To avoid this, build all player area's at the same time, so that the script can try to find a fair balance between all areas.
	 * @see #rmBuildAllAreas()
	 */
	public native void rmBuildArea(int areaID);
	
	/**Creates an area and returns the areaID.*/
	public native int rmCreateArea(string name, int parentAreaID);
	
	/**Paints the terrain for a specified area.*/
	public native void rmPaintAreaTerrain(int areaID);
	
	/**Sets the base height for an area.*/
	public native void rmSetAreaBaseHeight(int areaID, float height);

	/**
	 * Set cliff edge parameters for an area. Determines whether there should be pathable ramps or not connecting the top of the cliff to the surrounding area. 
	 * @param count Number of cliff edges to create. The count times the size should not be more than 1.0. Defaults to 1. 
	 * @param size This specifies how much of the area's outline should be turned into cliff edges. It should be between 0.0 and 1.0. Set to 1.0 to make the whole area surrounded. Defaults to 0.5. 
	 * @param variance The variance to use for the size. Defaults to 0.0. 
	 * @param spacing Spacing modifier. This should be between 0.0 and 1.0. The smaller this is, the closer together the cliff edges will be. Defaults to 1.0. 
	 * @param mapEdge Specifies where the cliff edge should be in relation to the map edge. Set to 0 for any, 1 to be away from the map edge, or 2 to be close to the map edge. Defaults to 0.
	 */
	public native void rmSetAreaCliffEdge(int areaID, int count, float size, float variance, float spacing, int mapEdge);

	/**
	 * Set an area's cliff height.
	 * @param val Make positive for raised cliffs and negative for lowered cliffs. Defaults to 4.0.
	 * @param variance The variance to use for the height.
	 * @param ramp This is used to determine how quickly the height ramps up to the cliff height (it refers to steepness in this context, not pathable ramps to reach the top of a cliff). Defaults to 0.5.
	 */
	public native void rmSetAreaCliffHeight(int areaID, float val, float variance, float ramp);

	/**
	 * Set cliff painting options for an area.
	 * Determines how a cliff is painted with impassable and passable textures.
	 * @param paintGround Specifies if the ground should be painted or just left whatever it already is. Defaults true.
	 * @param paintSide Specifies if the cliff sides should be painted. Defaults true.
	 * @param paintOutsideEdge Specifies if the outside cliff edge should be painted. This is the area between the cliff side and the ground. Defaults true.
	 * @param minSideHeight Specifies the minimum height that a cliff tile must be sloped before treating it as a cliff side. Set to 0 to have the minimum amount of cliff sides painted. Defaults to 1.5.
	 * @param paintInsideEdge Specifies if the inside cliff edge should be painted. This is the area between the cliff side and the ground. Defaults true.
	 */
	public native void rmSetAreaCliffPainting(int areaID, bool paintGround, bool paintOutsideEdge, bool paintSide, float minSideHeight, bool paintInsideEdge);

	/**Sets the cliff type for an area.*/
	public native void rmSetAreaCliffType(int areaID, string cliffName);

	/**Sets area coherence (0-1).*/
	public native void rmSetAreaCoherence(int areaID, float coherence);

	/**Sets the forest type for an area.*/
	public native void rmSetAreaForestType(int areaID, string forestName);

	/**
	 * Sets how smoothly area height blends into surroundings. Corresponds to the smooth tool in the Scenario Editor. 
	 * Usually a heightBlend of 0 will leave geometric-looking jagged edges. A heightBlend of 1 will smooth smaller areas.
	 * A heightBlend of 2 will smooth larger areas or areas of disproportionate heights. Anything above 2 may flatten an area completely.
	 */
	public native void rmSetAreaHeightBlend(int areaID, int heightBlend);

	/**Set the area location.*/
	public native void rmSetAreaLocation(int areaID, float xFraction, float zFraction);

	/**Set the area location to player's location.*/ 
	public native void rmSetAreaLocPlayer(int areaID, int playerID);

	/**Set the area location to team's location.*/  
	public native void rmSetAreaLocTeam(int areaID, int teamID);

	/**Sets maximum blob distance.*/  
	public native void rmSetAreaMaxBlobDistance(int areaID, float dist);

	/**Sets maximum number of area blobs. An area can be placed with multiple blobs. Blobs are placed independently, using the minimum and maximum distances below. 
	 * Areas made with a single blob will be circular. Areas made with multiple blobs can be come long and sinuous.*/  
	public native void rmSetAreaMaxBlobs(int areaID, int blobs);

	/**Sets minimum blob distance.*/  
	public native void rmSetAreaMinBlobDistance(int areaID, float dist);

	/**Sets minimum number of area blobs.*/  
	public native void rmSetAreaMinBlobs(int areaID, int blobs);

	/**Set the area size to a min/max fraction of the map.*/  
	public native void rmSetAreaSize(int areaID, float minFraction, float maxFraction);

	/**Sets area edge smoothing distance (distance is number of neighbouring points to consider in each direction).*/
	public native void rmSetAreaSmoothDistance(int areaID, int smoothDistance);

	/**Specifies if the area should vary the terrain layer edges. Usually, variance in terrain layers looks better, 
	 * but sometimes you might want to turn it off. Defaults to true.*/ 
	public native void rmSetAreaTerrainLayerVariance(int areaID, bool variance);

	/**
	 * Sets the terrain type for an area.
	 * Even if your area does not place special terrain, 
	 * it can be helpful to temporarily paint the area with a distinct texture, 
	 * such as "Black" or "SnowA", to see where and if it is actually getting placed.
	 */  
	public native void rmSetAreaTerrainType(int areaID, string terrainTypeName);

	/**
	 * Sets whether the area build process will warn if it fails. 
	 * It is very easy to over-constrain areas to the point where there is no room for them.
	 * This can cause two problems: the map may take a long time to generate, or if you are in debug mode, 
	 * the debugger will pop up and generation will stop. 
	 * Sometimes you want to catch these errors, 
	 * but when you are done with your map it is a good idea to set SetAreaWarnFailure to false.
	 *
	 */
	public native void rmSetAreaWarnFailure(int areaID, bool warn);

	/**Sets the water type for an area.*/  
	public native void rmSetAreaWaterType(int areaID, string waterName);
	
	private Area() {}
}
