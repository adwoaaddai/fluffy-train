package connectFour;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ConnectFour {
	
	//this declares the variable rows and initializes it to 6
	private static final int ROWS = 6;
	//this declares the variable cols and initializes it to 7
	private static final int COLS = 7;
	//this declares the variable board as an array of data type char
	public char[][] board;
	//this declares the variable current player of data type char
	public char currentPlayer;
	//this declares variables player1 and player2 of data type char
	private char player1 = 'X';
	private char player2 = 'O';
	
	//this is a constructor that initializes the board and sets the starting player
	public ConnectFour() {
		//this initializes the variable board the variables rows and cols as the array size
		board = new char[ROWS][COLS];
		//this creates a loop that iterates "row" times(i.e 6)
		for (int i = 0; i < ROWS; i++) {
			//this is an inner loop that iterates "cols" times (i.e 7)
			for (int j = 0; j < COLS; j++) {
				//this initializes elements in the positions of i and j to a space
				board[i][j] = ' ';
			}
		}
		//this initializes currentPlayer to X
		currentPlayer = player1;
	}
	
	//this method displays the board for the ConnectFour game
	public void displayBoard() {
		//this outer loop iterates once
		for (int i = 0; i < 1; i++) {
			//this inner loop iterates "cols" time (i.e 7)
			for (int j = 0; j < COLS; j++) {
				//this prints a space followed by a number
				System.out.print(" " + j);
				//this condition is to ensure that an empty space is not printed after the last iteration
				if (j < COLS - 1) {
					//this prints an empty string
					System.out.print("");
				}
			}
			
		}
		//this prints an empty line
		System.out.println();
		//this prints a string of dashes
		System.out.println("---------------");
		
		
		//this creates a loop that iterates "row" times(i.e 6)
		for (int i = 0; i < ROWS; i++) {
			//this prints a straight slash to represent the rows
			System.out.print("|");
			//this is an inner loop that iterates "cols" times (i.e 7)
			for (int j = 0; j < COLS; j++) {
				//this prints the element in the array index position and a straight slash next to it
				System.out.print(board[i][j] + "|");
				
			}
			//this prints an empty line
			System.out.println();
			
		}
		//this prints a string of dashes
		System.out.println("---------------");
		
	}
	
	//this method is to verify a move made by a player
	public boolean makeMove(int column) {
		//this loop iterates 5 times  and decrements after each loop to keep 
		for (int i = ROWS - 1; i >= 0; i--) {
			//this condition checks if the position the user plays is empty
			if (board[i][column] == ' ') {
				//this puts the player mark at the position they want to play if it is empty
				board[i][column] = currentPlayer;
				//this returns true for a successful move
				return true;
				
			}
		}
		//this returns false for an unsuccessful move
		return false;
	}
	
	//this method checks for victory
	public boolean checkWinner() {
		//the outer loop iterates 6 times
		for (int i = 0; i < ROWS; i++) {
			//the inner loop iterates 7 times
			for (int j = 0; j < COLS; j++) {
				//this checks for same moves horizontally 
				if (j + 3 < COLS && 
						board[i][j] == currentPlayer &&
						board[i][j+1] == currentPlayer && 
						board[i][j+2] == currentPlayer && 
						board[i][j+3] == currentPlayer) {
					//this returns true if a row has four columns with same moves
					return true;
				}
				//this checks for same moves vertically
				if (i + 3 < ROWS && 
						board[i][j] == currentPlayer &&
						board[i+1][j] == currentPlayer && 
						board[i+2][j] == currentPlayer && 
						board[i+3][j] == currentPlayer) {
					//this returns true if a columns has four rows with the same moves
					return true;
				}
				//this checks for same move diagonally from top-left to bottom-right
				if (i + 3 < ROWS && j + 3 < COLS &&
						board[i][j] == currentPlayer &&
						board[i+1][j+1] == currentPlayer &&
						board[i+2][j+2] == currentPlayer &&
						board[i+3][j+3] == currentPlayer) {
					//this returns true if player moves aligns diagonally
					return true;
					
				}
				//this checks for same move diagonally from bottom-left to top-right
				if (i - 3 >= 0 && j + 3 < COLS &&
						board[i][j] == currentPlayer &&
						board[i-1][j+1] == currentPlayer &&
						board[i-2][j+2] == currentPlayer &&
						board[i-3][j+3] == currentPlayer) {
					//this returns true if player moves aligns diagonally
					return true;
				}
			}
		}
		//this returns false if neither of the conditions are met
		return false;
		
	}
	//this method is to check if the board is full
	public boolean isBoardFull() {
		//this iterates 7 times
		for (int j = 0; j < COLS; j++) {
			//this checks if the board is full by checking the first row
			if (board[0][j] == ' ') {
				//this returns false which means the board is not full
				return false;
					
			}
		}
		//this returns true which means the board is full
		return true;
	}
	//this method is to switch current player with player1 and player2
	public char switchPlayer() {
		
		//this returns the either player1 or player2 depending on the current state of player1
		return (currentPlayer == player1) ? player2:player1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scnr = new Scanner(System.in);
		
		//this declares the boolean playAgain and initializes it to false
		boolean playAgain = false;
		
		//this iterates through a block of code while playAgain is true
		while (!playAgain) {
			//this creates an instance called game for the ConnecFour class
			ConnectFour game = new ConnectFour();
			
			//this prints a welcome message to the players
			System.out.println("Welcome to Connect Four!");
			
			//this prints an empty line
			System.out.println();
			
			//this displays the board
			game.displayBoard();
			
			//this initializes the boolean gameOver to false
			boolean gameOver = false;
			//this declares the variable position
			int position;

			
		
			//this allows the game to be played by iterating till the game is over
			while (!gameOver) {
				//this try and catch block is for handling invalid data type inputs
				
				try {
					//this prompts the current player to play
					System.out.println("Player "+ game.currentPlayer + " enter a number(0-6): ");
					//this reads player input
					position = scnr.nextInt();
					
					/*this condition is to ensure user enters a number within the range specified
					The condition also checks whether the column played is filled or not*/
					if (position < 0 || position >= COLS || !game.makeMove(position)) {
						//this prints a message to the user
						System.out.println("Invalid move! Try again");
					
					}
					//this continues the game if the input is within the range specified
					else {
						//this checks if the current player has won
						if (game.checkWinner()) {
							//this prints a victory message
							System.out.println("Player " + game.currentPlayer + " wins!");
							System.out.println();
							//this displays the current state of the board
							game.displayBoard();
							//this ends the loop if the game has been won
							gameOver = true;
							
						}
						
						//this condition checks if the board is full
						else if(game.isBoardFull()) {
							//this lets players know that there is no winner when the board gets full with no victory
							System.out.println("It's a draw");
							System.out.println();
							//this displays the current state of the board
							game.displayBoard();
							//this exits the loop
							gameOver = true;
						}
						
						else {
							//this keeps switching the players till the game is over
							game.currentPlayer = game.switchPlayer();
						}
						
					}
				}
				catch (InputMismatchException e) {
					//this informs the user to use an appropriate data type
					System.out.println("Enter a valid data type(number)!");
					//this clears the invalid user input
					scnr.next();
					//this prints a new line
					System.out.println();					
					
					
				}
			
			}
			//this asks if they user wants to play again
			System.out.println("Do you want to play again? ");
			//this reads user input
			String reply = scnr.next();
			//this declares and initializes the first character from the user to the data type char
			char character = reply.charAt(0);
			//this checks if user input matches 'y'
			if (character == 'y') {
				//this informs the user of a new grid
				System.out.println("New game set");
				//this starts the loop for the playing the game
				playAgain = false;
				
			}
				
		}
		//this thanks the user if they don't want to play again
		System.out.println("Thanks for playing");
		//this closes the scanner class
		scnr.close();
	}
		
			
			
			
			
}
		
		
				
			


		
	
		
		

	


