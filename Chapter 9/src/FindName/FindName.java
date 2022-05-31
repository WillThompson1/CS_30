package FindName;

import java.util.Scanner;

public class FindName {

	public static void main(String[] args) {
	 
	int y;	
		
	String SName;	//string to store the Students names that are being entered
	int amt;		//int to store the amount of students that need to fit in the array
	String search;	//string used to store the users search 
	int location; 	//integer used to store the index of the word being found
	
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.print("How many students would you like to enter: ");		//prompts the user for the amount of student they would like to store in the array
	amt = input.nextInt();		//stores the users input as the amt variable 
	input.nextLine();
	
	String [] NameArray = new String[amt];	//creates the new array 'NameArray' which has the same amount of elements as the amount of students to be entered 
		
	
	
	for (y=0; y<NameArray.length; y++){	    //integer y starts at zero and increases until it has reaches the length of the array, which determines how many times the program is ran
	
		System.out.print("enter students name: ");	//prompts the user for a students name to be added to the array 
        SName = input.nextLine();	//stores the users input in the SName string 
       
        NameArray[y]= SName; //adds the SName string to the array at the index of the counter 
   }
	
	
	
    System.out.print("what name would you like to find?: ");	//prompts the user to enter the string they would like to find
    search = input.nextLine();		//stores the users input in the 'search' string 
    
    
   
    location = Search.Linear(NameArray, search);	//uses the search class to find the search term in the NameArray
    
    
    
    
    if (location == -1) {	  //if the index equals -1 it is out of bounds and doesn't exist
   	 
    System.out.println("\nName not found in array.");
    } 
    
    else {		//if the index is in bounds
    
    System.out.println("\nFirst occurrence has an index of " + location);	//tells the user the index of the array
    }



}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

