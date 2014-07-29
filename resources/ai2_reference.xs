//=============================================================================
// AOMX AI Constants.txt created at Mon Aug 11 11:46:23 2003
//
//
// NOTE: All constants are subject to change with any Database or Code changes.
//=============================================================================


//Player/Game:
const vector cInvalidVector=vector(-1.0, -1.0, -1.0);
const vector cOriginVector=vector(0.0, 0.0, 0.0);
const int cNumberPlayers=3;
const string cFilename="AoMXaiLoader";
const int cMyID=2;
const string cMyName="Skiringsaal";
const int cMyCulture=2;
const int cMyCiv=8;
const string cRandomMapName="midgard";

//Unit Stances:
const int cUnitStanceAggressive=0;
const int cUnitStanceDefensive=1;
const int cUnitStancePassive=2;

//Victory Condition/Game Mode Types:
const int cGameModeSupremacy=0;
const int cGameModeConquest=1;
const int cGameModeLightning=2;
const int cGameModeDeathmatch=3;

//Difficulty Levels:
const int cDifficultyEasy=0;
const int cDifficultyModerate=1;
const int cDifficultyHard=2;
const int cDifficultyNightmare=3;

//Age Constants:
const int cAge1=0;
const int cAge2=1;
const int cAge3=2;
const int cAge4=3;
const int cAge5=4;

//Player Relation Constants:
const int cPlayerRelationAny=-1;
const int cPlayerRelationSelf=0;
const int cPlayerRelationEnemy=2;
const int cPlayerRelationAlly=1;

//Resource Gatherer Preferences:
const int cRGPScript=0;
const int cRGPCost=1;
const int cRGPActual=2;

//Resource Subtypes:
const int cAIResourceSubTypeEasy=0;
const int cAIResourceSubTypeHunt=1;
const int cAIResourceSubTypeHuntAggressive=2;
const int cAIResourceSubTypeFarm=3;
const int cAIResourceSubTypeFish=4;
const int cAIResourceSubTypeTrade=5;

//Escrow IDs:
const int cRootEscrowID=0;
const int cEconomyEscrowID=1;
const int cMilitaryEscrowID=2;

//Plan Types:
const int cPlanMove=0;
const int cPlanAttack=1;
const int cPlanBuild=2;
const int cPlanTrain=3;
const int cPlanResearch=4;
const int cPlanWork=5;
const int cPlanGather=6;
const int cPlanExplore=7;
const int cPlanData=8;
const int cPlanProgression=9;
const int cPlanBuildWall=10;
const int cPlanFarm=11;
const int cPlanHunt=12;
const int cPlanHuntAggressive=13;
const int cPlanFish=14;
const int cPlanHerd=15;
const int cPlanEmpower=16;
const int cPlanTransport=17;
const int cPlanDropoffResource=18;
const int cPlanGatherRelic=19;
const int cPlanAttackStrategy=20;
const int cPlanGodPower=21;
const int cPlanDefend=22;
const int cPlanReserve=23;
const int cPlanGoal=24;
const int cPlanTower=25;
const int cPlanGatherGoal=26;
const int cPlanRepair=27;
const int cPlanTrade=28;

//Plan States:
const int cPlanStateNone=0;
const int cPlanStateDone=1;
const int cPlanStateFailed=2;
const int cPlanStateBuild=3;
const int cPlanStateGather=4;
const int cPlanStatePlace=5;
const int cPlanStateExplore=6;
const int cPlanStateTrain=7;
const int cPlanStateResearch=8;
const int cPlanStateAttack=9;
const int cPlanStateGoto=10;
const int cPlanStateEmpower=11;
const int cPlanStateEnter=12;
const int cPlanStateExit=13;
const int cPlanStateEvaluate=14;
const int cPlanStatePatrol=15;
const int cPlanStateRetreat=16;
const int cPlanStateWorking=17;
const int cPlanStateTransport=18;
const int cPlanStateDualPlace=19;
const int cPlanStateWait=20;
const int cPlanStateCast=21;
const int cPlanStateVillagerAttack=22;
const int cPlanStateUnknown=23;

//Plan Events:
const int cPlanEventDone=0;
const int cPlanEventFailed=1;
const int cPlanEventPoll=2;
const int cPlanEventIdle=3;

//Gather Plan Variables:
const int cGatherPlanMaximumDistance=0;
const int cGatherPlanMaximumWalkDistance=1;
const int cGatherPlanKBResourceID=2;
const int cGatherPlanAutoBuildDropsite=3;
const int cGatherPlanResourceID=4;
const int cGatherPlanResourceType=5;
const int cGatherPlanResourceSubType=6;
const int cGatherPlanBreakDownID=7;
const int cGatherPlanDropsiteTimeLimit=8;
const int cGatherPlanDropsiteTime=9;
const int cGatherPlanDropsiteID=10;
const int cGatherPlanDropsitePUID=11;

//Build Plan Variables:
const int cBuildPlanBuildingPlacementID=0; (RO=0, AC=1).
const int cBuildPlanBuildingTypeID=1; (RO=0, AC=1).
const int cBuildPlanInfluenceUnitTypeID=2; (RO=0, AC=1).
const int cBuildPlanInfluenceUnitDistance=3; (RO=0, AC=1).
const int cBuildPlanInfluenceUnitValue=4; (RO=0, AC=1).
const int cBuildPlanAreaID=5; (RO=0, AC=1).
const int cBuildPlanCenterPosition=6; (RO=0, AC=1).
const int cBuildPlanCenterPositionDistance=7; (RO=0, AC=1).
const int cBuildPlanBuildUnitID=8; (RO=0, AC=1).
const int cBuildPlanFoundationID=9; (RO=0, AC=0).
const int cBuildPlanInfluencePosition=10; (RO=0, AC=1).
const int cBuildPlanInfluencePositionDistance=11; (RO=0, AC=1).
const int cBuildPlanInfluencePositionValue=12; (RO=0, AC=1).
const int cBuildPlanDockPlacementPoint=13; (RO=0, AC=1).
const int cBuildPlanNumAreaBorderLayers=14; (RO=0, AC=1).
const int cBuildPlanBuildingBufferSpace=15; (RO=0, AC=1).
const int cBuildPlanSettlementPlacementPoint=16; (RO=0, AC=1).
const int cBuildPlanFailOnUnaffordable=17; (RO=0, AC=1).
const int cBuildPlanInfluenceKBResourceID=18; (RO=0, AC=1).
const int cBuildPlanRandomBPValue=19; (RO=0, AC=1).
const int cBuildPlanInfluenceAtBuilderPosition=20; (RO=0, AC=1).
const int cBuildPlanInfluenceBuilderPositionValue=21; (RO=0, AC=1).
const int cBuildPlanInfluenceBuilderPositionDistance=22; (RO=0, AC=1).
const int cBuildPlanRetries=23; (RO=0, AC=1).
const int cBuildPlanMaxRetries=24; (RO=0, AC=1).
const int cBuildPlanPendingCommands=25; (RO=0, AC=1).
const int cBuildPlanFailureCause=26; (RO=1, AC=1).
const int cBuildPlanFailureCauseFloat=27; (RO=1, AC=1).
const int cBuildPlanMaxCanPaths=28; (RO=1, AC=1).
const int cBuildPlanCanPathStartIndex=29; (RO=0, AC=1).

//Train Plan Variables:
const int cTrainPlanBuildingID=0; (RO=0, AC=1).
const int cTrainPlanIntoArmyID=1; (RO=0, AC=1).
const int cTrainPlanIntoPlanID=2; (RO=0, AC=1).
const int cTrainPlanIntoBaseID=3; (RO=0, AC=1).
const int cTrainPlanNumberToTrain=4; (RO=0, AC=1).
const int cTrainPlanNumberToMaintain=5; (RO=0, AC=1).
const int cTrainPlanNumberTrained=6; (RO=1, AC=1).
const int cTrainPlanUnitType=7; (RO=0, AC=1).
const int cTrainPlanBuildFromType=8; (RO=0, AC=1).
const int cTrainPlanTrainedUnitID=9; (RO=1, AC=0).
const int cTrainPlanFrequency=10; (RO=0, AC=1).
const int cTrainPlanUseMultipleBuildings=11; (RO=0, AC=1).
const int cTrainPlanGatherPoint=12; (RO=0, AC=1).
const int cTrainPlanGatherTargetID=13; (RO=0, AC=1).
const int cTrainPlanMaintainBaseID=14; (RO=0, AC=1).
const int cTrainPlanMaintainAreaID=15; (RO=0, AC=1).

//Explore Plan Variables:
const int cExplorePlanLOSMultiplier=0; (RO=0, AC=1).
const int cExplorePlanDoLoops=1; (RO=0, AC=1).
const int cExplorePlanDoneLoops=2; (RO=1, AC=1).
const int cExplorePlanNumberOfLoops=3; (RO=0, AC=1).
const int cExplorePlanPointsInLoop=4; (RO=0, AC=1).
const int cExplorePlanAvoidingAttackedAreas=5; (RO=0, AC=1).
const int cExplorePlanReExploreAreas=6; (RO=1, AC=1).
const int cExplorePlanLOSProtoUnitID=7; (RO=1, AC=1).
const int cExplorePlanBuildPosition=8; (RO=1, AC=1).
const int cExplorePlanBuilderUnitType=9; (RO=1, AC=1).
const int cExplorePlanCanBuildLOSProto=10; (RO=0, AC=1).
const int cExplorePlanHandleDamageTime=11; (RO=1, AC=1).
const int cExplorePlanHandleDamageFrequency=12; (RO=0, AC=1).
const int cExplorePlanQuitWhenPointIsVisible=13; (RO=0, AC=1).
const int cExplorePlanQuitWhenPointIsVisiblePt=14; (RO=0, AC=1).
const int cExplorePlanOracleExplore=15; (RO=0, AC=1).

//Research Plan Variables:
const int cResearchPlanBuildingID=0; (RO=0, AC=1).
const int cResearchPlanBuildingTypeID=1; (RO=0, AC=1).
const int cResearchPlanTechID=2; (RO=0, AC=1).
const int cResearchPlanBuildingAbstractTypeID=3; (RO=0, AC=1).

//Attack Plan Variables:
const int cAttackPlanPlayerID=0; (RO=0, AC=1).
const int cAttackPlanSpecificTargetID=1; (RO=0, AC=0).
const int cAttackPlanTargetTypeID=2; (RO=0, AC=0).
const int cAttackPlanQueryID=3; (RO=0, AC=0).
const int cAttackPlanAttackRouteID=4; (RO=0, AC=1).
const int cAttackPlanAttackRoutePattern=5; (RO=0, AC=1).
const int cAttackPlanGatherPoint=6; (RO=0, AC=1).
const int cAttackPlanGatherDistance=7; (RO=0, AC=1).
const int cAttackPlanTargetID=8; (RO=1, AC=0).
const int cAttackPlanMoveAttack=9; (RO=0, AC=1).
const int cAttackPlanNumberAttacks=10; (RO=1, AC=1).
const int cAttackPlanRefreshFrequency=11; (RO=0, AC=1).
const int cAttackPlanLastRefreshTime=12; (RO=1, AC=1).
const int cAttackPlanHandleDamageTime=13; (RO=1, AC=1).
const int cAttackPlanHandleDamageFrequency=14; (RO=0, AC=1).
const int cAttackPlanBaseAttackMode=15; (RO=0, AC=1).
const int cAttackPlanPathID=16; (RO=0, AC=1).
const int cAttackPlanFromGoalID=17; (RO=0, AC=1).
const int cAttackPlanRetreatMode=18; (RO=0, AC=1).
const int cAttackPlanTargetAreaGroups=19; (RO=0, AC=0).
const int cAttackPlanTeleportLocation=20; (RO=1, AC=1).
const int cAttackPlanAutoUseGPs=21; (RO=0, AC=1).
const int cAttackPlanPowerID=22; (RO=1, AC=1).
const int cAttackPlanGatherStartTime=23; (RO=1, AC=1).
const int cAttackPlanDestTeleporterID=24; (RO=0, AC=0).
const int cAttackPlanSrceTeleporterID=25; (RO=0, AC=0).
const int cAttackPlanAttackRoutePatternLRU=0;
const int cAttackPlanAttackRoutePatternMRU=1;
const int cAttackPlanAttackRoutePatternRandom=2;
const int cAttackPlanAttackRoutePatternBest=3;
const int cAttackPlanBaseAttackModeNone=0;
const int cAttackPlanBaseAttackModeWeakest=1;
const int cAttackPlanBaseAttackModeStrongest=2;
const int cAttackPlanBaseAttackModeLRU=3;
const int cAttackPlanBaseAttackModeMRU=4;
const int cAttackPlanBaseAttackModeRandom=5;
const int cAttackPlanBaseAttackModeClosest=6;
const int cAttackPlanBaseAttackModeFarthest=7;
const int cAttackPlanRetreatModeNone=0;
const int cAttackPlanRetreatModeOutnumbered=1;
const int cAttackPlanRetreatModeWillLose=2;

//Progression Plan Variables:
const int cProgressionPlanPollingTime=0; (RO=0, AC=1).
const int cProgressionPlanProgressionID=1; (RO=0, AC=1).
const int cProgressionPlanTrainUnitAtEnd=2; (RO=0, AC=1).
const int cProgressionPlanNumGoalUnitsToBuild=3; (RO=0, AC=1).
const int cProgressionPlanGoalUnitID=4; (RO=0, AC=1).
const int cProgressionPlanGoalTechID=5; (RO=0, AC=1).
const int cProgressionPlanBuildAreaID=6; (RO=0, AC=1).
const int cProgressionPlanCurrentGoalID=7; (RO=0, AC=1).
const int cProgressionPlanCurrentGoalType=8; (RO=0, AC=1).
const int cProgressionPlanCurrentStep=9; (RO=0, AC=1).
const int cProgressionPlanCurrentStepPlanID=10; (RO=0, AC=1).
const int cProgressionPlanPaused=11; (RO=0, AC=1).
const int cProgressionPlanAdvanceOneStep=12; (RO=0, AC=1).
const int cProgressionPlanRunInParallel=13; (RO=0, AC=1).
const int cProgressionPlanChildProgressions=14; (RO=0, AC=0).
const int cProgressionPlanBuildingPref=15; (RO=0, AC=1).

//Build Wall Plan Variables:
const int cBuildWallPlanWallType=0; (RO=0, AC=1).
const int cBuildWallPlanWallStart=1; (RO=0, AC=1).
const int cBuildWallPlanWallEnd=2; (RO=0, AC=1).
const int cBuildWallPlanWallRingCenterPoint=3; (RO=0, AC=1).
const int cBuildWallPlanWallRingRadius=4; (RO=0, AC=1).
const int cBuildWallPlanNumberOfGates=5; (RO=0, AC=1).
const int cBuildWallPlanAreaIDs=6; (RO=0, AC=1).
const int cBuildWallPlanFoundationID=7; (RO=0, AC=1).
const int cBuildWallPlanGateIndices=8; (RO=0, AC=1).
const int cBuildWallPlanGateProtoIDs=9; (RO=0, AC=1).
const int cBuildWallPlanEdgeOfMapBuffer=10; (RO=0, AC=1).
const int cBuildWallPlanPieces=11; (RO=1, AC=1).
const int cBuildWallPlanPiecePositions=12; (RO=1, AC=1).
const int cBuildWallPlanPieceRotations=13; (RO=1, AC=1).
const int cBuildWallPlanEnRoute=14; (RO=0, AC=1).

//Build Wall Plan Wall Types:
const int cBuildWallPlanWallTypeStraight=0;
const int cBuildWallPlanWallTypeRing=1;
const int cBuildWallPlanWallTypeArea=2;

//Herd Plan Variables:
const int cHerdPlanBuildingID=0;
const int cHerdPlanBuildingTypeID=1;
const int cHerdPlanDistance=2;

//Farm Plan Variables:
const int cFarmPlanDropsiteTypeID=0;
const int cFarmPlanDropsiteID=1;
const int cFarmPlanFarmingPosition=2;
const int cFarmPlanAutoBuildDropsite=3;
const int cFarmPlanResourceID=4;
const int cFarmPlanBreakDownID=5;
const int cFarmPlanResourceType=6;
const int cFarmPlanResourceSubType=7;
const int cFarmPlanFarmID=8;

//Empower Plan Variables:
const int cEmpowerPlanTargetID=0;
const int cEmpowerPlanTargetTypeID=1;

//Fish Plan Variables:
const int cFishPlanLandPoint=0; (RO=0, AC=1).
const int cFishPlanWaterPoint=1; (RO=0, AC=1).
const int cFishPlanLandGroupID=2; (RO=0, AC=1).
const int cFishPlanWaterGroupID=3; (RO=0, AC=1).
const int cFishPlanAutoTrainBoats=4; (RO=0, AC=1).
const int cFishPlanNumberInTraining=5; (RO=0, AC=1).
const int cFishPlanDockID=6; (RO=0, AC=1).
const int cFishPlanMaximumDockDist=7; (RO=0, AC=1).
const int cFishPlanPlaceRetries=8; (RO=0, AC=1).
const int cFishPlanMaxPlaceRetries=9; (RO=0, AC=1).

//Transport Plan Variables:
const int cTransportPlanTransportID=0; (RO=0, AC=1).
const int cTransportPlanTransportTypeID=1; (RO=0, AC=1).
const int cTransportPlanGatherPoint=2; (RO=0, AC=1).
const int cTransportPlanTargetPoint=3; (RO=0, AC=1).
const int cTransportPlanGatherAreaGroup=4; (RO=0, AC=1).
const int cTransportPlanTargetAreaGroup=5; (RO=0, AC=1).
const int cTransportPlanGatherArea=6; (RO=0, AC=1).
const int cTransportPlanTargetArea=7; (RO=0, AC=1).
const int cTransportPlanPathType=8; (RO=0, AC=1).
const int cTransportPlanPathPlanned=9; (RO=0, AC=1).
const int cTransportPlanReturnWhenDone=10; (RO=0, AC=1).
const int cTransportPlanMaximizeXportMovement=11; (RO=0, AC=1).
const int cTransportPlanUnitsMoved=12; (RO=0, AC=0).
const int cTransportPlanIgnoreAreaIDs=13; (RO=0, AC=1).
const int cTransportPlanBestDangerArea=14; (RO=0, AC=1).
const int cTransportPlanBestDangerValue=15; (RO=0, AC=1).
const int cTransportPlanDropOffPoint=16; (RO=0, AC=1).
const int cTransportPlanPersistent=17; (RO=0, AC=1).
const int cTransportPlanMiddleAreaGroups=18; (RO=0, AC=0).
const int cTransportPlanTakeMoreUnits=19; (RO=0, AC=1).

//Repair Plan Variables:
const int cRepairPlanTargetID=0; (RO=0, AC=1).
const int cRepairPlanIsTitanGate=1; (RO=0, AC=1).

//Trade Plan Variables:
const int cTradePlanTargetUnitTypeID=0; (RO=0, AC=1).
const int cTradePlanTargetUnitID=1; (RO=0, AC=1).
const int cTradePlanStartPosition=2; (RO=0, AC=1).
const int cTradePlanTradeUnitType=3; (RO=0, AC=1).
const int cTradePlanTradeUnitTypeMax=4; (RO=0, AC=1).
const int cTradePlanMarketID=5; (RO=0, AC=1).

//Dropoff Resource Plan Variables:
const int cDropoffResourcePlanBuildingID=0;
const int cDropoffResourcePlanBuildingTypeID=1;

//Gather Relic Plan Variables:
const int cGatherRelicPlanDropsiteID=0; (RO=0, AC=1).
const int cGatherRelicPlanDropsiteTypeID=1; (RO=0, AC=1).
const int cGatherRelicPlanTargetID=2; (RO=0, AC=1).
const int cGatherRelicPlanTargetTypeID=3; (RO=0, AC=1).
const int cGatherRelicPlanTargetPosition=4; (RO=0, AC=1).
const int cGatherRelicPlanPickingUp=5; (RO=0, AC=1).

//Attack Strategy Plan Variables:
const int cAttackStrategyPlanPlayerID=0; (RO=0, AC=0).
const int cAttackStrategyPlanNumberTotalAttacks=1; (RO=1, AC=1).

//Defend Plan Variables:
const int cDefendPlanDefendTargetID=0; (RO=0, AC=0).
const int cDefendPlanDefendAreaID=1; (RO=0, AC=0).
const int cDefendPlanDefendBaseID=2; (RO=0, AC=0).
const int cDefendPlanDefendPoint=3; (RO=0, AC=0).
const int cDefendPlanEngageRange=4; (RO=0, AC=1).
const int cDefendPlanPatrol=5; (RO=0, AC=1).
const int cDefendPlanPatrolWaypoint=6; (RO=0, AC=0).
const int cDefendPlanCurrentWaypoint=7; (RO=0, AC=1).
const int cDefendPlanTargetID=8; (RO=1, AC=0).
const int cDefendPlanGatherDistance=9; (RO=0, AC=1).
const int cDefendPlanRefreshFrequency=10; (RO=0, AC=1).
const int cDefendPlanLastRefreshTime=11; (RO=1, AC=1).
const int cDefendPlanAttackTypeID=12; (RO=0, AC=0).
const int cDefendPlanGatherPercentage=13; (RO=0, AC=1).

//Reserve Plan Variables:
const int cReservePlanPlanType=0; (RO=0, AC=0).

//Goal Plan Variables:
const int cGoalPlanGoalType=0; (RO=0, AC=1).
const int cGoalPlanGoalSubType=1; (RO=0, AC=1).
const int cGoalPlanMinTime=2; (RO=0, AC=1).
const int cGoalPlanMaxTime=3; (RO=0, AC=1).
const int cGoalPlanMinAge=4; (RO=0, AC=1).
const int cGoalPlanMaxAge=5; (RO=0, AC=1).
const int cGoalPlanRepeat=6; (RO=0, AC=1).
const int cGoalPlanExecuteCount=7; (RO=0, AC=1).
const int cGoalPlanDoneGoal=8; (RO=0, AC=0).
const int cGoalPlanFailGoal=9; (RO=0, AC=0).
const int cGoalPlanExecuteGoal=10; (RO=0, AC=0).
const int cGoalPlanAutoUpdateState=11; (RO=0, AC=1).
const int cGoalPlanAutoUpdateBase=12; (RO=0, AC=1).
const int cGoalPlanAutoUpdateAttackPlayerID=13; (RO=0, AC=1).
const int cGoalPlanTargetType=14; (RO=0, AC=1).
const int cGoalPlanTarget=15; (RO=0, AC=1).
const int cGoalPlanTargetPoint=16; (RO=0, AC=1).
const int cGoalPlanTargetNumber=17; (RO=0, AC=1).
const int cGoalPlanMinUnitNumber=18; (RO=0, AC=1).
const int cGoalPlanMaxUnitNumber=19; (RO=0, AC=1).
const int cGoalPlanUnitPickerID=20; (RO=0, AC=1).
const int cGoalPlanUnitPickerFrequency=21; (RO=0, AC=1).
const int cGoalPlanUnitPickerTime=22; (RO=0, AC=1).
const int cGoalPlanAttackPlayerID=23; (RO=0, AC=1).
const int cGoalPlanAttackStartFrequency=24; (RO=0, AC=1).
const int cGoalPlanAttackStartTime=25; (RO=0, AC=1).
const int cGoalPlanUnitTypeID=26; (RO=0, AC=0).
const int cGoalPlanBaseID=27; (RO=0, AC=0).
const int cGoalPlanAllowRetreat=28; (RO=0, AC=1).
const int cGoalPlanUpgradeBuilding=29; (RO=0, AC=1).
const int cGoalPlanSetAreaGroups=30; (RO=0, AC=1).
const int cGoalPlanIdleAttack=31; (RO=0, AC=1).
const int cGoalPlanAreaGroupID=32; (RO=0, AC=0).
const int cGoalPlanFunctionID=33; (RO=0, AC=0).
const int cGoalPlanFunctionParm=34; (RO=0, AC=0).
const int cGoalPlanBuildingTypeID=35; (RO=0, AC=0).
const int cGoalPlanBuildingPlacementID=36; (RO=0, AC=0).
const int cGoalPlanBuildingSearchID=37; (RO=0, AC=0).
const int cGoalPlanActiveHealthTypeID=38; (RO=0, AC=1).
const int cGoalPlanActiveHealth=39; (RO=0, AC=1).
const int cGoalPlanAttackRoutePatternType=40; (RO=0, AC=1).
const int cGoalPlanUpgradeFilterType=41; (RO=0, AC=1).

//Goal Plan Goal Types:
const int cGoalPlanGoalTypeForwardBase=0;
const int cGoalPlanGoalTypeCreateBase=1;
const int cGoalPlanGoalTypeMainBase=2;
const int cGoalPlanGoalTypeAttack=3;
const int cGoalPlanGoalTypeDefend=4;
const int cGoalPlanGoalTypeTrain=5;
const int cGoalPlanGoalTypeMaintain=6;
const int cGoalPlanGoalTypeResearch=7;
const int cGoalPlanGoalTypeAge=8;
const int cGoalPlanGoalTypeCallback=9;
const int cGoalPlanGoalTypeBuilding=10;
const int cGoalPlanGoalTypeBuildSettlement=11;

//Goal Plan Goal Sub Types:
const int cGoalPlanGoalSubTypeEmpty1=0;
const int cGoalPlanGoalSubTypeEmpty2=1;

//Goal Plan Target Types:
const int cGoalPlanTargetTypeArea=0;
const int cGoalPlanTargetTypeAreaGroup=1;
const int cGoalPlanTargetTypePoint=2;
const int cGoalPlanTargetTypeUnitType=3;
const int cGoalPlanTargetTypeUnit=4;
const int cGoalPlanTargetTypePlayer=5;
const int cGoalPlanTargetTypePlayerRelation=6;
const int cGoalPlanTargetTypeTech=7;

//Tower Plan Variables:
const int cTowerPlanCenterLocation=0; (RO=0, AC=1).
const int cTowerPlanAreaID=1; (RO=0, AC=1).
const int cTowerPlanDistanceFromCenter=2; (RO=0, AC=1).
const int cTowerPlanMaximizeLOS=3; (RO=0, AC=1).
const int cTowerPlanMaximizeAttack=4; (RO=0, AC=1).
const int cTowerPlanNumberToBuild=5; (RO=0, AC=1).
const int cTowerPlanBuildLocations=6; (RO=1, AC=1).
const int cTowerPlanProtoIDToBuild=7; (RO=0, AC=1).
const int cTowerPlanAttackLOSModifier=8; (RO=0, AC=1).
const int cTowerPlanLOSModifier=9; (RO=0, AC=1).

//Gather Goal Plan Variables:
const int cGatherGoalPlanScriptRPGPct=0; (RO=0, AC=1).
const int cGatherGoalPlanCostRPGPct=1; (RO=0, AC=1).
const int cGatherGoalPlanGathererPct=2; (RO=0, AC=1).
const int cGatherGoalPlanNumFoodPlans=3; (RO=0, AC=1).
const int cGatherGoalPlanNumWoodPlans=4; (RO=0, AC=1).
const int cGatherGoalPlanNumGoldPlans=5; (RO=0, AC=1).
const int cGatherGoalPlanNumFavorPlans=6; (RO=0, AC=1).
const int cGatherGoalPlanMinResourceAmt=7; (RO=0, AC=1).
const int cGatherGoalPlanResourceCostWeight=8; (RO=0, AC=1).
const int cGatherGoalPlanFarmLimitPerPlan=9; (RO=0, AC=1).
const int cGatherGoalPlanMaxFarmLimit=10; (RO=0, AC=1).
const int cGatherGoalPlanResourceSkew=11; (RO=0, AC=1).

//ProtoPower Constants:
const int cPowerLure=0;
const int cPowerCarnivora=1;
const int cPowerBlessingofZeus=2;
const int cPowerBolt=3;
const int cPowerBronzeXP05=4;
const int cPowerBronze=5;
const int cPowerCeaseFireNomad=6;
const int cPowerCeaseFire=7;
const int cPowerChangeCaladria=8;
const int cPowerChangeChimera=9;
const int cPowerChangeCyclops=10;
const int cPowerChangeHydra=11;
const int cPowerChangeManticore=12;
const int cPowerChangeNemean=13;
const int cPowerChaos=14;
const int cPowerChickenStorm=15;
const int cPowerCitadel=16;
const int cPowerDwarvenMine=17;
const int cPowerCurse=18;
const int cPowerEarthquake=19;
const int cPowerEclipse=20;
const int cPowerFlamingWeapons=21;
const int cPowerForestFire=22;
const int cPowerFrost=23;
const int cPowerGaiaForestSPC=24;
const int cPowerGaiaForest=25;
const int cPowerGoatunheim=26;
const int cPowerGreatHunt=27;
const int cPowerHealingSpring=28;
const int cPowerHeroize=29;
const int cPowerHesperides=30;
const int cPowerImplode=31;
const int cPowerLightningStorm=32;
const int cPowerLocustSwarm=33;
const int cPowerMeteor=34;
const int cPowerNidhogg=35;
const int cPowerPestilence=36;
const int cPowerPlenty=37;
const int cPowerProsperity=38;
const int cPowerRagnorok=39;
const int cPowerRain=40;
const int cPowerRestoration=41;
const int cPowerDeconstruction=42;
const int cPowerReverseWonder=43;
const int cPowerShiftingSands=44;
const int cPowerSeedofGaia=45;
const int cPowerSentinel=46;
const int cPowerPlagueofSerpents=47;
const int cPowerAncestors=48;
const int cPowerFimbulwinter=49;
const int cPowerSonofOsiris=50;
const int cPowerSPCLightningStorm=51;
const int cPowerSPCMeteor=52;
const int cPowerSpiders=53;
const int cPowerSpy=54;
const int cPowerTartarianGate=55;
const int cPowerTitanGate=56;
const int cPowerTornadoXP05=57;
const int cPowerTornado=58;
const int cPowerTraitors=59;
const int cPowerTraitorsSPC=60;
const int cPowerTremor=61;
const int cPowerUndermine=62;
const int cPowerUnderworldPassage=63;
const int cPowerVision=64;
const int cPowerVolcano=65;
const int cPowerVortex=66;
const int cPowerWalkingBerryBushes=67;
const int cPowerWalkingWoods=68;
const int cPowerWellOfUrd=69;

//Power Type Constants:
const int cPowerTypeGeneric=0;
const int cPowerTypeTempUnit=1;
const int cPowerTypeLightning=2;
const int cPowerTypeFrost=3;
const int cPowerTypeLocust=4;
const int cPowerTypeTeleport=5;
const int cPowerTypeMeteor=6;
const int cPowerTypeInferno=7;
const int cPowerTypeHealing=8;
const int cPowerTypeEnrage=9;
const int cPowerTypeClone=10;
const int cPowerTypeDamageUnit=11;
const int cPowerTypeTornado=12;
const int cPowerTypeRain=13;
const int cPowerTypeUndermine=14;
const int cPowerTypeSnowStorm=15;
const int cPowerTypeBronze=16;
const int cPowerTypePeace=17;
const int cPowerTypeProsperity=18;
const int cPowerTypeEclipse=19;
const int cPowerTypeShowUnit=20;
const int cPowerTypeBolt=21;
const int cPowerTypeSpy=22;
const int cPowerTypeTechActivate=23;
const int cPowerTypeAnimalMagnet=24;
const int cPowerTypeHealingSpring=25;
const int cPowerTypeSwapUnit=26;
const int cPowerTypeRebellion=27;
const int cPowerTypeSandstorm=28;
const int cPowerTypeEarthquake=29;
const int cPowerTypePlenty=30;
const int cPowerTypeForestFire=31;
const int cPowerTypeFlamingWeapons=32;
const int cPowerTypeDwarvenMines=33;
const int cPowerTypePestilence=34;
const int cPowerTypeReverseTime=35;
const int cPowerTypeTraitors=36;
const int cPowerTypeVolcano=37;
const int cPowerTypeTremor=38;
const int cPowerTypeTartarianGate=39;
const int cPowerTypeVortex=40;
const int cPowerTypeHesperides=41;
const int cPowerTypeChaos=42;
const int cPowerTypeSpiders=43;
const int cPowerTypeHeroize=44;
const int cPowerTypeImplode=45;
const int cPowerTypeTitanGate=46;
const int cPowerTypeGaiaForest=47;
const int cPowerTypeCarnivora=48;

//God Power Plan Variables:
const int cGodPowerPlanPowerTechID=0; (RO=0, AC=1).
const int cGodPowerPlanPowerProtoID=1; (RO=1, AC=1).
const int cGodPowerPlanCastNow=2; (RO=0, AC=1).
const int cGodPowerPlanAutoCast=3; (RO=0, AC=1).
const int cGodPowerPlanTargetingModel=4; (RO=0, AC=1).
const int cGodPowerPlanTargetLocation=5; (RO=0, AC=1).
const int cGodPowerPlanTargetUnit=6; (RO=0, AC=0).
const int cGodPowerPlanAttackPlanID=7; (RO=0, AC=1).
const int cGodPowerPlanResourceType=8; (RO=0, AC=0).
const int cGodPowerPlanEvaluationModel=9; (RO=0, AC=1).
const int cGodPowerPlanCount=10; (RO=0, AC=0).
const int cGodPowerPlanBPID=11; (RO=0, AC=0).
const int cGodPowerPlanBPBufferSpace=12; (RO=0, AC=1).
const int cGodPowerPlanDistance=13; (RO=0, AC=0).
const int cGodPowerPlanTargetHintLocation=14; (RO=1, AC=0).
const int cGodPowerPlanUnitTypeID=15; (RO=0, AC=1).
const int cGodPowerPlanType=16; (RO=1, AC=1).
const int cGodPowerPlanQueryID=17; (RO=0, AC=0).
const int cGodPowerPlanBuildingPlacementDistance=18; (RO=0, AC=1).
const int cGodPowerPlanBPInfluence=19; (RO=0, AC=0).
const int cGodPowerPlanBPInfluenceValue=20; (RO=0, AC=0).
const int cGodPowerPlanBPInfluenceDistance=21; (RO=0, AC=0).
const int cGodPowerPlanBPLocationPreference=22; (RO=0, AC=0).
const int cGodPowerPlanResourceSubType=23; (RO=0, AC=0).
const int cGodPowerPlanResourceFilterHuntable=24; (RO=0, AC=0).
const int cGodPowerPlanResourceFilterTotal=25; (RO=0, AC=0).
const int cGodPowerPlanQueryHitpointFilter=26; (RO=0, AC=0).
const int cGodPowerPlanTargetHintUnitID=27; (RO=1, AC=0).
const int cGodPowerPlanQueryPlayerID=28; (RO=0, AC=1).
const int cGodPowerPlanQueryPlayerRelation=29; (RO=0, AC=0).
const int cGodPowerPlanExplorePlanID=30; (RO=1, AC=0).
const int cGodPowerPlanCastAttempts=31; (RO=1, AC=1).
const int cGodPowerPlanCheckVisibility=32; (RO=0, AC=1).
const int cGodPowerPlanNotification=33; (RO=1, AC=1).
const int cGodPowerPlanDoNotWaitForNotification=34; (RO=0, AC=1).
const int cGodPowerPlanTownDefensePlan=35; (RO=0, AC=1).
const int cGodPowerPlanQueryLocation=36; (RO=0, AC=1).
const int cGodPowerPlanUnbuildBuilding=37; (RO=0, AC=0).
const int cGodPowerPlanUnbuildProto=38; (RO=0, AC=0).
const int cGodPowerPlanMultiCast=39; (RO=0, AC=1).

//GodPower Targeting Models:
const int cGodPowerTargetingModelUnit=0;
const int cGodPowerTargetingModelLocation=1;
const int cGodPowerTargetingModelDualUnit=2;
const int cGodPowerTargetingModelDualLocation=3;
const int cGodPowerTargetingModelWorld=4;
const int cGodPowerTargetingModelTown=5;
const int cGodPowerTargetingModelAttachedPlanLocation=6;
const int cGodPowerTargetingModelTownCenter=7;
const int cGodPowerTargetingModelMilitaryGatherPoint=8;
const int cGodPowerTargetingModelNearbyUnitType=9;
const int cGodPowerTargetingModelDualPlace=10;
const int cGodPowerTargetingModelUnbuild=11;

//GodPower Evaluation Models:
const int cGodPowerEvaluationModelNone=0;
const int cGodPowerEvaluationModelWorkers=1;
const int cGodPowerEvaluationModelCombatDistance=2;
const int cGodPowerEvaluationModelCombatDistanceSelf=3;
const int cGodPowerEvaluationModelQuery=4;
const int cGodPowerEvaluationModelKBResource=5;
const int cGodPowerEvaluationModelCombatDistancePosition=6;

//GodPower Plan Types:
const int cGodPowerPlanTypeDefault=0;
const int cGodPowerPlanTypeRequiresAttackPlan=1;

//Transport PathTypes:
const int cTransportPathTypePoints=0;
const int cTransportPathTypeAreas=1;

//Resign Types:
const int cResignGatherers=0;
const int cResignSettlements=1;
const int cResignTeammates=2;
const int cResignMilitaryPop=3;

//Unit Movement Types:
const int cMovementTypeNone=0;
const int cMovementTypeLand=1;
const int cMovementTypeWater=2;
const int cMovementTypeAir=4;
const int cMovementTypeNonSolid=8;

//KB Unit States:
const int cUnitStateNone=0;
const int cUnitStateBuilding=1;
const int cUnitStateAlive=2;
const int cUnitStateDead=4;
const int cUnitStateAny=255;
const int cUnitStateAliveOrBuilding=3;

//Building Placement Events:
const int cBuildingPlacementEventDone=0;
const int cBuildingPlacementEventFailed=1;

//Unit Query Constants:
const int cUnitQueryNoArmy=-1;
const int cUnitQueryInvalidArmy=-1002;

//Building Placement Preferences:
const int cBuildingPlacementPreferenceNone=-1;
const int cBuildingPlacementPreferenceBack=0;
const int cBuildingPlacementPreferenceFront=1;
const int cBuildingPlacementPreferenceLeft=2;

//Civs:
const int cCivZeus=0;
const int cCivPoseidon=1;
const int cCivHades=2;
const int cCivIsis=3;
const int cCivRa=4;
const int cCivSet=5;
const int cCivOdin=6;
const int cCivThor=7;
const int cCivLoki=8;
const int cCivKronos=9;
const int cCivOuranos=10;
const int cCivGaia=11;
const int cCivRandom=12;
const int cCivGreek=13;
const int cCivNorse=14;
const int cCivEgyptian=15;
const int cCivAtlantean=16;
const int cCivNature=17;

//Cultures:
const int cCultureGreek=0;
const int cCultureEgyptian=1;
const int cCultureNorse=2;
const int cCultureAtlantean=3;
const int cCultureNature=4;

//Resources:
const int cResourceGold=0;
const int cResourceWood=1;
const int cResourceFood=2;
const int cResourceFavor=3;
const int cAllResources=-1234;

//Unit Action Constants:
const int cActionBored=0;
const int cActionBuild=1;
const int cActionConvert=2;
const int cActionDeath=3;
const int cActionDecay=4;
const int cActionGather=5;
const int cActionHandAttack=6;
const int cActionHeal=7;
const int cActionHunting=8;
const int cActionIdle=9;
const int cActionMove=10;
const int cActionMoveByGroup=11;
const int cActionRangedAttack=12;
const int cActionRepair=13;
const int cActionResearch=14;
const int cActionTrain=15;
const int cActionOverrideAnimation=16;
const int cActionWork=17;
const int cActionAttack=18;
const int cActionUnused0=19;
const int cActionWander=20;
const int cActionEnter=21;
const int cActionAutoConvert=22;
const int cActionBirth=23;
const int cActionAreaAttack=24;
const int cActionFreeze=25;
const int cActionDormant=26;
const int cActionGatherPoint=27;
const int cActionMoveAttack=28;
const int cActionThrown=29;
const int cActionLightning=30;
const int cActionLight=31;
const int cActionJumpAttack=32;
const int cActionUnused1=33;
const int cActionMeteor=34;
const int cActionAttach=35;
const int cActionGuide=36;
const int cActionJumpMove=37;
const int cActionPickup=38;
const int cActionDiveBomb=39;
const int cActionUnused2=40;
const int cActionRegenerate=41;
const int cActionUse=42;
const int cActionEmpower=43;
const int cActionAutoGather=44;
const int cActionThrow=45;
const int cActionGore=46;
const int cActionDropoff=47;
const int cActionWhirlwindAttack=48;
const int cActionChargedRangedAttack=49;
const int cActionEject=50;
const int cActionFreezeAttack=51;
const int cActionConvertAttack=52;
const int cActionTrade=53;
const int cActionGuard=54;
const int cActionAutoMover=55;
const int cActionGetOnMover=56;
const int cActionSwallow=57;
const int cActionGate=58;
const int cActionLightningAttack=59;
const int cActionExplore=60;
const int cActionEat=61;
const int cActionBoost=62;
const int cActionCorpseDecay=63;
const int cActionTeleport=64;
const int cActionBuckAttack=65;
const int cActionTownBell=66;
const int cActionHeroDeath=67;
const int cActionUnbuild=68;
const int cActionAutoLOS=69;

//Tech Status:
const int cTechStatusUnobtainable=0;
const int cTechStatusObtainable=1;
const int cTechStatusAvailable=2;
const int cTechStatusResearching=3;
const int cTechStatusActive=4;
const int cTechStatusPersistent=5;

//Attack Routes:
const int cAttackRouteFrontRight=0;
const int cAttackRouteRightFront=1;
const int cAttackRouteRightBack=2;
const int cAttackRouteBackRight=3;
const int cAttackRouteBackLeft=4;
const int cAttackRouteLeftBack=5;
const int cAttackRouteLeftFront=6;
const int cAttackRouteFrontLeft=7;

//Area Types:
const int cAreaTypeForest=1;
const int cAreaTypeWater=2;
const int cAreaTypeImpassableLand=3;
const int cAreaTypeGold=4;
const int cAreaTypeSettlement=5;

//AreaGroup Types:
const int cAreaGroupTypeLand=0;
const int cAreaGroupTypeWater=1;

//KB TechTree Unit Functions:
const int cUnitFunctionBuilder=0;
const int cUnitFunctionGatherer=1;
const int cUnitFunctionEmpower=2;
const int cUnitFunctionFish=3;
const int cUnitFunctionWaterTransport=4;
const int cUnitFunctionTrade=5;
const int cUnitFunctionUnknown=6;

//KB TechTree Upgrade Types:
const int cUpgradeTypeAttack=0;
const int cUpgradeTypeArmor=1;
const int cUpgradeTypeHitpoints=2;
const int cUpgradeTypeSpeed=3;
const int cUpgradeTypeWorkRate=4;
const int cUpgradeTypeTrainPoints=5;
const int cUpgradeTypeAny=6;

//KB TechTree Progression:
const int cProgressionTechNode=0;
const int cProgressionUnitNode=1;

//Wall Types:
const int cWallTypeStraight=0;
const int cWallTypeRing=1;
const int cWallTypeArea=2;



//Communications Constants:

//Response Types:
const int cAICommResponseNoneRequired=0;
const int cAICommResponseWaiting=1;
const int cAICommResponseYes=2;
const int cAICommResponseNo=3;
const int cAICommResponseIncomingOrder=4;

//AI Chat Types:
const int cAICommRecordPrompt=0;
const int cAICommRecordOrder=1;
const int cAICommRecordStatement=2;

//Prompt Types:
const int cAICommPromptNone=0;
const int cAICommPromptAIBuildSettlement=1;
const int cAICommPromptAIResignGatherers=2;
const int cAICommPromptAIResignSettlements=3;
const int cAICommPromptAIResignActiveEnemies=4;
const int cAICommPromptIntro=5;
const int cAICommPromptGenericGodPower=6;
const int cAICommPromptOffensiveGodPower=7;
const int cAICommPromptEconomicGodPower=8;
const int cAICommPromptAILostSettlement=9;
const int cAICommPromptAILostLastSettlement=10;
const int cAICommPromptEnemyBuildSettlement=11;
const int cAICommPromptEnemyLostSettlement=12;
const int cAICommPromptEnemyLostLastSettlement=13;
const int cAICommPromptAIWinningAgeRace=14;
const int cAICommPromptAILosingAgeRace=15;
const int cAICommPromptAIWonderDestroyed=16;
const int cAICommPromptPlayerWonderDestroyed=17;
const int cAICommPromptPlayerBuildingWalls=18;
const int cAICommPromptAIAttack=19;
const int cAICommPromptAIAttackHere=20;
const int cAICommPromptAIRetreat=21;
const int cAICommPromptHelpHere=22;
const int cAICommPromptHelpHome=23;
const int cAICommPromptAITakeWater=24;
const int cAICommPromptTakingEnemyRelic=25;
const int cAICommPromptTakingAllyRelic=26;
const int cAICommPromptResignQuestion=27;

//Techs: 507 total
const int cTechAge1=0;
const int cTechAge2=1;
const int cTechAge3=2;
const int cTechMediumArchers=3;
const int cTechHeavyArchers=4;
const int cTechChampionArchers=5;
const int cTechMediumInfantry=6;
const int cTechHeavyInfantry=7;
const int cTechChampionInfantry=8;
const int cTechHusbandry=9;
const int cTechPlow=10;
const int cTechIrrigation=11;
const int cTechCopperWeapons=12;
const int cTechBronzeWeapons=13;
const int cTechIronWeapons=14;
const int cTechCopperMail=15;
const int cTechBronzeMail=16;
const int cTechIronMail=17;
const int cTechCopperShields=18;
const int cTechBronzeShields=19;
const int cTechIronShields=20;
const int cTechAmbassadors=21;
const int cTechTaxCollectors=22;
const int cTechCoinage=23;
const int cTechMediumCavalry=24;
const int cTechHeavyCavalry=25;
const int cTechChampionCavalry=26;
const int cTechWatchTower=27;
const int cTechGuardTower=28;
const int cTechBallistaTower=29;
const int cTechBoilingOil=30;
const int cTechLevyInfantry=31;
const int cTechBurningPitch=32;
const int cTechMasons=33;
const int cTechPickaxe=34;
const int cTechHandAxe=35;
const int cTechShaftMine=36;
const int cTechBowSaw=37;
const int cTechQuarry=38;
const int cTechCarpenters=39;
const int cTechBravery=40;
const int cTechValleyoftheKings=41;
const int cTechLightningStorm=42;
const int cTechLocustSwarm=43;
const int cTechTornado=44;
const int cTechWinterHarvest=45;
const int cTechSafeguard=46;
const int cTechRampage=47;
const int cTechMithrilBreastplate=48;
const int cTechCallOfValhalla=49;
const int cTechArcticWinds=50;
const int cTechArcticGale=51;
const int cTechWrathOfTheDeep=52;
const int cTechSpiritedCharge=53;
const int cTechThunderingHooves=54;
const int cTechBerserkergang=55;
const int cTechRime=56;
const int cTechFrost=57;
const int cTechDraftHorses=58;
const int cTechEngineers=59;
const int cTechArchitects=60;
const int cTechMeteor=61;
const int cTechBoneBow=62;
const int cTechAxeofVengeance=63;
const int cTechDesertWind=64;
const int cTechEnclosedDeck=65;
const int cTechCladding=66;
const int cTechFortifiedWall=67;
const int cTechAge1Zeus=68;
const int cTechSkinOfTheRhino=69;
const int cTechAge15Egyptian=70;
const int cTechSacredCats=71;
const int cTechGraniteBlood=72;
const int cTechHamarrtroll=73;
const int cTechCriosphinx=74;
const int cTechHieracosphinx=75;
const int cTechMonstrousRage=76;
const int cTechPhobosSpearofPanic=77;
const int cTechBacchanalia=78;
const int cTechSunRay=79;
const int cTechSylvanLore=80;
const int cTechForgeofOlympus=81;
const int cTechAge1Hades=82;
const int cTechAge1Poseidon=83;
const int cTechCreateGold=84;
const int cTechAge1Ra=85;
const int cTechAge1Isis=86;
const int cTechAge1Set=87;
const int cTechAge1Odin=88;
const int cTechAge1Thor=89;
const int cTechAge1Loki=90;
const int cTechAuroraBorealis=91;
const int cTechAge2Athena=92;
const int cTechAge2Ares=93;
const int cTechAge2Hermes=94;
const int cTechAge3Dionysos=95;
const int cTechAge3Apollo=96;
const int cTechAge3Aphrodite=97;
const int cTechAge4Hera=98;
const int cTechAge4Artemis=99;
const int cTechAge4Hephaestus=100;
const int cTechHuntingDogs=101;
const int cTechHandofTalos=102;
const int cTechSarissa=103;
const int cTechAegisShield=104;
const int cTechWingedMessenger=105;
const int cTechAge2Anubis=106;
const int cTechAge2Bast=107;
const int cTechAge2Ptah=108;
const int cTechAge3Hathor=109;
const int cTechAge3Nephthys=110;
const int cTechAge3Sekhmet=111;
const int cTechAge4Thoth=112;
const int cTechAge4Osiris=113;
const int cTechAge4Horus=114;
const int cTechFeetoftheJackal=115;
const int cTechAge4=116;
const int cTechAge2Forseti=117;
const int cTechAge2Heimdall=118;
const int cTechAge2Freyja=119;
const int cTechAge3Skadi=120;
const int cTechAge3Bragi=121;
const int cTechAge3Njord=122;
const int cTechAge4Hel=123;
const int cTechAge4Baldr=124;
const int cTechAge4Tyr=125;
const int cTechSignalFires=126;
const int cTechStoneWall=127;
const int cTechShoulderofTalos=128;
const int cTechSkeletonPower=129;
const int cTechBookofThoth=130;
const int cTechFaceoftheGorgon=131;
const int cTechCitadelWall=132;
const int cTechUnderworldPassage=133;
const int cTechRestoration=134;
const int cTechConscriptInfantry=135;
const int cTechLevyArchers=136;
const int cTechConscriptArchers=137;
const int cTechLevyCavalry=138;
const int cTechConscriptCavalry=139;
const int cTechCarrierPigeons=140;
const int cTechFloodControl=141;
const int cTechPharaohRespawn=142;
const int cTechStartingUnitsNorse=143;
const int cTechStartingUnitsGreek=144;
const int cTechStartingUnitsEgyptian=145;
const int cTechGreatHunt=146;
const int cTechCeaseFire=147;
const int cTechMonument1=148;
const int cTechMonument2=149;
const int cTechMonument3=150;
const int cTechMonument4=151;
const int cTechUndermine=152;
const int cTechDwarvenMail=153;
const int cTechDwarvenShields=154;
const int cTechDwarvenWeapons=155;
const int cTechRain=156;
const int cTechSerpentSpear=157;
const int cTechFloodoftheNile=158;
const int cTechVaultsofErebus=159;
const int cTechLordofHorses=160;
const int cTechOlympicParentage=161;
const int cTechPigSticker=162;
const int cTechLoneWanderer=163;
const int cTechEyesintheForest=164;
const int cTechScallopedAxe=165;
const int cTechRingGiver=166;
const int cTechLongSerpent=167;
const int cTechSwineArray=168;
const int cTechAge15Norse=169;
const int cTechAge15Greek=170;
const int cTechOdinsRavenRespawn=171;
const int cTechSnowStorm=172;
const int cTechHeavyCamelry=173;
const int cTechChampionCamelry=174;
const int cTechBronze=175;
const int cTechPharaohRespawnOsiris=176;
const int cTechNewKingdom=177;
const int cTechMedjay=178;
const int cTechFuneralRites=179;
const int cTechSpiritofMaat=180;
const int cTechCityoftheDead=181;
const int cTechFortifyTownCenter=182;
const int cTechHeroesZeusAge2=183;
const int cTechHeroesZeusAge3=184;
const int cTechHeroesZeusAge4=185;
const int cTechHeroesPoseidonAge2=186;
const int cTechHeroesPoseidonAge3=187;
const int cTechHeroesPoseidonAge4=188;
const int cTechHeroesHadesAge2=189;
const int cTechHeroesHadesAge3=190;
const int cTechHeroesHadesAge4=191;
const int cTechShaduf=192;
const int cTechMonument0=193;
const int cTechRelicAnkhofRa=194;
const int cTechRelicEyeofHorus=195;
const int cTechRelicSistrumofBast=196;
const int cTechRelicHeadofOrpheus=197;
const int cTechRelicRingoftheNibelung=198;
const int cTechRelicStaffofDionysus=199;
const int cTechRelicFettersofFenrir=200;
const int cTechRelicOdinsSpear=201;
const int cTechRelicKitharaofApollo=202;
const int cTechRelicMithrilHorseshoes=203;
const int cTechRelicBowofArtemis=204;
const int cTechRelicWedjatEye=205;
const int cTechRelicNoseoftheSphinx=206;
const int cTechGoldenApples=207;
const int cTechEldhrimnirKettle=208;
const int cTechRelicArrowsofAlfar=209;
const int cTechRelicToothedArrows=210;
const int cTechRelicWandofGambantein=211;
const int cTechProsperity=212;
const int cTechPegasusRelicRespawn=213;
const int cTechRelicGoldenBridleofPegasus=214;
const int cTechEclipse=215;
const int cTechWillofKronos=216;
const int cTechLabyrinthofMinos=217;
const int cTechFlamesofTyphon=218;
const int cTechDivineBlood=219;
const int cTechShaftsofPlague=220;
const int cTechVision=221;
const int cTechBolt=222;
const int cTechSpy=223;
const int cTechFlamingWeapons=224;
const int cTechFlamingWeaponsActive=225;
const int cTechLossofLOS=226;
const int cTechSerpents=227;
const int cTechAnimalMagnetism=228;
const int cTechHealingSpring=229;
const int cTechCurse=230;
const int cTechSentinel=231;
const int cTechSandstorm=232;
const int cTechCitadel=233;
const int cTechWalkingWoods=234;
const int cTechRagnorok=235;
const int cTechNidhogg=236;
const int cTechPlenty=237;
const int cTechSonofOsiris=238;
const int cTechPharaohRespawnCityoftheDead=239;
const int cTechEarthquake=240;
const int cTechAthenianWall=241;
const int cTechHeroesHadesAge1=242;
const int cTechHeroesPoseidonAge1=243;
const int cTechHeroesZeusAge1=244;
const int cTechDwarvenAuger=245;
const int cTechPurseSeine=246;
const int cTechReinforcedHull=247;
const int cTechHuntressAxe=248;
const int cTechForestFire=249;
const int cTechPestilence=250;
const int cTechRelicTriosBow=251;
const int cTechRelicShardofBlueCrystal=252;
const int cTechRelicArmorofAchilles=253;
const int cTechRelicShipofFingernails=254;
const int cTechCrocodopolis=255;
const int cTechLeatherFrameShield=256;
const int cTechElectrumBullets=257;
const int cTechStonesofRedLinen=258;
const int cTechSpearontheHorizon=259;
const int cTechFeral=260;
const int cTechAnastrophe=261;
const int cTechTrierarch=262;
const int cTechThracianHorses=263;
const int cTechRelicShinglesofSteel=264;
const int cTechRelicEyeofOrnlu=265;
const int cTechRelicTuskoftheIronBoar=266;
const int cTechAssignLOS=267;
const int cTechRoarofOrthus=268;
const int cTechAtefCrown=269;
const int cTechConscriptSailors=270;
const int cTechNavalOxybeles=271;
const int cTechEnyosBowofHorror=272;
const int cTechDeimosSwordofDread=273;
const int cTechChampionElephants=274;
const int cTechHallofThanes=275;
const int cTechAdzeofWepwawet=276;
const int cTechSlingsoftheSun=277;
const int cTechRamoftheWestWind=278;
const int cTechSundriedMudBrick=279;
const int cTechFuneralBarge=280;
const int cTechNecropolis=281;
const int cTechDisableArmoryforThor=282;
const int cTechIronMailThor=283;
const int cTechBronzeMailThor=284;
const int cTechBronzeShieldsThor=285;
const int cTechBronzeWeaponsThor=286;
const int cTechIronShieldsThor=287;
const int cTechIronWeaponsThor=288;
const int cTechBurningPitchThor=289;
const int cTechHammeroftheGods=290;
const int cTechMeteoricIronMail=291;
const int cTechDragonscaleShields=292;
const int cTechTusksofApedemak=293;
const int cTechRelicPandorasBox=294;
const int cTechRelicHerasThundercloudShawl=295;
const int cTechRelicHarmoniasNecklace=296;
const int cTechRelicDwarfenCalipers=297;
const int cTechOracle=298;
const int cTechSonsofSleipnir=299;
const int cTechSetAge2Critter=300;
const int cTechSetAge3Critter=301;
const int cTechSetAge4Critter=302;
const int cTechPoseidonHippocampusRespawn=303;
const int cTechEgyptianbuildingbonus=304;
const int cTechOmniscience=305;
const int cTechMediumAxemen=306;
const int cTechHeavyAxemen=307;
const int cTechChampionAxemen=308;
const int cTechMediumSpearmen=309;
const int cTechHeavySpearmen=310;
const int cTechChampionSpearmen=311;
const int cTechHeavyChariots=312;
const int cTechChampionChariots=313;
const int cTechHeavyElephants=314;
const int cTechLevyBarracksSoldiers=315;
const int cTechConscriptBarracksSoldiers=316;
const int cTechLevyMigdolSoldiers=317;
const int cTechConscriptMigdolSoldiers=318;
const int cTechMediumSlingers=319;
const int cTechHeavySlingers=320;
const int cTechChampionSlingers=321;
const int cTechRelicGoldenLions=322;
const int cTechRelicMonkeyHead=323;
const int cTechLevyLonghouseSoldiers=324;
const int cTechConscriptLonghouseSoldiers=325;
const int cTechConscriptHillFortSoldiers=326;
const int cTechLevyHillFortSoldiers=327;
const int cTechThurisazRune=328;
const int cTechGoldenLionsRelicRespawn=329;
const int cTechMonkeyHeadRelicRespawn=330;
const int cTechRelicCanopicJarofImsety=331;
const int cTechRelicTowerofSestus=332;
const int cTechRelicTrojanGateHinge=333;
const int cTechSPCMeteor=334;
const int cTechOdinsFirstRavens=335;
const int cTechHeroesEgyptianAge1=336;
const int cTechWeakenAge1Units=337;
const int cTechSaltAmphora=338;
const int cTechMediumMigdolShadow=339;
const int cTechPoseidonFirstHippocampus=340;
const int cTechTempleofHealing=341;
const int cTechGreatestofFifty=342;
const int cTechCopperMailThor=343;
const int cTechCopperShieldsThor=344;
const int cTechCopperWeaponsThor=345;
const int cTechWeaponoftheTitans=346;
const int cTechAge2Fake=347;
const int cTechAge3Fake=348;
const int cTechAge4Fake=349;
const int cTechCrenellations=350;
const int cTechBlessingofZeus=351;
const int cTechRelicGirdleofHippolyta=352;
const int cTechSharedLOS=353;
const int cTechRelicPygmalionsStatue=354;
const int cTechRelicBlackLotus=355;
const int cTechDeathmatchGreek=356;
const int cTechDeathmatchEgyptian=357;
const int cTechDeathmatchNorse=358;
const int cTechCeasefireEffect=359;
const int cTechNorsebuildingbonus=360;
const int cTechLightningMode=361;
const int cTechFortifiedTents=362;
const int cTechDwarvenShieldsEffect=363;
const int cTechRelicHartersFolly=364;
const int cTechRelicScarabPendant=365;
const int cTechWellofUrd=366;
const int cTechRelicBootsofKickEverything=367;
const int cTechRelicAnvilofHephaestus=368;
const int cTechRelicPeltofArgus=369;
const int cTechRelicOsebergWagon=370;
const int cTechRelicBuhenFlagstone=371;
const int cTechRelicCatoblepasScales=372;
const int cTechRelicTailofCerberus=373;
const int cTechRelicBlanketofEmpressZoe=374;
const int cTechRelicKhopeshofHorus=375;
const int cTechCeaseFireNomad=376;
const int cTechEclipseActive=377;
const int cTechPlentyKOTHenable=378;
const int cTechStartingUnitsThor=379;
const int cTechSetAge1Critter=380;
const int cTechStartingResourcesEgyptian=381;
const int cTechStartingResourcesGreek=382;
const int cTechStartingResourcesNorse=383;
const int cTechRelicReedofNekhebet=384;
const int cTechWeakenTrojanGate=385;
const int cTechBuildTCfaster=386;
const int cTechIncreaseRegeneration=387;
const int cTechChickenStorm=388;
const int cTechWalkingBerryBushes=389;
const int cTechEliteHersir=390;
const int cTechGoatunheim=391;
const int cTechAge1Kronos=392;
const int cTechAge1Gaia=393;
const int cTechStartingUnitsAtlantean=394;
const int cTechAge1Ouranos=395;
const int cTechStartingResourcesAtlantean=396;
const int cTechAge2Okeanus=397;
const int cTechAge2Prometheus=398;
const int cTechAge2Leto=399;
const int cTechAge3Hyperion=400;
const int cTechAge3Rheia=401;
const int cTechAge3Theia=402;
const int cTechAge4Helios=403;
const int cTechAge4Hekate=404;
const int cTechAge4Atlas=405;
const int cTechReverseTime=406;
const int cTechAudrey=407;
const int cTechTraitors=408;
const int cTechChaos=409;
const int cTechVolcano=410;
const int cTechBronzeWall=411;
const int cTechIronWall=412;
const int cTechOreichalkosWall=413; //BUG: Atty walls won't upgrade with progression, use a cPlanResearch instead.
const int cTechTremor=414;
const int cTechHeavyFireship=415;
const int cTechHeartoftheTitans=416;
const int cTechHephaestusRevenge=417;
const int cTechGaiaForest=418;
const int cTechTartarianGate=419;
const int cTechLevyMainlineUnits=420;
const int cTechLevySpecialtyUnits=421;
const int cTechLevyPalaceUnits=422;
const int cTechConscriptMainlineUnits=423;
const int cTechConscriptSpecialtyUnits=424;
const int cTechConscriptPalaceUnits=425;
const int cTechHalooftheSun=426;
const int cTechHornsofConsecration=427;
const int cTechLemurianDescendants=428;
const int cTechChannels=429;
const int cTechAlluvialClay=430;
const int cTechVortex=431;
const int cTechMythicRejuvenation=432;
const int cTechHeroicRenewal=433;
const int cTechReverseWonder=434;
const int cTechBiteoftheShark=435;
const int cTechHesperides=436;
const int cTechHeavyChieroballista=437;
const int cTechSpiders=438;
const int cTechHeroize=439;
const int cTechGemino=440;
const int cTechNorseArmory=441;
const int cTechImplode=442;
const int cTechSecretsoftheTitans=443;
const int cTechTitanGate=444;
const int cTechDisableTitan=445;
const int cTechFocus=446;
const int cTechSafePassage=447;
const int cTechHeroicFleet=448;
const int cTechWeightlessMace=449;
const int cTechEyesofAtlas=450;
const int cTechAsperBlood=451;
const int cTechTitanShield=452;
const int cTechPoseidonsSecret=453;
const int cTechRelicWhirlwindSPC=454;
const int cTechRelicofBronzeSPC=455;
const int cTechRelicofEarthquakeSPC=456;
const int cTechBronzeXP05=457;
const int cTechTornadoXP05=458;
const int cTechRelicTitansTreasure=459;
const int cTechVolcanicForge=460;
const int cTechRelicGaiasBookofKnowledge=461;
const int cTechChangeCyclops=462;
const int cTechChangeChimera=463;
const int cTechChangeCaladria=464;
const int cTechChangeManticore=465;
const int cTechChangeNemean=466;
const int cTechChangeHydra=467;
const int cTechSPCLightningStorm=468;
const int cTechDeathmatchAtlantean=469;
const int cTechMailofOrichalkos=470;
const int cTechHandsofthePharaoh=471;
const int cTechBronzeAll=472;
const int cTechBronzeAllThor=473;
const int cTechCopperAll=474;
const int cTechCopperAllThor=475;
const int cTechIronAll=476;
const int cTechIronAllThor=477;
const int cTechMediumAll=478;
const int cTechHeavyAll=479;
const int cTechChampionAll=480;
const int cTechRheiasGift=481;
const int cTechTimeShiftFake=482;
const int cTechFocusTurbo=483;
const int cTechCelerity=484;
const int cTechSeedofGaia=485;
const int cTechGrantPhoenixEgg=486;
const int cTechIoGuardian=487;
const int cTechDisableAtlanteanFavor=488;
const int cTechTimeShiftFake2=489;
const int cTechAxeofMuspell=490;
const int cTechChampionChieroballista=491;
const int cTechTraitorsSPC=492;
const int cTechSuperRocs=493;
const int cTechBeastSlayer=494;
const int cTechLanceofStone=495;
const int cTechSuddenDeathAtlantean=496;
const int cTechRelicofAncestorsSPC=497;
const int cTechSuperTitanSPC=498;
const int cTechSuperNidhoggSPC=499;
const int cTechPetrified=500;
const int cTechPrometheusWeak=501;
const int cTechPrometheusWeakest=502;
const int cTechAge2AtlanteanHeroes=503;
const int cTechAge4AtlanteanHeroes=504;
const int cTechAge15Atlantean=505;
const int cTechGaiaForestSPC=506;

//Unit Types: 995 total.
const int cUnitTypeHawk=0;
const int cUnitTypePalmStump=1;
const int cUnitTypeBush=2;
const int cUnitTypeArrow=3;
const int cUnitTypeAxe=4;
const int cUnitTypeBlood=5;
const int cUnitTypeScarabBlood=6;
const int cUnitTypeWaypointFlag=7;
const int cUnitTypeMoveto=8;
const int cUnitTypeTestObject=9;
const int cUnitTypeYardstick=10;
const int cUnitTypeSmoke=11;
const int cUnitTypeCloud=12;
const int cUnitTypeTornado=13;
const int cUnitTypeRevealer=14;
const int cUnitTypeAttackRevealer=15;
const int cUnitTypeConstructionSmall=16;
const int cUnitTypeConstructionMedium=17;
const int cUnitTypeConstructionLarge=18;
const int cUnitTypeConstructionExtraLarge=19;
const int cUnitTypeIceBlock=20;
const int cUnitTypePapyrus=21;
const int cUnitTypeWave=22;
const int cUnitTypeRainfall=23;
const int cUnitTypeIceSheet=24;
const int cUnitTypeCamera=25;
const int cUnitTypeCameraMotionArrow=26;
const int cUnitTypeCameraStart=27;
const int cUnitTypeWhale=28;
const int cUnitTypeFirePit=29;
const int cUnitTypeRockSymbols=30;
const int cUnitTypeStalagmite=31;
const int cUnitTypeRunestone=32;
const int cUnitTypeRockSnow=33;
const int cUnitTypeWaterLilly=34;
const int cUnitTypeWaterReeds=35;
const int cUnitTypeSnowfall=36;
const int cUnitTypeMist=37;
const int cUnitTypeWaterfall=38;
const int cUnitTypeGarrisonFlag=39;
const int cUnitTypeCrate=40;
const int cUnitTypeRugs=41;
const int cUnitTypeMarketStall=42;
const int cUnitTypeCatapultShot=43;
const int cUnitTypeMiscObjects=44;
const int cUnitTypeInfernoFireGround=45;
const int cUnitTypeLightningStrike=46;
const int cUnitTypeBallistaShot=47;
const int cUnitTypeSplash=48;
const int cUnitTypeMiscStairs=49;
const int cUnitTypeCoralReef=50;
const int cUnitTypeHeroBirth=51;
const int cUnitTypeCinematicBlock=52;
const int cUnitTypeFootprintVillager=53;
const int cUnitTypeFlamingFootprint=54;
const int cUnitTypeIcyFootprint=55;
const int cUnitTypeOarFootprint=56;
const int cUnitTypeMeteor=57;
const int cUnitTypeLightningsparks=58;
const int cUnitTypeLightningScorch=59;
const int cUnitTypeDustSmall=60;
const int cUnitTypeDustMedium=61;
const int cUnitTypeDustLarge=62;
const int cUnitTypeArrowFlaming=63;
const int cUnitTypeLightningCloud=64;
const int cUnitTypeLightningRain=65;
const int cUnitTypeUIArmyBannerFurled=66;
const int cUnitTypeUIArmyBannerPlain=67;
const int cUnitTypeUIArmyBannerInfantry=68;
const int cUnitTypeUIArmyBannerCavalry=69;
const int cUnitTypeUIArmyBannerArcher=70;
const int cUnitTypeUIArmyBannerVillager=71;
const int cUnitTypeBloodGore=72;
const int cUnitTypeLightningSparksGround=73;
const int cUnitTypeHoofprint=74;
const int cUnitTypeFootprintMilitary=75;
const int cUnitTypeFireObject=76;
const int cUnitTypeUIHeroBanner=77;
const int cUnitTypeUIIdleVillagerBanner=78;
const int cUnitTypeGiantFootprint=79;
const int cUnitTypeShark=80;
const int cUnitTypeOrca=81;
const int cUnitTypeRockGraniteSmall=82;
const int cUnitTypeRockLimestoneSmall=83;
const int cUnitTypeGrass=84;
const int cUnitTypeSeagull=85;
const int cUnitTypeRockGraniteBig=86;
const int cUnitTypeRockLimestoneBig=87;
const int cUnitTypeRockSandstoneBig=88;
const int cUnitTypeRockSandstoneSmall=89;
const int cUnitTypeRockRiverSandy=90;
const int cUnitTypeRockRiverGrassy=91;
const int cUnitTypeRockRiverIcy=92;
const int cUnitTypeShiftingSandsIn=93;
const int cUnitTypeUIArmyBannerMyth=94;
const int cUnitTypeUIIdleMilitaryBanner=95;
const int cUnitTypeHeavenlight=96;
const int cUnitTypeShiftingSandsOut=97;
const int cUnitTypeShiftingSandsOutEffect=98;
const int cUnitTypeInfernoUnitFlame=99;
const int cUnitTypeRevealertoPlayer=100;
const int cUnitTypeSkeleton=101;
const int cUnitTypeSandDriftDune=102;
const int cUnitTypeSandDriftPlain=103;
const int cUnitTypeSandDriftPatch=104;
const int cUnitTypeHealingSFX=105;
const int cUnitTypeHealingAreaSFX=106;
const int cUnitTypeFrostDrift=107;
const int cUnitTypeDustDevil=108;
const int cUnitTypeFountain=109;
const int cUnitTypeFireWood=110;
const int cUnitTypeCampfire=111;
const int cUnitTypeColumns=112;
const int cUnitTypeColumnsFallen=113;
const int cUnitTypeColumnsBroken=114;
const int cUnitTypeMilestone=115;
const int cUnitTypeSign=116;
const int cUnitTypeCloneSFX=117;
const int cUnitTypeInvisibleRam=118;
const int cUnitTypeSpear=119;
const int cUnitTypeSlingStone=120;
const int cUnitTypeRain=121;
const int cUnitTypeSnowStorm=122;
const int cUnitTypeFertilePlantsSFX=123;
const int cUnitTypeCinematicrocks=124;
const int cUnitTypeCinematicTrees=125;
const int cUnitTypeCinematicDeadBodies=126;
const int cUnitTypeDestroyedBuildingsSmall=127;
const int cUnitTypeCinematicScorch=128;
const int cUnitTypeunderminegrounddecallong=129;
const int cUnitTypeunderminegrounddecalshort=130;
const int cUnitTypeunderminegrounddecalcorner=131;
const int cUnitTypeArmorGlowSmall=132;
const int cUnitTypeTornadoDebris=133;
const int cUnitTypeRaft=134;
const int cUnitTypeMeteorImpactWater=135;
const int cUnitTypeMeteorImpactGround=136;
const int cUnitTypeRainSmall=137;
const int cUnitTypeBallofFire=138;
const int cUnitTypeIncreaseProsperityLarge=139;
const int cUnitTypeIncreaseProsperitySmall=140;
const int cUnitTypeBalloffireimpact=141;
const int cUnitTypeDove=142;
const int cUnitTypeSnowDriftArchery=143;
const int cUnitTypeSnowDriftBarracks=144;
const int cUnitTypeSnowDriftStable=145;
const int cUnitTypeSnowDriftSettlements=146;
const int cUnitTypeSnowDriftTower=147;
const int cUnitTypeSnowDriftSiege=148;
const int cUnitTypeSnowDriftMajorTemple=149;
const int cUnitTypeTunnelOpening=150;
const int cUnitTypeVolley=151;
const int cUnitTypeHadesFire=152;
const int cUnitTypeRockGraniteSprite=153;
const int cUnitTypeVisionRevealer=154;
const int cUnitTypeBoltStrike=155;
const int cUnitTypeSpyEye=156;
const int cUnitTypeCurseSFX=157;
const int cUnitTypeSentinelBase=158;
const int cUnitTypeBoltScorch=159;
const int cUnitTypeCitadelSFX=160;
const int cUnitTypeVisionSFX=161;
const int cUnitTypeRagnorokSFX=162;
const int cUnitTypeFimbulwinterSFX=163;
const int cUnitTypePlentyFlare=164;
const int cUnitTypeOsirisLightning=165;
const int cUnitTypeOsirisSFX=166;
const int cUnitTypePriestProjectile=167;
const int cUnitTypeUIArmyBannerSiege=168;
const int cUnitTypeRockLimestoneSprite=169;
const int cUnitTypeRockSandstoneSprite=170;
const int cUnitTypePineStump=171;
const int cUnitTypeOakstump=172;
const int cUnitTypeEarthquake=173;
const int cUnitTypeBarrel=174;
const int cUnitTypePots=175;
const int cUnitTypeBrokenSiegeWeapons=176;
const int cUnitTypeKrakenBits=177;
const int cUnitTypeFlowers=178;
const int cUnitTypeSeaweed=179;
const int cUnitTypeFern=180;
const int cUnitTypeFlagNumbered=181;
const int cUnitTypeScorpionTail=182;
const int cUnitTypeGenericCorpse=183;
const int cUnitTypeWadjetSpit=184;
const int cUnitTypeHeroDeath=185;
const int cUnitTypePetosuchusBeam=186;
const int cUnitTypeEarthquakeCrackA=187;
const int cUnitTypeEarthquakeCrackB=188;
const int cUnitTypeEarthquakeCrackC=189;
const int cUnitTypeEarthquakeCrackD=190;
const int cUnitTypeForestFireSFX=191;
const int cUnitTypePetosuchusprojectile=192;
const int cUnitTypeRecognizer=193;
const int cUnitTypeManticoreBarb=194;
const int cUnitTypeArrowSplashSFX=195;
const int cUnitTypePetrobolosShot=196;
const int cUnitTypeUITownBellBanner=197;
const int cUnitTypePestilenceSFX1=198;
const int cUnitTypePestilenceSFX2=199;
const int cUnitTypeHeroDeathRevealer=200;
const int cUnitTypeTestomatic=201;
const int cUnitTypeGateRamDestroyed=202;
const int cUnitTypeSpearFlaming=203;
const int cUnitTypeDestroyedBuildingsMed=204;
const int cUnitTypeDestroyedBuildingsLarge=205;
const int cUnitTypeOsiris=206;
const int cUnitTypeSPCMeteor=207;
const int cUnitTypeAvalanche=208;
const int cUnitTypeEinheriarBoostSFX=209;
const int cUnitTypeArrowSignal=210;
const int cUnitTypeOsirisBirth=211;
const int cUnitTypeOsirisBoxGlow=212;
const int cUnitTypeUIBannerObjective=213;
const int cUnitTypeOakstumpburnt=214;
const int cUnitTypeFireObjectBig=215;
const int cUnitTypeSmokeBig=216;
const int cUnitTypeUIArmyBannerHero=217;
const int cUnitTypeMummyFlies=218;
const int cUnitTypeVulture=219;
const int cUnitTypeConversionSFX=220;
const int cUnitTypeUIArmyBannerNaval=221;
const int cUnitTypeFireHades=222;
const int cUnitTypeDestruction3x3=223;
const int cUnitTypeDestruction4x4=224;
const int cUnitTypeDestruction5x5=225;
const int cUnitTypeDestruction8x8=226;
const int cUnitTypeThorhammer=227;
const int cUnitTypeRegenerationSFX=228;
const int cUnitTypePoisonSFX=229;
const int cUnitTypeTaprootlarge=230;
const int cUnitTypeTaprootSmall=231;
const int cUnitTypeShadow=232;
const int cUnitTypeDestructionSettlement=233;
const int cUnitTypeDestruction2x2=234;
const int cUnitTypeDestruction1x1=235;
const int cUnitTypeUIArmyBannerCaravan=236;
const int cUnitTypeUIArmyBannerOxcart=237;
const int cUnitTypeMInePieces=238;
const int cUnitTypeUnderworldSmoke=239;
const int cUnitTypeUnderworldExplosion=240;
const int cUnitTypeUICloudBoarder=241;
const int cUnitTypeBloodCinematic=242;
const int cUnitTypeSkeletonGiant=243;
const int cUnitTypeSkeletonAnimal=244;
const int cUnitTypeShipwreck=245;
const int cUnitTypeRuins=246;
const int cUnitTypeRottingLog=247;
const int cUnitTypeUnderbrush=248;
const int cUnitTypeGrassTall=249;
const int cUnitTypeRockCliff=250;
const int cUnitTypeUIRangeIndicatorEgyptSFX=251;
const int cUnitTypeHarpy=252;
const int cUnitTypeBlowingLeaves=253;
const int cUnitTypeHawksbill=254;
const int cUnitTypeBloodFlow=255;
const int cUnitTypeBallofFireinvisible=256;
const int cUnitTypeSplashFootprint=257;
const int cUnitTypeLavaBubbling=258;
const int cUnitTypeWoodPile1=259;
const int cUnitTypeWoodPile2=260;
const int cUnitTypeWoodPile3=261;
const int cUnitTypeTrident=262;
const int cUnitTypeDestructionCitadel=263;
const int cUnitTypeForestFireAttack=264;
const int cUnitTypeUIRangeIndicatorGreekSFX=265;
const int cUnitTypeUIRangeIndicatorNorseSFX=266;
const int cUnitTypeInvisibleGate=267;
const int cUnitTypeUIArmyBannerBuilding=268;
const int cUnitTypeWaterdecoration=269;
const int cUnitTypeFootprintCavalry=270;
const int cUnitTypeFootprintAnimalLarge=271;
const int cUnitTypeFootprintAnimalSmall=272;
const int cUnitTypeFootprintSiege=273;
const int cUnitTypeEvilCloudSFX=274;
const int cUnitTypeSmokeGiant=275;
const int cUnitTypeCrateSmall=276;
const int cUnitTypeCinematicWake=277;
const int cUnitTypeWeapons=278;
const int cUnitTypeFootprintGiant=279;
const int cUnitTypeFootprintElephant=280;
const int cUnitTypeFootprintWheel=281;
const int cUnitTypeFootprintHydra=282;
const int cUnitTypeFootprintPortableRam=283;
const int cUnitTypeFootprintScorpion=284;
const int cUnitTypeFootprintScarab=285;
const int cUnitTypeSavannahstump=286;
const int cUnitTypeChickenBlood=287;
const int cUnitTypeCrabBlood=288;
const int cUnitTypeArkantosBoostSFX=289;
const int cUnitTypeTremor=290;
const int cUnitTypeMeteorite=291;
const int cUnitTypeIceberg=292;
const int cUnitTypeGaiaCreepFlowers=293;
const int cUnitTypeDeconstructUnit=294;
const int cUnitTypeDeconstructBuilding=295;
const int cUnitTypeChaoseffect=296;
const int cUnitTypeTraitorseffect=297;
const int cUnitTypeMeteoritedeath=298;
const int cUnitTypeMarshBrush=299;
const int cUnitTypeTundraBrush=300;
const int cUnitTypeAudreyBase=301;
const int cUnitTypeAudreyWaterBase=302;
const int cUnitTypeVortexstart=303;
const int cUnitTypeVortexfinish=304;
const int cUnitTypeMarshstump=305;
const int cUnitTypeTundrastump=306;
const int cUnitTypeFireballLaunchDamageEffect=307;
const int cUnitTypeSpider=308;
const int cUnitTypeImplodeSphere=309;
const int cUnitTypeImplodeSphereEffect=310;
const int cUnitTypeImplodeLightningEffect=311;
const int cUnitTypeImplodePullEffect=312;
const int cUnitTypeJavelinFlaming=313;
const int cUnitTypeImplodeShockwave=314;
const int cUnitTypeSpiderDoor=315;
const int cUnitTypeLampadesBlood=316;
const int cUnitTypeAcidPool=317;
const int cUnitTypeSpiderWarn=318;
const int cUnitTypeGaiaForesteffect=319;
const int cUnitTypeVortexstartlinked=320;
const int cUnitTypeVortexfinishlinked=321;
const int cUnitTypeVortexlanding=322;
const int cUnitTypeImplodeDebris=323;
const int cUnitTypeTitanAtlanteanFootprint=324;
const int cUnitTypeTimeshiftout=325;
const int cUnitTypeTimeshiftin=326;
const int cUnitTypeTartarianGateflame=327;
const int cUnitTypeHekaShockwaveSFX=328;
const int cUnitTypeTartarianGatecreatureeffect=329;
const int cUnitTypeGarrisonFlagSkyPassage=330;
const int cUnitTypeLampadesBolt=331;
const int cUnitTypeFireSiphonFire=332;
const int cUnitTypeStymphBirdFeather=333;
const int cUnitTypeOsirisPyramidDead=334;
const int cUnitTypeRocket=335;
const int cUnitTypeUIRangeIndicatorAtlanteanSFX=336;
const int cUnitTypeTowerMirrorFocuser=337;
const int cUnitTypeKronnyBirth=338;
const int cUnitTypeMistOlympus=339;
const int cUnitTypeSeagullHigh=340;
const int cUnitTypeSeagullLow=341;
const int cUnitTypeRepeatFlag=342;
const int cUnitTypeBallofFirePrometheus=343;
const int cUnitTypeShockwavestuneffect=344;
const int cUnitTypeArkantosGodOut=345;
const int cUnitTypeOlympusTempleSFX=346;
const int cUnitTypeKronnyBirthSFX=347;
const int cUnitTypeLavaSheet=348;
const int cUnitTypeSoundGaiaSFX=349;
const int cUnitTypeFootprintPrometheanbig=350;
const int cUnitTypeFootprintPrometheansmall=351;
const int cUnitTypeCinematicDeadBodiesXpack=352;
const int cUnitTypeTartarianRubble=353;
const int cUnitTypeTitanDeath=354;
const int cUnitTypeSpearman=355;
const int cUnitTypeAxeman=356;
const int cUnitTypeSlinger=357;
const int cUnitTypeRaidingCavalry=358;
const int cUnitTypeCamelry=359;
const int cUnitTypeDwarf=360;
const int cUnitTypeBarracks=361;
const int cUnitTypeDock=362;
const int cUnitTypeFarm=363;
const int cUnitTypeGranary=364;
const int cUnitTypeArmory=365;
const int cUnitTypeGate=366;
const int cUnitTypeMarket=367;
const int cUnitTypeStable=368;
const int cUnitTypeFortress=369;
const int cUnitTypeMonument=370;
const int cUnitTypeSiegeCamp=371;
const int cUnitTypeWonder=372;
const int cUnitTypeCyclops=373;
const int cUnitTypeGoat=374;
const int cUnitTypeWolf=375;
const int cUnitTypePine=376;
const int cUnitTypeStorehouse=377;
const int cUnitTypeScarab=378;
const int cUnitTypeBallista=379;
const int cUnitTypeSiegeTower=380;
const int cUnitTypeCrocodile=381;
const int cUnitTypeHippo=382;
const int cUnitTypePalm=383;
const int cUnitTypeFlag=384;
const int cUnitTypeAnubite=385;
const int cUnitTypeBear=386;
const int cUnitTypeFireGiant=387;
const int cUnitTypeLocustSwarm=388;
const int cUnitTypeBoar=389;
const int cUnitTypeFrostGiant=390;
const int cUnitTypeWallLong=391;
const int cUnitTypeCatapult=392;
const int cUnitTypeCaravanNorse=393;
const int cUnitTypeTroll=394;
const int cUnitTypeMountainGiant=395;
const int cUnitTypeEinheriar=396;
const int cUnitTypeKraken=397;
const int cUnitTypeSeaTurtle=398;
const int cUnitTypeValkyrie=399;
const int cUnitTypeBattleBoar=400;
const int cUnitTypeTrireme=401;
const int cUnitTypeFishingShipGreek=402;
const int cUnitTypeBridge=403;
const int cUnitTypeCow=404;
const int cUnitTypeGiraffe=405;
const int cUnitTypeStatuePharaoh=406;
const int cUnitTypeTorch=407;
const int cUnitTypePig=408;
const int cUnitTypeLazerBear=409;
const int cUnitTypeZebra=410;
const int cUnitTypeWaterBuffalo=411;
const int cUnitTypeGazelle=412;
const int cUnitTypeBaboon=413;
const int cUnitTypeCentaur=414;
const int cUnitTypePhoenix=415;
const int cUnitTypeManticore=416;
const int cUnitTypeChimera=417;
const int cUnitTypeSphinx=418;
const int cUnitTypeMinotaur=419;
const int cUnitTypeHydra=420;
const int cUnitTypeChicken=421;
const int cUnitTypeMonkey=422;
const int cUnitTypeColossus=423;
const int cUnitTypeMummy=424;
const int cUnitTypeRoc=425;
const int cUnitTypeMedusa=426;
const int cUnitTypeObelisk=427;
const int cUnitTypeHadesDoor=428;
const int cUnitTypeAjax=429;
const int cUnitTypeArkantos=430;
const int cUnitTypeGargarensis=431;
const int cUnitTypeSetna=432;
const int cUnitTypeShabaKa=433;
const int cUnitTypeOdysseus=434;
const int cUnitTypeChiron=435;
const int cUnitTypeAmanra=436;
const int cUnitTypeWallConnector=437;
const int cUnitTypeWallShort=438;
const int cUnitTypeLeviathan=439;
const int cUnitTypeStatueLionRight=440;
const int cUnitTypeStatueLionLeft=441;
const int cUnitTypeEgyptianVulture=442;
const int cUnitTypeReginleif=443;
const int cUnitTypeScout=444;
const int cUnitTypeArcheryRange=445;
const int cUnitTypeScorpionMan=446;
const int cUnitTypeMinion=447;
const int cUnitTypeFishPerch=448;
const int cUnitTypeGreatBox=449;
const int cUnitTypeGreatBoxCart=450;
const int cUnitTypeGoldMine=451;
const int cUnitTypeKamos=452;
const int cUnitTypeOakTree=453;
const int cUnitTypePyramidLarge=454;
const int cUnitTypePyramidSmall=455;
const int cUnitTypeLion=456;
const int cUnitTypeRhinocerous=457;
const int cUnitTypeHyena=458;
const int cUnitTypeCrownedCrane=459;
const int cUnitTypeAurochs=460;
const int cUnitTypeFishMahi=461;
const int cUnitTypeFishSalmon=462;
const int cUnitTypeGiantDuckbilledPlatypus=463;
const int cUnitTypeTemple=464;
const int cUnitTypeHouse=465;
const int cUnitTypeTent=466;
const int cUnitTypeElephant=467;
const int cUnitTypeTunnel=468;
const int cUnitTypeTower=469;
const int cUnitTypeSettlement=470;
const int cUnitTypePegasus=471;
const int cUnitTypeScylla=472;
const int cUnitTypeAvenger=473;
const int cUnitTypeRaven=474;
const int cUnitTypeExcavation=475;
const int cUnitTypeGuardian=476;
const int cUnitTypeGuardianSleeping=477;
const int cUnitTypeSwordBearers=478;
const int cUnitTypeDeer=479;
const int cUnitTypeSettlementLevel1=480;
const int cUnitTypeOxCart=481;
const int cUnitTypeFenceStone=482;
const int cUnitTypeFenceWood=483;
const int cUnitTypeVillagerNorse=484;
const int cUnitTypeLonghouse=485;
const int cUnitTypeAcademy=486;
const int cUnitTypeVillagerGreek=487;
const int cUnitTypePortableRam=488;
const int cUnitTypeHillFort=489;
const int cUnitTypeVillagerEgyptian=490;
const int cUnitTypeThrowingAxeman=491;
const int cUnitTypeUlfsark=492;
const int cUnitTypeHuskarl=493;
const int cUnitTypeShrine=494;
const int cUnitTypeHeroNorse=495;
const int cUnitTypeHeroGreekAchilles=496;
const int cUnitTypePharaoh=497;
const int cUnitTypeLumberCamp=498;
const int cUnitTypeMiningCamp=499;
const int cUnitTypeHeroGreekOdysseus=500;
const int cUnitTypeHeroGreekChiron=501;
const int cUnitTypeHeroGreekPolyphemus=502;
const int cUnitTypeHoplite=503;
const int cUnitTypeHypaspist=504;
const int cUnitTypeHippikon=505;
const int cUnitTypeProdromos=506;
const int cUnitTypePeltast=507;
const int cUnitTypeToxotes=508;
const int cUnitTypePetrobolos=509;
const int cUnitTypeHelepolis=510;
const int cUnitTypePriest=511;
const int cUnitTypeMigdolStronghold=512;
const int cUnitTypeChariotArcher=513;
const int cUnitTypeMyrmidon=514;
const int cUnitTypeHetairoi=515;
const int cUnitTypeCataphract=516;
const int cUnitTypeMercenary=517;
const int cUnitTypeMonument2=518;
const int cUnitTypeMonument3=519;
const int cUnitTypeMonument4=520;
const int cUnitTypeMonument5=521;
const int cUnitTypeStatueofMajorGod=522;
const int cUnitTypeDwarvenForge=523;
const int cUnitTypeFolstagFlagBearer=524;
const int cUnitTypeTrojanHorse=525;
const int cUnitTypeBerryBush=526;
const int cUnitTypeBolderWall=527;
const int cUnitTypeMercenaryCavalry=528;
const int cUnitTypePirateShip=529;
const int cUnitTypeGateRam=530;
const int cUnitTypeJarl=531;
const int cUnitTypeWallLongDestructionSFX=532;
const int cUnitTypeWallShortDestructionSFX=533;
const int cUnitTypeWallConnectorDestructionSFX=534;
const int cUnitTypeOutpost=535;
const int cUnitTypeTransportShipGreek=536;
const int cUnitTypeKebenit=537;
const int cUnitTypeLongboat=538;
const int cUnitTypeLighthouse=539;
const int cUnitTypeHeroBoar=540;
const int cUnitTypeHeroGreekHeracles=541;
const int cUnitTypeHeroGreekJason=542;
const int cUnitTypeFishingShipNorse=543;
const int cUnitTypeFishingShipEgyptian=544;
const int cUnitTypeTransportShipEgyptian=545;
const int cUnitTypeTroyGate=546;
const int cUnitTypeTroyWallConnector=547;
const int cUnitTypeTroyWallLong=548;
const int cUnitTypeTroyWallShort=549;
const int cUnitTypeHeroGreekHippolyta=550;
const int cUnitTypeHeroGreekTheseus=551;
const int cUnitTypeHeroGreekBellerophon=552;
const int cUnitTypeHeroGreekAjax=553;
const int cUnitTypeHeroGreekAtalanta=554;
const int cUnitTypeHeroGreekPerseus=555;
const int cUnitTypeFlyingPurpleHippo=556;
const int cUnitTypeCaravanGreek=557;
const int cUnitTypeCaravanEgyptian=558;
const int cUnitTypeRelic=559;
const int cUnitTypeSkult=560;
const int cUnitTypeBolderRolling=561;
const int cUnitTypeGoldMineSmall=562;
const int cUnitTypePineSnow=563;
const int cUnitTypeCirce=564;
const int cUnitTypeStopCombat=565;
const int cUnitTypeNavalShipyard=566;
const int cUnitTypeRammingShipGreek=567;
const int cUnitTypeSiegeShipGreek=568;
const int cUnitTypeHeroGreekArgo=569;
const int cUnitTypeRammingShipNorse=570;
const int cUnitTypeRammingShipEgyptian=571;
const int cUnitTypeSiegeShipNorse=572;
const int cUnitTypeSiegeShipEgyptian=573;
const int cUnitTypeShade=574;
const int cUnitTypeAnimalAttractor=575;
const int cUnitTypeHealingSpringObject=576;
const int cUnitTypeSerpent=577;
const int cUnitTypeSentinelMain=578;
const int cUnitTypeCitadelCenter=579;
const int cUnitTypeWalkingWoodsPine=580;
const int cUnitTypeWalkingWoodsOak=581;
const int cUnitTypeWalkingWoodsPalm=582;
const int cUnitTypeHeroRagnorok=583;
const int cUnitTypeNidhogg=584;
const int cUnitTypeFimbulwinterWolf=585;
const int cUnitTypePlentyVault=586;
const int cUnitTypePharaohofOsiris=587;
const int cUnitTypeGoldMineDwarven=588;
const int cUnitTypeFenrisWolf=589;
const int cUnitTypeAthena=590;
const int cUnitTypeWalrus=591;
const int cUnitTypeWadjet=592;
const int cUnitTypePetsuchos=593;
const int cUnitTypeNemeanLion=594;
const int cUnitTypeAgamemnon=595;
const int cUnitTypeTheocrat=596;
const int cUnitTypeShadeofHades=597;
const int cUnitTypeAtlantisWallConnector=598;
const int cUnitTypeAtlantisWallLong=599;
const int cUnitTypeAtlantisGate=600;
const int cUnitTypeTamariskTree=601;
const int cUnitTypePhoenixEgg=602;
const int cUnitTypePolarBear=603;
const int cUnitTypeWalkingWoodsPineSnow=604;
const int cUnitTypeCaribou=605;
const int cUnitTypeElk=606;
const int cUnitTypePigSpecial=607;
const int cUnitTypeTitanBad=608;
const int cUnitTypePalmBurning=609;
const int cUnitTypeOakTreeBurning=610;
const int cUnitTypePineBurning=611;
const int cUnitTypeGreatBoxCart2=612;
const int cUnitTypeTransportShipNorse=613;
const int cUnitTypeThorHammerHaft=614;
const int cUnitTypeThorHammerHead=615;
const int cUnitTypePineSnowBurning=616;
const int cUnitTypeWarElephant=617;
const int cUnitTypeOakAutumn=618;
const int cUnitTypeBrokk=619;
const int cUnitTypeEitri=620;
const int cUnitTypeDwarfFoundry=621;
const int cUnitTypeHippocampus=622;
const int cUnitTypeOakAutumnBurning=623;
const int cUnitTypeSkraeling=624;
const int cUnitTypeUnderworldPassageSPC=625;
const int cUnitTypeCarcinos=626;
const int cUnitTypeJormundElver=627;
const int cUnitTypeMilitia=628;
const int cUnitTypeKastor=629;
const int cUnitTypeSeaSnake=630;
const int cUnitTypeOldMan=631;
const int cUnitTypeJailWall=632;
const int cUnitTypeDigPile=633;
const int cUnitTypeGoldenFleece=634;
const int cUnitTypeTempleUnderworld=635;
const int cUnitTypeArkantosman=636;
const int cUnitTypeBolderRollingDead=637;
const int cUnitTypeBolderRolling2=638;
const int cUnitTypePineDead=639;
const int cUnitTypeGateRam2=640;
const int cUnitTypeMiniAtlantis=641;
const int cUnitTypeAtlantisTile=642;
const int cUnitTypeAtlantisTileDead=643;
const int cUnitTypeWellofUrd=644;
const int cUnitTypeTroyGateDead=645;
const int cUnitTypePlentyVaultKOTH=646;
const int cUnitTypePoseidonStatue=647;
const int cUnitTypePharaohSecondary=648;
const int cUnitTypeSavannahTree=649;
const int cUnitTypeGoldenLion=650;
const int cUnitTypeMonkeyRelic=651;
const int cUnitTypeGhostShip=652;
const int cUnitTypeShadeofErebus=653;
const int cUnitTypeBanditMigdol=654;
const int cUnitTypeGoldMineTiny=655;
const int cUnitTypeWallMedium=656;
const int cUnitTypeStatueofLightning=657;
const int cUnitTypeCrossbowman=658;
const int cUnitTypeFenceIron=659;
const int cUnitTypeCharonFerry=660;
const int cUnitTypeHeroBoar2=661;
const int cUnitTypeTaproot=662;
const int cUnitTypeFemale=663;
const int cUnitTypeTheris=664;
const int cUnitTypeOrnlu=665;
const int cUnitTypePolaris=666;
const int cUnitTypeTamariskTreeDead=667;
const int cUnitTypePrisoner=668;
const int cUnitTypeFolstagFlag=669;
const int cUnitTypeUndermineBuildingDestructionSFX=670;
const int cUnitTypePineDeadBurning=671;
const int cUnitTypeApeofSet=672;
const int cUnitTypeGazelleofSet=673;
const int cUnitTypeHyenaofSet=674;
const int cUnitTypeCrocodileofSet=675;
const int cUnitTypeHippoofSet=676;
const int cUnitTypeRhinocerosofSet=677;
const int cUnitTypeGiraffeofSet=678;
const int cUnitTypeKrakenSPC=679;
const int cUnitTypeSavannahTreeBurning=680;
const int cUnitTypeWonderSPC=681;
const int cUnitTypeMonkeyRaft=682;
const int cUnitTypeForkboy=683;
const int cUnitTypeWalkingBerryBush=684;
const int cUnitTypeChickenExploding=685;
const int cUnitTypeWalkingWoodsSavannah=686;
const int cUnitTypeErebusTree=687;
const int cUnitTypeVillagerAtlantean=688;
const int cUnitTypeManor=689;
const int cUnitTypeVillagerAtlanteanHero=690;
const int cUnitTypeSwordsman=691;
const int cUnitTypeTridentSoldier=692;
const int cUnitTypeTridentSoldierHero=693;
const int cUnitTypeSwordsmanHero=694;
const int cUnitTypeFishingShipAtlantean=695;
const int cUnitTypeBireme=696;
const int cUnitTypeTransportShipAtlantean=697;
const int cUnitTypeFireShipAtlantean=698;
const int cUnitTypeSiegeShipAtlantean=699;
const int cUnitTypeLancer=700;
const int cUnitTypeLancerHero=701;
const int cUnitTypeCounterBuilding=702;
const int cUnitTypeChieroballista=703;
const int cUnitTypeFireSiphon=704;
const int cUnitTypeCaravanAtlantean=705;
const int cUnitTypePalace=706;
const int cUnitTypeRoyalGuard=707;
const int cUnitTypeRoyalGuardHero=708;
const int cUnitTypeSkyPassage=709;
const int cUnitTypeTitanAtlantean=710;
const int cUnitTypeBarracksAtlantean=711;
const int cUnitTypeArcherAtlantean=712;
const int cUnitTypeArcherAtlanteanHero=713;
const int cUnitTypeMaceman=714;
const int cUnitTypeMacemanHero=715;
const int cUnitTypeJavelinCavalry=716;
const int cUnitTypeJavelinCavalryHero=717;
const int cUnitTypeAudrey=718;
const int cUnitTypeAudreyWater=719;
const int cUnitTypeGuild=720;
const int cUnitTypeVolcano=721;
const int cUnitTypeBehemoth=722;
const int cUnitTypeFlyingMedic=723;
const int cUnitTypeTowerMirror=724;
const int cUnitTypePromethean=725;
const int cUnitTypeServant=726;
const int cUnitTypeSatyr=727;
const int cUnitTypeStymphalianBird=728;
const int cUnitTypeAutomaton=729;
const int cUnitTypeManOWar=730;
const int cUnitTypePrometheanSmall=731;
const int cUnitTypeOracleHero=732;
const int cUnitTypeGaiaForesttree=733;
const int cUnitTypeHekaGigantes=734;
const int cUnitTypeTundraTree=735;
const int cUnitTypeMarshTree=736;
const int cUnitTypeTartarianGate=737;
const int cUnitTypeOracleScout=738;
const int cUnitTypeTartarianGatespawn=739;
const int cUnitTypeLampades=740;
const int cUnitTypeKastorAdult=741;
const int cUnitTypeMarshTreeBurning=742;
const int cUnitTypeTundraTreeBurning=743;
const int cUnitTypePhoenixFromEgg=744;
const int cUnitTypeHesperidesTree=745;
const int cUnitTypeDryad=746;
const int cUnitTypeNereid=747;
const int cUnitTypeTitanGate=748;
const int cUnitTypeWalkingWoodsMarsh=749;
const int cUnitTypeWalkingWoodsTundra=750;
const int cUnitTypeTitanPrometheus=751;
const int cUnitTypeGeneralMelagius=752;
const int cUnitTypePharaohofOsirisXP=753;
const int cUnitTypeGuardianSleepingXP=754;
const int cUnitTypeStatueofAutomaton=755;
const int cUnitTypeStatueofAutomatonBase=756;
const int cUnitTypeArgus=757;
const int cUnitTypeGaiaPool=758;
const int cUnitTypeSpiderEgg=759;
const int cUnitTypeKingFolstag=760;
const int cUnitTypeOdinsTower=761;
const int cUnitTypeStatueManticore=762;
const int cUnitTypeStatueCyclops=763;
const int cUnitTypeStatueNemeanLion=764;
const int cUnitTypeStatueValkyrie=765;
const int cUnitTypeStatueHydra=766;
const int cUnitTypeStatueChimera=767;
const int cUnitTypeGaiaForesttreeburning=768;
const int cUnitTypeTartarianGateplacement=769;
const int cUnitTypeTartarianGatebirth=770;
const int cUnitTypeKrios=771;
const int cUnitTypeKronny=772;
const int cUnitTypeAjaxOlder=773;
const int cUnitTypeAmanraOlder=774;
const int cUnitTypeTitanGateDead=775;
const int cUnitTypeTempleKronos=776;
const int cUnitTypeArkantosGod=777;
const int cUnitTypeEarth=778;
const int cUnitTypeKronnyFlying=779;
const int cUnitTypeVictoryMarker=780;
const int cUnitTypeInvisibleWall=781;
const int cUnitTypeInvisibleTarget=782;
const int cUnitTypePyramidOsirisXpack=783;
const int cUnitTypeStatueofMelagius=784;
const int cUnitTypeTempleOvergrown=785;
const int cUnitTypeRocTent=786;
const int cUnitTypeGuardianXP=787;
const int cUnitTypeAutomatonSPC=788;
const int cUnitTypeSummoningTree=789;
const int cUnitTypeSummoningTree2=790;
const int cUnitTypeBolderRollingSmall=791;
const int cUnitTypeTreeFinale=792;
const int cUnitTypeKastorStaff=793;
const int cUnitTypeHadesDoorSmall=794;
const int cUnitTypeTitanKronos=795;
const int cUnitTypeTitanGaia=796;
const int cUnitTypeWolfArctic=797;
const int cUnitTypeShadeXP=798;
const int cUnitTypeWolfArctic2=799;
const int cUnitTypeBella=800;
const int cUnitTypeUnit=801;
const int cUnitTypeShip=802;
const int cUnitTypeBuilding=803;
const int cUnitTypeMilitaryBuilding=804;
const int cUnitTypeEconomicBuilding=805;
const int cUnitTypeDropsite=806;
const int cUnitTypeResource=807;
const int cUnitTypeHuntedResource=808;
const int cUnitTypeMinedResource=809;
const int cUnitTypeLandResource=810;
const int cUnitTypeWaterResource=811;
const int cUnitTypeProjectile=812;
const int cUnitTypeNature=813;
const int cUnitTypeSpecialPowers=814;
const int cUnitTypeUnattackable=815;
const int cUnitTypeAbstractTemple=816;
const int cUnitTypeMilitary=817;
const int cUnitTypeHero=818;
const int cUnitTypeTree=819;
const int cUnitTypeAbstractInfantry=820;
const int cUnitTypeAbstractCavalry=821;
const int cUnitTypeAbstractArcher=822;
const int cUnitTypeAbstractVillager=823;
const int cUnitTypeAbstractFarm=824;
const int cUnitTypeAbstractDock=825;
const int cUnitTypeInventoryHolder=826;
const int cUnitTypeInventoryItem=827;
const int cUnitTypeUseableItem=828;
const int cUnitTypeStrengthBonus=829;
const int cUnitTypeTradeableTo=830;
const int cUnitTypeTradeableFrom=831;
const int cUnitTypeAbstractSiegeWeapon=832;
const int cUnitTypeFlyingUnit=833;
const int cUnitTypeMythUnit=834;
const int cUnitTypeEconomic=835;
const int cUnitTypeRanged=836;
const int cUnitTypeFastSpeed=837;
const int cUnitTypeAverageSpeed=838;
const int cUnitTypeSlowSpeed=839;
const int cUnitTypeGeneric=840;
const int cUnitTypeUnitClass=841;
const int cUnitTypeBuildingClass=842;
const int cUnitTypeNatureClass=843;
const int cUnitTypeEmbellishmentClass=844;
const int cUnitTypeTestClass=845;
const int cUnitTypeE3Class=846;
const int cUnitTypeAll=847;
const int cUnitTypeActionGather=848;
const int cUnitTypeActionTrain=849;
const int cUnitTypeActionBuild=850;
const int cUnitTypeActionAttack=851;
const int cUnitTypeActionTrickle=852;
const int cUnitTypeFish=853;
const int cUnitTypeTransport=854;
const int cUnitTypeAbstractWall=855;
const int cUnitTypeHerdable=856;
const int cUnitTypeAbstractSettlement=857;
const int cUnitTypeBuildingsThatShoot=858;
const int cUnitTypeMythUnitGodPower=859;
const int cUnitTypeAbstractTitan=860;
const int cUnitTypeAbstractTradeUnit=861;
const int cUnitTypeLokiHero=862;
const int cUnitTypeAge2Building=863;
const int cUnitTypeAge3Building=864;
const int cUnitTypeAge1Temple=865;
const int cUnitTypeFood=866;
const int cUnitTypeGold=867;
const int cUnitTypeWood=868;
const int cUnitTypeWildCrops=869;
const int cUnitTypeAge1Building=870;
const int cUnitTypeFoodDropsite=871;
const int cUnitTypeWoodDropsite=872;
const int cUnitTypeGoldDropsite=873;
const int cUnitTypeHumanSoldier=874;
const int cUnitTypeHuntable=875;
const int cUnitTypeAbstractMonument=876;
const int cUnitTypeSettlementsThatTrainVillagers=877;
const int cUnitTypeHack=878;
const int cUnitTypeCrush=879;
const int cUnitTypePierce=880;
const int cUnitTypeSharedBuilding=881;
const int cUnitTypeAbstractStable=882;
const int cUnitTypeAbstractFortress=883;
const int cUnitTypeAbstractBarracks=884;
const int cUnitTypeAbstractArcheryRange=885;
const int cUnitTypeEarlyWoodDropsite=886;
const int cUnitTypeEarlyFoodDropsite=887;
const int cUnitTypeEarlyGoldDropsite=888;
const int cUnitTypeConvertableBuilding=889;
const int cUnitTypeFavor=890;
const int cUnitTypeAnimalPrey=891;
const int cUnitTypeAnimalReactive=892;
const int cUnitTypeAnimalPredator=893;
const int cUnitTypeAbstractPharaoh=894;
const int cUnitTypeMythUnitInfantry=895;
const int cUnitTypeMythUnitCavalry=896;
const int cUnitTypeMythUnitArcher=897;
const int cUnitTypeMythUnitSiege=898;
const int cUnitTypeUtilityShip=899;
const int cUnitTypeLogicalTypeHandUnitsAttack=900;
const int cUnitTypeLogicalTypePredatorsAutoAttack=901;
const int cUnitTypeLogicalTypeMeanPredatorsAutoAttack=902;
const int cUnitTypeLogicalTypeHandUnitsAutoAttack=903;
const int cUnitTypeLogicalTypePredatorsAttack=904;
const int cUnitTypeLogicalTypeScoutsRespondToAttack=905;
const int cUnitTypeLogicalTypeBuildingsNotHouses=906;
const int cUnitTypeLogicalTypeRangedUnitsAttack=907;
const int cUnitTypeLogicalTypeRangedUnitsAutoAttack=908;
const int cUnitTypeLogicalTypeUnitsNotBuildings=909;
const int cUnitTypeLogicalTypeDangerousAnimals=910;
const int cUnitTypeLogicalTypeIdleCivilian=911;
const int cUnitTypeLogicalTypeIdleMilitary=912;
const int cUnitTypeLogicalTypeTornadoAttack=913;
const int cUnitTypeLogicalTypeNeededForVictory=914;
const int cUnitTypeLogicalTypeIdleHero=915;
const int cUnitTypeLogicalTypeValidBoltTarget=916;
const int cUnitTypeLogicalTypeAffectedByHealingSpring=917;
const int cUnitTypeLogicalTypeAffectedByRestoration=918;
const int cUnitTypeLogicalTypeGarrisonOnBoats=919;
const int cUnitTypeLogicalTypeCavalryAndScout=920;
const int cUnitTypeLogicalTypeNonGreekUnit=921;
const int cUnitTypeLogicalTypeVillagersAttack=922;
const int cUnitTypeLogicalTypeEarthquakeAttack=923;
const int cUnitTypeAbstractArmory=924;
const int cUnitTypeLogicalTypeSiegeAutoAttack=925;
const int cUnitTypeLogicalTypeCanBeHealed=926;
const int cUnitTypeLogicalTypeMinimapFilterEconomic=927;
const int cUnitTypeLogicalTypeMinimapFilterMilitary=928;
const int cUnitTypeArcherShip=929;
const int cUnitTypeHammerShip=930;
const int cUnitTypeSiegeShip=931;
const int cUnitTypeAbstractCart=932;
const int cUnitTypeAbstractScout=933;
const int cUnitTypeLogicalTypeValidSpyTarget=934;
const int cUnitTypeAutoupgradedUnit=935;
const int cUnitTypeLogicalTypeNavalMilitary=936;
const int cUnitTypeLogicalTypeValidFrostTarget=937;
const int cUnitTypeLogicalTypeValidMeteorTarget=938;
const int cUnitTypeLogicalTypeSeaSerpentAttack=939;
const int cUnitTypeLogicalTypeFavoriteUnit=940;
const int cUnitTypeLogicalTypeFavoriteMythUnit=941;
const int cUnitTypeLogicalTypeConvertsHerds=942;
const int cUnitTypeLogicalTypeValidLocustSwarmTarget=943;
const int cUnitTypeLogicalTypeValidShiftingSandsTarget=944;
const int cUnitTypeLogicalTypeParticipatesInBattlecries=945;
const int cUnitTypeLogicalTypeBuildingsThatTrainMilitary=946;
const int cUnitTypeLogicalTypeRamAttack=947;
const int cUnitTypeTransportShip=948;
const int cUnitTypeLogicalTypeVillagersRespondToAttack=949;
const int cUnitTypeLogicalTypeFimbulWinterTCEvalType=950;
const int cUnitTypeLogicalTypeValidForestFireTarget=951;
const int cUnitTypeLogicalTypeAutoattackTargetsBuildings=952;
const int cUnitTypeWalkingWood=953;
const int cUnitTypeLogicalTypeLandMilitary=954;
const int cUnitTypeLogicalTypeValidSPCUnitsDeadCondition=955;
const int cUnitTypeLogicalTypeAffectedByTownBell=956;
const int cUnitTypeLogicalTypeValidFlamingWeaponsTarget=957;
const int cUnitTypeLogicalTypeGreekHeroes=958;
const int cUnitTypeLogicalTypeMilitaryUnitsAndBuildings=959;
const int cUnitTypeLogicalTypeOdinRegenerates=960;
const int cUnitTypeLogicalTypeValidTraitorsTarget=961;
const int cUnitTypeLogicalTypeSuperPredatorsAttack=962;
const int cUnitTypeLogicalTypeSuperPredatorsAutoAttack=963;
const int cUnitTypeLogicalTypeVolcanoAttack=964;
const int cUnitTypeLogicalTypeValidDeconstructionTarget=965;
const int cUnitTypeLogicalTypeValidTremorAttack=966;
const int cUnitTypeLogicalTypeAffectedByChaos=967;
const int cUnitTypeLogicalTypeValidReverseWonderTarget=968;
const int cUnitTypeLogicalTypeCanBeThrown=969;
const int cUnitTypeLogicalTypeTartarianGateValidOverlapPlacement=970;
const int cUnitTypeLogicalTypeAffectedByVortex=971;
const int cUnitTypeLogicalTypeDoesNotCreateLush=972;
const int cUnitTypeLogicalTypeAffectedByHeroize=973;
const int cUnitTypeLogicalTypeValidSpiderTarget=974;
const int cUnitTypeLogicalTypeImplodeAttack=975;
const int cUnitTypeLogicalTypeCanBeStoned=976;
const int cUnitTypeLogicalTypeAffectedByFrostGiant=977;
const int cUnitTypeLogicalTypePerseusCanStone=978;
const int cUnitTypeLogicalTypeMummyMinionTarget=979;
const int cUnitTypeTeleporter=980;
const int cUnitTypeLogicalTypeScreamsOnSpiderPull=981;
const int cUnitTypeLogicalTypeTimeshift=982;
const int cUnitTypeLogicalTypeInvulnerableToGaia=983;
const int cUnitTypeLogicalTypeEasySelectAvoid=984;
const int cUnitTypeLogicalTypeBuildingNotTitanGate=985;
const int cUnitTypeLogicalTypeBuildingsNotWalls=986;
const int cUnitTypeLogicalTypeNoFlailOnThrow=987;
const int cUnitTypeLogicalTypeEscapesFrostOnTransform=988;
const int cUnitTypeSetAnimal=989;
const int cUnitTypeLogicalTypeMythUnitNotTitan=990;
const int cUnitTypeLogicalTypeShipNotFishinghip=991;
const int cUnitTypeLogicalTypeAbstractVillNotHero=992;
const int cUnitTypeLogicalTypeHouses=993;
const int cUnitTypeLogicalTypeGates=994;



//Syscalls: 561 total.
void xsDisableRule( string ruleName ): Disables the given rule.
void xsDisableSelf( void ): Disables the current rule.
void xsEnableRule( string ruleName ): Enables the given rule.
void xsSetRulePriority( string ruleName, int priority ): Sets the priority of the given rule.
void xsSetRulePrioritySelf( int priority ): Sets the priority of the current rule.
void xsSetRuleMinInterval( string ruleName, int interval ): Sets the min interval of the given rule.
void xsSetRuleMinIntervalSelf( int interval ): Sets the min interval of the current rule.
void xsSetRuleMaxInterval( string ruleName, int interval ): Sets the max interval of the given rule.
void xsSetRuleMaxIntervalSelf( int interval ): Sets the max interval of the current rule.
void xsEnableRuleGroup( string ruleGroupName ): Enables all rule in the given rule group.
void xsDisableRuleGroup( string ruleGroupName ): Disables all rules in the given rule group.
float xsVectorGetX( vector v ): Returns the x component of the given vector.
float xsVectorGetY( vector v ): Returns the y component of the given vector.
float xsVectorGetZ( vector v ): Returns the z component of the given vector.
float xsVectorSetX( vector v, float x ): Set the x component of the given vector, returns the new vector.
float xsVectorSetY( vector v, float y ): Set the y component of the given vector, returns the new vector.
float xsVectorSetZ( vector v, float z ): Set the z component of the given vector, returns the new vector.
float xsVectorSet( float x, float y, float z ): Set the 3 components into a vector, returns the new vector.
float xsVectorLength( vector v ): Returns the length of the given vector.
float xsVectorNormalize( vector v): Returns the normalized version of the given vector.
int xsGetContextPlayer( void ): Returns the current context player ID.
void xsSetContextPlayer( int playerID ): Sets the current context player ID (DO NOT DO THIS IF YOU DO NOT KNOW WHAT YOU ARE DOING).
int xsGetTime( void ): Returns the current gametime (in milliseconds).
bool xsAddRuntimeEvent( string foo, string bar, int something ): Setups a runtime event.  Don't use this.
int xsGetFuntionID( string functionName ): Runs the secret XSFID for the function. USE WITH CAUTION.
void aiEcho( string echoString ): CP AI echo.
void aiErrorMessage( string errorString ): CP AI error.
void aiRandSetSeed( int seed ): Sets the seed of the random number generator.
int aiRandInt( int max ): Returns a random number (mod'ed by max if provided).
vector aiRandLocation( void ): Returns a random location guaranteed to be on the map.
void aiSet( string filename, int playerID ): Sets playerID's AI to the given filename.
void aiBreakpointSet( int playerID, string filename, int lineNumber, bool on ): Sets a breakpoint.
void aiBreakpointGo( int playerID ): Restart XS execution after the current breakpoint.
string aiGetPersonality( void ): Gets the player's personality.
bool aiSetPersonality( string name ): Sets the player's personality.
int aiGetMostHatedPlayerID( void ): Returns the script-defined most hated player ID for this player.
int aiCalculateMostHatedPlayerID( int comparePlayerID ): Returns the playerID for the player the AI thinks it should be attacking.
void aiSetMostHatedPlayerID( int v ): Sets the script-defined most hated player ID for this player.
int aiGetAvailableEconomyPop( void ): Returns the available economy pop for this player.
int aiGetEconomyPop( void ): Returns the script-defined economy pop for this player.
void aiSetEconomyPop( int v ): Set the script-defined economy pop for this player.
int aiGetAvailableMilitaryPop( void ): Returns the script-defined military pop for this player.
int aiGetMilitaryPop( void ): Returns the script-defined military pop for this player.
void aiSetMilitaryPop( int v ): Set the script-defined military pop for this player.
float aiGetEconomyPercentage( void ): Returns the economy priority percentage.
void aiSetEconomyPercentage( float v ): Set the economy priority percentage.
float aiGetMilitaryPercentage( void ): Returns the militarypriority percentage.
void aiSetMilitaryPercentage( float v ): Set the military priority percentage.
float aiGetAttackResponseDistance( void ): Returns the attack response distance.
void aiSetAttackResponseDistance( float v ): Set the attack response distance.
int aiGoalGetNumber( int goalType, int goalState, bool active ): Returns the number of matching goals.
int aiGoalGetIDByIndex( int goalType, int goalState, bool active, int index ): Returns the ID of matching goal.
int aiPlanGetNumber( int planType, int planState, bool active ): Returns the number of matching plans.
int aiPlanGetIDByIndex( int planType, int planState, bool active, int index ): Returns the ID of matching plan.
int aiPlanCreate( string planName, int typeName ): Creates a plan of the given name and type.
bool aiPlanDestroy( int planID ): Destroys the given plan.
bool aiPlanDestroyByName( string name ): Destroys the plan of the given name.
int aiPlanGetID( string name ): Returns the ID of the plan with the given name.
int aiPlanGetIDByTypeAndVariableType( int planType, int varType, int varID, bool active ): Returns the ID of the plan with the given parms.
int aiPlanGetIDByActiveIndex( int activeIndex ): Returns the ID of the plan with the given active index.
string aiPlanGetType( int planID ): Returns the name of the given plan.
int aiPlanGetType( int planID ): Returns the type of the given plan.
int aiPlanGetState( int planID ): Returns the state of the given plan.
int aiPlanGetActualPriority( int planID ): Returns the priority of the given plan.
int aiPlanGetDesiredPriority( int planID ): Returns the priority of the given plan.
bool aiPlanSetDesiredPriority( int planID, int priority ): Sets the priority of the given plan.
bool aiPlanAddUnitType( int planID, int unitTypeID, int numberNeed, int numberWant, int numberMax ): Adds a unit type to the plan.
int aiPlanGetNumberUnits( int planID, int unitTypeID ): Returns the number of units currently assigned in the given plan.
bool aiPlanAddUnit( int planID, int unitID ): Adds a unit to the plan.
long aiPlanGetUnitByIndex( int planID, int index ): returns the unit ID of a particular unit in the plan
vector aiPlanGetLocation( int planID ): Returns the location for this plan.
vector aiPlanGetInitialPosition( int planID ): Returns the initial positon that was set for this plan.
void aiPlanSetInitialPosition( int planID, vector initialPosition ): Sets the initial positon for this plan.
bool aiPlanSetWaypoints( int planID, int pathID ): Sets the waypoints of the given plan to the waypoints of the given path.
bool aiPlanAddWaypoint( int planID, vector waypoint ): Adds the waypoint to the given plan.
int aiPlanGetNumberVariableValues( int planID, int planVariableIndex ): Returns the number of values for this variable index.
bool aiPlanSetNumberVariableValues( int planID, int planVariableIndex, int numberValues, bool clearCurrentValues ): Sets the number of values for this variable.
bool aiPlanRemoveVariableValue( int planID, int planVariableIndex, int variableIndex ): Removes the index-th value of the variable.
bool aiPlanSetVariableInt( int planID, int planVariableIndex, int valueIndex, int value ): Sets the given variable of the given plan.
int aiPlanGetVariableInt( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanSetVariableFloat( int planID, int planVariableIndex, int valueIndex, float value ): Sets the given variable of the given plan.
float aiPlanGetVariableFloat( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanSetVariableVector( int planID, int planVariableIndex, int valueIndex, vector value ): Sets the given variable of the given plan.
vector aiPlanGetVariableVector( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanSetVariableBool( int planID, int planVariableIndex, int valueIndex, bool value ): Sets the given variable of the given plan.
bool aiPlanGetVariableBool( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanSetVariableString( int planID, int planVariableIndex, int valueIndex, string value ): Sets the given variable of the given plan.
string aiPlanGetVariableString( int planID, int planVariableIndex ): Gets the given variable of the given plan.
int aiPlanGetNumberUserVariableValues( int planID, int planVariableIndex ): Returns the number of values for this variable index.
bool aiPlanSetNumberUserVariableValues( int planID, int planVariableIndex, int numberValues, bool clearCurrentValues ): Sets the number of values for this variable.
bool aiPlanRemoveUserVariables( int planID ): Removes all of the user variables from the given plan.
bool aiPlanRemoveUserVariable( int planID, int planVariableIndex ): Removes the user variable.
bool aiPlanRemoveUserVariableValue( int planID, int planVariableIndex, int variableIndex ): Removes the index-th value of the user variable.
bool aiPlanAddUserVariableInt( int planID, int planVariableIndex, string name, int numberValues ): Adds the variable to the given plan.
bool aiPlanSetUserVariableInt( int planID, int planVariableIndex, int valueIndex, int value ): Sets the given variable of the given plan.
int aiPlanGetUserVariableInt( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanAddUserVariableFloat( int planID, int planVariableIndex, string name, int numberValues ): Adds the variable to the given plan.
bool aiPlanSetUserVariableFloat( int planID, int planVariableIndex, int valueIndex, float value ): Sets the given variable of the given plan.
float aiPlanGetUserVariableFloat( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanAddUserVariableVector( int planID, int planVariableIndex, string name, int numberValues ): Adds the variable to the given plan.
bool aiPlanSetUserVariableVector( int planID, int planVariableIndex, int valueIndex, vector value ): Sets the given variable of the given plan.
vector aiPlanGetUserVariableVector( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanAddUserVariableBool( int planID, int planVariableIndex, string name, int numberValues ): Adds the variable to the given plan.
bool aiPlanSetUserVariableBool( int planID, int planVariableIndex, int valueIndex, bool value ): Sets the given variable of the given plan.
bool aiPlanGetUserVariableBool( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanAddUserVariableString( int planID, int planVariableIndex, string name, int numberValues ): Adds the variable to the given plan.
bool aiPlanSetUserVariableString( int planID, int planVariableIndex, int valueIndex, string value ): Sets the given variable of the given plan.
string aiPlanGetUserVariableString( int planID, int planVariableIndex, int valueIndex ): Gets the given variable of the given plan.
bool aiPlanGetActive( int planID ): Gets the active-ness of the given plan.
bool aiPlanSetActive( int planID, bool active ): Sets active on/off for the given plan.
bool aiPlanGetNoMoreUnits( int planID ): Gets the noMoreUnits-ness of the given plan.
bool aiPlanSetNoMoreUnits( int planID, bool v ): Sets noMoreUnits on/off for the given plan.
bool aiPlanGetOrphan( int planID ): Gets the orphan-ness of the given plan.
bool aiPlanSetOrphan( int planID, bool orphan ): Sets orphan on/off for the given plan.
bool aiPlanGetAllowUnderAttackResponse( int planID ): Gets the UA response-ness of the given plan.
bool aiPlanSetAllowUnderAttackResponse( int planID, bool uAR ): Sets under attack response on/off for the given plan.
int aiPlanGetUnitStance( int planID ): Gets the unit stance of the given plan.
bool aiPlanSetUnitStance( int planID, int stance ): Sets unit stance for the given plan.
bool aiPlanSetRequiresAllNeedUnits( int planID, bool rANU ): Sets 'requiresAllNeedUnits' on/off for the given plan.
bool aiPlanSetEventHandler( int planID, int eventType, string handlerName ): Sets event handler function for the given plan and event.
bool aiPlanSetEscrowID( int planID, int escrowID ): Sets the escrow for the plan.
int aiPlanGetEscrowID( int planID ): Gets the escrow for the plan.
bool aiPlanGetEconomy( int planID ): Gets the economy flag of the given plan.
bool aiPlanSetEconomy( int planID, bool v ): Sets economy on/off for the given plan.
bool aiPlanGetMilitary( int planID ): Gets the military flag of the given plan.
bool aiPlanSetMilitary( int planID, bool v ): Sets military on/off for the given plan.
bool aiPlanGetAttack( int planID ): Gets the attack flag of the given plan.
bool aiPlanSetAttack( int planID, bool v ): Sets attack flag on/off for the given plan.
bool aiPlanSetBaseID( int planID, int baseID ): sets the plan's base id.
int aiPlanGetBaseID( int planID): gets the plan's base id.
int aiGetNumberIdlePlans( int planType ): Gets the of idle plans of the given type.
int aiCommsSendPromptWithVector(targetPlayerID, int promptType, int textVariant, float timeout, int yesOrderType, int noOrderType, int data1, vector position): Sends a prompt to the designated player and sets up a response.
int aiCommsSendPrompt(targetPlayerID, int promptType, int textVariant, float timeout, int yesOrderType, int noOrderType, int data1): Sends a prompt to the designated player and sets up a response.
int aiCommsSendOrderWithVector(targetPlayerID, int promptType, int data1, vector position): Sends an order to the designated player.
int aiCommsSendOrder(targetPlayerID, int promptType, int data1): Sends an order to the designated player.
int aiCommsSendStatement(targetPlayerID, int promptType, int textVariant): Sends a statement to the designated player.
int aiCommsSendStatementWithVector(targetPlayerID, int promptType, int textVariant, vector v): Sends a statement to the designated player. Adds a location flare.
bool aiCommsSetEventHandler(string handlerFunctionName ): Sets the handler for the communications system (invalid name unsets the handler).
bool aiCommsSetSpecificEventHandler(long recordID, string handlerFunctionName ): Sets the handler for a specific chat record in the comms system (invalid name unsets the handler).
bool aiSetGodPowerEventHandler(string handlerFunctionName ): Sets the handler for god power casting events (invalid name unsets the handler).
bool aiSetBuildEventHandler( string handlerFunctionName ): Sets the handler for building completed events (invalid name unsets the handler).
bool aiSetWonderDeathEventHandler( string handlerFunctionName ): Sets the handler for wonder death events (invalid name unsets the handler).
bool aiSetRetreatEventHandler( string handlerFunctionName ): Sets the handler for retreat events (invalid name unsets the handler).
bool aiSetRelicEventHandler( string handlerFunctionName ): Sets the handler for relic events (invalid name unsets the handler).
bool aiSetResignEventHandler( string handlerFunctionName ): Sets the handler for resign events (invalid name unsets the handler).
long aiCommsGetRecordType(int id): Get the type of a given record.
long aiCommsGetRecordPromptType(int id): Get the prompt type of a given record.
long aiCommsGetRecordPlayerID(int id): Get the player ID of a given record.
long aiCommsGetRecordResponse(int id): Get the response type of a given record.
long aiCommsGetResponseData(int id): Get the response data of a given record.
long aiCommsGetRecordData(int id): Get the data of a given record.
vector aiCommsGetRecordPosition(int id): Get the position of a given record.
bool aiSetAgeEventHandler( int age, string handlerFunctionName ): Sets the handler for the given age (invalid name unsets the handler).
bool aiSetUpdateResourceEventHandler( string handlerFunctionName ): Sets the handler for the update resource event (invalid name unsets the handler).
bool aiSetUpdateResourceLimit( int resourceID, float limit ): Sets the limit for the given resource for the update resource event.
bool aiTaskUnitMove( int unitID, vector position ): Does a lightweight (no plan) move tasking of the given unit to the given location.
bool aiTaskUnitWork( int unitID, int targetUnitID ): Does a lightweight (no plan) work tasking of the given unit on the given target unit.
bool aiTaskUnitBuild( int unitID, int buildingTypeID, vector position ): Does a lightweight (no plan) build tasking of the given unit to build the given building.
bool aiTaskUnitTrain( int unitID, int unitTypeID ): Does a lightweight (no plan) train tasking of the given unit for the given target unit type.
bool aiTaskUnitResearch( int unitID, int techID ): Does a lightweight (no plan) research tasking of the given unit for the given tech ID.
bool aiTaskUnitSpecialPower( int unitID, int powerID, vector position ): Does a lightweight (no plan) research tasking of the given unit for the given special power.
bool aiTaskUnitDelete( int unitID ): Deletes the given unit.
bool aiTaskUnitTransform( int unitID ): Takes the given unit, and transforms it according to the unit transform table in world.
bool aiTribute( int playerID, int resourceID, float amount ): Tributes the given player.
bool aiSellResourceOnMarket( int resourceID): sells (+100) the given resource.
bool aiBuyResourceOnMarket( int resourceID): buys (+100) the given resource.
float aiGetMarketBuyCost( int resourceID ): Returns the amount required to buy 100 units of the given resource.
float aiGetMarketSellCost( int resourceID ): Returns the amount received for selling 100 units of the given resource.
float aiGetResourceGathererPercentageWeight( int rgpIndex ): Returns the RGP weight.
void aiSetResourceGathererPercentageWeight( int rgpIndex, float weight ): Sets the RGP weight.
void aiNormalizeResourceGathererPercentageWeights( void ): Normalizes all of the resource gatherer percentages weights to 1.0.
float aiGetResourceGathererPercentage( int resourceID, int rgpIndex ): Returns the resource gatherer percentage for the given resource.
void aiSetResourceGathererPercentage( int resourceID, float value, bool normalize, int rgpIndex ): Sets the resource gatherer percentage for the given resource (if normalized is true, the percentages will be normalized to 1.0).
void aiNormalizeResourceGathererPercentages( int rgpIndex ): Normalizes all of the resource gatherer percentages to 1.0.
int aiGetResourceBreakdownNumberPlans( int resourceTypeID, int resourceSubTypeID, int baseID ): Gets the number of plans for the given breakdown.
int aiGetResourceBreakdownPlanPriority( int resourceTypeID, int resourceSubTypeID, int baseID ): Gets the priority of the plans for the given breakdown.
float aiGetResourceBreakdownPercentage( int resourceTypeID, int resourceSubTypeID, int baseID ): Gets the percentage for the given breakdown.
bool aiSetResourceBreakdown( int resourceTypeID, int resourceSubTypeID, int numberPlans, int planPriority, float percentage, int baseID ): Sets a subtype breakdown for a resource.
bool aiRemoveResourceBreakdown( int resourceTypeID, int resourceSubTypeID, int baseID ): Removes the given breakdown.
int aiGetAutoGatherEscrowID( void ): Returns the auto gather escrow ID.
void aiSetAutoGatherEscrowID( int escrowID ): Sets the auto gather escrow ID.
int aiGetAutoFarmEscrowID( void ): Returns the auto Farm escrow ID.
void aiSetAutoFarmEscrowID( int escrowID ): Sets the auto Farm escrow ID.
int aiGetFarmLimit( void ): Returns the per plan farm build limit.
void aiSetFarmLimit( int limit ): Sets the per plan farm build limit.
int aiGetTrainedDropsiteUnitTypeID( void ): Returns the trained dropsite PUID.
void aiSetTrainedDropsiteUnitTypeID( int v ): Sets the trained dropsite PUID.
void aiSetFavorNeedModifier( float v ): Sets favor need modifier.
bool aiGetAutoFavorGather( void ): Returns auto favor gather on/off.
void aiSetAutoFavorGather( bool v ): Sets auto favor gather on/off.
bool aiGetAllowAutoDropsites( void ): Returns allow auto dropsites on/off.
void aiSetAllowAutoDropsites( bool v ): Sets allow auto dropsites on/off.
bool aiGetAllowBuildings( void ): Returns allow buildings on/off.
void aiSetAllowBuildings( bool v ): Sets allow buildings on/off.
int aiWallInArea( string name, int areaID, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority ): walls in the given area.
int aiWallInAreas( string name, int areaID1, int areaID2, int areaID3, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority ): walls around all 3 areas at once.
int aiWallFromAToB( string name, vector a, vector b, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority ): walls from point a to point b.
int aiWallRingAroundPoint( string name, vector center, float radius, int numberNeed, int nubmerWant, int numberMax, int escrowID, int numGates, int planPriority ): walls a ring around the center, with a given radius.
void aiChat( int playerID, string chatString ): CP AI chat to playerID.
void aiSendChatToEveryone( string chatString ): CP AI chat to everyone.
void aiSendChatToAllies( string chatString ): CP AI chat to allies.
void aiSendChatToEnemies( string chatString ): CP AI chat to enemies.
int aiNumberUnassignedUnits( int typeID ): Returns the number of unassigned units of the given type.
int aiNumberUnassignedUnitsByGoal( int goalID ): Returns the number of unassigned units based on the goal's unit type(s).
void aiResourceCheat( int playerID, int resourceID, float amount ): Gives your wimpy CP AI free resources because it can't handle the truth, or something like that.
int aiUnitCreateCheat( int playerID, int protoUnitID, vector position, string name, int numberUnits ): Creates unit(s) with the given parms.
bool aiCastGodPowerAtPosition( int godPowerTechID, vector pos): Casts the given God power tech, at the specified position.
bool aiCastGodPowerAtUnit( int godPowerTechID, int unitID): Casts the given God power tech, at the specified unit.
int aiGetGodPowerTechIDForSlot( int slotID): Get the god power tech id from the given slot.
int aiGetGodPowerProtoIDForTechID( int techID): translate a granted tech id into a protopower id
int aiGetGodPowerType( int protoPowerID): get the type for a ProtoPower
int aiFindBestAttackGodPowerPlan(void): find a valid god power plan to attach to an attack plan
int aiFindBestTownDefenseGodPowerPlan(void): find a valid god power plan to use for town defense
int aiGetWorldDifficulty( void ): Returns the world difficulty level.
void aiSetWorldDifficulty( int v ): Sets the world difficulty level.
string aiGetWorldDifficultyName( int level ): Returns the name of the level.
int aiGetGameMode( void ): Returns the game's mode.
int aiGetCaptainPlayerID( int playerID ): Returns the captain for the given player's team.
void aiAutoSavegame( string filename ): Saves the auto, debugging savegames (THIS DOESN'T REALLY DO ANYTHING).
bool aiGetAutosaveOn(): returns whether or not its cool to turn ai autosaves on.
void aiGetCurrentResourceNeed( int resourceID ): returns the current resource need for the given resource.
bool aiSetAutoGatherMilitaryUnits( bool v ): Turns auto gathering of military units at bases on/off.
bool aiSetExploreDangerThreshold( float value): sets the ai's Explore Danger Threshold value.
float aiGetExploreDangerThreshold(): gets the ai's Explore Danger Threshold value.
void aiSetRandomMap(bool v): Sets the RM bool in the AI.
void aiSetPauseAllAgeUpgrades(bool v): sets the pause all age upgrades flag in the AI.
bool aiGetPauseAllAgeUpgrades(): gets the pause all age upgrades flag from the AI.
void aiSetMinNumberNeedForGatheringAggressvies(long v): sets the min number of needed units to gather aggressive animals.
int aiGetMinNumberNeedForGatheringAggressives(): gets the min number of needed units to gather aggressive animals.
void aiSetMinNumberWantForGatheringAggressives(long v): sets the min number of wanted units to gather aggressive animals.
int aiGetMinNumberWantForGatheringAggressives(): gets the min number of wanted units to gather aggressive animals.
void aiResign(): reigns the current player..
void aiAttemptResign(): asks the player if its ok to resign
void aiSetMaxLOSProtoUnitLimit(int limit): sets the limit for how many LOS Protounits the AI can build
int aiGetMaxLOSProtoUnitLimit(): gets the limit for how many LOS Protounits the AI can build
int aiGetPopNeeds(): gets the current Pop needs of all the plans.
void aiSwitchMainBase(int newBaseID, bool force): switch the newBaseID to be the main base.
void aiSetDefaultStance( int defaultStance ): Sets your default stance for all of your units.
void aiSetWaterMap( bool v): Tells the AI if this is a water map or not.
bool aiSetWaterMap(): Tells us if the AI thinks this is a water map or not.
void aiQueueAutoSavegame( int saveNumber ): Queues the auto savegame.
bool aiIsMultiplayer(): returns true, if this is a multiplayer game.
void kbEcho( string echoString ): Knowledge Base echo.
void kbDump( int player1, int player2 ): KB dump for player2's units from player1's perspective.
void kbDumpType( int player1, int player2, string typeName ): KB dump for player2's units of the given type from player1's perspective.
void kbLookAtAllUnitsOnMap( void ): Cheats and looks at all of the units on the map.  This will format your harddrive if you're not authorized to use it.
int kbGetPop( void ): Returns the current population for the player.
int kbGetPopCap( void ): Returns the current population cap for the player.
int kbGetAge( void ): Returns the current age for the current player.
int kbGetAgeForPlayer( int id ): Returns the current age for the player specified.
int kbGetCulture( void ): Returns the culture for the player.
int kbGetCultureForPlayer( void ): Returns the culture for the given player.
string kbGetCulture( int cultureID ): Returns the culture name for the given culture.
int kbGetCiv( void ): Returns the civilization for the player.
int kbGetCivForPlayer( void ): Returns the civ for the given player.
string kbGetCivName( int civID ): Returns the civ name for the given civ.
int kbUnitQueryCreate( string name ): Creates a unit query, returns the query ID.
bool kbUnitQueryResetData( long queryID ): Resets the given unit query data AND results.
bool kbUnitQueryResetResults( long queryID ): Resets the given unit query results.
bool kbUnitQueryDestroy( long queryID ): Destroys the given unit query.
int kbUnitQueryNumberResults( long queryID ): Returns the number of results in the current query.
int kbUnitQueryGetResult( long queryID, int index ): Returns the UnitID of the index-th result in the current query.
bool kbUnitQuerySetPlayerID( long queryID, int playerID, bool resetQueryData ): Sets query data.
bool kbUnitQuerySetPlayerRelation( long queryID, int playerRelation ): Sets query data.
bool kbUnitQuerySetUnitType( long queryID, int unitTypeID ): Sets query data.
bool kbUnitQuerySetActionType( long queryID, int actionTypeID ): Sets query data.
bool kbUnitQuerySetState( long queryID, int state ): Sets query data.
bool kbUnitQuerySetPosition( long queryID, vector v ): Sets query data.
bool kbUnitQuerySetMaximumDistance( long queryID, float distance ): Sets query data.
bool kbUnitQuerySetAscendingSort( long queryID, bool v ): If parm is true, results are sorted in ascending distance order from the query position.
bool kbUnitQuerySetBaseID( long queryID, int baseID ): Sets query data.
bool kbUnitQuerySetAreaID( long queryID, int areaID ): Sets query data.
bool kbUnitQuerySetAreaGroupID( long queryID, int areaGroupID ): Sets query data.
bool kbUnitQuerySetArmyID( long queryID, int armyID ): Sets query data.
bool kbUnitQuerySetSeeableOnly( long queryID, bool seeableOnly ): Sets query data.
int kbUnitQueryExecute( long queryID ): Executes the current query; returns number of results.
int kbUnitQueryExecuteOnQuery( long currentQueryID, int previousQueryID ): Executes the current query on the previous query's results; returns the new number of results.
int kbUnitQueryExecuteOnQueryByName( long currentQueryID, string previousQueryName ): Executes the current query on the previous query's results; returns the new number of results.
int kbUnitGetPlanID( int unitID ): Returns the plan ID for this unit ID.
int kbUnitGetBaseID( int unitID ): Returns the base ID for this unit ID.
int kbUnitGetAreaID( int unitID ): Returns the area ID for this unit ID.
int kbUnitGetArmyID( int unitID ): Returns the army ID for this unit ID.
int kbUnitGetMovementType( int unitTypeID ): Returns the movementType for this unitTypeID.
float kbUnitGetCurrentHitpoints( int unitID ): Returns the current hitpoints for this unit ID.
float kbUnitGetMaximumHitpoints( int unitID ): Returns the maximum hitpoints for this unit ID.
float kbUnitGetHealth( int unitID ): Returns the health for this unit ID.
float kbUnitGetCurrentAICost( int unitID ): Returns the current AI cost (worth) for this unit ID.
float kbUnitGetMaximumAICost( int unitID ): Returns the maximum AI cost (worth) for this unit ID.
vector kbUnitGetPosition( int unitID ): Returns the position for this unit ID.
bool kbUnitIsType( int unitID, long unitTypeID ): Returns true if the unit is of the unitTypeID.
int kbUnitGetActionType( int unitID ): Returns the actionTypeID of the unit.
int kbUnitGetTargetUnitID( int unitID ): Returns the target unit ID of the given unit.
int kbUnitGetNumberWorkers( int unitID ): Returns the number of units currently working on the given unit.
int kbUnitGetWorkerID( int unitID, int index ): Returns the index-th worker unit ID.
int kbGetBuildLimit(int player, int unitTypeID ): Returns the number of the unit type you are allowed to have (ONLY WORKS ON BASE UNIT TYPES); returns -1 if there is no limit.
int kbGetPopCapAddition(int player, int unitTypeID ): Returns amount of pop cap addition provided by the given unit type (ONLY WORKS ON BASE UNIT TYPES).
int kbGetPopSlots(int player, int unitTypeID ): Returns the number of pop slots this unit takes (ONLY WORKS ON BASE UNIT TYPES).
int kbGetPopulationSlotsByUnitTypeID( int playerID, int unitTypeID ): Returns the number of pop slots currently occupied by this unit type.
int kbGetPopulationSlotsByQueryID( int queryID ): Returns the number of pop slots currently occupied by the results in the given query.
int kbUnitCount(int player, int unitTypeID, int stateID ): Returns a quick unit count of units for a player.
void kbUnitCountConsole(int playerID1, int playerID2, string unitType, string state(s) ): Returns a quick unit count of player2's units from player1's perspective.
vector kbGetMapCenter( void ): Returns the center vector of the map.
float kbGetMapXSize( void ): Returns the X size of the map.
float kbGetMapZSize( void ): Returns the Z size of the map.
void kbAreaCalculate(): Creates areas and area groups. DO THIS BEFORE ANYTHING ELSE IN YOUR SCRIPT.
int kbAreaGetNumber( void ): Returns the number of areas.
int kbAreaGetIDByPosition( vector position ): Returns the ID of the given area.
int kbAreaGroupGetIDByPosition( vector position ): Returns the ID of the given area group.
vector kbAreaGetCenter( int areaID ): Returns the center of the given area.
int kbAreaGetNumberTiles( int areaID ): Returns the number of tiles in the given area.
int kbAreaGetNumberBlackTiles( int areaID ): Returns the number of black tiles in the given area.
int kbAreaGetNumberVisibleTiles( int areaID ): Returns the number of visible tiles in the given area.
int kbAreaGetNumberFogTiles( int areaID ): Returns the number of fog tiles in the given area.
int kbAreaGetVisibilityChangeTime( int areaID ): Returns the gametime of the last visibility change for the given area.
int kbAreaGetNumberUnits( int areaID ): Returns the number of units in the given area.
int kbAreaGetUnitID( int areaID, long index ): Returns the Unit ID of the index-th unit in the given area.
int kbAreaGetNumberBorderAreas( int areaID ): Returns the number of border areas for the given area.
int kbAreaGetBorderAreaID( int areaID, long index ): Returns the Area ID of the index-th border area in the given area.
int kbAreaGetType( int areaID ): Returns the Type of area.
int kbAreaFindBestGatherAreaID( int unitTypeID ): Returns the Area ID of the best area to gather the given unit type.
int kbAreaGetClosetArea( vector position, int areaType, int areaType1, float minDistance ): Returns the Area ID of the closest area, of the given types, to given postion.
int kbPathCreate( string name ): Creates a path with the given name.
bool kbPathDestroy( int pathID ): Destroys the given path.
int kbPathGetNumber( void ): Returns the number of paths.
int kbPathGetIDByIndex( long index ): Returns the index-th path ID.
string kbPathGetName( int pathID ): Returns the name of the given path.
float kbPathGetLength( int pathID ): Returns the length of the given path.
int kbPathGetNumberWaypoints( int pathID ): Returns the number of waypoints in the given path.
bool kbPathAddWaypoint( int pathID, vector waypoint ): Adds the waypoint to the given path.
vector kbPathGetWaypoint( int pathID, long waypointNumber ): Returns the appropriate waypoint from the given path.
bool kbCanSimPath( vector pointA, vector pointB, long protoUnitTypeID, float range ): Returns true if the given unit type can path from pointA to pointB.
bool kbCanPath2( vector pointA, vector pointB, long protoUnitTypeID, float range ): Returns true if the given unit type can path from pointA to pointB.
int kbCreateAttackRoute( string name, int startAreaID, int goalAreaID, int numInitialRoutes): Returns the Route ID if successful.
int kbCreateAttackRouteWithPath( string name, vector startPt, vector endPt): Returns the Route ID if successful.
bool kbDestroyAttackRoute( int routeID ): Returns true if the route was deleted.
bool kbAddAttackRouteSector( int sector ): add a new sector to path to.
bool kbAddAttackRouteIgnoreID( int ignoreAreaID ): ignore this area when finding the route.
bool kbAddAttackRouteIgnoreType( int ignoreAreaTypeID ): ignore this areatype when finding the route.
bool kbAttackRouteAddPath( int attackRouteID, int pathID): Rreturns true if path was added to attack route.
bool kbMakeAttackRoutes(): find all the paths to the sector specified.
int kbGetNumAttackRoutes( long startAreaID, long goalAreaID): Returns num paths from start to goal area.
int kbGetAttackRouteID( long startAreaID, long goalAreaID): Returns the id of the routes from area1 to area2.
int kbEscrowCreate( string name, int resourceID, float percentage, int parentID ): Creates an escrow.
bool kbEscrowDestroy( int escrowID, bool promoteChildren ): Destroys an escrow.
int kbEscrowGetID( string name ): Returns the ID of the named escrow.
float kbEscrowGetPercentage( int escrowID, int resourceID ): Returns the percentage of the escrow.
bool kbEscrowSetPercentage( int escrowID, int resourceID, float percentage ): Sets the percentage of the escrow.
bool kbEscrowSetCap( int escrowID, int resourceID, float cap ): Sets the cap of the escrow.
float kbEscrowGetAmount( int escrowID, int resourceID ): Returns the amount of credits in the given escrow for the given resource.
bool kbEscrowFlush( int escrowID, int resourceID, bool flushChildren ): Removes all credits (and puts them into the root escrow) of the given resource type from the given escrow.
bool kbEscrowAllocateCurrentResources( void ): Reallocates the current resource stockpile into the escrows.
int kbBuildingPlacementCreate( string name ): Creates a building placement; returns the ID.
bool kbBuildingPlacementDestroy( int id ): Destroys the given building placement.
bool kbBuildingPlacementResetResults( void ): Resets the current building placement.
bool kbBuildingPlacementSelect( int id ): Selects the given building placement.
bool kbBuildingPlacementSetEventHandler( int eventType, string handlerName ): Sets event handler function for the current BP and event.
bool kbBuildingPlacementSetBuildingType( int buildingTypeID ): Sets the building type for the current building placement.
bool kbBuildingPlacementSetBaseID( int baseID, int locationPref ): Sets the base ID and location preference for the current building placement.
bool kbBuildingPlacementAddAreaID( int areaID, int numberBorderAreaLayers, bool addCenterInfluence ): Adds the Area ID to the current BP (with the given number of border area layers), addCenterInfluence - adds a positional influence from the area center.
bool kbBuildingPlacementAddAreaGroupID( int areaGroupID ): Adds the AreaGroup ID to the current BP.
bool kbBuildingPlacementSetCenterPosition( vector position, float distance, float obstructionRadius ): Sets up center position-based BP.
bool kbBuildingPlacementAddUnitInfluence( int typeID, float value, float distance, long kbResourceID ): Adds the unit influence for the current building placement.
bool kbBuildingPlacementAddPositionInfluence( vector position, float value, float distance ): Adds the position influence for the current building placement.
bool kbBuildingPlacementSetMinimumValue( float minimumValue ): Sets the minimum acceptable value for evaluated spots in the BP.
bool kbBuildingPlacementStart( void ): Starts the placement of current building.
vector kbBuildingPlacementGetResultPosition( int bpID ): Returns the vector result position for given BP ID.
float kbBuildingPlacementGetResultValue( int bpID ): Returns the result value for given BP ID.
int kbTargetSelectorCreate( string name ): Creates a target selector; returns the ID.
bool kbTargetSelectorDestroy( int id ): Destroys the given target selector.
bool kbTargetSelectorResetResults( void ): Resets the current target selector.
bool kbTargetSelectorSelect( int id ): Selects the given target selector.
bool kbTargetSelectorAddUnitType( int protoUnitTypeID ): Add the UAIT for the given BASE unit type as a filter.
bool kbTargetSelectorAddQueryResults( int queryID ): Sets the list of potential targets to the results in the given query.
int kbTargetSelectorGetNumberResults( void ): Returns the number of results in the given target selector.
int kbTargetSelectorGetResultValue( int index ): Returns the result value for given index of the current target selector.
bool kbTargetSelectorStart( void ): Starts the current target selector.
bool kbSetupForResource( int baseID, int resourceID, float distance, float amount ): Returns true if amount of resource is within distance of a dropsite.
float kbResourceGet( int resourceID ): Returns the current amount of the given resource.
float kbMaximumResourceGet( int resourceID ): Returns the maximum amount of the given resource you can have.
float kbTotalResourceGet( int resourceID ): Returns the total amount of the given resource gathered to this point in the game.
int kbGetNumberValidResourcesByPlan( int planID, int baseID ): Returns the number of valid KB resources for the given plan/base.
int kbGetNumberValidResources( int baseID, int resourceTypeID, int resourceSubTypeID, float distance ): Returns the number of valid KB resources for the resource types.
float kbGetAmountValidResources( int baseID, int resourceTypeID, int resourceSubTypeID, float distance  ): Returns the resource amount of valid KB resources for the resource types.
float kbGetResourceIncome( int resourceID, float seconds, bool relative ): Returns the resource income over the last X seconds.bool kbProtoUnitAvailable( int protoUnitID ): Returns true if the protoUnit is currently available.
int kbGetProtoUnitID( string name ): Returns the ID of the protounit.
bool kbCanAffordUnit( int protoUnitTypeID, int escrowID ): Returns true if the player can afford the proto unit.
float kbUnitCostPerResource( int protoUnitID, int resourceID): returns the cost of the protounit for the given resource.
bool kbCanAffordTech( int techID, int escrowID ): Returns true if the player can afford the tech.
float kbTechCostPerResource( int techID, int resourceID): returns the cost of the tech for the given resource.
int kbGetTechStatus( int techID ): Returns the current tech status for the current player of the requested tech.
float kbGetTechPercentComplete( int techID ): Returns the percent complete for the the requested tech of the current player.
float kbGetCombatEfficiency( int playerID1, int unitTypeID1, int playerID2, int unitTypeID2 ): Returns the combat efficiency of the comparison (in terms of playerID1's units).
float kbGetAICostWeight( int resourceID ): Returns the AI cost weight for the given resource.
bool kbSetAICostWeight( int resourceID, float weight ): Sets the weight this resource type is given during AI cost calculuations.
float kbGetProtoUnitAICost( int protoUnitTypeID ): Returns the AI cost for the given protoUnit type ID.
float kbGetTechAICost( int techID ): Returns the AI cost for the given tech ID.
bool kbIsPlayerResigned( <playerID> ): Returns the player's resigned status.
bool kbHasPlayerLost( <playerID> ): Returns the player's lost status.
int kbGetPlayerTeam( <playerID> ): Returns the player's team number.
bool kbIsPlayerEnemy( int playerID ): Returns true if the given player is an enemy.
bool kbIsPlayerNeutral( int playerID ): Returns true if the given player is a neutral player.
bool kbIsPlayerAlly( int playerID ): Returns true if the given player is an ally.
bool kbIsPlayerMutualAlly( int playerID ): Returns true if the given player is a mutual ally.
int kbGetNumberMutualAllies( void ): Returns the number of mutual allies.
bool kbIsPlayerValid( int playerID ): Returns true if the given player is a valid player (i.e. it exists in the game).
bool kbIsPlayerHuman( int playerID ): Returns true if the given player is a a human player.
float kbGetPlayerHandicap( int playerID ): Returns the player's handicap multiplier (ie., 1.0 = no handicap).
void kbSetPlayerHandicap( int playerID, float handicap ): Sets the indicated player's handicap multiplier (ie., 1.0 = no handicap).
bool kbIsGameOver(): Returns whether the game is over or not.
vector kbGetTownLocation( void ): Returns the location of the main town.
int kbGetTownAreaID( void ): Returns the area ID of the main town.
bool kbSetTownLocation( vector location ): Sets the location of the main town.
bool kbGetAutoBaseCreate( void ): Returns the auto base creation value.
void kbSetAutoBaseCreate( bool v ): Sets the auto base creation value.
float kbGetAutoBaseCreate( void ): Returns the auto base creation distance.
void kbSetAutoBaseCreateDistance( float v ): Sets the auto base creation distance.
bool kbGetAutoBaseDetect( void ): Returns the auto base detection value.
void kbSetAutoBaseDetect( bool v ): Sets the auto base detection value.
float kbGetAutoBaseDetect( void ): Returns the auto base creation distance.
void kbSetAutoBaseDetectDistance( float v ): Sets the auto base creation distance.
int kbBaseGetNextID( void ): Returns the ID of the next base that will be created.
int kbBaseGetNumber( int playerID ): Returns the number of bases for the given player.
int kbBaseGetIDByIndex( int playerID, int index ): Returns the BaseID for the given base.
int kbBaseCreate( int playerID, string name, vector position, float distance ): Creates a base.
int kbBaseFindCreateResourceBase( int resourceType, int resourceSubType, int parentBaseID ): Finds/Creates a resource base.
int kbBaseFindCreateResourceBase( int enemyPlayerID, int enemyBaseID ): Finds/Creates a 'forward' military base against the given enemy base.
bool kbBaseDestroy( int playerID, int baseID ): Destroys the given base.
void kbBaseDestroyAll( int playerID ): Destroys all of the bases for the given player.
vector kbBaseGetLocation( int playerID, int baseID ): Gets the location of the base.
vector kbBaseGetLocation( int playerID, int baseID ): Gets the last known damage location of the base.
bool kbBaseSetFrontVector( int playerID, int baseID, vector frontVector ): Sets the front (and back) of the base.
vector kbBaseGetFrontVector( int playerID, int baseID ): Gets the front vector of the base.
vector kbBaseGetBackVector( int playerID, int baseID ): Gets the back vector of the base.
int kbBaseGetTimeUnderAttack( int playerID, int baseID ): Returns the number of continuous seconds the base has been under attack.
bool kbBaseGetUnderAttack( int playerID, int baseID ): Gets the under attack flag of the base.
bool kbBaseSetActive( int playerID, int baseID, bool active ): Sets the active flag of the base.
bool kbBaseGetActive( int playerID, int baseID ): Gets the active flag of the base.
int kbBaseGetMainID( int playerID ): Gets the main base ID for the player.
bool kbBaseSetMain( int playerID, int baseID, bool main ): Sets the main flag of the base.
bool kbBaseGetMain( int playerID, int baseID ): Gets the main flag of the base.
bool kbBaseSetForward( int playerID, int baseID, bool forward ): Sets the forward flag of the base.
bool kbBaseGetForward( int playerID, int baseID ): Gets the forward flag of the base.
bool kbBaseSetSettlement( int playerID, int baseID, bool settlement ): Sets the settlement flag of the base.
bool kbBaseGetSettlement( int playerID, int baseID ): Gets the settlement flag of the base.
bool kbBaseSetMilitary( int playerID, int baseID, bool military ): Sets the military flag of the base.
bool kbBaseGetMilitary( int playerID, int baseID ): Gets the military flag of the base.
vector kbBaseGetMilitaryGatherPoint( int playerID, int baseID ): Gets the military gather point of the base.
bool kbBaseSetMilitaryGatherPoint( int playerID, int baseID, vector gatherPoint ): Sets the military gather point of the base.
bool kbBaseSetEconomy( int playerID, int baseID, bool Economy ): Sets the economy flag of the base.
bool kbBaseGetEconomy( int playerID, int baseID ): Gets the economy flag of the base.
float kbBaseGetMaximumResourceDistance( int playerID, int baseID ): Gets the maximum resource distance of the base.
void kbBaseSetMaximumResourceDistance( int playerID, int baseID, float distance ): Sets the maximum resource distance of the base.
bool kbBaseAddUnit( int playerID, int baseID, int unitID ): Adds the given unit to the base.
bool kbBaseRemoveUnit( int playerID, int baseID, int unitID ): Removes the given unit to the base.
int kbBaseGetNumberUnits( int playerID, int baseID, int relation, int unitTypeID ): Returns the number of units that match the criteria.
bool kbUnitVisible( int unitID ): Returns true if the unit is currently visible to the player.
bool kbLocationVisible( vector location ): Returns true if the location is currently visible to the player.
vector kbGetBlockPosition( string blockName ): Returns the position of the cinematic block.
int kbGetBlockID( string blockName ): Returns the UnitID of the cinematic block.
int kbGetRandomEnabledPUID( int unitTypeID, int escrowID ): Returns a random, valid PUID that's of the given type.
int kbUnitPickCreate( string name ): Creates a unit pick.
bool kbUnitPickDestroy( int upID ): Destroys the given unit pick.
bool kbUnitPickResetAll( int upID ) : Resets all of the unit pick data.
bool kbUnitPickResetResults( int upID ) : Resets the unit pick results.
float kbUnitPickGetPreferenceWeight( int upID ) : Gets the unit pick preference weight.
bool kbUnitPickSetPreferenceWeight( int upID, float v ) : Sets the unit pick preference weight.
bool kbUnitPickSetEnemyPlayerID( int upID ) : Sets the unit pick enemy player ID.
bool kbUnitPickSetCombatEfficiencyWeight( int upID ) : Sets the unit pick combat efficiency weight.
bool kbUnitPickResetCombatEfficiencyTypes( int upID ) : Resets the enemy unit typeIDs for the unit pick combat efficiency calculation.
bool kbUnitPickAddCombatEfficiencyType( int upID, int typeID, float weight ) : Adds an enemy unit typeID to the unit pick combat efficiency calculation.
bool kbUnitPickSetCostWeight( int upID ) : Sets the unit pick cost weight.
bool kbUnitPickSetMovementType( int upID, int movementType ) : Sets the unit pick movement type.
bool kbUnitPickSetDesiredNumberUnitTypes( int upID, int number, int numberBuildings, bool degradeNumberBuildings ) : Sets the unit pick desired number unit types.
int kbUnitPickGetDesiredNumberUnitTypes( int upID ) : Gets the unit pick desired number unit types.
bool kbUnitPickSetDesiredNumberBuildings( int upID, int index, int numberBuildings ) : Sets the unit pick desired number buildings for the index-th unit type.
int kbUnitPickGetDesiredNumberBuildings( int upID, int index ) : gets the unit pick desired number buildings for the index-th unit type.
bool kbUnitPickSetMinimumNumberUnits( int upID, int number ) : Sets the unit pick desired number unit types.
int kbUnitPickGetMinimumNumberUnits( int upID ) : Gets the unit pick minimum number units.
bool kbUnitPickSetMaximumNumberUnits( int upID, int number ) : Sets the unit pick desired number unit types.
int kbUnitPickGetMaximumNumberUnits( int upID ) : Gets the unit pick maximum number units.
bool kbUnitPickSetMinimumPop( int upID, int number ) : Sets the unit pick desired min pop.
int kbUnitPickGetMinimumPop( int upID ) : Gets the unit pick minimum pop.
bool kbUnitPickSetMaximumPop( int upID, int number ) : Sets the unit pick desired max pop.
int kbUnitPickGetMaximumPop( int upID ) : Gets the unit pick maximum pop.
bool kbUnitPickSetAttackUnitType( int upID, int type ) : Sets the unit pick attack unit type.
int kbUnitPickGetAttackUnitType( int upID ) : Gets the unit pick attack unit type.
bool kbUnitPickSetGoalCombatEfficiencyType( int upID, int type ) : Sets the unit pick attack unit type.
int kbUnitPickGetGoalCombatEfficiencyType( int upID ) : Gets the unit pick attack unit type.
bool kbUnitPickSetPreferenceFactor( int upID, int unitTypeID, float preferenceFactor ) : Sets the preferenceFactor for that unit type.
bool kbUnitPickAdjustPreferenceFactor( int upID, int unitTypeID, float baseFactorAdjustment ) : Adjusts the preferenceFactor for that unit type (uses 50.0 as the base if the UP doesn't exist yet).
int kbUnitPickRun( int upID ) : Runs the unit pick.
int kbUnitPickGetNumberResults( int upID ) : Returns the number of unit pick results.
int kbUnitPickGetResult( int upID, int index ) : Returns the index-th ProtoUnitID.
int kbFindAreaGroup( int groupType, float surfaceAreaRatio, int compareAreaID) : returns the visible area group that matches the given criteria.
int kbFindAreaGroupByLocation( int groupType, float relativeX, float relativeZ ) : returns the visible area group that matches the given criteria.
int kbFindBestBuildingToRepair(vector position, float distance, float healthRatio, int repairUnderAttackUnitTypeID) : returns the id of the best building to repair.
void kbSetForwardBasePosition(vector position) set the explicit position that every forward base will use.
int kbArmyCreate( string name, bool exclusiveUnits ): Creates a army with the given name.
bool kbArmyDestroy( integer id ): Destroys the given army.
int kbArmyGetNumber( void ): Returns the number of armies.
int kbArmyGetID( string name ): Returns the ID of the given army.
int kbArmyGetIDByIndex( long index ): Returns the index-th army ID.
string kbArmyGetName( integer id ): Returns the name of the given army.
int kbArmyGetNumberUnits( integer armyID ): Returns the number of units in the given army.
int kbArmyGetUnitID( integer armyID, long unitNumber ): Returns the appropriate unitID from the given army.
bool kbArmyAddUnit( integer armyID, integer unitID ): Adds the unitID to the given army.
bool kbArmyRemoveUnit( integer armyID, integer unitID ): Removes the unitID from the given army.
bool kbArmyRemoveUnitByIndex( integer armyID, integer unitIndex ): Removes the unitIndex-th unit from the given army.
bool kbArmyRemoveUnits( integer armyID ): Removes all units from the given army.
int kbArmyGetPlanID( integer armyID ): Returns the planID for the given army.
int kbArmyGetCreationTime( integer armyID ): Returns the creation time for the given army.
int kbArmyGetMembershipTime( integer armyID ): Returns the creation time for the given army.
vector kbArmyGetLocation( integer armyID ): Returns the vector location for the given army.
int kbArmyGetNumberWithinLocation( integer armyID, vector point, float range ): Returns the number of units within range of the given point in the given army.
float kbArmyGetCurrentHitpoints( integer armyID ): Returns the current total hitpoints for the given army.
float kbArmyGetMaximumHitpoints( integer armyID ): Returns the maximum total hitpoints for the given army.
float kbArmyGetHealth( integer armyID ): Returns the health for the given army.
int kbArmyGetNumberWithHealth( integer armyID, float minimumHealth ): Returns the number of units with at least the minimum amount of health specified for the given army.
float kbArmyGetCurrentAICost( integer armyID ): Returns the current AI cost (worth) for the given army.
float kbArmyGetMaximumAICost( integer armyID ): Returns the maximum AI cost (worth) for the given army.
float kbArmyGetAPSDamageTaken( integer armyID, float timeSpan ): Returns the APS damage taken by the given army.
float kbArmyGetAPSDamageGiven( integer armyID, float timeSpan ): Returns the APS damage given by the given army.
float kbArmyGetAPSResourcesGathered( integer armyID, float timeSpan, integer resourceID ): Returns the APS resources gathered by the given army.
void kbForceContextPlayerID: use for debugging or manual scenario repair ONLY!!!
int kbTechTreeGetNumberMatrixUnitTypeIDs( void ): Returns the number of matrix unit type IDs.
int kbTechTreeGetMatrixUnitTypeIDByIndex( int index ): Returns the matrix unit typeID at the given index.
int kbTechTreeGetTotalUnitIDsByMatrix(long mainUnitTypeID, int counterUnitTypeID): Returns the total number of unitIDs matching the main type that has the given counter type.
int kbTechTreeGetUnitIDByMatrixIndex(long mainUnitTypeID, int counterUnitTypeID, int index): Returns the index'th unitID matching the main type that has the given counter type.
int kbTechTreeGetTotalUnitIDsByFunction( int functionID ): Returns the total number of unitIDs that performs the given function.
int kbTechTreeGetUnitIDTypeByFunctionIndex( int functionID, int index ): Returns the index'th unitID of the unit that performs the given function.
int kbTechTreeGetNumberDropsiteUnitIDsByResource( int resourceID ): Returns the number of unit typeIDs for dropsites that take the given resource.
bool kbTechTreeClearDropsiteUnitIDsByResource( int resourceID ): Clears the list of dropsites for the given resource type.
bool kbTechTreeAddDropsiteUnitIDByResource( int resourceID ): Adds the base unit type ID as a dropsite for the given resource.
int kbTechTreeGetDropsiteUnitIDByResource( int resourceID, int index ): Returns the index-th unitID of the dropsite that takes the given resource.
int kbTechTreeGetUnitIDByTrain( int unitTypeID, int civID ): Returns the unitTypeID of the unit that can train the given unitTypeID.
int kbTechTreeGetNumberTrainProtos( int unitTypeID ): Returns the number of protos that can train the given unitTypeID.
int kbTechTreeGetUnitIDByTrainIndex( int unitTypeID, int trainProtoIndex ): Returns index'th unitTypeID of the unit that can train the given unitTypeID.
int kbTechTreeGetNumberObtainProtos( int techID ): Returns the number of protos that the given techID can be obtained from.
int kbTechTreeGetUnitIDByObtainIndex( int techID, int obtainProtoIndex ): Returns index'th unitTypeID of the unit that the given techID, can be obtained from.
string kbGetTechName( int techID ): Returns the name of the tech ID.
string kbGetProtoUnitName( int protoUnitTypeID ): Returns the name of the protounit ID.
int kbGetUnitBaseTypeID( int unitID ): Returns the base type ID of the unit.
string kbGetUnitTypeName( int unitTypeID ): Returns the name of the unit type.
int kbTechTreeGetUnitUpgradeTechTotal( int unitTypeID ): Returns the total number of upgrade techs of the unit type.
int kbTechTreeGetUnitUpgradeTech( int unitTypeID, int index ): Returns the index'th upgrade techs of the unit type.
int kbTechTreeGetCheapestUnitUpgrade( int protoUnitID, int upgradeQueryType, int resourceFilterID, int buildingFilterID, bool echoResults, int affectedUnitType )
int kbTechTreeGetRandomUnitUpgrade()
bool kbTechTreeIsMinorGod( int techID ) : returns true if techID is a minor god tech.
int kbTechTreeGetGPTechID( int minorGodTechID ) : returns the GP techID that is enabled by minorGodTechID.
bool kbTechTreeAddMinorGodPref( int techID ) : have progressions preference this minor god selection.
bool kbTechTreeRemoveMinorGodPref( int techID ) : removes this minor god as perference in Progressions.
int kbTechTreeGetMinorGodMythUnitTotal( int minorGodTechID) : returns the total number of myths units enabled by this minor god.
int kbTechTreeGetMinorGodMythUnitByIndex( int minorGodTechID, int index ) : returns the protoID of a myth unit
int kbTechTreeGetMinorGodChoices( int index, int age ) : returns the minorGodTechID of the given index, given the age, -1 means the next age.
int kbProgressionGetTotalNodes( int progressionID ): Returns the total number of steps to complete the progression.
float kbProgessionGetTotalResourceCost( int progressionID, int resourceID ): Returns the total cost of the given resource for this progressionID.
float kbProgessionGetTotalWorkCost( int progressionID ): Returns the total work cost this progressionID.
int kbProgressionGetNodeType( int progressionID, int nodeIndex ): Returns the type of node at the given index, either Unit type or Tech type.
int kbProgressionGetNodeData( int progressionID, int nodeIndex ): Returns the data at nodeIndex, either UnitID or TechID, depending on the type.
bool kbProgressionIsNodeMinorGod( int progressionID, int nodeIndex )