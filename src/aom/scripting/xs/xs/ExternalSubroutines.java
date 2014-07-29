package aom.scripting.xs.xs;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of XS commands that don't fit in any of the subcategories.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class ExternalSubroutines {
	
	/** Returns the current context player ID.  */
	public native int xsGetContextPlayer();
	/**
	 * Sets the current context player ID. Used to retrieve more detailed game info from the new player.
	 * 
	 * @see aom.scripting.xs.kb.Unit#kbLookAtAllUnitsOnMap() kbLookAtAllUnitsOnMap()
	 */
	public native void xsSetContextPlayer( int playerID );
	/** Returns the current game time in milliseconds. When used in triggers, it return the time in second. */
	public native int xsGetTime();
	/** Sets up a runtime event. Nobody really knows what it does. */
	public native bool xsAddRuntimeEvent( string foo, string bar, int something );
	/** Runs the secret XSFID for the function. USE WITH CAUTION. */
	public native int xsGetFuntionID( string functionName );
	
	private ExternalSubroutines() {}
}
