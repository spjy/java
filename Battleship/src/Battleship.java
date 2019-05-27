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

		int hitCounter = 0;
    	int guessNum = 1;

		do {
	    	Scanner scnr = new Scanner(System.in);

			System.out.println("");
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
				System.out.println("");
				printBoard(board, alpha, number);
			} else if (guessNum > 25) {
				System.out.println("Game over!");
				System.out.println("");
				for (int i = 1; i <= 4; i++) {
					board[1][i] = "B";
				}
				printBoard(board, alpha, number);
			}

		} while (hitCounter < 4 && guessNum <= 25);
	}

	public static void battleshipCore0(String[][] board, String[] alpha, String[] number) {

		int hitCounter = 0;
    	int guessNum = 1;

    	int randomNumberRow;
    	int randomNumberCol;
	    int randomOrientation = ThreadLocalRandom.current().nextInt(1, 2);
	    int randomIncOrDec = ThreadLocalRandom.current().nextInt(1, 2);
	    
	    String[] shipCoordinate = new String[4];

	    if (randomOrientation == 1) {
		    randomNumberRow = ThreadLocalRandom.current().nextInt(1, 10);
		    randomNumberCol = ThreadLocalRandom.current().nextInt(4, 7);
		    for (int i = 0; i < 4; i++) {
			shipCoordinate[i] = randomNumberRow + ", " + randomNumberCol;
				if (randomIncOrDec == 1) {
					randomNumberCol++;
				} else if (randomIncOrDec == 2) {
					randomNumberCol--;
				}
		    }
	    } else if (randomOrientation == 2) {
		    randomNumberRow = ThreadLocalRandom.current().nextInt(4, 7);
		    randomNumberCol = ThreadLocalRandom.current().nextInt(1, 10);
		    for (int i = 0; i < 4; i++) {
			shipCoordinate[i] = randomNumberRow + ", " + randomNumberCol;
				if (randomIncOrDec == 1) {
					randomNumberRow++;
				} else if (randomIncOrDec == 2) {
					randomNumberRow--;
				}
		    }
	    }

	    for (int i = 0; i < 4; i++) {
	    	System.out.println(shipCoordinate[i]);
	    	System.out.println(randomOrientation + " " + randomIncOrDec);
	    }

		do {
	    	Scanner scnr = new Scanner(System.in);

			System.out.println("");
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

    	if (shipCoordinate[0].equals(coordinateGuess) || shipCoordinate[1].equals(coordinateGuess) || shipCoordinate[2].equals(coordinateGuess) || shipCoordinate[3].equals(coordinateGuess)) {
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
				System.out.println("");
				printBoard(board, alpha, number);
			} else if (guessNum > 5) {
				System.out.println("Game over!");
				System.out.println("");
				
				printBoard(board, alpha, number);
			}
		

		} while (hitCounter < 4 && guessNum <= 5);
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
