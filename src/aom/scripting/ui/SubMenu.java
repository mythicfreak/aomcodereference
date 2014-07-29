package aom.scripting.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a SubMenu, a part of a MenuGadget.
 * A SubMenu can have multiple other SubMenus as its children.
 *   
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SubMenu {
	public List<SubMenu> children = new ArrayList<SubMenu>();
	
	/**
	 * Defines the command to be executed when the user clicks on this menu item.
	 * If no command is needed, set the field to null;
	 */
	public String consoleCommand = null;
	
	/**
	 * Defines the hotkey that can be used to jump to this entry.
	 * If no hotkey is needed, set the field to null;
	 */
	public String accelerator = null;
	
	/**
	 * This field provides a shortcut to make this menu's command act as the configToggle(string config) command.
	 * If no configIndex is needed, set the field to null;
	 * 
	 * @see aom.scripting.ui.config.Config#configToggle(aom.scripting.datatypes.string)
	 */
	public String configIndex = null;
	
	/**
	 * Defines whether this menuitem is disabled or not.
	 */
	public boolean disabled = false;
	
	/**
	 * Defines whether this menuitem acts as a separator or not.
	 * If this is true, no title will be shown, and no children should be added.
	 */
	public boolean separator = false;
	
	/**
	 * Defines the text that will be displayed on this menu item.
	 */
	public String title;
	
	/**
	 * Creates a new SubMenu with the given properties.
	 */
	public SubMenu(String accelerator, String configIndex, String consoleCommand, boolean disabled, boolean separator, String title)
	{
		if(separator && title != null)
			throw new IllegalArgumentException("Title should be null when separator is true.");
		
		this.accelerator = accelerator;
		this.configIndex = configIndex;
		this.consoleCommand = consoleCommand;
		this.disabled = disabled;
		this.separator = separator;
		this.title = title;
	}
	
	/**
	 * Creates a new SubMenu with given title and default properties.
	 */
	public SubMenu(String title)
	{
		this.title = title;
	}
	
	public void addSubMenu(SubMenu subMenu)
	{
		if(separator) throw new IllegalStateException("This is a separator submenu, it must not have children.");
		
		children.add(subMenu);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("<submenu");
		builder.append(" title=\"" + title + "\"");
		if(accelerator != null) builder.append(" accelerator=\"" + accelerator + "\"");
		if(configIndex != null) builder.append(" configIndex=\"" + configIndex + "\"");
		if(disabled) builder.append(" disabled=\"" + disabled + "\"");
		if(separator) builder.append(" separator=\"" + separator + "\"");
		builder.append(">");
		for(SubMenu menu : children)
			builder.append("\r\n" + menu.toString());
		builder.append("</submenu>");
		return builder.toString(); 
	}
}
