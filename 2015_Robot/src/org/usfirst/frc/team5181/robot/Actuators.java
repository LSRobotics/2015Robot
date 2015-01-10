package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class Actuators {
	
	public final Victor frontLeft;
	public final Victor rearLeft;
	public final Victor frontRight;
	public final Victor rearRight;
	
	public Actuators() {
		 frontLeft = new Talon(FLPort); 
		 rearLeft = new Talon(RLPort); 
		 frontRight = new Talon(FRPort); 
		 rearRight = new Victor(RRPort); 
	}
	
	public Victor getWheel(int choice) {
		switch (choice){
			case 1:
				return frontLeft;
				break;
			case 2:
				return rearLeft;
				break;
			case 3:
				return frontRight;
				break;
			case 4:
				return rearRight;
				break;
			default:
				return null;
		}
	}
}
