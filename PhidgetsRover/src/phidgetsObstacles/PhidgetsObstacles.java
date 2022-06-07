package phidgetsObstacles;


import com.phidget22.*;

public class PhidgetsObstacles {

	 public static void main(String[] args) throws Exception {

	        //Connect to wireless rover
	        Net.addServer("", "192.168.100.1", 5661, "", 0);

	        //Create
	        DCMotor leftMotors = new DCMotor();
	        DCMotor rightMotors = new DCMotor();
	        DistanceSensor sonar = new DistanceSensor();
	        sonar.setDataInterval(100);
	        
	        //Address
	        leftMotors.setChannel(0);
	        rightMotors.setChannel(1);

	        //Open
	        leftMotors.open(5000);
	        rightMotors.open(5000);
	        sonar.open(5000);

	        while (true) {

	            System.out.println("Distance: " + sonar.getDistance() + " mm");
	            
	            
	            //modified so the fidget moves forwards faster but also stops sooner 
	            if (sonar.getDistance() < 400) {
	                //Object detected! Stop motors
	                leftMotors.setTargetVelocity(-0.40);
	                rightMotors.setTargetVelocity(0);
	                Thread.sleep(100);
	                leftMotors.setTargetVelocity(0);
	                rightMotors.setTargetVelocity(0);
	                
	            } else {
	                //Move forward slowly (40% max speed)
	                leftMotors.setTargetVelocity(0.40);
	                rightMotors.setTargetVelocity(-0.40);
	            }

	            //Wait for 250milliseconds
	            Thread.sleep(100);
	        }
	    }     
  }

	  