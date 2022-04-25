package stats;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class stats2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String Fname; // String for the user to enter a file name
		String Sname; // String for the names of the students
		int amt; // amount of students that are going to be entered
		int Counter; // amount of lines the file will read and print (same as amount of students)
		
		String gradeLine; // string for the line to be converted into a double

		
		/* Creating the File and adding the names and grades */
		
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to name the new file?"); //prompts the user for the file name then assigns it to a variable
		Fname = input.next();

		System.out.println("How many students will be entered?"); //prompts the user for the number of students they will enter 
																  //the users input will be used to determine how many sets of questions are asked 
		amt = input.nextInt();
		Counter = amt;

		 File dataFile = new File("C:\\users\\904342004\\supplies\\" + Fname + ".dat");		//file location at school 
		//File dataFile = new File("C:\\users\\Will\\supplies\\" + Fname + ".dat");			//file location at home 
		FileWriter out;
		BufferedWriter writefile;
		PrintWriter pw;

		

		try {
			// writing to file

			dataFile.createNewFile();		//creates a new data file in the location specified previously 
			System.out.println("new file created");		//tells the user that a new file has been created 

			out = new FileWriter(dataFile);
			writefile = new BufferedWriter(out);
			pw = new PrintWriter(writefile);

			int line = 0;
			Sname = "";

			int i = 0; // loop counter

			while (i < Counter * 2) { // goes while the counter is less that double the amount of students
				// double because name and grade must be entered

				if (i % 2 == 0) {

					System.out.println("Enter name of student:");
					Sname = input.next();
					Sname += input.nextLine();

					pw.println(Sname); // writes the name to the file
					pw.flush(); // flushes the input stream
				}

				if (i % 2 != 0) {

					System.out.println("Enter " + Sname + "'s grade");
					gradeLine = input.nextLine();
				

					pw.println(gradeLine);
					pw.flush();
				}
				i = i + 1;
			}
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}

		// reading and printing

		int[] array = new int[amt]; //creates an array that will be used to store the grades read from the file
									//this will let us find the highest and lowest grade inputted by sorting the array
		
		double avgGrade;
		double addedGrades = 0;		//creates an integer for the total added grades of all the students which will be divided by the number of students to get the average
		Counter = 1;
		int line = 0;
		@SuppressWarnings("unused")
	
		String userFile;
	

		try {

			FileReader in;
			in = new FileReader(dataFile);
			BufferedReader readfile;
			readfile = new BufferedReader(in);

			in = new FileReader(dataFile);

			while ((gradeLine = readfile.readLine()) != null) {
				// while((Double.parseDouble(gradeLine)) != null) {

				if (Counter % 2 == 0) { // if count is even 

					addedGrades += Double.parseDouble(gradeLine); // adding to the total score if the line is a score line
					array[line] = (int) Double.parseDouble(gradeLine);											
					line = line + 1;
					System.out.println(gradeLine);
				
				}

	
				else {
					System.out.print(gradeLine + " got a: ");
					
				}
				Counter += 1;
			}

			avgGrade = addedGrades / amt;
			System.out.println("Average = " + avgGrade);

			Arrays.sort(array); // sorts the array of entered scores in ascending numerical order

			System.out.println("Minimum score = " + array[0]); // prints the first score in ascending order (the lowest)

			System.out.println("Maximum score = " + array[array.length - 1]); // print the last score in the ascending
																				// order (the highest)

			readfile.close();
			in.close();

		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());

		}
	}
}
