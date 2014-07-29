package aom.scripting.ui;

/**
 * Defines a Radio Button.
 * This element is typically encapsulated in a RadioSet Gadget.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class RadioButton {
	public String text;
	public String foreground;
	
	public RadioButton(String text, String foreground)
	{
		this.text = text;
		this.foreground = foreground;
	}
	
	@Override
	public String toString() {
		if(foreground == null || foreground.equals(""))
			return "<button>" + text + "</button>";
		else
			return "<button foreground=\"" + foreground + "\">" + text + "</button>";
	}
}
