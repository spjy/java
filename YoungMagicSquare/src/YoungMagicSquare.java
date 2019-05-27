import java.util.Scanner;

public class YoungMagicSquare {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int squareSize;
		System.out.print("Number of rows/columns: ");
		squareSize = scnr.nextInt();
		int[][] values = new int[squareSize][squareSize];
		for (int i = 0; i < squareSize; i++) {
			System.out.print("Enter values in row " + i + "separated by spaces: ");
			for (int j = 0; j < squareSize; j++) {
				values[i][j] = scnr.nextInt();
			}
		}
		scnr.close();
		System.out.println("");
		System.out.println("Original Array ");
		printArray(values);
		System.out.println("");
	}
}
