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
	
	/**
	 * Creates a simple vector where all three coordinates are <b>literal numbers</b> [like {@code vector(1,2,3)}, but not {@code vector(x,0,z)}].
	 * Use {@link Vector#xsVectorSet(float, float, float) xsVectorSet} to create a vector from any kind of values,
	 * including literals, variables, function calls, etc.
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
	public native vector xsVectorSetX( vector v, float x );
	/** Set the y component of the given vector, returns the new vector.  */
	public native vector xsVectorSetY( vector v, float y );
	/** Set the z component of the given vector, returns the new vector.  */
	public native vector xsVectorSetZ( vector v, float z );
	/** 
	 * Creates a new vector from three coordinates.
	 * <p>
	 * Contrary to the {@link #vector(float, float, float) vector()} pseudo-function, here non-literals (e.g. function calls or variables) are allowed too.
	 */
	public native vector xsVectorSet( float x, float y, float z );
	/** Returns the length of the given vector.  */
	public native float xsVectorLength( vector v );
	/** Returns the normalized version of the given vector,
	 * i.e. a vector of length one that points in the same direction as the given vector.  */
	public native vector xsVectorNormalize( vector v);
}
