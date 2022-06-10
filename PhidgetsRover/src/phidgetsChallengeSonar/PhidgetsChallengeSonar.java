package phidgetsChallengeSonar;

import com.phidget22.*;

public class PhidgetsChallengeSonar {

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
	        

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);
	        sonar.setDataInterval(100);
	        int y = 0;
	        
	        while (true) {
	        y++;
	        System.out.println("Distance:" + sonar.getDistance());
	        
	        if (sonar.getDistance() < 1200) {
		       	 
	        	leftMotors.setTargetVelocity(-1);
	        	rightMotors.setTargetVelocity(1); 
	        	Thread.sleep(850);
	        	
	            leftMotors.setTargetVelocity(0);
	        	rightMotors.setTargetVelocity(0); 
	        	Thread.sleep(1000);
	        		    
	            leftMotors.setTargetVelocity(-1);
	        	rightMotors.setTargetVelocity(-1);
	            Thread.sleep(500);
	                	
	            leftMotors.setTargetVelocity(0);
	        	rightMotors.setTargetVelocity(0); 
	        	Thread.sleep(1000);
	        }
	        	 
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
		        
		        if (sonar.getDistance() < 1200) {
			       	 
		        	leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(1); 
		        	Thread.sleep(850);
		        	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        		    
		            leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(-1);
		            Thread.sleep(500);
		                	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        }
		        
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
		        
		        if (sonar.getDistance() < 1200) {
			       	 
		        	leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(1); 
		        	Thread.sleep(850);
		        	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        		    
		            leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(-1);
		            Thread.sleep(1000);
		                	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        }
		        
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
		        Thread.sleep(210);
		        
		        if (sonar.getDistance() < 1200) {
			       	 
		        	leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(1); 
		        	Thread.sleep(850);
		        	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        		    
		            leftMotors.setTargetVelocity(-1);
		        	rightMotors.setTargetVelocity(-1);
		            Thread.sleep(1000);
		                	
		            leftMotors.setTargetVelocity(0);
		        	rightMotors.setTargetVelocity(0); 
		        	Thread.sleep(1000);
		        }
		        
		        //Move forward at full speed
		        leftMotors.setTargetVelocity(-1);
		        rightMotors.setTargetVelocity(1);
		        
		        //1.62 second pause
		        Thread.sleep(1450);
		        
		        //stopping both motors
		        leftMotors.setTargetVelocity(0);
		        rightMotors.setTargetVelocity(0);
		       
		        Thread.sleep(1000);
	     
	          
	        
	        Thread.sleep(100);
	        
	       }
	 }

}
	


	

	
	
	
	
	
	

