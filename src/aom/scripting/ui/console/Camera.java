package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning the Camera.
 * 
 * @local Camera commands are all local.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Camera {

	private Camera() {}
	
	/** Looks at given (x,z) location on terrain.*/
	public native void lookAt(float x, float z);
	
	/** Looks at given KB army.*/
	public native void lookAtArmy(int playerID, string armyName);
	
	/** Zooms to the first instance of proto unit X owned by the current player.*/
	public native void uiZoomToProto(string proto);
	
	/** Moves the camera to see the first selected unit.*/
	public native void uiLookAtSelection();

	/** Moves the camera to see the specified Unit.*/
	public native void uiLookAtUnit();

	/** Moves the camera to see the specified Unit.*/
	public native void uiLookAtUnitByName(string scenarioName);

	/** Moves the camera to see the first instance of proto unit X owned by the current player.*/
	public native void uiLookAtProto();
	
	/** 
	 * Sets whether camera limiting is on.
	 * 
	 * @since AoT 
	 */
	public native void cameraLimit(int state);

	/** Sets whether camera limiting is on.*/
	public native void cameraRotate(int state);

	/** Puts the camera in a reasonable orientation.*/
	public native void cameraNice();

	/** Indicates that camera forward key has gone up or down.*/
	public native void cameraForward(int keyState);

	/** Indicates that camera world forward key has gone up or down.*/
	public native void cameraWorldForward(int keyState);

	/** Indicates that camera world forward 8, left key has gone up or down.*/
	public native void cameraWorldForwardLeft(int keyState);

	/** Indicates that camera world forward 8, right key has gone up or down.*/
	public native void cameraWorldForwardRight(int keyState);

	/** Indicates that camera backward key has gone up or down.*/
	public native void cameraBackward(int keyState);

	/** Indicates that camera world backward key has gone up or down.*/
	public native void cameraWorldBackward(int keyState);

	/** Indicates that camera world backward 8, left key has gone up or down.*/
	public native void cameraWorldBackwardLeft(int keyState);

	/** Indicates that camera world backward 8, right key has gone up or down.*/
	public native void cameraWorldBackwardRight(int keyState);

	/** Indicates that camera right key has gone up or down.*/
	public native void cameraRight(int keyState);

	/** Indicates that camera left key has gone up or down.*/
	public native void cameraLeft(int keyState);

	/** Indicates that camera up key has gone up or down.*/
	public native void cameraUp(int keyState);

	/** Indicates that camera down key has gone up or down.*/
	public native void cameraDown(int keyState);

	/** Indicates that camera pitch forward key has gone up or down.*/
	public native void cameraPitchForward(int keyState);

	/** Indicates that camera pitch backward key has gone up or down.*/
	public native void cameraPitchBackward(int keyState);

	/** Indicates that camera yaw right key has gone up or down. */ 
	public native void cameraYawRight(int keyState);

	/** Indicates that camera yaw left key has gone up or down.*/
	public native void cameraYawLeft(int keyState);

	/** Indicates that camera 'Local Yaw right1 key has gone up or down.*/
	public native void cameraLocalYawRight(int keyState);

	/** Indicates that camera 'Local Yaw left' key has gone up or down. */
	public native void cameraLocalYawLeft(int keyState);
	
	/** Save camera to file.*/
	public native void saveCamera(string filename);

	/** Load camera from file.*/
	public native void loadCamera(string filename);

	/**
	 * Rotate with wheel, i.e. intended to be mapped to mouse wheel.
	 */
	public native void uiWheelRotate(int x);

	/**
	 * Zooms to the most recent minimap event.
	 */
	public native void uiZoomToMinimapEvent();
	
	/** 
	 * Zoom with wheel -- i.e. intended to be mapped to mouse wheel.
	 * 
	 * @since AoM:EE
	 */
	public native void uiWheelZoom(int x);

	/** 
	 * Zoom fine with wheel -- i.e. intended to be mapped to mouse wheel.
	 * 
	 * @since AoM:EE
	 */
	public native void uiWheelZoomFine(int x);

	/** 
	 * Reset rotation.
	 * 
	 * @since AoM:EE
	 */
	public native void uiResetWheelRotate();
}
