package aom.scripting.ui.console;

/**
 * This class provides a collection of Console commands concerning Cinematics.
 * 
 * @local Cinematic commands are all local.
 * 
 * @see aom.scripting.xs.tr.Cinematic
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Cinematic {
	private Cinematic() {}
	
	/**
	 * Abort the current cinematic.
	 * 
	 * @single Multiplayer cinematics aren't skippable.
	 */
	public native void abortCinematic();
	
	/**
	 * Start building a cinematic.
	 * 
	 * @editor
	 */
	public native void uiStartBuildCinematic();

	/**
	 * Stop building a cinematic.
	 * 
	 * @editor
	 */
	public native void uiStopBuildCinematic();

	/**
	 * Clears cinematic trigger info.
	 */
	public native void uiClearCinematicInfo();

	/**
	 * Clears all cinematic info including model/texture precache info.
	 */
	public native void uiClearAllCinematicInfo();
}
