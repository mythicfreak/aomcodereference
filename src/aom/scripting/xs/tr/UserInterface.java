package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

public class UserInterface {
	private UserInterface() {}
	
	/** Sets whether or not units can be drawn obscured or not. */
	public native void trSetObscuredUnits(bool b);
	
	/** Turn sky rendering on/off and set which sky to use... defaultSkyBox. */
	public native void trRenderSky(bool on, string skyName);

	/** Controls snow rendering. */
	public native void trRenderSnow(float percent);
	
	/** Returns true if gadget is real */
	public native bool trIsGadgetVisible(string gadget);
	
	/** Fade in/out using color specified. */
	public native void trUIFadeToColor(int r, int g, int b, int durationMS, int delayMS, bool inout);

	/** Flashes a UI element (maybe). */
	public native void trUIFlash(string gadgetName, bool flash);

	/** Flashes a UI element (maybe). */
	public native void trUIFlashTrain(string protoName, bool flash);

	/** Flashes a UI element (maybe). */
	public native void trUIFlashTech(int techID, bool flash);

	/** Flashes a UI element (maybe). */
	public native void trUIFlashCategory(int category, bool flash);
}
