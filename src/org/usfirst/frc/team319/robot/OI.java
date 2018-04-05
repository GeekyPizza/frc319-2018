/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import org.usfirst.frc.team319.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team319.arcs.CrossTheLineArc;
import org.usfirst.frc.team319.arcs.FifteenFeetReverseArc;
import org.usfirst.frc.team319.arcs.FiveFeetAndTurnArc;
import org.usfirst.frc.team319.arcs.LeftSwitchToFirstCubePt2Arc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftScaleNullZoneArc;
import org.usfirst.frc.team319.arcs.RightWallToLeftScaleArc;
import org.usfirst.frc.team319.arcs.RightWallToRightScaleArc;
import org.usfirst.frc.team319.arcs.StraightForwardTuningArc;
import org.usfirst.frc.team319.arcs.TuningTestAutoArc;
import org.usfirst.frc.team319.controllers.BobXboxController;
import org.usfirst.frc.team319.paths.FifteenFeetReversePath;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.GoToClimbPose;
import org.usfirst.frc.team319.robot.commands.GoToScaleBottomPose;
import org.usfirst.frc.team319.robot.commands.GoToScaleMiddlePose;
import org.usfirst.frc.team319.robot.commands.GoToScalePose;
import org.usfirst.frc.team319.robot.commands.GoToScaleTopPose;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_paths.DoubleSwitchLeft;
import org.usfirst.frc.team319.robot.commands.autonomous_paths.RightSideLeftScale;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStopCollectorAndRumble;
import org.usfirst.frc.team319.robot.commands.drivetrain.DrivetrainBrakeMode;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScaleBottomPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScaleMiddlePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScaleTopPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorHoldPositionToggle;
import org.usfirst.frc.team319.robot.commands.elevator.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.pneumatics.CollectorToggle;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftToggle;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftToggle;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public BobXboxController driverController;
	public BobXboxController operatorController;

	public OI() {

		driverController = new BobXboxController(0, 0.10, 0.08);

		driverController.leftTriggerButton.configureThreshold(0.075);

		driverController.rightBumper.whenPressed(new AutoCollectCubeOpened(true));
		driverController.leftBumper.whenPressed(new AutoCollectCubeClosed(true));
		driverController.rightTriggerButton.whenPressed(new CollectorToggle());
		driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		driverController.bButton.whenPressed(new CubeCollectorStopCollectorAndRumble());
		driverController.startButton.whenPressed(new DrivetrainBrakeMode());
		driverController.leftStickButton.whenPressed(new DrivetrainShiftToggle());

	

		operatorController = new BobXboxController(1, 0.1, 0.125);
		
		operatorController.leftTriggerButton.whenPressed(new GoToScaleMiddlePose());
		operatorController.rightTriggerButton.whenPressed(new GoToCollectPose());
		operatorController.leftBumper.whenPressed(new WristGoHome());
		operatorController.rightBumper.whenPressed(new WristGoToExchange());
		operatorController.aButton.whenPressed(new GoToDunkPose(0.0));
		operatorController.bButton.whenPressed(new GoToScaleBottomPose());
		operatorController.xButton.whenPressed(new GoToSwitchPose(0.0));
		operatorController.yButton.whenPressed(new GoToScaleTopPose());
		operatorController.startButton.whenPressed(new ElevatorShiftToggle());
		
		
		
		operatorController.Dpad.Up.whenPressed(new GoToClimbPose());
		//operatorController.Dpad.Left.whenPressed(new ElevatorGoToSwitchPosition());
		//operatorController.Dpad.Down.whenPressed(new GoToCollectPose());

		
		
		// ---------------test buttons-------------------//

		//this.driverController.xButton.whenPressed(new DoubleSwitchLeft());
		this.driverController.xButton.whenPressed(new FollowArc(new LeftSwitchToFirstCubePt2Arc()));

		// this.operatorController.xButton.whenPressed(new ElevatorMotionMagicTest());
		// this.operatorController.bButton.whenPressed(new ElevatorGoToHomePosition());
		//this.operatorController.Dpad.Up.whenPressed(new ElevatorGoToDunkPosition());
		//this.operatorController.Dpad.Down.whenPressed(new ElevatorGoToSwitchPosition());

	}
}
