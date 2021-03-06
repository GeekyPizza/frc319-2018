package org.usfirst.frc.team319.robot.commands.autonomous_subsystems;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToAutoSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToAutoSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoGoToSwitchPose extends CommandGroup {

	public AutoGoToSwitchPose() {

		addParallel(new WristGoToAutoSwitchPosition());
		addSequential(new ElevatorGoToAutoSwitchPosition());
		addSequential(new WristGoToParallel());

	}
}
