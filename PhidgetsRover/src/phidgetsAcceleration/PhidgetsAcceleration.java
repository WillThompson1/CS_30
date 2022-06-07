package phidgetsAcceleration;

import com.phidget22.*;

public class PhidgetsAcceleration {

	 public static void main(String[] args) throws Exception {

	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        //Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();

	        //Address
	        leftMotors.setHubPort(5);
	        leftMotors.setChannel(0);
	        rightMotors.setHubPort(5);
	        rightMotors.setChannel(1);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        
	        //Increasing acceleration 
	        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());

	        //Move forward at full speed
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(1);

	        //Wait for 1 second
	        Thread.sleep(1000);

	        //reverse at full speed
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(-1);
	        
	        //one second pause
	        Thread.sleep(1000);
	        
	        //stop both motors
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
  }
}
	  
