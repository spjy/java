import java.util.Scanner;

/**
 *
 * @author Spencer
 *
 */
public class YoungProgram11 {
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

	public static int rowSum(int[][] vals, int rowNum) {
		int cols = vals[0].length;
		int sum = 0;

		for (int j = 0; j < cols; j++) {
			sum = sum + vals[rowNum][j];
		}
		return sum;
	}

	public static int colSum(int[][] vals, int colNum) {
		int rows = vals.length;
		int sum = 0;

		for (int j = 0; j < rows; j++) {
			sum = sum + vals[j][colNum];
		}
		return sum;
	}

	public static int diagSum(int[][] vals, int diagNum) {
		int size = vals.length;
		int sum = 0;
		if (diagNum == 0) {
			for (int i = 0; i < size; i++) {
				sum = sum + vals[i][i];
			}
		} else {
			for (int i = 0; i < size; i++){
			    sum = sum + vals[i][size - 1 - i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numRows, numCols;
		System.out.print("Number of rows: ");
		numRows = scnr.nextInt();
		System.out.print("Number of columns: ");
		numCols = scnr.nextInt();

		int[][] values = new int[numRows][numCols];
		for (int i = 0; i < numRows; i++) {
			System.out.print("Enter values in row " + i + " separated by spaces: ");
			for (int j = 0; j < numCols; j++) {
				values[i][j] = scnr.nextInt();
			}
		}
		System.out.println("Here's the array.");
		printArray(values);

		for (int i = 0; i < numRows; i++) {
			System.out.println("Row sum " + i + " is: " + rowSum(values, i));
		}
		for (int i = 0; i < numCols; i++) {
			System.out.println("Column sum " + i + " is: " + colSum(values, i));
		}
		if (numRows == numCols) {
			System.out.println("Matrix is a square.");
			for (int i = 0; i < 2; i++) {
				System.out.println("Diagonal sum " + i + " is: " + diagSum(values, i));
			}
		} else {
			System.out.print("Matrix is not a square.");

		}
	}
}
