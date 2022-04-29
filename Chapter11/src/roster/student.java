package roster;

import java.io.Serializable;

public class student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2959650939919521860L;
	static String firstName;
	static String lastName;
    static String nameOfFile;
	
	public student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	
	}
	
	

	public String toString()  {
		String StudentString;
		
		StudentString = firstName + " " + lastName;
		return(StudentString);
	}
}
