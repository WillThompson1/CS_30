package exercise3;





public class Car extends Vehicle {

	private String bodyType;
	
	public Car(int doors, int accel, String manu, String c, String trans, String body, boolean t) {
			super(doors, accel, manu, c, trans, t);
	 
	bodyType = body;
	
	
	}


	public String getBodyType() {
		return(bodyType);
	}


	


}
