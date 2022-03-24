package exercise3;

public class Vehicle {

	private int doorNumber, acceleration;
	private String manufacturer, transmission, color;
	private boolean turbo;
	
	public Vehicle (int doors, int accel, String manu, String c, String trans, boolean t) {
		
		doorNumber = doors;
		acceleration = accel;
		manufacturer = manu;
		color = c;
		turbo = t;
		transmission = trans;
	}
	
	public int getDoorNumber() {
		return(doorNumber);
	}
	
	public int getAcceleration() {
		return(acceleration);
	}
	
	public String getManufacturer() {
		return(manufacturer);
	}
	
	public String getColor() {
		return(color);
	}
	
	public boolean getTurbo() {
		return(turbo);
	}
	
	public String getTransmission() {
		return(transmission);
	}
	
	
	
	
	
	
	
	
}
