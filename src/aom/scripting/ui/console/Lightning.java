package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Lightning settings.
 * 
 * @local Lightning settings are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Lightning {
	private Lightning() {}
	
	/** Indicates that the increase sun inclination key has gone up/down.*/
	public native void sunIncreaseInclination(int keyState);

	/** Indicates that the decrease sun inclination key has gone up/down.*/
	public native void sunDecreaseInclination(int keyState);

	/** Indicates that the increase sun rotation key has gone up/down.*/
	public native void sunIncreaseRotation(int keyState);

	/** Indicates that the decrease sun rotation key has gone up/down.*/
	public native void sunDecreaseRotation(int keyState);
	
	/** Fade in/out using color specified.*/
	public native void fadeToColor(int r, int g, int b, int duration, int delay, int inout);

	/** Turn fade in on/off, set color duration.*/
	public native void setGameFadeIn(int r, int g, int b, int duration, int delay, int inout);
	
	/** Applies a Lighting Set.*/
	public native void uiApplyLightingSet(int index);
	
	/** Set ambient color to given RGB (0-255)*/
	public native void ambientColor(int r, int g, int b);

	/** Get ambient color.*/
	public native void ambientGetColor();

	/** Set sun color to given RGB (0-255)*/
	public native void sunColor(int r, int g, int b);

	/** Get sun color.*/
	public native void sunGetColor();

	/** Set fake specular sun color (for water bumps) to given RGB (0-255)*/
	public native void fakeSpecularSunColor(int r, int g, int b);

	/** Get the fake specular sun color.*/
	public native void fakeSpecularSunGetColor();

	/** Applies a Lighting set.*/
	public native void applyLightingSet(string name);

	/** Saves the current status of lighting values as a set.*/
	public native void saveLightingSet(string name);
}
