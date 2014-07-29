package aom.scripting.xs.kb;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of KB commands concerning Target Selectors.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class TargetSelector {
	/** Creates a target selector and returns the ID. */
	public native int kbTargetSelectorCreate(string name);
	/** Destroys the given target selector. */
	public native bool kbTargetSelectorDestroy(int id);
	/** Resets the current target selector. */
	public native bool kbTargetSelectorResetResults();
	/** Selects the given target selector. */
	public native bool kbTargetSelectorSelect(int id);
	/** Add the UAIT for the given base unit type as a filter. */
	public native bool kbTargetSelectorAddUnitType(int baseUnitTypeID);
	/** Sets the list of potential targets to the results in the given query. */
	public native bool kbTargetSelectorAddQueryResults(int queryID);
	/** Returns the number of results in the given target selector. */
	public native int kbTargetSelectorGetNumberResults();
	/** Returns the result value for given index of the current target selector. */
	public native int kbTargetSelectorGetResultValue(int index);
	/** Starts the current target selector. */
	public native bool kbTargetSelectorStart();
	
	//hide constructor
	private TargetSelector() {}
	
}
