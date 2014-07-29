package aom.scripting.xs.tr;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of Trigger commands that don't fit in any of the subcategories.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public abstract class Triggers {
	/**
	 * Total number of players, mother nature included.
	 */
	public final int cNumberPlayers;
	
	/**
	 * The vector indicating the bottom of the map, i.e. (0, 0, 0).
	 */
	public final vector cOriginVector;
	
	/**
	 * The invalid vector (-1,-1,-1).
	 */
	public final vector cInvalidVector;
	
	/** Fires a function in the current AI file. */
	public native void trAIFunc(int playerID, string functionName, float param);

	/** 
	 * Creates the units in the army specified.
	 * Only works for human players online.
	 * Returns true if successful.
	 */
	public native bool trArmyDispatch(string SrcArmy, string ProtoName, int Count, float x, float y, float z, int Heading, bool Clear);

	/** Returns whether that GP type, for that player, is currently in effect. */
	public native bool trCheckGPActive(string godPower, int playerID);

	/** Clears a counter display. */
	public native void trClearCounterDisplay();

	/** Abort a counter */
	public native void trCounterAbort(string name);

	/** Start a counter that may or may not fire an event. */
	public native void trCounterAddTime(string name, int start, int stop, string message, int eventID);

	/** Start a counter that may or may not fire an event. */
	public native void trCounterAddUnit(string name, int playerID, int count, string protoUnit, string message, int eventID);

	/** Returns the number of units in an area that match the params. */
	public native int trCountUnitsInArea(int centerUnitID, int matchPlayer, int matchType, float range) ;

	/**
	 * Adds a rule to the runtime to be activated on the next update.
	 *
	 * This causes the rule to be delayed by a small fraction of time,
	 * but often enough to properly complete commands that might take a little while.
	 * 
	 * @see aom.scripting.xs.xs.Rule#xsEnableRule(string) xsEnableRule(string)
	 */
	public native void trDelayedRuleActivation(string rulename);

	/** Prints the given string to the RTS3banglog.txt file in the AoM folder. */
	public native void trEcho(string echoString);

	/** Fetch a stat value from the KB and echo to chat. */
	public native void trEchoStatValue(int playerID, int statID);

	/** Signal that the game has ended */
	public native void trEndGame();

	/** 
Cause an event to occur.

Under the hood, an eventID is generated for this event.
This event is registered in the default event handler using
{@link #trEventSetHandler(int, string) trEventSetHandler(myEventID, "eventHandler");}.
Next, this piece of code is appended at the end of the eventHandler function:
<pre>
case myEventID:
{
   xsEnableRule("_My Trigger");
   trEcho("Trigger enabling rule My Trigger");
   break;
}
</pre>
	 */
	public native void trEventFire(int eventID);

	/**
	 * Sets a handler function f(int status) for an eventID. Every time this event is fired,
	 * the given hander function will automatically be called with the eventID as its status.
	 */
	public native void trEventSetHandler(int eventID, string handlerFunction);

	/** Adds protounit to the forbidden list. */
	public native void trForbidProtounit(int playerID, string protoname);

//	/** Pop up a dialog allowing choice to load a scenario. */
//	public native void trGameLoadScenario(string dialogMessage);

	/** Start a game using scenario. */
	public native void trGameLoadScenario(string scenarioName);

	/** Pause or unpause the game. */
	public native void trGamePause(bool pause);

	/** 
	 * Force generation of lush from a pre-placed building.
	 * 
	 * @since AoT 
	 */
	public native void trGenerateLush();

	/** Returns the time when that GP was first used, or -1 for unused. */
	public native int trGetGPUsedTime(string godPower, int playerID);

	/** Fetch a stat value from the KB */
	public native int trGetStatValue(int playerID, int statID);

	/** Returns the world difficulty. */
	public native int trGetWorldDifficulty();

	/** Displays a message box at the top of the screen with the given message. */
	public native void trMessageSetText(string message, int timeout);

	/** Sends a Minimap flare to a certain player. */
	public native void trMinimapFlare(int playerID, float duration, vector position, bool flash);

	/** 
	 * Enters the mode specified.
	 *
	 * @local
	 * 
	 * @see aom.scripting.ui.console.Mode#modeEnter(string) modeEnter(string)
	 */
	public native void trModeEnter(string modeName);

	/** 
	 * Modifies protounit data for this scenario only.
	 * 
	 * @param 	protoUnit
	 * 			The name of the protounit to modify.
	 * @param	playerID
	 * 			The player for which the modifications should occur.
	 * @param	field
	 * 			{@link TriggerParamType#PUFIELD}
	 * @param	delta
	 * 			The (relative) amount to change.
	 * 
	 * @since AoT 
	 */
	public native void trModifyProtounit(string protoUnit, int playerID, int field, float delta);

	/** Sets the objective text. */
	public native void trObjectiveSetID(int missionNum, int objectiveID);

	/** Modify construction rate. */
	public native void trRateConstruction(float rate);

	/** Modify research rate. */
	public native void trRateResearch(float rate);

	/** Restore all rates to normal. */
	public native void trRatesNormal();

	/** Modify training rate */
	public native void trRateTrain(float rate);

	/** 
	 * Shows whole map, similar to how revealed mode works.
	 * 
	 * @see #trSetFogAndBlackmap(bool, bool)
	 */
	public native void trRevealEntireMap();

	/** 
	 * Override display name of a civilization dynamically.
	 * 
	 * @since AoT 
	 */
	public native void trSetCivilizationNameOverride(int playerID, string civName);

	/** Sets the current fake-counter text. */
	public native void trSetCounterDisplay(string text);

	/**
	 * Enable or Disable GP blocking (e.g. by isis monuments).
	 * 
	 * @since AoT 
	 */
	public native void trSetDisableGPBlocking(bool b);

	/**
	 * Turn fog and black map on/off.
	 * 
	 * Similar to the console commands, this just disables the rendering of fog and blackmap.
	 * Any area that was previously unscouted will still act as if it was unscouted.
	 * To have this scouted effect, use {@link #trRevealEntireMap()} instead.
	 * 
	 * @see aom.scripting.ui.console.Console#fog(int) fog()
	 * @see aom.scripting.ui.console.Console#blackmap(int) blackmap()
	 */
	public native void trSetFogAndBlackmap(bool fog, bool blackmap);

	/** Fades to the specified lighting set over a given fadeTime. */
	public native void trSetLighting(string setName, float fadeTime);

	/**
	 * Automatically pauses the game if the Objectives windows opens.
	 *
	 * @single
	 */
	public native void trSetPauseInObjectiveWindow();

	/** 
	 * Automatically pauses the game if the Age Advancement windows opens.
	 * 
	 * @single
	 */
	public native void trSetPauseOnAgeUpgrade();

	/** Changes the effect of the selected relic to this custom techID. */
	public native void trSetRelicType(int techID);

	/**
	 * Displays dialog with 2 choices, and activates a trigger in response.
	 * 
	 * @local 	Be careful when used online. The trigger events are only fired locally, 
	 * 			so an OoS is likely to occur if 2 players choose different options.
	 */
	public native void trShowChoiceDialog(string maintext, string choice1, int event1ID, string choice2, int event2ID);

	/** Shows a win/lose message and plays a sound. */
	public native void trShowWinLose(string text, string soundfile, float volume);

	/** 
	 * Starts recording the game.
	 * 
	 * This functionality seems kind of broken for scenarios. Only the first couple of minutes are recorded.
	 */
	public native void trStartGameRecord();

	/** Stops recording the game. */
	public native void trStopGameRecord();

	/** Adds X uses to the specified god power. */
	public native void trTechGodPower(int playerID, string techName, int numUses);

	/** Adds X uses to the specified god power in a specific GP slot (1-4). */
	public native void trTechGodPowerAtPosition(int playerID, string techName, int numUses, int slot);

	/** 
	 * Invokes the specified god power.
	 *
	 * Ensure that the player actually possesses the given power first.
	 * Since AoT this precondition is not required anymore for Mother Nature.
	 */
	public native void trTechInvokeGodPower(int playerID, string techName, vector pos1, vector pos2);

	/** Sets the technology status for the player. */
	public native void trTechSetStatus(int playerID, int techID, int statusID);

	/** Returns true if technology is active for player. */
	public native bool trTechStatusActive(int playerID, int techID);

	/** Returns true if technology is being researched for player. */
	public native bool trTechStatusResearching(int playerID, int techID);

	/** Returns the current game time in Seconds. */
	public native int trTime();

	/** Returns the current game time in Milliseconds. */
	public native int trTimeMS();

	/** Removes proto unit from the forbidden list. */
	public native void trUnforbidProtounit(int playerID, string protoName);

	/** Writes text to the rts3banglog */
	public native void trWriteToLog(string message);
	
	/**
	 * Shows the player's kill/loss ratio as the score.
	 * 
	 * @since AoM:EE
	 */
	public native void trShowScoreMessage(int player, string soundfile);

	/**
	 * Shows the player's kill/loss ratio as the score persistently.
	 * 
	 * @since AoM:EE
	 */
	public native void trShowPersistentScoreMessage(int player);

	/**
	 * Hide the peristent score message.
	 * 
	 * @since AoM:EE
	 */
	public native void trHidePersistentScoreMessage();

	/**
	 * Sets the time of day: 0.0 - 1.0.
	 * 
	 * @since AoM:EE
	 */
	public native void trSetTimeOfDay(float alpha);

	/**
	 * Sets the day-night cycle period in seconds. A value of period that is less than 1.0 switches off day-night cycle.
	 * 
	 * @since AoM:EE
	 */
	public native void trSetTimeOfDayPeriod(float period);

	/**
	 * Sets the player's custom score bonus.
	 * 
	 * @since AoM:EE
	 */
	public native void trSetPlayerCustomScore(int player, int newScoreValue);

	/**
	 * Adds to the player's custom score bonus.
	 * 
	 * @since AoM:EE
	 */
	public native void trAddToPlayerCustomScore(int player, int deltaScore);
	
	private Triggers() {
		cNumberPlayers = 0;
		cOriginVector = vector.xsVectorSet(0, 0, 0);
		cInvalidVector = vector.xsVectorSet(-1,-1,-1);
	}
}