
//Staff Class for Exercise 1 
//Will Thompson 



package exercise1;



/* Class for when the user is inputing the information for a staff member, the class extends the UEmployee class, 
 * inheriting the basic information required for an employee 
 */
public class Staff extends UEmployee {
	
	//initializing string used to store the job title, which is staff specific 
	private String jobTitle; 

		public Staff(String Fn, String Ln, int Sal, String Job) {
			super(Fn, Ln, Sal);
			
			jobTitle = Job;		
		}

		//when the staff class is called it will return the job title 
		public String toString() {
			return(super.toString() + " " + jobTitle);

			
  }
}