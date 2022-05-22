package FindName;

import java.util.Scanner;

public class FindName {

	public static void main(String[] args) {
		
	int y = 0;
	
	String SName;
	int amt;	
	String search;
	int location; 
	
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("How many students would you like to enter");	//prompts the user for the amount of students the array needs to hold
	amt = input.nextInt();	
	
	
	String [] NameArray = new String[amt];	//creates an array with the user entered amount of strings 
		
	
	
	for (y=0; y<NameArray.length; y++){	//while y is less than the length of the array (y increases each time this is ran)
	
		System.out.print("enter students name");
        SName = input.nextLine();	//the program will assign the user entered name to the Sname variable then add it to the array
        							//the index of the array at the point the string is entered is the y value 
        NameArray[y]= SName;
   }
	
	
	
	//searches the array for the name 
	
    System.out.print("what name would you like to find?: ");
    search = input.nextLine();
    
    location = Search.Linear(NameArray, search);
    
    
    
    
    if (location == -1) {
   	 
    System.out.println("\nSorry, name not found in array.");
    } 
    
    else {
    
    System.out.println("\nFirst occurrence is element " + location);
    }



}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

