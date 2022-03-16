
//AcctClient Class for Exercise 2
//Will Thompson



package exercise2;


import java.util.Scanner;

public class AcctClient {

	public static Customer assign() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Will's Account Manager");
		
		System.out.println("Enter your first name: ");
		String Fn = input.next();
		System.out.println("Enter your last name: ");
		String Ln = input.next();
		
		System.out.println("\n Now enter some location details");
		System.out.println("Enter State: ");
		String s = input.next();
		System.out.println("Enter city: ");
		String c = input.next();
		System.out.println("Enter street: ");
		String str = input.next();
		System.out.println("Enter zip code");
		String z = input.next();
		
		return new Customer(Fn, Ln, s, c, str, z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		public static void main(String[] args) {
			
		Customer cust;
		
		cust = assign();
			
		System.out.println(cust);	
		
			
			
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
}


