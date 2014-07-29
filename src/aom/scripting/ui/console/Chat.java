package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Chats.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Chat {
	private Chat() {}
	
	/**
	 * Navigates through chat history, resetting mode as needed.
	 * @local 
	 */
	public native void uiChatScroll(int nbPagesBack);
	
	/** 
	 * Adds a line of chat text from the given player (current if not provided).
	 * 
	 * @local This text won't be transferred over the network to other players.
	 */
	public native void chat(string text, int player);
	
	/** 
	 * Used by the chat input. Sends a message to the currently selected players. 
	 * This only sends chats the players with the same (alive/defeated/game-over) state.
	 * 
	 * @sync Transfers the chat message to all intended recipients.
	 */
	public native void uiSendIngameChat();
	
	/**
	 * Sends chat to everyone.
	 * 
	 * @sync Transfers the chat message to every player.
	 */
	public native void sendChatToEveryone(string message);

	/** 
	 * Sends chat to allies.
	 * 
	 * @sync Transfers the chat message to all allies.
	 */
	public native void sendChatToAllies(string message);

	/**
	 * Sends chat to enemies.
	 * 
	 * @sync Transfers the chat message to all enemies.
	 */
	public native void sendChatToEnemies(string message);

	/** 
	 * Sends chat to given player.
	 * 
	 * @sync Transfers the chat message to the given player.
	 */
	public native void sendChatToPlayer(int player, string message);

	/**
	 * Sends chat to a team.
	 * 
	 * @sync Transfers the chat message to the given team.
	 */
	public native void sendChatToTeam(int team, string message);
	
	/** 
	 * Toggles chat visibility.
	 * 
	 * @since AoM:EE
	 */
	public native void uiToggleChat();
}
