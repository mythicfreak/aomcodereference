package aom.scripting.ui;

/**
 * Defines 1 of the states a StateButton can be in.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class StateEntry {
	public String background = null;
	public RgbColor backgroundColor = null;
	
	/**
	 * Creates a new StateEntry with the given background image.
	 */
	public StateEntry(String background)
	{
		if(background == null)
			throw new IllegalArgumentException("Background must not be null.");
		
		this.background = background;
	}
	
	/**
	 * Creates a new StateEntry with the given background color. 
	 */
	public StateEntry(RgbColor backgroundColor)
	{
		if(backgroundColor == null)
			throw new IllegalArgumentException("BackgroundColor must not be null.");
		
		this.backgroundColor = backgroundColor;
	}
	
	@Override
	public String toString() {
		if(background != null) return "<stateentry background=\"" + background + "\" />";
		if(backgroundColor != null) return "<stateentry backgroundcolor=\"" + backgroundColor + "\" />";
		
		return "<stateentry background=\"\" />";
	}
}
