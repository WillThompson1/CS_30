package stats;

import java.io.*;
import java.util.Scanner;

public class stats2 {
	
	public static void main(String[] args) {
	
	String name; 
	int amt;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What would you like to name the new file?");	
	name = input.next();	
	
	System.out.println("How many students will be entered?");	
	amt = input.nextInt();
	
	File textFile = new File("C:\\users\\904342004\\supplies\\" + name);
	try {
		textFile.createNewFile();
		System.out.println("new file created");
		
	} catch (IOException e) {
		System.out.println("error creating file");
		System.err.println("IOException: " + e.getMessage());
		}
		
	do {
		
		
		
		
		amt = amt - 1;
		
	} while (amt > 0);
	
	
	}
		
		
		
		
		
		
		
		
	}
	
}
