package roster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class roster extends student {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7318954331603358997L;


	public roster (String fName,String lName) {
		super (fName, lName);
		
		FileWriter out;
		BufferedWriter writer;
		PrintWriter pw;
		
		int amt;
		String fileName;
		int counter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like to name the file for the student names?");
		fileName = input.nextLine();
		
		File RosterFile = new File("../CS30/Chapter11/src/stats/" + fileName + ".dat");
		
	
	
		
	try {
	  		
	  	System.out.println("how many students will entered?");
		amt = input.nextInt();
		
		out = new FileWriter(RosterFile);
		writer = new BufferedWriter(out);
		pw = new PrintWriter(writer);
		
		counter = 0;
		
		while (amt > 0) {
			
		if (counter / 2 == 0) {
			
			System.out.println("Enter students first name:");
			fName = input.next();
			
			pw.println(fName); // writes the name to the file
			pw.flush(); // flushes the input stream
			
			counter = counter + 1; 
		}
			
		if (!(counter / 2 == 0)) {
			
			System.out.println("Enter students last name:");
			lName = input.next();
			
			pw.println(lName); // writes the name to the file
			pw.flush(); // flushes the input stream
			
			counter = counter + 1; 
			
	
		}		
		}
		
		}  catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	

	public static void main(String[] args) {
	
		roster (String fName,String lName);
		
	}
	
	
	
}
