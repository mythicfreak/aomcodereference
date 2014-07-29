package aom.scripting.ui;

/**
 * This MinimapPosition element defines the position of the minimap in the UI.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class MinimapPosition {
	public String name;
	public Size1024 size;
	
	public MinimapPosition(String name, Size1024 size)
	{
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "<position name=\"" + name + "\" " + size.toString() + " />";
	}
}
