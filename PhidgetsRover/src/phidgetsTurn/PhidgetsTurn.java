
package phidgetsTurn;

import com.phidget22.*;

public class PhidgetsTurn {
    public static void main(String[] args) throws Exception{

        //Connect to wireless rover
        Net.addServer("", "192.168.100.1", 5661, "", 0);

        //Create
        DCMotor leftMotors = new DCMotor();
        DCMotor rightMotors = new DCMotor();
        VoltageRatioInput vAxis = new VoltageRatioInput(); 
        VoltageRatioInput hAxis = new VoltageRatioInput(); 

        //Address
        leftMotors.setChannel(1);
        rightMotors.setChannel(0);
        vAxis.setChannel(1);
        hAxis.setChannel(0);

        //Open
        leftMotors.open(5000);
        rightMotors.open(5000);
        vAxis.open(5000);
        hAxis.open(5000);

        //Increase acceleration 
        leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
        rightMotors.setAcceleration(rightMotors.getMaxAcceleration());

        //Use your Phidgets
        while(true){

            //Get data from vertical and horizontal axis (values between -1 and 1)
            double verticalAxis = vAxis.getVoltageRatio();
            double horizontalAxis = hAxis.getVoltageRatio();

            //Use thumbstick data to figure how each side of rover should move
            double leftMotorsSpeed = verticalAxis + horizontalAxis;
            double rightMotorsSpeed = verticalAxis - horizontalAxis;

            //Limit values to between -1 and 1
            if(leftMotorsSpeed > 1) leftMotorsSpeed = 1;
            if(leftMotorsSpeed < -1) leftMotorsSpeed = -1;
            if(rightMotorsSpeed > 1) rightMotorsSpeed = 1;
            if(rightMotorsSpeed < -1) rightMotorsSpeed = -1;

            //Apply values 
            leftMotors.setTargetVelocity(leftMotorsSpeed); 
            rightMotors.setTargetVelocity(rightMotorsSpeed);

            //Wait for 100 milliseconds
            Thread.sleep(100);
        }
    }
}