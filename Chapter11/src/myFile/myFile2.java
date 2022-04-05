


package myFile;

import java.io.*;

public class myFile2 {

	public static void main(String[] args) {
	
	File textFile = new File("C:\\users\\904342004\\supplies");
	
	textFile.createNewFile();
	System.out.println("new file created");
	} catch (IOException e) {
		System.out.println("error creating file");
		System.err.println("IOException: " + e.getMessage());
	
	
	
	
	
	}
}
