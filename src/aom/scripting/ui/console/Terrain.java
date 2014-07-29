package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Terrains, Areas and related tools.
 * 
 * @local Terrain commands are all local.
 * 
 * @editor Terrain commands all require Editor Mode.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Terrain {
	private Terrain() {}
	
	/** Increments the area to render.*/
	public native void areaIncrementAreaToRender(int playerID);
	
	/** Filters the entire terrain.*/
	public native void terrainFilter();

	/** Filters a sub-area of the terrain.*/
	public native void terrainFilterArea(int X1,int Y1,int X2,int Y2);

	/** Flattens the entire terrain.*/
	public native void terrainFlatten();

	/** Flattens a sub-area of the terrain.*/
	public native void terrainFlattenArea(int X1, int Y1, int X2, int Y2);

	/** Sets the terrain type to paint.*/
	public native void terrainSetType(int type);

	/** Sets the terrain subtype to paint.*/
	public native void terrainSetSubtype(int type);

	/** Paint whole terrain with given texture.*/
	public native void terrainPaint();

	/** Paint whole terrain with given mix name.*/
	public native void terrainPaintMix();

	/** Set terrain ambient reflectivity to the given RGB (0-255)*/
	public native void terrainAmbient(int r, int g, int b);

	/** Get terrain ambient reflectivity.*/
	public native void terrainGetAmbient();

	/** Resize current terrain subtype.*/
	public native void terrainResizeSubtype(int delta);

	/** Adjusts (raise/lower) the terrain height by the specified meters.*/
	public native void terrainAdjustGlobalHeight(float meters);

	/** Saves the current terrain paste buffer.*/
	public native void terrainPasteBufferSave(string filename);

	/** Loads a terrain paste buffer.*/
	public native void terrainPasteBufferLoad(string filename);
	
	/** Indicates that the increase texture density button has gone up/down.*/
	public native void uiIncreaseTextureDensity(int keyState);

	/** Indicates that the decrease texture density button has gone up/down.*/
	public native void uiDecreaseTextureDensity(int keyState);

	/** Indicates that the change elevation to sample button has gone up/down.*/
	public native void uiChangeElevationToSample(int keyState);

	/** Samples elevation height at pointer.*/
	public native void uiSampleElevationAtPointer();

	/** Samples C lift elevation height at pointer.*/
	public native void uiSampleCliffElevationAtPointer();

	/** Indicates that the sample terrain button has gone up/down.*/
	public native void uiPaintTerrainToSample(int keyState);

	/** Samples terrain type at pointer.*/
	public native void uiSampleTerrainAtPointer();

	/** Indicates that the raise elevation button has gone up. down.*/
	public native void uiRaiseElevation(int keyState);

	/** Indicates that the l o we r elevation button has gone up. down.*/
	public native void uiLowerElevation(int keyState);

	/** Indicates that the smooth button has gone up. down.*/
	public native void uiSmooth(int keyState);

	/** Indicates that the paint water button has gone up/down.*/
	public native void uiPaintWater(int keyState);

	/** Painting water area.*/
	public native void uiPaintWaterArea(int keyState);

	/** Indicates that the paint cliff button has gone up/down.*/
	public native void uiPaintCliff(int keyState);

	/** Indicates that the terrain selection button has gone up/down.*/
	public native void uiTerrainSelection(int keyState);

	/** Indicates that the raise terrain selection button has gone up/down.*/
	public native void uiRaiseTerrainSelection(int keyState);

	/** Indicates that the lower terrain selection button has gone up/down.*/
	public native void uiLowerTerrainSelection(int keyState);

	/** F latte n the current terrain selection.*/
	public native void uiFlattenTerrainSelection();

	/** Filter the current terrain selection.*/
	public native void uiFilterTerrainSelection();
	
	/** Indicates that the roughen button has gone up/down.*/
	public native void uiRoughen(int keyState);
	
	/** Indicates that the paint button has gone up/down.*/
	public native void uiPaint(bool paint, bool absolute);

	/** Indicates that the paint terrain overlay button has gone up/down.*/
	public native void uiPaintTerrainOverlay(int keyState);

	/** Removes the painted terrain overlay at the given mouse position.*/
	public native void uiRemoveTerrainOverlay();

	/** Sets the terrain overlay color to the given (R,G,B) color. */
	public native void uiSetTerrainOverlayColor(float r, float g, float b);
	
	/** Flattens terrain and paints water over the entire map.*/
	public native void uiCoverTerrainWithWater(float waterHeight, float depth, string waterName);

	/** Sets the cliff type by name.*/
	public native void uiSetCliffType(string cliffName);

	/** Sets the cliff type by index.*/
	public native void uiSetCliffTypeNum(long cliffType);

	/** Sets the water type by name.*/
	public native void uiSetWaterType(string waterName);

	/** Sets the water type by index.*/
	public native void uiSetWaterTypeNum(long waterType);

	/** Sets the forest type by name.*/
	public native void uiSetForestType(string forestName);

	/** Sets the forest type by index.*/
	public native void uiSetForestJype(long forestType);
	
	/** Paint objects on the currently selected water.*/
	public native void uiPaintWaterObjects();

	/** Indicates that the raise water button has gone up/down.*/
	public native void uiRaiseWater(int keyState);

	/** Indicates that the lower water button has gone up/down.*/
	public native void uiLowerWater(int keyState);

	/** Indicates that the rotate water left button has gone up/down.*/
	public native void rotateWaterLeft(int keyState);

	/** Indicates that the rotate water right button has gone up/down.*/
	public native void rotateWaterRight(int keyState);
	
	/** 
	 * Sets brush size.
	 */
	public native void brushSize(int size);

	/** 
	 * Sets the circular brush size.
	 */
	public native void brushCircularSize(float value);
	
	/**
	 * Makes the current brush based on the name and parameters.
	 */
	public native void uiSetBrushType(string name, float param1, float param2, float param3, float param4);

	/**
	 * Changes the brush to the named type.
	 */
	public native void uiChangeBrushType(string name);

	/**
	 * Changes the size of the current brush.
	 */
	public native void uiChangeBrushSize(float param1, float param2, float param3, float param4);

	/**
	 * Increment the size of the current brush up/down.
	 */
	public native void uiScrollBrushSize();
	
	/**
	 * This is not what you are looking for.
	 */
	public native void uiToggleBrushMask();
}
