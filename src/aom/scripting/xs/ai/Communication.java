package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of AI commands concerning Communication.
 * An AI can not send a random chat message to human players, only predefined messages.
 * It can communicate with other AIs using a strict protocol.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Communication {
	private Communication() {}
	
	public final int cAICommPromptNone=0;
	public final int cAICommPromptAIBuildSettlement=1;
	public final int cAICommPromptAIResignGatherers=2;
	public final int cAICommPromptAIResignSettlements=3;
	public final int cAICommPromptAIResignActiveEnemies=4;
	public final int cAICommPromptIntro=5;
	public final int cAICommPromptGenericGodPower=6;
	public final int cAICommPromptOffensiveGodPower=7;
	public final int cAICommPromptEconomicGodPower=8;
	public final int cAICommPromptAILostSettlement=9;
	public final int cAICommPromptAILostLastSettlement=10;
	public final int cAICommPromptEnemyBuildSettlement=11;
	public final int cAICommPromptEnemyLostSettlement=12;
	public final int cAICommPromptEnemyLostLastSettlement=13;
	public final int cAICommPromptAIWinningAgeRace=14;
	public final int cAICommPromptAILosingAgeRace=15;
	public final int cAICommPromptAIWonderDestroyed=16;
	public final int cAICommPromptPlayerWonderDestroyed=17;
	public final int cAICommPromptPlayerBuildingWalls=18;
	public final int cAICommPromptAIAttack=19;
	public final int cAICommPromptAIAttackHere=20;
	public final int cAICommPromptAIRetreat=21;
	public final int cAICommPromptHelpHere=22;
	public final int cAICommPromptHelpHome=23;
	public final int cAICommPromptAITakeWater=24;
	public final int cAICommPromptTakingEnemyRelic=25;
	public final int cAICommPromptTakingAllyRelic=26;
	public final int cAICommPromptResignQuestion=27;
	
	public final int cAICommRecordPrompt=0;
	public final int cAICommRecordOrder=1;
	public final int cAICommRecordStatement=2;
	
	public final int cAICommResponseNoneRequired=0;
	public final int cAICommResponseWaiting=1;
	public final int cAICommResponseYes=2;
	public final int cAICommResponseNo=3;
	public final int cAICommResponseIncomingOrder=4;
	
	/** Get the type of a given record. */
	public native long aiCommsGetRecordType(int id);
	/** Get the prompt type of a given record. */
	public native long aiCommsGetRecordPromptType(int id);
	/** Get the player ID of a given record. */
	public native long aiCommsGetRecordPlayerID(int id);
	/** Get the response type of a given record. */
	public native long aiCommsGetRecordResponse(int id);
	/** Get the response data of a given record. */
	public native long aiCommsGetResponseData(int id);
	/** Get the data of a given record. */
	public native long aiCommsGetRecordData(int id);
	/** Get the position of a given record. */
	public native vector aiCommsGetRecordPosition(int id);
	/** Sends a prompt to the designated player and sets up a response. */
	public native int aiCommsSendPromptWithVector(int targetPlayerID, int promptType, int textVariant, float timeout, int yesOrderType, int noOrderType, int data1, vector position);
	/** Sends a prompt to the designated player and sets up a response. */
	public native int aiCommsSendPrompt(int targetPlayerID, int promptType, int textVariant, float timeout, int yesOrderType, int noOrderType, int data1);
	/** Sends an order to the designated player. */
	public native int aiCommsSendOrderWithVector(int targetPlayerID, int promptType, int data1, vector position);
	/** Sends an order to the designated player. */
	public native int aiCommsSendOrder(int targetPlayerID, int promptType, int data1);
	/** Sends a statement to the designated player. */
	public native int aiCommsSendStatement(int targetPlayerID, int promptType, int textVariant);
	/** Sends a statement to the designated player. Adds a location flare. */
	public native int aiCommsSendStatementWithVector(int targetPlayerID, int promptType, int textVariant, vector v);
	/** Sets the handler for the communications system (invalid name unsets the handler). */
	public native bool aiCommsSetEventHandler(string handlerFunctionName);
	/** Sets the handler for a specific chat record in the comms system (invalid name unsets the handler). */
	public native bool aiCommsSetSpecificEventHandler(long recordID, string handlerFunctionName);
	
	/** CP AI chat to playerID.
	 * @deprecated
	 */
	public native void aiChat(int playerID, string chatString);
	/** CP AI chat to everyone. 
	 * @deprecated
	 */
	public native void aiSendChatToEveryone(string chatString);
	/** CP AI chat to allies. 
	 * @deprecated
	 */
	public native void aiSendChatToAllies(string chatString);
	/** CP AI chat to enemies.
	 * @deprecated
	 */
	public native void aiSendChatToEnemies(string chatString);
}
