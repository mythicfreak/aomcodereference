package aom.scripting.ui; 

import aom.scripting.datatypes.*;

/**
 * <p>
 * This class provides a collection Templates that can be used in certain UI gadgets, such as the FormatTextGadget.
 * At runtime, these templates are parsed and their actual value is shown to the user.
 * The syntax is as follows: <code>{template_name(param)}</code>.
 * </p>
 * 
 * <p>I'm not 100% sure that this list is complete, but the most useful ones are certainly present.</p>
 * 
 * @note <p>Chats use a FormatTextGadget, so these templates can be used there.</p>
 * 
 * @note <p>Nesting commands won't work properly.</p>
 * 
 * @note <p>String arguments may be passed without quotes.</p>
 * 
 * @note 	<p>The results of these function calls isn't stored anywhere, 
 * 			so with every new screen refresh the functions are recalculated and might have a different value.
 * 			On top of that the result isn't necessarily the same for every player, 
 * 			e.g. <code>{playerName(-1)}</code> shows the nickname of the player looking at the text.</p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com 
 */
public abstract class Templates {
	/** The current difficulty level, i.e. Easy, Moderate, ... */
	public native string aiDifficulty();
	/** AI area debug text */
	public native string areaDebugText();
	/** AI area group debug text */
	public native string areaGroupDebugText();
	/** AI attack route debug text */
	public native string attackRouteDebugText();
	/** AI base info text */
	public native string baseDebugText();
	/** AI BP debug text */
	public native string buildingPlacementDebugText();
	public native string colorizeCost();
	/** True if the given config is defined. */
	public native bool configDefined(int configIndex);
	/** Holds the text for the current countdown. */
	public native string countdown();
	/** The current player's number. */
	public native int currentPlayerNum();
	/** The current player's team. */
	public native int currentPlayerTeam();
	/** 
	 * The current unit's armor.
	 * 
	 * @param type
	 * <ol start="0">
	 * <li>crush</li>
	 * <li>?</li>
	 * <li>hack</li>
	 * <li>pierce</li>
	 * </ol>
	 */
	public native int currentUnitArmor(int type);
	/** 
	 * The current unit's armor.
	 * 
	 * @param type
	 * <ol start="0">
	 * <li>crush</li>
	 * <li>?</li>
	 * <li>hack</li>
	 * <li>pierce</li>
	 * </ol>
	 */
	public native float currentUnitArmorFloat(int type);
	/** 
	 * Shows the current armor values. 
	 * @example 
<pre>
AbstractVillager:
Armor: Hack 25%
Armor: Pierce: 35%
</pre>
	 */
	public native string currentUnitArmorList();
	/** The current unit's attack. */
	public native int currentUnitAttack(int type);
	/** The current unit's attack. */
	public native float currentUnitAttackFloat(int type);
	/** 
	 * The current unit's attack values.
	 * @example 
<pre>
AbstractVillager:
8 Hack
</pre> 
	 */
	public native string currentUnitAttackList();
	/** The current unit's range. */
	public native int currentUnitAttackRange();
	/** The current unit's range. */
	public native float currentUnitAttackRangeFloat();
	/** The current unit's attack possibilities, including bonuses. */
	public native string currentUnitAttackstring();
	/** The current unit's attack values. */
	public native string currentUnitAttackText(int type);
	/** @return if(type == "favor") favor gathered by Norse if unit killed. */
	public native float currentUnitBounty(string type);
	public native float currentUnitBountyFactor(string type);
	public native int currentUnitBuildingWorkRate();
	public native float currentUnitBuildingWorkRateFloat();
	public native int currentUnitBuildPoints();
	public native float currentUnitBuildPointsFloat();
	public native int currentUnitBuildRate();
	public native float currentUnitBuildRateFloat();
	/** The current unit's capacity details, i.e. current/max number of units garrisoned. */
	public native int currentUnitCapacity();
	/** The current unit's animation length. */
	public native int currentUnitCurrentAnimLength();
	/** The current unit's gather rate for the given resource: 
	 * Fish, Huntable, WildCrops, Herdable, Farm, Wood, Gaia Forest tree, Gold. 
	 */
	public native int currentUnitGatherRate(string resource);
	/** Same as <code>currentUnitGatherRate</code>, but with float values. */
	public native float currentUnitGatherRateFloat(string resource);
	/** A string representation of the current gather rates of the selected unit. */
	public native string currentUnitGatherRateString();
	public native int currentUnitGroup();
	/** The current unit's (starting) hit points. */
	public native int currentUnitHP();
	/** Same as <code>currentUnitHP</code>, but with float values.*/
	public native float currentUnitHPFloat();
	/** The current unit's (in-game) ID number.*/
	public native int currentUnitID();
	/** Friend-foe colors? */
	public native string currentUnitIFFcolor();
	public native int currentUnitInv();
	public native float currentUnitInvFloat();
	public native string currentUnitInvList();
	public native int currentUnitLogicalGroupID();
	public native string currentUnitLogicalGroupName();
	/** The current unit's Line of Sight.*/
	public native int currentUnitLOS();
	/** Same as <code>currentUnitLOS</code>, but with float values.*/
	public native float currentUnitLOSFloat();
	/** The current unit's maximum hit points.*/
	public native int currentUnitMaximumHP();
	/** Same as <code>currentUnitMaximumHP</code>, but with float values.*/
	public native float currentUnitMaximumHPFloat();
	/** The current unit's speed (in m/s).*/
	public native int currentUnitMaxVelocity();
	/** Same as <code>currentUnitMaxVelocity</code>, but with float values.*/
	public native float currentUnitMaxVelocityFloat();
	/** The current unit's minimum attack range.*/
	public native int currentUnitMinAttackRange();
	/** Same as <code>currentUnitMinAttackRange</code>, but with float values.*/
	public native float currentUnitMinAttackRangeFloat();
	/** The current unit's name. This can be set with <code>trUnitChangeName(string name)</code>.*/
	public native string currentUnitName();
	/** The playerID of the player that owns the current unit.*/
	public native int currentUnitOwnerID();
	public native string currentUnitPlayerIFF();
	/** The current unit's recharge time meter.*/
	public native float currentUnitRecharge();
	/** The current unit's scenario name, as can be chosen in the <code>trUnitCreate()</code> function.*/
	public native string currentUnitScenarioName();
	/** The current unit's train points.*/
	public native int currentUnitTrainPoints();
	/** Same as <code>currentUnitTrainPoints</code>, but with float values.*/
	public native float currentUnitTrainPointsFloat();
	/** AI escrow debug text */
	public native string escrowDebugText();
	/** Text on favor mouse over */
	public native string FavorHelp();
	public native string gamespeed();
	/** The current game time, in milliseconds if the configuration option <code>showMilliseconds</code> is activated. */
	public native string gametime();
	/** Shows the current game version. */
	public native string gameVersion();
	/** @param index range: 0 - 3 */
	public native string GPRechargeTimeRemaining(int index);
	/** AI army debug text */;
	public native string kbArmyDebugText();
	/** AI resources debug text */
	public native string kbResourcesDebugText();
	/** AI unit debug text */
	public native string kbunitDebugText(int unitID);
	/** AI unit pick debug text */
	public native string kbUnitPickDebugText();
	/** 
	 * Current market buy rates
	 * @param resourceType
	 * <ul>
	 * <li>food</li>
	 * <li>wood</li>
	 * </ul>
	 */
	public native int marketBuy(string resourceType);
	/** 
	 * Current market sell rates
	 * @param resourceType
	 * <ul>
	 * <li>food</li>
	 * <li>wood</li>
	 * </ul>
	 */
	public native int marketSell(string resourceType);
	/**
	 * Maximum amount of a resource, used to display total availble favor (100 or 200). 
	 * 
	 * @param resourceType the type of resource, i.e. favor.
	 */
	public native int maxResource(string resourceType);
	/** The number of villagers currently working on the given resource type. */
	public native int numGatherers(string resourceType);
	/** The number of units of given type that are idle. */
	public native int numIdle(string protoUnit);
	/** AI plan debug text */
	public native string planDebugLines();
	/** Use -1 for current player */
	public native bool playerActive(int playerNumber);
	/** The current player's age, e.g. "Classic Age". */
	public native string playerAge(int playerNumber);
	/** The current player's civilization name. This can be set with <code>trSetCivilizationNameOverride(long playerID, string civName)</code>. */
	public native string playerCivilization(int playerNumber);
	/** The RGB-colorvalues of the current player. */
	public native string playerColor(int playerNumber);
	/** The current player's culture name. **/
	public native string playerCulture(int playerNumber);
	public native string PlayerIDNameString();
	/** The given player's nickname. */
	public native string playerName(int playerNumber);
	public native string PlayerNamestring(int playerNumber);
	/** The given player's score. */
	public native int playerScore(int playerNumber);
	/** The given player's team. */
	public native int playerTeam(int playerNumber);
	/** The given player's team score. */
	public native int playerTeamScore(int playerNumber);
	/** The current player's population in use. */
	public native int pop();
	/** The current player's population cap. */
	public native int popcap();
	/** The population help text, showing #houses, #TCs etc. */
	public native string populationHelp();
	/** Your personal productID. */
	public native string productID();
	/** AI progression debug text */
	public native string progressionDebugText();
	/**
	 * The current amount of resources of the current player.
	 * @param resourceType
	 * <ul>
	 * <li>food</li>
	 * <li>wood</li>
	 * <li>gold</li>
	 * <li>favor</li>
	 * </ul>
	 */
	public native int resource(string resourceType);
	/** The string version of a given technology ID. */
	public native string techResearchName(int techID);
	/** The percentage the given technology ID is researched so far. */
	public native int techResearchPercentage(int techID);
	public native string techResearchPercentageText(int techID);
	/** The percentage the given unitID is trained so far. */
	public native int trainUnitPercentage(int unitID);
	
	private Templates() {}
}
