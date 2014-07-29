package aom.scripting.ui;

public class EditBoxGadget extends AbstractGadget {
	public int editBoxMaxChars;
	public boolean editBoxNumericOnly = false;
	public boolean editBoxMaskChars = false;
	public boolean editBoxReadOnly = false;
	public boolean editBoxPrompt = false;
	public boolean editBoxPosIntOnly = false;
	public boolean editBoxAlphaOnly = false;
	public boolean enableIME = false;
	public boolean enterKey = false;
	
	public EditBoxGadget(
		int editBoxMaxChars,
		boolean editBoxNumericOnly,
		boolean editBoxMaskChars,
		boolean editBoxReadOnly,
		boolean editBoxPrompt,
		boolean editBoxPosIntOnly,
		boolean editBoxAlphaOnly,
		boolean enableIME,
		boolean enterKey
	)
	{
		this.editBoxAlphaOnly = editBoxAlphaOnly;
		this.editBoxMaskChars = editBoxMaskChars;
		this.editBoxMaxChars = editBoxMaxChars;
		this.editBoxNumericOnly = editBoxNumericOnly;
		this.editBoxPosIntOnly = editBoxPosIntOnly;
		this.editBoxPrompt = editBoxPrompt;
		this.editBoxReadOnly = editBoxReadOnly;
		this.enableIME = enableIME;
		this.enterKey = enterKey;
	}
}
