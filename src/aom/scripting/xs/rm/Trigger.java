package aom.scripting.xs.rm;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * <p>This class provides a collection of RM commands concerning Triggers.</p>
 * 
 * <p>
 * Basically only the default triggers can be used in RM scripts, because of the way they are inserted.
 * With a couple of workarounds you can inject raw trigger code in a RM script though.
 * You can use the following functions:</p>
 * 
 * <pre>{@code 
void rmInsertConditionCode(string xs="") {
	rmAddTriggerCondition("Timer");
	rmSetTriggerConditionParam("Param1","0==("+xs+"));//");
}

void rmInsertEffectCode(string xs="") {
	rmAddTriggerEffect("SetIdleProcessing");
	rmSetTriggerEffectParam("IdleProc", "true); "+xs+" //");
}
 * }</pre>
 * 
 * @example
 * <pre>
{@code rmInsertConditionCode("(trTime() <= 5.0)");}
{@code rmInsertEffectCode("trSetFogAndBlackmap(false, false);");}
 * </pre>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Trigger {
	/**Add the given units to the armyID.*/
	public native void rmAddUnitsToArmy(int playerID, int armyID, int objectDefID);
	
	/**Create an army for the given player ID.*/
	public native void rmCreateArmy(int playerID, string armyName);
	
	/**Sets the current trigger active.*/
	public native void rmSetTriggerActive(bool active);

	/**Adds a parameter to the current condition.*/
	public native void rmSetTriggerConditionParam(string paramName, string value, bool add);

	/**Adds an army parameter to the current condition.*/
	public native void rmSetTriggerConditionParamArmy(string paramName, int playerID, int armyID, bool add);

	/**Adds a float parameter to the current condition.*/
	public native void rmSetTriggerConditionParamFloat(string paramName, float value, bool add);

	/**Adds an integer parameter to the current condition.*/
	public native void rmSetTriggerConditionParamInt(string paramName, int value, bool add);

	/**Adds a parameter to the current effect.*/
	public native void rmSetTriggerEffectParam(string paramName, string value, bool add);

	/**Adds an army parameter to the current effect.*/
	public native void rmSetTriggerEffectParamArmy(string paramName, int playerID, int armyID, bool add);

	/**Adds a float parameter to the current effect.*/
	public native void rmSetTriggerEffectParamFloat(string paramName, float value, bool add);

	/**Adds an int parameter to the current effect.*/
	public native void rmSetTriggerEffectParamInt(string paramName, int value, bool add);

	/**Sets the current trigger looping.*/
	public native void rmSetTriggerLoop(bool loop);

	/**Sets the current trigger's priority.*/
	public native void rmSetTriggerPriority(int priority);

	/**Sets the current trigger to "run immediately"*/
	public native void rmSetTriggerRunImmediately(bool runImmediately);

	/**Assigns a specific victory condition file to this RMS.*/
	public native void rmSetVCFile(string filename);

	/**Sets the given trigger as current.*/
	public native void rmSwitchToTrigger(int triggerID);
	
	/**Add a condition from the trigger(2)\typetest.xml file to the random map.*/
	public native void rmAddTriggerCondition(string conditionType);

	/**Add an effect from the trigger(2)\typetest.xml file to the random map.*/
	public native void rmAddTriggerEffect(string effectType);
	
	/**
	 * Create a trigger to add to this random map.
	 * In addition, the default condition (Always) and effect (SetIdleProcessing) are automatically added.
	 */
	public native void rmCreateTrigger(string triggerName);
	
	/**Returns the ID for the trigger with as name triggerName*/
	public native int rmTriggerID(string triggerName);
	
	private Trigger() {}
}
