
//Personal Account Class for exercise 2
//Will Thompson


package exercise2;

public class BusinessAcct extends Account{

	public BusinessAcct(double bal, String fName, String lName, String str, String c, String s, String z) {
	      super(bal, fName, lName, str, c, s, z);
	}
	
	/* withdrawing from a business account will apply the rules for a business account
	 * if the balance falls under 500 dollars an addition 10 dollars is charged through the fee method
	 */
	public void withdrawal(double amt) {

		super.withdrawal(amt);

		if (super.getBalance() < 500) {
			super.fee(10);

			System.out.println("\nA business account requires a minimum balance of $500, a $10 fee has been charged for not meeting the requirements,");
				}
	}
		
	
	
 }
