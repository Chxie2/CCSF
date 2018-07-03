package projects.project3;
import java.util.Scanner;

public class TicTacToe {
	static Scanner input = new Scanner(System.in);
	private static void createBoard(char[][]board) {
		board = new char[3][3];
		System.out.println("Player One Is 'O' ");
		System.out.println("Player Two Is 'X' ");
	}
	private static void addMovesPlayerOne(char[][]board) {
		int row1, col1;
		System.out.println("Player One's Turn");//p1
		System.out.println("What Row Do You Want To Place A Marker?");
		row1 = input.nextInt();
		System.out.println("What Column Do You Want To Place A Marker?");
		col1 = input.nextInt();
		board [row1][col1] = 'O';
	}
	private static void addMovesPlayerTwo(char[][]board) {
		int row2, col2;
		System.out.println("Player Two's Turn"); //p2
		System.out.println("What Row Do You Want To Place A Marker?");
		row2 = input.nextInt();
		System.out.println("What Column Do You Want To Place A Marker?");
		col2 = input.nextInt();
		board [row2][col2] = 'X';
	}
	private static void verify(char in) {
		char[][]board = new char[3][3];
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
			System.out.println(in + " Wins!");
		else if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
			System.out.println(in + " Wins!");
		else if(board[0][0] == board[1][0] && board[1][0] == board[2][0])
			System.out.println(in + " Wins!");
		else if(board[0][1] == board[1][1] && board[1][1] == board[2][1])
			System.out.println(in + " Wins!");
		else if(board[0][2] == board[1][2] && board[1][2] == board[2][2])
			System.out.println(in + " Wins!");
		else if(board[0][0] == board[0][1] && board[0][1] == board[0][2])
			System.out.println(in + " Wins!");
		else if(board[1][0] == board[1][1] && board[1][1] == board[1][2])
			System.out.println(in + " Wins!");
		else if(board[2][0] == board[2][1] && board[2][1] == board[2][2])
			System.out.println(in + " Wins!");
	}
	private static void displayBoard(char[][] board) {
		for (int row = 0; row < board.length; row++)
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + "\t");
			}
			System.out.println();
	}
	public static void main(String[]args) {
		char[][]board = new char[3][3];
		createBoard(board);
		addMovesPlayerOne(board);
		verify('O');
		displayBoard(board);
		addMovesPlayerTwo(board);
		verify('X');
		displayBoard(board);
		
	}
}
