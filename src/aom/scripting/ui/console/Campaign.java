package aom.scripting.ui.console;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Campaigns.
 * 
 * @local Campaign commands are all local.
 * 
 * @single Campaign commands are all intended for Single Player only.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Campaign {
	private Campaign() {}
	
	/** Loads the campaign game browser.*/
	public native void uiSaveCampaignGameBrowser();
	
	/** Shows a campaign dialog. */
	public native void showCampaignDialog(string name, string msg);
	
	/** Create a new cpn/cpx file.*/
	public native void campaignCreate();

	/** Add a scenario to the campaign.*/
	public native void campaignAddScenario();

	/** Delete a scenario from the campaign.*/
	public native void campaignDelScenario();

	/** Save a campaign.*/
	public native void campaignSave();

	/** Start a campaign.*/
	public native void campaignStart();

	/** Save the current campaign.*/
	public native void campaignSaveCurrent();

	/** Advance to the next campaign.*/
	public native void campaignAdvance();

	/** Play the current campaign.*/
	public native void campaignPlayCurrent();

	/** Quit the current campaign.*/
	public native void campaignOuit();

	/** Resume the current campaign.*/
	public native void campaignResume();

	/** Reset the current campaign scenario.*/
	public native void campaignResetCurScenario();

	/** Used by the UI.*/
	public native void campaignSetHackyLoadScenarioMode(int mode);

}
