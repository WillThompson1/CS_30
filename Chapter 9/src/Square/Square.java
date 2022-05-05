package Square;

public class Square {

	public static void main(String[] args) {
	
	int index = 0;
	int length = 5;
	
	int[] Squares = {0, 1, 2, 3, 4};

	for (index = 0; index < length; index++) {
		Squares[index] = ((int) Squares[index] * Squares[index]);
	}
		System.out.println("Squares");
	
		for (int element: Squares) {
		System.out.println(element);
	}
	
	
	
	}
}