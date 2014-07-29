package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands converning saving, loading and browsing for certain files.
 * 
 * @local Files commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Files {
	private Files() {}
	
	/**
	 * Open a scenario from the scenario directory.
	 */
	public native void uiOpenScenarioBrowser();

	/**
	 * Save a scenario to the scenario directory.
	 */
	public native void uiSaveScenarioBrowser();

	/**
	 * Save a scenario to the scenario directory.
	 */
	public native void uiSaveAsScenarioBrowser();

	/**
	 * Load a scenario, checking dirty bit on world.
	 */
	public native void uiScenarioLoad();
	
	/**
	 * Open a game from the saved game directory.
	 */
	public native void uiOpenSavedGameBrowser();

	/**
	 * Save a game to the saved game directory.
	 */
	public native void uiSaveSavedGameBrowser();

	/**
	 * Open a record game from the saved game directory.
	 */
	public native void uiOpenRecordGameBrowser();
	
	/** 
	 * Saves out a game in progress.
	 */
	public native void saveGame(string filename);

	/** 
	 * Saves out a scenario file.
	 */
	public native void saveScenario(string filename);

	/** 
	 * Loads in a saved game.
	 */
	public native void loadGame(string filename);

	/** 
	 * Loads in a scenario file.
	 */
	public native void loadScenario(string filename);

	/** 
	 * Re-scans all open mix files for new parameters.
	 * 
	 * @editor
	 */
	public native void loadMix(string filename);

	/** 
	 * Loads in an editor terrain/unit mix file.
	 * 
	 * @editor
	 */
	public native void reloadMixes();

	/** 
	 * Loads the file named, interpreting whether it is a scenario, saved game, etc. dynamically.
	 */
	public native void loadRecentFile(string filename);
	
	/**
	 * Load some triggers.
	 */
	public native void uiLoadTriggers();

	/**
	 * Save some triggers.
	 */
	public native void uiSaveTriggers();

	/**
	 * Import some triggers.
	 */
	public native void uiImportTriggers(string file);

	/**
	 * Load some triggers.
	 */
	public native void doTriggerImport();

	/**
	 * Save some triggers.
	 */
	public native void uiExportTriggers(string file);
}
