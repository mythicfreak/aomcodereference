package aom.scripting.taglet;

import java.util.Map;
import aom.scripting.datatypes.*;
//requires tools.jar from JDK in build path
import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;

/**
 * <p>
 * This taglet indicates that a command is automatically synchronized with the other players, instead of only executed locally.
 * If this is not the case and the command is only executed locally, the game will go Out of Sync.
 * </p>
 * 
 * <p>
 * For example the trigger command <code>{@link aom.scripting.xs.tr.Triggers#trTechInvokeGodPower(int, string, vector, vector)}</code> invokes a GP, but only locally.
 * If this trigger command is only executed by 1 player and not by the others, 
 * an OoS error will occur.
 * </p>
 * 
 * <p>
 * On the other hand, the console command <code>{@link aom.scripting.ui.console.Unit#trainInSelected(string, int)}</code>
 * - even though only issued locally - will automatically be sent to 
 * the other players in the game. They will also execute the command in their game
 * and synchronized is guaranteed. 
 * </p>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SyncTaglet implements Taglet { //TODO tag functions with @sync (console package done)

	@Override
	public String getName() {
		return "sync";
	}

	@Override
	public boolean inConstructor() {
		return false;
	}

	@Override
	public boolean inField() {
		return false;
	}

	@Override
	public boolean inMethod() {
		return true;
	}

	@Override
	public boolean inOverview() {
		return false;
	}

	@Override
	public boolean inPackage() {
		return false;
	}

	@Override
	public boolean inType() {
		return true;
	}

	@Override
	public boolean isInlineTag() {
		return false;
	}

	@Override
	public String toString(Tag tag) {
		return "<DT><B>Auto Syncs</B></DT><DD>" + tag.text() + "</DD>\n";
	}

	@Override
	public String toString(Tag[] tags) {
		String result = "";
		for(Tag tag : tags)
			result += toString(tag);
		
		return result;
	}
	
	public static void register(Map<String, Taglet> tagletMap) {
		SyncTaglet tag = new SyncTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }
}
