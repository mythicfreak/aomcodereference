package aom.scripting.taglet;

import java.util.Map;
//requires tools.jar from JDK in build path
import com.sun.javadoc.Tag;
import com.sun.tools.doclets.Taglet;

/**
 * This taglet indicates that a command can only be executed in Editor Mode.
 * 
 * @local 	These commands are also local by default.
 * 
 * @single 	These commands are obviously meant for single player purposes only,
 * 			but with a mode switch to editor mode, one can sometimes still execute these in multiplayer.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class EditorTaglet implements Taglet
{
	@Override
	public String getName() {
		return "editor";
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
		return "<DT><B>Editor Mode Only</B></DT><DD>" + tag.text() + "</DD>\n";
	}

	@Override
	public String toString(Tag[] tags) {
		String result = "";
		for(Tag tag : tags)
			result += toString(tag);
		
		return result;
	}
	
	public static void register(Map<String, Taglet> tagletMap) {
		EditorTaglet tag = new EditorTaglet();
		Taglet t = (Taglet) tagletMap.get(tag.getName());
		if (t != null)
			tagletMap.remove(tag.getName());
		tagletMap.put(tag.getName(), tag);
    }
}
