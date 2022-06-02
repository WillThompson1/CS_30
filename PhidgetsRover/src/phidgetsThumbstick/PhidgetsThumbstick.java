package phidgetsThumbstick;

import com.phidget22.*;

public class PhidgetsThumbstick {

	public static void main(String[] args) throws Exception {

	//connecting to the wireless rover
	Net.addServer("", "192.168.100.1", 566, "", 0);
		
	//create
	DCMotor leftMotors = new DCMotor();
	DCMotor rightMotors = new DCMotor();
	VoltageRatioInput vAxis = new VoltageRatioInput();
	
	//address
	leftMotors.setChannel(0);
	rightMotors.setChannel(1);
	vAxis.setChannel(0);
	
	//open
	leftMotors.open(5000);
	rightMotors.open(5000);
	vAxis.open(5000);
	
	//increasing the acceleration 
	leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
    rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	
    //using the phidget
	while(true) {
		
	//get the data from vertical axis (from -1 to 1)
	double verticalAxis = vAxis.getVoltageRatio();
		
	//using the thumbstick positions, set motor controller target velocity
	leftMotors.setTargetVelocity(verticalAxis);
	rightMotors.setTargetVelocity(verticalAxis);
		
	//pause .1 seconds
	Thread.sleep(100);
	
    }
  }
}
