package exercise1;

import java.util.Scanner;

public class Unitester {


	
	
	public static UEmployee assign() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("");
		System.out.println("Enter employees first name");
		String Fn = input.next();
		
		System.out.println("Enter employees last name");
		String Ln = input.next();
		
		System.out.println("Enter employees salary");
		int Sal = input.nextInt();
		
		System.out.println("Enter employee type: Faculty or Staff");
		String EmpType;
		EmpType = input.next();
		
		
		
		if(EmpType.equalsIgnoreCase("Faculty")) {
			
			System.out.println("Enter Department name:");
			String D = input.next(); 
			       D+= input.nextLine();
			return new Faculty(Fn, Ln, Sal, D);
			
		}
		else
		{
			
			System.out.println("Enter job title");
			String Job = input.next();
			return new Staff(Fn, Ln, Sal, Job);
					
  }
}	
	
	//adding main class and employees 
		public static void main(String[] args) {
			
			UEmployee emp1, emp2, emp3;
		
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			
			System.out.println("University Employees:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
		
  }	
}
