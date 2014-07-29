package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to scripting.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class ScriptConfig {
	private ScriptConfig() {}
	
	/**
	 * Automatically insert a breakpoint at the start of an AI script.
	 */
	public bool aiBreakAtStart;

	/**
	 * Enables AI debugging options.
	 */
	public bool aiDebug;

	/** 
	 * Shows the Building placement values over each position.  
	 */
	public bool aiShowBPValueText;

	/** 
	 * Make AI Prompts that are statements show up as chats instead.
	 */
	public bool aiStatementsAsChat;
	
	/** 
	 * Allows debugger to pop up on errors when generating random maps.
	 */
	public bool debugRandomMaps;
	
	/**
	 * Enables developer mode. (Don't expect anything cool.)
	 */
	public bool developer;
	
	/** 
	 * Disables all trigger-echo outputs.
	 */
	public bool disableTriggerEcho;
	
	/**
	 * Enables the console.
	 */
	public bool enableConsole;
	
	/**
	 * Maybe allows for an external console? 
	 */
	public string extConsole;
	
	/**
	 * Logs AI errors.
	 */
	public bool logAIErrors;
	
	/**
	 * Enables AI echoes.
	 */
	public bool showAIEchoes;

	/**
	 * Enables AI output.
	 */
	public bool showAIOutput;
	
	/**
	 * Show XS info.
	 */
	public bool xsInfo;

	/**
	 * Show XS warnings.
	 */
	public bool xsWarn;
}
