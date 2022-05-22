package LocalBank;

import java.util.Scanner;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName;
	private String streetName;
	private String cityName;
	private String province;
	public String postalCode;
	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String street, String city, String prov, String postal) 
	{
		firstName = fName;
		lastName = lName;
		streetName = street;
		cityName = city;
	    province = prov;
	    postalCode = postal;
  
	}
	

	//changeCity method that asks the user their city and records city in a variable above
	public void changeCity(String newCity) {
		Scanner change = new Scanner(System.in);
		System.out.println("What would you like to change the city to?");
		newCity = change.next(); //stores the users input as the new city
		cityName = newCity;  //sets the current city equal to the new one, completing the change
	}
	
	
	//changeStreet method that asks the user their street and records street in a variable above
	public void changeStreet(String newStreet) {
		Scanner change = new Scanner(System.in);
		System.out.println("What would you like to change the street to?");
		newStreet = change.next(); //stores the users input as the new street 
		streetName = newStreet;  //sets the street code equal to the new one, completing the change
	}
	
	
	//changeProvince method that asks the user their province and records province in a variable above
	public void changeProvince(String newProvince) {
		Scanner change = new Scanner(System.in);
		System.out.println("What would you like to change the province to?");
		newProvince = change.next(); //stores the users input as the new province 
		province = newProvince;  //sets the current province equal to the new one, completing the change
	}
	
	
	//changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changePostalCode(String newPostal) {
		Scanner change = new Scanner(System.in);
		System.out.println("What would you like to change the postal code to?");
		newPostal = change.next();	//stores the users input as the new postal code 
		postalCode = newPostal;  //sets the current postal code equal to the new one, completing the change
	}

	


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;
		
		
		//prints all of the information when the customer string is called 
		custString = firstName + " " + lastName + "\n"
					+ streetName + " " + cityName + " " +  province + " " +  postalCode + "\n";
	
	 	return(custString);	 
	}

}
