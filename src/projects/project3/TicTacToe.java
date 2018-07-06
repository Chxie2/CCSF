package projects.project3;
import java.util.Scanner;

public class TicTacToe {

	private String[][] board = new String[3][5];
	private int stepCounter = 0;

	// Method Create game board
	public void createGameBoard() {
		// define game board with an array
		int row = 0, column = 0;
		for (row = 0; row < board.length; row++) {
			for (column = 0; column < board[row].length; column++) {
				if (column % 2 == 0)
					board[row][column] = "_";
				else
					board[row][column] = "|";

			}
		}
	}

	// Display game board
	public void displayBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int x = 0; x < board[i].length; x++) {
				System.out.print(board[i][x]);
			}
			System.out.println();
		}
	}

	// Get move from Play1
	public void play1Move() {
		Scanner keyboard = new Scanner(System.in);
		int play1Row = 0, play1Column = 0;
		System.out.print("Player1 enter your 'X' move(Row Column): ");
		play1Row = keyboard.nextInt();
		play1Column = keyboard.nextInt();

		// Validate user's input between 0 to 2
		while ((play1Row > 2) || play1Column > 2) {
			System.out.println("Invalid! Row and Column from 0 to 2");
			System.out.print("Player1 enter your 'X' move again(Row Column): ");
			play1Row = keyboard.nextInt();
			play1Column = keyboard.nextInt();
		}

		// Move column
		play1Column = moveColumn(play1Column);

		board[play1Row][play1Column] = "X";
		// After play1's move, display board
		displayBoard();
	}

	// Get move from Play2
	public void play2Move() {
		Scanner keyboard = new Scanner(System.in);
		int play2Row = 0, play2Column = 0;
		System.out.print("Player2 enter your 'O' move(Row Column): ");
		play2Row = keyboard.nextInt();
		play2Column = keyboard.nextInt();

		// Validate user's input between 0 to 2
		while ((play2Row > 2) || play2Column > 2) {
			System.out.println("Invalid! Row and Column from 0 to 2");
			System.out.print("Player2 enter your 'O' move again(Row Column): ");
			play2Row = keyboard.nextInt();
			play2Column = keyboard.nextInt();
		}

		// Move column
		play2Column = moveColumn(play2Column);

		board[play2Row][play2Column] = "O";
		// After play1's move, display board
		displayBoard();
	}

	public int moveColumn(int column) {
		int newColumn = 0;
		if (column == 1)
			newColumn = 2;
		else if (column == 2)
			newColumn = 4;
		return newColumn;
	}

	public void startGame() {
		Scanner keyboard = new Scanner(System.in);
		createGameBoard();
		displayBoard();
		stepCounter = 0;

		for (int i = 0; i < 3; i++) {
			if (i % 2 == 0) {
				play1Move();
				checkWhoCanWin();
				play2Move();
				checkWhoCanWin();
				play1Move();
				checkWhoCanWin();
			} else {
				play2Move();
				checkWhoCanWin();
				play1Move();
				checkWhoCanWin();
				play2Move();
				checkWhoCanWin();
			}

			stepCounter += 3;
		}
		if (stepCounter == 9)
			checkContinueGame();
	}

	public void checkContinueGame() {
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 1;
		System.out.print("Continue Game(Enter: 1)" + "\nEnd Game(Enter: 2)" + "\nYour Enter: ");
		userChoice = keyboard.nextInt();

		if (userChoice == 1)
			startGame();
		else
			System.exit(0);
	}

	// Display the game result, which player won
	public void displayWhoWon() {
		if (board[0][0] == "X") {
			System.out.println("Player1 Won");
			checkContinueGame();
		} 
		else{
			System.out.println("Player2 Won");
			checkContinueGame();
		}
	}

	// Check which player won the game
	public void checkWhoCanWin() {
		checkX();
		checkO();
		if (isTie == true) {
			System.out.println("There is a tie.");
			checkContinueGame();
		}
			
	}
	boolean isTie = false;//default to no tie
	// Check whether X won
	public void checkX() {
		if ((board[0][0] == "X") && (board[0][2] == "X") && (board[0][4] == "X")) {
			displayWhoWon();
		} else if ((board[1][0] == "X") && (board[1][2] == "X") && (board[1][4] == "X")) {
			displayWhoWon();
		} else if ((board[2][0] == "X") && (board[2][2] == "X") && (board[2][4] == "X")) {
			displayWhoWon();
		} else if ((board[0][0] == "X") && (board[1][0] == "X") && (board[2][0] == "X")) {
			displayWhoWon();
		} else if ((board[0][2] == "X") && (board[1][2] == "X") && (board[2][2] == "X")) {
			displayWhoWon();
		} else if ((board[0][4] == "X") && (board[1][4] == "X") && (board[2][4] == "X")) {
			displayWhoWon();
		} else if ((board[0][0] == "X") && (board[1][2] == "X") && (board[2][4] == "X")) {
			displayWhoWon();
		} else if ((board[0][4] == "X") && (board[1][2] == "X") && (board[2][0] == "X")) {
			displayWhoWon();
		} else {
			checkTie();
		}
	}

	// Check whether Y won
	public void checkO() {
		if ((board[0][0] == "O") && (board[0][2] == "O") && (board[0][4] == "O")) {
			displayWhoWon();
		} else if ((board[1][0] == "O") && (board[1][2] == "O") && (board[1][4] == "O")) {
			displayWhoWon();
		} else if ((board[2][0] == "O") && (board[2][2] == "O") && (board[2][4] == "O")) {
			displayWhoWon();
		} else if ((board[0][0] == "O") && (board[1][0] == "O") && (board[2][0] == "O")) {
			displayWhoWon();
		} else if ((board[0][2] == "O") && (board[1][2] == "O") && (board[2][2] == "O")) {
			displayWhoWon();
		} else if ((board[0][4] == "O") && (board[1][4] == "O") && (board[2][4] == "O")) {
			displayWhoWon();
		} else if ((board[0][0] == "O") && (board[1][2] == "O") && (board[2][4] == "O")) {
			displayWhoWon();
		} else if ((board[0][4] == "O") && (board[1][2] == "O") && (board[2][0] == "O")) {
			displayWhoWon();
		} else {
			checkTie();
		}
	}

	public void checkTie() {
		int numUnderScore = 0;
		for (int i = 0; i < board.length; i++) {
			for (int x = 0; x < board[i].length; x++) {
				if (board[i][x] == "_") {// If there is _ in the game board, it means the user haven't finished all 9
										// moves.
					numUnderScore++;
				}
			}

		}
		if(numUnderScore >= 1)
			isTie = false;
		else 
			isTie = true;
	}
}