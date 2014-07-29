package aom.scripting.xs.ai;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of AI commands concerning Economy.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Economy {
	private Economy() {}
	
	//Resource Gatherer Preferences:
	public final int cRGPScript=0;
	public final int cRGPCost=1;
	public final int cRGPActual=2;
	
	/** Sells (+100) the given resource. */
	public native bool aiSellResourceOnMarket(int resourceID);
	/** Buys (+100) the given resource. */
	public native bool aiBuyResourceOnMarket(int resourceID);
	/** Returns the amount required to buy 100 units of the given resource. */
	public native float aiGetMarketBuyCost(int resourceID);
	/** Returns the amount received for selling 100 units of the given resource. */
	public native float aiGetMarketSellCost(int resourceID);
	
	/** Gets the number of plans for the given breakdown. */
	public native int aiGetResourceBreakdownNumberPlans(int resourceTypeID, int resourceSubTypeID, int baseID);
	/** Gets the priority of the plans for the given breakdown. */
	public native int aiGetResourceBreakdownPlanPriority(int resourceTypeID, int resourceSubTypeID, int baseID);
	/** Gets the percentage for the given breakdown. */
	public native float aiGetResourceBreakdownPercentage(int resourceTypeID, int resourceSubTypeID, int baseID);
	/** Sets a subtype breakdown for a resource. */
	public native bool aiSetResourceBreakdown(int resourceTypeID, int resourceSubTypeID, int numberPlans, int planPriority, float percentage, int baseID);
	/** Removes the given breakdown. */
	public native bool aiRemoveResourceBreakdown(int resourceTypeID, int resourceSubTypeID, int baseID);
	
	/** Returns the resource gatherer percentage for the given resource. */
	public native float aiGetResourceGathererPercentage(int resourceID, int rgpIndex);
	/** Sets the resource gatherer percentage for the given resource (if normalized is true, the percentages will be normalized to 1.0). */
	public native void aiSetResourceGathererPercentage(int resourceID, float value, bool normalize, int rgpIndex);
	/** Normalizes all of the resource gatherer percentages to 1.0. */
	public native void aiNormalizeResourceGathererPercentages(int rgpIndex);
	
	/** Tributes the given player. */
	public native bool aiTribute(int playerID, int resourceID, float amount);
	
	/** Sets the RGP weight. */
	public native void aiSetResourceGathererPercentageWeight(int rgpIndex, float weight);
	
	/** Returns allow auto dropsites on/off. */
	public native bool aiGetAllowAutoDropsites();
	/** Sets the handler for the update resource event (invalid name unsets the handler). */
	public native bool aiSetUpdateResourceEventHandler(string handlerFunctionName);
	/** Sets the limit for the given resource for the update resource event. */
	public native bool aiSetUpdateResourceLimit(int resourceID, float limit);
	/** Returns the RGP weight. */
	public native float aiGetResourceGathererPercentageWeight(int rgpIndex);
	/** Normalizes all of the resource gatherer percentages weights to 1.0. */
	public native void aiNormalizeResourceGathererPercentageWeights();
	/** Returns the auto gather escrow ID. */
	public native int aiGetAutoGatherEscrowID();
	/** Sets the auto gather escrow ID. */
	public native void aiSetAutoGatherEscrowID(int escrowID);
	/** Returns the auto Farm escrow ID. */
	public native int aiGetAutoFarmEscrowID();
	/** Sets the auto Farm escrow ID. */
	public native void aiSetAutoFarmEscrowID(int escrowID);
	/** Returns the per plan farm build limit. */
	public native int aiGetFarmLimit();
	/** Sets the per plan farm build limit. */
	public native void aiSetFarmLimit(int limit);
	/** Returns the trained dropsite PUID. */
	public native int aiGetTrainedDropsiteUnitTypeID();
	/** 
	 * Sets the trained dropsite PUID. 
	 * In particular, this should register an ox cart as a valid dropsite.
	 */
	public native void aiSetTrainedDropsiteUnitTypeID(int v);
	/** Sets favor need modifier. */
	public native void aiSetFavorNeedModifier(float v);
	/** Returns auto favor gather on/off. */
	public native bool aiGetAutoFavorGather();
	/** Sets auto favor gather on/off. */
	public native void aiSetAutoFavorGather(bool v);
	/** Sets allow auto dropsites on/off. */
	public native void aiSetAllowAutoDropsites(bool v);
	/** Returns the available economy pop for this player. */
	public native int aiGetAvailableEconomyPop();
	/** Returns the current resource need for the given resource. */
	public native void aiGetCurrentResourceNeed(int resourceID);
	/** Gives your wimpy CP AI free resources because it can't handle the truth, or something like that. */
	public native void aiResourceCheat(int playerID, int resourceID, float amount);
	/** Returns the economy priority percentage. */
	public native float aiGetEconomyPercentage();
	/** Set the economy priority percentage. */
	public native void aiSetEconomyPercentage(float v);
	/** Returns the script-defined economy pop for this player. */
	public native int aiGetEconomyPop();
	/** Set the script-defined economy pop for this player. */
	public native void aiSetEconomyPop(int v);
	/** Sets the min number of needed units to gather aggressive animals. */
	public native void aiSetMinNumberNeedForGatheringAggressvies(long v);
	/** Gets the min number of needed units to gather aggressive animals. */
	public native int aiGetMinNumberNeedForGatheringAggressives();
	/** Sets the min number of wanted units to gather aggressive animals. */
	public native void aiSetMinNumberWantForGatheringAggressives(long v);
	/** Gets the min number of wanted units to gather aggressive animals. */
	public native int aiGetMinNumberWantForGatheringAggressives();
	
	
	
	
	
	
	
	
	
	
	
}
