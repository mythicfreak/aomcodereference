package aom.scripting.xs.xs;

import aom.scripting.datatypes.string;

/**
 * This class provides a collection of XS commands concerning Rules.
 * A rule is basically a function without return type or parameters 
 * that is automatically called again after a preset time has elapsed.
 * 
 * A rule definition typically looks like this:
 * <pre>
rule &lt;my_rule_name&gt;
   &lt;active | inactive&gt;
   [minInterval &lt;int (in seconds)&gt;]
   [maxInterval &lt;int (in seconds)&gt;]
   [group &lt;my_group&gt;]
   [runImmediately]
   [highFrequency]
   [priority &lt;xx&gt;]
{
	//rule body
}
</pre>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Rule {
	/**
	 * Holds the activation time of the current rule in seconds.
	 */
	public final int cActivationTime;
	
	/** Disables the given rule.  */
	public native void xsDisableRule(string ruleName);
	/** Disables the current rule.  */
	public native void xsDisableSelf();
	/** Enables the given rule.  */
	public native void xsEnableRule( string ruleName );
	/** Sets the priority of the given rule.  */
	public native void xsSetRulePriority( string ruleName, int priority );
	/** Sets the priority of the current rule.  */
	public native void xsSetRulePrioritySelf( int priority );
	/** Sets the min interval of the given rule.  */
	public native void xsSetRuleMinInterval( string ruleName, int interval );
	/** Sets the min interval of the current rule.  */
	public native void xsSetRuleMinIntervalSelf( int interval );
	/** Sets the max interval of the given rule.  */
	public native void xsSetRuleMaxInterval( string ruleName, int interval );
	/** Sets the max interval of the current rule.  */
	public native void xsSetRuleMaxIntervalSelf( int interval );
	/** Enables all rule in the given rule group.  */
	public native void xsEnableRuleGroup( string ruleGroupName );
	/** Disables all rules in the given rule group.  */
	public native void xsDisableRuleGroup( string ruleGroupName );
	
	private Rule() {
		cActivationTime = 0;
	}
}
