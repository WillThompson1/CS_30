
//Personal Account Class for exercise 2
//Will Thompson


package exercise2;

public class BusinessAcct extends Account{

	public BusinessAcct(double bal, String fName, String lName, String str, String c, String s, String z) {
	      super(bal, fName, lName, str, c, s, z);
	
	if (bal < 500) {
		bal = bal - 10;

		System.out.println("A busines account requires a minimum balance of $500, a $10 fee has been charged for not meeting the requirements");
		
	
	
		
		
	}
	
 }
}