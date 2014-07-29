package aom.scripting.xs.tr.addons;

import aom.scripting.datatypes.*;

/**
 * <p>The purpose of this loader is to make the life of AoT trigger scripters easier.
 * Just ask the users to include this load trigger in their scenario. This allows you 
 * to call any function and constant in this file from within any future trigger code.</p>
 * 
 * <p>Other than the basic functions, we have also provided a trigger framework for 
 * some of the new assets. Expect this framework to expand with every next release.</p>
 * 
 * <p>We accept trigger codes from everyone who is willing to offer them. Of course the 
 * authors get full credit for their work. Also additional ideas are welcome, so we
 * can try to work them out for you.</p>
 * 
 * So far it includes:
 * <ul>
 * <li>Useful constants from the AIx file (not all), and some others like PI and E.</li>
 * <li>The cMyID, cMyCiv, cMyCulture, cNumberNonGaiaPlayers and cGameMode variables.</li>
 * <li>String Manipulation</li>
 * <li>Array system</li>
 * <li>Vector QVs </li>
 * <li>String QVs</li>
 * <li>Army QVs </li>
 * <li>Quest Arrays</li>
 * <li>Math Functions</li>
 * <li>UI Functions</li>
 * <li>Miscellaneous Functions</li>
 * </ul> 
 *  
 * @author Mythic_Freak & invent00r
 * @version 2.02 (for AoT)
 * 
 * <br /><br />Change log:<br />
 * v2.02x: (14/02/2010) Minor bug fix in xsArraySet.<br />
 * v2.01x: (05/09/2009) Minor bug fix in Math_atan. <br /> 
 * v2.00x: (06/08/2008) Major update: lots of bug fixes, added array functionality and a trigger framework.<br /> 
 * v1.02x: (22/05/2008) Took out xsRestoreContextPlayer() to avoid confusion, and added some more functions.<br />
 * v1.01x: (17/05/2008) Added a few extra functions.<br />
 * v1.00x: (16/05/2008) Initial release and generated API.<br /><br />
 */
public abstract class TriggerLoaderX {
	 /**
     * The <code>double</code> value that is closer than any other to
     * <i>pi</i>, the ratio of the circumference of a circle to its
     * diameter.
     */
	public static final double PI = 3.14159265358979323846;
	
	 /**
     * The <code>double</code> value that is closer than any other to
     * <i>e</i>, the base of the natural logarithms known as Euler's number.
     */
	public static final double e = 2.71828182845904523536;
	
	//Internal Vars:
	@SuppressWarnings("unused")
	private float seed = 0;
	@SuppressWarnings("unused")
	private bool isMultiplayer = new bool(true);
	@SuppressWarnings("unused")
	private float M = 233280;
	@SuppressWarnings("unused")
	private float A = 9301;
	@SuppressWarnings("unused")
	private float C = 4927;
	@SuppressWarnings("unused")
	private int trQuestVarsN = 0;
	@SuppressWarnings("unused")
	private int trQuestVarsOP = 0;
	@SuppressWarnings("unused")
	private int FP = -1;
	//Globals:
	/**
	 * The current player number. Does not change by xsSetContextPlayer().
	 */
	public static final int cMyID;
	
	/**
	 * The total number of players in a game, mother nature excluded.
	 */
	public static final int cNumberNonGaiaPlayers;
	
	/**
	 * The culture ID, can be:
	 * <li>cCultureGreek</li>
	 * <li>cCultureEgyptian</li>
	 * <li>cCultureNorse</li>
	 * <li>cCultureAtlantean</li>
	 * <li>cCultureNature</li>
	 */
	public static final int cMyCulture;
	
	/**
	 * The civilization ID, can be:
	 * <li>cCivZeus</li>
	 * <li>cCivHades</li>
	 * <li>cCivPoseidon</li>
	 * <li>cCivIsis</li>
	 * <li>cCivRa</li>
	 * <li>cCivSet</li>
	 * <li>cCivLoki</li>
	 * <li>cCivThor</li>
	 * <li>cCivOdin</li>
	 * <li>cCivGaia</li>
	 * <li>cCivKronos</li>
	 * <li>cCivOuranos</li>
	 * <li>cCivGreek</li>
	 * <li>cCivNorse</li>
	 * <li>cCivEgyptian</li>
	 * <li>cCivAtlantean</li>
	 * <li>cCivRandom</li>
	 * <li>cCivNature</li>
	 */
	public static final int cMyCiv;
	
	/**
	 * The current game mode, possible options:
	 * <ul>
	 * <li>cGameModeSupremacy</li>
	 * <li>cGameModeConquest</li>
	 * <li>cGameModeLightning</li>
	 * <li>cGameModeDeathmatch</li>
	 * </ul>
	 * 
	 * @note Scenarios will always return cGameModeSupremacy.
	 */
	public final static int cGameMode;
/*	
	//Unit Stances:
	public static final int cUnitStanceAggressive=0;
	public static final int cUnitStanceDefensive=1;
	public static final int cUnitStancePassive=2;
	//Victory Condition/Game Mode Types:
	public static final int cGameModeSupremacy=0;
	public static final int cGameModeConquest=1;
	public static final int cGameModeLightning=2;
	public static final int cGameModeDeathmatch=3;
	//Difficulty Levels:
	public static final int cDifficultyEasy=0;
	public static final int cDifficultyModerate=1;
	public static final int cDifficultyHard=2;
	public static final int cDifficultyNightmare=3;
	//Age constants:
	public static final int cAge1=0;
	public static final int cAge2=1;
	public static final int cAge3=2;
	public static final int cAge4=3;
	public static final int cAge5=4;
	//Player Relation constants:
	public static final int cPlayerRelationAny=-1;
	public static final int cPlayerRelationSelf=0;
	public static final int cPlayerRelationEnemy=2;
	public static final int cPlayerRelationAlly=1;
	//ProtoPower constants:
	public static final int cPowerLure=0;
	public static final int cPowerCarnivora=1;
	public static final int cPowerBlessingofZeus=2;
	public static final int cPowerBolt=3;
	public static final int cPowerBronzeXP05=4;
	public static final int cPowerBronze=5;
	public static final int cPowerCeaseFireNomad=6;
	public static final int cPowerCeaseFire=7;
	public static final int cPowerChangeCaladria=8;
	public static final int cPowerChangeChimera=9;
	public static final int cPowerChangeCyclops=10;
	public static final int cPowerChangeHydra=11;
	public static final int cPowerChangeManticore=12;
	public static final int cPowerChangeNemean=13;
	public static final int cPowerChaos=14;
	public static final int cPowerChickenStorm=15;
	public static final int cPowerCitadel=16;
	public static final int cPowerDwarvenMine=17;
	public static final int cPowerCurse=18;
	public static final int cPowerEarthquake=19;
	public static final int cPowerEclipse=20;
	public static final int cPowerFlamingWeapons=21;
	public static final int cPowerForestFire=22;
	public static final int cPowerFrost=23;
	public static final int cPowerGaiaForestSPC=24;
	public static final int cPowerGaiaForest=25;
	public static final int cPowerGoatunheim=26;
	public static final int cPowerGreatHunt=27;
	public static final int cPowerHealingSpring=28;
	public static final int cPowerHeroize=29;
	public static final int cPowerHesperides=30;
	public static final int cPowerImplode=31;
	public static final int cPowerLightningStorm=32;
	public static final int cPowerLocustSwarm=33;
	public static final int cPowerMeteor=34;
	public static final int cPowerNidhogg=35;
	public static final int cPowerPestilence=36;
	public static final int cPowerPlenty=37;
	public static final int cPowerProsperity=38;
	public static final int cPowerRagnorok=39;
	public static final int cPowerRain=40;
	public static final int cPowerRestoration=41;
	public static final int cPowerDeconstruction=42;
	public static final int cPowerReverseWonder=43;
	public static final int cPowerShiftingSands=44;
	public static final int cPowerSeedofGaia=45;
	public static final int cPowerSentinel=46;
	public static final int cPowerPlagueofSerpents=47;
	public static final int cPowerAncestors=48;
	public static final int cPowerFimbulwinter=49;
	public static final int cPowerSonofOsiris=50;
	public static final int cPowerSPCLightningStorm=51;
	public static final int cPowerSPCMeteor=52;
	public static final int cPowerSpiders=53;
	public static final int cPowerSpy=54;
	public static final int cPowerTartarianGate=55;
	public static final int cPowerTitanGate=56;
	public static final int cPowerTornadoXP05=57;
	public static final int cPowerTornado=58;
	public static final int cPowerTraitors=59;
	public static final int cPowerTraitorsSPC=60;
	public static final int cPowerTremor=61;
	public static final int cPowerUndermine=62;
	public static final int cPowerUnderworldPassage=63;
	public static final int cPowerVision=64;
	public static final int cPowerVolcano=65;
	public static final int cPowerVortex=66;
	public static final int cPowerWalkingBerryBushes=67;
	public static final int cPowerWalkingWoods=68;
	public static final int cPowerWellOfUrd=69;
	//Power Type constants:
	public static final int cPowerTypeGeneric=0;
	public static final int cPowerTypeTempUnit=1;
	public static final int cPowerTypeLightning=2;
	public static final int cPowerTypeFrost=3;
	public static final int cPowerTypeLocust=4;
	public static final int cPowerTypeTeleport=5;
	public static final int cPowerTypeMeteor=6;
	public static final int cPowerTypeInferno=7;
	public static final int cPowerTypeHealing=8;
	public static final int cPowerTypeEnrage=9;
	public static final int cPowerTypeClone=10;
	public static final int cPowerTypeDamageUnit=11;
	public static final int cPowerTypeTornado=12;
	public static final int cPowerTypeRain=13;
	public static final int cPowerTypeUndermine=14;
	public static final int cPowerTypeSnowStorm=15;
	public static final int cPowerTypeBronze=16;
	public static final int cPowerTypePeace=17;
	public static final int cPowerTypeProsperity=18;
	public static final int cPowerTypeEclipse=19;
	public static final int cPowerTypeShowUnit=20;
	public static final int cPowerTypeBolt=21;
	public static final int cPowerTypeSpy=22;
	public static final int cPowerTypeTechActivate=23;
	public static final int cPowerTypeAnimalMagnet=24;
	public static final int cPowerTypeHealingSpring=25;
	public static final int cPowerTypeSwapUnit=26;
	public static final int cPowerTypeRebellion=27;
	public static final int cPowerTypeSandstorm=28;
	public static final int cPowerTypeEarthquake=29;
	public static final int cPowerTypePlenty=30;
	public static final int cPowerTypeForestFire=31;
	public static final int cPowerTypeFlamingWeapons=32;
	public static final int cPowerTypeDwarvenMines=33;
	public static final int cPowerTypePestilence=34;
	public static final int cPowerTypeReverseTime=35;
	public static final int cPowerTypeTraitors=36;
	public static final int cPowerTypeVolcano=37;
	public static final int cPowerTypeTremor=38;
	public static final int cPowerTypeTartarianGate=39;
	public static final int cPowerTypeVortex=40;
	public static final int cPowerTypeHesperides=41;
	public static final int cPowerTypeChaos=42;
	public static final int cPowerTypeSpiders=43;
	public static final int cPowerTypeHeroize=44;
	public static final int cPowerTypeImplode=45;
	public static final int cPowerTypeTitanGate=46;
	public static final int cPowerTypeGaiaForest=47;
	public static final int cPowerTypeCarnivora=48;
	//Unit Movement Types:
	public static final int cMovementTypeNone=0;
	public static final int cMovementTypeLand=1;
	public static final int cMovementTypeWater=2;
	public static final int cMovementTypeAir=4;
	public static final int cMovementTypeNonSolid=8;
	//KB Unit States:
	public static final int cUnitStateNone=0;
	public static final int cUnitStateBuilding=1;
	public static final int cUnitStateAlive=2;
	public static final int cUnitStateDead=4;
	public static final int cUnitStateAny=255;
	public static final int cUnitStateAliveOrBuilding=3;
	//Civs:
	public static final int cCivZeus=0;
	public static final int cCivPoseidon=1;
	public static final int cCivHades=2;
	public static final int cCivIsis=3;
	public static final int cCivRa=4;
	public static final int cCivSet=5;
	public static final int cCivOdin=6;
	public static final int cCivThor=7;
	public static final int cCivLoki=8;
	public static final int cCivKronos=9;
	public static final int cCivOuranos=10;
	public static final int cCivGaia=11;
	public static final int cCivRandom=12;
	public static final int cCivGreek=13;
	public static final int cCivNorse=14;
	public static final int cCivEgyptian=15;
	public static final int cCivAtlantean=16;
	public static final int cCivNature=17;
	//Cultures:
	public static final int cCultureGreek=0;
	public static final int cCultureEgyptian=1;
	public static final int cCultureNorse=2;
	public static final int cCultureAtlantean=3;
	public static final int cCultureNature=4;
	//Resources:
	public static final int cResourceGold=0;
	public static final int cResourceWood=1;
	public static final int cResourceFood=2;
	public static final int cResourceFavor=3;
	public static final int cAllResources=-1234;
	//Unit Action constants:
	public static final int cActionBored=0;
	public static final int cActionBuild=1;
	public static final int cActionConvert=2;
	public static final int cActionDeath=3;
	public static final int cActionDecay=4;
	public static final int cActionGather=5;
	public static final int cActionHandAttack=6;
	public static final int cActionHeal=7;
	public static final int cActionHunting=8;
	public static final int cActionIdle=9;
	public static final int cActionMove=10;
	public static final int cActionMoveByGroup=11;
	public static final int cActionRangedAttack=12;
	public static final int cActionRepair=13;
	public static final int cActionResearch=14;
	public static final int cActionTrain=15;
	public static final int cActionOverrideAnimation=16;
	public static final int cActionWork=17;
	public static final int cActionAttack=18;
	public static final int cActionUnused0=19;
	public static final int cActionWander=20;
	public static final int cActionEnter=21;
	public static final int cActionAutoConvert=22;
	public static final int cActionBirth=23;
	public static final int cActionAreaAttack=24;
	public static final int cActionFreeze=25;
	public static final int cActionDormant=26;
	public static final int cActionGatherPoint=27;
	public static final int cActionMoveAttack=28;
	public static final int cActionThrown=29;
	public static final int cActionLightning=30;
	public static final int cActionLight=31;
	public static final int cActionJumpAttack=32;
	public static final int cActionUnused1=33;
	public static final int cActionMeteor=34;
	public static final int cActionAttach=35;
	public static final int cActionGuide=36;
	public static final int cActionJumpMove=37;
	public static final int cActionPickup=38;
	public static final int cActionDiveBomb=39;
	public static final int cActionUnused2=40;
	public static final int cActionRegenerate=41;
	public static final int cActionUse=42;
	public static final int cActionEmpower=43;
	public static final int cActionAutoGather=44;
	public static final int cActionThrow=45;
	public static final int cActionGore=46;
	public static final int cActionDropoff=47;
	public static final int cActionWhirlwindAttack=48;
	public static final int cActionChargedRangedAttack=49;
	public static final int cActionEject=50;
	public static final int cActionFreezeAttack=51;
	public static final int cActionConvertAttack=52;
	public static final int cActionTrade=53;
	public static final int cActionGuard=54;
	public static final int cActionAutoMover=55;
	public static final int cActionGetOnMover=56;
	public static final int cActionSwallow=57;
	public static final int cActionGate=58;
	public static final int cActionLightningAttack=59;
	public static final int cActionExplore=60;
	public static final int cActionEat=61;
	public static final int cActionBoost=62;
	public static final int cActionCorpseDecay=63;
	public static final int cActionTeleport=64;
	public static final int cActionBuckAttack=65;
	public static final int cActionTownBell=66;
	public static final int cActionHeroDeath=67;
	public static final int cActionUnbuild=68;
	public static final int cActionAutoLOS=69;
	//Tech Status:
	public static final int cTechStatusUnobtainable=0;
	public static final int cTechStatusObtainable=1;
	public static final int cTechStatusAvailable=2;
	public static final int cTechStatusResearching=3;
	public static final int cTechStatusActive=4;
	public static final int cTechStatusPersistent=5;
	//Area Types:
	public static final int cAreaTypeForest=1;
	public static final int cAreaTypeWater=2;
	public static final int cAreaTypeImpassableLand=3;
	public static final int cAreaTypeGold=4;
	public static final int cAreaTypeSettlement=5;
	//AreaGroup Types:
	public static final int cAreaGroupTypeLand=0;
	public static final int cAreaGroupTypeWater=1;
	//KB TechTree Unit Functions:
	public static final int cUnitFunctionBuilder=0;
	public static final int cUnitFunctionGatherer=1;
	public static final int cUnitFunctionEmpower=2;
	public static final int cUnitFunctionFish=3;
	public static final int cUnitFunctionWaterTransport=4;
	public static final int cUnitFunctionTrade=5;
	public static final int cUnitFunctionUnknown=6;
	//KB TechTree Upgrade Types:
	public static final int cUpgradeTypeAttack=0;
	public static final int cUpgradeTypeArmor=1;
	public static final int cUpgradeTypeHitpoints=2;
	public static final int cUpgradeTypeSpeed=3;
	public static final int cUpgradeTypeWorkRate=4;
	public static final int cUpgradeTypeTrainPoints=5;
	public static final int cUpgradeTypeAny=6;
	//Techs: 507 total
	public static final int cTechAge1=0;
	public static final int cTechAge2=1;
	public static final int cTechAge3=2;
	public static final int cTechMediumArchers=3;
	public static final int cTechHeavyArchers=4;
	public static final int cTechChampionArchers=5;
	public static final int cTechMediumInfantry=6;
	public static final int cTechHeavyInfantry=7;
	public static final int cTechChampionInfantry=8;
	public static final int cTechHusbandry=9;
	public static final int cTechPlow=10;
	public static final int cTechIrrigation=11;
	public static final int cTechCopperWeapons=12;
	public static final int cTechBronzeWeapons=13;
	public static final int cTechIronWeapons=14;
	public static final int cTechCopperMail=15;
	public static final int cTechBronzeMail=16;
	public static final int cTechIronMail=17;
	public static final int cTechCopperShields=18;
	public static final int cTechBronzeShields=19;
	public static final int cTechIronShields=20;
	public static final int cTechAmbassadors=21;
	public static final int cTechTaxCollectors=22;
	public static final int cTechCoinage=23;
	public static final int cTechMediumCavalry=24;
	public static final int cTechHeavyCavalry=25;
	public static final int cTechChampionCavalry=26;
	public static final int cTechWatchTower=27;
	public static final int cTechGuardTower=28;
	public static final int cTechBallistaTower=29;
	public static final int cTechBoilingOil=30;
	public static final int cTechLevyInfantry=31;
	public static final int cTechBurningPitch=32;
	public static final int cTechMasons=33;
	public static final int cTechPickaxe=34;
	public static final int cTechHandAxe=35;
	public static final int cTechShaftMine=36;
	public static final int cTechBowSaw=37;
	public static final int cTechQuarry=38;
	public static final int cTechCarpenters=39;
	public static final int cTechBravery=40;
	public static final int cTechValleyoftheKings=41;
	public static final int cTechLightningStorm=42;
	public static final int cTechLocustSwarm=43;
	public static final int cTechTornado=44;
	public static final int cTechWinterHarvest=45;
	public static final int cTechSafeguard=46;
	public static final int cTechRampage=47;
	public static final int cTechMithrilBreastplate=48;
	public static final int cTechCallOfValhalla=49;
	public static final int cTechArcticWinds=50;
	public static final int cTechArcticGale=51;
	public static final int cTechWrathOfTheDeep=52;
	public static final int cTechSpiritedCharge=53;
	public static final int cTechThunderingHooves=54;
	public static final int cTechBerserkergang=55;
	public static final int cTechRime=56;
	public static final int cTechFrost=57;
	public static final int cTechDraftHorses=58;
	public static final int cTechEngineers=59;
	public static final int cTechArchitects=60;
	public static final int cTechMeteor=61;
	public static final int cTechBoneBow=62;
	public static final int cTechAxeofVengeance=63;
	public static final int cTechDesertWind=64;
	public static final int cTechEnclosedDeck=65;
	public static final int cTechCladding=66;
	public static final int cTechFortifiedWall=67;
	public static final int cTechAge1Zeus=68;
	public static final int cTechSkinOfTheRhino=69;
	public static final int cTechAge15Egyptian=70;
	public static final int cTechSacredCats=71;
	public static final int cTechGraniteBlood=72;
	public static final int cTechHamarrtroll=73;
	public static final int cTechCriosphinx=74;
	public static final int cTechHieracosphinx=75;
	public static final int cTechMonstrousRage=76;
	public static final int cTechPhobosSpearofPanic=77;
	public static final int cTechBacchanalia=78;
	public static final int cTechSunRay=79;
	public static final int cTechSylvanLore=80;
	public static final int cTechForgeofOlympus=81;
	public static final int cTechAge1Hades=82;
	public static final int cTechAge1Poseidon=83;
	public static final int cTechCreateGold=84;
	public static final int cTechAge1Ra=85;
	public static final int cTechAge1Isis=86;
	public static final int cTechAge1Set=87;
	public static final int cTechAge1Odin=88;
	public static final int cTechAge1Thor=89;
	public static final int cTechAge1Loki=90;
	public static final int cTechAuroraBorealis=91;
	public static final int cTechAge2Athena=92;
	public static final int cTechAge2Ares=93;
	public static final int cTechAge2Hermes=94;
	public static final int cTechAge3Dionysos=95;
	public static final int cTechAge3Apollo=96;
	public static final int cTechAge3Aphrodite=97;
	public static final int cTechAge4Hera=98;
	public static final int cTechAge4Artemis=99;
	public static final int cTechAge4Hephaestus=100;
	public static final int cTechHuntingDogs=101;
	public static final int cTechHandofTalos=102;
	public static final int cTechSarissa=103;
	public static final int cTechAegisShield=104;
	public static final int cTechWingedMessenger=105;
	public static final int cTechAge2Anubis=106;
	public static final int cTechAge2Bast=107;
	public static final int cTechAge2Ptah=108;
	public static final int cTechAge3Hathor=109;
	public static final int cTechAge3Nephthys=110;
	public static final int cTechAge3Sekhmet=111;
	public static final int cTechAge4Thoth=112;
	public static final int cTechAge4Osiris=113;
	public static final int cTechAge4Horus=114;
	public static final int cTechFeetoftheJackal=115;
	public static final int cTechAge4=116;
	public static final int cTechAge2Forseti=117;
	public static final int cTechAge2Heimdall=118;
	public static final int cTechAge2Freyja=119;
	public static final int cTechAge3Skadi=120;
	public static final int cTechAge3Bragi=121;
	public static final int cTechAge3Njord=122;
	public static final int cTechAge4Hel=123;
	public static final int cTechAge4Baldr=124;
	public static final int cTechAge4Tyr=125;
	public static final int cTechSignalFires=126;
	public static final int cTechStoneWall=127;
	public static final int cTechShoulderofTalos=128;
	public static final int cTechSkeletonPower=129;
	public static final int cTechBookofThoth=130;
	public static final int cTechFaceoftheGorgon=131;
	public static final int cTechCitadelWall=132;
	public static final int cTechUnderworldPassage=133;
	public static final int cTechRestoration=134;
	public static final int cTechConscriptInfantry=135;
	public static final int cTechLevyArchers=136;
	public static final int cTechConscriptArchers=137;
	public static final int cTechLevyCavalry=138;
	public static final int cTechConscriptCavalry=139;
	public static final int cTechCarrierPigeons=140;
	public static final int cTechFloodControl=141;
	public static final int cTechPharaohRespawn=142;
	public static final int cTechStartingUnitsNorse=143;
	public static final int cTechStartingUnitsGreek=144;
	public static final int cTechStartingUnitsEgyptian=145;
	public static final int cTechGreatHunt=146;
	public static final int cTechCeaseFire=147;
	public static final int cTechMonument1=148;
	public static final int cTechMonument2=149;
	public static final int cTechMonument3=150;
	public static final int cTechMonument4=151;
	public static final int cTechUndermine=152;
	public static final int cTechDwarvenMail=153;
	public static final int cTechDwarvenShields=154;
	public static final int cTechDwarvenWeapons=155;
	public static final int cTechRain=156;
	public static final int cTechSerpentSpear=157;
	public static final int cTechFloodoftheNile=158;
	public static final int cTechVaultsofErebus=159;
	public static final int cTechLordofHorses=160;
	public static final int cTechOlympicParentage=161;
	public static final int cTechPigSticker=162;
	public static final int cTechLoneWanderer=163;
	public static final int cTechEyesintheForest=164;
	public static final int cTechScallopedAxe=165;
	public static final int cTechRingGiver=166;
	public static final int cTechLongSerpent=167;
	public static final int cTechSwineArray=168;
	public static final int cTechAge15Norse=169;
	public static final int cTechAge15Greek=170;
	public static final int cTechOdinsRavenRespawn=171;
	public static final int cTechSnowStorm=172;
	public static final int cTechHeavyCamelry=173;
	public static final int cTechChampionCamelry=174;
	public static final int cTechBronze=175;
	public static final int cTechPharaohRespawnOsiris=176;
	public static final int cTechNewKingdom=177;
	public static final int cTechMedjay=178;
	public static final int cTechFuneralRites=179;
	public static final int cTechSpiritofMaat=180;
	public static final int cTechCityoftheDead=181;
	public static final int cTechFortifyTownCenter=182;
	public static final int cTechHeroesZeusAge2=183;
	public static final int cTechHeroesZeusAge3=184;
	public static final int cTechHeroesZeusAge4=185;
	public static final int cTechHeroesPoseidonAge2=186;
	public static final int cTechHeroesPoseidonAge3=187;
	public static final int cTechHeroesPoseidonAge4=188;
	public static final int cTechHeroesHadesAge2=189;
	public static final int cTechHeroesHadesAge3=190;
	public static final int cTechHeroesHadesAge4=191;
	public static final int cTechShaduf=192;
	public static final int cTechMonument0=193;
	public static final int cTechRelicAnkhofRa=194;
	public static final int cTechRelicEyeofHorus=195;
	public static final int cTechRelicSistrumofBast=196;
	public static final int cTechRelicHeadofOrpheus=197;
	public static final int cTechRelicRingoftheNibelung=198;
	public static final int cTechRelicStaffofDionysus=199;
	public static final int cTechRelicFettersofFenrir=200;
	public static final int cTechRelicOdinsSpear=201;
	public static final int cTechRelicKitharaofApollo=202;
	public static final int cTechRelicMithrilHorseshoes=203;
	public static final int cTechRelicBowofArtemis=204;
	public static final int cTechRelicWedjatEye=205;
	public static final int cTechRelicNoseoftheSphinx=206;
	public static final int cTechGoldenApples=207;
	public static final int cTechEldhrimnirKettle=208;
	public static final int cTechRelicArrowsofAlfar=209;
	public static final int cTechRelicToothedArrows=210;
	public static final int cTechRelicWandofGambantein=211;
	public static final int cTechProsperity=212;
	public static final int cTechPegasusRelicRespawn=213;
	public static final int cTechRelicGoldenBridleofPegasus=214;
	public static final int cTechEclipse=215;
	public static final int cTechWillofKronos=216;
	public static final int cTechLabyrinthofMinos=217;
	public static final int cTechFlamesofTyphon=218;
	public static final int cTechDivineBlood=219;
	public static final int cTechShaftsofPlague=220;
	public static final int cTechVision=221;
	public static final int cTechBolt=222;
	public static final int cTechSpy=223;
	public static final int cTechFlamingWeapons=224;
	public static final int cTechFlamingWeaponsActive=225;
	public static final int cTechLossofLOS=226;
	public static final int cTechSerpents=227;
	public static final int cTechAnimalMagnetism=228;
	public static final int cTechHealingSpring=229;
	public static final int cTechCurse=230;
	public static final int cTechSentinel=231;
	public static final int cTechSandstorm=232;
	public static final int cTechCitadel=233;
	public static final int cTechWalkingWoods=234;
	public static final int cTechRagnorok=235;
	public static final int cTechNidhogg=236;
	public static final int cTechPlenty=237;
	public static final int cTechSonofOsiris=238;
	public static final int cTechPharaohRespawnCityoftheDead=239;
	public static final int cTechEarthquake=240;
	public static final int cTechAthenianWall=241;
	public static final int cTechHeroesHadesAge1=242;
	public static final int cTechHeroesPoseidonAge1=243;
	public static final int cTechHeroesZeusAge1=244;
	public static final int cTechDwarvenAuger=245;
	public static final int cTechPurseSeine=246;
	public static final int cTechReinforcedHull=247;
	public static final int cTechHuntressAxe=248;
	public static final int cTechForestFire=249;
	public static final int cTechPestilence=250;
	public static final int cTechRelicTriosBow=251;
	public static final int cTechRelicShardofBlueCrystal=252;
	public static final int cTechRelicArmorofAchilles=253;
	public static final int cTechRelicShipofFingernails=254;
	public static final int cTechCrocodopolis=255;
	public static final int cTechLeatherFrameShield=256;
	public static final int cTechElectrumBullets=257;
	public static final int cTechStonesofRedLinen=258;
	public static final int cTechSpearontheHorizon=259;
	public static final int cTechFeral=260;
	public static final int cTechAnastrophe=261;
	public static final int cTechTrierarch=262;
	public static final int cTechThracianHorses=263;
	public static final int cTechRelicShinglesofSteel=264;
	public static final int cTechRelicEyeofOrnlu=265;
	public static final int cTechRelicTuskoftheIronBoar=266;
	public static final int cTechAssignLOS=267;
	public static final int cTechRoarofOrthus=268;
	public static final int cTechAtefCrown=269;
	public static final int cTechConscriptSailors=270;
	public static final int cTechNavalOxybeles=271;
	public static final int cTechEnyosBowofHorror=272;
	public static final int cTechDeimosSwordofDread=273;
	public static final int cTechChampionElephants=274;
	public static final int cTechHallofThanes=275;
	public static final int cTechAdzeofWepwawet=276;
	public static final int cTechSlingsoftheSun=277;
	public static final int cTechRamoftheWestWind=278;
	public static final int cTechSundriedMudBrick=279;
	public static final int cTechFuneralBarge=280;
	public static final int cTechNecropolis=281;
	public static final int cTechDisableArmoryforThor=282;
	public static final int cTechIronMailThor=283;
	public static final int cTechBronzeMailThor=284;
	public static final int cTechBronzeShieldsThor=285;
	public static final int cTechBronzeWeaponsThor=286;
	public static final int cTechIronShieldsThor=287;
	public static final int cTechIronWeaponsThor=288;
	public static final int cTechBurningPitchThor=289;
	public static final int cTechHammeroftheGods=290;
	public static final int cTechMeteoricIronMail=291;
	public static final int cTechDragonscaleShields=292;
	public static final int cTechTusksofApedemak=293;
	public static final int cTechRelicPandorasBox=294;
	public static final int cTechRelicHerasThundercloudShawl=295;
	public static final int cTechRelicHarmoniasNecklace=296;
	public static final int cTechRelicDwarfenCalipers=297;
	public static final int cTechOracle=298;
	public static final int cTechSonsofSleipnir=299;
	public static final int cTechSetAge2Critter=300;
	public static final int cTechSetAge3Critter=301;
	public static final int cTechSetAge4Critter=302;
	public static final int cTechPoseidonHippocampusRespawn=303;
	public static final int cTechEgyptianbuildingbonus=304;
	public static final int cTechOmniscience=305;
	public static final int cTechMediumAxemen=306;
	public static final int cTechHeavyAxemen=307;
	public static final int cTechChampionAxemen=308;
	public static final int cTechMediumSpearmen=309;
	public static final int cTechHeavySpearmen=310;
	public static final int cTechChampionSpearmen=311;
	public static final int cTechHeavyChariots=312;
	public static final int cTechChampionChariots=313;
	public static final int cTechHeavyElephants=314;
	public static final int cTechLevyBarracksSoldiers=315;
	public static final int cTechConscriptBarracksSoldiers=316;
	public static final int cTechLevyMigdolSoldiers=317;
	public static final int cTechConscriptMigdolSoldiers=318;
	public static final int cTechMediumSlingers=319;
	public static final int cTechHeavySlingers=320;
	public static final int cTechChampionSlingers=321;
	public static final int cTechRelicGoldenLions=322;
	public static final int cTechRelicMonkeyHead=323;
	public static final int cTechLevyLonghouseSoldiers=324;
	public static final int cTechConscriptLonghouseSoldiers=325;
	public static final int cTechConscriptHillFortSoldiers=326;
	public static final int cTechLevyHillFortSoldiers=327;
	public static final int cTechThurisazRune=328;
	public static final int cTechGoldenLionsRelicRespawn=329;
	public static final int cTechMonkeyHeadRelicRespawn=330;
	public static final int cTechRelicCanopicJarofImsety=331;
	public static final int cTechRelicTowerofSestus=332;
	public static final int cTechRelicTrojanGateHinge=333;
	public static final int cTechSPCMeteor=334;
	public static final int cTechOdinsFirstRavens=335;
	public static final int cTechHeroesEgyptianAge1=336;
	public static final int cTechWeakenAge1Units=337;
	public static final int cTechSaltAmphora=338;
	public static final int cTechMediumMigdolShadow=339;
	public static final int cTechPoseidonFirstHippocampus=340;
	public static final int cTechTempleofHealing=341;
	public static final int cTechGreatestofFifty=342;
	public static final int cTechCopperMailThor=343;
	public static final int cTechCopperShieldsThor=344;
	public static final int cTechCopperWeaponsThor=345;
	public static final int cTechWeaponoftheTitans=346;
	public static final int cTechAge2Fake=347;
	public static final int cTechAge3Fake=348;
	public static final int cTechAge4Fake=349;
	public static final int cTechCrenellations=350;
	public static final int cTechBlessingofZeus=351;
	public static final int cTechRelicGirdleofHippolyta=352;
	public static final int cTechSharedLOS=353;
	public static final int cTechRelicPygmalionsStatue=354;
	public static final int cTechRelicBlackLotus=355;
	public static final int cTechDeathmatchGreek=356;
	public static final int cTechDeathmatchEgyptian=357;
	public static final int cTechDeathmatchNorse=358;
	public static final int cTechCeasefireEffect=359;
	public static final int cTechNorsebuildingbonus=360;
	public static final int cTechLightningMode=361;
	public static final int cTechFortifiedTents=362;
	public static final int cTechDwarvenShieldsEffect=363;
	public static final int cTechRelicHartersFolly=364;
	public static final int cTechRelicScarabPendant=365;
	public static final int cTechWellofUrd=366;
	public static final int cTechRelicBootsofKickEverything=367;
	public static final int cTechRelicAnvilofHephaestus=368;
	public static final int cTechRelicPeltofArgus=369;
	public static final int cTechRelicOsebergWagon=370;
	public static final int cTechRelicBuhenFlagstone=371;
	public static final int cTechRelicCatoblepasScales=372;
	public static final int cTechRelicTailofCerberus=373;
	public static final int cTechRelicBlanketofEmpressZoe=374;
	public static final int cTechRelicKhopeshofHorus=375;
	public static final int cTechCeaseFireNomad=376;
	public static final int cTechEclipseActive=377;
	public static final int cTechPlentyKOTHenable=378;
	public static final int cTechStartingUnitsThor=379;
	public static final int cTechSetAge1Critter=380;
	public static final int cTechStartingResourcesEgyptian=381;
	public static final int cTechStartingResourcesGreek=382;
	public static final int cTechStartingResourcesNorse=383;
	public static final int cTechRelicReedofNekhebet=384;
	public static final int cTechWeakenTrojanGate=385;
	public static final int cTechBuildTCfaster=386;
	public static final int cTechIncreaseRegeneration=387;
	public static final int cTechChickenStorm=388;
	public static final int cTechWalkingBerryBushes=389;
	public static final int cTechEliteHersir=390;
	public static final int cTechGoatunheim=391;
	public static final int cTechAge1Kronos=392;
	public static final int cTechAge1Gaia=393;
	public static final int cTechStartingUnitsAtlantean=394;
	public static final int cTechAge1Ouranos=395;
	public static final int cTechStartingResourcesAtlantean=396;
	public static final int cTechAge2Okeanus=397;
	public static final int cTechAge2Prometheus=398;
	public static final int cTechAge2Leto=399;
	public static final int cTechAge3Hyperion=400;
	public static final int cTechAge3Rheia=401;
	public static final int cTechAge3Theia=402;
	public static final int cTechAge4Helios=403;
	public static final int cTechAge4Hekate=404;
	public static final int cTechAge4Atlas=405;
	public static final int cTechReverseTime=406;
	public static final int cTechAudrey=407;
	public static final int cTechTraitors=408;
	public static final int cTechChaos=409;
	public static final int cTechVolcano=410;
	public static final int cTechBronzeWall=411;
	public static final int cTechIronWall=412;
	public static final int cTechOreichalkosWall=413;
	public static final int cTechTremor=414;
	public static final int cTechHeavyFireship=415;
	public static final int cTechHeartoftheTitans=416;
	public static final int cTechHephaestusRevenge=417;
	public static final int cTechGaiaForest=418;
	public static final int cTechTartarianGate=419;
	public static final int cTechLevyMainlineUnits=420;
	public static final int cTechLevySpecialtyUnits=421;
	public static final int cTechLevyPalaceUnits=422;
	public static final int cTechConscriptMainlineUnits=423;
	public static final int cTechConscriptSpecialtyUnits=424;
	public static final int cTechConscriptPalaceUnits=425;
	public static final int cTechHalooftheSun=426;
	public static final int cTechHornsofConsecration=427;
	public static final int cTechLemurianDescendants=428;
	public static final int cTechChannels=429;
	public static final int cTechAlluvialClay=430;
	public static final int cTechVortex=431;
	public static final int cTechMythicRejuvenation=432;
	public static final int cTechHeroicRenewal=433;
	public static final int cTechReverseWonder=434;
	public static final int cTechBiteoftheShark=435;
	public static final int cTechHesperides=436;
	public static final int cTechHeavyChieroballista=437;
	public static final int cTechSpiders=438;
	public static final int cTechHeroize=439;
	public static final int cTechGemino=440;
	public static final int cTechNorseArmory=441;
	public static final int cTechImplode=442;
	public static final int cTechSecretsoftheTitans=443;
	public static final int cTechTitanGate=444;
	public static final int cTechDisableTitan=445;
	public static final int cTechFocus=446;
	public static final int cTechSafePassage=447;
	public static final int cTechHeroicFleet=448;
	public static final int cTechWeightlessMace=449;
	public static final int cTechEyesofAtlas=450;
	public static final int cTechAsperBlood=451;
	public static final int cTechTitanShield=452;
	public static final int cTechPoseidonsSecret=453;
	public static final int cTechRelicWhirlwindSPC=454;
	public static final int cTechRelicofBronzeSPC=455;
	public static final int cTechRelicofEarthquakeSPC=456;
	public static final int cTechBronzeXP05=457;
	public static final int cTechTornadoXP05=458;
	public static final int cTechRelicTitansTreasure=459;
	public static final int cTechVolcanicForge=460;
	public static final int cTechRelicGaiasBookofKnowledge=461;
	public static final int cTechChangeCyclops=462;
	public static final int cTechChangeChimera=463;
	public static final int cTechChangeCaladria=464;
	public static final int cTechChangeManticore=465;
	public static final int cTechChangeNemean=466;
	public static final int cTechChangeHydra=467;
	public static final int cTechSPCLightningStorm=468;
	public static final int cTechDeathmatchAtlantean=469;
	public static final int cTechMailofOrichalkos=470;
	public static final int cTechHandsofthePharaoh=471;
	public static final int cTechBronzeAll=472;
	public static final int cTechBronzeAllThor=473;
	public static final int cTechCopperAll=474;
	public static final int cTechCopperAllThor=475;
	public static final int cTechIronAll=476;
	public static final int cTechIronAllThor=477;
	public static final int cTechMediumAll=478;
	public static final int cTechHeavyAll=479;
	public static final int cTechChampionAll=480;
	public static final int cTechRheiasGift=481;
	public static final int cTechTimeShiftFake=482;
	public static final int cTechFocusTurbo=483;
	public static final int cTechCelerity=484;
	public static final int cTechSeedofGaia=485;
	public static final int cTechGrantPhoenixEgg=486;
	public static final int cTechIoGuardian=487;
	public static final int cTechDisableAtlanteanFavor=488;
	public static final int cTechTimeShiftFake2=489;
	public static final int cTechAxeofMuspell=490;
	public static final int cTechChampionChieroballista=491;
	public static final int cTechTraitorsSPC=492;
	public static final int cTechSuperRocs=493;
	public static final int cTechBeastSlayer=494;
	public static final int cTechLanceofStone=495;
	public static final int cTechSuddenDeathAtlantean=496;
	public static final int cTechRelicofAncestorsSPC=497;
	public static final int cTechSuperTitanSPC=498;
	public static final int cTechSuperNidhoggSPC=499;
	public static final int cTechPetrified=500;
	public static final int cTechPrometheusWeak=501;
	public static final int cTechPrometheusWeakest=502;
	public static final int cTechAge2AtlanteanHeroes=503;
	public static final int cTechAge4AtlanteanHeroes=504;
	public static final int cTechAge15Atlantean=505;
	public static final int cTechGaiaForestSPC=506;
	//Unit Types: 995 total.
	public static final int cUnitTypeHawk=0;
	public static final int cUnitTypePalmStump=1;
	public static final int cUnitTypeBush=2;
	public static final int cUnitTypeArrow=3;
	public static final int cUnitTypeAxe=4;
	public static final int cUnitTypeBlood=5;
	public static final int cUnitTypeScarabBlood=6;
	public static final int cUnitTypeWaypointFlag=7;
	public static final int cUnitTypeMoveto=8;
	public static final int cUnitTypeTestObject=9;
	public static final int cUnitTypeYardstick=10;
	public static final int cUnitTypeSmoke=11;
	public static final int cUnitTypeCloud=12;
	public static final int cUnitTypeTornado=13;
	public static final int cUnitTypeRevealer=14;
	public static final int cUnitTypeAttackRevealer=15;
	public static final int cUnitTypeconstructionSmall=16;
	public static final int cUnitTypeconstructionMedium=17;
	public static final int cUnitTypeconstructionLarge=18;
	public static final int cUnitTypeconstructionExtraLarge=19;
	public static final int cUnitTypeIceBlock=20;
	public static final int cUnitTypePapyrus=21;
	public static final int cUnitTypeWave=22;
	public static final int cUnitTypeRainfall=23;
	public static final int cUnitTypeIceSheet=24;
	public static final int cUnitTypeCamera=25;
	public static final int cUnitTypeCameraMotionArrow=26;
	public static final int cUnitTypeCameraStart=27;
	public static final int cUnitTypeWhale=28;
	public static final int cUnitTypeFirePit=29;
	public static final int cUnitTypeRockSymbols=30;
	public static final int cUnitTypeStalagmite=31;
	public static final int cUnitTypeRunestone=32;
	public static final int cUnitTypeRockSnow=33;
	public static final int cUnitTypeWaterLilly=34;
	public static final int cUnitTypeWaterReeds=35;
	public static final int cUnitTypeSnowfall=36;
	public static final int cUnitTypeMist=37;
	public static final int cUnitTypeWaterfall=38;
	public static final int cUnitTypeGarrisonFlag=39;
	public static final int cUnitTypeCrate=40;
	public static final int cUnitTypeRugs=41;
	public static final int cUnitTypeMarketStall=42;
	public static final int cUnitTypeCatapultShot=43;
	public static final int cUnitTypeMiscObjects=44;
	public static final int cUnitTypeInfernoFireGround=45;
	public static final int cUnitTypeLightningStrike=46;
	public static final int cUnitTypeBallistaShot=47;
	public static final int cUnitTypeSplash=48;
	public static final int cUnitTypeMiscStairs=49;
	public static final int cUnitTypeCoralReef=50;
	public static final int cUnitTypeHeroBirth=51;
	public static final int cUnitTypeCinematicBlock=52;
	public static final int cUnitTypeFootprintVillager=53;
	public static final int cUnitTypeFlamingFootprint=54;
	public static final int cUnitTypeIcyFootprint=55;
	public static final int cUnitTypeOarFootprint=56;
	public static final int cUnitTypeMeteor=57;
	public static final int cUnitTypeLightningsparks=58;
	public static final int cUnitTypeLightningScorch=59;
	public static final int cUnitTypeDustSmall=60;
	public static final int cUnitTypeDustMedium=61;
	public static final int cUnitTypeDustLarge=62;
	public static final int cUnitTypeArrowFlaming=63;
	public static final int cUnitTypeLightningCloud=64;
	public static final int cUnitTypeLightningRain=65;
	public static final int cUnitTypeUIArmyBannerFurled=66;
	public static final int cUnitTypeUIArmyBannerPlain=67;
	public static final int cUnitTypeUIArmyBannerInfantry=68;
	public static final int cUnitTypeUIArmyBannerCavalry=69;
	public static final int cUnitTypeUIArmyBannerArcher=70;
	public static final int cUnitTypeUIArmyBannerVillager=71;
	public static final int cUnitTypeBloodGore=72;
	public static final int cUnitTypeLightningSparksGround=73;
	public static final int cUnitTypeHoofprint=74;
	public static final int cUnitTypeFootprintMilitary=75;
	public static final int cUnitTypeFireObject=76;
	public static final int cUnitTypeUIHeroBanner=77;
	public static final int cUnitTypeUIIdleVillagerBanner=78;
	public static final int cUnitTypeGiantFootprint=79;
	public static final int cUnitTypeShark=80;
	public static final int cUnitTypeOrca=81;
	public static final int cUnitTypeRockGraniteSmall=82;
	public static final int cUnitTypeRockLimestoneSmall=83;
	public static final int cUnitTypeGrass=84;
	public static final int cUnitTypeSeagull=85;
	public static final int cUnitTypeRockGraniteBig=86;
	public static final int cUnitTypeRockLimestoneBig=87;
	public static final int cUnitTypeRockSandstoneBig=88;
	public static final int cUnitTypeRockSandstoneSmall=89;
	public static final int cUnitTypeRockRiverSandy=90;
	public static final int cUnitTypeRockRiverGrassy=91;
	public static final int cUnitTypeRockRiverIcy=92;
	public static final int cUnitTypeShiftingSandsIn=93;
	public static final int cUnitTypeUIArmyBannerMyth=94;
	public static final int cUnitTypeUIIdleMilitaryBanner=95;
	public static final int cUnitTypeHeavenlight=96;
	public static final int cUnitTypeShiftingSandsOut=97;
	public static final int cUnitTypeShiftingSandsOutEffect=98;
	public static final int cUnitTypeInfernoUnitFlame=99;
	public static final int cUnitTypeRevealertoPlayer=100;
	public static final int cUnitTypeSkeleton=101;
	public static final int cUnitTypeSandDriftDune=102;
	public static final int cUnitTypeSandDriftPlain=103;
	public static final int cUnitTypeSandDriftPatch=104;
	public static final int cUnitTypeHealingSFX=105;
	public static final int cUnitTypeHealingAreaSFX=106;
	public static final int cUnitTypeFrostDrift=107;
	public static final int cUnitTypeDustDevil=108;
	public static final int cUnitTypeFountain=109;
	public static final int cUnitTypeFireWood=110;
	public static final int cUnitTypeCampfire=111;
	public static final int cUnitTypeColumns=112;
	public static final int cUnitTypeColumnsFallen=113;
	public static final int cUnitTypeColumnsBroken=114;
	public static final int cUnitTypeMilestone=115;
	public static final int cUnitTypeSign=116;
	public static final int cUnitTypeCloneSFX=117;
	public static final int cUnitTypeInvisibleRam=118;
	public static final int cUnitTypeSpear=119;
	public static final int cUnitTypeSlingStone=120;
	public static final int cUnitTypeRain=121;
	public static final int cUnitTypeSnowStorm=122;
	public static final int cUnitTypeFertilePlantsSFX=123;
	public static final int cUnitTypeCinematicrocks=124;
	public static final int cUnitTypeCinematicTrees=125;
	public static final int cUnitTypeCinematicDeadBodies=126;
	public static final int cUnitTypeDestroyedBuildingsSmall=127;
	public static final int cUnitTypeCinematicScorch=128;
	public static final int cUnitTypeunderminegrounddecallong=129;
	public static final int cUnitTypeunderminegrounddecalshort=130;
	public static final int cUnitTypeunderminegrounddecalcorner=131;
	public static final int cUnitTypeArmorGlowSmall=132;
	public static final int cUnitTypeTornadoDebris=133;
	public static final int cUnitTypeRaft=134;
	public static final int cUnitTypeMeteorImpactWater=135;
	public static final int cUnitTypeMeteorImpactGround=136;
	public static final int cUnitTypeRainSmall=137;
	public static final int cUnitTypeBallofFire=138;
	public static final int cUnitTypeIncreaseProsperityLarge=139;
	public static final int cUnitTypeIncreaseProsperitySmall=140;
	public static final int cUnitTypeBalloffireimpact=141;
	public static final int cUnitTypeDove=142;
	public static final int cUnitTypeSnowDriftArchery=143;
	public static final int cUnitTypeSnowDriftBarracks=144;
	public static final int cUnitTypeSnowDriftStable=145;
	public static final int cUnitTypeSnowDriftSettlements=146;
	public static final int cUnitTypeSnowDriftTower=147;
	public static final int cUnitTypeSnowDriftSiege=148;
	public static final int cUnitTypeSnowDriftMajorTemple=149;
	public static final int cUnitTypeTunnelOpening=150;
	public static final int cUnitTypeVolley=151;
	public static final int cUnitTypeHadesFire=152;
	public static final int cUnitTypeRockGraniteSprite=153;
	public static final int cUnitTypeVisionRevealer=154;
	public static final int cUnitTypeBoltStrike=155;
	public static final int cUnitTypeSpyEye=156;
	public static final int cUnitTypeCurseSFX=157;
	public static final int cUnitTypeSentinelBase=158;
	public static final int cUnitTypeBoltScorch=159;
	public static final int cUnitTypeCitadelSFX=160;
	public static final int cUnitTypeVisionSFX=161;
	public static final int cUnitTypeRagnorokSFX=162;
	public static final int cUnitTypeFimbulwinterSFX=163;
	public static final int cUnitTypePlentyFlare=164;
	public static final int cUnitTypeOsirisLightning=165;
	public static final int cUnitTypeOsirisSFX=166;
	public static final int cUnitTypePriestProjectile=167;
	public static final int cUnitTypeUIArmyBannerSiege=168;
	public static final int cUnitTypeRockLimestoneSprite=169;
	public static final int cUnitTypeRockSandstoneSprite=170;
	public static final int cUnitTypePineStump=171;
	public static final int cUnitTypeOakstump=172;
	public static final int cUnitTypeEarthquake=173;
	public static final int cUnitTypeBarrel=174;
	public static final int cUnitTypePots=175;
	public static final int cUnitTypeBrokenSiegeWeapons=176;
	public static final int cUnitTypeKrakenBits=177;
	public static final int cUnitTypeFlowers=178;
	public static final int cUnitTypeSeaweed=179;
	public static final int cUnitTypeFern=180;
	public static final int cUnitTypeFlagNumbered=181;
	public static final int cUnitTypeScorpionTail=182;
	public static final int cUnitTypeGenericCorpse=183;
	public static final int cUnitTypeWadjetSpit=184;
	public static final int cUnitTypeHeroDeath=185;
	public static final int cUnitTypePetosuchusBeam=186;
	public static final int cUnitTypeEarthquakeCrackA=187;
	public static final int cUnitTypeEarthquakeCrackB=188;
	public static final int cUnitTypeEarthquakeCrackC=189;
	public static final int cUnitTypeEarthquakeCrackD=190;
	public static final int cUnitTypeForestFireSFX=191;
	public static final int cUnitTypePetosuchusprojectile=192;
	public static final int cUnitTypeRecognizer=193;
	public static final int cUnitTypeManticoreBarb=194;
	public static final int cUnitTypeArrowSplashSFX=195;
	public static final int cUnitTypePetrobolosShot=196;
	public static final int cUnitTypeUITownBellBanner=197;
	public static final int cUnitTypePestilenceSFX1=198;
	public static final int cUnitTypePestilenceSFX2=199;
	public static final int cUnitTypeHeroDeathRevealer=200;
	public static final int cUnitTypeTestomatic=201;
	public static final int cUnitTypeGateRamDestroyed=202;
	public static final int cUnitTypeSpearFlaming=203;
	public static final int cUnitTypeDestroyedBuildingsMed=204;
	public static final int cUnitTypeDestroyedBuildingsLarge=205;
	public static final int cUnitTypeOsiris=206;
	public static final int cUnitTypeSPCMeteor=207;
	public static final int cUnitTypeAvalanche=208;
	public static final int cUnitTypeEinheriarBoostSFX=209;
	public static final int cUnitTypeArrowSignal=210;
	public static final int cUnitTypeOsirisBirth=211;
	public static final int cUnitTypeOsirisBoxGlow=212;
	public static final int cUnitTypeUIBannerObjective=213;
	public static final int cUnitTypeOakstumpburnt=214;
	public static final int cUnitTypeFireObjectBig=215;
	public static final int cUnitTypeSmokeBig=216;
	public static final int cUnitTypeUIArmyBannerHero=217;
	public static final int cUnitTypeMummyFlies=218;
	public static final int cUnitTypeVulture=219;
	public static final int cUnitTypeConversionSFX=220;
	public static final int cUnitTypeUIArmyBannerNaval=221;
	public static final int cUnitTypeFireHades=222;
	public static final int cUnitTypeDestruction3x3=223;
	public static final int cUnitTypeDestruction4x4=224;
	public static final int cUnitTypeDestruction5x5=225;
	public static final int cUnitTypeDestruction8x8=226;
	public static final int cUnitTypeThorhammer=227;
	public static final int cUnitTypeRegenerationSFX=228;
	public static final int cUnitTypePoisonSFX=229;
	public static final int cUnitTypeTaprootlarge=230;
	public static final int cUnitTypeTaprootSmall=231;
	public static final int cUnitTypeShadow=232;
	public static final int cUnitTypeDestructionSettlement=233;
	public static final int cUnitTypeDestruction2x2=234;
	public static final int cUnitTypeDestruction1x1=235;
	public static final int cUnitTypeUIArmyBannerCaravan=236;
	public static final int cUnitTypeUIArmyBannerOxcart=237;
	public static final int cUnitTypeMInePieces=238;
	public static final int cUnitTypeUnderworldSmoke=239;
	public static final int cUnitTypeUnderworldExplosion=240;
	public static final int cUnitTypeUICloudBoarder=241;
	public static final int cUnitTypeBloodCinematic=242;
	public static final int cUnitTypeSkeletonGiant=243;
	public static final int cUnitTypeSkeletonAnimal=244;
	public static final int cUnitTypeShipwreck=245;
	public static final int cUnitTypeRuins=246;
	public static final int cUnitTypeRottingLog=247;
	public static final int cUnitTypeUnderbrush=248;
	public static final int cUnitTypeGrassTall=249;
	public static final int cUnitTypeRockCliff=250;
	public static final int cUnitTypeUIRangeIndicatorEgyptSFX=251;
	public static final int cUnitTypeHarpy=252;
	public static final int cUnitTypeBlowingLeaves=253;
	public static final int cUnitTypeHawksbill=254;
	public static final int cUnitTypeBloodFlow=255;
	public static final int cUnitTypeBallofFireinvisible=256;
	public static final int cUnitTypeSplashFootprint=257;
	public static final int cUnitTypeLavaBubbling=258;
	public static final int cUnitTypeWoodPile1=259;
	public static final int cUnitTypeWoodPile2=260;
	public static final int cUnitTypeWoodPile3=261;
	public static final int cUnitTypeTrident=262;
	public static final int cUnitTypeDestructionCitadel=263;
	public static final int cUnitTypeForestFireAttack=264;
	public static final int cUnitTypeUIRangeIndicatorGreekSFX=265;
	public static final int cUnitTypeUIRangeIndicatorNorseSFX=266;
	public static final int cUnitTypeInvisibleGate=267;
	public static final int cUnitTypeUIArmyBannerBuilding=268;
	public static final int cUnitTypeWaterdecoration=269;
	public static final int cUnitTypeFootprintCavalry=270;
	public static final int cUnitTypeFootprintAnimalLarge=271;
	public static final int cUnitTypeFootprintAnimalSmall=272;
	public static final int cUnitTypeFootprintSiege=273;
	public static final int cUnitTypeEvilCloudSFX=274;
	public static final int cUnitTypeSmokeGiant=275;
	public static final int cUnitTypeCrateSmall=276;
	public static final int cUnitTypeCinematicWake=277;
	public static final int cUnitTypeWeapons=278;
	public static final int cUnitTypeFootprintGiant=279;
	public static final int cUnitTypeFootprintElephant=280;
	public static final int cUnitTypeFootprintWheel=281;
	public static final int cUnitTypeFootprintHydra=282;
	public static final int cUnitTypeFootprintPortableRam=283;
	public static final int cUnitTypeFootprintScorpion=284;
	public static final int cUnitTypeFootprintScarab=285;
	public static final int cUnitTypeSavannahstump=286;
	public static final int cUnitTypeChickenBlood=287;
	public static final int cUnitTypeCrabBlood=288;
	public static final int cUnitTypeArkantosBoostSFX=289;
	public static final int cUnitTypeTremor=290;
	public static final int cUnitTypeMeteorite=291;
	public static final int cUnitTypeIceberg=292;
	public static final int cUnitTypeGaiaCreepFlowers=293;
	public static final int cUnitTypeDeconstructUnit=294;
	public static final int cUnitTypeDeconstructBuilding=295;
	public static final int cUnitTypeChaoseffect=296;
	public static final int cUnitTypeTraitorseffect=297;
	public static final int cUnitTypeMeteoritedeath=298;
	public static final int cUnitTypeMarshBrush=299;
	public static final int cUnitTypeTundraBrush=300;
	public static final int cUnitTypeAudreyBase=301;
	public static final int cUnitTypeAudreyWaterBase=302;
	public static final int cUnitTypeVortexstart=303;
	public static final int cUnitTypeVortexfinish=304;
	public static final int cUnitTypeMarshstump=305;
	public static final int cUnitTypeTundrastump=306;
	public static final int cUnitTypeFireballLaunchDamageEffect=307;
	public static final int cUnitTypeSpider=308;
	public static final int cUnitTypeImplodeSphere=309;
	public static final int cUnitTypeImplodeSphereEffect=310;
	public static final int cUnitTypeImplodeLightningEffect=311;
	public static final int cUnitTypeImplodePullEffect=312;
	public static final int cUnitTypeJavelinFlaming=313;
	public static final int cUnitTypeImplodeShockwave=314;
	public static final int cUnitTypeSpiderDoor=315;
	public static final int cUnitTypeLampadesBlood=316;
	public static final int cUnitTypeAcidPool=317;
	public static final int cUnitTypeSpiderWarn=318;
	public static final int cUnitTypeGaiaForesteffect=319;
	public static final int cUnitTypeVortexstartlinked=320;
	public static final int cUnitTypeVortexfinishlinked=321;
	public static final int cUnitTypeVortexlanding=322;
	public static final int cUnitTypeImplodeDebris=323;
	public static final int cUnitTypeTitanAtlanteanFootprint=324;
	public static final int cUnitTypeTimeshiftout=325;
	public static final int cUnitTypeTimeshiftin=326;
	public static final int cUnitTypeTartarianGateflame=327;
	public static final int cUnitTypeHekaShockwaveSFX=328;
	public static final int cUnitTypeTartarianGatecreatureeffect=329;
	public static final int cUnitTypeGarrisonFlagSkyPassage=330;
	public static final int cUnitTypeLampadesBolt=331;
	public static final int cUnitTypeFireSiphonFire=332;
	public static final int cUnitTypeStymphBirdFeather=333;
	public static final int cUnitTypeOsirisPyramidDead=334;
	public static final int cUnitTypeRocket=335;
	public static final int cUnitTypeUIRangeIndicatorAtlanteanSFX=336;
	public static final int cUnitTypeTowerMirrorFocuser=337;
	public static final int cUnitTypeKronnyBirth=338;
	public static final int cUnitTypeMistOlympus=339;
	public static final int cUnitTypeSeagullHigh=340;
	public static final int cUnitTypeSeagullLow=341;
	public static final int cUnitTypeRepeatFlag=342;
	public static final int cUnitTypeBallofFirePrometheus=343;
	public static final int cUnitTypeShockwavestuneffect=344;
	public static final int cUnitTypeArkantosGodOut=345;
	public static final int cUnitTypeOlympusTempleSFX=346;
	public static final int cUnitTypeKronnyBirthSFX=347;
	public static final int cUnitTypeLavaSheet=348;
	public static final int cUnitTypeSoundGaiaSFX=349;
	public static final int cUnitTypeFootprintPrometheanbig=350;
	public static final int cUnitTypeFootprintPrometheansmall=351;
	public static final int cUnitTypeCinematicDeadBodiesXpack=352;
	public static final int cUnitTypeTartarianRubble=353;
	public static final int cUnitTypeTitanDeath=354;
	public static final int cUnitTypeSpearman=355;
	public static final int cUnitTypeAxeman=356;
	public static final int cUnitTypeSlinger=357;
	public static final int cUnitTypeRaidingCavalry=358;
	public static final int cUnitTypeCamelry=359;
	public static final int cUnitTypeDwarf=360;
	public static final int cUnitTypeBarracks=361;
	public static final int cUnitTypeDock=362;
	public static final int cUnitTypeFarm=363;
	public static final int cUnitTypeGranary=364;
	public static final int cUnitTypeArmory=365;
	public static final int cUnitTypeGate=366;
	public static final int cUnitTypeMarket=367;
	public static final int cUnitTypeStable=368;
	public static final int cUnitTypeFortress=369;
	public static final int cUnitTypeMonument=370;
	public static final int cUnitTypeSiegeCamp=371;
	public static final int cUnitTypeWonder=372;
	public static final int cUnitTypeCyclops=373;
	public static final int cUnitTypeGoat=374;
	public static final int cUnitTypeWolf=375;
	public static final int cUnitTypePine=376;
	public static final int cUnitTypeStorehouse=377;
	public static final int cUnitTypeScarab=378;
	public static final int cUnitTypeBallista=379;
	public static final int cUnitTypeSiegeTower=380;
	public static final int cUnitTypeCrocodile=381;
	public static final int cUnitTypeHippo=382;
	public static final int cUnitTypePalm=383;
	public static final int cUnitTypeFlag=384;
	public static final int cUnitTypeAnubite=385;
	public static final int cUnitTypeBear=386;
	public static final int cUnitTypeFireGiant=387;
	public static final int cUnitTypeLocustSwarm=388;
	public static final int cUnitTypeBoar=389;
	public static final int cUnitTypeFrostGiant=390;
	public static final int cUnitTypeWallLong=391;
	public static final int cUnitTypeCatapult=392;
	public static final int cUnitTypeCaravanNorse=393;
	public static final int cUnitTypeTroll=394;
	public static final int cUnitTypeMountainGiant=395;
	public static final int cUnitTypeEinheriar=396;
	public static final int cUnitTypeKraken=397;
	public static final int cUnitTypeSeaTurtle=398;
	public static final int cUnitTypeValkyrie=399;
	public static final int cUnitTypeBattleBoar=400;
	public static final int cUnitTypeTrireme=401;
	public static final int cUnitTypeFishingShipGreek=402;
	public static final int cUnitTypeBridge=403;
	public static final int cUnitTypeCow=404;
	public static final int cUnitTypeGiraffe=405;
	public static final int cUnitTypeStatuePharaoh=406;
	public static final int cUnitTypeTorch=407;
	public static final int cUnitTypePig=408;
	public static final int cUnitTypeLazerBear=409;
	public static final int cUnitTypeZebra=410;
	public static final int cUnitTypeWaterBuffalo=411;
	public static final int cUnitTypeGazelle=412;
	public static final int cUnitTypeBaboon=413;
	public static final int cUnitTypeCentaur=414;
	public static final int cUnitTypePhoenix=415;
	public static final int cUnitTypeManticore=416;
	public static final int cUnitTypeChimera=417;
	public static final int cUnitTypeSphinx=418;
	public static final int cUnitTypeMinotaur=419;
	public static final int cUnitTypeHydra=420;
	public static final int cUnitTypeChicken=421;
	public static final int cUnitTypeMonkey=422;
	public static final int cUnitTypeColossus=423;
	public static final int cUnitTypeMummy=424;
	public static final int cUnitTypeRoc=425;
	public static final int cUnitTypeMedusa=426;
	public static final int cUnitTypeObelisk=427;
	public static final int cUnitTypeHadesDoor=428;
	public static final int cUnitTypeAjax=429;
	public static final int cUnitTypeArkantos=430;
	public static final int cUnitTypeGargarensis=431;
	public static final int cUnitTypeSetna=432;
	public static final int cUnitTypeShabaKa=433;
	public static final int cUnitTypeOdysseus=434;
	public static final int cUnitTypeChiron=435;
	public static final int cUnitTypeAmanra=436;
	public static final int cUnitTypeWallConnector=437;
	public static final int cUnitTypeWallShort=438;
	public static final int cUnitTypeLeviathan=439;
	public static final int cUnitTypeStatueLionRight=440;
	public static final int cUnitTypeStatueLionLeft=441;
	public static final int cUnitTypeEgyptianVulture=442;
	public static final int cUnitTypeReginleif=443;
	public static final int cUnitTypeScout=444;
	public static final int cUnitTypeArcheryRange=445;
	public static final int cUnitTypeScorpionMan=446;
	public static final int cUnitTypeMinion=447;
	public static final int cUnitTypeFishPerch=448;
	public static final int cUnitTypeGreatBox=449;
	public static final int cUnitTypeGreatBoxCart=450;
	public static final int cUnitTypeGoldMine=451;
	public static final int cUnitTypeKamos=452;
	public static final int cUnitTypeOakTree=453;
	public static final int cUnitTypePyramidLarge=454;
	public static final int cUnitTypePyramidSmall=455;
	public static final int cUnitTypeLion=456;
	public static final int cUnitTypeRhinocerous=457;
	public static final int cUnitTypeHyena=458;
	public static final int cUnitTypeCrownedCrane=459;
	public static final int cUnitTypeAurochs=460;
	public static final int cUnitTypeFishMahi=461;
	public static final int cUnitTypeFishSalmon=462;
	public static final int cUnitTypeGiantDuckbilledPlatypus=463;
	public static final int cUnitTypeTemple=464;
	public static final int cUnitTypeHouse=465;
	public static final int cUnitTypeTent=466;
	public static final int cUnitTypeElephant=467;
	public static final int cUnitTypeTunnel=468;
	public static final int cUnitTypeTower=469;
	public static final int cUnitTypeSettlement=470;
	public static final int cUnitTypePegasus=471;
	public static final int cUnitTypeScylla=472;
	public static final int cUnitTypeAvenger=473;
	public static final int cUnitTypeRaven=474;
	public static final int cUnitTypeExcavation=475;
	public static final int cUnitTypeGuardian=476;
	public static final int cUnitTypeGuardianSleeping=477;
	public static final int cUnitTypeSwordBearers=478;
	public static final int cUnitTypeDeer=479;
	public static final int cUnitTypeSettlementLevel1=480;
	public static final int cUnitTypeOxCart=481;
	public static final int cUnitTypeFenceStone=482;
	public static final int cUnitTypeFenceWood=483;
	public static final int cUnitTypeVillagerNorse=484;
	public static final int cUnitTypeLonghouse=485;
	public static final int cUnitTypeAcademy=486;
	public static final int cUnitTypeVillagerGreek=487;
	public static final int cUnitTypePortableRam=488;
	public static final int cUnitTypeHillFort=489;
	public static final int cUnitTypeVillagerEgyptian=490;
	public static final int cUnitTypeThrowingAxeman=491;
	public static final int cUnitTypeUlfsark=492;
	public static final int cUnitTypeHuskarl=493;
	public static final int cUnitTypeShrine=494;
	public static final int cUnitTypeHeroNorse=495;
	public static final int cUnitTypeHeroGreekAchilles=496;
	public static final int cUnitTypePharaoh=497;
	public static final int cUnitTypeLumberCamp=498;
	public static final int cUnitTypeMiningCamp=499;
	public static final int cUnitTypeHeroGreekOdysseus=500;
	public static final int cUnitTypeHeroGreekChiron=501;
	public static final int cUnitTypeHeroGreekPolyphemus=502;
	public static final int cUnitTypeHoplite=503;
	public static final int cUnitTypeHypaspist=504;
	public static final int cUnitTypeHippikon=505;
	public static final int cUnitTypeProdromos=506;
	public static final int cUnitTypePeltast=507;
	public static final int cUnitTypeToxotes=508;
	public static final int cUnitTypePetrobolos=509;
	public static final int cUnitTypeHelepolis=510;
	public static final int cUnitTypePriest=511;
	public static final int cUnitTypeMigdolStronghold=512;
	public static final int cUnitTypeChariotArcher=513;
	public static final int cUnitTypeMyrmidon=514;
	public static final int cUnitTypeHetairoi=515;
	public static final int cUnitTypeCataphract=516;
	public static final int cUnitTypeMercenary=517;
	public static final int cUnitTypeMonument2=518;
	public static final int cUnitTypeMonument3=519;
	public static final int cUnitTypeMonument4=520;
	public static final int cUnitTypeMonument5=521;
	public static final int cUnitTypeStatueofMajorGod=522;
	public static final int cUnitTypeDwarvenForge=523;
	public static final int cUnitTypeFolstagFlagBearer=524;
	public static final int cUnitTypeTrojanHorse=525;
	public static final int cUnitTypeBerryBush=526;
	public static final int cUnitTypeBolderWall=527;
	public static final int cUnitTypeMercenaryCavalry=528;
	public static final int cUnitTypePirateShip=529;
	public static final int cUnitTypeGateRam=530;
	public static final int cUnitTypeJarl=531;
	public static final int cUnitTypeWallLongDestructionSFX=532;
	public static final int cUnitTypeWallShortDestructionSFX=533;
	public static final int cUnitTypeWallConnectorDestructionSFX=534;
	public static final int cUnitTypeOutpost=535;
	public static final int cUnitTypeTransportShipGreek=536;
	public static final int cUnitTypeKebenit=537;
	public static final int cUnitTypeLongboat=538;
	public static final int cUnitTypeLighthouse=539;
	public static final int cUnitTypeHeroBoar=540;
	public static final int cUnitTypeHeroGreekHeracles=541;
	public static final int cUnitTypeHeroGreekJason=542;
	public static final int cUnitTypeFishingShipNorse=543;
	public static final int cUnitTypeFishingShipEgyptian=544;
	public static final int cUnitTypeTransportShipEgyptian=545;
	public static final int cUnitTypeTroyGate=546;
	public static final int cUnitTypeTroyWallConnector=547;
	public static final int cUnitTypeTroyWallLong=548;
	public static final int cUnitTypeTroyWallShort=549;
	public static final int cUnitTypeHeroGreekHippolyta=550;
	public static final int cUnitTypeHeroGreekTheseus=551;
	public static final int cUnitTypeHeroGreekBellerophon=552;
	public static final int cUnitTypeHeroGreekAjax=553;
	public static final int cUnitTypeHeroGreekAtalanta=554;
	public static final int cUnitTypeHeroGreekPerseus=555;
	public static final int cUnitTypeFlyingPurpleHippo=556;
	public static final int cUnitTypeCaravanGreek=557;
	public static final int cUnitTypeCaravanEgyptian=558;
	public static final int cUnitTypeRelic=559;
	public static final int cUnitTypeSkult=560;
	public static final int cUnitTypeBolderRolling=561;
	public static final int cUnitTypeGoldMineSmall=562;
	public static final int cUnitTypePineSnow=563;
	public static final int cUnitTypeCirce=564;
	public static final int cUnitTypeStopCombat=565;
	public static final int cUnitTypeNavalShipyard=566;
	public static final int cUnitTypeRammingShipGreek=567;
	public static final int cUnitTypeSiegeShipGreek=568;
	public static final int cUnitTypeHeroGreekArgo=569;
	public static final int cUnitTypeRammingShipNorse=570;
	public static final int cUnitTypeRammingShipEgyptian=571;
	public static final int cUnitTypeSiegeShipNorse=572;
	public static final int cUnitTypeSiegeShipEgyptian=573;
	public static final int cUnitTypeShade=574;
	public static final int cUnitTypeAnimalAttractor=575;
	public static final int cUnitTypeHealingSpringObject=576;
	public static final int cUnitTypeSerpent=577;
	public static final int cUnitTypeSentinelMain=578;
	public static final int cUnitTypeCitadelCenter=579;
	public static final int cUnitTypeWalkingWoodsPine=580;
	public static final int cUnitTypeWalkingWoodsOak=581;
	public static final int cUnitTypeWalkingWoodsPalm=582;
	public static final int cUnitTypeHeroRagnorok=583;
	public static final int cUnitTypeNidhogg=584;
	public static final int cUnitTypeFimbulwinterWolf=585;
	public static final int cUnitTypePlentyVault=586;
	public static final int cUnitTypePharaohofOsiris=587;
	public static final int cUnitTypeGoldMineDwarven=588;
	public static final int cUnitTypeFenrisWolf=589;
	public static final int cUnitTypeAthena=590;
	public static final int cUnitTypeWalrus=591;
	public static final int cUnitTypeWadjet=592;
	public static final int cUnitTypePetsuchos=593;
	public static final int cUnitTypeNemeanLion=594;
	public static final int cUnitTypeAgamemnon=595;
	public static final int cUnitTypeTheocrat=596;
	public static final int cUnitTypeShadeofHades=597;
	public static final int cUnitTypeAtlantisWallConnector=598;
	public static final int cUnitTypeAtlantisWallLong=599;
	public static final int cUnitTypeAtlantisGate=600;
	public static final int cUnitTypeTamariskTree=601;
	public static final int cUnitTypePhoenixEgg=602;
	public static final int cUnitTypePolarBear=603;
	public static final int cUnitTypeWalkingWoodsPineSnow=604;
	public static final int cUnitTypeCaribou=605;
	public static final int cUnitTypeElk=606;
	public static final int cUnitTypePigSpecial=607;
	public static final int cUnitTypeTitanBad=608;
	public static final int cUnitTypePalmBurning=609;
	public static final int cUnitTypeOakTreeBurning=610;
	public static final int cUnitTypePineBurning=611;
	public static final int cUnitTypeGreatBoxCart2=612;
	public static final int cUnitTypeTransportShipNorse=613;
	public static final int cUnitTypeThorHammerHaft=614;
	public static final int cUnitTypeThorHammerHead=615;
	public static final int cUnitTypePineSnowBurning=616;
	public static final int cUnitTypeWarElephant=617;
	public static final int cUnitTypeOakAutumn=618;
	public static final int cUnitTypeBrokk=619;
	public static final int cUnitTypeEitri=620;
	public static final int cUnitTypeDwarfFoundry=621;
	public static final int cUnitTypeHippocampus=622;
	public static final int cUnitTypeOakAutumnBurning=623;
	public static final int cUnitTypeSkraeling=624;
	public static final int cUnitTypeUnderworldPassageSPC=625;
	public static final int cUnitTypeCarcinos=626;
	public static final int cUnitTypeJormundElver=627;
	public static final int cUnitTypeMilitia=628;
	public static final int cUnitTypeKastor=629;
	public static final int cUnitTypeSeaSnake=630;
	public static final int cUnitTypeOldMan=631;
	public static final int cUnitTypeJailWall=632;
	public static final int cUnitTypeDigPile=633;
	public static final int cUnitTypeGoldenFleece=634;
	public static final int cUnitTypeTempleUnderworld=635;
	public static final int cUnitTypeArkantosman=636;
	public static final int cUnitTypeBolderRollingDead=637;
	public static final int cUnitTypeBolderRolling2=638;
	public static final int cUnitTypePineDead=639;
	public static final int cUnitTypeGateRam2=640;
	public static final int cUnitTypeMiniAtlantis=641;
	public static final int cUnitTypeAtlantisTile=642;
	public static final int cUnitTypeAtlantisTileDead=643;
	public static final int cUnitTypeWellofUrd=644;
	public static final int cUnitTypeTroyGateDead=645;
	public static final int cUnitTypePlentyVaultKOTH=646;
	public static final int cUnitTypePoseidonStatue=647;
	public static final int cUnitTypePharaohSecondary=648;
	public static final int cUnitTypeSavannahTree=649;
	public static final int cUnitTypeGoldenLion=650;
	public static final int cUnitTypeMonkeyRelic=651;
	public static final int cUnitTypeGhostShip=652;
	public static final int cUnitTypeShadeofErebus=653;
	public static final int cUnitTypeBanditMigdol=654;
	public static final int cUnitTypeGoldMineTiny=655;
	public static final int cUnitTypeWallMedium=656;
	public static final int cUnitTypeStatueofLightning=657;
	public static final int cUnitTypeCrossbowman=658;
	public static final int cUnitTypeFenceIron=659;
	public static final int cUnitTypeCharonFerry=660;
	public static final int cUnitTypeHeroBoar2=661;
	public static final int cUnitTypeTaproot=662;
	public static final int cUnitTypeFemale=663;
	public static final int cUnitTypeTheris=664;
	public static final int cUnitTypeOrnlu=665;
	public static final int cUnitTypePolaris=666;
	public static final int cUnitTypeTamariskTreeDead=667;
	public static final int cUnitTypePrisoner=668;
	public static final int cUnitTypeFolstagFlag=669;
	public static final int cUnitTypeUndermineBuildingDestructionSFX=670;
	public static final int cUnitTypePineDeadBurning=671;
	public static final int cUnitTypeApeofSet=672;
	public static final int cUnitTypeGazelleofSet=673;
	public static final int cUnitTypeHyenaofSet=674;
	public static final int cUnitTypeCrocodileofSet=675;
	public static final int cUnitTypeHippoofSet=676;
	public static final int cUnitTypeRhinocerosofSet=677;
	public static final int cUnitTypeGiraffeofSet=678;
	public static final int cUnitTypeKrakenSPC=679;
	public static final int cUnitTypeSavannahTreeBurning=680;
	public static final int cUnitTypeWonderSPC=681;
	public static final int cUnitTypeMonkeyRaft=682;
	public static final int cUnitTypeForkboy=683;
	public static final int cUnitTypeWalkingBerryBush=684;
	public static final int cUnitTypeChickenExploding=685;
	public static final int cUnitTypeWalkingWoodsSavannah=686;
	public static final int cUnitTypeErebusTree=687;
	public static final int cUnitTypeVillagerAtlantean=688;
	public static final int cUnitTypeManor=689;
	public static final int cUnitTypeVillagerAtlanteanHero=690;
	public static final int cUnitTypeSwordsman=691;
	public static final int cUnitTypeTridentSoldier=692;
	public static final int cUnitTypeTridentSoldierHero=693;
	public static final int cUnitTypeSwordsmanHero=694;
	public static final int cUnitTypeFishingShipAtlantean=695;
	public static final int cUnitTypeBireme=696;
	public static final int cUnitTypeTransportShipAtlantean=697;
	public static final int cUnitTypeFireShipAtlantean=698;
	public static final int cUnitTypeSiegeShipAtlantean=699;
	public static final int cUnitTypeLancer=700;
	public static final int cUnitTypeLancerHero=701;
	public static final int cUnitTypeCounterBuilding=702;
	public static final int cUnitTypeChieroballista=703;
	public static final int cUnitTypeFireSiphon=704;
	public static final int cUnitTypeCaravanAtlantean=705;
	public static final int cUnitTypePalace=706;
	public static final int cUnitTypeRoyalGuard=707;
	public static final int cUnitTypeRoyalGuardHero=708;
	public static final int cUnitTypeSkyPassage=709;
	public static final int cUnitTypeTitanAtlantean=710;
	public static final int cUnitTypeBarracksAtlantean=711;
	public static final int cUnitTypeArcherAtlantean=712;
	public static final int cUnitTypeArcherAtlanteanHero=713;
	public static final int cUnitTypeMaceman=714;
	public static final int cUnitTypeMacemanHero=715;
	public static final int cUnitTypeJavelinCavalry=716;
	public static final int cUnitTypeJavelinCavalryHero=717;
	public static final int cUnitTypeAudrey=718;
	public static final int cUnitTypeAudreyWater=719;
	public static final int cUnitTypeGuild=720;
	public static final int cUnitTypeVolcano=721;
	public static final int cUnitTypeBehemoth=722;
	public static final int cUnitTypeFlyingMedic=723;
	public static final int cUnitTypeTowerMirror=724;
	public static final int cUnitTypePromethean=725;
	public static final int cUnitTypeServant=726;
	public static final int cUnitTypeSatyr=727;
	public static final int cUnitTypeStymphalianBird=728;
	public static final int cUnitTypeAutomaton=729;
	public static final int cUnitTypeManOWar=730;
	public static final int cUnitTypePrometheanSmall=731;
	public static final int cUnitTypeOracleHero=732;
	public static final int cUnitTypeGaiaForesttree=733;
	public static final int cUnitTypeHekaGigantes=734;
	public static final int cUnitTypeTundraTree=735;
	public static final int cUnitTypeMarshTree=736;
	public static final int cUnitTypeTartarianGate=737;
	public static final int cUnitTypeOracleScout=738;
	public static final int cUnitTypeTartarianGatespawn=739;
	public static final int cUnitTypeLampades=740;
	public static final int cUnitTypeKastorAdult=741;
	public static final int cUnitTypeMarshTreeBurning=742;
	public static final int cUnitTypeTundraTreeBurning=743;
	public static final int cUnitTypePhoenixFromEgg=744;
	public static final int cUnitTypeHesperidesTree=745;
	public static final int cUnitTypeDryad=746;
	public static final int cUnitTypeNereid=747;
	public static final int cUnitTypeTitanGate=748;
	public static final int cUnitTypeWalkingWoodsMarsh=749;
	public static final int cUnitTypeWalkingWoodsTundra=750;
	public static final int cUnitTypeTitanPrometheus=751;
	public static final int cUnitTypeGeneralMelagius=752;
	public static final int cUnitTypePharaohofOsirisXP=753;
	public static final int cUnitTypeGuardianSleepingXP=754;
	public static final int cUnitTypeStatueofAutomaton=755;
	public static final int cUnitTypeStatueofAutomatonBase=756;
	public static final int cUnitTypeArgus=757;
	public static final int cUnitTypeGaiaPool=758;
	public static final int cUnitTypeSpiderEgg=759;
	public static final int cUnitTypeKingFolstag=760;
	public static final int cUnitTypeOdinsTower=761;
	public static final int cUnitTypeStatueManticore=762;
	public static final int cUnitTypeStatueCyclops=763;
	public static final int cUnitTypeStatueNemeanLion=764;
	public static final int cUnitTypeStatueValkyrie=765;
	public static final int cUnitTypeStatueHydra=766;
	public static final int cUnitTypeStatueChimera=767;
	public static final int cUnitTypeGaiaForesttreeburning=768;
	public static final int cUnitTypeTartarianGateplacement=769;
	public static final int cUnitTypeTartarianGatebirth=770;
	public static final int cUnitTypeKrios=771;
	public static final int cUnitTypeKronny=772;
	public static final int cUnitTypeAjaxOlder=773;
	public static final int cUnitTypeAmanraOlder=774;
	public static final int cUnitTypeTitanGateDead=775;
	public static final int cUnitTypeTempleKronos=776;
	public static final int cUnitTypeArkantosGod=777;
	public static final int cUnitTypeEarth=778;
	public static final int cUnitTypeKronnyFlying=779;
	public static final int cUnitTypeVictoryMarker=780;
	public static final int cUnitTypeInvisibleWall=781;
	public static final int cUnitTypeInvisibleTarget=782;
	public static final int cUnitTypePyramidOsirisXpack=783;
	public static final int cUnitTypeStatueofMelagius=784;
	public static final int cUnitTypeTempleOvergrown=785;
	public static final int cUnitTypeRocTent=786;
	public static final int cUnitTypeGuardianXP=787;
	public static final int cUnitTypeAutomatonSPC=788;
	public static final int cUnitTypeSummoningTree=789;
	public static final int cUnitTypeSummoningTree2=790;
	public static final int cUnitTypeBolderRollingSmall=791;
	public static final int cUnitTypeTreeFinale=792;
	public static final int cUnitTypeKastorStaff=793;
	public static final int cUnitTypeHadesDoorSmall=794;
	public static final int cUnitTypeTitanKronos=795;
	public static final int cUnitTypeTitanGaia=796;
	public static final int cUnitTypeWolfArctic=797;
	public static final int cUnitTypeShadeXP=798;
	public static final int cUnitTypeWolfArctic2=799;
	public static final int cUnitTypeBella=800;
	public static final int cUnitTypeUnit=801;
	public static final int cUnitTypeShip=802;
	public static final int cUnitTypeBuilding=803;
	public static final int cUnitTypeMilitaryBuilding=804;
	public static final int cUnitTypeEconomicBuilding=805;
	public static final int cUnitTypeDropsite=806;
	public static final int cUnitTypeResource=807;
	public static final int cUnitTypeHuntedResource=808;
	public static final int cUnitTypeMinedResource=809;
	public static final int cUnitTypeLandResource=810;
	public static final int cUnitTypeWaterResource=811;
	public static final int cUnitTypeProjectile=812;
	public static final int cUnitTypeNature=813;
	public static final int cUnitTypeSpecialPowers=814;
	public static final int cUnitTypeUnattackable=815;
	public static final int cUnitTypeAbstractTemple=816;
	public static final int cUnitTypeMilitary=817;
	public static final int cUnitTypeHero=818;
	public static final int cUnitTypeTree=819;
	public static final int cUnitTypeAbstractInfantry=820;
	public static final int cUnitTypeAbstractCavalry=821;
	public static final int cUnitTypeAbstractArcher=822;
	public static final int cUnitTypeAbstractVillager=823;
	public static final int cUnitTypeAbstractFarm=824;
	public static final int cUnitTypeAbstractDock=825;
	public static final int cUnitTypeInventoryHolder=826;
	public static final int cUnitTypeInventoryItem=827;
	public static final int cUnitTypeUseableItem=828;
	public static final int cUnitTypeStrengthBonus=829;
	public static final int cUnitTypeTradeableTo=830;
	public static final int cUnitTypeTradeableFrom=831;
	public static final int cUnitTypeAbstractSiegeWeapon=832;
	public static final int cUnitTypeFlyingUnit=833;
	public static final int cUnitTypeMythUnit=834;
	public static final int cUnitTypeEconomic=835;
	public static final int cUnitTypeRanged=836;
	public static final int cUnitTypeFastSpeed=837;
	public static final int cUnitTypeAverageSpeed=838;
	public static final int cUnitTypeSlowSpeed=839;
	public static final int cUnitTypeGeneric=840;
	public static final int cUnitTypeUnitClass=841;
	public static final int cUnitTypeBuildingClass=842;
	public static final int cUnitTypeNatureClass=843;
	public static final int cUnitTypeEmbellishmentClass=844;
	public static final int cUnitTypeTestClass=845;
	public static final int cUnitTypeE3Class=846;
	public static final int cUnitTypeAll=847;
	public static final int cUnitTypeActionGather=848;
	public static final int cUnitTypeActionTrain=849;
	public static final int cUnitTypeActionBuild=850;
	public static final int cUnitTypeActionAttack=851;
	public static final int cUnitTypeActionTrickle=852;
	public static final int cUnitTypeFish=853;
	public static final int cUnitTypeTransport=854;
	public static final int cUnitTypeAbstractWall=855;
	public static final int cUnitTypeHerdable=856;
	public static final int cUnitTypeAbstractSettlement=857;
	public static final int cUnitTypeBuildingsThatShoot=858;
	public static final int cUnitTypeMythUnitGodPower=859;
	public static final int cUnitTypeAbstractTitan=860;
	public static final int cUnitTypeAbstractTradeUnit=861;
	public static final int cUnitTypeLokiHero=862;
	public static final int cUnitTypeAge2Building=863;
	public static final int cUnitTypeAge3Building=864;
	public static final int cUnitTypeAge1Temple=865;
	public static final int cUnitTypeFood=866;
	public static final int cUnitTypeGold=867;
	public static final int cUnitTypeWood=868;
	public static final int cUnitTypeWildCrops=869;
	public static final int cUnitTypeAge1Building=870;
	public static final int cUnitTypeFoodDropsite=871;
	public static final int cUnitTypeWoodDropsite=872;
	public static final int cUnitTypeGoldDropsite=873;
	public static final int cUnitTypeHumanSoldier=874;
	public static final int cUnitTypeHuntable=875;
	public static final int cUnitTypeAbstractMonument=876;
	public static final int cUnitTypeSettlementsThatTrainVillagers=877;
	public static final int cUnitTypeHack=878;
	public static final int cUnitTypeCrush=879;
	public static final int cUnitTypePierce=880;
	public static final int cUnitTypeSharedBuilding=881;
	public static final int cUnitTypeAbstractStable=882;
	public static final int cUnitTypeAbstractFortress=883;
	public static final int cUnitTypeAbstractBarracks=884;
	public static final int cUnitTypeAbstractArcheryRange=885;
	public static final int cUnitTypeEarlyWoodDropsite=886;
	public static final int cUnitTypeEarlyFoodDropsite=887;
	public static final int cUnitTypeEarlyGoldDropsite=888;
	public static final int cUnitTypeConvertableBuilding=889;
	public static final int cUnitTypeFavor=890;
	public static final int cUnitTypeAnimalPrey=891;
	public static final int cUnitTypeAnimalReactive=892;
	public static final int cUnitTypeAnimalPredator=893;
	public static final int cUnitTypeAbstractPharaoh=894;
	public static final int cUnitTypeMythUnitInfantry=895;
	public static final int cUnitTypeMythUnitCavalry=896;
	public static final int cUnitTypeMythUnitArcher=897;
	public static final int cUnitTypeMythUnitSiege=898;
	public static final int cUnitTypeUtilityShip=899;
	public static final int cUnitTypeLogicalTypeHandUnitsAttack=900;
	public static final int cUnitTypeLogicalTypePredatorsAutoAttack=901;
	public static final int cUnitTypeLogicalTypeMeanPredatorsAutoAttack=902;
	public static final int cUnitTypeLogicalTypeHandUnitsAutoAttack=903;
	public static final int cUnitTypeLogicalTypePredatorsAttack=904;
	public static final int cUnitTypeLogicalTypeScoutsRespondToAttack=905;
	public static final int cUnitTypeLogicalTypeBuildingsNotHouses=906;
	public static final int cUnitTypeLogicalTypeRangedUnitsAttack=907;
	public static final int cUnitTypeLogicalTypeRangedUnitsAutoAttack=908;
	public static final int cUnitTypeLogicalTypeUnitsNotBuildings=909;
	public static final int cUnitTypeLogicalTypeDangerousAnimals=910;
	public static final int cUnitTypeLogicalTypeIdleCivilian=911;
	public static final int cUnitTypeLogicalTypeIdleMilitary=912;
	public static final int cUnitTypeLogicalTypeTornadoAttack=913;
	public static final int cUnitTypeLogicalTypeNeededForVictory=914;
	public static final int cUnitTypeLogicalTypeIdleHero=915;
	public static final int cUnitTypeLogicalTypeValidBoltTarget=916;
	public static final int cUnitTypeLogicalTypeAffectedByHealingSpring=917;
	public static final int cUnitTypeLogicalTypeAffectedByRestoration=918;
	public static final int cUnitTypeLogicalTypeGarrisonOnBoats=919;
	public static final int cUnitTypeLogicalTypeCavalryAndScout=920;
	public static final int cUnitTypeLogicalTypeNonGreekUnit=921;
	public static final int cUnitTypeLogicalTypeVillagersAttack=922;
	public static final int cUnitTypeLogicalTypeEarthquakeAttack=923;
	public static final int cUnitTypeAbstractArmory=924;
	public static final int cUnitTypeLogicalTypeSiegeAutoAttack=925;
	public static final int cUnitTypeLogicalTypeCanBeHealed=926;
	public static final int cUnitTypeLogicalTypeMinimapFilterEconomic=927;
	public static final int cUnitTypeLogicalTypeMinimapFilterMilitary=928;
	public static final int cUnitTypeArcherShip=929;
	public static final int cUnitTypeHammerShip=930;
	public static final int cUnitTypeSiegeShip=931;
	public static final int cUnitTypeAbstractCart=932;
	public static final int cUnitTypeAbstractScout=933;
	public static final int cUnitTypeLogicalTypeValidSpyTarget=934;
	public static final int cUnitTypeAutoupgradedUnit=935;
	public static final int cUnitTypeLogicalTypeNavalMilitary=936;
	public static final int cUnitTypeLogicalTypeValidFrostTarget=937;
	public static final int cUnitTypeLogicalTypeValidMeteorTarget=938;
	public static final int cUnitTypeLogicalTypeSeaSerpentAttack=939;
	public static final int cUnitTypeLogicalTypeFavoriteUnit=940;
	public static final int cUnitTypeLogicalTypeFavoriteMythUnit=941;
	public static final int cUnitTypeLogicalTypeConvertsHerds=942;
	public static final int cUnitTypeLogicalTypeValidLocustSwarmTarget=943;
	public static final int cUnitTypeLogicalTypeValidShiftingSandsTarget=944;
	public static final int cUnitTypeLogicalTypeParticipatesInBattlecries=945;
	public static final int cUnitTypeLogicalTypeBuildingsThatTrainMilitary=946;
	public static final int cUnitTypeLogicalTypeRamAttack=947;
	public static final int cUnitTypeTransportShip=948;
	public static final int cUnitTypeLogicalTypeVillagersRespondToAttack=949;
	public static final int cUnitTypeLogicalTypeFimbulWinterTCEvalType=950;
	public static final int cUnitTypeLogicalTypeValidForestFireTarget=951;
	public static final int cUnitTypeLogicalTypeAutoattackTargetsBuildings=952;
	public static final int cUnitTypeWalkingWood=953;
	public static final int cUnitTypeLogicalTypeLandMilitary=954;
	public static final int cUnitTypeLogicalTypeValidSPCUnitsDeadCondition=955;
	public static final int cUnitTypeLogicalTypeAffectedByTownBell=956;
	public static final int cUnitTypeLogicalTypeValidFlamingWeaponsTarget=957;
	public static final int cUnitTypeLogicalTypeGreekHeroes=958;
	public static final int cUnitTypeLogicalTypeMilitaryUnitsAndBuildings=959;
	public static final int cUnitTypeLogicalTypeOdinRegenerates=960;
	public static final int cUnitTypeLogicalTypeValidTraitorsTarget=961;
	public static final int cUnitTypeLogicalTypeSuperPredatorsAttack=962;
	public static final int cUnitTypeLogicalTypeSuperPredatorsAutoAttack=963;
	public static final int cUnitTypeLogicalTypeVolcanoAttack=964;
	public static final int cUnitTypeLogicalTypeValidDeconstructionTarget=965;
	public static final int cUnitTypeLogicalTypeValidTremorAttack=966;
	public static final int cUnitTypeLogicalTypeAffectedByChaos=967;
	public static final int cUnitTypeLogicalTypeValidReverseWonderTarget=968;
	public static final int cUnitTypeLogicalTypeCanBeThrown=969;
	public static final int cUnitTypeLogicalTypeTartarianGateValidOverlapPlacement=970;
	public static final int cUnitTypeLogicalTypeAffectedByVortex=971;
	public static final int cUnitTypeLogicalTypeDoesNotCreateLush=972;
	public static final int cUnitTypeLogicalTypeAffectedByHeroize=973;
	public static final int cUnitTypeLogicalTypeValidSpiderTarget=974;
	public static final int cUnitTypeLogicalTypeImplodeAttack=975;
	public static final int cUnitTypeLogicalTypeCanBeStoned=976;
	public static final int cUnitTypeLogicalTypeAffectedByFrostGiant=977;
	public static final int cUnitTypeLogicalTypePerseusCanStone=978;
	public static final int cUnitTypeLogicalTypeMummyMinionTarget=979;
	public static final int cUnitTypeTeleporter=980;
	public static final int cUnitTypeLogicalTypeScreamsOnSpiderPull=981;
	public static final int cUnitTypeLogicalTypeTimeshift=982;
	public static final int cUnitTypeLogicalTypeInvulnerableToGaia=983;
	public static final int cUnitTypeLogicalTypeEasySelectAvoid=984;
	public static final int cUnitTypeLogicalTypeBuildingNotTitanGate=985;
	public static final int cUnitTypeLogicalTypeBuildingsNotWalls=986;
	public static final int cUnitTypeLogicalTypeNoFlailOnThrow=987;
	public static final int cUnitTypeLogicalTypeEscapesFrostOnTransform=988;
	public static final int cUnitTypeSetAnimal=989;
	public static final int cUnitTypeLogicalTypeMythUnitNotTitan=990;
	public static final int cUnitTypeLogicalTypeShipNotFishinghip=991;
	public static final int cUnitTypeLogicalTypeAbstractVillNotHero=992;
	public static final int cUnitTypeLogicalTypeHouses=993;
	public static final int cUnitTypeLogicalTypeGates=994;
*/
	/**
	 * Returns a substring of a given string from the given start position to the end position.
	 * @param sText the input string
	 * @param startPos the position to start at
	 * @param endPos the position to end
	 * @return the new substring
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static string String_substr(string sText, int startPos, int endPos) {
		return null;
	}
	
	/**
	 * Returns the length of a given string.
	 * @param sText the input string
	 * @return the length of the given string
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static int String_length(string sText) {
		return 0;
	}
	
	/**
	 * Returns a character from a given string at the given position.
	 * 
	 * @param sText the input string
	 * @param pos the position of the wanted char
	 * @return the char at position (pos)
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static string String_charAt(string sText, int pos) {
		return null;
	}
	
	/**
	 * Converts the input string to upper case [A-Z].
	 * 
	 * @param sText the input string
	 * @return The upper case string
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static string String_toUpperCase(string sText) {
		return null;
	}
	
	/**
	 * Converts the input string to lower case [a-z].
	 * 
	 * @param sText the input string
	 * @return the lower case string
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static string String_toLowerCase(string sText) {
		return null;
	}
	
	/**
	 * Converts a String that only holds a float into a real floating point number.
	 * 
	 * @param sText the input string
	 * @return the float that was parsed from the string
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static float String_parseFloat(string sText) {
		return 0.0f;
	}
	
	/**
	 * Converts a floating point number to a string.
	 * @param a the input float
	 * @return the string that was created from the float
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static string String_toString(float a) {
		return null;
	}
	
	/**
	 * Returns the rest after division of 2 numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a % b
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_mod(float a, float b) {
		return 0.0f;
	}
	
	/**
     * Returns the largest (closest to positive infinity)
     * int value that is less than or equal to the
     * argument and is equal to a mathematical integer.
     * 
	 * @param a
	 * @return Returns the largest (closest to positive infinity)
     * int value that is less than or equal to the
     * argument and is equal to a mathematical integer.
     * 
     * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_floor(float a) {
		return 0;
	}
	
	/**
	 * Returns the smallest (closest to negative infinity)
     * int value that is greater than or equal to the
     * argument and is equal to a mathematical integer.
     * 
	 * @param a
	 * @return Returns the smallest (closest to negative infinity)
     * int value that is greater than or equal to the
     * argument and is equal to a mathematical integer.
     * 
     * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_ceil(float a) {
		return 0;
	}
	
	/**
	 * Converts a radian into a degree.
	 * 
	 * @param radian
	 * @return the degree
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_radianToDegree(float radian) {
		return 0.0f;
	}
	
	/**
	 * Converts a degree into a radian.
	 * 
	 * @param degree
	 * @return the radian
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_degreeToRadian(float degree) {
		return 0.0f;
	}
	
	/**
	 * Converts an int value into a bool.
	 * 
	 * @param a
	 * @return false if a is 0, true otherwise
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static bool Math_intToBool(int a) {
		return null;
	}
	
	/**
	 * Converts a bool into an integer.
	 * 
	 * @param a
	 * @return 1 if a is true, 0 otherwise
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_boolToInt(bool a) {
		return 0;
	}
	
	/**
	 * Converts an int to a float.
	 * 
	 * @param a
	 * @return the new float
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_intToFloat(int a) {
		return 0.0f;
	}
	
	/**
	 * Converts a float into an int.
	 *  
	 * @param a
	 * @return the new int
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_floatToInt(float a) {
		return 0;
	}
	
	/**
	 * Returns the value of the first argument raised to the power of the
     * second argument. 
     * 
	 * @param n
	 * @param x
	 * @return n^x
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_pow(float n, int x) {
		return 0.0f;
	}
	
	/**
	 * Returns the absolute value of the first argument.
	 * 
	 * @param a
	 * @return a if a>=0; -a if a<0 
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_abs(float a) {
		return 0.0f;
	}
	
	/**
	 * Returns the factorial of the given param.
	 * 
	 * @param n
	 * @return n!
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * <DT><B>Author:</B><DD>Matei</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_fact(int n) {
		return 0.0f;
	}
	
	/**
	 * Returns the closest int near the given float.
	 * 
	 * @param a
	 * @return the closest int
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_round(float a) {
		return 0;
	}
	
	/**
	 * Returns an approximation of the given value to a certain accuracy.
	 * 
	 * @param a the value to approximate
	 * @param approx the required accuracy
	 * @return the approximated value
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_approx(float a, float approx) {
		return 0.0f;
	}
	
	/**
	 * Returns the greatest common divisor of 2 values.
	 * 
	 * @param a
	 * @param b
	 * @return the greatest common divisor of a and b
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_gcd(int a, int b) {
		return 0;
	}
	
	/**
	 * Returns the least common multiple of 2 values.
	 * @param a
	 * @param b
	 * @return the least common multiple of a and b
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	int Math_lcm(int a, int b) {
		return 0;
	}
	
	/**
	 * Returns the arc tangent of a value; the returned angle is in the
     * range -<i>PI</i>/2 through <i>PI</i>/2.
	 * 
	 * @param n angle in radians
	 * @return the arc tangent of n
	 * 
	 * <DT><B>Author:</B><DD>Matei</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_atan(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the angle <i>theta</i> from the conversion of rectangular
     * coordinates (<code>x</code>,&nbsp;<code>y</code>) to polar
     * coordinates (r,&nbsp;<i>theta</i>).
     * This method computes the phase <i>theta</i> by computing an arc tangent
     * of <code>y/x</code> in the range of -<i>PI</i> to <i>PI</i>. 
     * 
	 * @param   z   the ordinate coordinate
     * @param   x   the abscissa coordinate
     * @return  the <i>theta</i> component of the point
     *          (<i>r</i>,&nbsp;<i>theta</i>)
     *          in polar coordinates that corresponds to the point
     *          (<i>x</i>,&nbsp;<i>y</i>) in Cartesian coordinates.

	 * 
	 * <DT><B>Author:</B><DD>Matei</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_atan2(float z, float x) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cosine of an angle.
	 *  
	 * @param n angle in radians
	 * @return the cosine of n
	 * 
	 * <DT><B>Author:</B><DD>Matei</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_cos(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric sine of an angle.
	 * 
	 * @param n angle in radians
	 * @return the sine of n
	 * 
	 * <DT><B>Author:</B><DD>Matei</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_sin(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric tangent of an angle.
	 * 
	 * @param n angle in radians
	 * @return the tangent of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_tan(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cotangent of an angle.
	 * 
	 * @param n angle in radians
	 * @return the cotangent of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_cotan(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric secant of an angle.
	 * 
	 * @param n angle in radians
	 * @return the secant of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_sec(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cosecant of an angle.
	 * 
	 * @param n angle in radian
	 * @return the cosecant of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_cosec(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric sine hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the sine hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_sinh(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cosine hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the cosine hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_cosh(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric tangent hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the tangent hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_tanh(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cotangent hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the cotangent hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_cotanh(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric secant hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the secant hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_sech(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the trigonometric cosecant hyperbolic of an angle.
	 * 
	 * @param n angle in radians
	 * @return the cosecant hyperbolic of n
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_cosech(float n) {
		return 0.0f;
	}
	
	/**
	 * Returns the square root of a given value.
	 * 
	 * @param s
	 * @return the square root of s
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_sqrt(float s) {
		return 0.0f;
	}
	
	/**
	 * Returns the cubic root of a given value
	 * @param s
	 * @return the cubic root of s
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static 	float Math_cbrt(float s) {
		return 0.0f;
	}
	
	/**
	 * Solves the quadratic formula to solve a quadratic equation.
	 * 
	 * @param a the a as in ax� + bx + c
	 * @param b the b as in ax� + bx + c
	 * @param c the c as in ax� + bx + c
	 * @return The first component of the result vector is the first solution.
	 * The second component of the result vector is the second solution.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static vector Math_QF(float a, float b, float c) {
		return null;
	}
	
	/**
	 * Returns the highest of 2 params.
	 * 
	 * @param a
	 * @param b
	 * @return the highest value out of a and b
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_max(float a, float b) {
		return 0.0f;
	}
	
	/**
	 * Returns the lowest value of 2 params.
	 * 
	 * @param a
	 * @param b
	 * @return the lowest value out of a and b
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_min(float a, float b) {
		return 0.0f;
	}
	
	/**
	 * Returns the distance between 2 points in a 3D location.
	 * @param a the 1st point
	 * @param b the 2nd point
	 * @return the distance d(a,b)
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static 	float Math_dist(vector a, vector b) {
		return 0.0f;
	}
	
	/**
	 * Returns Euler's number <i>e</i> raised to the power of a
     * <code>float</code> value. 
     * 
	 * @param a
	 * @return e^a
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_exp(float a) {
		return 0.0f;
	}
	
	/**
	 * Returns the natural logarithm (base <i>e</i>) of a <code>float</code>
     * value.
	 * @param a the value to calculate ln on
	 * @param acc the wanted accuracy: higher accuracy(1000+) will slow down calculation
	 * @return ln(a)
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_ln(float a, int acc) {
		return 0.0f;
	}
	
	/**
	 * Returns the logarithm with given base of a <code>float</code> value.
     * 
     * @param base the base value of the logarithm
	 * @param resa the value to calculate log on
	 * @param acc the wanted accuracy: higher accuracy(1000+) will slow down calculation
	 * @return log_base(resa)
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static float Math_log(float base, float resa, int acc) {
		return 0.0f;
	}
	
	/**
	 * Returns the logarithm with base 2 of a <code>float</code> value.
     * 
	 * @param resa the value to calculate log2 on
	 * @param acc the wanted accuracy: higher accuracy(1000+) will slow down calculation
	 * @return log2(resa)
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_log2(float resa, int acc) {
		return 0.0f;
	}
	
	/**
	 * Returns the logarithm with base 10 of a <code>float</code> value.
	 * 
	 * @param resa the value to calculate log10 on
	 * @param acc the wanted accuracy: higher accuracy(1000+) will slow down calculation
	 * @return log10(resa)
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static 	float Math_log10(float resa, int acc) {
		return 0.0f;
	} 
	
	/**
	 * Returns a <code>float</code> value with a positive sign, greater 
     * than or equal to <code>0.0</code> and less than <code>1.0</code>. 
     * Returned values are chosen pseudorandomly with (approximately) 
     * uniform distribution from that range.
     * 
	 * @return a random number in the [0,1] interval
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static 	float Math_rand() {
		return 0.0f;
	}
	
	/**
	 * Returns the signum function of the argument; zero if the argument
     * is zero, 1 if the argument is greater than zero, -1 if the
     * argument is less than zero.
     * 
	 * @param a
	 * @return -1 if a<0; 0 if a=0; 1 if a>0
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static int Math_sign(float a) {
		return 0;
	}
	
	/**
	 * Decides whether or not a point in 2D space is part of a rectangle.
	 * 
	 * @param topLeft the topleft point of the rectangle
	 * @param bottomRight the bottomright point of the rectangle
	 * @param point the point to check
	 * @return true if the point is in the rectangle, false otherwise.
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.00
	 */
	public static bool Math_pointIsInRectangle(vector topLeft, vector bottomRight, vector point) {
		return null;
	}
	
	/**
	 * Unfortunately invent00r forgot what this is for, but he'll try to explain in version 3. -_-"
	 * 
	 * @param a
	 * @param b
	 * @param distance
	 * @return
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static vector Math_GetVectorial(vector a, vector b, float distance) {
		return null;
	}
	
	/**
	 * Unfortunately invent00r forgot what this is for, but he'll try to explain in version 3. -_-"
	 * 
	 * @param a
	 * @param b
	 * @param y
	 * @return
	 * 
	 * <DT><B>Author: </B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static vector Math_GetVectorialVector(vector a, vector b, float y) {
		return null;
	}
	
	/**
	 * UI selects the unit, i.e. not trigger selection.
	 * 
	 * @param playerID the owner of the unit
	 * @param unitName the scenario name of this unit
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 1.00
	 */
	public static void uiSelectUnit(int playerID, string unitName) {
		
	}
	
	/**
	 * UI selects the unit, i.e. not trigger selection.
	 * 
	 * @param playerID the owner of the unit
	 * @param unitID the unit ID�
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 1.00
	 */	
	public static void uiSelectUnitByID(int playerID, int unitID) {
		
	}
	
	/**
	 * Resets the camera to its default position.
	 * 
	 * @since 1.01
	 */
	public static void uiResetCamera() {
		
	}
	
	/**
	 * Sets the lightning completely random.
	 * 
	 * <DT><B>Author:</B><DD>nottud</DD> 
	 * 
	 * @since 1.01
	 */
	public static void uiRandomLightning() {
		
	}
	
	/**
	 * Selects a unit of the given type, but does not focus on it.
	 * 
	 * @param type the unit type to select
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 1.01
	 */
	public static void uiSelectType(string type) {
		
	}
	
	/**
	 * Selects an idle unit of the given type, but does not focus on it.
	 * 
	 * @param type the unit type to select
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 1.01
	 */
	public static void uiSelectIdleType(string type) {
		
	}
	
	/**
	 * Trains a unit using the UI commands.
	 * 
	 * @param protoUnit the protounit to train
	 * @param buildingUnitName the scenario name of the building to train the unit from
	 * @param repeat turn autoqueue on or not?
	 * @param playerID the player that should train the unit
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 1.01
	 */
	public static void uiTrainUnit(string protoUnit, string buildingUnitName, bool repeat, int playerID) {
		
	}
	
	/**
	 * Heroizes the given unit.
	 * 
	 * @param unitName the scenario name of the unit
	 * @param playerID the owner of the unit
	 * 
	 * @since 1.01
	 */
	public static void uiHeroizeUnit(string unitName, int playerID) {
		
	}
	
	/**
	 * Sets a new context player, and saves the previous one. Can be nested.
	 * 
	 * @param playerID the new context player
	 * 
	 * @see #xsRestoreContextPlayer()
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 2.00
	 */
	public static void xsSaveAndSetContextPlayer(int playerID) {
		
	}
	
	/**
	 * Restores the previously saved context player. Can be nested.
	 * 
	 * @see #xsSaveAndSetContextPlayer(int)
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 2.00
	 */
	public static void xsRestoreContextPlayer() {
		
	}
	
	/**
	 * Checks if the current game is played in singleplayer or multiplayer mode.
	 * 
	 * @return true if the game is played in multiplayer mode, else false.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool kbIsMultiplayer() {
		return null;
	}
	
	/**
	 * Returns the current owner of the unit.
	 * 
	 * @param unitID the unit ID to check
	 * 
	 * @return the owner ID of the unit
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 1.00
	 */
	public static int trGetUnitOwnerByID(int unitID) {
		return 0;
	}
	
	/**
	 * Returns the current owner of the unit.
	 * 
	 * @param unitName the scenario name of the unit
	 * 
	 * @return the owner ID of the unit
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD> 
	 * 
	 * @since 1.00
	 */
	public static int trGetUnitOwner(string unitName) {
		return 0;
	}
	
	/**
	 * Switches the current mode to editor mode.
	 * 
	 * <DT><B>Author:</B><DD>nottud</DD> 
	 * 
	 * @since 1.01
	 */
	public static void enterEditorMode() {
		
	}
	
	/**
	 * Leaves the editor mode and returns to the actual game.
	 * 
	 * <DT><B>Author:</B><DD>nottud</DD>
	 * 
	 *  @since 1.01
	 */
	public static void leaveEditorMode() {
		
	}
	
	/**
	 * Executes a console command that can only run in editor mode.
	 * 
	 * @param cmd the command to execute
	 * 
	 * <DT><B>Author:</B><DD>nottud</DD>
	 * 
	 *  @since 1.01
	 */
	public static void trRunEditorConsoleCommand(string cmd) {
		
	}
	
	/**
	 * Returns the ID of a unit matching the following criteria:
	 * 
	 * @param unitType the type of the unit 
	 * @param action the current action of the unit
	 * @param center the unit closest to this point will be returned if it is provided, else it will pick a random unit from the results.
	 * 
	 * @return returns the ID of the chosen unit.
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.01
	 */
	public static int getUnit(int unitType, int action, vector center) {
		return 0;
	}
	
	/**
	 * Creates and executes a unit query with the following results and returns the query ID.
	 *  
	 * @param qname the name of the query
	 * @param unitType the unit type to search for
	 * @param action the current action of the unit
	 * @param statea the current state of the unit
	 * @param playera the unit owner
	 * @param center if sort is enabled the results will be sorted based on the distance to this point, ascending
	 * @param sort true if the results should be sorted in ascending order
	 * @param radiusa the max radius the units may be from the center point 
	 * 
	 * @return the query ID
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.01
	 */
	public static int kbUnitQueryCreate2(string qname, int unitType, int action, int statea, int playera, vector center, bool sort, float radiusa) {
		return 0;
	}
	
	/**
	 * Outputs a piece of text to the game.
	 * 
	 * @param text the text for output
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD>
	 * 
	 * @since 1.01
	 */
	public static void print(string text) {
		
	}
	
	/**
	 * Returns a time string formatted as hh:mm:ss or mm:ss if the game does not last an hour yet.
	 * 
	 * @return the time string
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 1.02
	 */
	public static string getTime() {
		return null;
	}
	
	/**
	 * Saves the current camera position (in-game, not in the editor) to a given file.
	 * 
	 * @param filename the name of the file to store the camera position
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void saveCameraOnline(string filename) {
		
	}
	
	/**
	 * Load a camera position from a given file.
	 * 
	 * @param filename the name of the file to retrieve the camera postion from
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void loadCameraOnline(string filename) {
		
	}
	
	/**
	 * Forced the camera to look straight down to 1 point.
	 * 
	 * @param point the point to zoom at.
	 * 
	 * <DT><B>Author:</B><DD>nottud</DD>
	 * 
	 * @since 1.02 
	 * 
	 * @note This function is very inaccurate, and may fail for certain elevations.
	 */
	public static void zoomToPoint(vector point) {
		
	}
	
	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void clickAtPoint(vector point) {
		
	}

	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse shift-click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void shiftClickAtPoint(vector point) {
		
	}

	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse double-click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void doubleClickAtPoint(vector point) {
		
	}

	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse shift-double-click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void shiftDoubleClickAtPoint(vector point) {
		
	}
	
	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse control-double-click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 2.00
	 */
	public static void controlDoubleClickAtPoint(vector point) {
		
	}
	
	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a left mouse control-shift-double-click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 2.00
	 */
	public static void controlShiftDoubleClickAtPoint(vector point) {
		
	}

	/**
	 * Forces the camera to the given point with zoomToPoint, 
	 * and issues a right mouse click command.
	 * 
	 * @param point the point to click
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak</DD>
	 * 
	 * @since 1.02
	 */
	public static void rightClickAtPoint(vector point) {
		
	}
	
	/**
	 * Assigns a vector(X,Y,Z) to a VQV.
	 * 
	 * @param VQVname the vector QV name
	 * @param QVv the vector to assign
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static void trVectorQuestVarSet(string VQVname, vector QVv) {
		
	}
	
	/**
	 * Returns the vector assigned to the given VQV.
	 * 
	 * @param VQVname the vector QV name
	 * 
	 * @return the vector assigned to VQVname
	 * 
	 * @note uninitialized QVs start at (-1,-1,-1).
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static vector trVectorQuestVarGet(string VQVname) {
		return null;
	}
	
	/**
	 * Returns the X component of the given VQV.
	 * 
	 * @param VQVname the vector QV name
	 * 
	 * @return the X component of VQVname 
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00 
	 * 
	 */
	public static float trVectorQuestVarGetX(string VQVname) {
		return 0.0f;
	}
	
	/**
	 * Returns the Y component of the given VQV.
	 * 
	 * @param VQVname the vector QV name
	 * 
	 * @return the Y component of VQVname 
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static float trVectorQuestVarGetY(string VQVname) {
		return 0.0f;
	}
	
	/**
	 * Returns the Z component of the given VQV.
	 * 
	 * @param VQVname the vector QV name
	 * 
	 * @return the Z component of VQVname 
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static float trVectorQuestVarGetZ(string VQVname) {
		return 0.0f;
	}
	
	/**
	 * Echoes the VQV to the output.
	 *  
	 * @param VQVname the vector QV to echo
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static void trVectorQuestVarEcho(string VQVname) {
		
	}
	
	/**
	 * Assigns a string to a given string QV.
	 * 
	 * @param SQVname the string QV name
	 * @param SQVvalue the value to be assigned
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD>
	 * 
	 * @since 1.00
	 */
	public static void trStringQuestVarSet(string SQVname, string SQVvalue) {
		
	}
	
	/**
	 * Returns the string assigned to the given string QV.
	 * 
	 * @param SQVname the string QV
	 * 
	 * @return the string assigned to SQVname
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static string trStringQuestVarGet(string SQVname) {
		return new string("");
	}
	
	/**
	 * Echoes the SQV to the output.
	 * 
	 * @param SQVname the string QV to echo
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 1.00
	 * 
	 */
	public static void trStringQuestVarEcho(string SQVname) {
		
	}
	
	/**
	 * Assigns an army to the given army QV.
	 * 
	 * @param QVAname the army QV
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static void trQuestVarArmySet(string QVAname, vector army) {
		
	}
	
	/**
	 * Returns the army assigned to the given army QV.
	 * 
	 * @param QVAname the army QV
	 * 
	 * @return the value assigned to the army QV
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static string trQuestVarArmyGet(string QVAname) {
		return null;
	}
	
	/**
	 * Returns the army ID of the given army QV.
	 * 
	 * @param QVAname the army QV
	 * 
	 * @return the army ID of the army QV.
	 * 
	 * <DT><B>Author:</B><DD>invent00r & Mythic_Freak</DD> 
	 * 
	 * @since 2.00
	 */
	public static int trQuestVarArmyGetID(string QVAname) {
		return -1;
	}
	
	/**
	 * Returns the player ID of the given army QV.
	 * 
	 * @param QVAname the army QV
	 * 
	 * @return the player ID of the army QV.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int trQuestVarArmyGetPlayerID(string QVAname) {
		return -1;
	}
	
	/**
	 * Echoes the army QV to the output.
	 * 
	 * @param QVAname the army QV
	 * 
	 * <DT><B>Author:</B><DD>invent00r & Mythic_Freak</DD> 
	 * 
	 * @since 2.00
	 */
	public static void trQuestVarArmyEcho(string QVAname) {
		
	}
	
	/**
	 * Converts an array name to an array ID.
	 * 
	 * @param ArrayName the array name
	 * 
	 * @return the array ID.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayGetID(string ArrayName) {
		return -1;
	}
	
	/**
	 * Returns the size of the array. The X-component is the X-size, and the Y-component is the Y-size.
	 * 
	 * @param ArrayName the name of the array
	 * 
	 * @return a vector containing the 2 size values.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static vector xsArrayGetSizeByName(string ArrayName) {
		return null;
	}
	
	/**
	 * Returns the X-size of the given array.
	 * 
	 * @param ArrayName the name of the array
	 * 
	 * @return the X-size of the array.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayGetSizeXByName(string ArrayName) {
		return -1;
	}
	
	/**
	 * Returns the Y-size of the given array.
	 * 
	 * @param ArrayName the name of the array
	 * 
	 * @return the Y-size of the array.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayGetSizeYByName(string ArrayName) {
		return -1;
	}
	
	/**
	 * Returns the size of the array. The X-component is the X-size, and the Y-component is the Y-size.
	 * 
	 * @param Aid the ID of the array
	 * 
	 * @return a vector containing the 2 size values.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static vector xsArrayGetSize(int Aid) {
		return null;
	}
	
	/**
	 * Returns the X-size of the given array.
	 * 
	 * @param Aid the ID of the array
	 * 
	 * @return the X-size of the array.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayGetSizeX(int Aid) {
		return -1;
	}
	
	/**
	 * Returns the Y-size of the given array.
	 * 
	 * @param Aid the ID of the array
	 * 
	 * @return the Y-size of the array.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayGetSizeY(int Aid) {
		return -1;
	}
	
	/**
	 * Sets the default value of the given array.
	 * 
	 * @param Aid the array ID
	 * @param defaultvalue the default value to set
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArraySetDefaultValue(int Aid, float defaultvalue) {
		return null;
	}
	
	/**
	 * Returns the default value of the given array.
	 * 
	 * @param Aid the array ID
	 * 
	 * @return the default value.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static float xsArrayGetDefaultValue(int Aid) {
		return -1.0f;
	}
	
	/**
	 * Sets a value of the array.
	 * 
	 * @param ArrayName the name of the array
	 * @param value the value to set
	 * @param posX the X-position
	 * @param posY the Y-position
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArraySetByName(string ArrayName, float value, int posX, int posY) {
		return null;
	}
	
	/**
	 * Sets a value of the array.
	 * 
	 * @param Aid the ID of the array
	 * @param value the value to set
	 * @param posX the X-position
	 * @param posY the Y-position
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArraySet(int Aid, float value, int posX, int posY) {
		return null;
	}
	
	/**
	 * Fills the given array with a given value.
	 * 
	 * @param Aid the array ID
	 * @param defaultvalue the value to fill the array with
	 * @param replaceVal if this value is set, only those values will be overwritten in the array.
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArrayFill(int Aid, float defaultvalue, float replaceVal) {
		return null;
	}
	
	/**
	 * Fills the given array with a given value.
	 * 
	 * @param ArrayName the name of the array
	 * @param defaultvalue the value to fill the array with
	 * @param replaceVal if this value is set, only those values will be overwritten in the array. 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArrayFillByName(string ArrayName, float defaultvalue, float replaceVal) {
		return null;
	}
	
	/**
	 * Resizes the given array, filling new spots with the default value.
	 * 
	 * @param Aid the array ID
	 * @param newSizeX the new X-size
	 * @param newSizeY the new Y-size
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArrayResize(int Aid, int newSizeX, int newSizeY) {
		return null;
	}
	
	/**
	 * Creates a new array of float values, with given dimensions and default value.
	 * 
	 * @param ArrayName the array name
	 * @param dimX the X-size
	 * @param dimY the Y-size
	 * @param defaultvalue the default value
	 * 
	 * @return the array ID.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayCreate(string ArrayName, int dimX, int dimY, float defaultvalue) {
		return -1;
	}
	
	/**
	 * Gets a value from the given array.
	 * 
	 * @param ArrayName the array name
	 * @param posX the X-position
	 * @param posY the Y-position
	 * 
	 * @return the value found at ArrayName[posX][posY]. 
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static float xsArrayGetByName(string ArrayName, int posX, int posY) {
		return -1.0f;
	}
	
	/**
	 * Gets a value from the given array.
	 * 
	 * @param Aid the array ID
	 * @param posX the X-position
	 * @param posY the Y-position
	 * 
	 * @return the value found at Aid[posX][posY]. 
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static float xsArrayGet(int Aid, int posX, int posY) {
		return -1.0f;
	}
	
	/**
	 * Echoes a value in the array to the output.
	 * 
	 * @param AName the name of the array
	 * @param posX the X-position
	 * @param posY the Y-position
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static void xsArrayEcho(string AName, int posX, int posY) {
		
	}
	
	/**
	 * Echoes all values in the array to the output, in a linear manner.
	 * 
	 * @param AName the name of the array
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static void xsArrayEchoAll(string AName) {
		
	}
	
	/**
	 * Echoes all values in the array to the output, in a matrix formation.
	 * Only works for relatively small arrays.
	 * 
	 * @param AName the name of the array
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static void xsArrayEchoAll2(string AName) {
		
	}
	
	/**
	 * Returns true if both arrays have the same content.
	 * 
	 * @param AName1 the name of array 1
	 * @param AName2 the name of array 2
	 * 
	 * @return true if all values match, otherwise false.
	 * 
	 * <DT><B>Author:</B><DD>Mythic_Freak & invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArrayEqual(string AName1, string AName2) {
		return null;
	}
	
	/**
	 * Swaps 2 columns in the given array.
	 * @param ArrayName the name of the array
	 * @param lineA column 1 to swap
	 * @param lineB column 2 to swap
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArraySwapByName(string ArrayName, int lineA, int lineB) {
		return null;
	}
	
	/**
	 * Swaps 2 columns in the given array.
	 * @param Aid the ID of the array
	 * @param lineA column 1 to swap
	 * @param lineB column 2 to swap
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static bool xsArraySwap(int Aid, int lineA , int lineB) {
		return null;
	}
	
	/**
	 * Sort a given row of the array, in chosen order.
	 * 
	 * @param Aid the array ID
	 * @param posY the row to sort
	 * @param Descending the compare operator (> or <)
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */	
	public static bool xsArraySort(int Aid, int posY, bool Descending) {
		return null;
	}
	
	/**
	 * Tries to find a value in a given row of the provided array.
	 * 
	 * @param Aid the array ID
	 * @param posY the row number
	 * @param nFind the value to search for
	 * 
	 * @return the X-position of the found element, or -1 in case the value was not present.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */
	public static int xsArrayFind(int Aid, int posY, int nFind ) {
		return -1;
	}
	
	/**
	 * Deletes an X-column from the array.
	 * 
	 * @param Aid the array ID
	 * @param posX the column to delete
	 * 
	 * @return true if the operation was successful.
	 * 
	 * <DT><B>Author:</B><DD>invent00r</DD> 
	 * 
	 * @since 2.00
	 */	
	public static bool xsArrayDelete(int Aid, int posX) {
		return null;
	}
	
	//hide stuff
	private TriggerLoaderX() {}
	
	static {
		cMyID = 0;
		cMyCiv = 0;
		cMyCulture = 0;
		cNumberNonGaiaPlayers = 0;
		cGameMode = 0;
	}
}