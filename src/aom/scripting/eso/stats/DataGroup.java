package aom.scripting.eso.stats;

/**
 * A list of Data Groups to which an entity can belong. 
 */
public enum DataGroup
{
	/**
	 * God Powers
	 */
    ZS_GP,
    
    /**
     * Military Units
     */
    ZS_MU,
    
    /**
     * Economic Units
     */
    ZS_EU,
    
    /**
     * Myth Units
     */
    ZS_MyU,
    
    /**
     * Friends, use this in combination with GameMode.ZS_PersistentStats. 
     */
    ZS_Friends
}