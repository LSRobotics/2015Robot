
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
     * 
     * left side of the robot controlled by right analog stick
     * right side controlled by left analog stick
     */
    public void teleopPeriodic() {
    	double rightAxisValue = gamePad.getRawAxis(CustomJoystick.RIGHT_Stick_Y);
    	double leftAxisValue = gamePad.getRawAxis(CustomJoystick.LEFT_Stick_Y);
    	
    	actuators.frontLeft.set(-leftAxisValue);
    	actuators.rearLeft.set(-leftAxisValue);
    	actuators.frontRight.set(rightAxisValue);
    	actuators.rearRight.set(rightAxisValue);
    } 
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	
    }
    
}
