package roster;

import java.io.Serializable;

public class student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2959650939919521860L;
	static String firstName;
	static String lastName;
	
	public student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	
	}
	
	

	public String toString()  {		//toString method that prints the firstname and lastname with a space 
		String StudentString;
		
		StudentString = firstName + " " + lastName;
		return(StudentString);
	}
}
