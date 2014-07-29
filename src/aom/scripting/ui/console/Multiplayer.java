package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Multiplayer.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Multiplayer {
	private Multiplayer() {}
	
	/** 
	 * Enters LAN/DirectIP if useESO is false, else shows ESO login screen.
	 * 
	 * @local
	 */
	public native void doMPSetup(bool useESO);
	
	/**
	 * Sets the saved game template to use.
	 *
	 * @local
	 */
	public native void mpCustomScreenSetSavegame(string name);
	
	/**
	 * Add a user to your friends list. Does not work.
	 * 
	 * @local
	 */
	public native void friendsAdd();

	/** 
	 * Remove a user from your friends list.
	 *
	 * @local
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void friendsRemove();

	/** 
	 * [re]connect to friends server. 
	 *
	 * @local
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void friendsConnect();

	/**
	 * Disconnect from friends server.
	 *
	 * @local
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void friendsDisconnect();

	/**
	 * Send a message to a friend.
	 *
	 * @sync The message is sent to the recipient.
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void friendsMessage();

	/** 
	 * Send an invite request to a friend.
	 * 
	 * @sync The invite is sent to the recipient.
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void friendsInvite();

	/** 
	 * Use matchmaking service to find a matching peer.
	 * 
	 * @sync The request is sent to the Matchmaking Service.
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void findMatch(string hashCode, int currentPlayerCount, int totalPlayerCount, int averagePlayerRating);

	/**
	 * Test updating the start frequency for a specific hash code.
	 * 
	 * @sync The request is sent to the Matchmaking Service.
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void matchUpdateStartFrequency(string hashCode);

	/**
	 * Migrate the current session to a new one.
	 * 
	 * @sync The request is sent to the Matchmaking Service.
	 *
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void migrateSession();
	
	/**
	 * Start broadcasting (a.k.a. hosting) this game.
	 * 
	 * @sync The request is sent to the Gamelist Service.
	 * 
	 * @note Used internally, I can't get this to work manually.
	 */
	public native void broadcastGame();
	
	/**
	 * Start receiving a broadcasted game.
	 */
	public native void receiveGame(string ipAddress_MachineName, string optionalFileNameForRecording);
}
