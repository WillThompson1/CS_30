package HighestGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);	
	ArrayList<Integer> numbers = new ArrayList<Integer>();	
	int i;
	
	for(i=0; i<5; i++) { 
		
		    System.out.println( "Enter number : " ); 
		    int InputNumber = input.nextInt();
		    numbers.add(InputNumber);
		  } 	
		
		input.close();
		
	for(int o=0; o<4; o++) { 
			
		   Integer element1 = numbers.get(o);	//element one is set as the integer at the 'o' which will increase with the for statement
		   Integer element2 = numbers.get(o+1);	 //element two is set as one higher than the first element to compare element one with the next integer in the list
		   if (element1.compareTo(element2) >0 ) {
		   numbers.set(o, element2);		//switches the positions of the two elements
		   numbers.set(o+1, element1); 
			   
		   }
	} 		
	
	
	
	int highest = numbers.get(4);	
	System.out.println("Highest grade is " + highest);	
		
		
		
	}
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
