package aom.scripting.xs.tr;

/**
 * This is an enumeration of all parameter types a trigger can use as input.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public enum TriggerParamType {
	/**
	 * An input box for integers.
	 * @example {@code -1}
	 */
	LONG,
	
	/**
	 * An input box for floats.
	 * @example {@code -1.0}
	 */
	FLOAT,
	
	/**
	* An input box for strings.
	* @example {@code default}
	*/
	STRING,
	
	/**
	* Seems to be the same as string, but it may have internal differences.
	* @example {@code default}
	*/
	STRINGID,
	
	/**
	* A button that can be switched ON or OFF. Returns either {@code true} or {@code false}.
	*/
	BOOL,
	
	/**
	* A "select unit" style button that returns the <i>name</i> of the selected unit.
	* @example {@code 5}
	*/
	UNIT,
	
	/**
	* Army selection tools.
	* @example {@code 1,11} (player 1, army 11)
	*/
	GROUP,
	
	/**
	* A "select area" style button.
	* @example {@code 0, 0, 0}
	*/
	AREA,
	
	/**
	* Select sound style tools.
	* 
	* @note Yes, that's a correct example. The 1 seems to be ununsed, might be something like volume level though.
	* @example {@code music_file","1}
	*/
	SOUND,
	
	/**
	 * A set of "Set Cut" style buttons.
	 * Returns 4 vectors (position, direction, up, right) that exactly define the current camera position.
	 */
	CAMERAINFO,
	
	/**
	* A drop down list of camera tracks.
	* @example {@code My_Camera_Track}
	*/
	CAMTRACK,
	
	/**
	 * A drop down list of operators.
	 * Two sets are available:
	 * <code>
	 * <ul>
	 * <li>&gt;</li>
	 * <li>&gt;=</li>
	 * <li>==</li>
	 * <li>&lt;=</li>
	 * <li>&lt;</li>
	 * </ul>
	 * or
	 * <ul>
	 * <li>+</li>
	 * <li>-</li>
	 * <li>*</li>
	 * <li>/</li>
	 * </ul>
	 * </code>
	 * The choice of set is decided by the default value you enter.
	 */
	OPERATOR,
	
	/**
	* A drop down list of player numbers. Does not contain player 11 and 12. Therefore, you better use LONG to choose a player.
	* @example {@code 1}
	*/
	PLAYER,
	
	/**
	* A drop down list of technologies.
	* @see <a href="{@docRoot}/AI XReference.xs">Technology Constants in AI Reference.</a>
	* 
	* @example {@code 123}
	*/
	TECH,
	
	/**
	* A drop down list of different unit types.
	* @example {@code Villager Greek}
	*/
	PROTOUNIT,
	
	/**
	* A drop down list of diplomacy settings.
	* Returns either {@code Ally}, {@code Neutral} or {@code Enemy}.
	*/
	ALLIANCE,
	
	/**
	* A drop down list of statistics.
	* 
	* Complete List:
	* <ol start="0">
		<li>Tribute Received</li>
		<li>Tribute Sent</li>
		<li>Enemy Units Killed</li>
		<li>Enemy Builings Killed</li>
		<li>Units Killed Cost</li>
		<li>Buildings Killed Cost</li>
		<li>Units Lost</li>
		<li>Builings Lost</li>
		<li>Units Lost Cost</li>
		<li>Buildings Lost Cost</li>
		<li>Map Explored</li>
		<li>Trade Profit</li>
		<li>MIlitary Count</li>
		<li>Research Count Complete</li>
		<li>Research Total Cost</li>
		<li>Wonder Time</li>
		<li>Raw Score</li>
		<li>Relic High</li>
		<li>Economic Unit High</li>
		<li>Settlement High</li>
		</ol>
	*
	* @example {@code 0}
	*/
	KBSTAT,
	
	/**
	* A drop down list of god powers.
	* @example {@code Reverse Time}
	*/
	GODPOWER,
	
	/**
	* A drop down list of resources.
	* Returns either {@code food}, {@code wood}, {@code gold} or {@code favor}.
	*/
	RESOURCE,
	
	/**
	* A drop down list of triggers.
	* @example {@code Trigger0}
	*/
	EVENT,
	
	/**
	* A drop down list of possible technology statuses.
	* 
	* @see <a href="{@docRoot}/AI XReference.xs">Technology Status Constants in AI Reference.</a>
	* 
	* @example {@code 1}
	*/
	TECHSTATUS,
	
	/**
	* A drop down list of unit stances.
	* Returns either {@code Aggressive}, {@code Defensive} or {@code Passive}.
	*/
	UNITSTANCE,
	
	/**
	* A drop down list of UI categories.
	* 
	* Complete List:
	* <ol start="0">
		<li>market</li>
		<li>market2</li>
		<li>setgather</li>
		<li>cleargather</li>
		<li>eject</li>
		<li>garrison</li>
		<li>transform</li>
		<li>stance1</li>
		<li>stance2</li>
		<li>stance3</li>
		<li>townbell</li>
		<li>returntowork</li>
		<li>guard</li>
		<li>patrol</li>
		<li>AgeUp1</li>
		<li>AgeUp2</li>
		<li>AgeUp3</li>
		<li>Repair</li>
		<li>Empower</li>
		<li>CombatOn</li>
		<li>CombatOff</li>
		<li>Formation1</li>
		<li>Formation2</li>
		<li>Formation3</li>
		<li>Formation4</li>
		<li>Delete</li>
		<li>Stop</li>
		<li>Unbuild</li>
		<li>Unbuild2</li>
		<li>SummonWorkers</li>
		</ol>
	*
	* @example {@code 1}
	* 
	*/
	UICATEGORY,
	
	/**
	* A drop down list of modifiable unit fields.
	* 
	* Complete List:
	* <ol start="0">
		<li>HP</li>
		<li>Speed</li>
		<li>LOS</li>
		<li>Train Points</li>
		<li>Build Points</li>
		<li>Max Contained</li>
		<li>Pop Count</li>
		<li>Pop Cap Addition</li>
		<li>Lifespan</li>
		<li>Recharge Time</li>
		<li>Build Limit</li>
		<li>Range</li>
		<li>Minimum Range</li>
		<li>Num. Projectiles</li>
		<li>Healing Rate</li>
		<li>Healing Range</li>
		<li>Cost Gold</li>
		<li>Cost Wood</li>
		<li>Cost Food</li>
		<li>Cost Favor</li>
		<li>Carry Capacity Gold</li>
		<li>Carry Capacity Wood</li>
		<li>Carry Capacity Food</li>
		<li>Carry Capacity Favor</li>
		<li>Armor Hack</li>
		<li>Armor Pierce</li>
		<li>Armor Crush</li>
		<li>Hand Attack Hack</li>
		<li>Hand Attack Pierce</li>
		<li>Hand Attack Crush</li>
		<li>Ranged Attack Hack</li>
		<li>Ranged Attack Pierce</li>
		<li>Ranged Attack Crush</li>
		<li>Hand Bonus v. Myth</li>
		<li>Hand Bonus v. Hero</li>
		<li>Hand Bonus v. Cavalry</li>
		<li>Hand Bonus v. Infantry</li>
		<li>Hand Bonus v. Archer</li>
		<li>Hand Bonus v. Siege</li>
		<li>Hand Bonus v. Tower</li>
		<li>Hand Bonus v. Ship</li>
		<li>Hand Bonus v. Buildings</li>
		<li>Hand Bonus v. Villagers</li>
		<li>Hand Bonus v. Huntable Animal</li>
		<li>Ranged Bonus v. Myth</li>
		<li>Ranged Bonus v. Hero</li>
		<li>Ranged Bonus v. Cavalry</li>
		<li>Ranged Bonus v. Infantry</li>
		<li>Ranged Bonus v. Archer</li>
		<li>Ranged Bonus v. Siege</li>
		<li>Ranged Bonus v. Tower</li>
		<li>Ranged Bonus v. Ship</li>
		<li>Ranged Bonus v. Buildings</li>
		<li>Ranged Bonus v. Villagers</li>
		<li>Ranged Bonus v. Huntable Animal</li>
		</ol>
	* 
	* @example {@code 2}
	*/
	PUFIELD;
}
