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
	
	
	
	System.out.print("How many students would you like to enter");	
	amt = input.nextInt();	
	
	
	String [] NameArray = new String[amt];	
		
	
	
	for (y=0; y<NameArray.length; y++){
	
		System.out.print("enter students name");
        SName = input.nextLine();
       
        NameArray[y]= SName;
   }
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

