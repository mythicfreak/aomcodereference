package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to online gaming. 
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class ServerConfig {
	private ServerConfig() {}
	
	/** 
	 * Sets the address of the address-grabbing-server for LAN/Direct IP modes.
	 */
	public string addressServer;
	
	public string assertOnOoS;
	
	/** 
	 * Autopatch file name.
	 */
	public string autoPatchFile;

	/** 
	 * Autopatch max download packet size.
	 */
	public int autoPatchMaxPacketSize;

	/** 
	 * Autopatch retry count.
	 */
	public int autoPatchRetryCount;

	/** 
	 * Autopatch retry delay in milliseconds.
	 */
	public int autoPatchRetryDelay;

	/** 
	 * Autopatch URL.
	 */
	public string autoPatchUrl;
	
	/** 
	 * AutoUpdate URL.
	 */
	public string autoUpdateUrl;
	
	/**
	 * The broaden search option used on ESO.
	 */
	public int broadenMPSearchOption;
	
	/**
	 * The default address server.
	 */
	public string defaultAddressServer;
	
	/** 
	 * Forces the login to happen at the start of the game.
	 * 
	 * @deprecated
	 */
	public bool doAlphaLogin;
	
	/** 
	 * Don't detect Network Adress Translation.
	 */
	public bool dontDetectNat;
	
	/** 
	 * Allows ZoneStats reporting.
	 */
	public bool enableStats;
	
	/** 
	 * The URL that contains the ESOnline configuration XML file.
	 */
	public string esoConfigUrl;

	/** 
	 * The password used to log into the ESO Server.
	 */
	public string esoPassword;

	/** 
	 * The ESOnline provider to use ('dotnet' or 'server') 
	 */
	public string esoProvider;

	/** 
	 * The hostname of the ESO Server.
	 */
	public string esoServerHostName;

	/** 
	 * The port used by the ESO Server.
	 */
	public int esoServerPort;

	/** 
	 * The name used to log into the ESO Server.
	 */
	public string esoUserName;
	
	public int externalPort;
	
	/** 
	 * The address of the forwarding server.
	 */
	public string forwardingServerAddress;
	
	/** 
	 * The path used by the GUN Server to load the GunAPI DLL.
	 */
	public string gunDLLPath;

	/** 
	 * The path used by the GUN Server to retrieve the Message of the Day.
	 */
	public string gunMOTDPath;

	/** 
	 * The port used by the GUN Server to get News.
	 */
	public string gunNewsPort;

	/** 
	 * The password used to log into the GUN Server.
	 */
	public string gunPassword;

	/** 
	 * The hostname of the GUN Server.
	 */
	public string gunServerHostName;

	/** 
	 * The port used by the GUN Server.
	 */
	public int gunServerPort;

	/** 
	 * The name used to log into the GUN Server.
	 */
	public string gunUserName;
	
	/** 
	 * Alternate host port.
	 */
	public int hostPort;
	
	public int internalPort;

	public string internetAdressServer;
	
	/**
	 * Disable the Message of the Day.
	 */
	public bool noMotd;
	
	/** 
	 * Override your external internet address.
	 * If empty, an address server is used to retrieve your public IP address.
	 */
	public string overrideAddress;
	
	/** 
	 * Toggles the use of ESO for matchmaking.
	 */
	public bool useESOnline;

	/** 
	 * Toggles the use of GUN for matchmaking.
	 */
	public bool useGunMatchmaking;
	
	/** 
	 * Allows one person to host a multiplayer game.
	 * 
	 * @since AoM:EE
	 */
	public bool allowmp1;

	/** 
	 * Allows the player to get into the lobby screens without ESO.
	 * 
	 * @deprecated used during development
	 * 
	 * @since AoM:EE
	 */
	public bool skipeso;

	/** 
	 * If steam is down or can't connect still load the online menu so you can continue working on menus. Steam multiplayer will not work.
	 * 
	 * @deprecated used during development
	 * 
	 * @since AoM:EE
	 */
	public bool skipsteamlogin;


	/** 
	 * When set, makes the unresponsive clients check take a long time, rather than 10 seconds.
	 * 
	 * @since AoM:EE
	 */
	public bool onlinelongtimeouts;
}
