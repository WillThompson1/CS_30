package roster;

import java.io.BufferedReader;
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

	

	public roster(String fName, String lName) {
		super(fName, lName);
		
		
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = -7318954331603358997L;



	
	public static void writer (String fName,String lName, String fileName) {
	
		
		
		FileWriter out;
		BufferedWriter writer;
		PrintWriter pw;
		
		
		int amt;
		int counter;
		
		Scanner input = new Scanner(System.in);
		
		File RosterFile = new File("..\\Chapter11\\src\\roster\\" + fileName + ".dat");	
		
	try {
		
	  	System.out.println("how many students will be entered?");
		amt = input.nextInt();
		
		out = new FileWriter(RosterFile);
		writer = new BufferedWriter(out);
		pw = new PrintWriter(writer);
		
		counter = 0;
		
		while (amt > 0) { //while the amount of student are greater than zero it will prompt with questions, each time it gets a first name and last name
						  //it subtracts one from the amount, which can be seen as the amount of students left to be entered
			
		if (counter % 2 == 0) { //if the counter is even it will ask for first name,
								//after printing first name it will add one to the counter making the number odd
			
			System.out.println("Enter students first name:");
			fName = input.next();
			
			pw.println(fName); // writes the name to the file
			pw.flush(); // flushes the input stream
			
			counter = counter + 1; 
		}
			
		if (!(counter % 2 == 0)) { //now the counter is not even and it will ask the last name 
								   //after printing the last name it will add one to the counter and make the number even again
								   //this way it alters back and fourth until all the students are entered 
			
			System.out.println("Enter students last name:");
			lName = input.next();
			
			pw.println(lName); // writes the name to the file
			pw.flush(); // flushes the input stream
			
			counter = counter + 1; 
		}
		amt = amt - 1;
		
		}
		input.close();
		
		}  catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	
	
	
	
	
	
	public static void reader(String fileName) {
		
		
		String firstName = "";
		String lastName = "";
		
		File RosterFile = new File("..\\Chapter11\\src\\roster\\" + fileName + ".dat");	
		
		try {
			
		FileReader in = new FileReader(RosterFile);
		in = new FileReader(RosterFile);
		BufferedReader readfile = new BufferedReader(in);

		String fileLine;
		int Counter = 1;
		while ((fileLine = readfile.readLine()) != null) { 
			if (!(Counter % 2 == 0)) { 

				firstName = fileLine;
				
			} 
			
			if (Counter % 2 == 0) { 
			
				lastName = fileLine;
				
			}
			
			if (Counter % 2 == 0) { 
				
				student names = new student(firstName, lastName);
				System.out.println(names);
				
			}
			
		
			
			Counter += 1;
			
			
		
		}

		
		
		
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}	
		
	}

	public static void main(String[] args) {
		String fileName;
		Scanner input = new Scanner(System.in);
		System.out.println("Which file would you like to write to?");
		fileName = input.nextLine();
		
		writer(firstName, lastName, fileName);
		
		System.out.println("\n");
		System.out.println("\bnames of students");
		System.out.println("\n");
		
		reader(fileName);
		
	}
	
	
	
}
