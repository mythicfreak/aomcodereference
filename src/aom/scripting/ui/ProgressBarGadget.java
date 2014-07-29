package aom.scripting.ui;

/**
 * This class defines a progress bar gadget.
 * 
 * @note Because the progress itself is hardcoded, you likely can't reuse this component anywhere else. 
 *
 */
public class ProgressBarGadget extends AbstractGadget {
	/**
	 * Defines the background of this progress bar.
	 */
	public String progressBarBackground = "ui\record game progress bar background";
	
	/**
	 * Defines the size of the background.
	 */
	public Size1024 progressBarBackgroundSize = new Size1024(-1, -1, 151, 16);
	
	/**
	 * Defines the texture of the mask that indicates the progress.
	 */
	public String progressBarMask = "ui\record game progress bar filler";

	/**
	 * Creates a new progress bar with default properties.
	 */
	public ProgressBarGadget() {}
	
	/**
	 * Creates a new progress bar with the given properties.
	 */
	public ProgressBarGadget(String background, Size1024 backgroundSize, String mask)
	{
		this.progressBarBackground = background;
		this.progressBarBackgroundSize = backgroundSize;
		this.progressBarMask = mask;
	}
}
