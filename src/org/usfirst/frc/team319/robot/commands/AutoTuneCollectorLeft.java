package org.usfirst.frc.team319.robot.commands;



import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoTuneCollectorLeft extends CommandGroup {

    public AutoTuneCollectorLeft() {

    	addSequential(new AutoTuneVelocityConfigure(Robot.cubeCollector, Robot.cubeCollector.collectorLeftMotor, 
    			Robot.cubeCollector.COLLECTOR_PROFILE, FeedbackDevice.CTRE_MagEncoder_Relative, true, false));

    	addSequential(new AutoTuneVelocity(Robot.cubeCollector, Robot.cubeCollector.collectorLeftMotor,
    			Robot.cubeCollector.COLLECTOR_PROFILE, 2000, 50));
    }
}
