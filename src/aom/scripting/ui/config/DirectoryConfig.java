package aom.scripting.ui.config;

import aom.scripting.datatypes.string;

/**
 * This class provides an overview of Configs related to specific files and folders.
 * 
 * @note These configs typically require a (re-)start to take effect.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com *
 */
public class DirectoryConfig {
	private DirectoryConfig() {}
	
	/** 
	 * Specifies what anim directory the game will use.
	 */
	public string animDir;
	
	public string copyUpDirectory;

	/** 
	 * Defines the default scenario folder to use for load/save.
	 */
	public string defaultScenarioDir;
	
	/** 
	 * Defines the XML file that contains the wordfilter definitions.
	 * 
	 * Default: prwordlist.xml.
	 */
	public string prFilter;
	
	/**
	 * Defines the autosaved filename layout.
	 */
	public string mpAutoSaveFilenameTemplate;
	
	/** 
	 * Specifies what sound directory the game will use.  
	 */
	public string soundDir;
	
	/**
	 * The XML file that defines the technologies.
	 * 
	 * Default: techtreex.xml
	 */
	public string XmlTechFile;

	/**
	 * The XML file that defines the techtree.
	 * 
	 * Default: uitechtree.xml
	 */
	public string XmlTechTree;
}
