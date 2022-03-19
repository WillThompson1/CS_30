
//Personal Account Class for exercise 2
//Will Thompson

package exercise2;

public class PersonalAcct extends Account {

	public PersonalAcct(double bal, String Fn, String Ln, String str, String c, String s, String z) {		
	      super(bal, Fn, Ln, str, c, s, z);
	}
	

	public void withdrawal(double amt) {

		super.withdrawal(amt);

		if (super.getBalance() < 100) {
			super.fee(2);

			System.out.println("/nA personal account requires a minimum balance of $100, a $2 fee has been charged for not meeting the requirements");
				}
	}

	
}
