package roster;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


//roster application 
//Will Thompson
//CS30




public class roster extends student {

	

	public roster(String fName, String lName) {
		super(fName, lName);
			
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7318954331603358997L;
	

	public static void writer (String fName,String lName, String fileName) {//this method inherent's the fileName from the main method 
																			//as well as the fName and lName private strings from the student class														
	
		//initializing everything needed to print text to the file
		FileWriter out;
		BufferedWriter writer;
		PrintWriter pw;
		
		
		int amt; //integer representing the amount of student that will be entered 
		int counter; //counter will be used to control the if statements 
		
		Scanner input = new Scanner(System.in);
		
		File RosterFile = new File("..\\Chapter11\\src\\roster\\" + fileName + ".dat");	//rosterFile is initialized as the relative path of file the user enters
		
	try {
		
	  	System.out.println("how many students will be entered?");
		amt = input.nextInt();
		
		out = new FileWriter(RosterFile);
		writer = new BufferedWriter(out);
		pw = new PrintWriter(writer);	//setting up the PrintWriter 
		
		counter = 0;
		
		while (amt > 0) { //while the amount of student are greater than zero it will prompt with questions, each time it gets a first name and last name
						  //it subtracts one from the amount, which can be seen as the amount of students left to be entered
			
		if (counter % 2 == 0) { //if the counter is even it will ask for first name,
								//after printing first name it will add one to the counter making the number odd
			
			System.out.println("Enter students first name:");
			fName = input.next();
			
			pw.println(fName); // writes the fist name to the file
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
		amt = amt - 1; //every time a first and last name are entered it will subtract one from the amount of students left to go
		
		}
		input.close();
		
		}  catch (FileNotFoundException e) { //catch statements for errors 
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	
	
	
	
	
	
	public static void reader(String fileName) {//inherent's fileName from main class so the user doesn't have to enter it again 
		
		
		String firstName = ""; //initializing the firstName and lastName strings 
		String lastName = "";
		
		File RosterFile = new File("..\\Chapter11\\src\\roster\\" + fileName + ".dat");	 //rosterFile is initialized as the relative path of file the user enters
		
		try {
			
		FileReader in = new FileReader(RosterFile);
		in = new FileReader(RosterFile); //this never closes 
		BufferedReader readfile = new BufferedReader(in);

		String fileLine;
		int Counter = 1;
		while ((fileLine = readfile.readLine()) != null) { //while there is something on the fileLine
			if (!(Counter % 2 == 0)) {  //if the counter is not even (it starts off odd)

				firstName = fileLine;  //the fileLine will be on a students first name at this position and it will assign this to the firstName string
				
			} 
			
			if (Counter % 2 == 0) { 
			
				lastName = fileLine;  //the fileLine will be on a students last name at this position and it will assign this to the lastName string
									  //after the lastName is stored it will go to the next if statement printing both the first and last name to the console
			}
			
			if (Counter % 2 == 0) { 
				
				student names = new student(firstName, lastName);
				System.out.println(names);  //prints of the student class toString which prints the firstName and lastName with a space in between
				
			}
			
		
			
			Counter += 1;  //after each one is ran it will add one to the counter and change whether the number is odd or even
						   //after it stores the lastName it will then run the printing if statement to print the student class 
			
			
		
		}

		readfile.close();
	
		
		
		} catch (FileNotFoundException e) { //catch statements to catch errors 
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
		fileName = input.nextLine();		//the user inputs the file name in the main class before any methods are called
											//this means the filename will be inherited by the other two methods so the user doesn't have to enter it twice
		
		writer(firstName, lastName, fileName); //runs the writer method writing the names to the file
		
		System.out.println("\n");
		System.out.println("names of students");		//prints a title before listing of the names of the students 
		System.out.println("\n");
		
		reader(fileName);		//reads all of the student names from the file and prints them in the format from the student class
		
	}
	
	
	
}
