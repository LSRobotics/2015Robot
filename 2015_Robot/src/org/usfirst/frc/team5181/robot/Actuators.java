package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class Actuators {
	
	private final Talon frontLeft;
	
	
	private final Talon rearLeft;
	
	
	private final Talon frontRight;
	
	
	private final Victor rearRight;
	

	
	public Actuators(){
		 frontLeft = new Talon(FLPort); 
		 rearLeft = new Talon(RLPort); 
		 frontRight = new Talon(FRPort); 
		 rearRight = new Victor(RRPort); 
	}
}
