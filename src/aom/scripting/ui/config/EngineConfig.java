package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to the game engine (a.k.a. BANG). 
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class EngineConfig {
	private EngineConfig() {}
	
	/** 
	 * Allows old-style lowpolylogic.
	 */
	public bool allowLowPolyLogic;

	/**
	 * If enabled, the game remains active even if minimized.
	 */
	public bool alwaysActive;
	
	/** 
	 * Allows projectiles to damage units other than their intended target.
	 */
	public bool ballisticCollateralDamage;

	/** 
	 * Allows projectiles to do friendly fire. Must have ballisticCollateralDamage turned on to work.  
	 */
	public bool ballisticFriendlyDamage;

	/** 
	 * Switches the ballistic model to the newest ballistic model.
	 */
	public bool ballisticNewModel;

	/** 
	 * Determines if we precalculate whether or not a projectile hits its target.
	 */
	public bool ballisticPrecalcHits;
	
	/** 
	 * Defines the display depth for the current resolution, 32bit or 64bit by default.
	 * @see #resbpp(int, int)
	 */
	public int bpp;
	
	/** Changes screen resolution and bit depth.*/
	public native void resbpp(int resX, int BPP);
	
	/** With no arguments, toggles anisotropic filtering state, otherwise, sets it.*/
	public native void renderAnisotropic(int state);
	
	/** With no arguments, changes refresh rate to 75hz in fullscreen. otherwise, sets fullscreen refresh to value.*/
	public native void renderRefresh(int state);
	
	/**
	 * Applies the AVI driver patch.
	 */
	public bool aviDriverPatch;

	/** Displays the current number of back buffers.*/
	public native void renderDisplayBackBufferCount();
	
	/** (Attempts to) Set the back buffer count to the indicated number. Valid range is 1-3.*/
	public native void renderSetBackBufferCount(int count);
	
	/** 
	 * Number of backbuffers. 
	 * Range: 1 - 3. 
	 * Default: 1.
	 * 
	 * @see #renderDisplayBackBufferCount()
	 * @see #renderSetBackBufferCount(int)
	 */
	public int backBufferCount;
	
	/** 
	 * DEBUG: the bias curve of the brush.  
	 */
	public float brushBias;
	
	/**
	 * Max brush size.
	 */
	public int brushMaxSize;

	/**
	 * Min brush size.
	 */
	public int brushMinSize;

	/** 
	 * DEBUG: the softness of a brush.  
	 */
	public int brushSoftness;

	/** 
	 * Set brush time scaling. 
	 */
	public int brushTimeScale;

	/** 
	 * Gathers cinematic information.
	 */
	public bool buildCinematic;

	/** 
	 * Phase two of building cinematic.
	 */
	public bool buildCinematic2;

	/** 
	 * Enable/disable call tracker.
	 */
	public bool callTrackerOn;

	/** 
	 * If set, checks the archive files before the file system.
	 */
	public bool checkArchiveFirst;

	public bool checkForRetailDB;

	public bool cinematicSlerp;

	/** 
	 * Relative height of the Cliff you want to paint.  
	 */
	public float cliffHeight;

	/** 
	 * If defined, will paint cliff, else will paint canyon.
	 */
	public bool cliffPaintOn;

	/** 
	 * Cliff painting is relative if set.
	 */
	public bool cliffRelative;

	/** 
	 * Tolerance for painting cliff/canyon side texture.
	 */
	public float cliffSlopeTolerance;

	public bool closeCommLogs;

	public bool closeLogOnWrite;
	
	/** 
	 * Sets the copy mode to terrain copy-n-paste, rather than unit copy-n-paste.
	 */
	public bool copyModeTerrain;

	/** 
	 * Includes height information in copy-n-paste operations.
	 */
	public bool copyTerrainHeight;

	/** 
	 * Height copies-paste relative.
	 */
	public bool copyTerrainHeightAvg;

	/** 
	 * Includes texture information in copy-n-paste operations.
	 */
	public bool copyTerrainTexture;

	/** 
	 * Includes units in copy-n-paste operations.
	 */
	public bool copyTerrainUnits;

	/** 
	 * If set, uses software TnL instead of hardware TnL (TnL = Transform and Lightning)  
	 */
	public bool cpuTnL;
	
	/** 
	 * Only load meshes on demand.
	 */
	public bool demandLoadMeshes;

	/** 
	 * Disables the helpful auto-placement of near-misses on buildings.
	 * 
	 * @note It's a pain to build a dock without this...
	 */
	public bool disableBuildingSnap;
	
	/** 
	 * Turn off the distributed update rendering.  
	 */
	public bool disableMidUpdateRender;

	/** With no arguments, cycles through the various status display modes, otherwise sets display type.*/
	public native void displayType(int state);

	/** With no arguments, toggles display on/off, otherwise, sets display.*/
	public native void display (int state);
	
	/**
	 * Sets the display on or off.
	 * 
	 * @see #display(int)
	 * 
	 * @deprecated
	 */
	public bool displayOn;

	/**
	 * Sets the display type.
	 * 
	 * @see #displayType
	 * 
	 * @deprecated
	 */
	public int displayType;
	
	/** 
	 * If set, low poly setting is ignored -- used for PT builds where meshes are not updated properly.
	 */
	public bool dontAllowLowPoly;

	public bool dontMeterWorkCommands;
	
	public bool dropPalette;
	
	/** 
	 * Defines whether IME is enabled.
	 */
	public bool enableIme;

	/**
	 * Enables IME by default.
	 */
	public bool imeOnByDefault;
	
	/** 
	 * Makes building erode the terrain around them when they are placed.  
	 */
	public bool erodeBuildingFoundations;
	
	/** 
	 * Test with a fixed update.
	 */
	public string fixedUpdate;

	/**
	 * Flush communication logs.
	 */
	public bool flushCommLogs;

	/**
	 * Flush logs after every write.
	 */
	public bool flushLogOnWrite;

	/** 
	 * Forces the game to check the machine specs upon startup.
	 */
	public bool forceDetermineMachineSpec;

	/** 
	 * Foundations under attack have their damage adjusted by this factor.  
	 */
	public float foundationDamageFactor;

	public bool fullCommLogs;

	public float guideInterval;
	
	/** 
	 * Game will start up in a window that covers the whole desktop.
	 */
	public bool fullWindow;
	
	/** Increases gamma value by amount (default = 1) in the range [1,254]. Lower numbers are darker, higher numbers are brighter. This maps into a log scale of values.*/
	public native void renderIncreaseGamma(int amount);

	/** Decreases gamma value by amount (default = 1) in the range [1,254]. Lower numbers are darker, higher numbers are brighter. This maps into a log scale of values.*/
	public native void renderDecreaseGamma(int amount);

	/** Sets gamma to the specified value in the range [1,254]. Lower numbers are darker, higher numbers are brighter. This maps into a log scale of values.*/
	public native void renderSetGamma(int val);

	/** Displays the current gamma value.*/
	public native void renderGetGamma();
	
	/** 
	 * Gamma correction setting for fullscreen.
	 * @see #renderSetGamma(int)
	 * @see #renderGetGamma()
	 */
	public int gamma;
	
	/** 
	 * Sets the graphic detail.
	 * @see #graphicDetail
	 */
	public native void setGraphicDetail(int detailLevel);
	
	/** 
	 * The detail level of the graphics.
	 * 0 - high
	 * 1 - medium
	 * 2 - low
	 * 
	 * @see #setGraphicDetail(int)
	 */
	public int graphicDetail;
	
	/**
	 * Defines the limit of the camera pitch.
	 */
	public int limitPitch;
	
	/** 
	 * Attempts to binarize and load XML files in that manner.
	 */
	public bool loadBinaryXml;

	/** 
	 * Overrides embedded DB info in the savegame with current info.
	 */
	public bool loadSavegameWithCurrentData;

	/**
	 * Logs device info.
	 */
	public bool logDeviceInfo;

	/** 
	 * Enables a set of low end testing features.
	 */
	public bool lowEnd;

	/** 
	 * Enables low poly models.
	 */
	public bool lowPoly;

	/** 
	 * Defines whether low quality textures should be used.  
	 */
	public bool lowQualityTextures;
	
	/** 
	 * Maximum MIPmap size (in pixels) that will be loaded. Disabled if less than or equal to 0.
	 */
	public int maxMipMapSize;
	
	/**
	 * The max number of particles.
	 */
	public int maxParticles;
	
	/** 
	 * Parameter for variable yet fixed update system.
	 */
	public int maxRandUpdate;
	
	/**
	 * The maximum zoom level.
	 * Capped to prevent unfair avantages in multiplayer mode.
	 */
	public int maxZoom;
	
	public bool megaPostLoadForceTextures;

	/** 
	 * Load meshes as memory mapped files.
	 */
	public bool memoryMappedMesh;

	/** 
	 * Parameter for variable yet fixed update system.
	 */
	public int minRandUpdate;
	
	/**
	 * The minimum zoom level.
	 */
	public int minZoom;
	
	/** (Attempts to) Set multisampling to the indicated mode.*/
	public native void renderSetMultisampleMode(int mode);

	/** Displays current multisample mode.*/
	public native void renderDisplayMultisampleMode();
	
	/** 
	 * Multisample mode for things like anti-aliasing.
	 * 
	 * @see #renderSetMultisampleMode(int)
	 * @see #renderDisplayMultisampleMode()
	 */
	public bool multisampleMode;
	
public bool multiMon;
	
	/** 
	 * Force the multiplayer subsystem to wait indefinitely for timed out players.  
	 */
	public bool neverTimeOut;

	/**
	 * Does not include a DB in saved games.
	 */
	public bool noDatabaseInSaveGames;

	/** 
	 * Some pissed-off ES employee's personal config.
	 * Really makes your game load a lot faster.
	 */
	public bool noPregameAnythingIMeanIt;

	/**
	 * Don't load a background scenario.
	 */
	public bool noPregameScenario;

	/**
	 * Disable protolost meshes. 
	 */
	public bool noProtoListMeshes;

	/** 
	 * Disables specular lighting.
	 */
	public bool noSpecular;

	public bool noTextFileFirst;

	/** 
	 * If defined, makes all trees in forests to be sprite-ed.  
	 */
	public bool paintSpriteForestAlways;

	/** 
	 * If defined, makes internal trees in forests sprite-ed.  
	 */
	public bool paintSpriteForestMixed;

	public bool pathingIronHull;

	public bool pathingLrp2;

	/** 
	 * Sets the performance class for this machine.
	 */
	public int performanceClass;

	/** 
	 * Allows all objects to be placed -- must be defined at startup.  
	 */
	public bool placeAnything;

	/**
	 * Maximum amount of corps to show.
	 */
	public int playerMaxCorpseCount;
	
	public bool primary;

	public bool randomConnectionFail;

	public bool removeMPLimit;


	/**
	 * Defines the roughen tool's amplitude.
	 */
	public float roughenAmplitude;
	
	/**
	 * Defines the roughen tool's tolerance.
	 */
	public float roughenTolerance;

	/** 
	 * The difficulty level of the game when playtesting a scenario.
	 */
	
	/** 
	 * Renderer automatically picks a device at startup.
	 */
	public bool noDeviceSelect;
	
	/**
	 * Disable Direct X
	 */
	public bool noDirectXCheck;
	
	/** 
	 * Suppresses mip-mapping.
	 */
	public bool noMipMap;
	
	/** 
	 * Ignore realtime and always run updates.
	 * @deprecated
	 */
	public bool runAsFastAsPossible;

	public bool sceneManagement;
	
	/**
	 * Top scrolling zone in pixels.
	 */
	public int scrollTopZone;

	/** 
	 * Scrolling zone in pixels.
	 */
	public int scrollZone;
	
	/** 
	 * Defines the selection pixel error.
	 */
	public int selectionPixelError;

	/** 
	 * Number of mipmap levels to skip.
	 */
	public bool skipMipMapLevels;
	
	public bool terrainFilterVisibility;

	/** 
	 * Makes terrain texture density half of normal.  
	 */
	public bool terrainHalfDensity;

	/** 
	 * Makes terrain texture density one quarter of normal.  
	 */
	public bool terrainQuarterDensity;

	/** 
	 * Texture cache = textureCachePer64MB * (MM / 64), eg:  6 * (128 / 64) = 12 MB.
	 */
	public int textureCachePer64MB;

	public bool tileBasedLoS;

	public bool trackArc;

	public bool trackPointer;

	/** 
	 * Spew general undo info (ops in queue, etc.)  
	 */
	public bool undoSpew;

	/** 
	 * Spew detailed info about terrain elev undo.  
	 */
	public bool undoTerrainElevationSpew;

	/** 
	 * Spew detailed info about terrain painting undo.  
	 */
	public bool undoTerrainPaintSpew;

	/** 
	 * Turns on the export of a string file with scenario save.
	 */
	public bool unicodeStringExport;

	public bool unitAction;

	public bool unitAI;

	public bool updateAIs;

	/** 
	 * Validate my build checksum against the host's.
	 */
	public bool validateChecksum;

	/** 
	 * Toggle view lock interpolation when replaying a game.
	 */
	public bool viewLockInterpolate;
	
	/**
	 * Use the smart minimap update system.
	 */
	public bool useMinimapSmartUpdate;

	/** 
	 * Only use the primary graphics card. 
	 */
	public bool usePrimaryGCOnly;

	/** 
	 * Enable terrain height limits.
	 */
	public bool useTerrainHeightLimits;
	
	/** With no arguments, toggles window/fullscreen. otherwise, sets mode to fullscreen(0) or window(1). */
	public native void renderWindow(int state);
	
	/** 
	 * Game starts in a window instead of fullscreen.
	 * @see #renderWindow(int)
	 */
	public bool window;
	
	/**
	 * Defines the default X-size of new maps generated by the editor. 
	 */
	public int worldSizeX;

	/**
	 * Defines the default Z-size of new maps generated by the editor. 
	 */
	public int worldSizeZ;
	
	/** Changes screen resolution.*/
	public native void res(int resX);
	
	/** 
	 * Specifies the startup X-resolution, in pixels. Implies a Y-resolution.
	 * 
	 * @see #yres
	 * @see #res(int)
	 */
	public int xres;

	/** 
	 * Specifies the startup Y-resolution, in pixels. 
	 */
	public int yres;
	
	public bool bandwidthCL;
	public bool broadcasterCL;
	public bool configCL;
	public bool gameStreamCL;
	public bool gameTimingCL;
	public bool generalCL;
	public bool lowLevelSyncCL;
	public bool matchmakingCL;
	public bool orderedChannelCL;
	public bool perfCL;
	public bool receiverCL;
	public bool sessionCL;
	public bool sharedDataCL;
	public bool syncCL;
	public bool syncManagerCL;
	public bool timeSyncCL;
	public bool timingCL;
	public bool transportCL;
	
	/** 
	 * Forces the game to run in a Direct3D 9 feature level. This requires Direct3D 11 to be enabled.
	 * 
	 * @since AoM:EE
	 */
	public bool forceD3D9;
	
	/** 
	 * Forces the game to run in a Direct3D 10 feature level. This requires Direct3D 11 to be enabled.
	 * 
	 * @since AoM:EE
	 */
	public bool forceD3D10;
	
	/** 
	 * Disables the loading of DDT textures.
	 * 
	 * @since AoM:EE
	 */
	public bool ignoreDDT;
	
	/** 
	 * Enables the D3D11 debug layer. This flag can introduce a serious performance impact.
	 * 
	 * @since AoM:EE
	 */
	public bool D3Ddebug;
	
	/** 
	 * Enables hardware unit tessellation in D3D11 feature levels.
	 * 
	 * @since AoM:EE
	 */
	public bool enableTessellation;
	
	/** 
	 * Disables bloom.
	 * 
	 * @since AoM:EE
	 */
	public bool noBloom;
	
	/** 
	 * Disables anti-aliasing.
	 * 
	 * @since AoM:EE
	 */
	public bool noAA;
	
	/** 
	 * Disables Screen Space Ambient Occlusion.
	 * 
	 * @since AoM:EE
	 */
	public bool noSSAO;
	
	/** 
	 * Disables lights on units.
	 * 
	 * @since AoM:EE
	 */
	public bool noUnitLights;
	
	/** 
	 * Disables V-Sync.
	 * 
	 * @since AoM:EE
	 */
	public bool disableVSync;
	
	/** 
	 * Enables light.
	 * 
	 * @since AoM:EE
	 */
	public bool light;
	
	/** 
	 * Enables light on fires.
	 * 
	 * @since AoM:EE
	 */
	public bool firelight;
	
	/** 
	 * Enables light on gold mines.
	 * 
	 * @since AoM:EE
	 */
	public bool goldlight;

	/** 
	 * Toggle V-Sync.
	 * 
	 * @see EngineConfig#disableVSync
	 * 
	 * @since AoM:EE
	 */
	public native void toggleVSync();

	/**
	 * Toggle bloom.
	 * 
	 * @see EngineConfig#noBloom
	 * 
	 * @since AoM:EE
	 * 
	 */
	public native void toggleBloom();

	/**
	 * Toggle FXAA.
	 * 
	 * @see EngineConfig#noAA
	 * 
	 * @since AoM:EE
	 */
	public native void toggleFXAA();

	/** 
	 * Toggle SSAO.
	 * 
	 * @see EngineConfig#noSSAO
	 * 
	 * @since AoM:EE
	 */
	public native void toggleSSAO();

	/** 
	 * Toggle unit lights.
	 * 
	 * @see EngineConfig#noUnitLights
	 * 
	 * @since AoM:EE
	 */
	public native void toggleUnitLights();
	
	/** 
	 * Displays embedded htmlBrowser?
	 * 
	 * @since AoM:EE
	 */
	public bool nohtml;

	/** 
	 * Enabled detailed logging of all modmanager file operations to mod-manager.txt. Will reduce performance.
	 * 
	 * @since AoM:EE
	 */
	public bool modmanagerdetailed;
	
	/** 
	 * Sets fog settings.
	 * 
	 * @since AoM:EE
	 */
	public native void setFogSettings(float fogStart, float fogEnd, float red, float green, float blue);

	/** 
	 * Sets shadow settings.
	 * 
	 * @since AoM:EE
	 */
	public native void setShadowSettings(float cameraRange, float shadowMapSize, float pcfBlurSize, float numCascades, float pcfOffset);

	/** 
	 * Set shadow detail level.
	 * 
	 * @param level between 0 (low) and 5 (high)
	 * 
	 * @since AoM:EE
	 */
	public native void setShadowLevel(int level);
	
	/** 
	 * Sets tonemap settings. Unknown params.
	 * 
	 * @since AoM:EE
	 */
	public native void setTonemapSettings();

	/** 
	 * Sets bloom settings. Unknown params.
	 * 
	 * @since AoM:EE
	 */
	public native void setBloomSettings();
	
	
}
