package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;

/**
 * This class provides a collection of KB commands concerning Resources.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Resource {
	
	//Resources:
	public final int cResourceGold=0;
	public final int cResourceWood=1;
	public final int cResourceFood=2;
	public final int cResourceFavor=3;
	public final int cAllResources=-1234;
	
	//Resource Subtypes:
	public final int cAIResourceSubTypeEasy=0;
	public final int cAIResourceSubTypeHunt=1;
	public final int cAIResourceSubTypeHuntAggressive=2;
	public final int cAIResourceSubTypeFarm=3;
	public final int cAIResourceSubTypeFish=4;
	public final int cAIResourceSubTypeTrade=5;
	
	
	
	/** Returns true if amount of resource is within distance of a drop site. */
	public native bool kbSetupForResource(int baseID, int resourceID, float distance, float amount);
	/** Returns the current amount of the given resource. */
	public native float kbResourceGet(int resourceID);
	/** Returns the maximum amount of the given resource you can have. */
	public native float kbMaximumResourceGet(int resourceID);
	/** Returns the total amount of the given resource gathered to this point in the game. */
	public native float kbTotalResourceGet(int resourceID);
	/** Returns the number of valid KB resources for the given plan/base. */
	public native int kbGetNumberValidResourcesByPlan(int planID, int baseID);
	/** Returns the number of valid KB resources for the resource types. */
	public native int kbGetNumberValidResources(int baseID, int resourceTypeID, int resourceSubTypeID, float distance);
	/** Returns the resource amount of valid KB resources for the resource types. */
	public native float kbGetAmountValidResources(int baseID, int resourceTypeID, int resourceSubTypeID, float distance );
	/** Returns the resource income over the last X seconds. */
	public native float kbGetResourceIncome(int resourceID, float seconds, bool relative);
	/** Returns the AI cost weight for the given resource. */
	public native float kbGetAICostWeight(int resourceID);
	/** Sets the weight this resource type is given during AI cost calculations. */
	public native bool kbSetAICostWeight(int resourceID, float weight);
	
	//hide constructor
	private Resource() {}
}
