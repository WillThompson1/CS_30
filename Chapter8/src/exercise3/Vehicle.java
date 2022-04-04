package exercise3;

public abstract class Vehicle {

	private int doorNumber;
	private double acceleration;
	private String manufacturer, transmission, color;
	private boolean turbo;
	
	public Vehicle (int doors, double accel, String manu, String c, String trans, boolean t) {
		
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
	
	public double getAcceleration() {
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
