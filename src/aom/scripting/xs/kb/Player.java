package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;

/**
 * This class provides a collection of KB commands concerning Players.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Player {
	/** Returns the current population for the player. */
	public native int kbGetPop();
	/** Returns the current population cap for the player. */
	public native int kbGetPopCap();
	/** 
	 * Important: use for debugging or manual scenario repair only!
	 * @see aom.scripting.xs.xs.ExternalSubroutines#xsSetContextPlayer(int) xsSetContextPlayer(int playedID)
	 */
	public native void kbForceContextPlayerID();
	/** Returns the civilization ID for the current player. */
	public native int kbGetCiv();
	/** Returns the civilization ID for the given player. */
	public native int kbGetCivForPlayer(int playerID);
	/** Returns the current age for the current player. */
	public native int kbGetAge();
	/** Returns the current age for the player specified. */
	public native int kbGetAgeForPlayer(int id);
	/** Returns the culture for the player. */
	public native int kbGetCulture();
	/** Returns the culture for the given player. */
	public native int kbGetCultureForPlayer(int playerID);
	/** Returns the player's resigned status. */
	public native bool kbIsPlayerResigned(int playerID);
	/** Returns the player's lost status. */
	public native bool kbHasPlayerLost(int playerID);
	/** Returns the player's team number. */
	public native int kbGetPlayerTeam(int playerID);
	/** Returns true if the given player is an enemy. */
	public native bool kbIsPlayerEnemy(int playerID);
	/** Returns true if the given player is a neutral player. */
	public native bool kbIsPlayerNeutral(int playerID);
	/** Returns true if the given player is an ally. */
	public native bool kbIsPlayerAlly(int playerID);
	/** Returns true if the given player is a mutual ally. */
	public native bool kbIsPlayerMutualAlly(int playerID);
	/** Returns the number of mutual allies. */
	public native int kbGetNumberMutualAllies();
	/** Returns true if the given player is a valid player (i.e. it exists in the game). */
	public native bool kbIsPlayerValid(int playerID);
	/** Returns true if the given player is a a human player. */
	public native bool kbIsPlayerHuman(int playerID);
	/**
	 * Returns the player's handicap multiplier (i.e. 1.0 = no handicap). 
	 * @since AoT 
	 */
	public native float kbGetPlayerHandicap(int playerID);
	/**
	 * Sets the indicated player's handicap multiplier (i.e. 1.0 = no handicap). 
	 * @since AoT 
	 */
	public native void kbSetPlayerHandicap(int playerID, float handicap);
	
	//hide constructor
	private Player() {}
}
