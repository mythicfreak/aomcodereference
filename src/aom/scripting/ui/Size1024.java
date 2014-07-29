package aom.scripting.ui;

/**
 * A construct consisting of 4 integers that define the position and size of an object on a 1024x768 screen.
 * For other screen resolutions, the values will be converted automatically during parsing.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Size1024 {
	public int startX, startY, stopX, stopY;
	
	public Size1024(int startX, int startY, int stopX, int stopY)
	{
		this.startX = startX;
		this.startY = startY;
		this.stopX = stopX;
		this.stopY = stopY;
	}
	
	@Override
	public String toString() {
		return String.format("size1024=\"%1$ %2$ %3$ %4$\"", startX, startY, stopX, stopY);
	}
}
