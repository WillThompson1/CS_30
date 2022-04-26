package stats;

import java.io.*;
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

			
			Sname = "";

			int i = 0; // loop counter

			while (i < Counter * 2) { // goes while 'i' is less that double the amount of students
									  // double because name and grade must be entered

				if (i % 2 == 0) {    //if i is even 

					System.out.println("Enter name of student:");
					Sname = input.next();
					Sname += input.nextLine();

					pw.println(Sname); // writes the name to the file
					pw.flush(); // flushes the input stream
				}

				if (i % 2 != 0) {   //after adding one i will then be odd

					System.out.println("Enter " + Sname + "'s grade");
					gradeLine = input.nextLine();
				

					pw.println(gradeLine);
					pw.flush();
				}
				i = i + 1; //i keeps increasing by one until it reaches double the amount of students inputted
						   //this way it alternates between even and odd until all the students have been entered 
			}
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
		}

		
		
		/* Reading from the file and printing to the console    */

		int[] array = new int[amt]; //creates an array that will be used to store the grades read from the file
									//this will let us find the highest and lowest grade inputed by sorting the array
		
		double avgGrade;
		double addedGrades = 0;		//creates an integer for the total added grades of all the students which will be divided by the number of students to get the average
		Counter = 1;     //the counter counts what line of the file you are on
		int arrayNumb = 0;
	
	
		
	

		try {

			FileReader in;
			in = new FileReader(dataFile);
			BufferedReader readfile;
			readfile = new BufferedReader(in);

			in = new FileReader(dataFile);

			while ((gradeLine = readfile.readLine()) != null) {
				// while((Double.parseDouble(gradeLine)) != null) {

				if (Counter % 2 == 0) { // if the counter is even it means the line you are on is a score line 

					addedGrades += Double.parseDouble(gradeLine); // if the line is a score line it will take the double from the line and add it to the total score aswell as the array
					array[arrayNumb] = (int) Double.parseDouble(gradeLine);											
					arrayNumb = arrayNumb + 1;       //the size of the array increases by one each time the grade is added 
					System.out.println(gradeLine); //prints the scores beside the names of the students 
				
				}

	
				else { //if the counter is not even it means the line contains the name of the student 
					System.out.print(gradeLine + " got a: "); //the gradeLine is used as a string for the name of the student
					
				}
				Counter += 1;
			}

			avgGrade = addedGrades / amt;  //finds the average grade by dividing the total by the amount of students 
			System.out.println("Average = " + avgGrade); //prints the average grade 

			Arrays.sort(array); // sorts the array of entered scores in ascending numerical order

			System.out.println("Minimum score = " + array[0]); // prints the first score in ascending order (the lowest)

			System.out.println("Maximum score = " + array[array.length - 1]); // print the last score in the ascending
																				// order (the highest)

			readfile.close(); //closing inputs 
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
