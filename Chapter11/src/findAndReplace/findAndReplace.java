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
		
		String fileName;   //string for the user entered file name
		String oldPhrase;  //string for the phrase in the file that will be replaced
		String newPhrase;  //string for the phrase replacing the old phrase
		String phraseLine; //string that stores the words in each line of the file looking for the old phrase
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file you would like to modify ex.'file.txt'");
		fileName = input.nextLine();
		
		File userFile = new File("../Chapter11/src/findAndReplace/" + fileName);	//creates a file path named user file with the name of the file that the user entered
		
		
		
		if (userFile.exists()) {  //if the specified path exists then the program continues 
			System.out.println("File found.");
			
			System.out.println("Enter the word or phrase you would like to replace");
			oldPhrase = input.next();	//prompts the user for the phrase to be replaced 
			
			System.out.println("Enter the word or phrase to replace it");
			newPhrase = input.next();	//prompts the user for the new phrase that will replace it 
			
			
			
			try {
				
				in = new FileReader(userFile);  //creates a new filereader for the user's file 
				readFile = new BufferedReader(in);  //creates a buffering character input stream
				
				File newFile = new File("../Chapter11/src/findAndReplace/" + "new_" + fileName );	//creates a new file with new at the front 		
				
				FileWriter out;		//sets up the program to write to the file
				out = new FileWriter(newFile); 
				BufferedWriter write;
				write = new BufferedWriter(out);
				
				
				while ((phraseLine = readFile.readLine()) != null ) {  //while there is text on the file line 
					
					phraseLine = phraseLine.replaceAll(oldPhrase, newPhrase);  //the line of the file is replaced with the line of the file with the 
					write.write(phraseLine); 								   //old phrase replaced with the new phrase
					write.newLine(); 										   //it then writes the modified phrase line to the file and moves the writer to the next line
					
					
				}	
					
					System.out.println(oldPhrase + " has been replaced to " + newPhrase);	//tells the user the word or phrase that has been replaced 
					
					
					write.close();		//closes all inputs 
					out.close();
					readFile.close();
					in.close();
				
				
			} catch(IOException e) {	//handles IO exceptions
				
			System.out.println("Encountered an error");
			}
			
		} else {	//if the specified path does not exist then the program will tell the user that
			System.out.println("File could not be found or doesn't exist.");
		}
		
	}
	
}
