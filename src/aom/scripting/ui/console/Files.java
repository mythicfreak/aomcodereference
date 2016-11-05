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
	 * Replace all triggers with those loaded from the given file.
	 */
	public native void uiLoadTriggers(string filename);

	/**
	 * Save all triggers to the given file.
	 */
	public native void uiSaveTriggers(string filename);

	/**
	 * Opens a dialog to load triggers from a file, replacing all existing ones.
	 */
	public native void uiImportTriggers();

	/**
	 * Load some triggers.
	 */
	public native void doTriggerImport();

	/**
	 * Opens a dialog to save all triggers to a file
	 */
	public native void uiExportTriggers();
}
