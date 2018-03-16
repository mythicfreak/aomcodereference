package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to the User Interface.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class UIConfig {
	private UIConfig() {}
	
	/**
	 * Enables jumping through the protounit list by pressing the first letter of the item.
	 */
	public bool alphaJumpProtoList;
	
	/** 
	 * A list of scenarios that are randomly chosen from to be loaded in the menu background. Each scenario must be mappen to another number.
	 * 
	 * @note Real name: <code>attractMode-Scenario-i</code> where <code>i</code> is an integer.
	 */
	public string attractMode_Scenario_i;
	
	/** 
	 * Sets duration of minimap flare on oracle max LoS.
	 */
	public float autoLosFlareDuration;

	/** 
	 * Sets duration of minimap queue event on oracle max LoS.
	 */
	public float autoLosQueueDuration;
	
	/**
	 * Defines the position of the Brush Mask Gadget.
	 * Format: "x1 y1 x2 y2"
	 * @note Real name: BrushMaskDialog-pos.
	 */
	public string brushMaskDialog_Pos;
	
	public int cameraMinimapRadius;

	/** 
	 * How long received chats stay on screen.
	 */
	public int chatDuration;
	
	/** 
	 * Make selection highlight color transform.
	 */
	public bool colorXFormHighlight;
	
	/**
	 * The console alpha setting.
	 */
	public float consoleAlpha;

	/**
	 * The console background color.
	 */
	public string consoleBackground;
	
	public string consoleFileEntire;

	/**
	 * Keeps a record of recently used console commands.
	 * 
	 * @note Real name: <code>ConsoleHistory_i</code> where <code>i</code> is an integer.
	 */
	public string consoleHistory_i;
	
	/**
	 * The console input line background color.
	 */
	public string consoleInputBackground;

	/**
	 * Defines the console position.
	 */
	public int consoleX1;

	/**
	 * Defines the console position.
	 */
	public int consoleX2;

	/**
	 * Defines the console position.
	 */
	public int consoleY1;

	/**
	 * Defines the console position.
	 */
	public int consoleY2;
	
	/**
	 * Debug UI Gadgets.
	 */
	public bool debugUIGadgets;

	/** 
	 * The default gadget font.
	 */
	public string defaultGadgetFont;

	/** 
	 * The size of the default gadget font.
	 */
	public int defaultGadgetFontSize;

	/**
	 * Set the max difficulty level to show hints.
	 */
	public int defaultHintsOnDiffLevel;
	
	/**
	 * Hides the unit stance buttons.
	 */
	public bool doNotShowStanceButtons;
	
	/**
	 * How long the actual flare lasts.
	 */
	public int flareDuration;

	/** 
	 * How long the flares last on the minimap.
	 */
	public int flareMapDuration;

	/**
	 * The flare notification time.
	 */
	public int flareNotificationTime;

	/** 
	 * How long do flares last in minimap event queue.
	 */
	public int flareQueueDuration;
	
	public int fontOffset;
	
	/** 
	 * Prevents UI from rendering.
	 */
	public bool hideUI;
	
	/** 
	 * Sets quality of jpegs screenshots on a 0-100 scale.
	 */
	public int jpegScreenshotQuality;

	/** 
	 * Screenshots are jpegs if this is defined, targas if not.
	 */
	public bool jpegScreenshots;
	
	/**
	 * Defines the position of the Main Edit List in the editor.
	 * 
	 * Format: "x1 y1 x2 y2
	 * "
	 * @note Real name: mainEditList-Pos.
	 */
	public string mainEditList_Pos;
	
	/**
	 * Shows the camera position on the minimap.
	 */
	public bool minimapCamera;

	/**
	 * Shows the camera track on the minimap.
	 */
	public bool minimapCameraTrack;

	/** 
	 * Clip the minimap frustum to the outer dims of the gadget.
	 */
	public bool minimapClipFrustum;

	/** 
	 * Minimap does not draw fog.  
	 */
	public bool minimapIgnoreFog;

	/** 
	 * Minimap does not show lighting.  
	 */
	public bool minimapIgnoreLight;

	/**
	 * Disables minimap rotation and fixes its position in the UI.
	 */
	public bool minimapNoRotate;
	
	/**
	 * Don't confirm exit.
	 */
	public bool noExitYorN;
	
	/** 
	 * Disables unit highlighting.
	 * This is the default behaviour.
	 */
	public bool noHighlight;

	/** 
	 * Suppresses the underlining for hyperlinks.
	 */
	public bool noHyperlinkUnderlines;
	
	/**
	 * Disable minimap.
	 */
	public bool noMinimap;

	/**
	 * Disable minimap updates.
	 */
	public bool noMinimapUpdates;
	
	/** Toggles between different ways obscured units are shown.*/
	public native void obscuredUnitToggle();
	
	/** 
	 * Render obscured units with alpha on.  
	 * 
	 * @see #obscuredUnitToggle()
	 */
	public bool alphaObscuredUnits;

	/** 
	 * Render obscuring units with alpha on.  
	 */
	public bool alphaObscuringUnits;
	
	/** 
	 * Check only selected units when checking if unit is obscured.
	 * 
	 * @see #obscuredUnitToggle()
	 */
	public bool obscureOnlySelectedUnits;
	
	/** 
	 * Turns off obscured unit display.
	 * 
	 * @see #obscuredUnitToggle()
	 */
	public bool noObscuredUnits;
	
	/** 
	 * Defines the XML file that contains the pregame layout.
	 * 
	 * Default: uipregamenew.xml.
	 */
	public string pregameUI;
	
	/** 
	 * Whether a sound should play when mousing over buttons.
	 */
	public bool rolloverSound;
	
	/**
	 * Defines the position of the Roughen Settings Gadget.
	 * 
	 * Format: "x1 y1 x2 y2"
	 * 
	 * @note Real name: <tt>RoughenSettings-pos</tt>
	 */
	public string roughenSettings_Pos;
	
	/**
	 * The time bewteen 2 score updates.
	 */
	public int scoreUpdateTime;

	/** 
	 * Hides the cursor during a screenshot.
	 */
	public bool screenShotHideCursor;

	/** 
	 * Hides the UI during a screenshot.
	 */
	public bool screenShotHideUI;
	
	/**
	 * Show command queue.
	 */
	public bool showCommandQueue;

	/**
	 * Show given console.
	 */
	public string showConsole;

	/**
	 * Show extra tech help.
	 */
	public bool showExtraTechHelp;

	/** 
	 * Shows time on the game clock down to millisecond precision.  
	 */
	public bool showMilliseconds;

	/**
	 * Show rollover help.
	 */
	public bool showRolloverHelp;

	/**
	 * Show score.
	 * 1 - show
	 * 0 - hide
	 */
	public int showScore;

	/**
	 * Show time.
	 * 1 - show
	 * 0 - hide
	 */
	public int showTime;

	/** 
	 * Enforces gadget handle get/release counts.
	 */
	public bool strict;
	
	/** 
	 * Turn terrain grid on/off.
	 */
	public bool terrainGrid;

	/** 
	 * Sets the number of tiles between major ticks on the terrain grid.
	 */
	public bool terrainGridMajorTick;

	/** 
	 * Toggles whether the terrain grid includes minor ticks 8.
	 */
	public bool terrainGridMinorTick;
	
	/**
	 * Time of Day stage 0 lightning.
	 */
	public string ToDLightSet00;

	/**
	 * Time of Day stage 1 lightning.
	 */
	public string ToDLightSet01;

	/**
	 * Time of Day stage 2 lightning.
	 */
	public string ToDLightSet02;

	/**
	 * Time of Day stage 3 lightning.
	 */
	public string ToDLightSet03;

	/**
	 * Time of Day stage 4 lightning.
	 */
	public string ToDLightSet04;

	/**
	 * Time of Day stage 5 lightning.
	 */
	public string ToDLightSet05;

	/**
	 * Time of Day stage 6 lightning.
	 */
	public string ToDLightSet06;

	/**
	 * Max tooltip display time.
	 */
	public int toolTipDispTime;

	/**
	 * Default tooltip font.
	 */
	public string toolTipFont;

	/**
	 * Default tooltip font size.
	 */
	public int toolTipFontSize;

	/** 
	 * Turns tooltip help on.  
	 */
	public bool toolTipHelp;
	
	/** 
	 * Set default text color on displays.
	 */
	public string textColor;
	
	/** 
	 * Governs whether the "unit built." messages display.
	 */
	public bool trainBuildFeedback;
	
	/** 
	 * Set generic art.
	 */
	public string uiGenericBackground;

	/** 
	 * Set generic art.
	 */
	public string uiGenericButton;

	/** 
	 * Set generic art.
	 */
	public string uiGenericDarkBackground;

	/** 
	 * Set generic art.
	 */
	public string uiGenericDialogBackground;
}
