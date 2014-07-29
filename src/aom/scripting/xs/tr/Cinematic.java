package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;
import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of Trigger commands concerning Cinematics, the Camera and Waypoints.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Cinematic {
	private Cinematic() {}
	
	/** Puts the camera in the specified location */
	public native void trCameraCut(vector pos, vector dir, vector up, vector right);

	/** Makes the camera shake. */
	public native void trCameraShake(float duration, float strength);
	
	/** Loads a camera track. */
	public native void trCamTrackLoad(string filename);

	/** Plays the current camera track. */
	public native void trCamTrackPlay(float duration, int eventID);
	
	/** Returns the abort cinematic status. */
	public native bool trCinematicAbort();

	/** Aborts the cinematic. */
	public native void trCinematicDoAbort();
	
	/** Forces models to be in non-cinematic mode. */
	public native void trForceNonCinematicModels();
	
	/** Turns letter box mode on or off. */
	public native void trLetterBox(bool on);
	
	/** Puts up a big movie-credits style text overlay, optionally in a strange location. */
	public native void trOverlayText(string message, float duration, int x, int y, int width);
	
	/** 
	 * Sets the overlay text colour.
	 * 
	 * @since AoM:EE
	 */
	public native void trOverlayTextColour(float r, float g, float b);
	
	/** Adds the waypoint into the trigger selection system. */
	public native void trWaypointAddPoint(vector a);

	/** Adds the unit's position as a waypoint in the trigger selection system. */
	public native void trWaypointAddUnit(string unitScenarioName);

	/** Clears the waypoints in the trigger selection system */
	public native void trWaypointClear();
}
