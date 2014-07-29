package aom.scripting.xs.kb;

/**
 * This class provides a collection of Actions.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 * 
 * @note In scripts, the names of the variables here are prefixed with "cAction".
 */
public class Action {
	private Action() {}
	
	/** The action of a unit being bored. */
	public final int Bored=0;
	
	/** The action of a unit building other units. */
	public final int Build=1;
	
	/** The action of set animals being converted. */
	public final int Convert=2;
	
	public final int Death=3;
	
	public final int Decay=4;
	
	/** The action of gathering resources from a certain target, e.g. a gold mine. */
	public final int Gather=5;
	
	/** The action of attacking by hand. */
	public final int HandAttack=6;
	
	/** The action of healing units. */
	public final int Heal=7;
	
	/** The action of hunting, i.e. performing the ranged attack. */
	public final int Hunting=8;
	
	/** The action of of idle. */
	public final int Idle=9;
	
	/** The action of a unit <em>always</em> moving, such as in the case of birds. */
	public final int Move=10;
	
	/** The action of a group of units walking. A single unit can also perform this action. */
	public final int MoveByGroup=11;
	
	/** The action of attacking from range. */
	public final int RangedAttack=12;
	
	/** The action of repairing buildings. */
	public final int Repair=13;
	
	/** The action of researching? */
	public final int Research=14;
	
	/** The action of training? */
	public final int Train=15;
	
	public final int OverrideAnimation=16;
	
	public final int Work=17;
	
	public final int Attack=18;
	public final int Unused0=19;
	
	/** 
	 * The action of wandering, e.g. by animals.
	 * Seems similar to Move, but the max wander distance can be set in the proto.
	 */
	public final int Wander=20;
	
	/** The action of entering (i.e. garrisoning) into a building. */
	public final int Enter=21;
	
	/** The action of a.o. herdables being converted. */
	public final int AutoConvert=22;
	
	/** The action of being born. */
	public final int Birth=23;
	
	/** The action of performing an area attack, i.e. by a scarab's death. */
	public final int AreaAttack=24;
	
	/** The action of being frozen by e.g. a Frost Giant. */
	public final int Freeze=25;
	
	/** The action of ???. Freezes the unit animation. */
	public final int Dormant=26;
	
	public final int GatherPoint=27;
	
	/** The action of performing an "attack move". */
	public final int MoveAttack=28;
	
	/** The action of being thrown, e.g. by a Cyclops. */
	public final int Thrown=29;
	
	public final int Lightning=30;
	
	/** The action of passively giving off light. */
	public final int Light=31;
	
	/** The action of performing a jump attack, such as by an Anubite or Amanra. */
	public final int JumpAttack=32;
	
	public final int Unused1=33;
	
	public final int Meteor=34;
	
	public final int Attach=35;
	
	public final int Guide=36;
	
	/** The action of jump move. */
	public final int JumpMove=37;
	
	/** The action of garrisoning the target in itself, as done with relics */
	public final int Pickup=38;
	
	/** The action of performing a "Dive Bomb", the suicide attack of Special Shades. */
	public final int DiveBomb=39;
	
	public final int Unused2=40;
	
	/** The action of regenerating health passively. */
	public final int Regenerate=41;
	
	public final int Use=42;
	
	/** The action of empowering, as dome by Pharaohs and Ra Priests. */
	public final int Empower=43;
	
	/** The action of automatically gathering resource over time, such as herdables. */
	public final int AutoGather=44;
	
	/**
	 * The action of throwing a unit (without picking it up first), as done by the Kraken. 
	 * 
	 * @see #Swallow
	 */
	public final int Throw=45;
	
	/** The action of hurling units in the air, like done by Minotaurs and Ajax. */
	public final int Gore=46;
	
	/** The action of transferring one's inventory to the target unit, as done with relics. */
	public final int Dropoff=47;
	
	/** The action of attacking by creating a whirlwind, as done by Sphinxes, Avengers and Scorpion Men. */
	public final int WhirlwindAttack=48;
	
	/** The action of attacking from range after charging, as done by Centaurs and Manticores. */
	public final int ChargedRangedAttack=49;
	
	/** The action of ejecting garrisoned units. */
	public final int Eject=50;
	
	/** The action of performing a freeze attack, as done by Frost Giants. */
	public final int FreezeAttack=51;
	
	/**
	 * The action of attacking by converting the unit, as done by Lampades.
	 * 
	 * @since AoT
	 */
	public final int ConvertAttack=52;
	
	/** The action of trading as done by Trading Caravans. */
	public final int Trade=53;
	
	/** The action of guarding another target. */
	public final int Guard=54;
	
	public final int AutoMover=55;
	
	public final int GetOnMover=56;
	
	/** The action of picking up a unit and killing it, like a Cyclops does. */
	public final int Swallow=57;
	
	/** The action of opening/closing a gate. */
	public final int Gate=58;
	
	/** The action of attacking by lightning, as done by SoO, Petsochus, etc... */
	public final int LightningAttack=59;
	
	public final int Explore=60;
	
	/** The action of removing resources from the target to gain health. */
	public final int Eat=61;
	
	/** The action of boosting the surrounding units' stats, as done by Arkantos and Einherjars.. */
	public final int Boost=62;
	
	/** The action of a corpse decaying. */
	public final int CorpseDecay=63;
	
	/** The action of teleporting, as formerly done by Sphinxes. */
	public final int Teleport=64;
	
	/** The action of performing a buck attack, as done by Battle Boars. */
	public final int BuckAttack=65;
	
	/** The action of ringing the town bell. */
	public final int TownBell=66;
	
	/** The action of dying and lying on the ground, waiting to be revived. */
	public final int HeroDeath=67;
	
	/**
	 * The action of a building being deconstructed.
	 * 
	 * @since AoT
	 */
	public final int Unbuild=68;
	
	/**
	 * The action of an oracle expanding its LoS.
	 * 
	 * @since AoT
	 */
	public final int AutoLOS=69;
}
