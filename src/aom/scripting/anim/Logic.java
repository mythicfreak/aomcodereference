package aom.scripting.anim;

/**
 * This enum lists all possible logics that can be used in an anim script.
 * 
 * A typical logic construct using parameters is as follows:
 * <pre>
 *    ExampleLogic param_1/param_2/.../param_n
 *    set hotspot
 *    {
 *       version
 *       {
 *          //do stuff when param_1 applies
 *       }
 *    }
 *    set hotspot
 *    {
 *       version
 *       {
 *          //do stuff when param_2 applies
 *       }
 *    }
 *    set hotspot {...}
 *    set hotspot
 *    {
 *       version
 *       {
 *          //do stuff when param_n applies
 *       }
 *    }
 * </pre>
 * 
 * A typical logic construct without parameters is similar to this:
 * <pre>
 *    ExampleLogic
 *    set hotspot
 *    {
 *       version
 *       {
 *          //do stuff when "example" is not true/active/enabled/...
 *       }
 *    }
 *    set hotspot
 *    {
 *       version
 *       {
 *          //do stuff when "example" is true/active/enabled/...
 *       }
 *    }
 * </pre>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public enum Logic {
	/**
	 * Checks whether this unit is worked on.
	 * 
	 * First section: not worked on.
	 * Second section: worked on.
	 *
	 * @example A buoy is added to fish being gathered from.
	 */
	WorkedOnLogic,
	
	/**
	 * Checks whether this unit contains another unit.
	 * 
	 * First section: nothing contained.
	 * Second section: something (e.g. relic) contained.
	 */
	ContainLogic,
	
	LastItemLogic,
	
	/** 
	 * Checks whether this unit is being empowered by another unit.
	 * 
	 * First section: not empowered.
	 * Second section: empowered.
	 */
	EmpowerLogic,
	
	/**
	 * Possible checks whether a specific God Power has been used yet.
	 */
	UsedLogic,
	
	ItemLogic,
	
	/** 
	 * Checks whether this unit carries a specific resource.
	 * Parameters are separated by slashes.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param carry_1 (e.g. grain)
	 * @param carry_2 (e.g. meat)
	 * @param carry_3 (e.g. fish)
	 * @param carry_4 (e.g. wood)
	 * @param carry_n (e.g. gold)
	 * 
	 * @note There is no "none" options here. To solve this, an inventory check 
	 * can be done first to determine whether the unit is effectively holding something.
	 * 
	 * @see #InventoryLogic
	 */
	CarryTypeLogic,
	
	/** 
	 * Checks whether the game is in cinematic mode.
	 * 
	 * First section: not in cinematic mode.
	 * Second section: in cinematic mode.
	 */
	CinematicLogic,
	
	/**
	 * Possible checks whether a specific God Power is still available.
	 */ 
	PowerLogic,
	
	/**
	 * Checks whether this unit (e.g. gold mine) has left only a specific percentage of the initial resources.
	 * Parameters are separated by spaces.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param int_1 (e.g. 100)
	 * @param int_2 (e.g. 50)
	 * @param int_n (e.g. 25)
	 */
	ResourceLogic,
	
	/**
	 * Checks whether this unit has an amount of resource in its inventory.
	 * Parameters are separated by spaces.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * When checking whether a unit is holding something (e.g. relic, resources), the parameters are: <code>0 1</code>.
	 * When checking how much a herdable has fattened, possible parameters are (for example): <code>25 75</code>.
	 */
	InventoryLogic,
	
	/**
	 * Checks whether this unit has suffered (more than) a specific percentage of damage.
	 * Possible parameters are: <code>0 25 100</code>.
	 */
	DamageLogic,
	
	/** 
	 * Checks whether the game is in editor mode.
	 * 
	 * First section: not in editor mode.
	 * Second section: in editor mode.
	 */
	EditorModeLogic,
	
	/**
	 * Checks whether this unit should use sprites.
	 * 
	 * First section: should not use sprites.
	 * Second section: should use sprites.
	 */
	SpriteLogic,
	
	/**
	 * Checks whether this unit is frozen.
	 * 
	 * First section: unit is not frozen.
	 * Second section: unit is frozen.
	 */
	FrozenLogic,
	
	
	/** Checks whether this unit is owned by a specific civilization.
	 * Parameters are separated by slashes.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param civ_1 (e.g. zeus)
	 * @param civ_2 (e.g. hades)
	 * @param civ_n More than two civilization can be provided.
	 * 
	 * @example <code>civilizationLogic none/set</code> determines whether this unit is under Set's control.
	 */
	CivilizationLogic,
	
	/**
	 * Checks whether a specific technology has been researched yet.
	 * Parameters are separated by slashes.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param tech_1 (e.g. none)
	 * @param tech_2 (e.g. plow)
	 * @param tech_n More than two technologies can be provided.
	 */
	TechLogic,
	
	/**
	 * Checks whether this unit is being upgraded to the next stage (i.e. Settlement -> Town Center).
	 * Parameters are separated by spaces.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param int_1 (e.g. 0)
	 * @param int_2 (e.g. 25)
	 * @param int_n (e.g. 100)
	 */
	UpgradeLogic,
	
	/**
	 * Checks whether this unit has earned a specific percentage of experience.
	 * Parameters are separated by spaces.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param int_1 (e.g. 0)
	 * @param int_2 (e.g. 25)
	 * @param int_n (e.g. 100)
	 */
	ExperienceLogic,
	
	/**
	 * Checks whether this unit is in an specific percentage of construction.
	 * Parameters are separated by spaces.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param int_1 (e.g. 0)
	 * @param int_2 (e.g. 25)
	 * @param int_n (e.g. 100)
	 */
	ConstructionLogic,
	
	/**
	 * Checks whether the player has advanced to a specific age yet.
	 */
	AgeLogic,
	
	/**
	 * Checks whether this unit is targeting a specific unit type.
	 * Parameters are separated by slashes.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param unitttype_1 (e.g. none)
	 * @param unitttype_2 (e.g. abstractTitan)
	 * @param unitttype_n More than two unit types can be provided.
	 * 
	 * @example Titans attack other Titans in a different fashion compared to regular units.
	 */
	TargetLogic,
	
	/**
	 * Checks whether this unit is using one of its variations.
	 * 
	 * Each section corresponds to 1 of the possible variations respectively.
	 * 
	 * @example Male and Female Villagers look differently.
	 */
	VariationLogic,
	
	/**
	 * Checks whether this unit is owned by a specific culture.
	 * Parameters are separated by slashes.
	 * Each section corresponds to 1 of the parameters respectively, in the order they are provided.
	 * 
	 * @param culture_1 (e.g. Egyptian)
	 * @param culture_2 (e.g. Greek)
	 * @param culture_3 (e.g. Norse)
	 * @param culture_4 (e.g. Atlantean)
	 */
	CultureLogic;
}
