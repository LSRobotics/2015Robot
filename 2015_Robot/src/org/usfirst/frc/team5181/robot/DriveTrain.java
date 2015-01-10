package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class DriveTrain {
	
	private final RobotDrive rd;
	
	
	/*
	 * @param 
	 * */
	public DriveTrain(Actuators actuators){ 
		rd = new RobotDrive();
	}
	
	public Drive(){
		
	}
}