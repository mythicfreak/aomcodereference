package aom.scripting.ui;

public class CommandPanelGadget extends AbstractGadget {
	public Size1024 commandPanelButtonSeparation1024;
	public Size1024 commandPanelButtonSize1024;
	public boolean bevelButton = true;
	
	//donthighlight=""
	
	/**
	 * Creates a new command panel gadget with given properties.
	 * 
	 * @note There can only be 1 gadget of this kind.
	 */
	public CommandPanelGadget(Size1024 buttonSeparation1024, Size1024 buttonSize, boolean bevelButton)
	{
		this.commandPanelButtonSeparation1024 = buttonSeparation1024;
		this.commandPanelButtonSize1024 = buttonSize;
		this.bevelButton = bevelButton;
	}
}
