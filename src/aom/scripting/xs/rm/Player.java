package aom.scripting.xs.rm;

import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Players.</p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Player {
	/**
	 * Adds to a player's resource amount.
	 * @param resourceName 
	 * <ul>
	 * <li>"food"</li>
	 * <li>"wood"</li>
	 * <li>"gold"</li>
	 * <li>"favor"</li>
	 * </ul>
	 */  
	public native void rmAddPlayerResource(int playerID, string resourceName, float amount);
	
	/**Gets the number of players on the given team*/
	public native int rmGetNumberPlayersOnTeam(int teamID);

	/**
	 * Gets the civilization of the specified player.
	 * 
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivZeus
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivHades
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivPoseidon
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivIsis
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivRa
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivSet
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivLoki
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivThor
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivOdin
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivGaia
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivKronos
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivOuranos
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivGreek
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivNorse
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivEgyptian
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivAtlantean
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivRandom
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCivNature
	 */
	public native int rmGetPlayerCiv(int playerID);

	/**
	 * Gets the culture of the specified player.
	 * 
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCultureGreek
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCultureEgyptian
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCultureNorse
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCultureAtlantean
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#cCultureNature
	 */
	public native int rmGetPlayerCulture(int playerID);

	/**Gets a player's nickname.*/
	public native string rmGetPlayerName(int playerID);

	/**Gets the team the specified player is on.*/
	public native int rmGetPlayerTeam(int playerID);
	
	/**
	 * Sets one player location. You can use this to place players anywhere.
	 * Once a player is placed, it won't be repositioned by any future calls to the various rmPlacePlayers functions.
	 */
	public native void rmPlacePlayer(int playerID, float xFraction, float zFraction);

	/**
	 * Makes a circle of player locations. Places players in a circle. 
	 * Variation is determined by the difference between the min and max. 
	 * Angle variation determines whether players are equidistant or can be slightly closer or farther apart.
	 */
	public native void rmPlacePlayersCircular(float minFraction, float maxFraction, float angleVariation);

	/**
	 * Makes a line of player locations. Sometimes you will want players to be placed in a line.
	 * Anatolia places each team on a line, while Vinlandsaga places all players in a line. 
	 * Using a line placement is not easy because there may not be enough room for player areas or resources. 
	 * X and Z determine the starting and ending locations of the line.
	 * DistVariation determines how far from the line player areas can vary, and spacingVariation determines how much space there is among points along the line where players are placed.
	 */
	public native void rmPlacePlayersLine(float x1, float z1, float x2, float z2, float distVariation, float spacingVariation);

	/**
	 * Makes a square of player locations. Places players in a square, which automatically adjusts to a rectangle for rectangular maps.
	 * Unlike the circle, variance here is determined by a plus or minus (the distVariation) off of the mean distance. 
	 * SpacingVariation determines whether players are equidistant or can be slightly closer or farther apart.
	 */
	public native void rmPlacePlayersSquare(float dist, float distVariation, float spacingVariationfloat);

	/**Gets a player's start location x fraction.*/
	public native void rmPlayerLocXFraction(int playerID);

	/**Gets a player's start location z fraction.*/
	public native void rmPlayerLocZFraction(int playerID);
	
	/**
	 * When placing players in a circle or square, this command allows you to skip part of the circle or square, 
	 * in essence removing a slice from the pie (maybe you want to fit an ocean in there like in Sea of Worms).
	 * The default for fromPercent is 0, and the default for toPercent is 1. That means use the whole circle or square. 
	 * You can pass in something like 0.25 and 0.50 to have the players placed from 25% in to 50% in along the circle or square.
	 * For circular placement, 0 is at 9h00, 0.25 is at 12h00, 0.5 is at 3h00, and 0.75 is at 6h00.
	 * For square placement (think of the square as a line that follows a square), 0 is at 6h00, 0.25 is at 9h00, 0.5 is at 12h00, and 0.75 is at 3h00.
	 */  
	public native void rmSetPlacementSection(float fromPercent, float toPercent);

	/**
	 * Sets the team to place. Use this before calling the various rmPlacePlayers functions, 
	 * and only players on the specified team will get placed. Remember: the first teamID is 0, the second is 1, etc.
	 * Pass in -1 for the teamID to place all teams (or actually all players that haven't been placed yet).
	 */ 
	public native void rmSetPlacementTeam(int teamID);

	/**Sets a player's 'official' area.*/ 
	public native void rmSetPlayerArea(int playerID, int areaID);

	/**Manually sets a player's starting location.*/ 
	public native void rmSetPlayerLocation (int playerID, float xFraction, float zFraction);

	/** 
	 * Sets the area of the map to use for player placement.
	 * Use this command if, for example, you want to place players in one quadrant of a map.
	 */ 
	public native void rmSetPlayerPlacementArea(float minX, float minZ, float maxX, float maxZ);

	/**
	 * Sets a player's resource amount.
	 * @param resourceName 
	 * <ul>
	 * <li>"food"</li>
	 * <li>"wood"</li>
	 * <li>"gold"</li>
	 * <li>"favor"</li>
	 * </ul>
	 */  
	public native void rmSetPlayerResource(int playerID, string resourceName, float amount);
	
	/**Sets a team's 'official' area.*/  
	public native void rmSetTeamArea(int teamID, int areaID);

	/**
	 * Sets the team spacing modifier. Normally, all players are placed equidistant. 
	 * This command allows you to force team members closer together. 
	 * Values of 0.3-0.5 return the best results. 
	 * Values less than 0.25 may not provide enough space for starting resources.
	 */
	public native void rmSetTeamSpacingModifier(float modifier);
	
	/**
	 * Multiplies a player's resource amount by the given factor.
	 * @param resourceName 
	 * <ul>
	 * <li>"food"</li>
	 * <li>"wood"</li>
	 * <li>"gold"</li>
	 * <li>"favor"</li>
	 * </ul>
	 */  
	public native void rmMultiplyPlayerResource(int playerID, string resourceName, float factor);
	
	private Player() {}
}
