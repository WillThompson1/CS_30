
//AcctClient Class for Exercise 2
//Will Thompson

package exercise2;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AcctClient {

	//creates a private assign method that will be used to gather information for the customer
	private static Customer assign() {

		//constructs a new scanner to allow the user to type information
		Scanner input = new Scanner(System.in);

		
		/* These questions gather the basic information that is needed for the customer class  
		 * Like the users firstname, lastname, province, city, street and zipcode
		 * the street and zipcode variables (str and z) are set up to input multiple words
		 */
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
			   str +=input.nextLine();
		System.out.println("Enter zip code");
		String z = input.next();
			   z +=input.nextLine();
		
		
		System.out.print("\nYour Information:");

		/*	returns information from the customer class that the user inputted before setting up the account
		  	this prints it in the format established in the customer class */
		Customer user = new Customer(Fn, Ln, str, c, s, z);
		System.out.print(user);

		//generates a random balance for the users account betweeen the parameters (700 and 2700) 
		double bal = ThreadLocalRandom.current().nextDouble(700, 2700);
				
		
		System.out.println("\nIs this a personal or a business account?");
		String accType = input.next();
		//accType string is user to store the response to what type of account the user is making
		
		
		//if statement comparring the acctype string to the words personal or business ignoring case considerations
		if (accType.equalsIgnoreCase("Personal")) {

			/* sets an integer to be used in a do-while loop to repeat prompting the user for actions 
			until this integer is changed */
			int repeat = 1;

			//creates a new personal account which applies the rules for a personal account
			PersonalAcct acct = new PersonalAcct((double) bal, Fn, Ln, str, c, s, z);

			//do-while statement that will continue prompting the user for actions to be performed until they choose to exit
			do {

				/* Prompt asking the user what action they would like to perform with their account 
				 * Followed by an input allowing the user to respond 
				 * Then by if-statements that consider the input and prompt further questions
				 */			
				System.out.println("\nWhat action would you like to perform:");
				System.out.println("Deposit, Withdraw, View Balance, View Account or Exit");
				String action = input.next();
					   action +=input.nextLine();

					   
					if (action.equalsIgnoreCase("Deposit")) {
						/* The user enters how much they would like to deposit
						 * The next double entered by the user is used for the deposit method in the account class
						 */		
						System.out.println("How much would you like to deposit?");
						double amt = input.nextDouble();
						acct.deposit(amt);
						//prints the balance after deposit by using getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
						
					}

					if (action.equalsIgnoreCase("Withdraw")) {
						
						/* The user enters how much they would like to withdraw
						 * The double entered is used for the withdraw methof in the account class
						 */										
						System.out.println("How much would you like to withdraw?");
						double amt = input.nextDouble();
						acct.withdrawal(amt);
						//prints the balance after withdrawing by usng getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
						
					}

					if (action.equalsIgnoreCase("View Balance")) {
						System.out.println("Here is your current balance:");
						
						//prints the balance by usng getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println(money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Account")) {
						System.out.println("Here is your account:");
						//prints the account class in the designated format
						System.out.println(acct);
					}
					
					if (action.equalsIgnoreCase("Exit")) {
						System.out.println("Have a great day!");
						//changes the repeat integer to a 0 which ends the loop and closes the program
						repeat = 0;
						}

					
			} while (repeat == 1);

			
			
		} if (accType.equalsIgnoreCase("Business")) {

			/* sets an integer to be used in a do-while loop to repeat prompting the user for actions 
			until this integer is changed */
			int repeat = 1;

			//creates a new business account which applies the rules for a business account from the business class
			BusinessAcct acct = new BusinessAcct((double) bal, Fn, Ln, str, c, s, z);

			do {

				/* Prompt asking the user what action they would like to perform with their account 
				 * Followed by an input allowing the user to respond 
				 * Then by if-statements that consider the input and prompt further questions
				 */		
				System.out.println("\nWhat action would you like to perform:");
				System.out.println("Deposit, Withdraw, View Balance, View Account or Exit");
				String action = input.next();
				action += input.nextLine();

					if (action.equalsIgnoreCase("Deposit")) {
						
						/* The user enters how much they would like to deposit
						 * The next double entered by the user is used for the deposit method in the account class
						 */	
						System.out.println("How much would you like to deposit?");
						double amt = input.nextDouble();
						acct.deposit(amt);
						
						//prints the balance after deposit by using getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					
					if (action.equalsIgnoreCase("Withdraw")) {
						
						/* The user enters how much they would like to withdraw
						 * The double entered is used for the withdraw methof in the account class
						 */		
						System.out.println("How much would you like to withdraw?");
						double amt = input.nextDouble();
						acct.withdrawal(amt);
						
						//prints the balance after the withdraw by using getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println("\nNew balance is: " + money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Balance")) {
						System.out.println("Here is your current balance:");
						
						//prints the balance by usng getBalance in money format
						NumberFormat money = NumberFormat.getCurrencyInstance();
						System.out.println(money.format(acct.getBalance()));
					}

					if (action.equalsIgnoreCase("View Account")) {
						System.out.println("Here is your account:");
						//prints the account class in the designated format
						System.out.println(acct);
					}
					
					if (action.equalsIgnoreCase("Exit")) {
						System.out.println("Have a great day!");
						//changes the repeat integer to a 0 which ends the loop and closes the program
						repeat = 0;
						}


			} while (repeat == 1);

		}
		//after the user chooses exit the input is closed and the program is terminated
		input.close();
		return null;

	}

	public static void main(String[] args) {

		//runs the assign class
		assign();
	

	}

}
