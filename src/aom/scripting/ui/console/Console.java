package aom.scripting.ui.console;

import aom.scripting.datatypes.*;
import aom.scripting.ui.config.*;

/**
 * This class provides a collection of Console commands that don't fit in any of the subcategories.
 * 
 * @editor 	Some console commands only run in editor mode. Use the following template to make them work:
 * <pre>
 * subModeEnter("Simulation", "Editor");
 * //your editor command here;
 * subModeLeave("Simulation", "Editor");
 * modeEnter("pregame");
 * modeEnter("Simulation");
 * subModeEnter("Simulation", "Singleplayer");
 * </pre>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public abstract class Console {
	
	/** 
	 * Maps an input event to the given command, in the given context.
	 * 
	 * @param 	key	The input key to be bound to an action.
	 * 				When prefixed with a plus, the given action is executed on both keydown and keyup, with param keyState 0 and 1 respectively.
	 * 				<img src="{@docRoot}/resources/keys.png" alt="keymap">
	 * 
	 * @param context 
	 * 
	 * <p>General contexts:</p>
	 * 	<ul>
	 * 		<li>root</li>
	 * 		<li>developer (needs +developer flag in user.cfg)</li>
	 * 		<li>aiDebug (needs +aiDebug flag in user.cfg)</li>
	 * 		<li>pregame</li>
	 * 		<li>world (everything with a map in it, i.e. game + editor)</li>
	 * 		<li>game</li>
	 * 		<li>postgame</li>
	 * 		<li>editor</li>
	 * 		<li>strategicmap (the big map when you press tab in AoT)</li>
	 * 		<li>console</li>
	 * 		<li>XSDebugger</li>
	 * 		<li>arena //weird campaign menu</li>
	 * 		<li>AILocSelect</li>
	 * 	</ul>
	 * 
	 * <p>Building contexts:</p>
	 * <ul>
	 * 		<li>buildAccel</li>
	 * 		<li>settlementAccel</li>
	 * 		<li>dockAccel</li>
	 * 		<li>marketAccel</li>
	 * 		<li>greekAcademyAccel</li>
	 * 		<li>greekArcheryRangeAccel</li>
	 * 		<li>greekStableAccel</li>
	 * 		<li>greekFortressAccel</li>
	 * 		<li>egyptBarracksAccel</li>
	 * 		<li>egyptMigdolAccel</li>
	 * 		<li>egyptSiegeCampAccel</li>
	 * 		<li>norseLongHouseAccel</li>
	 * 		<li>norseFortAccel</li>
	 * 		<li>atlanteanBarracksAccel</li>
	 * 		<li>atlanteanCounterAccel</li>
	 * 		<li>atlanteanPalaceAccel</li>
	 * 		<li>templeGreekAccel</li>
	 * 		<li>templeEgyptianAccel</li>
	 * 		<li>templeNorseAccel</li>
	 * 		<li>templeAtlanteanAccel</li>
	 * </ul>
	 * 
	 * <p>Gadgets: all gadget names can be used as context, but may only execute if the mapping is defined in the same file as the gadget (e.g. in uimain.xml).</p>
	 * <ul>
	 * 		<li>detailHelp</li>
	 * 		<li>fakeTechTree</li>
	 * 		<li>objectives</li>
	 * 		<li>chatDialog</li>
	 * 		<li>tributeDialog</li>
	 * 		<li>playerStatusDialog</li>
 	 * 		<li>mainGameMenu</li>
	 * 	</ul>
	 * 
	 * <p>All Edit Modes</p>
	 * 
	 * @param command Any sequence of functions found in this package. There is a rather short length limit on this parameter. This limitation does not apply to keys bound in the data/DefaultKeyMap.xml file or commands in e.g. UI buttons.
	 * 
	 * @see InputConfig#allowMultipleBinds
	 * @see #editMode(string)
	 * @see #uiEnterContext(string)
	 * @see #uiLeaveContext(string)
	 * @see ScriptConfig#developer
	 * @see ScriptConfig#aiDebug
	 * 
	 * @example <code>map("control-shift-alt-F12", "root", "configToggle(\"flashHitpointBarsOnDamage\")")</code>
	 * 
	 * @local
	 */
	public native void map(string key, string context, string command);

	/**
	 * Enters the specified UI context.
	 * 
	 * @local
	 */
	public native void uiEnterContext(string context);

	/** 
	 * Leaves the specified UI context.
	 * 
	 * @local
	 */
	public native void uiLeaveContext(string context);
	
	/**
	 * Sends a message to the console output.
	 * 
	 * @local
	 */
	public native void echo(string message);

	/** 
	 * Fetched a message from the language dll file 
	 * and calls {@link #echo(string) echo} on that.
	 * 
	 * @local
	 */
	public native void echoLocalized(int stringID);

	/** 
	 * Sends a number to the console output.
	 * 
	 * @local
	 */
	public native void echoNum(string message);

	/** 
	 * Enables or disables IME.
	 * 
	 * @local
	 */
	public native void IMEEnable(bool enable);

	/**
	 * Toggles the state of the console dialog.
	 * Only works with a preceding {@link UIConfig#showConsole configSet(\"showConsole\")} call.
	 * 
	 * @see ScriptConfig#enableConsole
	 * @see UIConfig#showConsole
	 * @see UIConfig#consoleAlpha
	 * @see UIConfig#consoleBackground
	 * @see UIConfig#consoleHistory_i
	 * @see UIConfig#consoleInputBackground
	 * @see UIConfig#consoleX1
	 * @see UIConfig#consoleX2
	 * @see UIConfig#consoleY1
	 * @see UIConfig#consoleY2
	 * 
	 * @local
	 */
	public native void console();

	/**
	 * With no arguments, toggles pause state on/off, otherwise, sets pause state.
	 * 
	 * @sync
	 */
	public native void pause(int state);

	/**
	 * Exits the game.
	 * 
	 * @local
	 */
	public native void exit();

	/** 
	 * Take a screen shot.
	 * 
	 * @local
	 */
	public native void screenshot();

	/** 
	 * Take a screen shot of the whole map, might take a while.
	 * 
	 * @local
	 */
	public native void supaScreenshot(int xRes, string singleImage);

	/** 
	 * Undoes the last editing operation.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void undo();

	/** 
	 * Re-does the last undone operation.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void redo();

	/** 
	 * Realigns all resources in the world to tile boundaries.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void alignResources();

	/** 
	 * Realigns all selected units to tile boundaries.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void alignSelectedUnits();

	/** 
	 * Dumps a blank line to the output.
	 *
	 * @deprecated
	 * 
	 * @local
	 */
	public native void outputBlankLine();

	/** 
	 * Trades resources at the market for the given player.
	 * Negative amount means selling.
	 * 
	 * @note If player == -1, the current one is used.
	 * 
	 * @sync
	 */
	public native void resourceMarket(int playerID, string resourceTo, float amount, string resourceFrom);

	/** 
	 * Re-launch current scenario.
	 * 
	 * @local
	 */
	public native void restart();

	/** 
	 * For showing/hiding the (big) strategic map.
	 * 
	 * @since AoT
	 * 
	 * @local
	 */
	public native void strategicMap();

	/** 
	 * Shows all proto units of the named type.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native string[] databaseFindByType(string typeName);

	/**
	 * Returns name for techID.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native string techNameByID(int techID);

	/**
	 * Play a sound as if it were a music track.
	 */
	public native void musicPlaySong(string songname, int fadetime);

	/**
	 * Toggles between battle mode and normal mode.
	 */
	public native void musicToggleBattleMode();

	/**
	 * With no arguments, outputs current player. otherwise, sets current player to given argument.
	 * 
	 * @local
	 * 
	 * @editor
	 * 
	 * @see aom.scripting.xs.tr.Player#trPlayerSetActive(int) trPlayerSetActive(int)
	 */
	public native void player(int player);

	/** 
	 * Toggles or sets LOS fog.
	 * 
	 * @single
	 * 
	 * @local
	 */
	public native void fog(int state);

	/**
	 * Toggles or sets unexplored black map rendering.
	 * 
	 * @single
	 * 
	 * @local
	 */
	public native void blackmap(int state);

	/** 
	 * Reloads the default player colors from the XML file.
	 * 
	 * @local
	 */
	public native void resetDefaultPlayerColors();

	/** 
	 * Sets the minimap filter.
	 * 
	 * @local
	 */
	public native void setMinimapUnitFilter();

	/** 
	 * Start the auto patcher.
	 * 
	 * @local
	 */
	public native void startAutoPatcher(bool manualMode);

	/** Cancel the auto patcher.
	 * 
	 * @local
	 */
	public native void cancelAutoPatcher();

	/** 
	 * Used to tell auto patcher user pressed OK on exit or error dialog.
	 * 
	 * @local
	 */
	public native void confirmAutoPatcher();

	/** 
	 * Plays movies from a playlist in the AVI directory.
	 * 
	 * @local
	 */
	public native void playMovie();

	/** 
	 * Replaces all of one with the other, via mutation.
	 * 
	 * @since AoT
	 * 
	 * @local
	 */
	public native void unitTransform(string proto1, string proto2);

	/** 
	 * Clears the erosion from the land caused by buildings.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native void erosionClear();

	/** 
	 * Start the research of techID from ResearchingUnitID.
	 * 
	 * If no player is specified, the current one is used.
	 * 
	 * @sync
	 */
	public native void researchByID(int techID, int researchingUnitID, int playerID);

	/** 
	 * Start the research of the named technology from the first valid selected unit.
	 * 
	 * @deprecated
	 * 
	 * @sync
	 */
	public native void researchByName(string techName);

	/** 
	 * Cancel the research techID from UnitID.
	 * 
	 * If no player is specified, the current one is used.
	 * 
	 * @sync
	 */
	public native void researchCancelByID(int techID, int unitID, int playerID);

	/**
	 * Plays the default UI click sound.
	 * 
	 * @local
	 */
	public native void click();

	/**
	 * Changes the edit mode.
	 * 
	 * @param modeName 
	 * <ul>
	 		<li>attackMove</li>
			<li>building</li>
			<li>buildwall</li>
			<li>camTrack</li>
			<li>copy</li>
			<li>createHull</li>
			<li>deleteUnits</li>
			<li>dialog</li>
			<li>earthquake</li>
	 		<li>empower</li>
			<li>editWater</li>
			<li>ejectat</li>
			<li>elevation</li>
			<li>elevationSample</li>
			<li>fieldSet</li>
			<li>flare</li>
			<li>garrison</li>
			<li>guard</li>
			<li>help</li>
			<li>list</li>
			<li>modifyTerrain</li>
			<li>moveUnit</li>
			<li>paint</li>
			<li>paintCliff</li>
			<li>paintForest</li>
			<li>paintMix</li>
			<li>paintSample</li>
			<li>paintTerrainOverlay</li>
			<li>paintWater</li>
			<li>patrol</li>
			<li>placeUnit</li>
			<li>repair</li>
			<li>roughen</li>
			<li>setGatherPoint/GatherPoint</li>
			<li>smooth</li>
			<li>specialpower</li>
			<li>terrainPaste</li>
			<li>trigger</li>
			<li>trigGroups</li>
			<li>trigSelect</li>
			<li>unbuild</li>
			<li>unitPaste</li>
			<li>worldEditor</li>
	 * </ul>
	 * 
	 * @local
	 */
	public native void editMode(string modeName);

	/** 
	 * Instructs the currently selected unit(s) to build the current 
	 * proto unit cursor building type at the pointer location, 
	 * with wall-like endpoint behavior.
	 * 
	 * @sync
	 */
	public native void uiBuildWallAtPointer();

	/** 
	 * Sets the gather points for the selected unit(s) to the pointer position.
	 * 
	 * @sync
	 */
	public native void uiSetGatherPointAtPointer();

	/** 
	 * Clears the gather point for the selected unit(s), returning it to a default state.
	 * 
	 * @sync
	 */
	public native void uiClearGatherPoint();

	/**
	 * Sends out a flare at the pointer position.
	 * 
	 * @sync
	 */
	public native void uiFlareAtPointer();

	/**
	 * Commands the selected unit(s) to garrison in a building at the pointer position.
	 * 
	 * @sync
	 */
	public native void uiGarrisonToPointer();

	/**
	 * Commands the selected unit(s) to repair the target building at the pointer position.
	 * 
	 * @sync
	 */
	public native void uiRepairAtPointer();

	/**
	 * Commands the selected unit(s) to Empower the target building at the pointer position.
	 * 
	 * @sync
	 */
	public native void uiEmpowerAtPointer();

	/**
	 * Start testing a scenario.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void uiStartScenarioTest();

	/**
	 * Stop testing a scenario.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void uiStopScenarioTest();

	/**
	 * Enters building editMode and sets the proper cursor protounit, after verifying sufficient resources for the current player.
	 * 
	 * @local
	 */
	public native void uiBuildMode(int type);

	/**
	 * Does the right thing.
	 * 
	 * @local
	 */
	public native void uiHandleIdleBanner(string typeName);

	/**
	 * Pops up a message box with some text and an OK button.
	 * 
	 * @param	text
	 * 			The text to show.
	 * 
	 * @param 	command
	 * 			The command to execute when the OK button is pressed.
	 * 
	 * @local
	 * 
	 * @note This method can act as an eval(string command).
	 */
	public native void uiMessageBox(string text, string command);

	/**
	 * Copies the brush selection to the clipboard.
	 * 
	 * @local
	 */
	public native void uiCopyToClipboard();

	/**
	 * Pastes the contents of the clipboard to the brush selection.
	 * 
	 * @local
	 */
	public native void uiPasteFromClipboard();

	/**
	 * Sets the clipboard rotation amount.
	 * 
	 * @local
	 */
	public native void uiSetClipboardRotation(int degrees);

	/**
	 * Rotate the clipboard by amount.
	 * 
	 * @local
	 */
	public native void uiRotateClipboard(int degrees);

	/**
	 * Sends an ejection command for the selected unit.
	 * 
	 * @sync
	 */
	public native void uiEjectGarrisonedUnits();

	/**
	 * Sends an ejection command with waypoint for the selected unit.
	 * 
	 * @sync
	 */
	public native void uiEjectAtPointer();

	/**
	 * Sends an patrol order.
	 */
	public native void uiPatrolAtPointer();

	/**
	 * Sends an guard order.
	 */
	public native void uiGuardAtPointer();

	/**
	 * Chooses which mix to use.
	 * 
	 * @local
	 */
	public native void uiSetCurrentMix(int index);

	/**
	 * Chooses which WorldEditor to use.
	 * 
	 * @local
	 */
	public native void uiSetCurrentWorldEditor(int index);

	/**
	 * Creates a new world editor with the given name and type.
	 * 
	 * @local
	 */
	public native void uiCreateNewWorldEditor();

	/**
	 * Do an application of the current world editor at the cursor's location.
	 * 
	 * @local
	 */
	public native void uiApplyWorldEditor();

	/**
	 * Bring up an editing dialog for current world editor.
	 * 
	 * @local
	 */
	public native void uiEditCurrentWorldEditor();

	/**
	 * Used when activating a text box with a key to prevent that key from going into the text box too.
	 * 
	 * @local
	 */
	public native void uilgnoreNextKey();

	/**
	 * Removes any dangling child menus off of the given gadget.
	 * 
	 * @local
	 */
	public native void uiClearMenu();

	/** 
	 * Prints all key mappings out to the console.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native void uiDumpKeyMappings (string context);

	/** 
	 * Prints all hotkey mappings that create units to the console.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native void uiDumpAIIUnitHotKeyMappings();

	/** 
	 * Prints all empty keys out to the console.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native void uiDumpUnmappedKeys (string context);

	/** 
	 * Finds all key mappings for a given key.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native void uiFindKeyMapping (string keyname );

	/**
	 * Handles toggle of user textures.
	 */
	public native void uiHandleUserTab (string listSel, string parent);

	/**
	 * Turns technology buttons flashing on/off.
	 * 
	 * @local
	 * 
	 * @see aom.scripting.xs.tr.UserInterface#trUIFlashTech(int, bool) trUIFlashTech(int, bool)
	 */
	public native void techFlash(int techID, bool flash);

	/**
	 * Turns train buttons flashing on/off.
	 * 
	 * @local
	 * 
	 * @see aom.scripting.xs.tr.UserInterface#trUIFlashTrain(string, bool) trUIFlashTrain(string, bool)
	 */
	public native void trainFlash(int protoID, bool flash);

	/**
	 * Turns UI category flashing on/off.
	 * 
	 * @local
	 * 
	 * @see aom.scripting.xs.tr.UserInterface#trUIFlashCategory(int, bool) trUIFlashCategory(int, bool)
	 */
	public native void categoryFlash(int catID, bool flash);

	/**
	 * Repairs the selected building if it's in a failed state.
	 */
	public native void uiRepairBuilding();

	/**
	 * Hides the cursor. To reverse this, use a trigger command that leaves cinematic mode.
	 * 
	 * @see aom.scripting.xs.tr.Cinematic#trLetterBox(bool) trLetterBox(false)
	 * 
	 * @local
	 */
	public native void uiHideCursor();

	/**
	 * Causes game to return to editMode("none") only when the shift hotkey is released.
	 * 
	 * @local
	 */
	public native void uiLeaveModeOnUnshift();

	/**
	 * This is not what you are looking for.
	 * 
	 * @local
	 */
	public native void uiToggleTerrainPasteMode();

	/**
	 * Brings up the age advancement dialog with a suitable set of minor god choices.
	 *  
	 * A techName="Age 2 Fake" seems to work fine for all ages. 
	 * I have not yet been able to automatically choose 1 of the 2 minor gods through the console.
	 * 
	 * @local 	Once a minor god is chosen reseachByID will probably be called, 
	 * 			which will sync your choice with other computers.
	 * 
	 * @see #researchByID(int, int, int)
	 */
	public native void uiAgeUpDialog(string techName);

	/** 
	 * Pops up all downed keys.
	 * 
	 * @local
	 */
	public native void uiReleaseDownKeys();

	/** 
	 * Echoes all down keys. 
	 * 
	 * @deprecated
	 * 
	 * @local 
	 */
	public native void uiSpewDownKeys();

	/**
	 * Shows the fake-o technology tree with the current civilization.
	 * 
	 * @local
	 */
	public native void uiShowFakeTechTree();

	/**
	 * Passes the location selected in the world to the AI Chat dialog.
	 * 
	 * @local
	 */
	public native void uiAIChatSelectLocation();

	/**
	 * Begins a new random game with default settings.
	 * 
	 * @local
	 */
	public native void startRandomGame();

	/**
	 * Begins a new random game with the given parameters.
	 * 
	 * @local
	 */
	public native void startRandomGame2(string filename, int nbPlayers, int randomSeed, string scenarioFilename, bool debug, int teamCount, int mapsize, int resources);

	/**
	 * Begins a 2 player random map AI versus AI game with the given parameters.
	 * 
	 * @local
	 */
	public native void startRandomGame3(string mapFilename, int civ1ID, int civ2ID);

	/**
	 * Restarts current game.
	 * 
	 * @local
	 */
	public native void restartCurrentGame();

	/**
	 * Destroys the world and returns to main menu.
	 * 
	 * @local
	 */
	public native void leaveGame();

	/** 
	 * Opens the postgame dialog if allowed. 
	 * Won't work before the game ends.
	 * Use modes to bypass the restriction.
	 * 
	 * @see Mode#subModeEnter(string, string) subModeEnter("simulation", "postgame")	 
	 * 
	 * @local
	 */
	public native void handlePostGame();

	/**
	 * Goes back to the default in-game screen.	 
	 * 
	 * @local
	 */
	public native void showGameFromPostGame();

	/**
	 * Restarts the current game from postgame. 	 
	 * 
	 * @local
	 */
	public native void postGamePlayAgain();

	/**
	 * Changes the zoom factor of the minimap up or down by that amount (remaining centered on the current view)	 
	 * 
	 * @local
	 */
	public native void minimapZoomDelta(float zoomDelta);

	/**
	 * Sets the zoom factor of the minimap.	 
	 * 
	 * @local
	 */
	public native void minimapZoom(float zoom);

	/**
	 * Changes the minimap rotation mode. No arguments means toggle.
	 * In mode A, the minimap is fixed and won't rotate. Instead, the camera box inside it will rotate.
	 * In mode B, the minimap is as you all know it.
	 * 
	 * @note 	This command only seems to toggle the mode.
	 * 			Directly setting is does not seem to work anymore.
	 * 
	 * @local
	 */
	public native void minimapRotateMode(int mode);

	/**
	 * Use a special power at targeted location.
	 * 
	 * @sync
	 */
	public native void uiSpecialPowerAtPointer();

	/**
	 * Specifies what god power will be used in the god power editmode.
	 * 
	 * @local
	 */
	public native void uiSetSpecialPower(int techNodeID);

	/**
	 * Turns off the game UI. To toggle back on, turn cinematic mode off with triggers.
	 * 
	 * @see aom.scripting.xs.tr.Cinematic#trLetterBox(bool) trLetterBox(false)
	 * 
	 * @local
	 */
	public native void uiToggleGame();

	/**
	 * Turns off and on the scenario editor UI.
	 * 
	 * @deprecated
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void uiToggleEditor();

	/**
	 * Reconstitutes the entire editor menu.
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void uiRefreshEditorMenu();

	/**
	 * Minimizes main UI and brings up the minimized UI.
	 * 
	 * @local
	 */
	public native void uiMinimizeMainBackground();

	/**
	 * Maximizes main UI.
	 * 
	 * @local
	 */
	public native void uiMaximizeMainBackground();

	/**
	 * Shows the tribute dialog.
	 * 
	 * @note There does not seem to be an editor command to tribute resources directly.
	 * 
	 * @local
	 */
	public native void uiShowTributeDialog();

	/**
	 * Hides the tribute dialog.
	 * 
	 * @local
	 */
	public native void uiHideTributeDialog();

	/**
	 * Changes page of buttons, options.
	 * 
	 * @local
	 */
	public native void uiChangeCommandPage();

	/**
	 * Switches the command panel to show "normal commands".
	 * 
	 * @local
	 */
	public native void uiSetCombatCommands();

	/**
	 * Toggles the command panel to show either "normal commands" or "combat commands".
	 * 
	 * @local
	 */
	public native void uiToggleCombatCommands();

	/**
	 * Creates a new blank scenario.
	 * 
	 * World size and other options are defined by their corresponding configs.
	 * 
	 * @local
	 * 
	 * @see EngineConfig#worldSizeX
	 * @see EngineConfig#worldSizeZ
	 */
	public native void uiNewScenario();

	/**
	 * Sets a custom UI definition file for the multiplayer setup screen.
	 * Default is uimpsetupfinal.
	 * 
	 * @local 
	 */
	public native void setMultiPlayerSetupFile(string file);

	/**
	 * Causes score to update even if it isn't supposed to yet, time wise.
	 * 
	 * @local 
	 */
	public native void scoreUpdate();

	/**
	 * Handles the score toggling.
	 * 
	 * @local 
	 */
	public native void toggleScore();

	/**
	 * Handles the time display toggling.
	 * 
	 * @local 
	 */
	public native void toggleTime();

	/**
	 * Leave the current MP screen and return to the MP setup menu.
	 * 
	 * @local 
	 */
	public native void exitMPSetupSubScreen();

	/**
	 * Resigns the currently controlled player.
	 * 
	 * @sync
	 */
	public native void playerResign();

	/**
	 * Show the in-game menu.
	 * 
	 * @local 
	 */
	public native void showGameMenu();

	/**
	 * Hide the in-game menu.
	 * 
	 * @local 
	 */
	public native void hideGameMenu();

	/**
	 * Initializes the Profile Edit Dialog inside the OptionsScreen.
	 * 
	 * @local
	 * 
	 * @single
	 */
	public native void uiInitOptionsScreenProfileEditDialog();

	/**
	 * Shows the save dialog, but only when in a multiplayer game
	 * (and stops playing stupid music at 11pm).
	 * 
	 * @sync  
	 */
	public native void uiMultiplayerSave();

	/**
	 * Drop back to the main menu.
	 * 
	 * @local
	 */
	public native void dropToMainMenu();
	
	/**
	 * Shows the objectives dialog, if available. 
	 * 
	 * @local
	 */
	public native void uiShowObjectivesDialog();
	
	/**
	 * Shows the vote dialog.
	 * 
	 * @local
	 */
	public native void uiShowVoteDialog();
	
	/** 
	 * Shows or hides the embedded browser.
	 * 
	 * @since AoM:EE
	 */
	public native void showBrowser(bool show);

	/** 
	 * Toggle the observer Mode Tab. If a valid index is given, it toggles it to that specific index. Requires observer mode.
	 * 
	 * @since AoM:EE
	 */
	public native void uiToggleObserverMode(int player);

	/** 
	 * If a valid index is given, changes the perspective/FOW of the observer player to the indexed player.
	 * 
	 * @since AoM:EE
	 * @param player
	 */
	public native void uiChangeObserverPerspective(int player);

	/** 
	 * Reveals or covers up the entire map's FOW.
	 * 
	 * @since AoM:EE
	 */
	public native void uiToggleObserverFOW(bool reveal);

	/** 
	 * Forces a pre-prepared desync log file to upload. Does nothing if a desync has not occurred.
	 * 
	 * @since AoM:EE
	 */
	public native void uploadDesyncLog();
	
	//hide constructor
	private Console() {}
}