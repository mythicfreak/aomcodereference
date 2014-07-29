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

	/** Returns whether or not the current chat history contains this text of the given player. OoS danger online: use low priority. */
	public native bool trChatHistoryContains(string text, int playerID);

	/** Changes the chat status. */
	public native void trChatSend(int fromID, string message);

	/** Changes the chat status, but does not append player. */
	public native void trChatSendSpoofed(int fromID, string  message);

	/** Changes the chat status, but does not append player. Goes to specific player */
	public native void trChatSendSpoofedToPlayer(int fromID, int toID, string message);

	/** Changes the chat status for one specific player. */
	public native void trChatSendToPlayer(int fromID, int  toID, string message);

	/** Changes the chat status. */
	public native void trChatSetStatus(bool on);
}
