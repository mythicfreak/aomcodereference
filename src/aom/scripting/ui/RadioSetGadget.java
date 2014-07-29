package aom.scripting.ui;

import java.util.List;

public class RadioSetGadget extends AbstractGadget {
	/**
	 * Defines the size of the individual radio buttons inside this gadget, along with their respective label.
	 */
	public Size1024 radioSetButtonSize1024; //"155 36" 
	
	/**
	 * Defines the border size of the radio buttons inside this gadget.
	 */
	public Size1024 radioButtonBorder1024; //"2 2" 
	
	/**
	 * Defines the default selected option in this RadioSet.
	 */
	public int radioSetDefaultButtonIndex = 0;
	
	/**
	 * Defines the image used to indicate a radio button is checked.
	 */
	public String radioCheckedArt="ui\\ui button radial 32x32 clicked";
	
	/**
	 * Defines the image used to indicate a radio button is unchecked.
	 */
	public String radioUncheckedArt="ui\\ui button radial 32x32";
	
	/**
	 * Defines the image used to indicate a radio button is hovered with the mouse.
	 */
	public String radioHighlightArt="ui\\ui button radial 32x32 rollover";
	
	/**
	 * Sets whether or not this radio button should layout its buttons in a horizontal or vertical fashion.
	 */
	public boolean radioSetHorizontalLayout = false;
	
	/**
	 * Contains a list of radio buttons that indicate the possible choices in this RadioSet.
	 */
	public List<RadioButton> radioButtons;
	
	public void addRadioButton(RadioButton button)
	{
		radioButtons.add(button);
	}
	
	/**
	 * Creates a new RadioSet Gadget with the given properties.
	 */
	public RadioSetGadget(
			Size1024 radioSetButtonSize1024,
			Size1024 radioButtonBorder1024,
			int radioSetDefaultButtonIndex,
			String radioCheckedArt,
			String radioUncheckedArt,
			String radioHighlightArt,
			boolean radioSetHorizontalLayout
	)
	{
		this.radioSetButtonSize1024 = radioSetButtonSize1024;
		this.radioButtonBorder1024 = radioButtonBorder1024;
		this.radioSetDefaultButtonIndex = radioSetDefaultButtonIndex;
		this.radioCheckedArt = radioCheckedArt;
		this.radioUncheckedArt = radioUncheckedArt;
		this.radioHighlightArt = radioHighlightArt;
		this.radioSetHorizontalLayout = radioSetHorizontalLayout;
	}
	
	/**
	 * Creates a new RadioSet Gadget with some default properties.
	 */
	public RadioSetGadget(Size1024 radioSetButtonSize1024, Size1024 radioButtonBorder1024)
	{
		this.radioSetButtonSize1024 = radioSetButtonSize1024;
		this.radioButtonBorder1024 = radioButtonBorder1024;
	}
	
	/** @deprecated */
	public String radiosettitle = "";
	
	/** @deprecated */
	public boolean radiosettitleleft = false;
}
