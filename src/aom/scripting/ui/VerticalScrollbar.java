package aom.scripting.ui;

/**
 * Represents a Vertical Scrollbar.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class VerticalScrollbar {
	/**
	 * The background image of this Scrollbar.
	 * Transparent if no image is provided.
	 * 
	 *  @example "ui background yellow opaque"
	 */
	public String background = "ui\\ui background yellow opaque";
	
	/**
	 * The background image of the area the slider moves in.
	 * Plain white if no image is provided.
	 * 
	 * @example "ui background dark blue opaque"
	 */
	public String sliderAreaArt = "ui\\ui background dark blue opaque";
	
	/**
	 * Sets whether or not the up/down arrows should be added to both ends of the slider.
	 */
	public boolean sliderButtons = true;
	
	/**
	 * The image used for the down button.
	 * 
	 * @example "sliderDownBtn"
	 */
	public String sliderDownBtnSet = "sliderDownBtn";
	
	/**
	 * The image used for the slider itself.
	 * 
	 * @example "ui slider pip horizontal"
	 */
	public String sliderPipArt = "ui\\ui slider pip horizontal";
	
	/**
	 * Defines what part of the slider image should be used.
	 * 
	 * @example "0 0 0.625 0.438"
	 */
	public String sliderPipTextureCoords = "0 0 0.625 0.438";
	
	/**
	 * Sets whether or not this slider has a vertical orientation.
	 * Should always be true;
	 */
	public boolean sliderVertical = true;
	
	/**
	 * The image used for the up button.
	 * 
	 * @example "sliderUpBtn"
	 */
	public String sliderUpBtnSet = "sliderUpBtn";
	
	/**
	 * Create a new Vertical Scrollbar with the given properties.
	 */
	public VerticalScrollbar(
		boolean sliderButtons,
		String sliderUpBtnSet,
		String sliderDownBtnSet,
		String background,
		String sliderAreaArt,
		String sliderPipArt,
		String sliderPipTextureCoords,
		boolean sliderVertical)
	{
		this.background = background;
		this.sliderAreaArt = sliderAreaArt;
		this.sliderButtons = sliderButtons;
		this.sliderDownBtnSet = sliderDownBtnSet;
		this.sliderPipArt = sliderPipArt;
		this.sliderPipTextureCoords = sliderPipTextureCoords;
		this.sliderUpBtnSet = sliderUpBtnSet;
		this.sliderVertical = sliderVertical;
	}
	
	/**
	 * Creates a new Vertical Scrollbar with default properties.
	 */
	public VerticalScrollbar() {}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("<vertscrollbar");
		builder.append(" sliderupbtnset=\"" + sliderUpBtnSet + "\"");
		builder.append(" sliderdownbtnset=\"" + sliderDownBtnSet + "\"");
		builder.append(" sliderpipart=\"" + sliderPipArt + "\"");
		builder.append(" sliderpiptexturecoords=\"" + sliderPipTextureCoords + "\"");
		builder.append(" sliderareaart=\"" + sliderAreaArt + "\"");
		builder.append(" background=\"" + background + "\"");		
		if(sliderVertical) builder.append(" slidervertical=\"\"");
		if(sliderButtons) builder.append(" sliderbuttons=\"\"");
		return builder.toString() + " />";
	}
}
