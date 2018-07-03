package hw.TwoDimensionalArrays;

import java.util.Scanner;

public class A11Q1and2 {
/* 
#1
0123
0123
0123
 */
	public static void main(String[] args) {
		//2
		Scanner input = new Scanner(System.in);
		int [ ][ ] a = new int[4][5];
		for (int row = 0; row < a.length; row++)
			   for (int col = 0; col < a[row].length; col++) {
				   System.out.println("What is the number for row " + row + " Column " + col);
				   a[row][col] = input.nextInt();
			   }
	}

}
