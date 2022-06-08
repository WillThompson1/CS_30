package phidgetsChallenge;

import com.phidget22.*;

public class PhidgetsChallenge {

	 public static void main(String[] args) throws Exception {

	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        //Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        DistanceSensor sonar = new DistanceSensor();

	        //Address
	        leftMotors.setHubPort(5);
	        leftMotors.setChannel(0);
	        rightMotors.setHubPort(5);
	        rightMotors.setChannel(1);
	        sonar.setHubPort(3);
	        
	        

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        
	        while (true) {
	        
	        if (sonar.getDistance() < 400) {
	        		 
	        	leftMotors.setTargetVelocity(-1);
		        rightMotors.setTargetVelocity(-1);
	        	Thread.sleep(400);
	        	
	        	leftMotors.setTargetVelocity(0);
		        rightMotors.setTargetVelocity(0);
	        		 
	         } else {
	        	
	        //increasing acceleration  	 
	        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
	 	    rightMotors.setAcceleration(rightMotors.getMaxAcceleration());
	 	      	 
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(1);

	        //1.62 second pause
	        Thread.sleep(1502);

	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1200);
	        
	        //turn right
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);
	        
	        //0.59 second pause
	        Thread.sleep(220);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(1);
	        
	        //1.62 second pause
	        Thread.sleep(1502);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1200);
	        
	        //turn right
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);
	        
	        //0.59 second pause
	        Thread.sleep(215);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(1);
	        
	        //1.62 second pause
	        Thread.sleep(1502);
	        
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	        
	        Thread.sleep(1200);
	        
	        //turn right
	        leftMotors.setTargetVelocity(1);
	        rightMotors.setTargetVelocity(1);
	        
	        //0.59 second pause
	        Thread.sleep(210);
	        
	        //Move forward at full speed
	        leftMotors.setTargetVelocity(-1);
	        rightMotors.setTargetVelocity(1);
	        
	        //1.62 second pause
	        Thread.sleep(1450);
	        
	      
	        
	        //stopping both motors
	        leftMotors.setTargetVelocity(0);
	        rightMotors.setTargetVelocity(0);
	         }
}
}
}
	  
	
	
	

	

	
	
	
	
	
	

