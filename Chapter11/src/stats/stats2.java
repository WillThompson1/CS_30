package stats;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;
import java.text.NumberFormat;
import java.text.ParseException;

public class stats2 {
	
	public static void main(String[] args) {
	
	

	String Fname; 
	String Sname;
	int amt;
	int Counter;
	int grade;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What would you like to name the new file?");	
	Fname = input.next();	
	
	System.out.println("How many students will be entered?");	
	amt = input.nextInt();
	Counter = amt;
	
	//File dataFile = new File("C:\\supplies\\" + Fname + ".dat");
	File dataFile = new File("C:\\users\\904342004\\supplies\\" + Fname + ".dat");
	FileWriter out;
	BufferedWriter writefile;
	
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
		
		//FileOutputStream out = new FileOutputStream(dataFile);
		//ObjectOutputStream writeFile = new ObjectOutputStream(out);
	
		out = new FileWriter(dataFile);
		writefile = new BufferedWriter(out);
		
		writefile.write(Sname + " " + grade);
		
		
		
		
		
		Counter = Counter - 1;
		writefile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Encountered a problem locating the file");
			System.err.println("FileNotFoundException: " + e.getMessage());
			
		
	    } catch (IOException e) {
			System.out.println("Encountered a problem writing to file");
			System.err.println("IOException: " + e.getMessage());
	    }
		
	}
	
	 while (Counter > 0);
	
	FileReader in;
	
	
	
	int avgGrade;
	int addedGrades = 0;
	int newGrade = 0;
	int total = 0;
	Counter = amt;
	//numScores = amt
	
	try {
		in = new FileReader(dataFile);
		
	
		FileInputStream fstream = new FileInputStream("C:\\users\\904342004\\supplies\\" + Fname + ".dat");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String line;
		
		while ((line = br.readLine()) != null)   {
			  // Print the content on the console
			  System.out.println (line);
			}
	
			

			System.out.println(line);
			newGrade = Integer.parseInt(line.replaceAll("[\\D]", ""));
			total = addedGrades + newGrade;
			addedGrades = total;
			System.out.println(line);
		
		
	
		
		avgGrade = total / amt;
		System.out.println("Average = " + avgGrade);
		
		in.close();
	} catch (FileNotFoundException e) {
		System.out.println("Encountered a problem locating the file");
		System.err.println("FileNotFoundExeption: " + e.getMessage());
	} catch (IOException f) { 
		System.out.println("Encountered a problem reading the file");
		System.err.println("IOExeption:" + f.getMessage());
	
	
	}
	} 
	}

	
	


