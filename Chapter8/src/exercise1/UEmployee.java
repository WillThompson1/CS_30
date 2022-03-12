
//UEmployee Class for Exercise 1
//Will Thompson 



package exercise1;




public class UEmployee {

	private String firstName, lastName;
	private Integer Salary; 
	
	//creating the basic information for an employee that will be later inherited by the staff and faculty classes)
	public UEmployee(String Fn, String Ln, Integer Sal) {
		
		firstName = Fn;
		lastName = Ln; 
		Salary = Sal;
		
	}
	
	
	//returns a string representation of the object that contains the basic information for an employee 
	public String toString() {
		return (firstName + " " + lastName + " $" + Salary);
	
  }
}