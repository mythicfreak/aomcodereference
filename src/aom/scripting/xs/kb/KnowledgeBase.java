package aom.scripting.xs.kb;

import aom.scripting.datatypes.*;

/**
 * This class provides a collection of KB commands that don't fit in any of the subcategories.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 * 
 * @see <a href="{@docRoot}/AI Reference.xs">AoM Reference</a>
 * @see <a href="{@docRoot}/AI XReference.xs">AoT Reference</a>
 */
public abstract class KnowledgeBase {
	/** 
	 * Knowledge Base echo. 
	 * You'll probably want to use some other echo instead.
	 * 
	 * @see aom.scripting.xs.ai.ArtificialIntelligence#aiEcho(string) aiEcho(string)
	 * @see aom.scripting.xs.tr.Triggers#trEcho(string) trEcho(string)
	 */
	public native void kbEcho(string echoString);
	
	/** Returns whether the game is over or not. */
	public native bool kbIsGameOver();
	
	//hide constructor
	private KnowledgeBase() {}
}
