package myFile;

import java.io.File;
import java.util.Scanner;

public class myFile {

	public static void main(String[] args) {
		String path;
		Scanner input = new Scanner(System.in);
		path = input.next();
		
		File textFile = new File(path);

		
		if (textFile.exists()) {
			System.out.println("The file exists");
		} else { 
			System.out.println("The file does not exist");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
