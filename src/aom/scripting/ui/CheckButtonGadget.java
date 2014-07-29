package aom.scripting.ui;

public class CheckButtonGadget extends AbstractGadget {
	public String checkCheckedArt = "ui\\ui button check box green";
	public boolean checkHighlightArt = true;
	public String checkUncheckedArt = "ui\\ui button check box red";
	public Size1024 checkborder1024 = new Size1024(-1, -1, 5, 0);
	
	//sound="UI_jewel" texturecoords="0 0 .69 .69"
	
	/**
	 * Creates a new checkbox button with default properties.
	 */
	public CheckButtonGadget() {}
	
	/**
	 * Creates a new checkbox button with given properties. 
	 */
	public CheckButtonGadget(String checkedArt, String uncheckedArt, boolean highlightArt, Size1024 border)
	{
		this.checkCheckedArt = checkedArt;
		this.checkUncheckedArt = uncheckedArt;
		this.checkHighlightArt = highlightArt;
		this.checkborder1024 = border;
	}
}
