package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to Multimedia (music, sound and video).
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class MultimediaConfig {
	private MultimediaConfig() {}
	
	/** 
	 * Turns battle cries on/off.  
	 */
	public bool battleCries;

	/** 
	 * Determines when to play the battle cry.  
	 */
	public int battleCryLevel;

	/** 
	 * Determines when to play the battle music.  
	 */
	public int battleMusicLevel;
	
	/**
	 * The default button sound.
	 */
	public string defaultButtonSound;
	
	/** 
	 * Enables dynamic music.
	 */
	public bool enableDynamicMusic;
	
	public string inGameButtonSound;
	
	/**
	 * 1 - Sets music on.
	 * 0 - Sets music off.
	 */
	public int musicOn;

	/**
	 * Set the current music volume [0.0 - 1.0]
	 */
	public native void musicSetVolume(float volume);
	
	/** 
	 * The volume for the music.  
	 */
	public float musicVol;

	/**
	 * Uses the new sound system.
	 */
	public bool newSoundSystem;

	/** 
	 * Disables ambient sounds.
	 */
	public bool noAmbientSounds;

	/** 
	 * Disables the attack warning sound.
	 */
	public bool noAttackWarningSound;

	/** 
	 * Force battle music to never play.
	 */
	public bool noBattleMusic;

	/**
	 * Disables chat sound.
	 */
	public bool noChatSound;
	
	/** 
	 * Disables unit exists sounds.
	 */
	public bool noExistsSounds;

	/** 
	 * Disables the in game music.
	 */
	public bool noGameMusic;

	/**
	 * Disable intro cinematics.
	 */
	public bool noIntroCinematics;

	/** 
	 * Disables the music on the intro screen.
	 */
	public bool noIntroMusic;

	/** 
	 * Disables the in game music in multiplayer.
	 */
	public bool noMultiplayerMusic;

	/** 
	 * Disables the music.
	 */
	public bool noMusic;
	
	/** 
	 * Disables the in game music in single player.
	 */
	public bool noSinglePlayerMusic;

	/** 
	 * Disable sounds.
	 */
	public bool noSound;
	
	/** 
	 * Forces the game to load all MP3 sounds fully in memory.  
	 */
	public bool noStreamingMP3;

	/** 
	 * Forces the game to load all sounds fully in memory.  
	 */
	public bool noStreamingSounds;

	/** 
	 * Forces the game to load all WAV sounds fully in memory.  
	 */
	public bool noStreamingWav;
	
	/** 
	 * Disables the victory sounds in the game.
	 */
	public bool noVictorySounds;
	
	/**
	 * Disable videos.
	 */
	public bool noVideos;

	/**
	 * Enable sound.
	 */
	public bool soundOn;

	/** 
	 * Defines the sample rate for the primary sound buffer. 
	 */
	public int soundSampleRate;

	/** 
	 * The volume for the sound.
	 */
	public float soundVol;
	
	/**
	 * Mute all taunts.
	 * Can be toggled in-game by chatting "!mute".
	 */
	public bool tauntMute;
	
	/** 
	 * The volume for the voice.
	 */
	public float voiceVol;
	
	/** 
	 * Skips the MS / Skybox splash screen.
	 * 
	 * @since AoM:EE
	 */
	public bool skipIntro;
}
