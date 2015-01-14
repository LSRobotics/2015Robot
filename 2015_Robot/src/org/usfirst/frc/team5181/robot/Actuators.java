package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.Victor;

public class Actuators implements StaticVars {
	
	public final Victor frontLeft;
	public final Victor rearLeft;
	public final Victor frontRight;
	public final Victor rearRight;
	
	public Actuators() {
		 frontLeft = new Victor(FLPort); 
		 rearLeft = new Victor(RLPort); 
		 frontRight = new Victor(FRPort); 
		 rearRight = new Victor(RRPort); 
	}
	
	public Victor getWheel(int choice) {
		switch (choice){
			case 1:
				return frontLeft;
			case 2:
				return rearLeft;
			case 3:
				return frontRight;
			case 4:
				return rearRight;
			default:
				return null;
		}
	}
}
