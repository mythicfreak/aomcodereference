package aom.scripting.ui;

/**
 * This class represents the 9 in-game army banners available to form groups.
 */
public class ArmyBanner {
	public Size1024 bannerSize = new Size1024(-1, 32, 30, 64);
	
	/**
	 * Creates a new set of army banners with given size.
	 * 
	 * @note There can only be 1 gadget of this kind.
	 */
	public ArmyBanner(Size1024 size)
	{
		this.bannerSize = size;
	}
}
