package aom.scripting.ui;

/**
 * Define an item in a ScrollList.
 * This element is typically encapsulated in a ScrollListGadget.
 * It is similar to a dropdown element, but typically has a more fancy look.
 * This makes it great for use in in-game screens, 
 * while a dropdown element is reserved for use in the editor. 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class ListItem {
	public String text;
	
	public ListItem(String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "<listitem>" + text + "</listitem>";
	}
}
