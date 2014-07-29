package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of KB commands concerning Technologies.
 * 
 * @see <a href="{@docRoot}/AI Reference.xs">AoM Reference</a> or  <a href="{@docRoot}/AI XReference.xs">AoT Reference</a>
 * for a complete list of all technology constants and more.>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class TechTree {
	//Tech Status:
	public final int cTechStatusUnobtainable=0;
	public final int cTechStatusObtainable=1;
	public final int cTechStatusAvailable=2;
	public final int cTechStatusResearching=3;
	public final int cTechStatusActive=4;
	public final int cTechStatusPersistent=5;
	
	//KB TechTree Upgrade Types:
	public final int cUpgradeTypeAttack=0;
	public final int cUpgradeTypeArmor=1;
	public final int cUpgradeTypeHitpoints=2;
	public final int cUpgradeTypeSpeed=3;
	public final int cUpgradeTypeWorkRate=4;
	public final int cUpgradeTypeTrainPoints=5;
	public final int cUpgradeTypeAny=6;
	
	/**
	 * Returns the culture name for the given culture. 
	 * @note Is this supposed to be called kbGetCultureName(int cultureID)? AFAIK XS does not support overloading.
	 * 
	 * @see aom.scripting.xs.kb.Player#kbGetCulture() kbGetCulture()
	 */
	public native string kbGetCulture(int cultureID);
	/** Returns the civilization name for the given civilization. */
	public native string kbGetCivName(int civID);
	/** Returns the AI cost for the given technology ID. */
	public native float kbGetTechAICost(int techID);
	/** Returns the current technology status for the current player of the requested tech. */
	public native int kbGetTechStatus(int techID);
	/** Returns the percent complete for the the requested tech of the current player. */
	public native float kbGetTechPercentComplete(int techID);
	/** Returns the cost of the technology for the given resource. */
	public native float kbTechCostPerResource(int techID, int resourceID);
	/** Returns true if the player can afford the technology. */
	public native bool kbCanAffordTech(int techID, int escrowID);
	/** Returns the name of the technology ID. */
	public native string kbGetTechName(int techID);
	/** Returns the total number of upgrade technologies of the unit type. */
	public native int kbTechTreeGetUnitUpgradeTechTotal(int unitTypeID);
	/** Returns the index'th upgrade technologies of the unit type. */
	public native int kbTechTreeGetUnitUpgradeTech(int unitTypeID, int index);
	/** Returns the ID of the cheapest unit upgrade technology. */
	public native int kbTechTreeGetCheapestUnitUpgrade(int protoUnitID, int upgradeQueryType, int resourceFilterID, int buildingFilterID, bool echoResults, int affectedUnitType);
	/** Returns the ID of a randomly chosen unit upgrade technology. */
	public native int kbTechTreeGetRandomUnitUpgrade();
	/** Returns true if techID is a minor god technology. */
	public native bool kbTechTreeIsMinorGod(int techID) ;
	/** Returns the GP techID that is enabled by minorGodTechID. */
	public native int kbTechTreeGetGPTechID(int minorGodTechID) ;
	/** Have progressions preference for this minor god selection. */
	public native bool kbTechTreeAddMinorGodPref(int techID) ;
	/** Removes this minor god as preference in Progressions. */
	public native bool kbTechTreeRemoveMinorGodPref(int techID) ;
	/** Returns the total number of myth units enabled by this minor god. */
	public native int kbTechTreeGetMinorGodMythUnitTotal(int minorGodTechID) ;
	/** Returns the protoID of a myth unit */
	public native int kbTechTreeGetMinorGodMythUnitByIndex(int minorGodTechID, int index) ;
	/** Returns the minorGodTechID of the given index, given the age, -1 means the next age. */
	public native int kbTechTreeGetMinorGodChoices(int index, int age) ;
	/** Returns the number of matrix unit type IDs. */
	public native int kbTechTreeGetNumberMatrixUnitTypeIDs();
	/** Returns the matrix unit typeID at the given index. */
	public native int kbTechTreeGetMatrixUnitTypeIDByIndex(int index);
	/** Returns the total number of unitIDs matching the main type that has the given counter type. */
	public native int kbTechTreeGetTotalUnitIDsByMatrix(long mainUnitTypeID, int counterUnitTypeID);
	/** Returns the index'th unitID matching the main type that has the given counter type. */
	public native int kbTechTreeGetUnitIDByMatrixIndex(long mainUnitTypeID, int counterUnitTypeID, int index);
	/** Returns the total number of unitIDs that performs the given function. */
	public native int kbTechTreeGetTotalUnitIDsByFunction(int functionID);
	/** Returns the index'th unitID of the unit that performs the given function. */
	public native int kbTechTreeGetUnitIDTypeByFunctionIndex(int functionID, int index);
	/** Returns the number of unit typeIDs for dropsites that take the given resource. */
	public native int kbTechTreeGetNumberDropsiteUnitIDsByResource(int resourceID);
	/** Clears the list of dropsites for the given resource type. */
	public native bool kbTechTreeClearDropsiteUnitIDsByResource(int resourceID);
	/** Adds the base unit type ID as a dropsite for the given resource. */
	public native bool kbTechTreeAddDropsiteUnitIDByResource(int resourceID);
	/** Returns the index'th unitID of the dropsite that takes the given resource. */
	public native int kbTechTreeGetDropsiteUnitIDByResource(int resourceID, int index);
	/** Returns the unitTypeID of the unit that can train the given unitTypeID. */
	public native int kbTechTreeGetUnitIDByTrain(int unitTypeID, int civID);
	/** Returns the number of protos that can train the given unitTypeID. */
	public native int kbTechTreeGetNumberTrainProtos(int unitTypeID);
	/** Returns index'th unitTypeID of the unit that can train the given unitTypeID. */
	public native int kbTechTreeGetUnitIDByTrainIndex(int unitTypeID, int trainProtoIndex);
	/** Returns the number of protos that the given techID can be obtained from. */
	public native int kbTechTreeGetNumberObtainProtos(int techID);
	/** Returns index'th unitTypeID of the unit that the given techID, can be obtained from. */
	public native int kbTechTreeGetUnitIDByObtainIndex(int techID, int obtainProtoIndex);
	
	//hide constructor
	private TechTree() {}
}
