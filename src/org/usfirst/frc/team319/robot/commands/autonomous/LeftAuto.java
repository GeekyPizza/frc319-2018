package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftAuto extends CommandGroup {

    public LeftAuto(GameState gameState) {
    	
    	if(gameState.mySwitchSide == Side.LEFT) {
			addSequential(new FollowTrajectory("OneFoot"));
		}else {
			addSequential(new FollowTrajectory("CrossTheLine"));
		}
    }
}