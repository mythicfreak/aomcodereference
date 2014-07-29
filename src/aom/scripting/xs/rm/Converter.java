package aom.scripting.xs.rm;

/**
 * <p>This class provides a collection of RM commands concerning Converters.</p>
 * 
 * <p>
 * The functions listed below are used to convert between Meters, Fractions and Tiles.
 * Meters and Tiles are Absolute, Fractions are relative to the map side.
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Converter {
	/**Converts a number of tiles to a distance in meters.*/
	public native float rmTilesToMeters(int tiles);

	/**Converts a fraction of the map in the x direction to meters.*/
	public native float rmXFractionToMeters(float meters);

	/**Converts an fraction of the map in the x direction to tile count.*/ 
	public native float rmXFractionToTiles(float fraction);

	/**Converts meters into a fraction of the map in the x direction.*/
	public native float rmXMetersToFraction(float meters);

	/**Converts tile count in the x direction to fraction of map.*/
	public native float rmXTilesToFraction(int tiles);

	/**Converts a fraction of the map in the z direction to meters.*/
	public native float rmZFractionToMeters(float meters);

	/**Converts an fraction of the map in the z direction to tile count.*/
	public native float rmZFractionToTiles(float fraction);

	/**Converts meters into a fraction of the map in the z direction.*/
	public native float rmZMetersToFraction(float meters);

	/**Converts tile count in the z direction to fraction of map.*/
	public native float rmZTilesToFraction(int tiles);
	
	/**Converts an area from fraction of the map to tile count.*/
	public native float rmAreaFractionToTiles(float fraction);

	/**Converts area tile count to fraction of map.*/
	public native float rmAreaTilesToFraction(int tiles);
	
	/**Converts an angle in degrees to radians.*/
	public native float rmDegreesToRadians(float degrees);
	
	/**Converts a distance in meters to a number of tiles.*/
	public native float rmMetersToTiles(float meters);
	
	private Converter() {}
}
