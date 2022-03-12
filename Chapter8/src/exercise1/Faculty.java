
//Faculty Class for Exercise 1
//Will Thompson



package exercise1;



/* 
 *  Both types of employee (Faculty and Staff) inherent the attributes from the UEmployee class
 *  (FirstName, LastName and Salary)
 */
public class Faculty extends UEmployee {
	
	//initializing string used to store department, which is faculty specific 
	private String Deptname;
	
	
	public Faculty(String Fn, String Ln, Integer Sal, String D) {
		super(Fn, Ln, Sal);
	
		Deptname = D;
	}
	
	//when the faculty class is called it will return the department name 
	public String toString() {
		return(super.toString() + " " + Deptname);
		
  }	
}