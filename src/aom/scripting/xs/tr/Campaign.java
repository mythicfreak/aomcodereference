package aom.scripting.xs.tr;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Trigger commands concerning Campaigns.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Campaign {
	private Campaign() {}
	
	/** Advances the campaign (advance user profile, AND plays the next scenario). */
	public native void trCampaignAdvance();

	/** Advances the user progress through the campaign.(updates user profile only). */
	public native void trCampaignAdvanceProgress();

	/** Plays the current scenario in the campaign. */
	public native void trCampaignPlayCurrent();
	
	/** Generate a yes/no message box. Branches the current scenario. */
	public native void trBranchScenario();
	
	/** Shows the campaign dialog, with the given message. */
	public native void trShowCampaignDlg(string nextCampaign, string message);
}
