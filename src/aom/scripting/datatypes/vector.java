package aom.scripting.datatypes;
import java.util.ArrayList;

/**
 *	A vector, consisting of 3 floats (X, Y, Z) where Y is usually the elevation.
 *
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class vector {
	private static ArrayList<vector> vectorList = new ArrayList<vector>();
	private double x,y,z;
	
	private vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		vectorList.add(this);
	}
	
	private static vector getIDVector(vector v) {
		return new vector(vectorList.indexOf(v),0,0);
	}
	
	private static int getVectorID(vector v) {
		return (int)v.x;
	}
	
	public static double xsVectorGetX(vector v) {
		return vectorList.get(getVectorID(v)).x;
	}
	
	public static double xsVectorGetY(vector v) {
		return vectorList.get(getVectorID(v)).y;
	}
	
	public static double xsVectorGetZ(vector v) {
		return vectorList.get(getVectorID(v)).z;
	}
	
	public static vector xsVectorSet(double x, double y, double z) {
		return getIDVector(new vector(x, y, z));
	}
	
	public static void xsVectorSetX(vector v, double x) {
		vectorList.get(getVectorID(v)).x = x;
	}
	
	public static void xsVectorSetY(vector v, double y) {
		vectorList.get(getVectorID(v)).y = y;
	}
	
	public static void xsVectorSetZ(vector v, double z) {
		vectorList.get(getVectorID(v)).z = z;
	}
	
	public static double xsVectorLength(vector v) {
		double x = xsVectorGetX(v);
		double y = xsVectorGetY(v);
		double z = xsVectorGetZ(v);
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public static vector xsVectorNormalize(vector v) {
		double l = xsVectorLength(v);
		return xsVectorSet(xsVectorGetX(v)/l, xsVectorGetY(v)/l, xsVectorGetZ(v)/l);
	}
}
