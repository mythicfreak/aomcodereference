package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Trigger commands concerning Players.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Player {
	private Player() {}
	
	/** Returns true if the player is active. */
	public native bool trPlayerActive(int playerID);

	/** Returns true if player is at pop cap. */
	public native bool trPlayerAtPopCap(int playerID);

	/** Returns the number of buildings for the player. */
	public native int trPlayerBuildingCount(int playerID);

	/** Returns true if building is being built. */
	public native bool trPlayerCountBuildingInProgress(int playerID, string protoName);

	/** Returns true if the player has been defeated. */
	public native bool trPlayerDefeated(int playerID);

	/** Gets the diplomacy status between players. */
	public native string trPlayerGetDiplomacy(int playerID, int player2ID);

	/** Returns the player population. */
	public native int trPlayerGetPopulation(int playerID);

	/** Grants the given amount a resource to the given player. */
	public native void trPlayerGrantResources(int playerID, string resource, int amount);

	/** Kills all of the buildings of a given player. */
	public native void trPlayerKillAllBuildings(int playerID);

	/** Kills all of the current God Powers of a player. */
	public native void trPlayerKillAllGodPowers(int playerID);

	/** Kills all of the units of a given player. */
	public native void trPlayerKillAllUnits(int playerID);

	/** Adds/removes LOS between players. */
	public native void trPlayerModifiedLOS(int playerID, bool canSee, int player2ID);

	/** Resets the black map for a given <u>human</u> player. */
	public native void trPlayerResetBlackMap(int playerID);

	/** Resets the black map for all <u>human</u> players */
	public native void trPlayerResetBlackMapForAllPlayers();

	/** Returns the number of resources for the player. */
	public native int trPlayerResourceCount(int playerID, string resource);

	/** 
	 * Sets the active player.
	 * 
	 * @see aom.scripting.xs.xs.ExternalSubroutines#xsGetContextPlayer() xsGetContextPlayer()
	 * @see aom.scripting.xs.xs.ExternalSubroutines#xsSetContextPlayer(int) xsSetContextPlayer(int)
	 * @see #trCurrentPlayer()
	 */
	public native void trPlayerSetActive(int playerID);
	
	/** Returns the current player */
	public native int trCurrentPlayer();

	/** Sets the diplomacy status between players */
	public native void trPlayerSetDiplomacy(int playerID, int player2ID, string status);

	/** Enables/disables the technology tree from granting God Powers to a player. */
	public native void trPlayerTechTreeEnabledGodPowers(int playerID, bool on);

	/** Tributes resources to a player. */
	public native void trPlayerTribute(int fromID, string resource, int amount, int toID);

	/** Returns the number of units and buildings for the player. */
	public native int trPlayerUnitAndBuildingCount(int playerID);

	/** Returns the number of units for the player. */
	public native int trPlayerUnitCount(int playerID);

	/** Returns the number of proto units for the player. */
	public native int trPlayerUnitCountSpecific(int playerID, string protoName);
	
	/** 
	 * When called, the player is set to defeated on the local machine.
	 * 
	 * @local
	 */
	public native void trSetPlayerDefeated();

	/** 
	 * When called, the player is set to be victorious on the local machine.
	 * 
	 * @local
	 */
	public native void trSetPlayerWon(int playerID);
	
	/** Sets the current player as active or inactive */
	public native void trSetCurrentPlayerStatus(bool active);
	
	/** Player loses, specifies message. */
	public native void trYouLose(string text);

	/** Player wins, specifies next scenario to go to and message.*/
	public native void trYouWin(string nextscenario, string text);
}
