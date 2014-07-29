package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of AI commands concerning Event Handling.
 * Whenever a predefined action happens, the handler functions here will be called.
 * Those handler functions must have the following signature: eventHander(int eventID = -1).
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class EventHandler {
	private EventHandler() {}
	
	//Resign Types:
	public final int cResignGatherers=0;
	public final int cResignSettlements=1;
	public final int cResignTeammates=2;
	public final int cResignMilitaryPop=3;
	
	/** Sets the handler for god power casting events (invalid name unsets the handler). */
	public native bool aiSetGodPowerEventHandler(string handlerFunctionName);
	/** Sets the handler for building completed events (invalid name unsets the handler). */
	public native bool aiSetBuildEventHandler(string handlerFunctionName);
	/** Sets the handler for wonder death events (invalid name unsets the handler). */
	public native bool aiSetWonderDeathEventHandler(string handlerFunctionName);
	/** Sets the handler for retreat events (invalid name unsets the handler). */
	public native bool aiSetRetreatEventHandler(string handlerFunctionName);
	/** Sets the handler for relic events (invalid name unsets the handler). */
	public native bool aiSetRelicEventHandler(string handlerFunctionName);
	/** Sets the handler for resign events (invalid name unsets the handler). */
	public native bool aiSetResignEventHandler(string handlerFunctionName);
	/** Sets the handler for the given age (invalid name unsets the handler). */
	public native bool aiSetAgeEventHandler(int age, string handlerFunctionName);
}
