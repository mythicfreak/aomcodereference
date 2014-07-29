package aom.scripting.xs.kb;

/**
 * This class provides a collection of all the unit types in the game.
 * The information in valid for AoT, but not necessarily for AoM.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 * 
 * @note Each unit also has its own unit type, those types are omitted.
 * @note In scripts, the names of the variables here are prefixed with "cUnitType".
 */
public class UnitType {
	private UnitType() {}
	
	/**
	 * Indicates that this protounit is a Unit.
	 * 
	 * <ul>
	 * 	<li>Hawk</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Raft</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Osiris</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Vulture</li>
	 * 	<li>Harpy</li>
	 * 	<li>Spider</li>
	 * 	<li>Spearman</li>
	 * 	<li>Axeman</li>
	 * 	<li>Slinger</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Camelry</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Goat</li>
	 * 	<li>Wolf</li>
	 * 	<li>Scarab</li>
	 * 	<li>Ballista</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Hippo</li>
	 * 	<li>Anubite</li>
	 * 	<li>Bear</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Boar</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Catapult</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Troll</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Kraken</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Trireme</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Cow</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Pig</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Zebra</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Baboon</li>
	 * 	<li>Centaur</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Manticore</li>
	 * 	<li>Chimera</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Hydra</li>
	 * 	<li>Chicken</li>
	 * 	<li>Monkey</li>
	 * 	<li>Colossus</li>
	 * 	<li>Mummy</li>
	 * 	<li>Roc</li>
	 * 	<li>Medusa</li>
	 * 	<li>Ajax</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Chiron</li>
	 * 	<li>Amanra</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Scout</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Minion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Kamos</li>
	 * 	<li>Lion</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Hyena</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Elephant</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Scylla</li>
	 * 	<li>Avenger</li>
	 * 	<li>Raven</li>
	 * 	<li>Guardian</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Deer</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Peltast</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Priest</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Jarl</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Longboat</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Skult</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Circe</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Shade</li>
	 * 	<li>Serpent</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Athena</li>
	 * 	<li>Walrus</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Caribou</li>
	 * 	<li>Elk</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Brokk</li>
	 * 	<li>Eitri</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Militia</li>
	 * 	<li>Kastor</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Old Man</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Female</li>
	 * 	<li>Theris</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Polaris</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Bireme</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Promethean</li>
	 * 	<li>Servant</li>
	 * 	<li>Satyr</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Automaton</li>
	 * 	<li>Man O War</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Lampades</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Dryad</li>
	 * 	<li>Nereid</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Argus</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Bella</li>
	 * </ul>
	 */
	public int Unit=801;
	
	/**
	 * Indicates that this protounit is a Ship.
	 * 
	 * <ul>
	 * 	<li>Raft</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Trireme</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Longboat</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Bireme</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * </ul>
	 */
	public int Ship=802;
	
	/**
	 * Indicates that this protounit is a Building.
	 * 
	 * <ul>
	 * 	<li>Construction Small</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Crate</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Fountain</li>
	 * 	<li>Barrel</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Barracks</li>
	 * 	<li>Dock</li>
	 * 	<li>Farm</li>
	 * 	<li>Granary</li>
	 * 	<li>Armory</li>
	 * 	<li>Gate</li>
	 * 	<li>Market</li>
	 * 	<li>Stable</li>
	 * 	<li>Fortress</li>
	 * 	<li>Monument</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Wonder</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Bridge</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Torch</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Great Box</li>
	 * 	<li>Temple</li>
	 * 	<li>House</li>
	 * 	<li>Tent</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Tower</li>
	 * 	<li>Settlement</li>
	 * 	<li>Excavation</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Academy</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Shrine</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Outpost</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Manor</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Palace</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Guild</li>
	 * 	<li>Volcano</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Earth</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Hades Door Small</li>
	 * </ul>
	 */
	public int Building=803;
	
	/**
	 * Indicates that this protounit is a Military Building.
	 * 
	 * <ul>
	 * 	<li>Barracks</li>
	 * 	<li>Stable</li>
	 * 	<li>Fortress</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Temple</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Tower</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Academy</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Palace</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * </ul>
	 */
	public int MilitaryBuilding=804;
	
	/** Ununsed? */
	public int EconomicBuilding=805;
	
	/**
	 * Indicates that this protounit is a Dropsite.
	 * 
	 * <ul>
	 * 	<li>Dock</li>
	 * 	<li>Granary</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 */
	public int Dropsite=806;
	
	/** 
	 * Indicates that protothis unit is a Resource.
	 * 
	* <ul>
	* <li>Cinematic Trees</li>
	* <li>Farm</li>
	* <li>Goat</li>
	* <li>Wolf</li>
	* <li>Pine</li>
	* <li>Crocodile</li>
	* <li>Hippo</li>
	* <li>Palm</li>
	* <li>Bear</li>
	* <li>Boar</li>
	* <li>Cow</li>
	* <li>Giraffe</li>
	* <li>Pig</li>
	* <li>Zebra</li>
	* <li>Water Buffalo</li>
	* <li>Gazelle</li>
	* <li>Baboon</li>
	* <li>Chicken</li>
	* <li>Monkey</li>
	* <li>Fish - Perch</li>
	* <li>Gold Mine</li>
	* <li>Oak Tree</li>
	* <li>Lion</li>
	* <li>Rhinocerous</li>
	* <li>Hyena</li>
	* <li>Crowned Crane</li>
	* <li>Aurochs</li>
	* <li>Fish - Mahi</li>
	* <li>Fish - Salmon</li>
	* <li>Giant Duck-billed Platypus</li>
	* <li>Elephant</li>
	* <li>Deer</li>
	* <li>Berry Bush</li>
	* <li>Gold Mine Small</li>
	* <li>Pine Snow</li>
	* <li>Gold Mine Dwarven</li>
	* <li>Walrus</li>
	* <li>Tamarisk Tree</li>
	* <li>Polar Bear</li>
	* <li>Caribou</li>
	* <li>Elk</li>
	* <li>Pig Special</li>
	* <li>Palm Burning</li>
	* <li>Oak Tree Burning</li>
	* <li>Pine Burning</li>
	* <li>Pine Snow Burning</li>
	* <li>Oak Autumn</li>
	* <li>Oak Autumn Burning</li>
	* <li>Pine Dead</li>
	* <li>Savannah Tree</li>
	* <li>Gold Mine Tiny</li>
	* <li>Taproot</li>
	* <li>Pine Dead Burning</li>
	* <li>Ape of Set</li>
	* <li>Gazelle of Set</li>
	* <li>Hyena of Set</li>
	* <li>Crocodile of Set</li>
	* <li>Hippo of Set</li>
	* <li>Rhinoceros of Set</li>
	* <li>Giraffe of Set</li>
	* <li>Savannah Tree Burning</li>
	* <li>Chicken Exploding</li>
	* <li>Erebus Tree</li>
	* <li>Gaia Forest tree</li>
	* <li>Tundra Tree</li>
	* <li>Marsh Tree</li>
	* <li>Marsh Tree Burning</li>
	* <li>Tundra Tree Burning</li>
	* <li>Gaia Forest tree burning</li>
	* <li>Wolf Arctic</li>
	* <li>Wolf Arctic 2</li>
	* </ul> 
	*/
	public int Resource=807;
	/**
	 * Indicates that this protounit is a resource that can be "hunted".
	 * 
	* <ul>
	* <li>Cinematic Trees</li>
	* <li>Goat</li>
	* <li>Wolf</li>
	* <li>Pine</li>
	* <li>Crocodile</li>
	* <li>Hippo</li>
	* <li>Palm</li>
	* <li>Bear</li>
	* <li>Boar</li>
	* <li>Cow</li>
	* <li>Giraffe</li>
	* <li>Pig</li>
	* <li>Zebra</li>
	* <li>Water Buffalo</li>
	* <li>Gazelle</li>
	* <li>Baboon</li>
	* <li>Chicken</li>
	* <li>Monkey</li>
	* <li>Oak Tree</li>
	* <li>Lion</li>
	* <li>Rhinocerous</li>
	* <li>Hyena</li>
	* <li>Crowned Crane</li>
	* <li>Aurochs</li>
	* <li>Giant Duck-billed Platypus</li>
	* <li>Elephant</li>
	* <li>Deer</li>
	* <li>Pine Snow</li>
	* <li>Walrus</li>
	* <li>Tamarisk Tree</li>
	* <li>Polar Bear</li>
	* <li>Caribou</li>
	* <li>Elk</li>
	* <li>Palm Burning</li>
	* <li>Oak Tree Burning</li>
	* <li>Pine Burning</li>
	* <li>Pine Snow Burning</li>
	* <li>Oak Autumn</li>
	* <li>Oak Autumn Burning</li>
	* <li>Pine Dead</li>
	* <li>Savannah Tree</li>
	* <li>Taproot</li>
	* <li>Pine Dead Burning</li>
	* <li>Ape of Set</li>
	* <li>Gazelle of Set</li>
	* <li>Hyena of Set</li>
	* <li>Crocodile of Set</li>
	* <li>Hippo of Set</li>
	* <li>Rhinoceros of Set</li>
	* <li>Giraffe of Set</li>
	* <li>Savannah Tree Burning</li>
	* <li>Chicken Exploding</li>
	* <li>Erebus Tree</li>
	* <li>Gaia Forest tree</li>
	* <li>Tundra Tree</li>
	* <li>Marsh Tree</li>
	* <li>Marsh Tree Burning</li>
	* <li>Tundra Tree Burning</li>
	* <li>Gaia Forest tree burning</li>
	* <li>Wolf Arctic</li>
	* <li>Wolf Arctic 2</li>
	* </ul>
	*/
	public int HuntedResource=808;
	/** 
	 * Indicates that this protounit is a Resource that can be mined.
	 * 
	* <ul>
	* <li>Gold Mine</li>
	* <li>Gold Mine Small</li>
	* <li>Gold Mine Dwarven</li>
	* <li>Gold Mine Tiny</li>
	* </ul> 
	*/
	public int MinedResource=809;
	
	/** Ununsed? */
	public int LandResource=810;
	
	/** Ununsed? */
	public int WaterResource=811;
	
	/**
	 * Indicates that this protounit is a Projectile.
	 * 
	 * <ul>
	 * 	<li>Arrow</li>
	 * 	<li>Axe</li>
	 * 	<li>Catapult Shot</li>
	 * 	<li>Inferno Fire Ground</li>
	 * 	<li>Ballista Shot</li>
	 * 	<li>Arrow Flaming</li>
	 * 	<li>Frost Drift</li>
	 * 	<li>Spear</li>
	 * 	<li>Sling Stone</li>
	 * 	<li>Ball of Fire</li>
	 * 	<li>Volley</li>
	 * 	<li>Priest Projectile</li>
	 * 	<li>Wadjet Spit</li>
	 * 	<li>Petosuchus projectile</li>
	 * 	<li>Manticore Barb</li>
	 * 	<li>Petrobolos Shot</li>
	 * 	<li>Spear Flaming</li>
	 * 	<li>Arrow Signal</li>
	 * 	<li>Mummy Flies</li>
	 * 	<li>Ball of Fire invisible</li>
	 * 	<li>Javelin Flaming</li>
	 * 	<li>Lampades Bolt</li>
	 * 	<li>Fire Siphon Fire</li>
	 * 	<li>Stymph Bird Feather</li>
	 * 	<li>Rocket</li>
	 * 	<li>Ball of Fire Prometheus</li>
	 * </ul>
	 */
	public int Projectile=812;
	
	/** Indicates that this protounit is associated with Mother Nature. */
	public int Nature=813;
	
	/** Ununsed? */
	public int SpecialPowers=814;
	
	/** Ununsed? */
	public int Unattackable=815;
	
	/**
	 * Indicates that this protounit is some kind of Temple.
	 * 
	* <ul>
	* <li>Temple</li>
	* <li>Temple Underworld</li>
	* <li>Temple Kronos</li>
	* <li>Temple Overgrown</li>
	* </ul>
	 */
	public int AbstractTemple=816;
	
	/**
	 * Indicates that this protounit is Military.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int Military=817;
	
	/**
	 * Indicates that this protounit is a Hero.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Brokk</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Eitri</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Osiris</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Priest</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Skult</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theris</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * </ul>
	 */
	public int Hero=818;
	
	/**
	 * Indicates that this protounit is a Tree.
	 * 
	 * <ul>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * </ul>
	 */
	public int Tree=819;
	
	/**
	 * Indicates that this protounit is some kind of Infantry.
	 * 
	* <ul>
	* <li>Spearman</li>
	* <li>Axeman</li>
	* <li>Shaba Ka</li>
	* <li>Throwing Axeman</li>
	* <li>Ulfsark</li>
	* <li>Huskarl</li>
	* <li>Hoplite</li>
	* <li>Hypaspist</li>
	* <li>Myrmidon</li>
	* <li>Mercenary</li>
	* <li>Skraeling</li>
	* <li>Militia</li>
	* <li>Forkboy</li>
	* <li>Swordsman</li>
	* <li>Trident Soldier</li>
	* <li>Royal Guard</li>
	* <li>Maceman</li>
	* </ul>
	 */
	public int AbstractInfantry=820;
	/**
	 * Indicates that this protounit is some kind of Cavalry.
	* <ul>
	* <li>Recognizer</li>
	* <li>Raiding Cavalry</li>
	* <li>Camelry</li>
	* <li>Hippikon</li>
	* <li>Prodromos</li>
	* <li>Hetairoi</li>
	* <li>Cataphract</li>
	* <li>Mercenary Cavalry</li>
	* <li>Jarl</li>
	* <li>War Elephant</li>
	* <li>Lancer</li>
	* </ul>
	 */
	public int AbstractCavalry=821;
	/**
	 * Indicates that this protounit is some kind of Archer.
	 * 
	* <ul>
	* <li>Slinger</li>
	* <li>Peltast</li>
	* <li>Toxotes</li>
	* <li>Chariot Archer</li>
	* <li>Sentinel Main</li>
	* <li>Crossbowman</li>
	* <li>Archer Atlantean</li>
	* <li>Javelin Cavalry</li>
	* </ul>
	 */
	public int AbstractArcher=822;
	/**
	 * Indicates that this protounit is some kind of Villager.
	 * 
	* <ul>
	* <li>Dwarf</li>
	* <li>Villager Norse</li>
	* <li>Villager Greek</li>
	* <li>Villager Egyptian</li>
	* <li>Villager Atlantean</li>
	* <li>Villager Atlantean Hero</li>
	* </ul>
	 */
	public int AbstractVillager=823;

	/**
	 * Indicates that this protounit is a some kind of Farm.
	 * 
	 * <ul>
	 * 	<li>Farm</li>
	 * </ul>
	 */
	public int AbstractFarm=824;
	/**
	 * Indicates that this protounit is some kind of Dock.
	 * 
	* <ul>
	* <li>Destruction 3x3</li>
	* <li>Dock</li>
	* <li>Naval Shipyard</li>
	* </ul>
	 */
	public int AbstractDock=825;
	
	/** Ununsed? */
	public int InventoryHolder=826;
	
	/** Ununsed? */
	public int InventoryItem=827;
	
	/** Ununsed? */
	public int UseableItem=828;
	
	/** Ununsed? */
	public int StrengthBonus=829;

	/**
	 * Indicates that this protounit can be traded to.
	 * 
	 * <ul>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 */
	public int TradeableTo=830;

	/**
	 * Indicates that this protounit is can be traded from.
	 * 
	 * <ul>
	 * 	<li>Market</li>
	 * 	<li>Naval Shipyard</li>
	 * </ul>
	 */
	public int TradeableFrom=831;
	/**
	 * Indicates that this protounit is some kind of Siege Weapon.
	 * 
	* <ul>
	* <li>Ballista</li>
	* <li>Siege Tower</li>
	* <li>Catapult</li>
	* <li>Portable Ram</li>
	* <li>Petrobolos</li>
	* <li>Helepolis</li>
	* <li>Chieroballista</li>
	* <li>Fire Siphon</li>
	* </ul>
	 */
	public int AbstractSiegeWeapon=832;
	/** 
	 * Indicates that this protounit can fly.
	* <ul>
	* <li>Hawk</li>
	* <li>Vulture</li>
	* <li>Harpy</li>
	* <li>Phoenix</li>
	* <li>Roc</li>
	* <li>Egyptian Vulture</li>
	* <li>Pegasus</li>
	* <li>Raven</li>
	* <li>Nidhogg</li>
	* <li>Flying Medic</li>
	* <li>Stymphalian Bird</li>
	* <li>Phoenix From Egg</li>
	* <li>Kronny Flying</li>
	* </ul> 
	*/
	public int FlyingUnit=833;

	/**
	 * Indicates that this protounit is a Myth Unit.
	 * 
	 * <ul>
	 * 	<li>Cyclops</li>
	 * 	<li>Scarab</li>
	 * 	<li>Anubite</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Troll</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Kraken</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Centaur</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Manticore</li>
	 * 	<li>Chimera</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Hydra</li>
	 * 	<li>Colossus</li>
	 * 	<li>Mummy</li>
	 * 	<li>Roc</li>
	 * 	<li>Medusa</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Minion</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Scylla</li>
	 * 	<li>Avenger</li>
	 * 	<li>Raven</li>
	 * 	<li>Serpent</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Theris</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Polaris</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Promethean</li>
	 * 	<li>Servant</li>
	 * 	<li>Satyr</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Automaton</li>
	 * 	<li>Man O War</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Lampades</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Dryad</li>
	 * 	<li>Nereid</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Argus</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Bella</li>
	 * </ul>
	 * 
	 * @see #AbstractTitan
	 * @see #LogicalTypeMythUnitNotTitan
	 */
	public int MythUnit=834;
	
	/**
	 * Indicates that this protounit is an Economic Unit.
	 * 
	* <ul>
	* <li>Dwarf</li>
	* <li>Caravan Norse</li>
	* <li>Fishing Ship Greek</li>
	* <li>Villager Norse</li>
	* <li>Villager Greek</li>
	* <li>Villager Egyptian</li>
	* <li>Fishing Ship Norse</li>
	* <li>Fishing Ship Egyptian</li>
	* <li>Caravan Greek</li>
	* <li>Caravan Egyptian</li>
	* <li>Theocrat</li>
	* <li>Villager Atlantean</li>
	* <li>Villager Atlantean Hero</li>
	* <li>Fishing Ship Atlantean</li>
	* <li>Caravan Atlantean</li>
	* <li>Krios</li>
	* </ul>
	* 
	* @see #Military
	* 
	* @note This tag alters the usual stances behaviour.
	* For example: alt-s will let villagers continue to build even under attack.
	* That woulnd't work if they were Military.
	* This is completely independent from the definitions in the 
	* <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>.
	*/
	public int Economic=835;
	
	/** Ununsed? */
	public int Ranged=836;
	
	/** Ununsed? */
	public int FastSpeed=837;
	
	/** Ununsed? */
	public int AverageSpeed=838;
	
	/** Ununsed? */
	public int SlowSpeed=839;
	
	/** Ununsed? */
	public int Generic=840;
	
	/** 
	 * Indicates that this protounit is part of the Unit Class (as found in the editor). 
	 * <ul>
			 * 	<li>Raft</li>
			 * 	<li>Recognizer</li>
			 * 	<li>Osiris</li>
			 * 	<li>Spider</li>
			 * 	<li>Spearman</li>
			 * 	<li>Axeman</li>
			 * 	<li>Slinger</li>
			 * 	<li>Raiding Cavalry</li>
			 * 	<li>Camelry</li>
			 * 	<li>Dwarf</li>
			 * 	<li>Cyclops</li>
			 * 	<li>Scarab</li>
			 * 	<li>Ballista</li>
			 * 	<li>Siege Tower</li>
			 * 	<li>Anubite</li>
			 * 	<li>Fire Giant</li>
			 * 	<li>Frost Giant</li>
			 * 	<li>Catapult</li>
			 * 	<li>Caravan Norse</li>
			 * 	<li>Troll</li>
			 * 	<li>Mountain Giant</li>
			 * 	<li>Einheriar</li>
			 * 	<li>Kraken</li>
			 * 	<li>Sea Turtle</li>
			 * 	<li>Valkyrie</li>
			 * 	<li>Battle Boar</li>
			 * 	<li>Trireme</li>
			 * 	<li>Fishing Ship Greek</li>
			 * 	<li>Lazer Bear</li>
			 * 	<li>Centaur</li>
			 * 	<li>Phoenix</li>
			 * 	<li>Manticore</li>
			 * 	<li>Chimera</li>
			 * 	<li>Sphinx</li>
			 * 	<li>Minotaur</li>
			 * 	<li>Hydra</li>
			 * 	<li>Colossus</li>
			 * 	<li>Mummy</li>
			 * 	<li>Roc</li>
			 * 	<li>Medusa</li>
			 * 	<li>Ajax</li>
			 * 	<li>Arkantos</li>
			 * 	<li>Gargarensis</li>
			 * 	<li>Setna</li>
			 * 	<li>Shaba Ka</li>
			 * 	<li>Odysseus</li>
			 * 	<li>Chiron</li>
			 * 	<li>Amanra</li>
			 * 	<li>Leviathan</li>
			 * 	<li>Egyptian Vulture</li>
			 * 	<li>Reginleif</li>
			 * 	<li>Scout</li>
			 * 	<li>Scorpion Man</li>
			 * 	<li>Minion</li>
			 * 	<li>Kamos</li>
			 * 	<li>Pegasus</li>
			 * 	<li>Scylla</li>
			 * 	<li>Avenger</li>
			 * 	<li>Raven</li>
			 * 	<li>Ox Cart</li>
			 * 	<li>Villager Norse</li>
			 * 	<li>Villager Greek</li>
			 * 	<li>Portable Ram</li>
			 * 	<li>Villager Egyptian</li>
			 * 	<li>Throwing Axeman</li>
			 * 	<li>Ulfsark</li>
			 * 	<li>Huskarl</li>
			 * 	<li>Hero Norse</li>
			 * 	<li>Hero Greek Achilles</li>
			 * 	<li>Pharaoh</li>
			 * 	<li>Hero Greek Odysseus</li>
			 * 	<li>Hero Greek Chiron</li>
			 * 	<li>Hero Greek Polyphemus</li>
			 * 	<li>Hoplite</li>
			 * 	<li>Hypaspist</li>
			 * 	<li>Hippikon</li>
			 * 	<li>Prodromos</li>
			 * 	<li>Peltast</li>
			 * 	<li>Toxotes</li>
			 * 	<li>Petrobolos</li>
			 * 	<li>Helepolis</li>
			 * 	<li>Priest</li>
			 * 	<li>Chariot Archer</li>
			 * 	<li>Myrmidon</li>
			 * 	<li>Hetairoi</li>
			 * 	<li>Cataphract</li>
			 * 	<li>Mercenary</li>
			 * 	<li>Mercenary Cavalry</li>
			 * 	<li>Pirate Ship</li>
			 * 	<li>Jarl</li>
			 * 	<li>Transport Ship Greek</li>
			 * 	<li>Kebenit</li>
			 * 	<li>Longboat</li>
			 * 	<li>Hero Greek Heracles</li>
			 * 	<li>Hero Greek Jason</li>
			 * 	<li>Fishing Ship Norse</li>
			 * 	<li>Fishing Ship Egyptian</li>
			 * 	<li>Transport Ship Egyptian</li>
			 * 	<li>Hero Greek Hippolyta</li>
			 * 	<li>Hero Greek Theseus</li>
			 * 	<li>Hero Greek Bellerophon</li>
			 * 	<li>Hero Greek Ajax</li>
			 * 	<li>Hero Greek Atalanta</li>
			 * 	<li>Hero Greek Perseus</li>
			 * 	<li>Flying Purple Hippo</li>
			 * 	<li>Caravan Greek</li>
			 * 	<li>Caravan Egyptian</li>
			 * 	<li>Skult</li>
			 * 	<li>Circe</li>
			 * 	<li>Ramming Ship Greek</li>
			 * 	<li>Siege Ship Greek</li>
			 * 	<li>Hero Greek Argo</li>
			 * 	<li>Ramming Ship Norse</li>
			 * 	<li>Ramming Ship Egyptian</li>
			 * 	<li>Siege Ship Norse</li>
			 * 	<li>Siege Ship Egyptian</li>
			 * 	<li>Shade</li>
			 * 	<li>Serpent</li>
			 * 	<li>Walking Woods Pine</li>
			 * 	<li>Walking Woods Oak</li>
			 * 	<li>Walking Woods Palm</li>
			 * 	<li>Hero Ragnorok</li>
			 * 	<li>Nidhogg</li>
			 * 	<li>Fimbulwinter Wolf</li>
			 * 	<li>Pharaoh of Osiris</li>
			 * 	<li>Fenris Wolf</li>
			 * 	<li>Athena</li>
			 * 	<li>Wadjet</li>
			 * 	<li>Petsuchos</li>
			 * 	<li>Nemean Lion</li>
			 * 	<li>Agamemnon</li>
			 * 	<li>Theocrat</li>
			 * 	<li>Shade of Hades</li>
			 * 	<li>Phoenix Egg</li>
			 * 	<li>Walking Woods Pine Snow</li>
			 * 	<li>Transport Ship Norse</li>
			 * 	<li>War Elephant</li>
			 * 	<li>Brokk</li>
			 * 	<li>Eitri</li>
			 * 	<li>Hippocampus</li>
			 * 	<li>Skraeling</li>
			 * 	<li>Carcinos</li>
			 * 	<li>Jormund Elver</li>
			 * 	<li>Militia</li>
			 * 	<li>Kastor</li>
			 * 	<li>Sea Snake</li>
			 * 	<li>Old Man</li>
			 * 	<li>Arkantosman</li>
			 * 	<li>Pharaoh Secondary</li>
			 * 	<li>Ghost Ship</li>
			 * 	<li>Shade of Erebus</li>
			 * 	<li>Statue of Lightning</li>
			 * 	<li>Crossbowman</li>
			 * 	<li>Charon Ferry</li>
			 * 	<li>Female</li>
			 * 	<li>Theris</li>
			 * 	<li>Ornlu</li>
			 * 	<li>Polaris</li>
			 * 	<li>Prisoner</li>
			 * 	<li>Kraken SPC</li>
			 * 	<li>Monkey Raft</li>
			 * 	<li>Forkboy</li>
			 * 	<li>Walking Berry Bush</li>
			 * 	<li>Walking Woods Savannah</li>
			 * 	<li>Villager Atlantean</li>
			 * 	<li>Villager Atlantean Hero</li>
			 * 	<li>Swordsman</li>
			 * 	<li>Trident Soldier</li>
			 * 	<li>Trident Soldier Hero</li>
			 * 	<li>Swordsman Hero</li>
			 * 	<li>Fishing Ship Atlantean</li>
			 * 	<li>Bireme</li>
			 * 	<li>Transport Ship Atlantean</li>
			 * 	<li>Fire Ship Atlantean</li>
			 * 	<li>Siege Ship Atlantean</li>
			 * 	<li>Lancer</li>
			 * 	<li>Lancer Hero</li>
			 * 	<li>Chieroballista</li>
			 * 	<li>Fire Siphon</li>
			 * 	<li>Caravan Atlantean</li>
			 * 	<li>Royal Guard</li>
			 * 	<li>Royal Guard Hero</li>
			 * 	<li>Titan Atlantean</li>
			 * 	<li>Archer Atlantean</li>
			 * 	<li>Archer Atlantean Hero</li>
			 * 	<li>Maceman</li>
			 * 	<li>Maceman Hero</li>
			 * 	<li>Javelin Cavalry</li>
			 * 	<li>Javelin Cavalry Hero</li>
			 * 	<li>Audrey</li>
			 * 	<li>Audrey Water</li>
			 * 	<li>Behemoth</li>
			 * 	<li>Flying Medic</li>
			 * 	<li>Promethean</li>
			 * 	<li>Servant</li>
			 * 	<li>Satyr</li>
			 * 	<li>Stymphalian Bird</li>
			 * 	<li>Automaton</li>
			 * 	<li>Man O War</li>
			 * 	<li>Promethean Small</li>
			 * 	<li>Oracle Hero</li>
			 * 	<li>Heka Gigantes</li>
			 * 	<li>Oracle Scout</li>
			 * 	<li>Tartarian Gate spawn</li>
			 * 	<li>Lampades</li>
			 * 	<li>Kastor Adult</li>
			 * 	<li>Phoenix From Egg</li>
			 * 	<li>Dryad</li>
			 * 	<li>Nereid</li>
			 * 	<li>Walking Woods Marsh</li>
			 * 	<li>Walking Woods Tundra</li>
			 * 	<li>Titan Prometheus</li>
			 * 	<li>General Melagius</li>
			 * 	<li>Pharaoh of Osiris XP</li>
			 * 	<li>Argus</li>
			 * 	<li>Spider Egg</li>
			 * 	<li>King Folstag</li>
			 * 	<li>Krios</li>
			 * 	<li>Kronny</li>
			 * 	<li>Ajax Older</li>
			 * 	<li>Amanra Older</li>
			 * 	<li>Arkantos God</li>
			 * 	<li>Kronny Flying</li>
			 * 	<li>Automaton SPC</li>
			 * 	<li>Kastor Staff</li>
			 * 	<li>Titan Kronos</li>
			 * 	<li>Titan Gaia</li>
			 * 	<li>Shade XP</li>
			 * 	<li>Bella</li>
			 * </ul>
			 * 
			 * @see #BuildingClass
			 * @see #TestClass
			 * @see #E3Class
			 * @see #NatureClass
			 * @see #EmbellishmentClass 
			 * 
	 */
	public int UnitClass=841;
	/** 
	 * Indicates that this protounit is part of the Building Class (as found in the editor). 
	 * <ul>
			 * 	<li>Barracks</li>
			 * 	<li>Dock</li>
			 * 	<li>Farm</li>
			 * 	<li>Granary</li>
			 * 	<li>Armory</li>
			 * 	<li>Gate</li>
			 * 	<li>Market</li>
			 * 	<li>Stable</li>
			 * 	<li>Fortress</li>
			 * 	<li>Monument</li>
			 * 	<li>Siege Camp</li>
			 * 	<li>Wonder</li>
			 * 	<li>Storehouse</li>
			 * 	<li>Wall Long</li>
			 * 	<li>Wall Connector</li>
			 * 	<li>Wall Short</li>
			 * 	<li>Archery Range</li>
			 * 	<li>Temple</li>
			 * 	<li>House</li>
			 * 	<li>Tower</li>
			 * 	<li>Settlement</li>
			 * 	<li>Settlement Level 1</li>
			 * 	<li>Longhouse</li>
			 * 	<li>Academy</li>
			 * 	<li>Hill Fort</li>
			 * 	<li>Shrine</li>
			 * 	<li>Lumber Camp</li>
			 * 	<li>Mining Camp</li>
			 * 	<li>Migdol Stronghold</li>
			 * 	<li>Monument 2</li>
			 * 	<li>Monument 3</li>
			 * 	<li>Monument 4</li>
			 * 	<li>Monument 5</li>
			 * 	<li>Dwarven Forge</li>
			 * 	<li>Outpost</li>
			 * 	<li>Lighthouse</li>
			 * 	<li>Troy Gate</li>
			 * 	<li>Troy Wall Connector</li>
			 * 	<li>Troy Wall Long</li>
			 * 	<li>Troy Wall Short</li>
			 * 	<li>Naval Shipyard</li>
			 * 	<li>Animal Attractor</li>
			 * 	<li>Healing Spring Object</li>
			 * 	<li>Citadel Center</li>
			 * 	<li>Plenty Vault</li>
			 * 	<li>Atlantis Wall Connector</li>
			 * 	<li>Atlantis Wall Long</li>
			 * 	<li>Atlantis Gate</li>
			 * 	<li>Dwarf Foundry</li>
			 * 	<li>Temple Underworld</li>
			 * 	<li>Plenty Vault KOTH</li>
			 * 	<li>Bandit Migdol</li>
			 * 	<li>Wall Medium</li>
			 * 	<li>Wonder SPC</li>
			 * 	<li>Manor</li>
			 * 	<li>Counter Building</li>
			 * 	<li>Palace</li>
			 * 	<li>Sky Passage</li>
			 * 	<li>Barracks Atlantean</li>
			 * 	<li>Guild</li>
			 * 	<li>Volcano</li>
			 * 	<li>Tower Mirror</li>
			 * 	<li>Hesperides Tree</li>
			 * 	<li>Odins Tower</li>
			 * 	<li>Temple Kronos</li>
			 * 	<li>Invisible Wall</li>
			 * 	<li>Invisible Target</li>
			 * 	<li>Temple Overgrown</li>
			 * 	<li>Summoning Tree</li>
			 * 	<li>Summoning Tree 2</li>
			 * 	<li>Tree Finale</li>
			 * </ul>
			 * 
			 * @see #UnitClass
			 * @see #TestClass
			 * @see #E3Class
			 * @see #NatureClass
			 * @see #EmbellishmentClass
	 */
	public int BuildingClass=842;
	/** 
	 * Indicates that this protounit is part of the Nature Class (as found in the editor). 
	  * <ul>
			 * 	<li>Hawk</li>
			 * 	<li>Palm Stump</li>
			 * 	<li>Bush</li>
			 * 	<li>Papyrus</li>
			 * 	<li>Whale</li>
			 * 	<li>Rock Symbols</li>
			 * 	<li>Rock Snow</li>
			 * 	<li>Coral Reef</li>
			 * 	<li>Shark</li>
			 * 	<li>Orca</li>
			 * 	<li>Rock Granite Small</li>
			 * 	<li>Rock Limestone Small</li>
			 * 	<li>Grass</li>
			 * 	<li>Seagull</li>
			 * 	<li>Rock Granite Big</li>
			 * 	<li>Rock Limestone Big</li>
			 * 	<li>Rock Sandstone Big</li>
			 * 	<li>Rock Sandstone Small</li>
			 * 	<li>Rock River Sandy</li>
			 * 	<li>Rock River Grassy</li>
			 * 	<li>Rock River Icy</li>
			 * 	<li>Cinematic rocks</li>
			 * 	<li>Cinematic Trees</li>
			 * 	<li>Dove</li>
			 * 	<li>Rock Granite Sprite</li>
			 * 	<li>Rock Limestone Sprite</li>
			 * 	<li>Rock Sandstone Sprite</li>
			 * 	<li>Pine Stump</li>
			 * 	<li>Oak stump</li>
			 * 	<li>Flowers</li>
			 * 	<li>Seaweed</li>
			 * 	<li>Fern</li>
			 * 	<li>Oak stump burnt</li>
			 * 	<li>Vulture</li>
			 * 	<li>Rotting Log</li>
			 * 	<li>Underbrush</li>
			 * 	<li>Grass Tall</li>
			 * 	<li>Rock Cliff</li>
			 * 	<li>Harpy</li>
			 * 	<li>Hawksbill</li>
			 * 	<li>Water decoration</li>
			 * 	<li>Savannah stump</li>
			 * 	<li>Iceberg</li>
			 * 	<li>GaiaCreepFlowers</li>
			 * 	<li>Marsh Brush</li>
			 * 	<li>Tundra Brush</li>
			 * 	<li>Marsh stump</li>
			 * 	<li>Tundra stump</li>
			 * 	<li>Seagull High</li>
			 * 	<li>Seagull Low</li>
			 * 	<li>Goat</li>
			 * 	<li>Wolf</li>
			 * 	<li>Pine</li>
			 * 	<li>Crocodile</li>
			 * 	<li>Hippo</li>
			 * 	<li>Palm</li>
			 * 	<li>Bear</li>
			 * 	<li>Boar</li>
			 * 	<li>Cow</li>
			 * 	<li>Giraffe</li>
			 * 	<li>Pig</li>
			 * 	<li>Zebra</li>
			 * 	<li>Water Buffalo</li>
			 * 	<li>Gazelle</li>
			 * 	<li>Baboon</li>
			 * 	<li>Chicken</li>
			 * 	<li>Monkey</li>
			 * 	<li>Fish - Perch</li>
			 * 	<li>Gold Mine</li>
			 * 	<li>Oak Tree</li>
			 * 	<li>Lion</li>
			 * 	<li>Rhinocerous</li>
			 * 	<li>Hyena</li>
			 * 	<li>Crowned Crane</li>
			 * 	<li>Aurochs</li>
			 * 	<li>Fish - Mahi</li>
			 * 	<li>Fish - Salmon</li>
			 * 	<li>Giant Duck-billed Platypus</li>
			 * 	<li>Elephant</li>
			 * 	<li>Deer</li>
			 * 	<li>Berry Bush</li>
			 * 	<li>Relic</li>
			 * 	<li>Gold Mine Small</li>
			 * 	<li>Pine Snow</li>
			 * 	<li>Stop Combat</li>
			 * 	<li>Walrus</li>
			 * 	<li>Polar Bear</li>
			 * 	<li>Caribou</li>
			 * 	<li>Elk</li>
			 * 	<li>Pig Special</li>
			 * 	<li>Palm Burning</li>
			 * 	<li>Oak Tree Burning</li>
			 * 	<li>Pine Burning</li>
			 * 	<li>Pine Snow Burning</li>
			 * 	<li>Oak Autumn</li>
			 * 	<li>Oak Autumn Burning</li>
			 * 	<li>Golden Fleece</li>
			 * 	<li>Pine Dead</li>
			 * 	<li>Savannah Tree</li>
			 * 	<li>Gold Mine Tiny</li>
			 * 	<li>Pine Dead Burning</li>
			 * 	<li>Ape of Set</li>
			 * 	<li>Gazelle of Set</li>
			 * 	<li>Hyena of Set</li>
			 * 	<li>Crocodile of Set</li>
			 * 	<li>Hippo of Set</li>
			 * 	<li>Rhinoceros of Set</li>
			 * 	<li>Giraffe of Set</li>
			 * 	<li>Savannah Tree Burning</li>
			 * 	<li>Chicken Exploding</li>
			 * 	<li>Erebus Tree</li>
			 * 	<li>Gaia Forest tree</li>
			 * 	<li>Tundra Tree</li>
			 * 	<li>Marsh Tree</li>
			 * 	<li>Marsh Tree Burning</li>
			 * 	<li>Tundra Tree Burning</li>
			 * 	<li>Gaia Forest tree burning</li>
			 * 	<li>Wolf Arctic</li>
			 * 	<li>Wolf Arctic 2</li>
			 * </ul>
			 * 
			 * @see #BuildingClass
			 * @see #UnitClass
			 * @see #TestClass
			 * @see #E3Class
			 * @see #EmbellishmentClass
	 */
	public int NatureClass=843;
	
	/** 
	 * Indicates that this protounit is part of the Embellishment Class (as found in the editor). 
	 * <ul>
			 * 	<li>Arrow</li>
			 * 	<li>Axe</li>
			 * 	<li>Blood</li>
			 * 	<li>Scarab Blood</li>
			 * 	<li>Test Object</li>
			 * 	<li>Yardstick</li>
			 * 	<li>Smoke</li>
			 * 	<li>Cloud</li>
			 * 	<li>Tornado</li>
			 * 	<li>Construction Small</li>
			 * 	<li>Construction Medium</li>
			 * 	<li>Construction Large</li>
			 * 	<li>Construction Extra Large</li>
			 * 	<li>Ice Block</li>
			 * 	<li>Wave</li>
			 * 	<li>Ice Sheet</li>
			 * 	<li>Fire Pit</li>
			 * 	<li>Stalagmite</li>
			 * 	<li>Runestone</li>
			 * 	<li>Water Lilly</li>
			 * 	<li>Water Reeds</li>
			 * 	<li>Snowfall</li>
			 * 	<li>Crate</li>
			 * 	<li>Rugs</li>
			 * 	<li>Market Stall</li>
			 * 	<li>Catapult Shot</li>
			 * 	<li>Misc Objects</li>
			 * 	<li>Inferno Fire Ground</li>
			 * 	<li>Ballista Shot</li>
			 * 	<li>Misc Stairs</li>
			 * 	<li>Cinematic Block</li>
			 * 	<li>Footprint Villager</li>
			 * 	<li>Flaming Footprint</li>
			 * 	<li>Icy Footprint</li>
			 * 	<li>Oar Footprint</li>
			 * 	<li>Lightning sparks</li>
			 * 	<li>Lightning Scorch</li>
			 * 	<li>Dust Small</li>
			 * 	<li>Dust Medium</li>
			 * 	<li>Dust Large</li>
			 * 	<li>Arrow Flaming</li>
			 * 	<li>Lightning Cloud</li>
			 * 	<li>Lightning Rain</li>
			 * 	<li>Blood Gore</li>
			 * 	<li>Lightning Sparks Ground</li>
			 * 	<li>Hoofprint</li>
			 * 	<li>Footprint Military</li>
			 * 	<li>Fire Object</li>
			 * 	<li>Giant Footprint</li>
			 * 	<li>Shifting Sands In</li>
			 * 	<li>Shifting Sands Out</li>
			 * 	<li>Shifting Sands Out Effect</li>
			 * 	<li>Inferno Unit Flame</li>
			 * 	<li>Skeleton</li>
			 * 	<li>Sand Drift Dune</li>
			 * 	<li>Sand Drift Plain</li>
			 * 	<li>Sand Drift Patch</li>
			 * 	<li>Healing SFX</li>
			 * 	<li>Healing Area SFX</li>
			 * 	<li>Frost Drift</li>
			 * 	<li>Dust Devil</li>
			 * 	<li>Fountain</li>
			 * 	<li>Fire Wood</li>
			 * 	<li>Campfire</li>
			 * 	<li>Columns</li>
			 * 	<li>Columns Fallen</li>
			 * 	<li>Columns Broken</li>
			 * 	<li>Milestone</li>
			 * 	<li>Sign</li>
			 * 	<li>Clone SFX</li>
			 * 	<li>Spear</li>
			 * 	<li>Sling Stone</li>
			 * 	<li>Fertile Plants SFX</li>
			 * 	<li>Cinematic Dead Bodies</li>
			 * 	<li>Destroyed Buildings Small</li>
			 * 	<li>Cinematic Scorch</li>
			 * 	<li>undermine ground decal long</li>
			 * 	<li>undermine ground decal short</li>
			 * 	<li>undermine ground decal corner</li>
			 * 	<li>Armor Glow Small</li>
			 * 	<li>Tornado Debris</li>
			 * 	<li>Meteor Impact Water</li>
			 * 	<li>Meteor Impact Ground</li>
			 * 	<li>Ball of Fire</li>
			 * 	<li>Increase Prosperity Large</li>
			 * 	<li>Increase Prosperity Small</li>
			 * 	<li>Ball of fire impact</li>
			 * 	<li>Snow Drift Archery</li>
			 * 	<li>Snow Drift Barracks</li>
			 * 	<li>Snow Drift Stable</li>
			 * 	<li>Snow Drift Settlements</li>
			 * 	<li>Snow Drift Tower</li>
			 * 	<li>Snow Drift Siege</li>
			 * 	<li>Snow Drift Major Temple</li>
			 * 	<li>Tunnel Opening</li>
			 * 	<li>Volley</li>
			 * 	<li>Hades Fire</li>
			 * 	<li>Spy Eye</li>
			 * 	<li>Curse SFX</li>
			 * 	<li>Sentinel Base</li>
			 * 	<li>Bolt Scorch</li>
			 * 	<li>Citadel SFX</li>
			 * 	<li>Vision SFX</li>
			 * 	<li>Ragnorok SFX</li>
			 * 	<li>Fimbulwinter SFX</li>
			 * 	<li>Plenty Flare</li>
			 * 	<li>Osiris SFX</li>
			 * 	<li>Priest Projectile</li>
			 * 	<li>Barrel</li>
			 * 	<li>Pots</li>
			 * 	<li>Broken Siege Weapons</li>
			 * 	<li>Kraken Bits</li>
			 * 	<li>Flag Numbered</li>
			 * 	<li>Generic Corpse</li>
			 * 	<li>Wadjet Spit</li>
			 * 	<li>Earthquake CrackA</li>
			 * 	<li>Earthquake CrackB</li>
			 * 	<li>Earthquake CrackC</li>
			 * 	<li>Earthquake CrackD</li>
			 * 	<li>Forest Fire SFX</li>
			 * 	<li>Petosuchus projectile</li>
			 * 	<li>Manticore Barb</li>
			 * 	<li>Arrow Splash SFX</li>
			 * 	<li>Petrobolos Shot</li>
			 * 	<li>Pestilence SFX1</li>
			 * 	<li>Pestilence SFX2</li>
			 * 	<li>Gate Ram Destroyed</li>
			 * 	<li>Spear Flaming</li>
			 * 	<li>Destroyed Buildings Med</li>
			 * 	<li>Destroyed Buildings Large</li>
			 * 	<li>Avalanche</li>
			 * 	<li>Einheriar Boost SFX</li>
			 * 	<li>Arrow Signal</li>
			 * 	<li>Osiris Birth</li>
			 * 	<li>Fire Object Big</li>
			 * 	<li>Smoke Big</li>
			 * 	<li>Mummy Flies</li>
			 * 	<li>Conversion SFX</li>
			 * 	<li>Fire Hades</li>
			 * 	<li>Destruction 3x3</li>
			 * 	<li>Destruction 4x4</li>
			 * 	<li>Destruction 5x5</li>
			 * 	<li>Destruction 8x8</li>
			 * 	<li>Thor hammer</li>
			 * 	<li>Regeneration SFX</li>
			 * 	<li>Poison SFX</li>
			 * 	<li>Taproot large</li>
			 * 	<li>Taproot Small</li>
			 * 	<li>Shadow</li>
			 * 	<li>Destruction Settlement</li>
			 * 	<li>Destruction 2x2</li>
			 * 	<li>Destruction 1x1</li>
			 * 	<li>MIne Pieces</li>
			 * 	<li>Underworld Smoke</li>
			 * 	<li>Underworld Explosion</li>
			 * 	<li>Blood Cinematic</li>
			 * 	<li>Skeleton Giant</li>
			 * 	<li>Skeleton Animal</li>
			 * 	<li>Shipwreck</li>
			 * 	<li>Ruins</li>
			 * 	<li>UI Range Indicator Egypt SFX</li>
			 * 	<li>Blowing Leaves</li>
			 * 	<li>Blood Flow</li>
			 * 	<li>Ball of Fire invisible</li>
			 * 	<li>Splash Footprint</li>
			 * 	<li>Lava Bubbling</li>
			 * 	<li>Wood Pile 1</li>
			 * 	<li>Wood Pile 2</li>
			 * 	<li>Wood Pile 3</li>
			 * 	<li>Trident</li>
			 * 	<li>Destruction Citadel</li>
			 * 	<li>UI Range Indicator Greek SFX</li>
			 * 	<li>UI Range Indicator Norse SFX</li>
			 * 	<li>Invisible Gate</li>
			 * 	<li>Footprint Cavalry</li>
			 * 	<li>Footprint Animal Large</li>
			 * 	<li>Footprint Animal Small</li>
			 * 	<li>Footprint Siege</li>
			 * 	<li>Evil Cloud SFX </li>
			 * 	<li>Smoke Giant</li>
			 * 	<li>Crate Small</li>
			 * 	<li>Cinematic Wake</li>
			 * 	<li>Weapons</li>
			 * 	<li>Footprint Giant</li>
			 * 	<li>Footprint Elephant</li>
			 * 	<li>Footprint Wheel</li>
			 * 	<li>Footprint Hydra</li>
			 * 	<li>Footprint Portable Ram</li>
			 * 	<li>Footprint Scorpion</li>
			 * 	<li>Footprint Scarab</li>
			 * 	<li>Chicken Blood</li>
			 * 	<li>Crab Blood</li>
			 * 	<li>Arkantos Boost SFX</li>
			 * 	<li>Audrey Base</li>
			 * 	<li>Audrey Water Base</li>
			 * 	<li>Fireball Launch Damage Effect</li>
			 * 	<li>Javelin Flaming</li>
			 * 	<li>Lampades Blood</li>
			 * 	<li>Acid Pool</li>
			 * 	<li>Spider Warn</li>
			 * 	<li>Implode Debris</li>
			 * 	<li>Titan Atlantean Footprint</li>
			 * 	<li>Heka Shockwave SFX</li>
			 * 	<li>Lampades Bolt</li>
			 * 	<li>Fire Siphon Fire</li>
			 * 	<li>Stymph Bird Feather</li>
			 * 	<li>Osiris Pyramid Dead</li>
			 * 	<li>Rocket</li>
			 * 	<li>UI Range Indicator Atlantean SFX</li>
			 * 	<li>Tower Mirror Focuser</li>
			 * 	<li>Kronny Birth</li>
			 * 	<li>Ball of Fire Prometheus</li>
			 * 	<li>Arkantos God Out</li>
			 * 	<li>Olympus Temple SFX</li>
			 * 	<li>Kronny Birth SFX</li>
			 * 	<li>Lava Sheet</li>
			 * 	<li>Sound Gaia SFX</li>
			 * 	<li>Footprint Prometheanbig</li>
			 * 	<li>Footprint Prometheansmall</li>
			 * 	<li>Cinematic Dead Bodies Xpack</li>
			 * 	<li>Tartarian Rubble</li>
			 * 	<li>Titan Death</li>
			 * 	<li>Flag</li>
			 * 	<li>Locust Swarm</li>
			 * 	<li>Bridge</li>
			 * 	<li>Statue Pharaoh</li>
			 * 	<li>Torch</li>
			 * 	<li>Obelisk</li>
			 * 	<li>Hades Door</li>
			 * 	<li>Statue Lion Right</li>
			 * 	<li>Statue Lion Left</li>
			 * 	<li>Great Box</li>
			 * 	<li>Great Box Cart</li>
			 * 	<li>Pyramid Large</li>
			 * 	<li>Pyramid Small</li>
			 * 	<li>Tent</li>
			 * 	<li>Tunnel</li>
			 * 	<li>Excavation</li>
			 * 	<li>Guardian</li>
			 * 	<li>Guardian Sleeping</li>
			 * 	<li>Sword Bearers</li>
			 * 	<li>Fence Stone</li>
			 * 	<li>Fence Wood</li>
			 * 	<li>Statue of Major God</li>
			 * 	<li>Folstag Flag Bearer</li>
			 * 	<li>Trojan Horse</li>
			 * 	<li>Bolder Wall</li>
			 * 	<li>Gate Ram</li>
			 * 	<li>Wall Long Destruction SFX</li>
			 * 	<li>Wall Short Destruction SFX</li>
			 * 	<li>Wall Connector Destruction SFX</li>
			 * 	<li>Hero Boar</li>
			 * 	<li>Bolder Rolling</li>
			 * 	<li>Gold Mine Dwarven</li>
			 * 	<li>Tamarisk Tree</li>
			 * 	<li>Titan Bad</li>
			 * 	<li>Great Box Cart 2</li>
			 * 	<li>Thor Hammer Haft</li>
			 * 	<li>Thor Hammer Head</li>
			 * 	<li>Underworld Passage SPC</li>
			 * 	<li>Jail Wall</li>
			 * 	<li>Dig Pile</li>
			 * 	<li>Bolder Rolling Dead</li>
			 * 	<li>Bolder Rolling 2</li>
			 * 	<li>Gate Ram 2</li>
			 * 	<li>Mini Atlantis</li>
			 * 	<li>Atlantis Tile</li>
			 * 	<li>Atlantis Tile Dead</li>
			 * 	<li>Well of Urd</li>
			 * 	<li>Troy Gate Dead</li>
			 * 	<li>Poseidon Statue</li>
			 * 	<li>Golden Lion</li>
			 * 	<li>Monkey Relic</li>
			 * 	<li>Fence Iron</li>
			 * 	<li>Hero Boar 2</li>
			 * 	<li>Taproot</li>
			 * 	<li>Tamarisk Tree Dead</li>
			 * 	<li>Folstag Flag</li>
			 * 	<li>Undermine Building Destruction SFX</li>
			 * 	<li>Titan Gate</li>
			 * 	<li>Guardian Sleeping XP</li>
			 * 	<li>Statue of Automaton</li>
			 * 	<li>Statue of Automaton Base</li>
			 * 	<li>Gaia Pool</li>
			 * 	<li>Statue Manticore</li>
			 * 	<li>Statue Cyclops</li>
			 * 	<li>Statue Nemean Lion</li>
			 * 	<li>Statue Valkyrie</li>
			 * 	<li>Statue Hydra</li>
			 * 	<li>Statue Chimera</li>
			 * 	<li>Tartarian Gate placement</li>
			 * 	<li>Tartarian Gate birth</li>
			 * 	<li>Titan Gate Dead</li>
			 * 	<li>Earth</li>
			 * 	<li>Victory Marker</li>
			 * 	<li>Pyramid Osiris Xpack</li>
			 * 	<li>Statue of Melagius</li>
			 * 	<li>Roc Tent</li>
			 * 	<li>Guardian XP</li>
			 * 	<li>Bolder Rolling Small</li>
			 * 	<li>Hades Door Small</li>
			 * </ul>
			 * 
			 * @see #BuildingClass
			 * @see #UnitClass
			 * @see #TestClass
			 * @see #E3Class
			 * @see #NatureClass
	 */
	public int EmbellishmentClass=844;
	
	/** 
	 * Indicates that this protounit is part of the Test Class (as found in the editor).
	 * 
	 * @see #BuildingClass
	 * @see #UnitClass
	 * @see #E3Class
	 * @see #NatureClass
	 * @see #EmbellishmentClass
	 */
	public int TestClass=845;
	
	/** 
	 * Indicates that this protounit is part of the E3 Class (as found in the editor).
	 * 
	 * @see #BuildingClass
	 * @see #UnitClass
	 * @see #TestClass
	 * @see #NatureClass
	 * @see #EmbellishmentClass
	 */
	public int E3Class=846;
	
	/** 
	 * Indicates any protounit whatsoever.
	 * Mainly used in KB Queries where the unittype does not matter.
	 */
	public int All=847;
	
	/** Ununsed? */
	public int ActionGather=848;
	
	/** Ununsed? */
	public int ActionTrain=849;
	
	/** Ununsed? */
	public int ActionBuild=850;
	
	/** Ununsed? */
	public int ActionAttack=851;
	
	/** Ununsed? */
	public int ActionTrickle=852;
	
	/** 
	* Indicates that this protounit is a Fish.
	* 
	* <ul>
	* <li>Whale</li>
	* <li>Fish - Perch</li>
	* <li>Fish - Mahi</li>
	* <li>Fish - Salmon</li>
	* </ul> 
	*/
	public int Fish=853;
	/** 
	* Indicates that this protounit can transport other units.
	* 
	* <ul>
	* <li>Roc</li>
	* <li>Leviathan</li>
	* <li>Pirate Ship</li>
	* <li>Transport Ship Greek</li>
	* <li>Transport Ship Egyptian</li>
	* <li>Transport Ship Norse</li>
	* <li>Charon Ferry</li>
	* <li>Transport Ship Atlantean</li>
	* </ul> 
	*/
	//Longboat?
	
	public int Transport=854;
	/** 
	 * Indicates that this protounit is some part of a Wall.
	 * 
	* <ul>
	* <li>Gate</li>
	* <li>Wall Long</li>
	* <li>Wall Connector</li>
	* <li>Wall Short</li>
	* <li>Troy Gate</li>
	* <li>Troy Wall Connector</li>
	* <li>Troy Wall Long</li>
	* <li>Troy Wall Short</li>
	* <li>Atlantis Wall Connector</li>
	* <li>Atlantis Wall Long</li>
	* <li>Atlantis Gate</li>
	* <li>Wall Medium</li>
	* <li>Invisible Wall</li>
	* <li>Invisible Target</li>
	* </ul> 
	*/
	public int AbstractWall=855;
	/** 
	 * Indicates that this protounit can be herded.
	* <ul>
	* <li>Goat</li>
	* <li>Cow</li>
	* <li>Pig</li>
	* </ul> 
	*/
	public int Herdable=856;
	/** 
	 * Indicates that this protounit is some kind of Settlement.
	* <ul>
	* <li>Settlement</li>
	* <li>Settlement Level 1</li>
	* <li>Citadel Center</li>
	* </ul>
	* 
	* @see #SettlementsThatTrainVillagers
	*/
	public int AbstractSettlement=857;
	/** 
	 * Indicates that this protounit is a Building that can shoot.
	 * 
	* <ul>
	* <li>Fortress</li>
	* <li>Tower</li>
	* <li>Settlement Level 1</li>
	* <li>Hill Fort</li>
	* <li>Migdol Stronghold</li>
	* <li>Citadel Center</li>
	* <li>Bandit Migdol</li>
	* <li>Palace</li>
	* <li>Sky Passage</li>
	* <li>Tower Mirror</li>
	* </ul> 
	*/
	public int BuildingsThatShoot=858;
	
	/** Ununsed? */
	public int MythUnitGodPower=859;
	
	/** 
	 * Indicates that this protounit is some kind of Titan.
	 * 
	* <ul>
	* <li>Titan Atlantean</li>
	* <li>Titan Prometheus</li>
	* <li>Titan Kronos</li>
	* <li>Titan Gaia</li>
	* </ul> 
	* 
	* @see #MythUnit
	* @see #LogicalTypeMythUnitNotTitan
	* 
	* @since AoT
	*/
	public int AbstractTitan=860;
	/** 
	 * Indicates that this protounit can be traded with.
	 * 
	* <ul>
	* <li>Caravan Norse</li>
	* <li>Caravan Greek</li>
	* <li>Caravan Egyptian</li>
	* <li>Caravan Atlantean</li>
	* </ul>
	* 
	* @see #TradeableFrom 
	* @see #TradeableTo
	*/
	public int AbstractTradeUnit=861;
	
	/**
	 * Indicates that this protounit is a Hero of Loki, i.e. an Hersir.
	 * Might be used to decide which protounits can spawn myth units.
	 * 
	 * @see #LogicalTypeGreekHeroes
	 */
	public int LokiHero=862;

	/**
	 * Indicates that this protounit is an Age 2 Building.
	 * 
	 * <ul>
	 * 	<li>Barracks</li>
	 * 	<li>Armory</li>
	 * 	<li>Stable</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Academy</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Barracks Atlantean</li>
	 * </ul>
		 */
	public int Age2Building=863;

	/**
	 * Indicates that this protounit is an Age 3 Building.
	 * 
	 * <ul>
	 * 	<li>Market</li>
	 * 	<li>Fortress</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Palace</li>
	 * 	<li>Hesperides Tree</li>
	 * </ul>
	 */
	public int Age3Building=864;

	/** Ununsed? */
	public int Age1Temple=865;

	/**
	 * Indicates that this protounit contains Food.
	 * 
	 * <ul>
	 * 	<li>Farm</li>
	 * 	<li>Goat</li>
	 * 	<li>Wolf</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Hippo</li>
	 * 	<li>Bear</li>
	 * 	<li>Boar</li>
	 * 	<li>Cow</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Pig</li>
	 * 	<li>Zebra</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Baboon</li>
	 * 	<li>Chicken</li>
	 * 	<li>Monkey</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Lion</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Hyena</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Elephant</li>
	 * 	<li>Deer</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Walrus</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Caribou</li>
	 * 	<li>Elk</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * </ul>
	 * 
	 * @see #Gold
	 * @see #Wood
	 * @see #Favor
	 */
	public int Food=866;

	/**
	 * Indicates that this protounit contains Gold.
	 * 
	 * <ul>
	 * 	<li>Gold Mine</li>
	 * 	<li>Gold Mine Small</li>
	 * 	<li>Gold Mine Dwarven</li>
	 * 	<li>Gold Mine Tiny</li>
	 * </ul>
	 * 
	 * @see #Food
	 * @see #Wood
	 * @see #Favor
	 */
	public int Gold=867;

	/**
	 * Indicates that this protounit contains Wood.
	 * 
	 * <ul>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Pine</li>
	 * 	<li>Palm</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * </ul>
	 * 
	 * @see #Food
	 * @see #Gold
	 * @see #Favor
	 */
	public int Wood=868;

	/**
	 * Indicates that this protounit is some kind of Wild Crops,
	 * or at least food units that gather at the same speed as regular berries.
	 * 
	 * <ul>
	 * 	<li>Chicken</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Chicken Exploding</li>
	 * </ul>
	 */
	public int WildCrops=869;

	/**
	 * Indicates that this protounit is an Age 1 Building.
	 * 
	 * <ul>
	 * 	<li>Dock</li>
	 * 	<li>Granary</li>
	 * 	<li>Storehouse</li>
	 * 	<li>House</li>
	 * 	<li>Tent</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Manor</li>
	 * 	<li>Guild</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Tree Finale</li>
	 * </ul>
	 */
	public int Age1Building=870;

	/**
	 * Indicates that this protounit is a Food Dropsite.
	 * 
	 * <ul>
	 * 	<li>Dock</li>
	 * 	<li>Granary</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 * 
	 * @see #EarlyFoodDropsite EarlyFoodDropsite
	 */
	public int FoodDropsite=871;

	/**
	 * Indicates that this protounit is a Wood Dropsite.
	 * 
	 * <ul>
	 * 	<li>Storehouse</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 * 
	 * @see #EarlyWoodDropsite EarlyWoodDropsite
	 */
	public int WoodDropsite=872;

	/**
	 * Indicates that this protounit is a Gold Dropsite.
	 * 
	 * <ul>
	 * 	<li>Storehouse</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 * 
	 * @see #EarlyGoldDropsite EarlyGoldDropsite
	 */
	public int GoldDropsite=873;

	/**
	 * Indicates that this protounit is a Human Soldier.
	 * 
	 * <ul>
	 * 	<li>Recognizer</li>
	 * 	<li>Spearman</li>
	 * 	<li>Axeman</li>
	 * 	<li>Slinger</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Camelry</li>
	 * 	<li>Scout</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Peltast</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Jarl</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Militia</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Lancer</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Maceman</li>
	 * 	<li>Javelin Cavalry</li>
	 * </ul>
	 */
	public int HumanSoldier=874;

	/**
	 * Indicates that this protounit is a Huntable.
	 * 
	 * <ul>
	 * 	<li>Wolf</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Hippo</li>
	 * 	<li>Bear</li>
	 * 	<li>Boar</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Zebra</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Baboon</li>
	 * 	<li>Monkey</li>
	 * 	<li>Lion</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Hyena</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Elephant</li>
	 * 	<li>Deer</li>
	 * 	<li>Walrus</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Caribou</li>
	 * 	<li>Elk</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * </ul>
	 */
	public int Huntable=875;

	/**
	 * Indicates that this protounit is a some kind of Monument.
	 * 
	 * <ul>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * </ul>
	 */
	public int AbstractMonument=876;

	/**
	 * Indicates that this protounit is a settlement that can train villagers, 
	 * so not an unclaimed settlement.
	 * 
	 * <ul>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Citadel Center</li>
	 * </ul>
	 * 
	 * @see #AbstractSettlement AbstractSettlement
	 */
	public int SettlementsThatTrainVillagers=877;

	/** Ununsed? */
	public int Hack=878;

	/** Ununsed? */
	public int Crush=879;

	/** Ununsed? */
	public int Pierce=880;

	/**
	 * Indicates that this protounit is a Shared Building, 
	 * i.e. it can used by multiple civilizations. (?)
	 * 
	 * <ul>
	 * 	<li>Dock</li>
	 * 	<li>Market</li>
	 * 	<li>Temple</li>
	 * 	<li>House</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Manor</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Tree Finale</li>
	 * </ul>
	 */
	public int SharedBuilding=881;

	/**
	 * Indicates that this protounit is a some kind of Stable.
	 * 
	 * <ul>
	 * 	<li>Stable</li>
	 * 	<li>Counter Building</li>
	 * </ul>
	 */
	public int AbstractStable=882;

	/**
	 * Indicates that this protounit is a some kind of Fortress.
	 * 
	 * <ul>
	 * 	<li>Fortress</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Palace</li>
	 * </ul>
	 */
	public int AbstractFortress=883;

	/**
	 * Indicates that this protounit is some kind of Barracks.
	 * 
	 * <ul>
	 * 	<li>Barracks</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Academy</li>
	 * 	<li>Barracks Atlantean</li>
	 * </ul>
	 */
	public int AbstractBarracks=884;

	/**
	 * Indicates that this protounit is a some kind of Archery Range.
	 * For example, when you search for an AbstractArcheryRange in-game with Egyptians 
	 * it will return barracks because they don't have a dedicated Archery Range.
	 * 
	 * <ul>
	 * 	<li>Barracks</li>
	 * 	<li>Archery Range</li>
	 * </ul>
	 */
	public int AbstractArcheryRange=885;

	/**
	 * Indicates that this protounit is a Early (simple) Wood Dropsite,
	 * i.e. it does not include {@link aom.scripting.xs.kb.UnitType#AbstractSettlement AbstractSettlements}.
	 * 
	 * <ul>
	 * 	<li>Storehouse</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Lumber Camp</li>
	 * </ul>
	 * 
	 * @see #WoodDropsite WoodDropsite
	 */
	public int EarlyWoodDropsite=886;

	/**
	 * Indicates that this protounit is am Early (simple) Food Dropsite,
	 * i.e. it does not include {@link aom.scripting.xs.kb.UnitType#AbstractSettlement AbstractSettlements}.
	 * 
	 * <ul>
	 * 	<li>Granary</li>
	 * 	<li>Ox Cart</li>
	 * </ul>
	 * 
	 * @see #FoodDropsite FoodDropsite
	 */
	public int EarlyFoodDropsite=887;

	/**
	 * Indicates that this protounit is a Early (simple) Gold Dropsite,
	 * i.e. it does not include {@link aom.scripting.xs.kb.UnitType#AbstractSettlement AbstractSettlements}.
	 * 
	 * <ul>
	 * 	<li>Storehouse</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Mining Camp</li>
	 * </ul>
	 * 
	 * @see #GoldDropsite GoldDropsite
	 */
	public int EarlyGoldDropsite=888;

	/**
	 * Indicates that this protounit is a Convertable Building.
	 * 
	 * <ul>
	 * 	<li>Barracks</li>
	 * 	<li>Dock</li>
	 * 	<li>Granary</li>
	 * 	<li>Armory</li>
	 * 	<li>Market</li>
	 * 	<li>Stable</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Temple</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Academy</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Outpost</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Guild</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * </ul>
	 */
	public int ConvertableBuilding=889;

	/**
	 * Indicates that this protounit contains favor.
	 * 
	 * @see #Food Food
	 * @see #Gold Gold
	 * @see #Wood Favor
	 */
	public int Favor=890;

	/**
	 * Indicates that this protounit is a Prey Animal,
	 * i.e. it will try to run away when attacked.
	 * 
	 * <ul>
	 * 	<li>Giraffe</li>
	 * 	<li>Zebra</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Baboon</li>
	 * 	<li>Monkey</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Deer</li>
	 * 	<li>Caribou</li>
	 * 	<li>Elk</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * </ul>
	 * 
	 * @see #AnimalPredator AnimalPredator
	 * @see #AnimalReactive AnimalReactive
	 * @see #LogicalTypeDangerousAnimals LogicalTypeDangerousAnimals
	 */
	public int AnimalPrey=891;

	/**
	 * Indicates that this protounit is a Reactive Animal, 
	 * i.e. it attacks back if attacked.
	 * 
	 * <ul>
	 * 	<li>Hippo</li>
	 * 	<li>Boar</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Elephant</li>
	 * 	<li>Walrus</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Rhinoceros of Set</li>
	 * </ul>
	 * 
	 * @see #AnimalPredator AnimalPredator
	 * @see #AnimalPrey AnimalPrey
	 * @see #LogicalTypeDangerousAnimals LogicalTypeDangerousAnimals
	 */
	public int AnimalReactive=892;

	/**
	 * Indicates that this protounit is a Predator Animal, 
	 * i.e. it might attack villagers without any reason whatsoever.
	 * 
	 * <ul>
	 * 	<li>Wolf</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Bear</li>
	 * 	<li>Lion</li>
	 * 	<li>Hyena</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * </ul>
	 * 
	 * @see #AnimalReactive AnimalReactive
	 * @see #AnimalPrey AnimalPrey
	 * @see #LogicalTypeDangerousAnimals LogicalTypeDangerousAnimals
	 */
	public int AnimalPredator=893;

	/**
	 * Indicates that this protounit is a some kind of Pharaoh.
	 * 
	 * <ul>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * </ul>
	 */
	public int AbstractPharaoh=894;

	/**
	 * Indicates that this protounit is an Infantry Myth Unity.
	 * 
	 * <ul>
	 * 	<li>Cyclops</li>
	 * 	<li>Anubite</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Mummy</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Avenger</li>
	 * 	<li>Theris</li>
	 * </ul>
	 * 
	 * @note This does not affect the gameplay whatsoever.
	 */
	public int MythUnitInfantry=895;

	/**
	 * Indicates that this protounit is a Cavalry Myth Unit.
	 * 
	 * <ul>
	 * 	<li>Scarab</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Chimera</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Hydra</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Polaris</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * </ul>
	 * 
	 * @note This does not affect the gameplay whatsoever.
	 */
	public int MythUnitCavalry=896;

	/**
	 * Indicates that this protounit is an Archer Myth Unit.
	 * 
	 * <ul>
	 * 	<li>Troll</li>
	 * 	<li>Centaur</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Satyr</li>
	 * 	<li>Lampades</li>
	 * 	<li>Argus</li>
	 * </ul>
	 * 
	 * @note This does not affect the gameplay whatsoever.
	 */
	public int MythUnitArcher=897;

	/**
	 * Indicates that this protounit is a Siege Myth Unit.
	 * 
	 * <ul>
	 * 	<li>Scarab</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Colossus</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Gaia</li>
	 * </ul>
	 * 
	 * @note This does not affect the gameplay whatsoever.
	 */
	public int MythUnitSiege=898;

	/**
	 * Indicates that this protounit is a some kind of Fishing Ship.
	 * 
	 * <ul>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeShipNotFishinghip LogicalTypeShipNotFishinghip
	 */
	public int UtilityShip=899;

	/**
	 * Indicates that this protounit can be attacked using a "Hand Units Attack".
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeHandUnitsAttack=900;

	/**
	 * Indicates that this protounit can be attacked automatically by predators.
	 * 
	 * <ul>
	 * 	<li>Dwarf</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypePredatorsAutoAttack=901;

	/**
	 * Indicates that this protounit can be attacked automatically by mean predators.
	 * Mean predators or super predators are predators that also randomly attack military units.
	 * They were taken out of the game AFAIK.
	 * 
	 * <ul>
	 * 	<li>Dwarf</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeMeanPredatorsAutoAttack=902;

	/**
	 * Indicates that this protounit can be automatically attacked using a "Hand Units Attack".
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Excavation</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeHandUnitsAutoAttack=903;

	/**
	 * Indicates that this protounit can be attacked using a "Predator Attack".
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypePredatorsAttack=904;

	/**
	 * Indicates that this protounit can be attacked by a scout 
	 * in response to an earlier attack launched at that scout.
	 * 
	 * <ul>
	 * 	<li>Dwarf</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeScoutsRespondToAttack=905;

	/**
	 * Indicates that this protounit is a Building, Houses excluded.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #Building Building
	 * @see #LogicalTypeBuildingNotTitanGate LogicalTypeBuildingNotTitanGate
	 * @see #LogicalTypeBuildingsNotWalls LogicalTypeBuildingsNotWalls
	 */
	public int LogicalTypeBuildingsNotHouses=906;

	/**
	 * Indicates that this protounit can be attacked using a "Ranged Units Attack".
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeRangedUnitsAttack=907;

	/**
	 * Indicates that this protounit can be automatically attacked using a "Ranged Units Attack".
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Excavation</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeRangedUnitsAutoAttack=908;

	/**
	 * Indicates that this protounit is a Unit but not a Building.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 */
	public int LogicalTypeUnitsNotBuildings=909;

	/**
	 * Indicates that this protounit is a Dangerous Animal.
	 * 
	 * <ul>
	 * 	<li>Bear</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Hyena</li>
	 * 	<li>Lion</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * </ul>
	 * 
	 * @see #AnimalPredator AnimalPredator
	 * @see #AnimalPrey AnimalPrey
	 * @see #AnimalReactive AnimalReactive
	 */
	public int LogicalTypeDangerousAnimals=910;

	/**
	 * Indicates that this protounit is possibly an idle Civilian,
	 * i.e. if they are found idle the respective counter goes up 1.
	 * 
	 * <ul>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeIdleHero LogicalTypeIdleHero
	 * @see #LogicalTypeIdleMilitary LogicalTypeIdleMilitary
	 * 
	 * @note To ensure that these are actually idle, you should use {@link aom.scripting.ui.console#uiFindIdleType(string) uiFindIdleType}. 
	 */
	public int LogicalTypeIdleCivilian=911;

	/**
	 * Indicates that this protounit is possibly idle Military,
	 * i.e. if they are found idle the respective counter goes up 1.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeIdleCivilian LogicalTypeIdleCivilian
	 * @see #LogicalTypeIdleHero LogicalTypeIdleHero
	 * 
	 * @note To ensure that these are actually idle, you should use {@link aom.scripting.ui.console#uiFindIdleType(string) uiFindIdleType}.
	 */
	public int LogicalTypeIdleMilitary=912;

	/**
	 * Indicates that this protounit is can be attacked by a Tornado.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Acid Pool</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Bireme</li>
	 * 	<li>Blood Flow</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Bush</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Coral Reef</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dove</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Excavation</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fern</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flowers</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Hawksbill</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Iceberg</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lava Bubbling</li>
	 * 	<li>Lava Sheet</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Orca</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Papyrus</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Rotting Log</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Seagull</li>
	 * 	<li>Seagull High</li>
	 * 	<li>Seagull Low</li>
	 * 	<li>Seaweed</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Splash Footprint</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Stop Combat</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underbrush</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Water decoration</li>
	 * 	<li>Water Lilly</li>
	 * 	<li>Water Reeds</li>
	 * 	<li>Wave</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeTornadoAttack=913;

	/**
	 * Indicates that this protounit is a is needed for victory.
	 * Actually a better interpretation is the other way around:
	 * if you don't have any of these units left you lose.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Stable</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Victory Marker</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 */
	public int LogicalTypeNeededForVictory=914;

	/**
	 * Indicates that this protounit is possible an idle Hero,
	 * i.e. if they are found idle the respective counter goes up 1.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Brokk</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Eitri</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Osiris</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Priest</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Skult</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theris</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeIdleCivilian LogicalTypeIdleCivilian
	 * @see #LogicalTypeIdleMilitary LogicalTypeIdleMilitary
	 * 
	 * @note To ensure that these are actually idle, you should use {@link aom.scripting.ui.console#uiFindIdleType(string) uiFindIdleType}.
	 */
	public int LogicalTypeIdleHero=915;

	/**
	 * Indicates that this protounit is a valid bolt target.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidBoltTarget=916;

	/**
	 * Indicates that this protounit can be healed by a Healing Spring.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 */
	public int LogicalTypeAffectedByHealingSpring=917;

	/**
	 * Indicates that this protounit is a affected by Restoration.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 */
	public int LogicalTypeAffectedByRestoration=918;

	/**
	 * Indicates that this protounit can be garrisoned on Transport Ships.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Lion</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Serpent</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 */
	public int LogicalTypeGarrisonOnBoats=919;

	/**
	 * Indicates that this protounit is a both some kind of Cavalry And Scout at the same time.
	 * Well... good luck scouting with a war elephant.
	 * 
	 * <ul>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Lancer</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Scout</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #AbstractCavalry AbstractCavalry
	 * @see #AbstractScout AbstractScout
	 */
	public int LogicalTypeCavalryAndScout=920;

	/**
	 * Indicates that this protounit is a Non-Greek Unit.
	 * A myrmidon gets a bonus vs all these.
	 * 
	 * <ul>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Camelry</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeNonGreekUnit=921;

	/**
	 * Indicates that this protounit can be attack by a Villager.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeVillagersAttack=922;

	/**
	 * Indicates that this protounit can be attacked by an Earthquake.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Acid Pool</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Bireme</li>
	 * 	<li>Blood Flow</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Bush</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Coral Reef</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dove</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Excavation</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fern</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flowers</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Hawksbill</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Iceberg</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lava Bubbling</li>
	 * 	<li>Lava Sheet</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Orca</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Papyrus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Rotting Log</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Seagull</li>
	 * 	<li>Seagull High</li>
	 * 	<li>Seagull Low</li>
	 * 	<li>Seaweed</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Splash Footprint</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Stop Combat</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underbrush</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Water decoration</li>
	 * 	<li>Water Lilly</li>
	 * 	<li>Water Reeds</li>
	 * 	<li>Wave</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeEarthquakeAttack=923;

	/**
	 * Indicates that this protounit is a some kind of Armory.
	 * 
	 * <ul>
	 * 	<li>Armory</li>
	 * 	<li>Dwarf Foundry</li>
	 * </ul>
	 */
	public int AbstractArmory=924;

	/**
	 * Indicates that this protounit can be automatically attacked by Siege.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeSiegeAutoAttack=925;

	/**
	 * Indicates that this protounit is a can be healed, e.g. by a Priest.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeCanBeStoned LogicalTypeCanBeStoned
	 * @see #LogicalTypeCanBeThrown LogicalTypeCanBeThrown
	 */
	public int LogicalTypeCanBeHealed=926;

	/**
	 * Indicates that this protounit is still shown on the minimap with the economic filter active.
	 * 
	 * <ul>
	 * 	<li>Ape of Set</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Baboon</li>
	 * 	<li>Bear</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Boar</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Caribou</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Deer</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Farm</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Gold Mine</li>
	 * 	<li>Gold Mine Dwarven</li>
	 * 	<li>Gold Mine Small</li>
	 * 	<li>Gold Mine Tiny</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Lion</li>
	 * 	<li>Market</li>
	 * 	<li>Monkey</li>
	 * 	<li>Pig</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Relic</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Walrus</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeMinimapFilterMilitary LogicalTypeMinimapFilterMilitary
	 */
	public int LogicalTypeMinimapFilterEconomic=927;

	/**
	 * Indicates that this protounit is still shown on the minimap with the military filter active.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Well of Urd</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeMinimapFilterEconomic LogicalTypeMinimapFilterEconomic
	 */
	public int LogicalTypeMinimapFilterMilitary=928;

	/**
	 * Indicates that this protounit is an Archer Ship.
	 * 
	 * <ul>
	 * 	<li>Bireme</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Longboat</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Trireme</li>
	 * </ul>
	 * 
	 * @see #HammerShip HammerShip
	 * @see #SiegeShip SiegeShip
	 * @see #TransportShip TransportShip
	 */
	public int ArcherShip=929;

	/**
	 * Indicates that this protounit is an Hammer Ship.
	 * 
	 * <ul>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * </ul>
	 * 
	 * @see #ArcherShip ArcherShip
	 * @see #SiegeShip SiegeShip
	 * @see #TransportShip TransportShip
	 */
	public int HammerShip=930;

	/**
	 * Indicates that this protounit is a Siege Ship.
	 * 
	 * <ul>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * </ul>
	 * 
	 * @see #ArcherShip ArcherShip
	 * @see #HammerShip HammerShip
	 * @see #TransportShip TransportShip
	 */
	public int SiegeShip=931;

	/**
	 * Indicates that this protounit is a some kind of Cart.
	 * 
	 * <ul>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Ox Cart</li>
	 * </ul>
	 */
	public int AbstractCart=932;

	/**
	 * Indicates that this protounit is some kind of Scout.
	 * 
	 * <ul>
	 * 	<li>Hippocampus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Priest</li>
	 * 	<li>Raven</li>
	 * 	<li>Scout</li>
	 * 	<li>Ulfsark</li>
	 * </ul>
	 */
	public int AbstractScout=933;

	/**
	 * Indicates that this protounit can be spied upon.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidSpyTarget=934;

	/**
	 * Indicates that this protounit is an Auto Upgraded Unit.
	 * That is, it gets a stat boost for every age advancement.
	 * 
	 * <ul>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * </ul>
	 */
	public int AutoupgradedUnit=935;

	/**
	 * Indicates that this protounit is a Naval Military.
	 * 
	 * <ul>
	 * 	<li>Bireme</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Longboat</li>
	 * 	<li>Man O War</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Trireme</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeShipNotFishinghip LogicalTypeShipNotFishinghip
	 * @see #LogicalTypeLandMilitary LogicalTypeLandMilitary
	 */
	public int LogicalTypeNavalMilitary=936;

	/**
	 * Indicates that this protounit is a valid Frost target.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidFrostTarget=937;

	/**
	 * Indicates that this protounit is a valid Meteor target.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidMeteorTarget=938;

	/**
	 * Indicates that this protounit can be attack by Sea Serpents.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chimera</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polaris</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeSeaSerpentAttack=939;

	/**
	 * Indicates that this protounit can be a Favorite Unit, 
	 * i.e. it can show up in postgame as a player's favorite unit.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bireme</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Eitri</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Scout</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeFavoriteMythUnit LogicalTypeFavoriteMythUnit
	 */
	public int LogicalTypeFavoriteUnit=940;

	/**
	 * Indicates that this protounit can be a Favorite Myth Unit, 
	 * i.e. it can show up in postgame as a player's favorite myth unit.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Argus</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Baboon</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Promethean</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Troll</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walrus</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeFavoriteUnit LogicalTypeFavoriteUnit
	 */
	public int LogicalTypeFavoriteMythUnit=941;

	/**
	 * Indicates that this protounit can convert Herdables.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 */
	public int LogicalTypeConvertsHerds=942;

	/**
	 * Indicates that this protounit is a valid Locust Swarm target.
	 * 
	 * <ul>
	 * 	<li>Dwarf</li>
	 * 	<li>Farm</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidLocustSwarmTarget=943;

	/**
	 * Indicates that this protounit is a valid Shifting Sands target.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidShiftingSandsTarget=944;

	/**
	 * Indicates that this protounit participates in Battle Cries.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Axeman</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Scout</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeParticipatesInBattlecries=945;

	/**
	 * Indicates that this protounit is a Building that trains Military.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Fortress</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Palace</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Well of Urd</li>
	 * </ul>
	 */
	public int LogicalTypeBuildingsThatTrainMilitary=946;

	/**
	 * Indicates that this protounit can be attacked by some kind of Ram Attack.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Catapult</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeRamAttack=947;

	/**
	 * Indicates that this protounit can transport units over water.
	 * 
	 * <ul>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * </ul>
	 * 
	 * @see #ArcherShip ArcherShip
	 * @see #HammerShip HammerShip
	 * @see #SiegeShip SiegeShip
	 */
	public int TransportShip=948;

	/**
	 * Indicates that this protounit can be attacked by a Villager 
	 * in response to an earlier attack launched at that Villager.
	 * 
	 * <ul>
	 * 	<li>Ape of Set</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Baboon</li>
	 * 	<li>Bear</li>
	 * 	<li>Boar</li>
	 * 	<li>Caribou</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Deer</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Lion</li>
	 * 	<li>Monkey</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Scout</li>
	 * 	<li>Serpent</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Walrus</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeVillagersRespondToAttack=949;

	/**
	 * Indicates that this protounit is a LogicalTypeFimbulWinterTCEvalType.
	 * Um... I suppose this protounit can be attacked by Fimbul Winter Wolves?
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Farm</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Stable</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeFimbulWinterTCEvalType=950;

	/**
	 * Indicates that this protounit can be harmed by a Forest Fire.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidForestFireTarget=951;

	/**
	 * Indicates that this protounit will automatically attack Buildings if it sees the chance.
	 * 
	 * <ul>
	 * 	<li>Ballista</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Catapult</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Scarab</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * </ul>
	 * 
	 * @note This overrides the behaviour defined in the <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>.
	 */
	public int LogicalTypeAutoattackTargetsBuildings=952;

	/**
	 * Indicates that this protounit is a Walking Tree.
	 * 
	 * <ul>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * </ul>
	 */
	public int WalkingWood=953;

	/**
	 * Indicates that this protounit is Land Military.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Serpent</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeNavalMilitary LogicalTypeNavalMilitary
	 */
	public int LogicalTypeLandMilitary=954;

	/**
	 * Indicates that this protounit can resurrect fallen SPC Units.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeValidSPCUnitsDeadCondition=955;

	/**
	 * Indicates that this protounit can be issued to hide inside a building by the Town Bell.
	 * 
	 * <ul>
	 * 	<li>Dwarf</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 */
	public int LogicalTypeAffectedByTownBell=956;

	/**
	 * Indicates that this protounit is a valid Flaming Weapons target.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Athena</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bireme</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Eitri</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Krios</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Scout</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidFlamingWeaponsTarget=957;

	/**
	 * Indicates that this protounit is a Greek Hero.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Amanra</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Brokk</li>
	 * 	<li>Chiron</li>
	 * 	<li>Eitri</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * </ul>
	 * 
	 * @see #LokiHero LokiHero
	 */
	public int LogicalTypeGreekHeroes=958;

	/**
	 * Indicates that this protounit is a either a Military Unit or a Building.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Palace</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Serpent</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Tower</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Long</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #Military Military
	 * @see #MilitaryBuilding MilitaryBuilding
	 * @see #Building Building
	 */
	public int LogicalTypeMilitaryUnitsAndBuildings=959;

	/**
	 * Indicates that this protounit can enjoy Odin's regeneration bonus.
	 * 
	 * <ul>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Axeman</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Lancer</li>
	 * 	<li>Maceman</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Peltast</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Scout</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeOdinRegenerates=960;

	/**
	 * Indicates that this protounit is a valid Traitors target.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 */
	public int LogicalTypeValidTraitorsTarget=961;

	/**
	 * Indicates that this protounit can be attacked by a Super Predator.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeSuperPredatorsAttack=962;

	/**
	 * Indicates that this protounit can be automatically attacked by a Super Predator.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeSuperPredatorsAutoAttack=963;

	/**
	 * Indicates that this protounit can be attacked by the Volcano GP.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Acid Pool</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Berry Bush</li>
	 * 	<li>Bireme</li>
	 * 	<li>Blood Flow</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Bush</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Cinematic Trees</li>
	 * 	<li>Circe</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Coral Reef</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dove</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Erebus Tree</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fern</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fish - Mahi</li>
	 * 	<li>Fish - Perch</li>
	 * 	<li>Fish - Salmon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flowers</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Forest tree</li>
	 * 	<li>Gaia Forest tree burning</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Hawksbill</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Iceberg</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lava Bubbling</li>
	 * 	<li>Lava Sheet</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Marsh Tree</li>
	 * 	<li>Marsh Tree Burning</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Oak Autumn</li>
	 * 	<li>Oak Autumn Burning</li>
	 * 	<li>Oak Tree</li>
	 * 	<li>Oak Tree Burning</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Orca</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Palm</li>
	 * 	<li>Palm Burning</li>
	 * 	<li>Papyrus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pine</li>
	 * 	<li>Pine Burning</li>
	 * 	<li>Pine Dead</li>
	 * 	<li>Pine Dead Burning</li>
	 * 	<li>Pine Snow</li>
	 * 	<li>Pine Snow Burning</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Rotting Log</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Savannah Tree</li>
	 * 	<li>Savannah Tree Burning</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Seagull</li>
	 * 	<li>Seagull High</li>
	 * 	<li>Seagull Low</li>
	 * 	<li>Seaweed</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Splash Footprint</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Stop Combat</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tamarisk Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tundra Tree</li>
	 * 	<li>Tundra Tree Burning</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underbrush</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Water decoration</li>
	 * 	<li>Water Lilly</li>
	 * 	<li>Water Reeds</li>
	 * 	<li>Wave</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 */
	public int LogicalTypeVolcanoAttack=964;

	/**
	 * Indicates that this protounit is a valid Deconstruction target.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 * 
	 * @since AoT
	 */
	public int LogicalTypeValidDeconstructionTarget=965;

	/**
	 * Indicates that this protounit can be attacked by a Shockwave GP.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeImplodeAttack LogicalTypeImplodeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeValidTremorAttack=966;

	/**
	 * Indicates that this protounit can be affected by the Chaos GP.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Servant</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 * 
	 * @since AoT
	 */
	public int LogicalTypeAffectedByChaos=967;

	/**
	 * Indicates that this protounit is a valid Reverse Wonder target.
	 * 
	 * <ul>
	 * 	<li>Odins Tower</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 * 
	 * @since AoT
	 */
	public int LogicalTypeValidReverseWonderTarget=968;

	/**
	 * Indicates that this protounit can be Thrown,
	 * e.g. by a Cyclops or a War Turtle.
	 * 
	 * <ul>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bireme</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Lancer</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Scout</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeCanBeStoned LogicalTypeCanBeStoned
	 * @see #LogicalTypeCanBeHealed LogicalTypeCanBeHealed
	 */
	public int LogicalTypeCanBeThrown=969;

	/**
	 * Indicates that the Tartarian Gate GP can be casted over this protounit.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Armory</li>
	 * 	<li>Athena</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Brokk</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Cow</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Eitri</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Female</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Boar</li>
	 * 	<li>Hero Boar 2</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>House</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Krios</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manor</li>
	 * 	<li>Manticore</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Militia</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Outpost</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Palace</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Priest</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troll</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpiderTarget LogicalTypeValidSpiderTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * 
	 * @since AoT
	 */
	public int LogicalTypeTartarianGateValidOverlapPlacement=970;

	/**
	 * Indicates that this protounit can be transported using the Vortex GP.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * 
	 * @since AoT
	 */
	public int LogicalTypeAffectedByVortex=971;

	/**
	 * Indicates that this protounit does not create Lush, even when possessed by Gaia.
	 * 
	 * <ul>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Farm</li>
	 * 	<li>Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeDoesNotCreateLush=972;

	/**
	 * Indicates that this protounit can be affected by Heroize, not sure how though...
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Camelry</li>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chicken</li>
	 * 	<li>Chicken Exploding</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cow</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dust Devil</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Female</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Great Box Cart</li>
	 * 	<li>Great Box Cart 2</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Hawk</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kastor</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Pig</li>
	 * 	<li>Pig Special</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Prisoner</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Sentinel Main</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Spider Egg</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theocrat</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Atlantean</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Titan Gaia</li>
	 * 	<li>Titan Kronos</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Vulture</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByFrostGiant LogicalTypeAffectedByFrostGiant
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 * 
	 * @since AoT
	 */
	public int LogicalTypeAffectedByHeroize=973;

	/**
	 * Indicates that this protounit is a valid Spider target.
	 * 
	 * <ul>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Axeman</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Maceman</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Peltast</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Scout</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Ulfsark</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeValidBoltTarget LogicalTypeValidBoltTarget
	 * @see #LogicalTypeValidDeconstructionTarget LogicalTypeValidDeconstructionTarget
	 * @see #LogicalTypeValidFlamingWeaponsTarget LogicalTypeValidFlamingWeaponsTarget
	 * @see #LogicalTypeValidForestFireTarget LogicalTypeValidForestFireTarget
	 * @see #LogicalTypeValidFrostTarget LogicalTypeValidFrostTarget
	 * @see #LogicalTypeValidLocustSwarmTarget LogicalTypeValidLocustSwarmTarget
	 * @see #LogicalTypeValidMeteorTarget LogicalTypeValidMeteorTarget
	 * @see #LogicalTypeValidReverseWonderTarget LogicalTypeValidReverseWonderTarget
	 * @see #LogicalTypeValidShiftingSandsTarget LogicalTypeValidShiftingSandsTarget
	 * @see #LogicalTypeValidSpyTarget LogicalTypeValidSpyTarget
	 * @see #LogicalTypeValidTraitorsTarget LogicalTypeValidTraitorsTarget
	 * @see #LogicalTypeTartarianGateValidOverlapPlacement LogicalTypeTartarianGateValidOverlapPlacement
	 * 
	 * @since AoT
	 */
	public int LogicalTypeValidSpiderTarget=974;

	/**
	 * Indicates that this protounit can be attacked by the Implode GP.
	 * 
	 * <ul>
	 * 	<li>Agamemnon</li>
	 * 	<li>Ajax</li>
	 * 	<li>Ajax Older</li>
	 * 	<li>Amanra</li>
	 * 	<li>Amanra Older</li>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Archer Atlantean Hero</li>
	 * 	<li>Argus</li>
	 * 	<li>Arkantos</li>
	 * 	<li>Arkantos God</li>
	 * 	<li>Arkantosman</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avalanche</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Chiron</li>
	 * 	<li>Circe</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Flying Purple Hippo</li>
	 * 	<li>Folstag Flag Bearer</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gargarensis</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>General Melagius</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Golden Lion</li>
	 * 	<li>Guardian</li>
	 * 	<li>Guardian XP</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Achilles</li>
	 * 	<li>Hero Greek Ajax</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hero Greek Atalanta</li>
	 * 	<li>Hero Greek Bellerophon</li>
	 * 	<li>Hero Greek Chiron</li>
	 * 	<li>Hero Greek Heracles</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Greek Jason</li>
	 * 	<li>Hero Greek Odysseus</li>
	 * 	<li>Hero Greek Perseus</li>
	 * 	<li>Hero Greek Polyphemus</li>
	 * 	<li>Hero Greek Theseus</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hero Ragnorok</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Javelin Cavalry Hero</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kamos</li>
	 * 	<li>Kastor Adult</li>
	 * 	<li>Kastor Staff</li>
	 * 	<li>Kebenit</li>
	 * 	<li>King Folstag</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Lancer Hero</li>
	 * 	<li>Lazer Bear</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Maceman Hero</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Monkey Relic</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Odysseus</li>
	 * 	<li>Oracle Hero</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Osiris</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Pharaoh</li>
	 * 	<li>Pharaoh of Osiris XP</li>
	 * 	<li>Pharaoh Secondary</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Priest</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Reginleif</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Royal Guard Hero</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Setna</li>
	 * 	<li>Shaba Ka</li>
	 * 	<li>Shade</li>
	 * 	<li>Shade of Erebus</li>
	 * 	<li>Shade of Hades</li>
	 * 	<li>Shade XP</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Skult</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Statue of Lightning</li>
	 * 	<li>Sword Bearers</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Swordsman Hero</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Thor Hammer Haft</li>
	 * 	<li>Thor Hammer Head</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Bad</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trident Soldier Hero</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeHandUnitsAttack LogicalTypeHandUnitsAttack
	 * @see #LogicalTypeHandUnitsAutoAttack LogicalTypeHandUnitsAutoAttack
	 * @see #LogicalTypeRangedUnitsAttack LogicalTypeRangedUnitsAttack
	 * @see #LogicalTypeRangedUnitsAutoAttack LogicalTypeRangedUnitsAutoAttack
	 * @see #LogicalTypeRamAttack LogicalTypeRamAttack
	 * @see #LogicalTypeEarthquakeAttack LogicalTypeEarthquakeAttack
	 * @see #LogicalTypeMeanPredatorsAutoAttack LogicalTypeMeanPredatorsAutoAttack
	 * @see #LogicalTypePredatorsAttack LogicalTypePredatorsAttack
	 * @see #LogicalTypePredatorsAutoAttack LogicalTypePredatorsAutoAttack
	 * @see #LogicalTypeScoutsRespondToAttack LogicalTypeScoutsRespondToAttack
	 * @see #LogicalTypeSeaSerpentAttack LogicalTypeSeaSerpentAttack
	 * @see #LogicalTypeSiegeAutoAttack LogicalTypeSiegeAutoAttack
	 * @see #LogicalTypeSuperPredatorsAttack LogicalTypeSuperPredatorsAttack
	 * @see #LogicalTypeSuperPredatorsAutoAttack LogicalTypeSuperPredatorsAutoAttack
	 * @see #LogicalTypeTornadoAttack LogicalTypeTornadoAttack
	 * @see #LogicalTypeValidTremorAttack LogicalTypeValidTremorAttack
	 * @see #LogicalTypeVillagersAttack LogicalTypeVillagersAttack
	 * @see #LogicalTypeVillagersRespondToAttack LogicalTypeVillagersRespondToAttack
	 * @see #LogicalTypeVolcanoAttack LogicalTypeVolcanoAttack
	 * @see <a href="{@docRoot}/unitaitypes.txt">unitaitypes.txt file</a>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeImplodeAttack=975;

	/**
	 * Indicates that this protounit can be petrified by the Medusa.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Boar</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeCanBeHealed LogicalTypeCanBeHealed
	 * @see #LogicalTypeCanBeThrown LogicalTypeCanBeThrown
	 * @see #LogicalTypePerseusCanStone LogicalTypePerseusCanStone for Persues' petrify attack.
	 */
	public int LogicalTypeCanBeStoned=976;

	/**
	 * Indicates that this protounit can be frozen by a Frost Giant.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Ape of Set</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Aurochs</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Baboon</li>
	 * 	<li>Ballista</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Bear</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Bireme</li>
	 * 	<li>Boar</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Catapult</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Chieroballista</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crocodile</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Crowned Crane</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Deer</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Elephant</li>
	 * 	<li>Elk</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Fire Siphon</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Gazelle</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Giant Duck-billed Platypus</li>
	 * 	<li>Giraffe</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Helepolis</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippo</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hyena</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Lion</li>
	 * 	<li>Longboat</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Monkey</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petrobolos</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Polar Bear</li>
	 * 	<li>Polaris</li>
	 * 	<li>Portable Ram</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raft</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Rhinoceros of Set</li>
	 * 	<li>Rhinocerous</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Siege Tower</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Titan Prometheus</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Trireme</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>Walrus</li>
	 * 	<li>War Elephant</li>
	 * 	<li>Water Buffalo</li>
	 * 	<li>Wolf</li>
	 * 	<li>Wolf Arctic</li>
	 * 	<li>Wolf Arctic 2</li>
	 * 	<li>Zebra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeAffectedByChaos LogicalTypeAffectedByChaos
	 * @see #LogicalTypeAffectedByHealingSpring LogicalTypeAffectedByHealingSpring
	 * @see #LogicalTypeAffectedByHeroize LogicalTypeAffectedByHeroize
	 * @see #LogicalTypeAffectedByRestoration LogicalTypeAffectedByRestoration
	 * @see #LogicalTypeAffectedByTownBell LogicalTypeAffectedByTownBell
	 * @see #LogicalTypeAffectedByVortex LogicalTypeAffectedByVortex
	 */
	public int LogicalTypeAffectedByFrostGiant=977;

	/**
	 * Indicates that this protounit can be petrified by Perseus.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Argus</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hydra</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Nidhogg</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raven</li>
	 * 	<li>Roc</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Troll</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeCanBeStoned LogicalTypeCanBeStoned
	 */
	public int LogicalTypePerseusCanStone=978;

	/**
	 * Indicates that this protounit can be converted into a Minion by a Mummy.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Argus</li>
	 * 	<li>Audrey</li>
	 * 	<li>Audrey Water</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Axeman</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Camelry</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hydra</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Lancer</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Maceman</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Peltast</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Raven</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Roc</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scout</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Theris</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Troll</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 */
	public int LogicalTypeMummyMinionTarget=979;

	/**
	 * Indicates that this protounit is a Teleporter.
	 * 
	 * <ul>
	 * 	<li>Sky Passage</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Well of Urd</li>
	 * </ul>
	 */
	public int Teleporter=980;

	/**
	 * Indicates that this protounit screams when pulled into a spiderweb.
	 * 
	 * <ul>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Axeman</li>
	 * 	<li>Camelry</li>
	 * 	<li>Cataphract</li>
	 * 	<li>Chariot Archer</li>
	 * 	<li>Crossbowman</li>
	 * 	<li>Forkboy</li>
	 * 	<li>Hero Greek Hippolyta</li>
	 * 	<li>Hero Norse</li>
	 * 	<li>Hetairoi</li>
	 * 	<li>Hippikon</li>
	 * 	<li>Hoplite</li>
	 * 	<li>Huskarl</li>
	 * 	<li>Hypaspist</li>
	 * 	<li>Jarl</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Lancer</li>
	 * 	<li>Maceman</li>
	 * 	<li>Mercenary</li>
	 * 	<li>Mercenary Cavalry</li>
	 * 	<li>Militia</li>
	 * 	<li>Myrmidon</li>
	 * 	<li>Peltast</li>
	 * 	<li>Prodromos</li>
	 * 	<li>Raiding Cavalry</li>
	 * 	<li>Recognizer</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Scout</li>
	 * 	<li>Skraeling</li>
	 * 	<li>Slinger</li>
	 * 	<li>Spearman</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Throwing Axeman</li>
	 * 	<li>Toxotes</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Ulfsark</li>
	 * 	<li>War Elephant</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeScreamsOnSpiderPull=981;

	/**
	 * Indicates that this protounit can be Timeshifted.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fortress</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Volcano</li>
	 * 	<li>Weapons</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeTimeshift=982;

	/**
	 * Indicates that this protounit cannot be attacked by Gaia's units.
	 * 
	 * <ul>
	 * 	<li>Tartarian Gate</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeInvulnerableToGaia=983;

	/**
	 * Indicates that this protounit will be avoided when Easy Military Select in enabled.
	 * 
	 * <ul>
	 * 	<li>Caravan Atlantean</li>
	 * 	<li>Caravan Egyptian</li>
	 * 	<li>Caravan Greek</li>
	 * 	<li>Caravan Norse</li>
	 * 	<li>Caribou</li>
	 * 	<li>Cow</li>
	 * 	<li>Dwarf</li>
	 * 	<li>Female</li>
	 * 	<li>Fishing Ship Atlantean</li>
	 * 	<li>Fishing Ship Egyptian</li>
	 * 	<li>Fishing Ship Greek</li>
	 * 	<li>Fishing Ship Norse</li>
	 * 	<li>Goat</li>
	 * 	<li>Golden Fleece</li>
	 * 	<li>Old Man</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Ox Cart</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Pig</li>
	 * 	<li>Raven</li>
	 * 	<li>Scout</li>
	 * 	<li>Villager Atlantean</li>
	 * 	<li>Villager Atlantean Hero</li>
	 * 	<li>Villager Egyptian</li>
	 * 	<li>Villager Greek</li>
	 * 	<li>Villager Norse</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeEasySelectAvoid=984;

	/**
	 * Indicates that this protounit is a Building but not a Titan Gate.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Gate</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Atlantis Wall Connector</li>
	 * 	<li>Atlantis Wall Long</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Farm</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Invisible Target</li>
	 * 	<li>Invisible Wall</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Troy Gate</li>
	 * 	<li>Troy Wall Connector</li>
	 * 	<li>Troy Wall Long</li>
	 * 	<li>Troy Wall Short</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Wall Connector</li>
	 * 	<li>Wall Long</li>
	 * 	<li>Wall Medium</li>
	 * 	<li>Wall Short</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #Building Building
	 * @see #LogicalTypeBuildingsNotHouses LogicalTypeBuildingsNotHouses
	 * @see #LogicalTypeBuildingsNotWalls LogicalTypeBuildingsNotWalls
	 * 
	 * @since AoT
	 */
	public int LogicalTypeBuildingNotTitanGate=985;

	/**
	 * Indicates that this protounit is a Building but not a Wall.
	 * 
	 * <ul>
	 * 	<li>Academy</li>
	 * 	<li>Animal Attractor</li>
	 * 	<li>Archery Range</li>
	 * 	<li>Armory</li>
	 * 	<li>Atlantis Tile</li>
	 * 	<li>Bandit Migdol</li>
	 * 	<li>Barracks</li>
	 * 	<li>Barracks Atlantean</li>
	 * 	<li>Barrel</li>
	 * 	<li>Bolder Rolling</li>
	 * 	<li>Bolder Rolling 2</li>
	 * 	<li>Bolder Rolling Dead</li>
	 * 	<li>Bolder Rolling Small</li>
	 * 	<li>Bolder Wall</li>
	 * 	<li>Bridge</li>
	 * 	<li>Broken Siege Weapons</li>
	 * 	<li>Citadel Center</li>
	 * 	<li>Construction Extra Large</li>
	 * 	<li>Construction Large</li>
	 * 	<li>Construction Medium</li>
	 * 	<li>Construction Small</li>
	 * 	<li>Counter Building</li>
	 * 	<li>Crate</li>
	 * 	<li>Crate Small</li>
	 * 	<li>Dig Pile</li>
	 * 	<li>Dock</li>
	 * 	<li>Dwarf Foundry</li>
	 * 	<li>Dwarven Forge</li>
	 * 	<li>Earth</li>
	 * 	<li>Excavation</li>
	 * 	<li>Fence Iron</li>
	 * 	<li>Fence Stone</li>
	 * 	<li>Fence Wood</li>
	 * 	<li>Fortress</li>
	 * 	<li>Fountain</li>
	 * 	<li>Gaia Pool</li>
	 * 	<li>Gate Ram</li>
	 * 	<li>Gate Ram 2</li>
	 * 	<li>Gate Ram Destroyed</li>
	 * 	<li>Granary</li>
	 * 	<li>Great Box</li>
	 * 	<li>Guild</li>
	 * 	<li>Hades Door</li>
	 * 	<li>Hades Door Small</li>
	 * 	<li>Healing Spring Object</li>
	 * 	<li>Hesperides Tree</li>
	 * 	<li>Hill Fort</li>
	 * 	<li>House</li>
	 * 	<li>Invisible Gate</li>
	 * 	<li>Jail Wall</li>
	 * 	<li>Lighthouse</li>
	 * 	<li>Longhouse</li>
	 * 	<li>Lumber Camp</li>
	 * 	<li>Manor</li>
	 * 	<li>Market</li>
	 * 	<li>Market Stall</li>
	 * 	<li>Migdol Stronghold</li>
	 * 	<li>Mining Camp</li>
	 * 	<li>Monument</li>
	 * 	<li>Monument 2</li>
	 * 	<li>Monument 3</li>
	 * 	<li>Monument 4</li>
	 * 	<li>Monument 5</li>
	 * 	<li>Naval Shipyard</li>
	 * 	<li>Obelisk</li>
	 * 	<li>Odins Tower</li>
	 * 	<li>Outpost</li>
	 * 	<li>Palace</li>
	 * 	<li>Plenty Vault</li>
	 * 	<li>Plenty Vault KOTH</li>
	 * 	<li>Poseidon Statue</li>
	 * 	<li>Roc Tent</li>
	 * 	<li>Settlement</li>
	 * 	<li>Settlement Level 1</li>
	 * 	<li>Shrine</li>
	 * 	<li>Siege Camp</li>
	 * 	<li>Sky Passage</li>
	 * 	<li>Stable</li>
	 * 	<li>Statue Chimera</li>
	 * 	<li>Statue Cyclops</li>
	 * 	<li>Statue Hydra</li>
	 * 	<li>Statue Lion Left</li>
	 * 	<li>Statue Lion Right</li>
	 * 	<li>Statue Manticore</li>
	 * 	<li>Statue Nemean Lion</li>
	 * 	<li>Statue of Automaton</li>
	 * 	<li>Statue of Major God</li>
	 * 	<li>Statue of Melagius</li>
	 * 	<li>Statue Pharaoh</li>
	 * 	<li>Statue Valkyrie</li>
	 * 	<li>Storehouse</li>
	 * 	<li>Summoning Tree</li>
	 * 	<li>Summoning Tree 2</li>
	 * 	<li>Taproot</li>
	 * 	<li>Tartarian Gate</li>
	 * 	<li>Tartarian Gate birth</li>
	 * 	<li>Tartarian Gate placement</li>
	 * 	<li>Temple</li>
	 * 	<li>Temple Kronos</li>
	 * 	<li>Temple Overgrown</li>
	 * 	<li>Temple Underworld</li>
	 * 	<li>Tent</li>
	 * 	<li>Titan Gate</li>
	 * 	<li>Torch</li>
	 * 	<li>Tower</li>
	 * 	<li>Tower Mirror</li>
	 * 	<li>Tree Finale</li>
	 * 	<li>Trojan Horse</li>
	 * 	<li>Tunnel</li>
	 * 	<li>Underworld Passage SPC</li>
	 * 	<li>Volcano</li>
	 * 	<li>Weapons</li>
	 * 	<li>Well of Urd</li>
	 * 	<li>Wonder</li>
	 * 	<li>Wonder SPC</li>
	 * </ul>
	 * 
	 * @see #Building Building
	 * @see #LogicalTypeBuildingNotTitanGate LogicalTypeBuildingNotTitanGate
	 * @see #LogicalTypeBuildingsNotHouses LogicalTypeBuildingsNotHouses
	 */
	public int LogicalTypeBuildingsNotWalls=986;

	/**
	 * Indicates that this protounit won't use its Flail animation when thrown.
	 * 
	 * <ul>
	 * 	<li>Tartarian Gate spawn</li>
	 * </ul>
	 * 
	 * @see #LogicalTypeCanBeThrown LogicalTypeCanBeThrown
	 * 
	 * @since AoT 
	 */
	public int LogicalTypeNoFlailOnThrow=987;

	/**
	 * Indicates that this protounit can escape its frozen state when heroized.
	 * 
	 * <ul>
	 * 	<li>Archer Atlantean</li>
	 * 	<li>Javelin Cavalry</li>
	 * 	<li>Lancer</li>
	 * 	<li>Maceman</li>
	 * 	<li>Oracle Scout</li>
	 * 	<li>Royal Guard</li>
	 * 	<li>Swordsman</li>
	 * 	<li>Trident Soldier</li>
	 * 	<li>Villager Atlantean</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeEscapesFrostOnTransform=988;

	/**
	 * Indicates that this protounit is an Animal of Set.
	 * 
	 * <ul>
	 * 	<li>Ape of Set</li>
	 * 	<li>Crocodile of Set</li>
	 * 	<li>Gazelle of Set</li>
	 * 	<li>Giraffe of Set</li>
	 * 	<li>Hippo of Set</li>
	 * 	<li>Hyena of Set</li>
	 * 	<li>Rhinoceros of Set</li>
	 * </ul>
	 */
	public int SetAnimal=989;

	/**
	 * Indicates that this protounit is a Myth Unit but not a Titan.
	 * 
	 * <ul>
	 * 	<li>Anubite</li>
	 * 	<li>Argus</li>
	 * 	<li>Automaton</li>
	 * 	<li>Automaton SPC</li>
	 * 	<li>Avenger</li>
	 * 	<li>Battle Boar</li>
	 * 	<li>Behemoth</li>
	 * 	<li>Bella</li>
	 * 	<li>Carcinos</li>
	 * 	<li>Centaur</li>
	 * 	<li>Chimera</li>
	 * 	<li>Colossus</li>
	 * 	<li>Cyclops</li>
	 * 	<li>Dryad</li>
	 * 	<li>Egyptian Vulture</li>
	 * 	<li>Einheriar</li>
	 * 	<li>Fenris Wolf</li>
	 * 	<li>Fimbulwinter Wolf</li>
	 * 	<li>Fire Giant</li>
	 * 	<li>Flying Medic</li>
	 * 	<li>Frost Giant</li>
	 * 	<li>Harpy</li>
	 * 	<li>Heka Gigantes</li>
	 * 	<li>Hippocampus</li>
	 * 	<li>Hydra</li>
	 * 	<li>Jormund Elver</li>
	 * 	<li>Kraken</li>
	 * 	<li>Kraken SPC</li>
	 * 	<li>Kronny</li>
	 * 	<li>Kronny Flying</li>
	 * 	<li>Lampades</li>
	 * 	<li>Leviathan</li>
	 * 	<li>Man O War</li>
	 * 	<li>Manticore</li>
	 * 	<li>Medusa</li>
	 * 	<li>Minion</li>
	 * 	<li>Minotaur</li>
	 * 	<li>Mountain Giant</li>
	 * 	<li>Mummy</li>
	 * 	<li>Nemean Lion</li>
	 * 	<li>Nereid</li>
	 * 	<li>Ornlu</li>
	 * 	<li>Pegasus</li>
	 * 	<li>Petsuchos</li>
	 * 	<li>Phoenix</li>
	 * 	<li>Phoenix Egg</li>
	 * 	<li>Phoenix From Egg</li>
	 * 	<li>Polaris</li>
	 * 	<li>Promethean</li>
	 * 	<li>Promethean Small</li>
	 * 	<li>Raven</li>
	 * 	<li>Roc</li>
	 * 	<li>Satyr</li>
	 * 	<li>Scarab</li>
	 * 	<li>Scorpion Man</li>
	 * 	<li>Scylla</li>
	 * 	<li>Sea Snake</li>
	 * 	<li>Sea Turtle</li>
	 * 	<li>Serpent</li>
	 * 	<li>Servant</li>
	 * 	<li>Sphinx</li>
	 * 	<li>Spider</li>
	 * 	<li>Stymphalian Bird</li>
	 * 	<li>Tartarian Gate spawn</li>
	 * 	<li>Theris</li>
	 * 	<li>Troll</li>
	 * 	<li>Valkyrie</li>
	 * 	<li>Wadjet</li>
	 * 	<li>Walking Berry Bush</li>
	 * 	<li>Walking Woods Marsh</li>
	 * 	<li>Walking Woods Oak</li>
	 * 	<li>Walking Woods Palm</li>
	 * 	<li>Walking Woods Pine</li>
	 * 	<li>Walking Woods Pine Snow</li>
	 * 	<li>Walking Woods Savannah</li>
	 * 	<li>Walking Woods Tundra</li>
	 * </ul>
	 * 
	 * @see #MythUnit MythUnit
	 * @see #AbstractTitan AbstractTitan
	 * 
	 * @since AoT
	 */
	public int LogicalTypeMythUnitNotTitan=990;

	/**
	 * Indicates that this protounit is a Ship but not a Fishing Ship.
	 * 
	 * <ul>
	 * 	<li>Bireme</li>
	 * 	<li>Charon Ferry</li>
	 * 	<li>Fire Ship Atlantean</li>
	 * 	<li>Ghost Ship</li>
	 * 	<li>Hero Greek Argo</li>
	 * 	<li>Kebenit</li>
	 * 	<li>Longboat</li>
	 * 	<li>Monkey Raft</li>
	 * 	<li>Pirate Ship</li>
	 * 	<li>Raft</li>
	 * 	<li>Ramming Ship Egyptian</li>
	 * 	<li>Ramming Ship Greek</li>
	 * 	<li>Ramming Ship Norse</li>
	 * 	<li>Shipwreck</li>
	 * 	<li>Siege Ship Atlantean</li>
	 * 	<li>Siege Ship Egyptian</li>
	 * 	<li>Siege Ship Greek</li>
	 * 	<li>Siege Ship Norse</li>
	 * 	<li>Transport Ship Atlantean</li>
	 * 	<li>Transport Ship Egyptian</li>
	 * 	<li>Transport Ship Greek</li>
	 * 	<li>Transport Ship Norse</li>
	 * 	<li>Trireme</li>
	 * </ul>
	 * 
	 * @see #UtilityShip UtilityShip
	 * @see #Ship Ship
	 * 
	 * @note That spelling error is official.
	 */
	public int LogicalTypeShipNotFishinghip=991;

	/**
	 * An {@link aom.scripting.xs.kb.UnitType#AbstractVillager Abstract Villager} that's not a hero.
	 * 
	 * @since AoT
	 */
	public int LogicalTypeAbstractVillNotHero=992;

	/**
	 * Indicates that this protounit is some kind of House.
	 * 
	 * <ul>
	 * 	<li>House</li>
	 * 	<li>Manor</li>
	 * </ul>
	 * 
	 * @since AoT
	 */
	public int LogicalTypeHouses=993;

	/**
	 * Indicates that this protounit is a Gate.
	 * 
	 * <ul>
	 * 	<li>Gate</li>
	 * </ul>
	 */
	public int LogicalTypeGates=994;
}