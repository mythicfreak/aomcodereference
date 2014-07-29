package aom.scripting.ui;

public class AbstractGadget {
	/**
	 * The name of this gadget.
	 * It should be unique, so that the parser can unambiguously find it during parsing.
	 */
	public String name;
	
	/**
	 * Defines whether this Gadget is initially hidden or not.
	 * 
	 * @see aom.scripting.ui.console.Gadget#gadgetReal(aom.scripting.datatypes.string)
	 * @see aom.scripting.ui.console.Gadget#gadgetUnreal(aom.scripting.datatypes.string)
	 */
	public boolean hidden = false;
	
	public int z = 0;
	public String tooltipText = "";
	public String mouseOverText = "";
	public String innerText = "";
	public String textFont;
	public int textFontSize;
	public boolean transparent = false;
	public Size1024 size1024, sizerel1024;
	
	public boolean windowZStyle = false;
	public boolean moveable = false;
	public String titlebar;
	public boolean closeButton = false;
	public boolean closeButtonUseAlpha = false; //only used once in chat input
	
	public RgbColor backgroundColor;
	public String background;
	public double backgroundAlpha;
	public boolean tileBackground = false;
	public boolean tileBackgroundHorizontally = false;
	public boolean tileBackgroundVertically = false;
	
	public boolean bevel = false;
	public boolean sunkenBevel = false;
	
	/**
		 | button - bevelinart, beveloutart
		 | checkButton 
		 | colorDropdown 
		 | dialog 
		 | editBox 
		 | gadget 
		 | list 
		 | meshButton 
		 | scrollList - artsize1024
		 | simpleTextBox 
		 | slider 
		 | textBox 
	 */
	
	/**
	a-dtype
	activateondown
	allowdoubleclick
	alphasort: list, palette
	autoclose 
	bannersize: armyBanner
	bevelbutton: button, stateButton, commandPanel
	blockmoderendering
	border1024
	bottomcapart
	buttonsize1024
	centerhoriz
	centervert
	checkbutton: list
	clampbackground
	clampforeground
	closeonesc
	columnorder
	configindex
	context: (help)dialog, xsdebugger
	contextexclusive: dialog, gadget (once)
	cursoralwayson
	datarefreshrate: textBox, formatText
	dialogdefaultbuttonindex
	displayname
	dontautoclose
	donthighlight: button, statebutton, idleBanner, displayPanel, commandPanel, formatText, gadget
	dropdownbuttonart
	dropdowndistance
	dropdownvisitems
	enableime: editBox, textField
	enterkey: editBox, formatText
	fade
	fieldhideoninactive: scrollList
	fieldreadonly: scrollList, textField, colorDropdown
	fieldrequireenter: list, textField
	fieldtextboxcolor: scrollList, textField, formatText, colorDropdown, gadget
	fieldval
	grabinput
	history
	leftcapart
	listactivateonalphajump
	listitemheight
	locktitlebarmove
	maskalpha
	maskcolor
	maskflip
	maskhorizontal
	maskinvert
	maskvertical
	meshscale
	meshyaw
	nodatareplace
	normalcursoralwayson
	outlinecolor
	resizehorz
	resizevert
	rightcapart
	rightcheck
	rightjustify
	scrollhoriz
	scrollvert
	selectedcolor
	showselect
	showvalue
	sound
	text
	textcenterhoriz
	textcentervert
	textcolor
	textjustifyleft
	textjustifyright
	textmarkup
	textscrollbar
	textsimpleaddscrollstobottom
	texturecoords
	texturereplace
	textwrapon: simpleTextBox, formatText, textBox
	timeout
	topcapart
	usebuttonset
	usehyperlinks
	usemask
	verticalbuttons: formatText, dialog, seems deprecated
	wordwrap: simpleTextBox
	 */
}
