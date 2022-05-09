package FindName;

public class Search {

	public static int Linear(String[] array, String nameToFind) {
		
		int i = 0; 
		
		while((array[i].equals(nameToFind) == false) && (i < array.length - 1)) {	//while the string at the specified index is not the name to find, the index will move up one
	
			i = i + 1;	
		}
		
		if ((array[i].equals(nameToFind) == true)) {	//while the string at the specified index is the name to find, the method will return the index
			return(i);
		} else {			//else statement in case the name to find is not present
			return(-1);
		}
	}
	
	
	
}
