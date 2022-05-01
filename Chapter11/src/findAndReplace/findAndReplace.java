package findAndReplace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class findAndReplace {

	public static void main(String[] args) {
		
		FileReader in;
		BufferedReader readFile;
		
		String fileName;
		String oldPhrase;
		String newPhrase;
		String phraseLine;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file you would like to modify ex.'file.txt'");
		fileName = input.nextLine();
		
		File userFile = new File("../Chapter11/src/findAndReplace/" + fileName);
		
		
		
		if (userFile.exists()) {
			System.out.println("File found.");
			
			System.out.println("Enter the word or phrase you would like to replace");
			oldPhrase = input.next();	
			
			System.out.println("Enter the word or phrase to replace it");
			newPhrase = input.next();
			
			
			
			try {
				
				in = new FileReader(userFile);
				readFile = new BufferedReader(in);
				
				File newFile = new File("../Chapter11/src/findAndReplace/" + "new_" + fileName );			
				
				FileWriter out;
				out = new FileWriter(newFile);
				BufferedWriter write;
				write = new BufferedWriter(out);
				
				
				while ((phraseLine = readFile.readLine()) != null ) {
					
					phraseLine = phraseLine.replaceAll(oldPhrase, newPhrase);
					write.write(phraseLine); 
					write.newLine(); 
					
					
				}	
					
					System.out.println(oldPhrase + " has been replaced to " + newPhrase);
					
					
					write.close();
					out.close();
					readFile.close();
					in.close();
				
				
			} catch(IOException e) {
			System.out.println("Encountered an error");
			}
			
			
		} else {
			System.out.println("File could not be found or doesn't exist.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
