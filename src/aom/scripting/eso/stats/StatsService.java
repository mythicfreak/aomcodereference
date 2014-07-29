package aom.scripting.eso.stats;

import org.w3c.dom.Document;

/**
 * This is an interface specifying what functionality the stat server offers related to retrieving certain data.
 * Note that this is just an abstraction, the stat server works with XML in- and output to accomplish these tasks.
 * 
 * The actual location of the stat server for AoM, respectively AoT is:
 * <tt><ul>
 *    <li>http://stats2.aom.eso.com/AOM_RC0/query/query.aspx?&lt;?xml version="1.0" encoding="utf-16"?&gt;&lt;clr&gt;&lt;cmd v='query'/&gt;&lt;co g='AOM_RC0' s='100' /&gt;&lt;myQueryXml /&gt;&lt;/clr&gt;</li>
 *    <li>http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?&lt;?xml version="1.0" encoding="utf-16"?&gt;&lt;clr&gt;&lt;cmd v='query'/&gt;&lt;co g='AOM_XPACK' s='100' /&gt;&lt;myQueryXml /&gt;&lt;/clr&gt;</li>
 * </ul></tt>
 * 
 * Query specific XML should be inserted where the &lt;myQueryXml /&gt; template is shown. 
 * 
 * @see <a href="../../../../eso.dtd">Detailed Query Format in DTD</a>
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public interface StatsService {
	/**
	 * Game Details Query. Returns an XML document containing detailed statistics about the specified game.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	gi
	 * 			Required. The ID of the game to retrieve info for.
	 * 			These IDs can be found in getGames() queries.
	 * 
	 * @example	&lt;qgs gi="xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx" /&gt;
	 */
	public Document qgs(String id, String gi);
	
	/**
	 * Recent Games Query. Returns an XML document containing a list of recent games matching the given criteria.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	en
	 * 			Optional. The Entity Name (i.e. Player Name) to retrieve games from.
	 * 			If no name is provided, games of all players will be retrieved. 
	 * 
	 * @param 	et
	 * 			Optional. The Entity Type of the player to retrieve games from.
	 * 			If no type is provided, games of all player types will be retrieved.
	 * 
	 * @param 	md
	 * 			Optional. The Game Mode of the games to be retrieved.
	 * 			If no mode is provided, games of all modes will be retrieved.
	 * 
	 * @param 	fe
	 * 			The First Index: this is sort of an offset to enable retrieving paginated results.
	 * 			Defaults to 0. 0 <= fe <= 1000
	 * 
	 * @param 	me
	 * 			The Max number of Entries - starting from the First Index - to be retrieved.
	 * 			Defaults to 1000. 0 <= me <= 1000
	 * 
	 * @example	<a href="http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?%3C?xml%20version='1.0'%20encoding='utf-16'?%3E%3Cclr%3E%3Cco%20g='AOM_XPACK'%20s='100'%20/%3E%3Cqsg%20/%3E%3C/clr%3E">&lt;qsg /&gt;</a>
	 */
	public Document qsg(String id, String en, EntityType et, GameMode md, int fe, int me);
	
	/**
	 * Player Info Query. Returns an XML document containing detailed statistics about the specified player.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	en
	 * 			Optional. The Entity Name (i.e. Player Name) to retrieve info for.
	 * 			If no name is provided, community statistics will be retrieved. 
	 * 
	 * @param 	et
	 * 			Required. The Entity Type of the given player.
	 * 
	 * @param 	md
	 * 			Required. The Game Mode for which the info should be retrieved.
	 * 
	 * @param 	tp
	 * 			Required. The Time Period for which the info should be retrieved.
	 * 
	 * @param 	si
	 * 			Optional. Unknown integer.
	 * 
	 * @example	<a href="http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?%3C?xml%20version='1.0'%20encoding='utf-16'?%3E%3Cclr%3E%3Cco%20g='AOM_XPACK'%20s='100'%20/%3E%3Cqest%20et='ZS_Human'%20md='ZS_Supremacy'%20tp='ZS_AllTime'%20/%3E%3C/clr%3E">&lt;qest et="ZS_Human" md="ZS_Supremacy" tp="ZS_AllTime" /&gt;</a>
	 */
	public Document qest(String id, String en, EntityType et, GameMode md, TimePeriod tp, int si);
	
	/**
	 * Player Rank Query. Returns an XML document containing the rank of the given player, and optionally those near him on the ladder.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	en
	 * 			Optional. The Entity Name (i.e. Player Name) to retrieve the rank for.
	 * 			If no name is provided, players at the top of the ladder will be retrieved. 
	 * 
	 * @param 	et
	 * 			Required. The Entity Type of the given player.
	 * 
	 * @param 	md
	 * 			Required. The Game Mode for which the player rank should be retrieved.
	 * 
	 * @param 	tp
	 * 			Required. The Time Period for which the player rank should be retrieved.
	 * 
	 * @param 	si
	 * 			Optional. Unknown integer.
	 * 
	 * @param 	np
	 * 			Required. Number of Previous players - just above the specified player - to retrieve.
	 * 			0 <= np <= 1000
	 * 
	 * @param 	nn
	 * 			Required. Number of Next players - just under the specified player - to retrieve.
	 * 			0 <= nn <= 1000
	 * 
	 * @param 	rn
	 * 			Required. The Ranktable Name to retrieve the ranks from.
	 * 
	 * @example	<a href="http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?%3C?xml%20version='1.0'%20encoding='utf-16'?%3E%3Cclr%3E%3Cco%20g='AOM_XPACK'%20s='100'%20/%3E%3Cqer%20et='ZS_Human'%20md='ZS_Supremacy'%20tp='ZS_AllTime'%20np='0'%20nn='20'%20rn='ZS_TopPlayers'%20/%3E%3C/clr%3E">&lt;qer et="ZS_Human" md="ZS_Supremacy" tp="ZS_AllTime" np="0" nn="20" rn="ZS_TopPlayers" /&gt;</a>
	 */
	public Document qer(String id, String en, EntityType et, GameMode md, TimePeriod tp, int si, int np, int nn, RanktableName rn);
	
	/**
	 * Player Search Query. Returns an XML document containing player names that all start with the provided search query.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	en
	 * 			Required. The first letters of the Entity Name (i.e. Player Name) to search for.
	 * 
	 * @param 	et
	 * 			Required. The Entity Type of the given player.
	 * 
	 * @param 	fe
	 * 			The First Index: this is sort of an offset to enable retrieving paginated results.
	 * 			Defaults to 0. 0 <= fe <= 1000
	 * 
	 * @param 	me
	 * 			The Max number of Entries - starting from the First Index - to be retrieved.
	 * 			Defaults to 1000. 0 <= me <= 1000
	 * 
	 * @example	<a href="http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?%3C?xml%20version='1.0'%20encoding='utf-16'?%3E%3Cclr%3E%3Cco%20g='AOM_XPACK'%20s='100'%20/%3E%3Cqse%20en='DoD_'%20et='ZS_Human'%20/%3E%3C/clr%3E">&lt;qse en="DoD_" et="ZS_Human" /&gt;</a>
	 */
	public Document qse(String id, String en, EntityType et, int fe, int me);
	
	/**
	 * Player Units Query. Returns an XML document containing detailed unit statistics of the specified player.
	 * 
	 * @param 	id
	 * 			Optional. A query ID, in case more queries are included in 1 request.
	 * 			This ID is replicated in the response element matching this query. 
	 * 			Query IDs need not be unique.
	 * 
	 * @param 	en
	 * 			Optional. The Entity Name (i.e. Player Name) to retrieve unit data for.
	 * 			If no name is provided, community statistics will be retrieved. 
	 * 
	 * @param 	et
	 * 			Required. The Entity Type of the given player.
	 * 
	 * @param 	md
	 * 			Required. The Game Mode for which the unit info should be retrieved.
	 * 
	 * @param 	tp
	 * 			Required. The Time Period for which the unit info should be retrieved.
	 * 
	 * @param 	fe
	 * 			The First Index: this is sort of an offset to enable retrieving paginated results.
	 * 			Defaults to 0. 0 <= fe <= 1000
	 * 
	 * @param 	me
	 * 			The Max number of Entries - starting from the First Index - to be retrieved.
	 * 			Defaults to 1000. 0 <= me <= 1000
	 * 
	 * @param 	dg
	 * 			Required. The Data Group to which the returned units should belong.
	 * 
	 * @example	<a href="http://stats2.aom.eso.com/AOM_XPACK/query/query.aspx?%3C?xml%20version='1.0'%20encoding='utf-16'?%3E%3Cclr%3E%3Cco%20g='AOM_XPACK'%20s='100'%20/%3E%3Cqed%20et='ZS_Human'%20md='ZS_Supremacy'%20tp='ZS_AllTime'%20dg='ZS_MyU'%20/%3E%3C/clr%3E">&lt;qed et="ZS_Human" md="ZS_Supremacy" tp="ZS_AllTime" dg="ZS_MyU" /&gt;</a>
	 */
	public Document qed(String id, String en, EntityType et, GameMode md, TimePeriod tp, int fe, int me, DataGroup dg);
}