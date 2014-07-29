package aom.scripting.eso;

/**
 * This is an interface specifying what functionality the MatchMaking Service offers.
 * Note that this is just an abstraction, the MatchMaking Service is SOAP-based and thus works with XML in- and output.
 * 
 * The actual location of the MatchMaking Service for AoM, respectively AoT is:
 * <ul>
 *    <li>http://match1.aom.eso.com/WebServices/MatchService.asmx</li>
 *    <li>http://match1.aom.eso.com/AomXServices/MatchService.asmx</li>
 * </ul>
 * Note that you can't contact them directly through your browser, but they are certainly there!
 * Unfortunately this means we can't retrieve the WSDL either, so programming a client must be done manually.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public interface MatchMakingService {
	
	/**
	 * When you press the START button on ESO, this RequestMatch function is called first.
	 * 
	 * @param 		HashCodeList
	 * 				Comma separated list of Partition Names (integers).
	 * 
	 * @return		Array of MatchRecords.
	 */
	public MatchRecord[] RequestMatch(String HashCodeList);
	
	/**
	 * For every time the settings get broadened, a FindMatch query is issued.
	 * 
	 * @param PartitionName
	 * @param 		CurrentPlayerCount
	 * 				Number of players currently gathered.
	 * 
	 * @param 		TotalPlayerCount
	 * 				Total number of players to be found.
	 * 				Use -1 for ?-vs-? searches.
	 * 
	 * @param 		NetworkAddress
	 * 				The IP addresses and ports to reach this client on.
	 * 
	 * @param 		RequestID
	 * 				A unique request ID, consisting of the computer name and a random component.
	 * 
	 * @param 		ContinuousMatchConditionValues
	 * 				An array of ContinuousValueParameters.
	 * 				
	 * @param 		ComputerName
	 * 				Local computer name.
	 * 
	 * @param 		PlayerList
	 * 				Array of players grouped together.
	 * 
	 * @param 		PlayerExcludeList
	 * 				Array of (pested) players to exclude.
	 * 
	 * @param 		PlayerPreferList
	 * 				Array of prefered players to include.
	 */
	public FindMatchResponse FindMatch(
        long PartitionName, 
        int CurrentPlayerCount, 
        int TotalPlayerCount, 
        String NetworkAddress, 
        String RequestID,
        ContinuousValueParameter[] ContinuousMatchConditionValues, 
        String ComputerName,
        String[] PlayerList,
        String[] PlayerExcludeList,
        String[] PlayerPreferList
    );
	
	/**
	 * Cancels the current session.
	 * 
	 * @param PartitionName
	 * @param RequestID
	 */
	public void CancelHostSession(long PartitionName, String RequestID);
	
	/**
	 * The Response to a Find Match Request. 
	 */
	public class FindMatchResponse
    {
		/**
		 * Is this player the host of the session?
		 */
		 boolean IsHost;
		 
		 /**
		  * Total number of players to be found.
		  * Note that this parameter is also included as request parameter.
		  */
		 int TotalPlayerCount;
		 
		 /**
		  * Number players found, minus 1 (self).
		  */
		 int PeerPlayerCount;
		 
		 /**
		  * Connection details of peers.
		  */
		 String PeerNetworkAddress;
    }
	
	/**
	 * This class represents a continuous range of rating values.
	 * This range constitutes the search interval. 
	 */
	public class ContinuousValueParameter
    {
		/**
		 * The approximate rating to look for.
		 * Typically the current player's rating. 
		 */
        public int Value;
        
        /**
         * The maximum range to deviate from the value above.
         * Starts at 50 and grows with every consecutive broadening. 
         */
        public int Range;
    }
	
	public class MatchRecord
    {
        public long HashCode;
        public int StartTimeAverage;
        public boolean StartTimeAverageSet;
        public int PendingRequestCount;
    }
}
