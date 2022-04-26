package roster;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class roster {

	public static void main(String[] args) {
		
		int amt;
		String fileName;
		int counter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like to name the file for the student names?");
		fileName = input.nextLine();
		
		File RosterFile = new File("../CS30/Chapter11/src/stats/" + fileName + ".dat");
		
		
	try {
		
		FileOutputStream out = new FileOutputStream(RosterFile);
	  	ObjectOutputStream writeStu = new ObjectOutputStream(out);
		
	  	System.out.println("how many students will entered?");
		amt = input.nextInt();
		
		counter = 0;
		
		
		
		
		
		
	
		
		
		
		
		
	
		
		}	
	
	}
}
