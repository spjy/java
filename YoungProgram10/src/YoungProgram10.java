import java.util.Scanner;

/**
 * @author Spencer
 */

public class YoungProgram10 {
	
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

	public static int maxVal(int[][] vals) {
		int max = vals[0][0];
		int rows = vals.length;
		int cols = vals[0].length;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (vals[i][j] > max) {
						max = vals[i][j];
					}
				}
			}
		return max;
	}
	
	public static int minVal(int[][] vals) {
		int max = vals[0][0];
		int rows = vals.length;
		int cols = vals[0].length;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (vals[i][j] < max) {
						max = vals[i][j];
					}
				}
			}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Number of rows: ");
		int numRows = scnr.nextInt();
		
		System.out.print("Number of columns: ");
		int numCols = scnr.nextInt();
		
		int[][] values = new int[numRows][numCols];
		
		for (int i = 0; i < numRows; i++) {
			System.out.print("Enter values in row " + i + " separated by spaces: ");
			for (int j = 0; j < numCols; j++) {
				values[i][j] = scnr.nextInt();
			}
		}
		System.out.println("Here's your array.");
		printArray(values);
			
		System.out.println("The maximum value is: " + maxVal(values));
		System.out.println("The minimum value is: " + minVal(values));

	}
}
