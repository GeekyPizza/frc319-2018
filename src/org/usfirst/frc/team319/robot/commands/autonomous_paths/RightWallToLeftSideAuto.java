package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToRightSideArc;
import org.usfirst.frc.team319.arcs.RightWallToLeftSideArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.drivetrain.SetCrossTheFieldRotationSRXGains;
import org.usfirst.frc.team319.robot.commands.drivetrain.SetDefaultRotationSRXGains;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightWallToLeftSideAuto extends CommandGroup {

	public RightWallToLeftSideAuto() {

		addSequential(new SetCrossTheFieldRotationSRXGains());
		addSequential(new FollowArc(new RightWallToLeftSideArc()));
		addSequential(new SetDefaultRotationSRXGains());

	}
}
