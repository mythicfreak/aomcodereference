package aom.scripting.ui.config; 

import aom.scripting.datatypes.string;
/**
 * <p>
 *    This package provides a collection of Console commands concerning Configs, 
 *    combined with a list of all known ones. The configs are split across multiple classes, 
 *    each representing a specific subcategory.
 * </p>
 * 
 * <p>
 * The types (int, bool, string, ...) of the configs listed here are mainly assigned using my "gut feeling", 
 * so there will probably be a couple of mistakes. If you spot an error please e-mail me the correct type.
 * </p>
 * 
 * <p>
 * To view a complete list of currently defined configs use the console command <code>{@link #configDump()}</code>.
 * </p>
 * 
 * <p>
 * <b>Using configs</b>
 * <ul>
 * <li>Enabling a boolean config: use <code>{@link #configDef(string)}</code> or <code>+configName</code> in a .cfg file.</li>
 * <li>Disabling a boolean config: use <code>{@link #configUndef(string)}</code> or <code>-configName</code> in a .cfg file.</li>
 * <li>
 * 		Assigning another value to a config: use
 * 		{@link #configSet(string, string)},
 * 		{@link #configSetInt(string, int)}, 
 * 		{@link #configSetFloat(string, float)}
 * 		or <code>configName newValue</code> in a .cfg file.
 * </li>
 * </ul>
 * </p>
 * 
 * @note <p>Enabling is the default action when a boolean config is found without a sign.</p>
 * @note <p>Quotes around strings are not required if that string does not contain spaces.</p>
 * @note <p>Configs are not case sensitive.</p>
 * @note <p>There's still plenty of configs that we don't quite understand, and even more that simply won't work anymore.</p>
 * 
 * @local 	Config settings are local only.
 * 			Configs that directly impact gameplay (like {@link GameConfig#marketCostMin})
 * 			will typically be locked in order to prevent cheating.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Config {
	private Config() {}
	
	/** Sends to output a list of all current configuration variables.*/
	public native void configDump();

	/** Sets a particular configuration variable to a string value.*/
	public native void configSet(string name, string value);

	/** Sets a configuration variable to an int value.*/
	public native void configSetInt(string name, int value);

	/** Sets a configuration variable to a floating point value.*/
	public native void configSetFloat(string name, float value);

	/** Defines or enabled a configuration variable, i.e. +config in a *.cfg file. */
	public native void configDef(string name);

	/** Disables a configuration variable, i.e. -config in a *.cfg file. */
	public native void configUndef(string name);

	/** Defined variable becomes undefined, and vice versa.*/
	public native void configToggle(string name);

	/** Changes configuration state just like a line in the *.cfg files.*/
	public native void config(string token);

	/** Look up configuration by enumeration ID. Note that an ID out of the array bounds will cause AoM to crash.*/
	public native void configGetByID(int value);

	/** Show all formally defined configuration variables that contain the filter string, or use no parameters for a full list.*/
	public native void configHelp(string symbolFilter);

	/** Show all formally defined configuration variables that start with the filter string, or use no parameters for a full list.*/
	public native void configHelpPrefix(string symbolFilter);
	
	/** 
	 * The global unique id of the current profile,
	 * generated during installation.
	 */
	public string playerGuid;
	
	/** 
	 * Name for player profile.
	 */
	public string playerProfileName;

	public float requiredBuildVersion;

	public string machineName;
}