package aom.scripting.xs.xs;

import aom.scripting.datatypes.vector;

/**
 * This class provides a collection of XS commands concerning Vectors.
 * A vector represents a point in 3D space.
 * The X-component is oriented along the South-East map side.
 * The Y-component represents the elevation.
 * The Z-component is oriented along the South-West map side.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Vector {
	private Vector() {}
	
	/** Create a simple vector.
	 * x, y and z must be literals! 
	 * 
	 * @see #xsVectorSet(float, float, float)
	 */
	public native vector vector(float x, float y, float z);
	/** Returns the x component of the given vector.  */
	public native float xsVectorGetX( vector v );
	/** Returns the y component of the given vector.  */
	public native float xsVectorGetY( vector v );
	/** Returns the z component of the given vector.  */
	public native float xsVectorGetZ( vector v );
	/** Set the x component of the given vector, returns the new vector.  */
	public native float xsVectorSetX( vector v, float x );
	/** Set the y component of the given vector, returns the new vector.  */
	public native float xsVectorSetY( vector v, float y );
	/** Set the z component of the given vector, returns the new vector.  */
	public native float xsVectorSetZ( vector v, float z );
	/** 
	 * Set the 3 components into a vector, returns the new vector.
	 * Contrary to the vector() function, here non-literals (e.g. function calls, ...) are allowed too.
	 */
	public native vector xsVectorSet( float x, float y, float z );
	/** Returns the length of the given vector.  */
	public native float xsVectorLength( vector v );
	/** Returns the normalized version of the given vector.  */
	public native vector xsVectorNormalize( vector v);
}
