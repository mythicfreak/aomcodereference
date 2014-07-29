package aom.scripting.ui.console;

import aom.scripting.datatypes.bool;
import aom.scripting.datatypes.string;

/**
 * This class provides a collection of Console commands concerning Units.
 * The concept of "units" is very broad: it is not limited to just regular units.
 * Also buildings, SFX effects etc. are included.
 * 
 * A unit always has an ID and is of a certain protounit type.
 * 
 * @author Mythic_Freak - mythic.freak[a]gmail.com
 */
public class Unit {
	private Unit() {}

	/** 
	 * Spews database values on the specified unit or the selected unit if no argument.
	 *
	 * @deprecated
	 * 
	 * @local
	 */
	public native void unitData(int UnitID);

	/**
	 * Sets the current variation of the given UnitID (current selected unit(s) if unitID is -1).
	 * 
	 * @local 
	 * 
	 * @editor
	 */
	public native void unitSetVariation(int variation, int unitID);

	/**
	 * Increments the current variation of the given unitID (current selected unit(s) if unitID is -1).
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void unitIncVariation(int unitID);

	/** 
	 * Decrements the current variation of the given unitID (current selected unit(s) if unitID is -1).
	 * 
	 * @local
	 * 
	 * @editor
	 */
	public native void unitSetVariation(int unitID);

	/** 
	 * Sets the unit stance for all selected units to aggressive.
	 * 
	 * @sync
	 */
	public native void unitSetStanceAggressive();

	/** 
	 * Sets the unit stance for all selected units to defensive.
	 * 
	 * @sync
	 */
	public native void unitSetStanceDefensive();

	/** 
	 * Sets the unit stance for all selected units to passive.
	 * 
	 * @sync
	 */
	public native void unitSetStancePassive();

	/** 
	 * Sets the formation for all selected units to line.
	 * 
	 * @sync
	 */
	public native void unitSetFormationDefault();

	/** 
	 * Sets the formation for all selected units to box.
	 * 
	 * @sync
	 */
	public native void unitSetFormationBox();

	/** 
	 * Sets the formation for all selected units to mixed.
	 * 
	 * @sync
	 */
	public native void unitSetFormationMixed();

	/**
	 * Sets the formation for all selected units to spread.
	 * 
	 * @sync
	 */
	public native void unitSetFormationSpread();

	/** 
	 * Issues a town bell for the selected unit(s).
	 * 
	 * @sync
	 */
	public native void unitTownBell();

	/** 
	 * Issues a return to work for the selected unit(s).
	 * 
	 * @sync
	 */
	public native void unitReturnToWork();

	/** 
	 * Sets the cursor to a ProtoUnitID.
	 * 
	 * @local
	 */
	public native void uiSetProtoID(int type);

	/** Increments the variation to place.*/
	public native void uiIncPlaceVariation();

	/** Decrements the variation to place.*/
	public native void uiDecPlaceVariation();
	
	/** 
	 * Sets the cursor to a ProtoUnit.
	 * 
	 * @local
	 */
	public native void uiSetProtoCursor(string protoName, bool setPlacement);

	/** 
	 * Sets the cursor to a ProtoUnit.
	 * 
	 * @local
	 */
	public native void uiSetProtoCursorID(int protoID);

	/** 
	 * Resets the cursor back to the basic pointer.
	 * 
	 * @local
	 */
	public native void uiClearCursor();
	
	/** 
	 * Instructs the currently selected unit(s) to build the currently active cursor protounit at the pointer location.
	 * This is typically used in game to build buildings.
	 * It is however not limited to buildings, and can be used to place units too.
	 * 
	 * @sync
	 * 
	 * @see #uiSetProtoCursor(string, bool)
	 * @see #uiPlaceAtPointer(bool)
	 */
	public native void uiBuildAtPointer();
	
	/**
	 * Places the currently active cursor protounit.
	 * 
	 * @editor This is typically used to place units in the editor.
	 * 
	 * @sync 
	 * 
	 * @see #uiSetProtoCursor(string, bool)
	 * @see #uiBuildAtPointer()
	 */
	public native void uiPlaceAtPointer(bool changeVariation);
	
	/** 
	 * Indicates that the yaw unit right key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiYawUnitRight(int keyState);

	/** 
	 * Indicates that the yaw unit left key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiYawUnitLeft(int keyState);

	/** 
	 * Indicates that the pitch unit down key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiPitchUnitDown(int keyState);

	/** 
	 * Indicates that the pitch unit up key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiPitchUnitUp(int keyState);

	/** 
	 * Indicates that the roll unit right key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiRollUnitRight(int keyState);

	/** 
	 * Indicates that the roll unit left key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiRollUnitLeft(int keyState);

	/** 
	 * Indicates that the move unit forward key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitForward(int keyState);

	/** 
	 * Indicates that the move unit backward key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitBackward(int keyState);

	/** 
	 * Indicates that the move unit right key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitRight(int keyState);

	/** 
	 * Indicates that the move unit left key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitLeft(int keyState);

	/** 
	 * Indicates that the move unit up key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitUp(int keyState);

	/** 
	 * Indicates that the move unit down key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiMoveUnitDown(int keyState);

	/** Rotate placed unit with wheel, i.e. intended to be mapped to wheel.*/
	public native void uiWheelRotatePlacedUnit();
	
	/** 
	 * Transforms the selected unit into the specified ProtoUnit.
	 * 
	 * @sync 	This command can be used to manually transfer a series of bits to other players
	 * 			by converting gatherers in ulfsarks or walls in gates and back.
	 */
	public native void uiTransformSelectedUnit(string protoName);
	
	/** 
	 * Shows how many ProtoUnits that are alive in the scenario.
	 * 
	 * @deprecated
	 * 
	 * @local
	 */
	public native int protoCount(string typeName);
	
	/** 
	 * Toggles whether the current building does repeat building on its train queue.
	 * 
	 * @sync
	 * 
	 * @since AoT
	 */
	public native void uiToggleBuildingQueue();

	/** 
	 * Issues a command to all workers to work on the currently selected building.
	 * 
	 * @sync
	 */
	public native void uiSummonWorkersToSelectedUnit();
	
	/** 
	 * Start the training of a unit of ProtoUnitID from TrainingUnitID.
	 * 
	 * If no player is specified, the current one is used.
	 * 
	 * @sync
	 */
	public native void trainByID(int protoUnitID, int trainingUnitID, int playerID);

	/** 
	 * Tries to train the selected unit type in any valid selected unit.
	 * 
	 * @note No algorithm to properly distribute the production over all buildings is used.
	 * 
	 * @sync
	 */
	public native void trainInSelected(string protoName, int traincount);
	
	/** 
	 * Just like trainInSelected, but more abbreviated.
	 * 
	 * @sync
	 */
	public native void tis(string protoName, int traincount);

	/** 
	 * Just like trainInSelected, but more abbreviated because it takes a protoID.
	 * 
	 * @sync
	 */
	public native void tisID(int protoID, int traincount);

	/** 
	 * Cancels the training of a unit from TrainingUnitID at the given index.
	 *  
	 * If no player is specified, the current one is used.
	 * 
	 * @sync
	 */
	public native void trainCancelByButtonIndex(int buttonIndex, int trainingUnitID, int playerID);
	
	/**
	 * Deletes selected unit. This is the default in-game action when the delete button is pressed.
	 * 
	 * @sync
	 */
	public native void uiDeleteSelectedUnit(int keyState);

	/** 
	 * Removes specified unit, or selected unit if not ID is specified.
	 * This is the default action in the editor when the delete button is pressed.
	 */
	public native void uiRemoveSelectedUnit(int unitID);

	/** 
	 * Stop selected units.
	 * 
	 * @sync
	 */
	public native void uiStopSelectedUnits();

	/** 
	 * Enter unbuild mode with selected building.
	 * 
	 * @local
	 */
	public native void uiUnbuildSelectedUnit();

	/** 
	 * Actually unbuild selected building.
	 * 
	 * @sync
	 */
	public native void uiUnbuildSelectedUnitAtPointer();

	/** 
	 * Indicates that the unit scale down key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiScaleUnitDown(int keyState);

	/** 
	 * Indicates that the unit scale up key has gone up/down.
	 * 
	 * @single
	 */
	public native void uiScaleUnitUp(int keyState);
	
	/**
	 * Issues a work (e.g. walk to, empower, garrison, attack, ...) at pointer location.
	 * 
	 * @sync
	 */
	public native void uiWorkAtPointer();
	
	/** 
	 * Rotates the selected unit.
	 */
	public native void uiRotateSelection();
	
	/**
	 * Indicates that the delete units button has gone up/down.
	 */
	public native void uiDeleteUnits(int keyState);
	
	
}
