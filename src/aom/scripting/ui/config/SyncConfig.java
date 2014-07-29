package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;

/**
 * This class provides an overview of Configs related to synchronization. 
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SyncConfig {
	private SyncConfig() {}
	
	public bool syncRecord;

	/** 
	 * Turn on individual sync tag controls.
	 */
	public bool syncTagControl;

	public int syncUpdateInterval;
	
	public bool alwaysLogSync;
	public bool ballisticSync;
	public bool commandSync;
	public bool commSync;
	public bool disableAllSync;
	public bool dummyObjectSync;
	public bool entityMovementSync;
	public bool finalReleaseSync;
	public bool fullAllSync;
	public bool godPowersSync;
	public bool obMgrSync;
	public bool pathingSync;
	public bool playerSync;
	public bool randSync;
	public bool squadSync;
	public bool techDebugSync;
	public bool techSync;
	public bool terrainLowLevelSync;
	public bool unitActionSync;
	public bool unitAISync;
	public bool unitDebugSync;
	public bool unitDetailSync;
	public bool unitGroupSync;
	public bool unitSync;
	public bool visibilitySync;
	public bool worldSync;
	public bool xorAllSync;
}
