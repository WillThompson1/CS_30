


package myFile;

import java.io.*;
import java.util.Scanner;

public class myFile2 {

	public static void main(String[] args) {
	
	File textFile = new File("C:\\users\\904342004\\supplies\\zzz.txt");
	try {
	textFile.createNewFile();
	System.out.println("new file created");
		} catch (IOException e) {
	System.out.println("error creating file");
	System.err.println("IOException: " + e.getMessage());
	}
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Would you like to keep or delete the file?");
	String i = input.next();
	
	if (i.equalsIgnoreCase("keep")) {	
		
	} else if (i.equalsIgnoreCase("delete")) {
		
		if (textFile.delete()) {
		System.out.println("Deleted the file: " + textFile.getName());
		} else {
		System.out.println("Was unable to delete the file: " + textFile.getName());	
		}
		
	}
	
	
	
	}
}
