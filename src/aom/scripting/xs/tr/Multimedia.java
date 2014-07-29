package aom.scripting.xs.tr;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * 
 * This class provides a collection of Trigger commands concerning Multimedia: audio, video, images, ... 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 *
 */
public class Multimedia {
	private Multimedia() {}
	
	/** Fades out all sounds over a given duration. */
	public native void trFadeOutAllSounds(float duration);

	/** Fades out current music over a given duration. */
	public native void trFadeOutMusic(float duration);
	
	/** Plays the music file. */
	public native void trMusicPlay(string filename, float volume, float duration);

	/** Plays the current music. */
	public native void trMusicPlayCurrent();

	/** Sets the current music set. */
	public native void trMusicSetCurrentMusicSet();

	/** Changes the music to mood associated with mood id. */
	public native void trMusicSetMood(int moodID);

	/** Stops the current music. */
	public native void trMusicStop();
	
	/** Plays movies from a playlist in the AVI directory. The filename needs an extension. */
	public native void trPlayMovie(string fileName);

	/** Plays the next song in the music play list. */
	public native void trPlayNextMusicTrack();
	
	/** Displays a custom image in a dialog, with a subtitle. */
	public native void trShowImageDialog(string texture, string subtitle);
	
	/** Plays the sound associated with the filename. */
	public native void trSoundPlayDialog(string filename, float volume, int eventID, bool ignoreOnAbort, string subtitle, string portrait);

	/** Plays the sound associated with the filename. A sound parameter from the trigger XML automatically adds volume 1 to the given sound. */
	public native void trSoundPlayFN(string filename, float volume, int eventID, string subtitle, string portrait);

	/** Plays the sound associated with the filename. */
	public native void trSoundPlayPaused(string filename, float volume, int eventID, string subtitle, string portrait);

	/** Creates a high performance sound timer and passes the eventID as data.*/
	public native void trSoundTimer(int milliseconds, int eventID);
	
	/** Unblocks all ambient sounds that were previously blocked from playing. */
	public native void trUnBlockAllAmbientSounds();

	/** Unblocks all sounds that were previously blocked from playing. */
	public native void trUnblockAllSounds();
	
	/** Blocks all ambient sounds from this point forward. */
	public native void trBlockAllAmbientSounds();

	/** Blocks all sounds from playing from this point forward. */
	public native void trBlockAllSounds(bool excludeDialog);
}
