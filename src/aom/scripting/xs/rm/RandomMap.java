package aom.scripting.xs.rm;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of RM commands that don't fit in any of the subcategories.
 * 
 * Credits to HyenaStudio's (and M0nTy_PyTh0n in particular) for most of the documentation.
 * 
 * @see <a href="http://hyenastudios.mugamo.com/aomrmstutorial.htm">Hyena Studio's</a>
 * 
 * @local	RMS commands are always executed locally.
 * 			If all players have the same map script, and the same seed is used, 
 * 			the result should be the same for all players. 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public abstract class RandomMap {
	/**
	 * 0 = normal size
	 * 1 = large size
	 */
	public final int cMapSize;
	
	/**
	 * Total number of players, mother nature excluded.
	 */
	public final int cNumberNonGaiaPlayers;
	
	/**
	 * Total number of players, mother nature included.
	 * 
	 * @note cNumberPlayers = cNumberNonGaiaPlayers + 1;
	 */
	public final int cNumberPlayers;
	
	/**
	 * Total number of teams.
	 */
	public final int cNumberTeams;
	
	/**Returns the square root of x. */
	public native void sqrt(float x);

	/**Gets class ID for given class name.*/
	public native int rmClassID(string name);

	/**Define a class with the given name. Classes can group areas or objects together. */
	public native int rmDefineClass(string className);

	/**Define a constant with given name and value.*/
	public native void rmDefineConstant(string name, int value);

	/**Echoes an error string to the debugger output, can not be seen in AoT.*/
	public native void rmEchoError( string echoString, int level );

	/**Echoes an info string to the debugger output, can not be seen in AoT.*/
	public native void rmEchoInfo( string echoString, int level );

	/**Echoes a warning string to the debugger output, can not be seen in AoT.*/
	public native void rmEchoWarning( string echoString, int level );

	/**Gets the sea level for the map.*/
	public native float rmGetSeaLevel();

	/**Returns a random float between min and max.*/
	public native void rmRandFloat(float min, float max);

	/**Returns a random integer between min and max.*/
	public native void rmRandInt(int min, int max);

	/**Sets Gaia's civilization.*/
	public native void rmSetGaiaCiv(long civ) ;

	/**Sets a lighting set.*/ 
	public native void rmSetLightingSet(string name) ;

	/**Sets the size of the map.*/ 
	public native void rmSetMapSize( int x, int z );

	/**Sets the sea level for the map.*/  
	public native void rmSetSeaLevel();

	/**Sets the sea type for the map.  This is used if terrain is initialized to water.*/  
	public native void rmSetSeaType(string name);

	/**Sets the friendly cool loading screen text*/  
	public native void rmSetStatusText(string status, float progress) ;

	/**Initializes the terrain to the base type and height.*/
	public native void rmTerrainInitialize(string baseTerrain, float height);
	
	//hide stuff
	private RandomMap() {
		cMapSize = 0;
		cNumberNonGaiaPlayers = 0;
		cNumberPlayers = 0;
		cNumberTeams = 0;
	}
}