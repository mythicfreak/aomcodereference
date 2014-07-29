package aom.scripting.taglet;

import java.util.Map;
//requires tools.jar from JDK in build path
import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;

/**
 * This taglet indicates that a command can only be executed in single player mode.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class SinglePlayerTaglet implements Taglet { //TODO tag functions with @single

	@Override
	public String getName() {
		return "single";
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
		return "<DT><B>Single Player Only</B></DT><DD>" + tag.text() + "</DD>\n";
	}

	@Override
	public String toString(Tag[] tags) {
		String result = "";
			for(Tag tag : tags)
				result += toString(tag);
			
			return result;
		}
		
		public static void register(Map<String, Taglet> tagletMap) {
			SinglePlayerTaglet tag = new SinglePlayerTaglet();
			Taglet t = (Taglet) tagletMap.get(tag.getName());
			if (t != null)
				tagletMap.remove(tag.getName());
			tagletMap.put(tag.getName(), tag);
	    }
}
