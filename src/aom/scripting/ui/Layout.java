package aom.scripting.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides an overview of how layout XML files are built.
 * 
 * The Layout element is at the root of every file.
 * It contains only a set of Gadgets and possibly 1 Position element.
 * 
 * @see <a href="{@docRoot}/resources/layout.dtd">Detailed Layout Format in DTD</a>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Layout {
	public List<AbstractGadget> gadgets = new ArrayList<AbstractGadget>();
	public MinimapPosition position = null;
	
	public void addGadget(AbstractGadget gadget)
	{
		this.gadgets.add(gadget);
	}
	
	public void setMinimapPosititon(MinimapPosition position)
	{
		this.position = position;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(AbstractGadget gadget : gadgets)
			builder.append(gadget.toString() + "\r\n");
		
		if(position != null) builder.append(position.toString());
		return builder.toString();
	}
}
