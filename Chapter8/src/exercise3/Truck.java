package exercise3;

public class Truck extends Vehicle{

	private String BedSize;
	
	public Truck(int doors, int accel, String manu, String c, String trans, String Bed, boolean t) {
		super(doors, accel, manu, c, trans, t);
	
		BedSize = Bed;
	}

	public String getBedSize() {
		return(BedSize);
	}

	public String getBodyTypeString() {
		
		if (BedSize.equalsIgnoreCase("short")) {
			return("truck has a short bed");
		}
		if (BedSize.equalsIgnoreCase("standard")) {
			return("truck has a standard bed");
		}
		else if (BedSize.equalsIgnoreCase("long")) {
			return("truck has a long bed");
		} return null;
	}
	
}