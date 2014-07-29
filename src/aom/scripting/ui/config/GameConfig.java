package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to in-game settings. 
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class GameConfig {
	private GameConfig() {}
	
	/** 
	 * Aligns resource placement in the editor.   
	 */
	public bool alignResources;
	
	/**
	 * Allow units to move while attacking.
	 */
	public bool allowMovingAttacks;
	
	public bool autoSaveScenario;

	public bool autoScreenshotOnly;
	
	/** 
	 * Time in seconds between auto creating record game bookmarks.
	 */
	public int bookmarkInterval;
	
	/** 
	 * Controls the efficiency of damage v.s. special foundations.  
	 */
	public int buildDamageFactor;

	/**
	 * Defines the default building efficiency.
	 */
	public float buildEfficiency;

	/**
	 * Defines the Egyptian building efficiency.
	 * 
	 * @note Real name: buildEfficiency-Egyptian.
	 */
	public float buildEfficiency_Egyptian;
	
	public bool buildFoundationsUnderAttack;
	
	/** 
	 * Prevents the camera from being moved.
	 */
	public bool cameraMovementLock;

	/**
	 * Sets whether or not the camaign system is enabled.
	 */
	public bool campaignSystemEnabled;
	
	/** 
	 * Combat comparison mode.
	 */
	public bool combatComparison;
	
	/** 
	 * Current campaign the user is playing.
	 */
	public string currentCampaign;

	/** 
	 * Increased time penalty per age for GP in Death Match.
	 */
	public int deathmatchAgeGPTime;

	/** 
	 * Minimum time to get a GP in Death Match.
	 */
	public int deathmatchBaseGPTime;
	
	/** 
	 * Makes Attack move the default movement behavior for units.
	 */
	public bool defaultUnitAttackMove;

	/** 
	 * Stores what the default unit stance is.
	 * 0 - Agressive
	 * 1 - Defensive
	 * 2 - Passive
	 */
	public int defaultUnitStance;
	
	/** Sets the world difficulty level.*/
	public native void setWorldDifficulty(int v);
	
	/** 
	 * The difficulty level of the game.
	 * 
	 * @see #setWorldDifficulty(int)
	 */
	public int difficultyLevel;
	
	/** 
	 * Toggles drawing of editor only units.
	 */
	public bool drawEditorUnits;
	
	/** 
	 * Used to configure whether drag-select will de-prioritize villagers.  
	 */
	public bool easyDragMilitary;

	/** 
	 * Enables the rotation of the camera.
	 */
	public bool enableCameraRotation;
	
	/** With no arguments, toggles friend or foe colors. otherwise, sets it.*/
	public native void renderFriendOrFoe(int state);
	
	/** 
	 * Enables Friend or Foe colors.
	 * 
	 * @see #renderFriendOrFoe(int)
	 */
	public bool enableFriendOrFoeColors;

	/** 
	 * Enables idle military banner.
	 */
	public bool enableIdleMilitaryBanner;
	
	/**
	 * Enables auto saving in multiplayer in case of OoS.
	 */
	public bool enableMPAutoSave;
	
	/** 
	 * Enables one click garrisoning.
	 */
	public bool enableOneClickGarrison;
	
	/** 
	 * The max number of kills that contribute to experience.  
	 */
	public int experienceKillCap;

	/** 
	 * The max amount of damage bonus for a fully experienced unit.  
	 */
	public float experienceMaxDamageBonus;
	
	public bool favorConversion;
	
	/** 
	 * Chat is filtered for profanity.
	 */
	public bool filterChat;
	
	/** 
	 * Flash HP bar on any damaged unit.
	 */
	public bool flashHitpointBarsOnDamage;
	
	/**
	 * Enable footprints.
	 */
	public bool footprints;
	
	/** 
	 * Causes footprints to be seen even in cinematics.
	 */
	public bool forceFootprintsInCinematicMode;
	
	public float globalBountyFactor;
	
	public int godPowerUpdateTime;
	
	/**
	 * The global GP recharge speed multiplier.
	 */
	public float gpRechargeSpeedMultiplier;

	/**
	 * Defines the circle radius of the surface which isis momuments protect.
	 */
	public int gpShieldRadius;

	/** 
	 * How often grunts fire.
	 */
	public float gruntPercent;
	
	/** 
	 * How long you have to heal a healable-death creature before it truly shuffles off this mortal coil.  
	 */
	public int healableDeathRecoverTime;

	/** 
	 * Minimum time for SPC hero to revive.
	 */
	public int heroDeathRecoverTime;

	/** 
	 * How much space must be clear of enemies to revive.  
	 */
	public int heroDeathSearchRadius;
	
	/** 
	 * How much faster do we heal idle dudes?  
	 */
	public float idleHealBonus;
	
	/** 
	 * Scales how much faster GPs recharge in lightning mode (1.0 is standard).
	 */
	public float lightningModeGPRechargeSpeedMultiplier;
	
	/** 
	 * Specify the starting tile radius of gaia lush zone.
	 *
	 * @since AoT
	 */
	public int lushBaseRadius;

	/** 
	 * Specify the maximum tile radius of gaia lush zone.
	 * 
	 * @since AoT
	 */
	public int lushMaxRadius;

	/** 
	 * Specify the speed (in ms / tile) of gaia lush decay.
	 * 
	 * @since AoT
	 */
	public int lushRadiusDecayRate;

	/** 
	 * Specify the speed (in ms / tile) of gaia lush growth.
	 * 
	 * @since AoT
	 */
	public int lushRadiusGrowthRate;

	/** 
	 * Specify the factor of a buildings obstruction that it projects lush.  
	 *
	 * @since AoT
	 */
	public int lushSizeFactor;

	/** 
	 * Specify the frequency that lush updates are run.
	 *
	 * @since AoT
	 */
	public int lushUpdateInterval;
	
	public string map;
	
	public int marketCostDeltaBuy;

	public int marketCostDeltaSell;

	public int marketCostMax;

	public int marketCostMin;

	public float marketTradeFactor;
	
	/**
	 * The maximum flying unit height.
	 */
	public int maximumFlyingUnitHeight;
	
	/** 
	 * Prayer never gets less efficient than this.
	 */
	public float minPrayerEfficiency;
	
	/** 
	 * If the trade system would normally give you less than this, you get zero instead.  
	 */
	public int minTradeAmount;

	/** 
	 * Determines how far you have to go, in meters, to get any trade benefit.  
	 */
	public int minTradeDistance;
	
	/**
	 * Defines the autosave intervals.
	 */
	public int mpAutoSaveInterval;
	
	/** 
	 * Turns off animal wandering.
	 */
	public bool noWander;
	
	/**
	 * Enables post game.
	 */
	public bool postGameEnabled;
	
	/**
	 * Defines favor income parameters.
	 */
	public float prayerEfficiencyExpBase;

	/**
	 * Defines favor income parameters.
	 */
	public float prayerEfficiencyExponent;

	/**
	 * Defines favor income parameters.
	 */
	public float prayerEfficiencyExpScale;

	/**
	 * Defines favor income parameters.
	 */
	public float prayerEfficiencyLinearPenalty;

	/** 
	 * Each subsequent praying dude is this much less efficient.
	 */
	public float prayerEfficiencyPenalty;
	
	/**
	 * Record games.
	 */
	public bool recordGame;

	/** 
	 * Toggle view lock when replaying a game.
	 */
	public bool recordGameViewLock;

	/**
	 * Refund trained units of building gets destroyed.
	 */
	public bool refundTrainsOnDeath;

	/**
	 * Default regeneration rate.
	 */
	public float regenerationRate;

	/**
	 * Gaia's regeneration rate.
	 * 
	 * @since AoT
	 */
	public float regenerationRateGaia;
	
	/**
	 * The repair speed factor.
	 */
	public float repairFactor;
	
	public int scenarioPlaytestdifficultyLevel;
	
	/**
	 * The chance a hades unit becomes a shade upon death.
	 */
	public float shadeChance;
	
	/**
	 * The time delay before a shade appears.
	 */
	public int shadeDelay;
	
	/** 
	 * Foundations under attack from ships further have their damage adjusted by this factor.  
	 */
	public float shipFoundationDamageFactor;
	
	/** 
	 * How far out super-predators can wander.
	 */
	public int superPredatorWanderRadius;
	
	/** 
	 * How much a Titan's attacks shake the camera.
	 * 
	 * @since AoT
	 */
	public float titanAttackCameraShakeStrength;

	/** 
	 * How far out from a Titan the camera can shake.
	 * 
	 * @since AoT
	 */
	public float titanCameraShakeRadius;

	/**
	 * Set titan level AI handicap.
	 * 
	 * @since AoT
	 */
	public int titanHandicap;
	
	/** 
	 * How much a Titan's footsteps shake the camera.
	 * 
	 * @since AoT
	 */
	public float titanMoveCameraShakeStrength;
	
	/** 
	 * Foundations under attack from shooting buildings further have their damage adjusted by this factor.  
	 */
	public float towerFoundationDamageFactor;
	
	/** 
	 * Trade multiplier when trading with allied TC.
	 */
	public float tradeBonusAlly;

	/** 
	 * Trade multiplier when trading with enemy TC.
	 */
	public float tradeBonusEnemy;

	/** 
	 * Trade multiplier when trading with neutral TC.
	 */
	public float tradeBonusNeutral;
	
	/**
	 * The tribute penalty.
	 * 
	 * Default: 0.1
	 */
	public float tributePenalty;

	/**
	 * Allows to tribute without a market.
	 */
	public bool tributeWithoutMarket;
	
	/** 
	 * Controls how fast deconstruction GP buildings unbuild.  
	 */
	public float unbuildFactor;

	/** 
	 * Controls how fast Kronos buildings & units unbuild.  
	 */
	public float unbuildFactorLinked;

	/**
	 * The category 1 unbuild favor cost.
	 */
	public int unbuildFavorCost;

	/**
	 * The category 2 unbuild favor cost.
	 */
	public int unbuildFavorCost2;

	/**
	 * The category 1 unbuild food cost.
	 */
	public int unbuildFoodCost;

	/**
	 * The category 2 unbuild food cost.
	 */
	public int unbuildFoodCost2;

	/**
	 * The category 1 unbuild gold cost.
	 */
	public int unbuildGoldCost;

	/**
	 * The category 2 unbuild gold cost.
	 */
	public int unbuildGoldCost2;

	/**
	 * The category 1 unbuild wood cost.
	 */
	public int unbuildWoodCost;

	/**
	 * The category 2 unbuild wood cost.
	 */
	public int unbuildWoodCost2;
	
	/** 
	 * Controls how much of earned favor goes into bonus accumulator.
	 * Is this the famous hidden Loki favor pool?
	 */
	public float unitBonusBountyModifier;
	
	/** 
	 * Unlocks all SPC scenarios for all campaigns.
	 */
	public bool unlockAllSpcScenarios;

	/**
	 * Unlock the replay functionality.
	 */
	public bool unlockReplay;
	
	/** 
	 * Controls the efficiency of damage vs upgrading.  
	 */
	public float upgradeDamageFactor;
}
