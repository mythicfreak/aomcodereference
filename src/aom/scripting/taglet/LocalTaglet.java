package aom.scripting.taglet;

import java.util.Map;
//requires tools.jar from JDK in build path
import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;

/**
 * This taglet indicates that a command is only executed locally, instead of automatically synchronized.
 * It is the opposite of the SyncTaglet. 
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class LocalTaglet implements Taglet { //TODO tag functions with @local (console package done)

	@Override
	public String getName() {
		return "local";
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
		return "<DT><B>Local Call</B></DT><DD>" + tag.text() + "</DD>\n";
	}

	@Override
	public String toString(Tag[] tags) {
		String result = "";
		for(Tag tag : tags)
			result += toString(tag);
		
		return result;
	}
	
	public static void register(Map<String, Taglet> tagletMap) {
		LocalTaglet tag = new LocalTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }
}
