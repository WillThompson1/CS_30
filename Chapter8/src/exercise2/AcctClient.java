
//AcctClient Class for Exercise 2
//Will Thompson

package exercise2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AcctClient {

	
	
	public static Customer assign() {

		
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
		z += input.nextLine();

		
		
		System.out.print("\nYour Information:");

		Customer user = new Customer(Fn, Ln, str, c, s, z);
		System.out.print(user);

		double bal = ThreadLocalRandom.current().nextDouble(700, 2700);
				
		
		System.out.println("\nIs this a personal or a business account?");
		String accType = input.next();

		
		
		
		if (accType.equalsIgnoreCase("Personal")) {

			int repeat = 1;

			PersonalAcct acct = new PersonalAcct((double) bal, Fn, Ln, str, c, s, z);

			do {

				System.out.println("\nWhat action would you like to perform:");
				System.out.println("Deposit, Withdraw, View Balance, View Account or Exit");
				String action = input.next();
				action += input.nextLine();

					if (action.equalsIgnoreCase("Deposit")) {
						System.out.println("How much would you like to deposit?");
						double amt = input.nextDouble();
						acct.deposit(amt);
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("Withdraw")) {
						System.out.println("How much would you like to withdraw?");
						double amt = input.nextDouble();
						acct.withdrawal(amt);
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Balance")) {
						System.out.println("Here is your current balance:");
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println(money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Account")) {
						System.out.println("Here is your account:");
						System.out.println(acct);
					}
					
					if (action.equalsIgnoreCase("Exit")) {
						System.out.println("Have a great day!");
						repeat = 0;
						}

					
			} while (repeat == 1);

			
			
		} if (accType.equalsIgnoreCase("Business")) {

			int repeat = 1;

			BusinessAcct acct = new BusinessAcct((double) bal, Fn, Ln, str, c, s, z);

			do {

				System.out.println("\nWhat action would you like to perform:");
				System.out.println("Deposit, Withdraw, View Balance, View Account or Exit");
				String action = input.next();
				action += input.nextLine();

					if (action.equalsIgnoreCase("Deposit")) {
						System.out.println("How much would you like to deposit?");
						double amt = input.nextDouble();
						acct.deposit(amt);
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("Withdraw")) {
						System.out.println("How much would you like to withdraw?");
						double amt = input.nextDouble();
						acct.withdrawal(amt);
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Balance")) {
						System.out.println("Here is your current balance:");
						
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println(money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Account")) {
						System.out.println("Here is your account:");
						System.out.println(acct);
					}
					
					if (action.equalsIgnoreCase("Exit")) {
						System.out.println("Have a great day!");
						repeat = 0;
						}


			} while (repeat == 1);

		}
		
		input.close();
		return null;

	}

	public static void main(String[] args) {

		
		@SuppressWarnings("unused")
		Customer cust;
		cust = assign();
	


	}

}
