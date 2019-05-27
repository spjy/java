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
			if (tally[i] != 1) {
				hasRightValues = false;
			}
		}
		return hasRightValues;
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
			for(int i = 0; i < size; i++){
			    sum += vals[i][size-1 - i];
			}
		}
		return sum;
	}
	
	public static boolean isMagicSquare(int[][] square) {
		int n = square.length;
		boolean flag = true;
		int rowSum = 0;

		for (int i = 0; i < n; i++) {
			rowSum = square[i][n-1];
		}
		
		System.out.println(rowSum);

		return flag;
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
			System.out.println("Original Array: ");
			printArray(values);
			System.out.println("Valid user input: 0");
			for (int i = 0; i < squareSize; i++) {
				System.out.println("Row sum " + i + " is: " + rowSum(values, i));
			}
			for (int i = 0; i < squareSize; i++) {
				System.out.println("Column sum " + i + " is: " + colSum(values, i));
			}
			for (int i = 0; i < 2; i++) {
				System.out.println("Diagonal sum " + i + " is: " + diagSum(values, i));
			}
		} else {
			System.out.println("Original Array: ");
			printArray(values);
			System.out.println("Valid user input: 1");
			for (int i = 0; i < squareSize; i++) {
				System.out.println("Row sum " + i + " is: " + rowSum(values, i));
			}
			for (int i = 0; i < squareSize; i++) {
				System.out.println("Column sum " + i + " is: " + colSum(values, i));
			}
			for (int i = 0; i < 2; i++) {
				System.out.println("Diagonal sum " + i + " is: " + diagSum(values, i));
			}
		}

	}
}
