package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Camera Tracks.
 * 
 * @note Camera Tracks can be created mid-game with these. 
 * That's particularly useful if you want to search some unit/building without moving your screen.
 * Just create a track with the current view as waypoint, save it, search and then play the track.
 * 
 * @local Track commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Track {
	private Track() {}
	
	/** Open a camera track from the data directory.*/
	public native void uiOpenCameraTrackBrowser();

	/** Save a camera track to the data directory.*/
	public native void uiSaveCameraTrackBrowser();
	
	/** Loads a camera track and makes it current.*/
	public native void trackLoad(string filename);

	/** Saves the current camera track.*/
	public native void trackSave(string filename);

	/** Clears all tracks.*/
	public native void trackClear();

	/** Steps the current camera track 1 step forward.*/
	public native void trackStepForward();

	/** Steps the current camera track 1 step backward.*/
	public native void trackStepBackward();

	/** Toggles rendering of the camera track on and off.*/
	public native void trackToggleShow();

	/** Adds the camera's current position and orientation to the current camera track.*/
	public native void trackAddWaypoint();

	/** Edits the currently selected camera track.*/
	public native void trackEditWaypoint();

	/** Sets the current waypoint to the button with the same index.*/
	public native void trackSetSelectedWaypoint(int index);

	/** Moves the camera to the current waypoint.*/
	public native void trackGotoSelectedWaypoint(int index);

	/** Removes the most recently added track waypoint from the current camera track.*/
	public native void trackRemoveWaypoint();

	/** Adds a new camera track.*/
	public native void trackInsert();

	/** Removes selected track.*/
	public native void trackRemove();

	/** 
	 * Plays the current track, with no arguments uses current duration, otherwise sets duration.
	 *
	 * @see aom.scripting.xs.tr.Triggers#trEventFire(int) trEventFire(int)
	 * @see Unit#uiTransformSelectedUnit(string) uiTransformSelectedUnit(string)
	 * @see aom.scripting.xs.tr.UserInterface#trRenderSnow(float) trRenderSnow(float)
	 * 
	 * @local 	The trigger event is only fired on the local computer.
	 * 			Only use this with trigger that either autosync (e.g. uiTransformSelectedUnit(string))
	 * 			or that don't impact the gameplay (e.g. trRenderSnow(float)).
	 * 
	 * @note This function provides the only way to fire trigger events directly from the console.
	 */
	public native void trackPlay(int duration, int eventID);

	/** Pauses the current camera track.*/
	public native void trackPause();

	/** Stops the current camera track.*/
	public native void trackStop();

	/** Advances the camera track to a specific location.*/
	public native void trackAdvance();

	/** Moves the camera to the current event.*/
	public native void trackGotoSelectedEvent(int index);
}
