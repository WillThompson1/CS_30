package roster;

public class student {

	private String firstName;
	private String lastName;

	
	public void Student(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public String toString()  {
		String StudentString;
		
		StudentString = firstName + " " + lastName;
		return(StudentString);
	}
}
