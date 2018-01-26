package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeCollectorTest extends Command {

    public CubeCollectorTest() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.cubeCollector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	ControlMode controlMode = ControlMode.Velocity;
    	double speed = -2000; //1.0
    	Robot.cubeCollector.collectorLeftMotor.set(controlMode, speed);
    	//Robot.cubeCollector.setCubeCollector(controlMode, speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.cubeCollector.isCubeCollected();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
