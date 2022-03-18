
//AcctClient Class for Exercise 2
//Will Thompson

package exercise2;

import java.util.Scanner;

public class AcctClient {


	public static void userinfo() {
		
		
	
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Will's Account Manager");

		System.out.println("Enter your first name: ");
		String Fn = input.next();
		System.out.println("Enter your last name: ");
		String Ln = input.next();

		System.out.println("\nNow enter some location details");
		System.out.println("Enter Province/State: ");
		String s = input.next();
		System.out.println("Enter city: ");
		String c = input.next();
		System.out.println("Enter street: ");
		String str = input.next();
			   str += input.nextLine();
		System.out.println("Enter zip code");
		String z = input.next();

		System.out.print("\nYour account:");

		Customer user = new Customer(Fn, Ln, str, c, s, z);
		System.out.print(user);
		
		input.close();
	}
	

		
	


	public static Customer assign(double bal, String Fn, String Ln, String str, String c, String s, String z) {

		
		AcctClient.userinfo();


		
		bal = (double) 3000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is this a personal account or a buisness account?");
		String accType = input.next();
		
		
		
		
		
		if(accType.equalsIgnoreCase("Personal")) {
			
			PersonalAcct user = new PersonalAcct((double) bal, Fn, Ln, str, c, s, z);
			
			System.out.println("\n What would you like to do:");
			System.out.println("Deposit, Withdraw, View Balance");
			String action = input.next();
			
			if (action.equalsIgnoreCase("Deposit")) 
			{
			System.out.println("How much would you like to deposit?");
			double amt = input.nextDouble();
			user.deposit(amt);
			System.out.println("New balance is: " + user.getBalance());
			
			}
			if(action.equalsIgnoreCase("Withdraw")) {
			System.out.println("How much would you like to withdraw?");
			double amt = input.nextDouble();
			user.withdrawal(amt);
			System.out.println("New balance is: " + user.getBalance());
			}
			
			
			
		}  else if (accType.equalsIgnoreCase("Business")) {
			
			
			
			
			
			
			
		}

		
		System.out.println("\nWhat action would you like to perform?");
		System.out.println("Check Balance, Deposit, Withdraw");

		return null;

	}

	public static void main(String[] args) {

		Customer cust;

		cust = assign();

	}

}
