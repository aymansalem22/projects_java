package project_II;

//Project II: Tic-Tac-Toe
public class Main {

	public static void main(String[] args) {
		//// Let's create a 3x3 character array that represents our tic tac toe board
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
		System.out.println("The new value of c = " + c + "'");// just for testing

	}

	public static void displayBoard(char[][] game_board) {
		System.out.println("\nTic Tac Toe Board");

		// Outer loop will follow the row-major order
		for (int i = 0; i < 3; i++) {
			// Inner loop will follow the column-major order
			for (int j = 0; j < 3; j++) {
				System.out.println(game_board[i][j] + " ");
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
