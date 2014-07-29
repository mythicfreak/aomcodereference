package aom.scripting.eso;

/**
 * This is an interface specifying what functionality the Account Service offers.
 * Actually, most of the authentication and authorization logic is handled by the Passport login and ZoneAccessService.
 * This is just a legacy system, but it is still an important link in the login chain!
 *  
 * Note that this is just an abstraction, the Account Service is SOAP-based and thus works with XML in- and output.
 * 
 * The actual location of the Account Service for AoM, respectively AoT is:
 * <tt><ul>
 *    <li>http://auth1.aom.eso.com/Webservices/AccountService.asmx</li>
 *    <li>http://auth1.aom.eso.com/AomXServices/AccountService.asmx</li>
 * </ul></tt>
 * Note that you can't contact them directly through your browser, but they are certainly there!
 * Unfortunately this means we can't retrieve the WSDL either, so programming a client must be done manually.
 * 
 * NameSpace: http://zone.msn.com/AccountService (no trailing slash)
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public interface AccountService {
	/**
	 * This method authenticates users trying to log in to ESO.
	 *  
	 * Namespace: http://zone.msn.com/AccountService/Authenticate
	 * 
	 * @param 	Ticket
	 * 			A Ticket containing an IV and EncryptedText field. 
	 * 			Should be retrieved from the Zone Access Service using the GetServiceTicket call, 
	 * 			with serviceID = "LegacyAuth".
	 * 
	 * @param 	AccountName
	 * 			Your ESO Account Name.
	 * 
	 * @param 	Password
	 * 			The password is in the following format: AccountName@eso.com.
	 * 			The actual password is not needed, authorization is done by the Zone Access Service.
	 * 
	 * @param 	Data
	 * 			4 (random?) integers
	 */
	public AuthenticateResponse Authenticate(String Ticket, String AccountName, String Password, int[] Data);
	
	/**
	 * This is the second stage in the Create Account procedure.
	 * When you made your passport account with the ZoneAccessService, you can link it to ESO here.
	 * 
	 * Namespace: http://zone.msn.com/AccountService/CreateAccount
	 * 
	 * @note	ESO account creation broke a while ago. 
	 * 			The ZoneAccessService part in particular stopped working, rendering this method useless.
	 * 
	 * @param 	Ticket
	 * 			A Ticket containing an IV and EncryptedText field. 
	 * 			Should be retrieved from the Zone Access Service using the GetServiceTicket call, 
	 * 			with serviceID = "LegacyAuth" (?).
	 * 
	 * @param 	AccountName
	 * 			Your ESO Account Name.
	 * 
	 * @param 	Password
	 * 			The ESO Account Password.
	 * 
	 * @param 	EmailAddress
	 * 			
	 * @return 	The ID of the new account.
	 */
	public int CreateAccount(String Ticket, String AccountName, String Password, String EmailAddress);
	
	/**
	 * The response data from an authentication request.
	 */
	public class AuthenticateResponse
    {
		/**
		 * The internal ID of your ESO account.
		 * Other IDs used in ZoneAccessService don't seem to match this value.
		 */
        public int AccountID;
        
        /**
         * The default format of your account name (i.e. with correct capitalization).
         */
        public String CanonicalAccountName;
        
        /**
         * The same value as AccountID, but now in hexadecimal.
         */
        public String AccountIDHex;
        
        /**
         * I assume this Passkey is used later on to encrypt chat messages.
         */
        public String Passkey;
        
        /**
         * Always shows false, even though all accounts do have an associated account@eso.com e-mail address.
         */
        public boolean HasEmail;
    }
}
