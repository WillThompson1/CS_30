package exercise3;




public class Car extends Vehicle {

	private String bodyType;
	
	public Car(int doors, double accel, String manu, String c, String trans, String body, boolean t) {
			super(doors, accel, manu, c, trans, t);
	 
	bodyType = body;
	
	
	}


	public String getBodyType() {
		return(bodyType);
	}


	public String getBodyTypeString() {
		
		if (bodyType.equalsIgnoreCase("coupe")) {
			return("is a coupe");
		}
		if (bodyType.equalsIgnoreCase("sedan")) {
			return("is a sedan");
		}
		else if (bodyType.equalsIgnoreCase("SUV")) {
			return("is an SUV");
		} return null;
	}

}
