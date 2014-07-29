package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Areas and Locations on the map in general.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Area {
	//Area Types:
	public final int cAreaTypeForest=1;
	public final int cAreaTypeWater=2;
	public final int cAreaTypeImpassableLand=3;
	public final int cAreaTypeGold=4;
	public final int cAreaTypeSettlement=5;

	//AreaGroup Types:
	public final int cAreaGroupTypeLand=0;
	public final int cAreaGroupTypeWater=1;
	
	/** Returns the center vector of the map. */
	public native vector kbGetMapCenter();
	/** Returns the X size of the map. */
	public native float kbGetMapXSize();
	/** Returns the Z size of the map. */
	public native float kbGetMapZSize();
	/** Returns the location of the main town. */
	public native vector kbGetTownLocation();
	/** Returns the area ID of the main town. */
	public native int kbGetTownAreaID();
	/** Sets the location of the main town. */
	public native bool kbSetTownLocation(vector location);
	/** Returns true if the location is currently visible to the player. */
	public native bool kbLocationVisible(vector location);
	/** Returns the visible area group that matches the given criteria. */
	public native int kbFindAreaGroup(int groupType, float surfaceAreaRatio, int compareAreaID);
	/** Returns the visible area group that matches the given criteria. */
	public native int kbFindAreaGroupByLocation(int groupType, float relativeX, float relativeZ);
	/** Creates areas and area groups. <b>Call this functions before any other call that needs areas</b>. */
	public native void kbAreaCalculate();
	/** Returns the number of areas. */
	public native int kbAreaGetNumber();
	/** Returns the ID of the given area. */
	public native int kbAreaGetIDByPosition(vector position);
	/** Returns the ID of the given area group. */
	public native int kbAreaGroupGetIDByPosition(vector position);
	/** Returns the center of the given area. */
	public native vector kbAreaGetCenter(int areaID);
	/** Returns the number of tiles in the given area. */
	public native int kbAreaGetNumberTiles(int areaID);
	/** Returns the number of black tiles in the given area. */
	public native int kbAreaGetNumberBlackTiles(int areaID);
	/** Returns the number of visible tiles in the given area. */
	public native int kbAreaGetNumberVisibleTiles(int areaID);
	/** Returns the number of fog tiles in the given area. */
	public native int kbAreaGetNumberFogTiles(int areaID);
	/** Returns the game time of the last visibility change for the given area. */
	public native int kbAreaGetVisibilityChangeTime(int areaID);
	/** Returns the number of units in the given area. */
	public native int kbAreaGetNumberUnits(int areaID);
	/** Returns the Unit ID of the index'th unit in the given area. */
	public native int kbAreaGetUnitID(int areaID, long index);
	/** Returns the number of border areas for the given area. */
	public native int kbAreaGetNumberBorderAreas(int areaID);
	/** Returns the Area ID of the index'th border area in the given area. */
	public native int kbAreaGetBorderAreaID(int areaID, long index);
	/** Returns the Type of area. */
	public native int kbAreaGetType(int areaID);
	/** Returns the Area ID of the best area to gather the given unit type. */
	public native int kbAreaFindBestGatherAreaID(int unitTypeID);
	/** 
	 * Returns the Area ID of the closest area, of the given types, to given position. 
	 * @note Yes, that's an official typo right there.
	 */
	public native int kbAreaGetClosetArea(vector position, int areaType, int areaType1, float minDistance);
	
	//hide constructor
	private Area() {}
}
