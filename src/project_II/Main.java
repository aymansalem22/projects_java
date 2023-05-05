package project_II;

import java.util.Scanner;

//Project II: Tic-Tac-Toe
public class Main {

	public static void main(String[] args) {
		//// create a 3x3 character array that represents our tic tac toe board
		char[][] game_board = new char[3][3];

		// variables to keep track of players
		char c = '-';
		boolean p1Turn = true;

		// Initialize our board with '-'
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				game_board[i][j] = '-';
			}
		}

		displayBoard(game_board);

		System.out.println("\nThe old value of c = '" + c + "'");// just for testing
		c = checkTurn(c, p1Turn);
		move(c, game_board);
	}

	public static void move(char c, char[][] game_board) {
		// Indexes that correspond to a position on our board
		int row = 0;
		int col = 0;

		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a row number(0,1, or 2): ");
			row = in.nextInt();
			System.out.println("Enter a column number(0,1,or 2): ");
			col = in.nextInt();
			// Check if the row and col are 0,1, or 2
			if (row < 0 || col < 0 || row > 2 || col > 2) {
				System.out.println("This position is off the bounds of the board! Try again.");
			}
			// Check if the position on the board the user entered is empty( has a -) or not
			else if (game_board[row][col] != '-') {
				System.out.println("Someone has already made a move at this position! Try again.");
			}

			// Otherwise, the position is valid so break out of the while loop
			else {
				System.out.println("\nInput is valid!");
				game_board[row][col] = c;
				System.out.println("\nGame board updated.");
				return;
			}

		}
	}

	public static void displayBoard(char[][] game_board) {
		System.out.println("\nTic Tac Toe Board");

		// Outer loop will follow the row-major order
		for (int i = 0; i < 3; i++) {
			// Inner loop will follow the column-major order
			for (int j = 0; j < 3; j++) {
				System.out.print(game_board[i][j] + " ");
				game_board[i][j] = '-';
			}
			// This will make a new line after every row
			System.out.println();
		}
	}

	public static char checkTurn(char c, boolean p1Turn) {

		if (p1Turn) {
			System.out.println("Player1's Turn (x):");
			c = 'x';
		} else {
			System.out.println("Player2's Turn (o):");
			c = 'o';
		}
		return c;
	}

}
