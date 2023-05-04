package project_II;


//Project II: Tic-Tac-Toe
public class Main {

	public static void main(String[] args) {
		////Let's create a 3x3 character array that represents our tic tac toe board
		char[][] game_board=new char[3][3];
		
	
		
		//Initialize our board with '-'
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				game_board[i][j]='-';
			}
		}
		
		displayBoard(game_board);
		
		
	
	}
	
	public static void displayBoard(char[][] game_board) {
		System.out.println("\nTic Tac Toe Board");
		
		//Outer loop will follow the row-major order
		for(int i=0;i<3;i++) {
			//Inner loop will follow the column-major order
			for(int j=0;j<3;j++) {
				System.out.println(game_board[i][j]+" ");
			}
			//This will make a new line after every row
			System.out.println();
		}
	}
	
    

}
