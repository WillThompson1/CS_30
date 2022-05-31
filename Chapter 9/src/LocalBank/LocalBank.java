package LocalBank;

/*
 * LocalBank.java from Chapter 9
 * Chapter 9 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 /**
  * A bank where accounts can be opened or closed and customers can
  * make transactions.
  */

 import java.util.Scanner;

 public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action;
		String acctID= "";
		
		Double amt;

		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account\\Modify an account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();
			/* prompts the user for the action they would like to perform
			 * the user chooses by entering the first letter of the option*/

			if (action.equalsIgnoreCase("A")) //if the user would like to add an account it runs the addAccount method
			{
				easySave.addAccount();
			}
			else if (!action.equalsIgnoreCase("Q")) //if the action is not 'Q' for quit, then the program will first ask for account id
			{
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {	//if the user would like to deposit it will prompt the user for the amount to deposit 
												    //then run the transaction method, (the first integer shows whether the transaction is a deposit '1' or a withdrawal '2'
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
					
				} else if (action.equalsIgnoreCase("M")) { //if the user would like to modify the account it will run the modifyAccount method 
					easySave.modifyAccount(acctID);
					
				} else if (action.equalsIgnoreCase("W")) {	//if the user would like to withdraw it will prompt the user for an amount then run the withdrawal transaction method
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);	//the first integer is a 2 meaning this is a withdrawal transaction
				} else if (action.equalsIgnoreCase("C")) {	//action C checks the balance of the account under the account id
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {	//action R deletes the account under the account id
					easySave.deleteAccount(acctID);
				}

				
			}
		} while (!action.equalsIgnoreCase("Q")); //this is all done while the action is not 'Q' which means once the user chooses Q the program terminates
		
	}
}