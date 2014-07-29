package aom.scripting.eso;

/**
 * This is an interface specifying what functionality the Zone Access Service offers.
 * Most of this functionality is offered by the zoneaccessapi.dll, respectively zoneaccessx.dll file for AoM and AoT.
 * 
 * @see <a href="http://aom.eso.com/ZoneServices/ZoneAccessService.asmx">Zone Access Service</a>
 * @see <a href="http://aom.eso.com/ZoneServices/ZoneAccessService.asmx?wsdl">Zone Access Service WSDL</a>
 * 
 * <p>Typical login sequence:
 * <ol>
 *    <li>Check for <a href="http://aom.zone.com/updatelist_xpack.xml">updates</a></li>
 *    <li>Get <a href="http://configx.aom.eso.com/ConfigUSXpack.aspx">config file</a></li>
 *    <li>Get <a href="http://config2.aom.eso.com/StringTable.aspx?Language=US">string table</a></li>
 *    <li>Get <a href="http://configx.aom.eso.com/MatchSchema.xml">match schema</a></li>
 *    <li>ZoneAccessService.GetConfig</li>
 *    <li>Passport <a href="https://login.passport.com/login2.asp">login</a></li>
 *    <li>ZoneAccessService.GetMasterTicket</li>
 *    <li>ZoneAccessService.ActivateProductKey</li>
 *    <li>ZoneAccessService.GetCDKeyTicket</li>
 *    <li>ZoneAccessService.GetServiceTicket (LegacyAuth)</li>
 *    <li>AccountService.Authenticate</li>
 *    <li>ZoneAccessService.RegisterNickname</li>
 *    <li>Retrieve stats from Stats Server</li>
 *    <li>Get config file (again)</li>
 *    <li>Get <a href="http://config2.aom.eso.com/motdXPack.aspx">message of the day</a></li>
 *    <li>ZoneAccessService.GetServiceTicket (Stats)</li>
 * </ol>
 * </p>
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public interface ZoneAccessService {
	/**
	 * Get A Master Ticket and Multiple Service Tickets (0-N). 
	 * Results will come back in the order 'master', 'service0', ..., 'serviceN'.
	 * 
	 * @note This method is never used by AoM.
	 */
	public GetMasterAndServiceTicketsResponse GetMasterAndServiceTickets(GetMasterAndServiceTicketsRequest request);
	
	/**
	 * Return configuration details about a game title.
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 */
	public XMLBlobResult GetConfig(String gameID);
	
	/**
	 * Get a nickname.
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 * 
	 * @param 	masterTicket
	 *			The master ticket received in a previous call.
 	 * 
	 * @param 	nickname
	 * 			The nickname you wish to register.
	 */
	public StatusCodeResult RegisterNickname(String gameID, String masterTicket, String nickname);
	
	/**
	 * Get a master ticket.
	 * 
	 * @note	This service call requires the from-PP header field returned by the Passport login. 
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 */
	public XMLBlobResult GetMasterTicket(String gameID);
	
	/**
	 * Get a service ticket.
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 * 
	 * @param 	serviceID
	 * 			Either LegacyAuth for use with AccountService, or Stats for use with the StatsServer.
	 * 
	 * @param 	masterTicket
	 * 			The master ticket received in a previous call.
	 */
	public XMLBlobResult GetServiceTicket(String gameID, String serviceID, String masterTicket);
	
	/**
	 * Verifies that a ticket is valid.
	 * This is typically called to check the CD Key tickets of the other players before starting a game. 
	 * 
	 * @param	strTicket
	 * 			The XML code of the Ticket to verify.
	 * 
	 * @param 	strChallenge
	 * 			Base64 encoding of a random byte[24].
	 * 
	 * @param 	strHash
	 * 			An MD5 hash calculated by the get_Signature(challenge, sessionKey) function in zoneaccessapi.dll.
	 * 			I don't know the exact input of the hash function, but assembly code suggests just two (base64?) strings. 
	 * 			
	 * @param 	serviceID
	 * 			The serviceID of the Ticket to verify: Master | CDKey | LegacyAuth | Stats
	 */
	public StatusCodeResult VerifyTicket(String strTicket, String strChallenge, String strHash, String serviceID);
	
	/**
	 * Register a product key.
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 * 
	 * @param 	masterTicket
	 * 			The master ticket received in a previous call.
	 * 
	 * @param 	strDigitalPid
	 * 			base64(HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Microsoft Games\Age of Mythology[ Expansion Pack]\1.0\DigitalProductID)
	 */
	public StatusCodeResult ActivateProductKey(String gameID, String masterTicket, String strDigitalPid);
	
	/**
	 * Get a CDKey Ticket
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 * 
	 * @param 	serviceID
	 * 			Always "CDKey"
	 * 
	 * @param 	masterTicket
	 * 			The master ticket received in a previous call.
	 * 
	 * @param 	strDigitalPid
	 * 			base64(HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Microsoft Games\Age of Mythology[ Expansion Pack]\1.0\DigitalProductID)
	 */
	public XMLBlobResult GetCDKeyTicket(String gameID, String serviceID, String masterTicket, String strDigitalPid);
	
	/**
	 * Begin Create a new passport account.
	 * When you completed this form, you'll have access to a signInName@eso.com passport account.
	 * Note however that this account is not automatically registered with ESO.
	 * You won't be able to sign in to ESO until you activate your account in the AccountService.
	 * 
	 * @note 	This functionality broke a while ago.
	 * 
	 * @param 	gameID
	 * 			Either AOM or AOMX.
	 * 
	 * @param	signInName
	 * 			The name of the new account.
	 * 
	 * @param	password
	 * 			The new password.
	 * 
	 * @param	secretQuestion
	 * 			The secret question in case you forget your password.
	 * 
	 * @param	secretAnswer
	 * 			The answer to the secret question above. 
	 * 
	 * @param 	country
	 * 			Optional.
	 * 
	 * @param 	region
	 * 			Optional.
	 * 
	 * @param 	postalCode
	 * 			Optional.
	 * 
	 * @param 	birthDate
	 * 			Optional.
	 */
	public XMLBlobResult RegisterPassportAccount(String gameID, String signInName, String password, String secretQuestion, String secretAnswer, String country, String region, String postalCode, String birthDate);
	
	/**
	 * A blob of XML code, accompanied by a status code.
	 */
	public class XMLBlobResult {
		public int statusCode;
		public String xmlBlob;
    }
	
	/**
	 * A status code indicating the result of the requested operation. 0 usually means everything went OK.
	 */
	public class StatusCodeResult {
		public int statusCodeField;
    }
	
	public class GetMasterAndServiceTicketsRequest
    {
        public String gameID;
        public String[] serviceIDs;

        public GetMasterAndServiceTicketsRequest()
        {
        }

        public GetMasterAndServiceTicketsRequest(String gameID, String[] serviceIDs)
        {
            this.gameID = gameID;
            this.serviceIDs = serviceIDs;
        }
    }
	
	public class GetMasterAndServiceTicketsResponse
    {
        public XMLBlobResult[] GetMasterAndServiceTicketsResult;

        public GetMasterAndServiceTicketsResponse()
        {
        }

        public GetMasterAndServiceTicketsResponse(XMLBlobResult[] GetMasterAndServiceTicketsResult)
        {
            this.GetMasterAndServiceTicketsResult = GetMasterAndServiceTicketsResult;
        }
    }
}
