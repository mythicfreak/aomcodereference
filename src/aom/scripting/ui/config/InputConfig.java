package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;

/**
 * This class provides an overview of Configs related to keyboard and mouse input.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class InputConfig {
	private InputConfig() {}
	
	/** 
	 * When input mappings are overbound in a context, both are evaluated.
	 * 
	 * @deprecated Completely messes up your hotkey configuration. 
	 */
	public bool allowMultipleBinds;
	
	public bool alwaysDrawCursor;
	
	/** 
	 * Forces Windows cursor to always be displayed.
	 */
	public bool alwaysShowWindowsCursor;
	
	/** 
	 * Forces windows mouse and keyboard.  
	 */
	public bool directInput;
	
	/** 
	 * Uses directInput instead of any windows events.
	 */
	public bool forceDirectInput;
	
	/** 
	 * Joystick support.
	 */
	public bool joystick;

	public bool joystickButtonEvents;

	/** 
	 * Control the mouse cursor/buttons with the joystick.
	 */
	public bool joystickMouse;

	public bool joystickMoveEvents;

	public bool joystickNonExclusive;

	public bool joystickPositionEvents;
	
	public bool mouseExclusive;

	public bool mouseNonExclusive;

	/**
	 * The X scale sensitivity of the mouse.
	 * @deprecated
	 */
	public float mouseScaleX;

	/**
	 * The Y scale sensitivity of the mouse.
	 * @deprecated
	 */
	public float mouseScaleY;

	/** 
	 * Mouse is moved to the center of the screen on startup.
	 */
	public bool mouseStartCentered;
	
	public bool pollMousePosition;
	
	/** 
	 * The scroll speed (unused)
	 * 
	 * @see #realScrollSpeed
	 */
	public float scrollSpeed;
	
	public bool rawMouseMove;

	/** 
	 * Speed of normal scrolling.
	 */
	public float realScrollSpeed;
	
	/** 
	 * Use native windows keyboard events instead of DirectInput.
	 */
	public bool win32Keyboard;

	/** 
	 * Use native windows mouse events instead of DirectInput.
	 */
	public bool win32Mouse;
	
	/** 
	 * Forces Windows cursor to always be displayed and no in-game cursor.
	 */
	public bool windowsCursor;
}
