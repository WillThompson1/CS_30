package PhidgetsChallenge;

import com.phidget22.*;

//Phidgets Challenge application navigates around the tape square without sonar 


public class phidgetsChallenge {

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
		        
		        //0.220 second pause
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
		        
		        //0.215 second pause
		        Thread.sleep(215);
		        
		        //Move forward at full speed
		        leftMotors.setTargetVelocity(-1);
		        rightMotors.setTargetVelocity(1);
		        
		        //1.502 second pause
		        Thread.sleep(1502);
		        
		        leftMotors.setTargetVelocity(0);
		        rightMotors.setTargetVelocity(0);
		        
		        Thread.sleep(1200);
		        
		        //turn right
		        leftMotors.setTargetVelocity(1);
		        rightMotors.setTargetVelocity(1);
		        
		        //0.59 second pause
		        Thread.sleep(200);
		        
		        //Move forward at full speed
		        leftMotors.setTargetVelocity(-1);
		        rightMotors.setTargetVelocity(1);
		        
		        //1.62 second pause
		        Thread.sleep(1450);
		        
		        //stopping both motors
		        leftMotors.setTargetVelocity(0);
		        rightMotors.setTargetVelocity(0);
		       
		        Thread.sleep(1000);
    
	       }
	 }


	


	

	
	
	
	
	
	

