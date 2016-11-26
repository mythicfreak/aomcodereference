package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Trigger commands concerning Chats.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Chat {
	private Chat() {}
	
	/** Forces the chat history to reset. */
	public native void trChatHistoryClear();

	/** Returns whether or not the current chat history contains this text of the given player.
	 * <p>
	 * Can cause out of sync in multiplayer, even in a low priority trigger. */
	public native bool trChatHistoryContains(string text, int playerID);

	/** Sends a chat message prefixed with the given player's name, e.g. "Player 1: the text here".
	 * <p>
	 * The exception is player 0, which results in the given line to be added as yellowish text to the chat history
	 * (normal chat is white and has a coloured icon indicating the sending player). */
	public native void trChatSend(int fromID, string message);

	/** Sends a chat message with the coloured icon of the given player but without their name prepended to the text. */
	public native void trChatSendSpoofed(int fromID, string message);

	/** Same as {@link #trChatSendSpoofed(int, string)}, but only sent to a given player. */
	public native void trChatSendSpoofedToPlayer(int fromID, int toID, string message);

	/** Same as {@link #trChatSend(int, string)}, but only sent to a given player. */
	public native void trChatSendToPlayer(int fromID, int toID, string message);

	/** Enables (true) or disables (false) the chat. This also prevents all other functions in this class (like {@link #trChatSend(int, string)}) from working. */
	public native void trChatSetStatus(bool on);
	
}
