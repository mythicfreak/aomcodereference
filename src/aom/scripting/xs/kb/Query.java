package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of KB commands concerning Queries.
 * Queries are a powerful search engine: 
 * they provide you with a way to get the IDs of units matching your criteria fast and effectively.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Query {
	//Unit Query Constants:
	public final int cUnitQueryNoArmy=-1;
	public final int cUnitQueryInvalidArmy=-1002;
	
	/** Returns the number of pop slots currently occupied by the results in the given query. */
	public native int kbGetPopulationSlotsByQueryID(int queryID);
	/** Creates a unit query, returns the query ID. */
	public native int kbUnitQueryCreate(string name);
	/** Resets the given unit query data AND results. */
	public native bool kbUnitQueryResetData(long queryID);
	/** Resets the given unit query results. */
	public native bool kbUnitQueryResetResults(long queryID);
	/** Destroys the given unit query. */
	public native bool kbUnitQueryDestroy(long queryID);
	/** Returns the number of results in the current query. */
	public native int kbUnitQueryNumberResults(long queryID);
	/** Returns the UnitID of the index'th result in the current query. */
	public native int kbUnitQueryGetResult(long queryID, int index);
	/** Sets query data. */
	public native bool kbUnitQuerySetPlayerID(long queryID, int playerID, bool resetQueryData);
	/** Sets query data. */
	public native bool kbUnitQuerySetPlayerRelation(long queryID, int playerRelation);
	/** Sets query data. */
	public native bool kbUnitQuerySetUnitType(long queryID, int unitTypeID);
	/** Sets query data. */
	public native bool kbUnitQuerySetActionType(long queryID, int actionTypeID);
	/** Sets query data. */
	public native bool kbUnitQuerySetState(long queryID, int state);
	/** Sets query data. */
	public native bool kbUnitQuerySetPosition(long queryID, vector v);
	/** Sets query data. */
	public native bool kbUnitQuerySetMaximumDistance(long queryID, float distance);
	/** If ascending is true, results are sorted in ascending distance order from the query position. */
	public native bool kbUnitQuerySetAscendingSort(long queryID, bool ascending);
	/** Sets query data. */
	public native bool kbUnitQuerySetBaseID(long queryID, int baseID);
	/** Sets query data. */
	public native bool kbUnitQuerySetAreaID(long queryID, int areaID);
	/** Sets query data. */
	public native bool kbUnitQuerySetAreaGroupID(long queryID, int areaGroupID);
	/** Sets query data. */
	public native bool kbUnitQuerySetArmyID(long queryID, int armyID);
	/** Sets query data. */
	public native bool kbUnitQuerySetSeeableOnly(long queryID, bool seeableOnly);
	/** Executes the current query; returns number of results. */
	public native int kbUnitQueryExecute(long queryID);
	/** Executes the current query on the previous query's results; returns the new number of results. */
	public native int kbUnitQueryExecuteOnQuery(long currentQueryID, int previousQueryID);
	/** Executes the current query on the previous query's results; returns the new number of results. */
	public native int kbUnitQueryExecuteOnQueryByName(long currentQueryID, string previousQueryName);
	
	//hide constructor
	private Query() {}
}
