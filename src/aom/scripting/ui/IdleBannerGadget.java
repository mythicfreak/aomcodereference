package aom.scripting.ui;

import aom.scripting.xs.kb.UnitType;

/**
 * Represents an in-game idle banner used to locate certain types of idle units.
 * 
 * @note The objectives banner is also an idle banner.
 */
public class IdleBannerGadget extends AbstractGadget {
	/**
	 * Indicates the texture that will be used to display this banner.
	 */
	public String bannerproto; // = "UI Idle Villager Banner"
	
	/**
	 * Indicates the unit type this idle banner will represent.
	 */
	public UnitType idleType;
	
	/**
	 * Indicates that this banner should only be shown when there are idle units.
	 */
	public boolean shownOnIdle = false;
	
	/**
	 * Creates a new idle banner with given properties.
	 */
	public IdleBannerGadget(String proto, UnitType type, boolean shownOnIdle)
	{
		this.bannerproto = proto;
		this.idleType = type;
		this.shownOnIdle = shownOnIdle;
	}
}
