
//Customer Class for exercise 2 
//Will Thompson

package exercise2;

public class Customer {
	private String firstName, lastName, street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String Fn, String Ln, String str, String c, String s, String z) {
		firstName = Fn;
		lastName = Ln;
		street = str;
		city = c;
		state = s;
		zip = z;
	}
	

	/**
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}
}
