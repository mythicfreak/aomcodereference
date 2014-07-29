package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;

/**
 * This class provides a collection of KB commands concerning Progressions.
 * Progressions are kind of large goals. 
 * They indicate the general direction in which you want to go 
 * and will spawn plans accordingly to get where you want to be.
 * 
 * @example A progression to get to Age 2 will build a temple and advance automatically.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Progression {
	public final int cProgressionTechNode=0;
	public final int cProgressionUnitNode=1;
	
	//Progression Plan Variables:
	public final int cProgressionPlanPollingTime=0; //(RO=0, AC=1).
	public final int cProgressionPlanProgressionID=1; //(RO=0, AC=1).
	public final int cProgressionPlanTrainUnitAtEnd=2; //(RO=0, AC=1).
	public final int cProgressionPlanNumGoalUnitsToBuild=3; //(RO=0, AC=1).
	public final int cProgressionPlanGoalUnitID=4; //(RO=0, AC=1).
	public final int cProgressionPlanGoalTechID=5; //(RO=0, AC=1).
	public final int cProgressionPlanBuildAreaID=6; //(RO=0, AC=1).
	public final int cProgressionPlanCurrentGoalID=7; //(RO=0, AC=1).
	public final int cProgressionPlanCurrentGoalType=8; //(RO=0, AC=1).
	public final int cProgressionPlanCurrentStep=9; //(RO=0, AC=1).
	public final int cProgressionPlanCurrentStepPlanID=10; //(RO=0, AC=1).
	public final int cProgressionPlanPaused=11; //(RO=0, AC=1).
	public final int cProgressionPlanAdvanceOneStep=12; //(RO=0, AC=1).
	public final int cProgressionPlanRunInParallel=13; //(RO=0, AC=1).
	public final int cProgressionPlanChildProgressions=14; //(RO=0, AC=0).
	public final int cProgressionPlanBuildingPref=15; //(RO=0, AC=1).
	
	/** Returns the total number of steps to complete the progression. */
	public native int kbProgressionGetTotalNodes(int progressionID);
	/** Returns the total cost of the given resource for this progressionID. */
	public native float kbProgessionGetTotalResourceCost(int progressionID, int resourceID);
	/** Returns the total work cost this progressionID. */
	public native float kbProgessionGetTotalWorkCost(int progressionID);
	/** Returns the type of node at the given index, either Unit type or technology type. */
	public native int kbProgressionGetNodeType(int progressionID, int nodeIndex);
	/** Returns the data at nodeIndex, either UnitID or TechID, depending on the type. */
	public native int kbProgressionGetNodeData(int progressionID, int nodeIndex);
	/** Returns true if the given node's data is a minor god. */
	public native bool kbProgressionIsNodeMinorGod(int progressionID, int nodeIndex);
	
	//hide constructor
	private Progression() {}
}
