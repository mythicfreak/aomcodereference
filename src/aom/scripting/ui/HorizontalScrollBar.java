package aom.scripting.ui;

/**
 * Represents a Horizontal Scrollbar.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class HorizontalScrollBar {
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
	 * The image used for the left button.
	 * 
	 * @example "sliderLeftBtn"
	 */
	public String sliderLeftBtnSet = "sliderLeftBtn";
	
	/**
	 * The image used for the slider itself.
	 * 
	 * @example "ui slider pip horizontal"
	 */
	public String sliderPipArt = "ui\\ui slider pip horizontal";
	
	/**
	 * Defines what part of the slider image should be used.
	 * 
	 * @example "0 0 1 1" 
	 */
	public String sliderPipTextureCoords = "0 0 1 1";
	
	/**
	 * The image used for the right button.
	 * 
	 * @example "sliderRightBtn"
	 */
	public String sliderRightBtnSet = "sliderRightBtn";
	
	/**
	 * Create a new Horizontal Scrollbar with the given properties.
	 */
	public HorizontalScrollBar(
		boolean sliderButtons,
		String sliderLeftBtnSet,
		String sliderRightBtnSet,
		String background,
		String sliderAreaArt,
		String sliderPipArt,
		String sliderPipTextureCoords)
	{
		this.background = background;
		this.sliderAreaArt = sliderAreaArt;
		this.sliderButtons = sliderButtons;
		this.sliderLeftBtnSet = sliderRightBtnSet;
		this.sliderPipArt = sliderPipArt;
		this.sliderPipTextureCoords = sliderPipTextureCoords;
		this.sliderRightBtnSet = sliderLeftBtnSet;
	}
	
	/**
	 * Creates a new Horizontal Scrollbar with default properties.
	 */
	public HorizontalScrollBar() {}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("<horizscrollbar");
		builder.append(" sliderupbtnset=\"" + sliderRightBtnSet + "\"");
		builder.append(" sliderdownbtnset=\"" + sliderLeftBtnSet + "\"");
		builder.append(" sliderpipart=\"" + sliderPipArt + "\"");
		builder.append(" sliderpiptexturecoords=\"" + sliderPipTextureCoords + "\"");
		builder.append(" sliderareaart=\"" + sliderAreaArt + "\"");
		builder.append(" background=\"" + background + "\"");
		if(sliderButtons) builder.append(" sliderbuttons=\"\"");
		return builder.toString() + " />";
	}
}
