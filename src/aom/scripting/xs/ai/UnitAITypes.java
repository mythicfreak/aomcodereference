package aom.scripting.xs.ai;

/**
 * <p>
 * Unit AI Types are a collection of flags that define how the low level AI handles unit interactions.
 * It's quite a primitive yet powerful system. However, certain proto flags tend to override this behavior.
 * </p>
 * 
 * <p>
 * The format is as follows:
 * <pre>
 *  Type "Name of type" (this will be the name you use in proto)
 *  [A collection of flags from the list below, 1 per line.]
 * </pre>
 * </p>
 * 
 * <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>.
 *  
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public enum UnitAITypes {
	/**
	 * If followed by a unit type: turns "can attack" ON for "Unit Type".<br />
	 * Else: turns "can attack" ON for every type.
	 */
	Attack,
	
	/**
	 * If followed by a unit type: turns "can attack" OFF for "Unit Type".<br />
	 * Else: turns "can attack" OFF for every type.
	 */
	NoAttack,    
	
	/**
	 * If followed by a unit type: turns "auto attack" ON for "Unit Type".<br />
	 * Else: turns "auto attack" ON for every type.
	 */
	AutoAttack,       
	
	/**
	 * If followed by a unit type: turns "auto attack" OFF for "Unit Type".<br />
	 * Else: turns "auto attack" OFF for every type.
	 */
	NoAutoAttack,   
	
	/**
	 * If followed by a unit type: turns "attack response" ON for "Unit Type".<br />
	 * Else: turns "attack response" ON for every type.	
	 */
	RespondToAttack,        
	
	/**
	 * If followed by a unit type: turns "attack response" OFF for "Unit Type".<br />
	 * Else: turns "attack response" OFF for every type.	
	 */
	NoRespondToAttack,
	
	/**
	 * Restricts these units from running away when they cannot return an attack.
	 */
	NoRunAway;                     
}
