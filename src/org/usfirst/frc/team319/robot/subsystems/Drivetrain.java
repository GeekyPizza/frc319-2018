package org.usfirst.frc.team319.robot.subsystems;

import java.util.ArrayList;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.commands.drivetrain.BobDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.RemoteSensorSource;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private boolean isHighGear = true;

	public static int LOW_GEAR_PROFILE = 2;
	public static int HIGH_GEAR_PROFILE = 0;
	public static int ROTATION_PROFILE = 1;
	
	public double rotationP = 1.8;
	public double rotationI = 0.001;
	public double rotationD = 50.0; 
	public double rotationF = 0.0;
	public int rotationIZone = 30; 

	// Mag Encoder Gains
	private SRXGains lowGearGains = new SRXGains(LOW_GEAR_PROFILE, 0.600, 0.0, 12.00, 0.0763, 0);
	private SRXGains highGearGains = new SRXGains(HIGH_GEAR_PROFILE, 0.25, 0.00005, 0.8, 0.05115, 50); 
	private SRXGains rotationGains = new SRXGains(ROTATION_PROFILE, rotationP, rotationI, rotationD, rotationF, rotationIZone); 
	private BobTalonSRX leftFollower = new BobTalonSRX(7);
	private BobTalonSRX rightFollower = new BobTalonSRX(2);
	public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(6, leftFollower); 
	public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(1, rightFollower);

	private PigeonIMU pigeon = new PigeonIMU(leftFollower);

	public Drivetrain() {

		leftLead.setInverted(true);
		leftLead.configPrimaryFeedbackDevice(FeedbackDevice.CTRE_MagEncoder_Relative);//sets encoder type
		leftLead.setSensorPhase(false);

		rightLead.setInverted(false);// true
		rightLead.configPrimaryFeedbackDevice(FeedbackDevice.CTRE_MagEncoder_Relative);//sets encoder type
		rightLead.setSensorPhase(false);
		
		leftLead.enableCurrentLimit(false);
		leftLead.configContinuousCurrentLimit(60);
		rightLead.enableCurrentLimit(false);
		rightLead.configContinuousCurrentLimit(60);

		//time required to ramp up to speed 
		leftLead.configOpenloopRamp(0.25);
		rightLead.configOpenloopRamp(0.25);

		setNeutralMode(NeutralMode.Coast);

		//configs PID Gains 
		configGains(highGearGains);
		configGains(lowGearGains);
		configGains(rotationGains);

		// configure distance sensor
		// Remote 0 will be the other side's Talon
		rightLead.configRemoteSensor0(leftLead.getDeviceID(), RemoteSensorSource.TalonSRX_SelectedSensor);
		rightLead.configSensorSum(FeedbackDevice.RemoteSensor0, FeedbackDevice.CTRE_MagEncoder_Relative);
		rightLead.configPrimaryFeedbackDevice(FeedbackDevice.SensorSum, 0.5); // distances from left and right are
																				// summed, so average them
		
		//I is limited to a certain amount
		rightLead.configMaxIntegralAccumulator(ROTATION_PROFILE, 3000);

		// configure angle sensor
		// Remote 1 will be a pigeon		
		rightLead.configRemoteSensor1(leftFollower.getDeviceID(), RemoteSensorSource.GadgeteerPigeon_Yaw);
		rightLead.configSecondaryFeedbackDevice(FeedbackDevice.RemoteSensor1, (3600.0 / 8192.0)); // Coefficient for
																									// Pigeon to

		// convert to 360
		leftLead.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 5, 0);
		rightLead.configAuxPIDPolarity(false, 0);
		
	}

	public void initDefaultCommand() {
		setDefaultCommand(new BobDrive());
	}

	public void configGains(SRXGains gains) {
		this.leftLead.setGains(gains);
		this.rightLead.setGains(gains);
	}

	
	//left and right are the move values passed into the method from the driver sticks
	public void drive(ControlMode controlMode, double left, double right) {
		this.leftLead.set(controlMode, left);
		this.rightLead.set(controlMode, right);
	}
	
	public void stopDrivetrain() {
		this.leftLead.set(ControlMode.PercentOutput, 0);
		this.rightLead.set(ControlMode.PercentOutput, 0);
	}

	public void drive(ControlMode controlMode, DriveSignal driveSignal) {
		this.drive(controlMode, driveSignal.getLeft(), driveSignal.getRight());
	}

	public void setCrossTheFieldRotatePValue() {
		rotationP = 1.6;
	}

	public void setDefaultRotationSRXGains() {
		rotationP = 1.8;
	}

	public double getLeftDriveLeadDistance() {
		return this.leftLead.getSelectedSensorPosition();
	}

	public double getRightDriveLeadDistance() {
		return this.rightLead.getSelectedSensorPosition();
	}

	public double getLeftDriveLeadVelocity() {
		return this.leftLead.getSelectedSensorVelocity();
	}

	public double getRightDriveLeadVelocity() {
		return this.rightLead.getSelectedSensorVelocity();
	}

	public void setDrivetrainPositionToZero() {
		this.leftLead.setSelectedSensorPosition(0);
		this.rightLead.setSelectedSensorPosition(0);
	}

	public double getLeftLeadVoltage() {
		return this.leftLead.getMotorOutputVoltage();
	}

	public double getRightLeadVoltage() {
		return this.rightLead.getMotorOutputVoltage();
	}

	public double getLeftClosedLoopError() {
		return this.leftLead.getClosedLoopError();
	}

	public double getRightClosedLoopError() {
		return this.rightLead.getClosedLoopError();
	}

	public TalonSRX getLeftLeadTalon() {
		return this.getLeftLeadTalon();
	}

	public TalonSRX getRightLeadTalon() {
		return this.rightLead;
	}

	public void setNeutralMode(NeutralMode neutralMode) {
		this.leftLead.setNeutralMode(neutralMode);
		this.rightLead.setNeutralMode(neutralMode);
	}

	public boolean isHighGear() {
		return isHighGear;
	}

	public void setIsHighGear(boolean isHighGear) {
		this.isHighGear = isHighGear;
		//setting class variable equal to method variable
	}

	public double getAngle() {
		double[] ypr = new double[3];
		pigeon.getYawPitchRoll(ypr);
		return ypr[0];
	}

	public double getDistance() {
		return rightLead.getPrimarySensorPosition();
	}

	public double getVelocity() {
		return rightLead.getPrimarySensorVelocity();
	}

	public void resetPigeon() {
		this.pigeon.setYaw(0.0, 0);
		//Yaw is rotation of robot during autos 
	}

	@Override
	public void periodic() {
		SmartDashboard.putBoolean("Drivetrain High Gear", isHighGear);
		SmartDashboard.putNumber("Left Drive Position", getLeftDriveLeadDistance());
		SmartDashboard.putNumber("Right Drive POsition", getRightDriveLeadDistance());
		SmartDashboard.putNumber("Drivetrain Angle", getAngle());
		SmartDashboard.putNumber("Angle Error", rightLead.getClosedLoopError(1));
		SmartDashboard.putNumber("Drivetrain Velocity", getVelocity());
		SmartDashboard.putNumber("Drivetrain Distance", getDistance());
		SmartDashboard.putNumber("Left Lead Current", leftLead.getOutputCurrent());
		SmartDashboard.putNumber("Left Follower Current", leftFollower.getOutputCurrent());
		SmartDashboard.putNumber("Right Lead Current", rightLead.getOutputCurrent());
		SmartDashboard.putNumber("Right Follower Current", rightFollower.getOutputCurrent());
	}
}
