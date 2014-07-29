package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Help.
 * 
 * @local Help commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Help {
	private Help() {}
	
	/**
	 * Opens a help topic related to the object at the pointer position.
	 */
	public native void uiHelpAtPointer();
	
	/**
	 * Brings up the detail help UI for the given protoID.
	 * If no protoID is provided (-1), help for the selected unit is shown.
	 */
	public native void uiUnitDetailHelp(int protoID, int civID);

	/**
	 * Brings up the detail help UI for the given technology node ID.
	 */
	public native void uiTechDetailHelp(int techID, int civID);

	/**
	 * Brings up the detail help UI for the given help topic.
	 */
	public native void uiTopicDetailHelp(string topicName);
	
	/**
	 * Goes back to the most recent help entry.
	 */
	public native void uiLastDetailHelp();
	
	/**
	 * Prints a list of all console commands that contain the given substring.
	 * 
	 * @deprecated
	 */
	public native void help(string commandSubstring);
	
	/**
	 * Prints a list of all console commands that start with the given prefix.
	 *
	 * @deprecated
	 */
	public native void helpPrefix(string commandPrefix);
	
	/**
	 * Prints a list of all console commands whose helptext contains the given substring.
	 */
	public native void helpText(string helptextSubstring);
	
	/**
	 * Does simple queries on possible things in the DB.
	 */
	public native void databaseHelp(string type, string name);
}
