package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.RobotDrive;


public class DriveTrain implements StaticVars {
	
	private final RobotDrive rd;
	
	/*
	 * @param 
	 * */
	public DriveTrain(Actuators actuators){ 
		rd = new RobotDrive(actuators.getWheel(FLPort),
							actuators.getWheel(RLPort),
							actuators.getWheel(FRPort),
							actuators.getWheel(RRPort));
	}
	
	public void tankDrive(double leftValue, double rightValue){
		rd.tankDrive(leftValue, rightValue, true);
	}
	
	public void mecanmDrive(double magnitude, double direction, double rotation){
		rd.mecanumDrive_Polar(magnitude, direction, rotation);
		//rd.mec
	}
}

