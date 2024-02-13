/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Create the board, filled of "O".
		// Player 1 will be represented through "A"
		// Player 2 will be represented through "B"
		String[][] board = {{"O", "O", "O", "O", "O", "O", "O"},
							{"O", "O", "O", "O", "O", "O", "O"},
							{"O", "O", "O", "O", "O", "O", "O"},
							{"O", "O", "O", "O", "O", "O", "O"},
							{"O", "O", "O", "O", "O", "O", "O"},
							{"O", "O", "O", "O", "O", "O", "O"}};
		// printBoard prints the board above to the terminal with spaces and bars between
		printBoard(board);

		Scanner sc = new Scanner(System.in);

		// true means it is currently A's turn
		// false means it is currently B's turn
		boolean playerTurn = true;

		// int gameOver is represented through 3 states
		// gameOver == 0 means the game has not been won
		// gameOver == 1 means the game was won by "A"
		// gameOver == 2 means the game was won by "B"
		int gameOver = 0;
		while(gameOver == 0){
			// Enter a column for your piece
			System.out.println("Please enter a column to place your piece: ");
			int col = sc.nextInt();
			sc.nextLine();

			// Check the input is within the bounds of the 2D array given
			if(col < 0 || col > board[0].length){
				System.out.println("Invalid input, please try again.");
				continue;
			}

			// Check the input isn't trying to put into a column that's completely filled
			if(!board[0][col].equals("O")){
				System.out.println("That column is full, try another");
				continue;
			}

			// Using a loop, find the row that is the last empty row above the bottom
			int row = 0;
			while(row != board[0].length-1 && board[row][col].equals("O")){
				row++;
			}
			row--;

			// Based on playerTurn, place the correct letter.
			if(playerTurn){	// Player 1
				board[row][col] = "A";
			}
			else{			// Player 2
				board[row][col] = "B";
			}

			// Change the player's turn
			playerTurn = !playerTurn;
			// Print the board
			printBoard(board);

			// Check winning conditions, if the player has won.
			// Sets gameOver accordingly
			gameOver = checkGameStatus(board);
		}

		// If this is reached, that means the game is over.
		// Check the winner and print who wins!
		if(gameOver == 1){
			System.out.println("A won the game");
		}
		else if(gameOver == 2){
			System.out.println("B won the game!");
		}


	}

	// checkGameStatus does a complete win check to see if the player has won
	// It independently checks the Vertical Axis
	// Then checks the Horizontal Axis
	// Then checks the Diagonal Axis
	// If any of the following are > 0, the game is over.
	// 0 means no winner, 1 means A wins, 2 means B wins
	public static int checkGameStatus(String[][] board){
		int checkV = checkVertical(board);
		int checkH = checkHorizontal(board);
		int checkD = checkDiagonal(board);
		if(checkV == 1 || checkH == 1 || checkD == 1)
			return 1;
		else if(checkV == 2 || checkH == 2 || checkD == 2)
			return 2;
		else
			return 0;
	}

	// This method should check ALL vertical columns to see if the game has been won
	// Winning means there are 4 of the same values in a column
	// Any spot with an "O" in its place should be disregarded and continued to the next check
 	public static int checkVertical(String[][] board){

		return 0;
	}

	// This method should check ALL horizontal rows to see if the game has been won
	// Winning means there are 4 of the same values in a row
	// Any spot with an "O" in its place should be disregarded and continued to the next check
	public static int checkHorizontal(String[][] board){

		return 0;
	}

	// This method checks 2 types of diagonals.
	// First, it checks top left, down to bottom right. 4 in a row.
	// Second, it checks bottom left, up to top right. 4 in a row.
	// Both should be checked and if one finds a match, it should return a win accordingly.
	// Any spot with an "O" in its place should be disregarded and continued to the next check
	public static int checkDiagonal(String[][] board){
		
		return 0;
	}

	// This method prints the 2D String array given
	public static void printBoard(String [][] board){
		System.out.println("_________________________________________");
		for(int i = 0; i < board.length;i++){
			for(int j = 0; j < board[0].length;j++){
				System.out.print("| " + board[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("_________________________________________");
	}
}
