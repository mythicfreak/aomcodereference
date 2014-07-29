package aom.scripting.ui;

/**
 * Define an item in a dropdown list.
 * This element is typically encapsulated in a TextFieldGadget that acts as a label.
 * It is similar to a ListItem element, but typically has a less fancy look.
 * Therefore, it is typically used in an editor context.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class DropDownItem {
public String text;
	
	public DropDownItem(String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "<dropdown>" + text + "</dropdown>";
	}
}
