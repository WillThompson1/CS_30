package exercise3;

public class Minivan extends Vehicle {

	
private int capacity;
	
	public Minivan(int doors, int accel, int cap, String manu, String c, String trans, boolean t) {
			super(doors, accel, manu, c, trans, t);
	 
	capacity = cap;
	
	}
	
	
	public int getCapacity() {
		return(capacity);
	}
	
	

		
		
	
	
	
	
}
