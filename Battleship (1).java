import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * Battleship Game
 *
 * @author Spencer
 *
 */

public class Battleship {

	public static void shipCoordinateChecker(String[][] board, String[] shipCoordinate, int randomNumberRow, int randomNumberCol, int randomOrientation, int randomIncOrDec, String coordinateGuess, int hitCounter) {

	//String shipCoordinate = rowGuess + ", " + colGuess;

    	if (shipCoordinate[0] == coordinateGuess || shipCoordinate[1] == coordinateGuess || shipCoordinate[2] == coordinateGuess || shipCoordinate[3] == coordinateGuess) {
			hitCounter++;
			System.out.println("Hit! " + hitCounter);
			board[randomNumberRow][randomNumberCol] = "H";
	    } else {
			System.out.println("Miss!");
			board[randomNumberRow][randomNumberCol] = "M";
	    }
	}

	public static void initialBoard(String[][] board, String[] alpha, String[] number) {

		int n = board.length;

		for (int i = 0; i < n - 1; i++) {
			board[0][0] = " ";
			board[i + 1][0] = number[i];
			board[0][i + 1] = alpha[i];
		}

	     for (int i = 1; i < n; i++) {
			for (int j = n - 1; j > 0; j--) {
				board[i][j] = "*";
			}
		 }

	}

	public static void printBoard(String[][] board, String[] alpha, String[] number) {

		// game board print
		int n = board.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void battleshipCore(String[][] board, String[] alpha, String[] number) {

		boolean win = false;
		int hitCounter = 0;
    	int guessNum = 1;

		do {
	    	Scanner scnr = new Scanner(System.in);

			printBoard(board, alpha, number);

			System.out.println("Guess " + guessNum +  " of 25");
			guessNum++;

			String rowGuess;
			System.out.print("Row guess (1-10): ");
			rowGuess = scnr.next();

			String colGuess;
			System.out.print("Column guess (A-J): ");
			colGuess = scnr.next();

			switch (colGuess) {
			case "A":
				colGuess = "1";
				break;
			case "B":
				colGuess = "2";
				break;
			case "C":
				colGuess = "3";
				break;
			case "D":
				colGuess = "4";
				break;
			case "E":
				colGuess = "5";
				break;
			case "F":
				colGuess = "6";
				break;
			case "G":
				colGuess = "7";
				break;
			case "H":
				colGuess = "8";
				break;
			case "I":
				colGuess = "9";
				break;
			case "J":
				colGuess = "10";
				break;
		}

		int rowNumericValueGuess = Integer.parseInt(rowGuess);
		int colNumericValueGuess = Integer.parseInt(colGuess);

		String coordinateGuess = rowNumericValueGuess + ", " + colNumericValueGuess;

			if (coordinateGuess.equals("1, 1") || coordinateGuess.equals("1, 2") || coordinateGuess.equals("1, 3") || coordinateGuess.equals("1, 4")) {
				hitCounter++;
				System.out.println("Hit!");
				board[rowNumericValueGuess][colNumericValueGuess] = "H";
			} else {
				System.out.println("Miss!");
				board[rowNumericValueGuess][colNumericValueGuess] = "M";
			}

			if (hitCounter == 4) {
				System.out.println("You've sunk my battleship!");
				System.out.println("Game over!");
				win = true;
			} else if (guessNum == 25) {
				System.out.println("Game over!");
			}

		} while (hitCounter < 4 && guessNum <= 25);
	}

	public static void battleshipCore0(String[][] board, String[] alpha, String[] number) {

		boolean win = false;
		int hitCounter = 0;
    	int guessNum = 1;

	    int randomNumberRow = ThreadLocalRandom.current().nextInt(4, 7);
	    int randomNumberCol = ThreadLocalRandom.current().nextInt(4, 7);
	    int randomOrientation = ThreadLocalRandom.current().nextInt(1, 2);
	    int randomIncOrDec = ThreadLocalRandom.current().nextInt(1, 2);

	    String[] shipCoordinate = new String[4];

	    if (randomOrientation == 1) {
		    for (int i = 0; i < 4; i++) {
			shipCoordinate[i] = randomNumberRow + ", " + randomNumberCol;
				if (randomIncOrDec == 1) {
				randomNumberCol++;
				} else if (randomIncOrDec == 2) {
					randomNumberCol--;
				}
		    }
	    } else if (randomOrientation == 2) {
		    for (int i = 0; i < 4; i++) {
			shipCoordinate[i] = randomNumberRow + ", " + randomNumberCol;
				if (randomIncOrDec == 1) {
				randomNumberCol++;
				} else if (randomIncOrDec == 2) {
					randomNumberCol--;
				}
		    }
	    }

		do {
	    	Scanner scnr = new Scanner(System.in);

			printBoard(board, alpha, number);

			System.out.println("Guess " + guessNum +  " of 25");
			guessNum++;

			String rowGuess;
			System.out.print("Row guess (1-10): ");
			rowGuess = scnr.next();

			String colGuess;
			System.out.print("Column guess (A-J): ");
			colGuess = scnr.next();

			switch (colGuess) {
			case "A":
				colGuess = "1";
				break;
			case "B":
				colGuess = "2";
				break;
			case "C":
				colGuess = "3";
				break;
			case "D":
				colGuess = "4";
				break;
			case "E":
				colGuess = "5";
				break;
			case "F":
				colGuess = "6";
				break;
			case "G":
				colGuess = "7";
				break;
			case "H":
				colGuess = "8";
				break;
			case "I":
				colGuess = "9";
				break;
			case "J":
				colGuess = "10";
				break;
		}

		int rowNumericValueGuess = Integer.parseInt(rowGuess);
		int colNumericValueGuess = Integer.parseInt(colGuess);

		String coordinateGuess = rowNumericValueGuess + ", " + colNumericValueGuess;

		shipCoordinateChecker(board, shipCoordinate, randomNumberRow, randomNumberCol, randomOrientation, randomIncOrDec, coordinateGuess, hitCounter);

			if (hitCounter == 4) {
				System.out.println("You've sunk my battleship!");
				System.out.println("Game over!");
				win = true;
			} else if (guessNum == 25) {
				System.out.println("Game over!");
			}

		} while (hitCounter < 4 && guessNum <= 25);
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// game board assets
	    String[][] gameBoard = new String[11][11]; // row , col
	    String[] alpha = {" A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}; // alphabet values for board
	    String[] number = {" 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10"}; // numeric values for board
	    int boardLength = gameBoard.length;

	    // choose a board mode
	    int mode;
	    System.out.print("Mode: ");
	    mode = scnr.nextInt();
    	System.out.println("");

	    // game core
	    if (mode == 0) { // random battleship placement

			initialBoard(gameBoard, alpha, number);

			battleshipCore0(gameBoard, alpha, number);

	    } else if (mode == 1) { // fixed battleship placement from A1-A4

			initialBoard(gameBoard, alpha, number);

			battleshipCore(gameBoard, alpha, number);

	    } else {
	    	System.out.print("Invalid mode.");
	    }
	}
}
