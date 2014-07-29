package aom.scripting.ui;

import java.util.ArrayList;
import java.util.List;

public class MenuGadget extends AbstractGadget {
	public String buttonsize1024;
	public List<SubMenu> subMenus = new ArrayList<SubMenu>();
	//bevel=""
	
	public void addSubMenu(SubMenu subMenu)
	{
		this.subMenus.add(subMenu);
	}
}
