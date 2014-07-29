package aom.scripting.ui;

public class StateButtonGadget extends AbstractGadget {
	public boolean stateButtonUseInternalStates = true;
	public boolean stateButtonDefaultState = false;
	public StateEntry defaultState;
	public StateEntry clickedState;
	public StateEntry rolloverState;
	public StateEntry unknownState;
	
	public String foreground;
}
