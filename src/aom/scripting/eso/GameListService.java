package aom.scripting.eso;

/**
 * This is an interface specifying what functionality the GameList Service offers.
 * Note that this is just an abstraction, the GameList Service is SOAP-based and thus works with XML in- and output.
 * 
 * The actual location of the GameList Service for AoM, respectively AoT is:
 * <tt><ul>
 *    <li>http://games1.aom.eso.com/WebServices/GameListService.asmx</li>
 *    <li>http://games1.aom.eso.com/AomXServices/GameListService.asmx</li>
 * </ul></tt>
 * Note that you can't contact them directly through your browser, but they are certainly there!
 * Unfortunately this means we can't retrieve the WSDL either, so programming a client must be done manually.
 * 
 * You will notice that class does not contain any IP addresses to actually enable players to join the game. 
 * This process is in fact handled by the friends server, which takes the player's name as input.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public interface GameListService {
	/**
	 * Retrieves a list of games currently hosted on ESO.
	 * 
	 * Namespace: http://ensemblestudios.com/GameListService/RetrieveGames
	 * 
	 * @param 	Offset
	 * @param 	Amount
	 * @param 	SortColumn
	 * @param 	Descending
	 * @param 	filterSettings
	 * @param 	PreferPlayers
	 * @param 	ExcludePlayers
	 */
	public SimpleGameList RetrieveGames(int Offset, int Amount, String SortColumn, boolean Descending, KeyValuePair[] filterSettings, String[] PreferPlayers, String[] ExcludePlayers);
	
	/**
	 * Inserts a new game in the list. The gameID of this new game is ignored.
	 * 
	 * Namespace: http://ensemblestudios.com/GameListService/InsertGame
	 * 
	 * @return The new gameID representing this game.
	 */
	public String InsertGame(Game UpdatedGame);
	
	/**
	 * Replaces a game (with the same gameID) published earlier with this updatedGame.
	 * 
	 * Namespace: http://ensemblestudios.com/GameListService/UpdateGame
	 */
	public void UpdateGame(Game UpdatedGame);
	
	/**
	 * Deletes a game from the list with the given gameID.
	 * 
	 * Namespace: http://ensemblestudios.com/GameListService/DeleteGame
	 */
	public void DeleteGame(String GameID);
	
	/**
	 * I honestly have no clue what this does. AoM does not seem to use it either.
	 * 
	 * Namespace: http://ensemblestudios.com/GameListService/FakeCounter
	 */
	public void FakeCounter(String CounterName);
	
	/**
	 * This class represents a game, defined by Key-Value Pairs storing the game settings.
	 */
	public class Game
    {
        public KeyValuePair[] KVP;
        public String GameId;
        public String GameName;
    }
	
	/**
	 * This class represents a key-value pair.
	 * 
	 *  These are the mappings used by AoM to store game data:
	 *  <ol start="0">
	 *  	<li>string[] PlayerList</li>
	 *  	<li>string GameName</li>
	 *  	<li>int NumGamePlayers</li>
	 *  	<li>string ChatChannelName</li>
	 *  	<li>int TeamConfiguration</li>
	 *  	<li>int MapSize //0=normal, 1=large</li>
	 *  	<li>int GameType //0=sup, 1=conquest, 2=lightning, 3=dm, 4=restore, 5=custom</li>
	 *  	<li>int Handicap //0=none, 1=free, 2=fair</li>
	 *  	<li>string MapType</li>
	 *  	<li>bool Visibility //true = revealed</li>
	 *  	<li>int WorldResources //There used to be scarce, abundant, etc. resouces options, now irrelevant.</li>
	 *  	<li>bool TeamSharedResources</li>
	 *  	<li>bool TeamSharedPopulation</li>
	 *  	<li>bool LockedTeams</li>
	 *  	<li>bool AllowCheats</li>
	 *  	<li>bool RecordGame</li>
	 *  	<li>bool CoOpGame</li>
	 *  	<li>int RestrictPauses //num pauses</li>
	 *  	<li>int ServerPing</li>
	 *  	<li>int AverageRating</li>
	 *  	<li>bool PreferLanguage</li>
	 *  	<li>int LanguageRegion</li>
	 *  	<li>int MachineSpec</li>
	 *  	<li>bool IsMapSet</li>
	 *  </ol>
	 *  
	 *  @note Boolean values are represented by 1 or 0 on request, but True or False on response.
	 */
	public class KeyValuePair
    {
        public String K;
        public String V;
    }
	
	/**
	 * This class represents a list of games, including the total game count. 
	 */
	public class SimpleGameList
    {
        public int PublishedGameCount;
        public Game[] Games;
    }
}