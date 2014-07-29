package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of AI commands concerning God Powers.
 * 
 * @note The power constants listed here are usually not required, 
 * what you really need is the respective techID.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class GodPower {
	//Power Type Constants:
	public final int cPowerTypeGeneric=0;
	public final int cPowerTypeTempUnit=1;
	public final int cPowerTypeLightning=2;
	public final int cPowerTypeFrost=3;
	public final int cPowerTypeLocust=4;
	public final int cPowerTypeTeleport=5;
	public final int cPowerTypeMeteor=6;
	public final int cPowerTypeInferno=7;
	public final int cPowerTypeHealing=8;
	public final int cPowerTypeEnrage=9;
	public final int cPowerTypeClone=10;
	public final int cPowerTypeDamageUnit=11;
	public final int cPowerTypeTornado=12;
	public final int cPowerTypeRain=13;
	public final int cPowerTypeUndermine=14;
	public final int cPowerTypeSnowStorm=15;
	public final int cPowerTypeBronze=16;
	public final int cPowerTypePeace=17;
	public final int cPowerTypeProsperity=18;
	public final int cPowerTypeEclipse=19;
	public final int cPowerTypeShowUnit=20;
	public final int cPowerTypeBolt=21;
	public final int cPowerTypeSpy=22;
	public final int cPowerTypeTechActivate=23;
	public final int cPowerTypeAnimalMagnet=24;
	public final int cPowerTypeHealingSpring=25;
	public final int cPowerTypeSwapUnit=26;
	public final int cPowerTypeRebellion=27;
	public final int cPowerTypeSandstorm=28;
	public final int cPowerTypeEarthquake=29;
	public final int cPowerTypePlenty=30;
	public final int cPowerTypeForestFire=31;
	public final int cPowerTypeFlamingWeapons=32;
	public final int cPowerTypeDwarvenMines=33;
	public final int cPowerTypePestilence=34;
	public final int cPowerTypeReverseTime=35;
	public final int cPowerTypeTraitors=36;
	public final int cPowerTypeVolcano=37;
	public final int cPowerTypeTremor=38;
	public final int cPowerTypeTartarianGate=39;
	public final int cPowerTypeVortex=40;
	public final int cPowerTypeHesperides=41;
	public final int cPowerTypeChaos=42;
	public final int cPowerTypeSpiders=43;
	public final int cPowerTypeHeroize=44;
	public final int cPowerTypeImplode=45;
	public final int cPowerTypeTitanGate=46;
	public final int cPowerTypeGaiaForest=47;
	public final int cPowerTypeCarnivora=48;
	
	//ProtoPower Constants:
	public final int cPowerLure=0;
	/** @since AoT */
	public final int cPowerCarnivora=1;
	public final int cPowerBlessingofZeus=2;
	public final int cPowerBolt=3;
	public final int cPowerBronzeXP05=4;
	public final int cPowerBronze=5;
	public final int cPowerCeaseFireNomad=6;
	public final int cPowerCeaseFire=7;
	/** @since AoT */
	public final int cPowerChangeCaladria=8;
	public final int cPowerChangeChimera=9;
	public final int cPowerChangeCyclops=10;
	public final int cPowerChangeHydra=11;
	public final int cPowerChangeManticore=12;
	public final int cPowerChangeNemean=13;
	/** @since AoT */
	public final int cPowerChaos=14;
	public final int cPowerChickenStorm=15;
	public final int cPowerCitadel=16;
	public final int cPowerDwarvenMine=17;
	public final int cPowerCurse=18;
	public final int cPowerEarthquake=19;
	public final int cPowerEclipse=20;
	public final int cPowerFlamingWeapons=21;
	public final int cPowerForestFire=22;
	public final int cPowerFrost=23;
	/** @since AoT */
	public final int cPowerGaiaForestSPC=24;
	/** @since AoT */
	public final int cPowerGaiaForest=25;
	public final int cPowerGoatunheim=26;
	public final int cPowerGreatHunt=27;
	public final int cPowerHealingSpring=28;
	/** @since AoT */
	public final int cPowerHeroize=29;
	/** @since AoT */
	public final int cPowerHesperides=30;
	/** @since AoT */
	public final int cPowerImplode=31;
	public final int cPowerLightningStorm=32;
	public final int cPowerLocustSwarm=33;
	public final int cPowerMeteor=34;
	public final int cPowerNidhogg=35;
	public final int cPowerPestilence=36;
	public final int cPowerPlenty=37;
	public final int cPowerProsperity=38;
	/**
	 * Yeah, that's an o there.
	 */
	public final int cPowerRagnorok=39;
	public final int cPowerRain=40;
	public final int cPowerRestoration=41;
	/** @since AoT */
	public final int cPowerDeconstruction=42;
	/** @since AoT */
	public final int cPowerReverseWonder=43;
	public final int cPowerShiftingSands=44;
	/** @since AoT */
	public final int cPowerSeedofGaia=45;
	public final int cPowerSentinel=46;
	public final int cPowerPlagueofSerpents=47;
	public final int cPowerAncestors=48;
	public final int cPowerFimbulwinter=49;
	public final int cPowerSonofOsiris=50;
	public final int cPowerSPCLightningStorm=51;
	public final int cPowerSPCMeteor=52;
	/** @since AoT */
	public final int cPowerSpiders=53;
	public final int cPowerSpy=54;
	/** @since AoT */
	public final int cPowerTartarianGate=55;
	/** @since AoT */
	public final int cPowerTitanGate=56;
	public final int cPowerTornadoXP05=57;
	public final int cPowerTornado=58;
	/** @since AoT */
	public final int cPowerTraitors=59;
	/** @since AoT */
	public final int cPowerTraitorsSPC=60;
	/**
	 * Better known as schockwave. 
	 * @since AoT 
	 */
	public final int cPowerTremor=61;
	public final int cPowerUndermine=62;
	public final int cPowerUnderworldPassage=63;
	public final int cPowerVision=64;
	public final int cPowerVolcano=65;
	public final int cPowerVortex=66;
	public final int cPowerWalkingBerryBushes=67;
	public final int cPowerWalkingWoods=68;
	public final int cPowerWellOfUrd=69;
	
	private GodPower() {}
	
	/** Casts the given God power tech, at the specified position. */
	public native bool aiCastGodPowerAtPosition(int godPowerTechID, vector pos);
	/** Casts the given God power tech, at the specified unit. */
	public native bool aiCastGodPowerAtUnit(int godPowerTechID, int unitID);
	/** Get the god power tech id from the given slot. */
	public native int aiGetGodPowerTechIDForSlot(int slotID);
	/** Translate a granted tech id into a protopower id */
	public native int aiGetGodPowerProtoIDForTechID(int techID);
	/** Get the type for a ProtoPower */
	public native int aiGetGodPowerType(int protoPowerID);
	/** Find a valid god power plan to attach to an attack plan */
	public native int aiFindBestAttackGodPowerPlan();
	/** Find a valid god power plan to use for town defense */
	public native int aiFindBestTownDefenseGodPowerPlan();
}
