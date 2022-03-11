package exercise1;



/* 
 *  Both types of employee (Faculty and Staff) inherent the attributes from the UEmployee class
 *  (FirstName, LastName and Salary)
 */
public class Faculty extends UEmployee {
	
	//initializing string used to store department
	private String Deptname;
	
	
	public Faculty(String Fn, String Ln, Integer Sal, String D) {
		super(Fn, Ln, Sal);
	
		Deptname = D;
	}
	
	
	public String toString() {
		return(super.toString() + " " + Deptname);
		
  }	
}