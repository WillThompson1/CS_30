
//UniTester Class for Exercise 1 
//Will Thompson 



package exercise1;

import java.util.Scanner;

public class Unitester {


	
	
	public static UEmployee assign() {
		
		//creating a new scanner to receive inputs 
		Scanner input = new Scanner(System.in);
	
		//asking the set of questions on name, age, salary and faculty and assigning the answers to variables 
		System.out.println("");
		System.out.println("Enter employees first name");
		String Fn = input.next();
		
		System.out.println("Enter employees last name");
		String Ln = input.next();
		
		System.out.println("Enter employees salary");
		int Sal = input.nextInt();
		
		System.out.println("Enter employee type: Faculty or Staff");
		//creates a string to store how the user responds to the question
		String EmpType;
		EmpType = input.next();
		input.close();
		
	/* 
		  decision making statement depending on whether the previously entered string states that the employee is a faculty member, 
		  equalsIgnoreCase means the comparison to the inputed string ignores case considerations 				*/ 
		if(EmpType.equalsIgnoreCase("Faculty")) {
			
			System.out.println("Enter Department name:");
			//D string is set up so that it can input and display two word answers for department, Ex. (computer science)
			String D = input.next(); 
			       D+= input.nextLine();
			//return specific to faculty that displays all of the variables that have been inputed, including department
		    return new Faculty(Fn, Ln, Sal, D);
			
		}
		else
		{
			
			System.out.println("Enter job title");
			//Job string has also been set up to take multiple word answers
			String Job = input.next();
			       Job += input.nextLine();
			//return specific to staff that displays all of the variables that have been inputed, including job
			return new Staff(Fn, Ln, Sal, Job);
					
  } 
}	
	
		//adding main class and employees 
		public static void main(String[] args) {
			
			//creates variable for each of the three employees that will be inputed and displayed
			UEmployee emp1, emp2, emp3;
		
	   /* 	assigns the traits from the public class UEmployee to each employee variable (emp1, emp2, emp3) so that
		    each employee being inputed gets its own set of questions asked and integers assigned to it 		*/	 
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			
			
			//after all three employees have had variables assigned to them the variables are displayed back to the user
			System.out.println("University Employees:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
  }	
}
