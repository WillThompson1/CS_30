package LocalBank;

import java.util.Scanner;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName;
	private static String streetName;
	private static String cityName;
	private static String province;
	private static String postalCode;
	//create String variables street, city, province, postal code	

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String street, String city, String prov, String postal) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;
		streetName = street;
		cityName = city;
	    province = prov;
	    postalCode = postal;

		//reflect the changes in the parameter
	    
	}
	

	//create changeCity method that asks the user their city and records city in a variable above
	public static void changeCity() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to change the city to?");
		cityName = input.next();
		input.close();
	}
	
	
	//create changeStreet method that asks the user their street and records street in a variable above
	public static void changeStreet() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to change the street to?");
		streetName = input.next();
		input.close();
	}
	
	
	//create changeProvince method that asks the user their province and records province in a variable above
	public static void changeProvince() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to change the province to?");
		province = input.next();
		input.close();
	}
	
	
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public static void changePostalCode() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to change the postal code to?");
		postalCode = input.next();
		input.close();
	}
	
	


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + "\n" + streetName + " street" + "\n" + cityName + " " + province + " " + postalCode + "\n";
	 	return(custString);
	}

}
