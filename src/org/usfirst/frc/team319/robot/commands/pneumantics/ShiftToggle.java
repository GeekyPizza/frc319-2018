package org.usfirst.frc.team319.robot.commands.pneumantics;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftToggle extends Command {

    public ShiftToggle() {
        // Use requires() here to declare subsystem dependencies
       // requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	/*if(Robot.pneumatics.isHighGear == false) {
    		Robot.pneumatics.shiftUp();
    		System.out.println("High Gear");
    	}else if (Robot.pneumatics.isHighGear == true) {
    		Robot.pneumatics.shiftDown();
    		System.out.println("Low Gear");
    	}*/
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}