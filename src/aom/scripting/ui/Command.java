package aom.scripting.ui;

/**
 * This element encapsulates a Console Command.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Command {
	public String consoleCommand;
	
	public Command(String consoleCommand)
	{
		this.consoleCommand = consoleCommand;
	}
	
	@Override
	public String toString()
	{
		return "<command>" + consoleCommand + "</command>";
	}
}
