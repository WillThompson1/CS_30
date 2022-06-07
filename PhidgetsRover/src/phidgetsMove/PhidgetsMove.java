package phidgetsMove;

import com.phidget22.*;

public class PhidgetsMove {

	public static void main(String[] args) throws Exception {

	//connecting to the wireless rover
	Net.addServer("", "192.168.100.1", 566, "", 0);
		
	//create
	DCMotor leftMotors = new DCMotor();
	DCMotor rightMotors = new DCMotor();
	VoltageRatioInput hAxis = new VoltageRatioInput();
	
	//address
	leftMotors.setChannel(0);
	rightMotors.setChannel(1);
	hAxis.setChannel(1);
	
	//open
	leftMotors.open(5000);
	rightMotors.open(5000);
	hAxis.open(5000);
	
	//increasing the acceleration 
	leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
    rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	
    //using the phidget
	while(true) {
		
	//get the data from vertical axis (from -1 to 1)
	double horizontalAxis = hAxis.getVoltageRatio();
	System.out.println(horizontalAxis);
	
		
	//using the thumbstick positions, set motor controller target velocity
	leftMotors.setTargetVelocity(horizontalAxis);
	rightMotors.setTargetVelocity(horizontalAxis);
		
	System.out.println(horizontalAxis);
	
	//pause .1 seconds
	Thread.sleep(100);
	
    }
  }
}
