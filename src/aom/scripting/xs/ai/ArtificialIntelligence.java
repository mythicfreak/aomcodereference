package aom.scripting.xs.ai;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of AI commands that don't fit in any of the subcategories.
 * 
 * @see <a href="{@docRoot}/AI Reference.xs">AoM Reference</a>
 * @see <a href="{@docRoot}/AI XReference.xs">AoT Reference</a>
 * 
 * @sync 	All AI commands are executed locally on the computer of the host and 
 * 			the results (move, build, train, research, ...) are sent to the participating players. 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public abstract class ArtificialIntelligence {	
	/**
	 * The invalid vector. Equals <code>vector(-1.0, -1.0, -1.0)</code>.
	 */
	public final vector cInvalidVector;
	
	/**
	 * The origin vector, this is the south corner of the map.
	 */
	public final vector cOriginVector;
	
	/**
	 * The number of players, mother nature included.
	 */
	public final int cNumberPlayers;
	
	/**
	 * The filename of the current XS script.
	 */
	public final string cFilename;
	
	/**
	 * The playerID of the player when the game started. Does not change with xsSetContextPlayer().
	 */
	public final int cMyID;
	
	/**
	 * The nickname of the AI player.
	 */
	public final string cMyName;
	
	/**
	 * The culture ID.
	 * 
	 * @see #cCultureGreek
	 * @see #cCultureEgyptian
	 * @see #cCultureNorse
	 * @see #cCultureAtlantean
	 * @see #cCultureNature
	 */
	public final int cMyCulture;
	
	/**
	 * The civilization ID.
	 * 
	 * @see #cCivZeus
	 * @see #cCivHades
	 * @see #cCivPoseidon
	 * @see #cCivIsis
	 * @see #cCivRa
	 * @see #cCivSet
	 * @see #cCivLoki
	 * @see #cCivThor
	 * @see #cCivOdin
	 * @see #cCivGaia
	 * @see #cCivKronos
	 * @see #cCivOuranos
	 * @see #cCivGreek
	 * @see #cCivNorse
	 * @see #cCivEgyptian
	 * @see #cCivAtlantean
	 * @see #cCivRandom
	 * @see #cCivNature
	 */
	public final int cMyCiv;
	
	/**
	 * The filename of the RMS script (without ".xs"/".xml") associated with the current map.
	 */
	public final string cRandomMapName;

	//Civs:
	/** The Major God Zeus. */
	public final int cCivZeus=0;
	/** The Major God Poseidon. */
	public final int cCivPoseidon=1;
	/** The Major God Hades. */
	public final int cCivHades=2;
	/** The Major God Isis. */
	public final int cCivIsis=3;
	/** The Major God Ra. */
	public final int cCivRa=4;
	/** The Major God Set. */
	public final int cCivSet=5;
	/** The Major God Odin. */
	public final int cCivOdin=6;
	/** The Major God Thor. */
	public final int cCivThor=7;
	/** The Major God Loki. */
	public final int cCivLoki=8;
	/** The Major God Kronos. */
	public final int cCivKronos=9;
	/** The Major God Ouranos. */
	public final int cCivOuranos=10;
	/** The Major God Gaia. */
	public final int cCivGaia=11;
	/** A random Major God. */
	public final int cCivRandom=12;
	/** A random Greek Major God */
	public final int cCivGreek=13;
	/** A random Norse Major God. */
	public final int cCivNorse=14;
	/** A random Egyptian Major God. */
	public final int cCivEgyptian=15;
	/** A random Atlantean Major God. */
	public final int cCivAtlantean=16;
	/** The Major God Nature representing Mother Nature. */
	public final int cCivNature=17;

	//Cultures:
	/** The Greek Culture. */
	public final int cCultureGreek=0;
	/** The Egyptian Culture. */
	public final int cCultureEgyptian=1;
	/** The Norse Culture. */
	public final int cCultureNorse=2;
	/** The Atlantean Culture. */
	public final int cCultureAtlantean=3;
	/** The Nature Culture. */
	public final int cCultureNature=4;
	
	//Unit Stances:
	/** 
	 * The aggressive unit stance.
	 * In this stance units attack any enemy unit that comes into sight.
	 * 
	 * @see #aiSetDefaultStance(int)
	 */
	public final int cUnitStanceAggressive=0;
	
	/**
	 * The defensive unit stance.
	 * In this stance units will not leave the area they are defending,
	 * even if under attack.
	 * 
	 * @see #aiSetDefaultStance(int)
	 * @see Military#aiSetAttackResponseDistance(float)
	 */
	public final int cUnitStanceDefensive=1;
	
	/**
	 * The passive stance.
	 * In this stance a unit will not leave his spot,
	 * even if under attack.
	 * 
	 * In this stance Economic units will continue doing their task even if under attack.
	 * 
	 * @see #aiSetDefaultStance(int)
	 * @see aom.scripting.xs.kb.UnitType#Economic UnitType.Economic
	 */
	public final int cUnitStancePassive=2;

	//Victory Condition/Game Mode Types:
	public final int cGameModeSupremacy=0;
	public final int cGameModeConquest=1;
	public final int cGameModeLightning=2;
	public final int cGameModeDeathmatch=3;

	//Difficulty Levels:
	/** The easiest difficulty. */
	public final int cDifficultyEasy=0;
	
	/** A moderate difficulty. */
	public final int cDifficultyModerate=1;
	
	/** The hard difficulty. */
	public final int cDifficultyHard=2;
	
	/**
	 * The Hardest difficulty,
	 * in AoT better known as "Titan".
	 */
	public final int cDifficultyNightmare=3;

	//Age Constants:
	/** The Archaic Age. */
	public final int cAge1=0;
	
	/** The Classical Age. */
	public final int cAge2=1;
	
	/** The Heroic Age. */
	public final int cAge3=2;
	
	/** The Mythic Age. */
	public final int cAge4=3;
	
	/**
	 * The fifth age, better known as Titan Age.
	 * 
	 * @since AoT
	 */
	public final int cAge5=4;

	//Player Relation Constants:
	public final int cPlayerRelationAny=-1;
	public final int cPlayerRelationSelf=0;
	public final int cPlayerRelationEnemy=2;
	public final int cPlayerRelationAlly=1;

	//Unit Movement Types:
	public final int cMovementTypeNone=0;
	public final int cMovementTypeLand=1;
	public final int cMovementTypeWater=2;
	public final int cMovementTypeAir=4;
	public final int cMovementTypeNonSolid=8;

	/** CP AI echo. */
	public native void aiEcho( string echoString);
	/** CP AI error. */
	public native void aiErrorMessage(string errorString);
	/** Sets the seed of the random number generator. */
	public native void aiRandSetSeed(int seed);
	/** Returns a random number (mod'ed by max if provided). */
	public native int aiRandInt(int max);
	/** Returns a random location guaranteed to be on the map. */
	public native vector aiRandLocation();
	
	/** Sets playerID's AI to the given filename.
	 * @deprecated
	 */
	public native void aiSet(string filename, int playerID);
	/** Sets a breakpoint.
	 * @deprecated
	 */
	public native void aiBreakpointSet(int playerID, string filename, int lineNumber, bool on);
	/** Restart XS execution after the current breakpoint.
	 * @deprecated
	 */
	public native void aiBreakpointGo(int playerID);
	/** Gets the player's personality. */
	public native string aiGetPersonality();
	/** Sets the player's personality. */
	public native bool aiSetPersonality(string name);
	/** Returns the number of matching goals. */
	public native int aiGoalGetNumber(int goalType, int goalState, bool active);
	/** Returns the ID of matching goal. */
	public native int aiGoalGetIDByIndex(int goalType, int goalState, bool active, int index);
	/** Returns allow buildings on/off. */
	public native bool aiGetAllowBuildings();
	/** Sets allow buildings on/off. */
	public native void aiSetAllowBuildings(bool v);
	/** Returns the number of unassigned units of the given type. */
	public native int aiNumberUnassignedUnits(int typeID);
	/** Returns the number of unassigned units based on the goal's unit type(s). */
	public native int aiNumberUnassignedUnitsByGoal(int goalID);
	/** Creates unit(s) with the given parms. */
	public native int aiUnitCreateCheat(int playerID, int protoUnitID, vector position, string name, int numberUnits, int angle);
	/** Returns the world difficulty level. */
	public native int aiGetWorldDifficulty();
	/** Sets the world difficulty level. */
	public native void aiSetWorldDifficulty(int v);
	/** Returns the name of the level. */
	public native string aiGetWorldDifficultyName(int level);
	/** Returns the game mode. */
	public native int aiGetGameMode();
	/** Returns the captain for the given player's team. */
	public native int aiGetCaptainPlayerID(int playerID);
	/** Saves the auto, debugging savegames. Does not work. */
	public native void aiAutoSavegame(string filename);
	/** Returns whether or not its cool to turn AI autosaves on. */
	public native bool aiGetAutosaveOn();
	/** Sets the ai's Explore Danger Threshold value. */
	public native bool aiSetExploreDangerThreshold(float value);
	/** Gets the ai's Explore Danger Threshold value. */
	public native float aiGetExploreDangerThreshold();
	/** Sets the RM bool in the AI. */
	public native void aiSetRandomMap(bool v);
	/** Sets the pause all age upgrades flag in the AI. */
	public native void aiSetPauseAllAgeUpgrades(bool v);
	/** Gets the pause all age upgrades flag from the AI. */
	public native bool aiGetPauseAllAgeUpgrades();
	/** Reigns the current player.. */
	public native void aiResign();
	/** Asks the player if its ok to resign */
	public native void aiAttemptResign();
	/** Sets the limit for how many LOS Protounits (e.g. obelisks) the AI can build */
	public native void aiSetMaxLOSProtoUnitLimit(int limit);
	/** Gets the limit for how many LOS Protounits (e.g. obelisks) the AI can build */
	public native int aiGetMaxLOSProtoUnitLimit();
	/** Gets the current Pop needs of all the plans. */
	public native int aiGetPopNeeds();
	/** Switch the newBaseID to be the main base. */
	public native void aiSwitchMainBase(int newBaseID, bool force);
	/** Sets your default stance for all of your units. */
	public native void aiSetDefaultStance(int defaultStance);
	/** Tells the AI if this is a water map or not. */
	public native void aiSetWaterMap(bool v);
	/** Tells us if the AI thinks this is a water map or not. */
	public native bool aiSetWaterMap();
	/** Queues the auto savegame. */
	public native void aiQueueAutoSavegame(int saveNumber);
	/** Returns true, if this is a multiplayer game. */
	public native bool aiIsMultiplayer();
	
	//hide stuff
	private ArtificialIntelligence() {
		cNumberPlayers = 0;
		cFilename = null;
		cMyID = 0;
		cMyName = null;
		cMyCulture = 0;
		cMyCiv = 0;
		cRandomMapName = null;
		cOriginVector = vector.xsVectorSet(0, 0, 0);
		cInvalidVector = vector.xsVectorSet(-1,-1,-1);
	}
}
