
//Personal Account Class for exercise 2
//Will Thompson


package exercise2;

public class PersonalAcct extends Account {
	
	public PersonalAcct(double bal, String Fn, String Ln, String str, String c, String s, String z) {		
	      super(bal, Fn, Ln, str, c, s, z);
		
	if (bal < 100) {
		bal = bal - 2;
		
		System.out.println("A personal account requires a minimum balance of $100, a $2 fee has been charged for not meeting the requirements");
		
		
		
	
		
	}
}}

/*
 *
 * Make sure all of the functions will work 
 * 
 * Create a new class for the front end
 * working on asking questions and inputting the answers
 * the answers will decide which classes are run 
 *
 *
*/