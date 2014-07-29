package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Trigger commands concerning Quest Vars (QVs).
 * 
 * QVs are the variables used in scenarios. They can only hold float values.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class QuestVar {
	private QuestVar() {}
	
	/** 
	 * Copies value of one of the trigger scratch variables. 
	 * @since AoT 
	 */
	public native void trQuestVarCopy(string QV1, string QV2);

	/** 
	 * Chats out the value of one of the trigger scratch variables.
	 * @since AoT  
	 */
	public native void trQuestVarEcho(string QVname);

	/** 
	 * Retrieve value of a trigger scratch variable, returns zero if unset. 
	 * @since AoT 
	 */
	public native float trQuestVarGet(string QVname) ;

	/** 
	 * Sets one of the trigger scratch variables. 
	 * @since AoT 
	 */
	public native void trQuestVarSet(string QVname, float value) ;

	/** 
	 * Sets one of the trigger scratch variables within a random range. 
	 * @since AoT
	 */
	public native void trQuestVarSetFromRand(string QVname, float minval, float maxval, bool round) ;
}
