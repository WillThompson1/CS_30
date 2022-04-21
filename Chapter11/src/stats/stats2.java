package stats;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;


public class stats2 {
	
	public static void main(String[] args) {
	
	

	String Fname; //String for the user to enter a file name
	String Sname; //String for the names of the students 
	int amt; //amount of students that are going to be entered 
	int Counter; //amount of lines the file will read and print (same as amount of students)
	int grade; //integer for the students grade
	String gradeLine; //string for the line to be converted into a double
	
	
	//creating file 
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	
	System.out.println("What would you like to name the new file?");	
	Fname = input.next();	
	
	System.out.println("How many students will be entered?");	
	amt = input.nextInt();
	Counter = amt;
	
	
		
		//File dataFile = new File("C:\\users\\904342004\\supplies\\" + Fname + ".dat");
		File dataFile = new File("C:\\users\\Will\\supplies\\" + Fname + ".dat");
		FileWriter out;
		BufferedWriter writefile;
		PrintWriter pw;
		
	try {
		//writing to file	
		
		dataFile.createNewFile();
		System.out.println("new file created");
		
	
		
		out = new FileWriter(dataFile);
		writefile = new BufferedWriter(out);
		pw = new PrintWriter(writefile);
		
		int[] array = new int[amt];
		int line = 0;
		Sname = "";
		
		int i = 0; //loop counter 
		
	
		while (i < Counter*2) { //goes while the counter is less that double the amount of students
							//double because name and grade must be entered 
			
		
			if (i%2 == 0) {
			
			System.out.println("Enter name of student:");	
			Sname = input.next();
			Sname+=input.nextLine();	
			
			pw.println(Sname); //writes the name to the file
			pw.flush(); //flushes the input stream 		
			}
			
		
		if (i%2 != 0) {
			
			System.out.println("Enter " + Sname + "'s grade");	
			gradeLine = input.nextLine();
			array [line] = (int)Double.parseDouble(gradeLine);
			
			pw.println(gradeLine);
			pw.flush();
			line = line + 1;
			}					
		i = i + 1;	
		}
		
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());
			
		
	    } catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
	    }
		
	
	//reading and printing 
	
	
	
	
	double avgGrade;
	double addedGrades = 0;
	int total = 0;
	Counter = amt;
	String userFile;
	
	try {
		
		FileReader in;
		in = new FileReader(dataFile);
		BufferedReader readfile;
		readfile = new BufferedReader(in);
		
	
		in = new FileReader(dataFile);
		
		 while ((gradeLine = readfile.readLine()) != null ) { 
			 
				
			 if(Counter % 2 ==0 ) { //if count is even
			 
				 addedGrades += Double.parseDouble(gradeLine); //adding to the total score if the line is a score line
		 
		 
		
		 
				 System.out.println(gradeLine);
				// numScore += 1;
				 
			 }
		 
			 else {
				System.out.print(gradeLine + " got a: "); 
			 }
			// count += 1;
		 
		 	}
		
		
		avgGrade = total / amt;
		System.out.println("Average = " + avgGrade);
		
		readfile.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("Encountered a problem locating the file");
		System.err.println("FileNotFoundException: " + e.getMessage());
		
		
	} catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());	
	
	
	
	}
	} 
}
	

	
	


