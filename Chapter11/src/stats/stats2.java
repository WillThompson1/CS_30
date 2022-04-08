package stats;

import java.io.*;
import java.util.Scanner;

public class stats2 {
	
	public static void main(String[] args) {
	
	
	BufferedWriter writefile;
	String Fname; 
	String Sname;
	int amt;
	int grade;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What would you like to name the new file?");	
	Fname = input.next();	
	
	System.out.println("How many students will be entered?");	
	amt = input.nextInt();
	
	File dataFile = new File("C:\\users\\904342004\\supplies\\" + Fname + ".dat");
	try {
		dataFile.createNewFile();
		System.out.println("new file created");
		
	} catch (IOException e) {
		System.out.println("error creating file");
		System.err.println("IOException: " + e.getMessage());
		}
	
	
	
	do {
		
		try {
		
		
	
		System.out.println("Enter name of student:");	
		Sname = input.next();
		Sname+=input.nextLine();	
		
		
		System.out.println("Enter " + Sname + "'s grade");	
		grade = input.nextInt();
		
		FileOutputStream out = new FileOutputStream(dataFile);
		ObjectOutputStream writeDataFile = new ObjectOutputStream(out);
	
		writeDataFile.writeObject(Sname + grade);
		
		amt = amt - 1;
		
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem finding the file");
			System.err.println("FileNotFoundException: " + e.getMessage());
			
		
	    } catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
	    }
		
	}
	
	 while (amt > 0);
	
	
	
	
	
	
	
	} 
	}

	
	


