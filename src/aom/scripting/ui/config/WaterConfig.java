package aom.scripting.ui.config;

import aom.scripting.datatypes.bool;

/**
 * This class provides an overview of Configs related to water and waves. 
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class WaterConfig {
	private WaterConfig() {}
	
	/** 
	 * If defined, beautify water will be done at request.  
	 */
	public bool beautifyWater;

	/** 
	 * The animation stagger between one wave and the next.
	 * Range: [0.0, 1.0]  
	 */
	public float oceanWaveStagger;
	
	/** 
	 * Allow painting ground over water to raise the ground.  
	 */
	public bool paintGroundOverWater;
	
	/**
	 * Show waves.
	 */
	public bool useWaves;
	
	/** 
	 * DEBUG: epsilon that allows water to be painted on variable terrain heights.
	 */
	public float waterAllowPaintDelta;

	/** 
	 * Depth where water alpha goes to max value.
	 */
	public int waterAlphaMaxDepth;

	/** 
	 * Water alpha max value.
	 */
	public int waterAlphaMaxValue;

	/** 
	 * Depth where water alpha goes to min value.
	 */
	public int waterAlphaMinDepth;

	/** 
	 * Water alpha min value.
	 */
	public int waterAlphaMinValue;

	/** 
	 * WATER HACK: trying out a better flood fill.
	 */
	public bool waterBetterFloodFill;

	/** 
	 * Toggle water bumpmapping.
	 */
	public bool waterBump;

	/** 
	 * DEBUG: the blue color for water vertex Color painting.  
	 */
	public int waterColorBlue;

	/** 
	 * DEBUG: the green color for water vertex Color painting.  
	 */
	public int waterColorGreen;

	/** 
	 * DEBUG: for water vertex Color painting.  
	 */
	public int waterColorPaint;

	/** 
	 * DEBUG: the red color for water vertex Color painting.  
	 */
	public int waterColorRed;

	/** 
	 * Toggle water decal.
	 */
	public bool waterDecal;

	/** 
	 * Toggle water environment map.
	 */
	public bool waterEnv;

	/** 
	 * Toggles whether water environment map is in transparency mode.
	 */
	public bool waterEnvTrans;

	/** 
	 * WATER HACK: large wave movement angle (degrees) -- must repaint water.
	 */
	public int waterLargeAngle;

	/** 
	 * WATER HACK: large wave max alpha.
	 */
	public int waterLargeMaxAlpha;

	/** 
	 * WATER HACK: large wave min alpha.
	 */
	public int waterLargeMinAlpha;

	/** 
	 * WATER HACK: large wave fade period in secs.
	 */
	public int waterLargePeriod;

	/** 
	 * WATER HACK: large wave movement speed -- must repaint water.
	 */
	public int waterLargeSpeed;

	/** 
	 * Toggles painting water area vs just painting water.  
	 */
	public bool waterPaintArea;

	/** 
	 * DEBUG:  distance the water plane is below the edge that created the water.  
	 */
	public int waterPlaneOffset;

	/** 
	 * DEBUG: render the water hull.  
	 */
	public bool waterRenderHull;

	/** 
	 * WATER HACK: small wave movement angle (degrees) -- must repaint water.
	 */
	public int waterSmallAngle;

	/** 
	 * WATER HACK: small wave max alpha.
	 */
	public int waterSmallMaxAlpha;

	/** 
	 * WATER HACK: small wave min alpha.
	 */
	public int waterSmallMinAlpha;

	/** 
	 * WATER HACK: small wave fade period in secs.
	 */
	public int waterSmallPeriod;

	/** 
	 * WATER HACK: small wave movement speed -- must repaint water.
	 */
	public int waterSmallSpeed;

	/** 
	 * WATER HACK: turn on water test hack.
	 */
	public bool waterTest;

	/**
	 * Wave parameter.
	 */
	public float wave2AnimFadeInEnd;

	/**
	 * Wave parameter.
	 */
	public float wave2AnimFadeOutEnd;

	/**
	 * Wave parameter.
	 */
	public float wave2AnlmFadeOutStart;

	/**
	 * Wave parameter.
	 */
	public float waveAnimFadeOutEnd;

	/**
	 * Wave parameter.
	 */
	public float waveAnimFadeOutStart;
	
	/** 
	 * Disables water reflections.
	 * 
	 * @since AoM:EE
	 */
	public bool noWaterReflection;
	
	/** 
	 * Disables water refraction.
	 * 
	 * @since AoM:EE
	 */
	public bool noWaterRefraction;
	
	/** 
	 * Toggle water reflections.
	 * 
	 * @see WaterConfig#noWaterReflection
	 * 
	 * @since AoM:EE
	 */
	public native void toggleWaterReflect();

	/** 
	 * Toggle water refraction.
	 * 
	 * @see WaterConfig#noWaterRefraction
	 * 
	 * @since AoM:EE 
	 */
	public native void toggleWaterRefract();
}
