import java.util.Scanner;

public class YoungProgram12 {
	public static void printArray(int[][] vals) {
		int rows = vals.length;
		int cols = vals[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(vals[i][j] + " ");
			}
			System.out.println("");
		}
		return;
	}
	
	public static boolean validInput(int[][] square) {
		boolean hasRightValues = true;
		int n = square.length;
		int[] tally = new int[n * n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (square[i][j] >= 1 && square[i][j] <= n * n) {
					tally[square[i][j]] =+ 1;
				}
			}
		}
		
		for (int i = 1; i < (n * n) + 1; i++) {
			System.out.println("TALLY " + i + " " + tally[i]);
			if (tally[i] != 1) {
				hasRightValues = false;
			}
		}
		
		return hasRightValues;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int squareSize;
		System.out.print("Number of rows/columns: ");
		squareSize = scnr.nextInt();
		int[][] values = new int[squareSize][squareSize];
		for (int i = 0; i < squareSize; i++) {
			System.out.print("Enter values in row " + i + " separated by spaces: ");
			for (int j = 0; j < squareSize; j++) {
				values[i][j] = scnr.nextInt();
			}
		}
		scnr.close();
		if (validInput(values) == true) {
			System.out.println("");
			System.out.println("Original Array: ");
			System.out.println("");
			printArray(values);
			System.out.println("");
			System.out.println("Valid user input: 0");
		} else {
			System.out.println("");
			System.out.println("Original Array: ");
			System.out.println("");
			printArray(values);
			System.out.println("");
			System.out.println("Valid user input: 1");
		}

	}
}
