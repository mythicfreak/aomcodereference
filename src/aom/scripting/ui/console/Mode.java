package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Game Modes (not to be confused with edit modes).
 * An (incomplete?) list of modes and submodes:
 * <ul>
	<li>Simulation
		<ul>
			<li>SinglePlayer</li>
			<li>GameMenu</li>
			<li>PostGame</li>
			<li>Editor</li>
			<li>ScenarioTest</li>
			<li>RecordGame</li>
			<li>Cinematic</li>
			<li>CinematicBuild</li>
			<li>HotKeySetup</li>
			<li>Options</li>
		</ul>
	</li>
	<li>PreGame / PreGameUI
		<ul>
			<li>HotKeySetup</li>
			<li>Options</li>
			<li>ModManager (Steam Workshop in AoM:EE</li>
		</ul>
	</li>
	<li>Campaign</li>
	<li>Arena</li>
	<li>SinglePlayerSetup</li>
	<li>ProfileSelect</li>
	<li>MPSession
		<ul>
			<li>Menu</li>
			<li>QuickTeam</li>
			<li>Broadcast</li>
			<li>Receive</li>
		</ul>
	</li>
	<li>RM Setup</li>
	</ul>
 * 
 * @see Console#editMode(string)
 * 
 * @local Mode commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Mode {
	private Mode() {}
	
	/** 
	 * Enter the mode used to play recorded games.
	 * Don't expect this to work properly.
	 */
	public native void enterRecordGameMode(string name);
	
	/** Enters the named mode.*/
	public native void modeEnter(string mode);

	/** Enters the named submode (of the main mode).*/
	public native void subModeEnter(string mode, string subMode);

	/** Leaves the named submode (of the main mode).*/
	public native void subModeLeave(string mode, string subMode);

	/** Leaves all active submodes of the named mode. */
	public native void subModeClear(string mode);

	/** Changes the state of the named submode (of the main mode).*/
	public native void subModeToggle(string mode, string subMode);

	/** Changes the state of the named submode (of the main mode), but only if we're not in a multiplayer game.*/
	public native void subModeToggleIfNotMP(string mode, string subMode);

	/** Toggles between the two submodes (of the main mode).*/
	public native void subModeToggleBetween(string mode, string subMode1, string subMode2);

	/** Toggles between the two submodes (of the main mode), but only if we're not in a multiplayer game.*/
	public native void subModeToggleBetweenIfNotMP(string mode, string subMode1, string subMode2);
}
