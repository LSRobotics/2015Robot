package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class Actuators {
	
	private final Talon frontLeft;
	private final int FLPort = 1;
	
	private final Talon rearLeft;
	private final int RLPort = 2;
	
	private final Talon frontRight;
	private final int FRPort = 3;
	
	private final Victor rearRight;
	private final int RRPort = 4;

	
	public Actuators(){
		 frontLeft = new Talon(FLPort); 
		 rearLeft = new Talon(RLPort); 
		 frontRight = new Talon(FRPort); 
		 rearRight = new Victor(RRPort); 
	}
}
