
package org.usfirst.frc.team5181.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DriverStation;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directoLy.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
	DriveTrain driveTrain;
	Joystick gamePad;
	Actuators actuators;
	DriverStation driverStation;
	boolean tStart = false;
	Timer t;
	
    public void robotInit() {
    	gamePad = new Joystick(0);
    	actuators = new Actuators();
    	driveTrain = new DriveTrain(actuators);
    	t = new Timer();
    	driverStation = DriverStation.getInstance();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	if (tStart == false) {
    		t.start();
    		tStart = true;
    	}
    	if (t.get() < 2.0) 
    		{
    		driveTrain.tankDrive(.1, .1);
    		}
    	else {
    		t.stop();
    		t.reset();
    		driveTrain.tankDrive(0, 0);
    		tStart = false;
    	}
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    	
    	double Lx = gamePad.getRawAxis(CustomJoystick.RIGHT_Stick_X);
    	double Ly = -gamePad.getRawAxis(CustomJoystick.RIGHT_Stick_Y);
    	driverStation.reportError("Lx: " + Lx + "\n Ly: " + Ly + "\n", false);
    	double mag = Math.sqrt((Lx * Lx) + (Ly * Ly));
    	
    	double dir = Math.atan2(Ly, Lx);
    	dir *= (180/Math.PI);
    	driverStation.reportError("ArcTan2: " + dir + "\n", false);
    	
    	driveTrain.mecanmDrive(gamePad.getMagnitude(), gamePad.getDirectionDegrees(), gamePad.getRawAxis(CustomJoystick.RIGHT_Stick_X) ); //mag, dir, rot
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	
    }
    
}
