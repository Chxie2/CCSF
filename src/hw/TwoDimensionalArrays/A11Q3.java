package hw.TwoDimensionalArrays;

import java.util.Scanner;

public class A11Q3 {
	static Scanner input = new Scanner(System.in);

	public static void displayMatrix(int[][] nums) { // DISPLAY Method
		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void create2DArray(int[][] nums) { // CREATE Method
		for (int row = 0; row < nums.length; row++)
			for (int col = 0; col < nums[row].length; col++) {
				System.out.println("What Is The Number For an Array Row " + (row + 1) + " Column " + (col + 1));
				nums[row][col] = input.nextInt();
			}
	}

	public static void SWAP(int[][] nums) { // SWAP Method
		for (int row = 0; row < (nums.length - 1); row++)
			for (int col = row; col < (nums[row].length); col++) {
				int temp, temp2;
				temp = nums[col][row];
				temp2 = nums[row][col];
				nums[row][col] = temp;
				nums[col][row] = temp2;
			}
	}

	public static int diaCalculate(int i, int[][] nums) {
		int diaTotal = 0;
		int row = (i == 1) ? 0 : nums.length - 1;
		for (int col = 0; col < nums.length; col++, row += i) {
			diaTotal += nums[row][col];
			nums[row][col] = 0;
		}
		return diaTotal;
	}

	public static void main(String[] args) {
		System.out.println("Which one do you want to run?");
		int choice = input.nextInt();
		switch(choice) {
		
		// 1
		case(1):{
		int[][] a = new int[3][3];
		for (int row = 0; row < a.length; row++)
			for (int col = 0; col < a[row].length; col++) {
				System.out.println("What is the Number For Row " + (row + 1) + " Column " + (col + 1));
				a[row][col] = input.nextInt();
			}
		displayMatrix(a);

		int totalValue = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				totalValue += a[row][col];
			}
			System.out.println();
		}
		System.out.println("Total Value is " + totalValue);

		int totalEven = 0, totalOdd = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				if (a[row][col] % 2 == 0)
					totalEven += a[row][col];
				else
					totalOdd += a[row][col];
			}
			System.out.println();
		}
		System.out.println("Total Even Value is " + totalEven);
		System.out.println("Total Even Value is " + totalOdd);

		// 2
		int[][] b = new int[3][3];
		for (int row = 0; row < b.length; row++)
			for (int col = 0; col < b[row].length; col++) {
				System.out.println("What is the Number For Array B, Row " + (row + 1) + " Column " + (col + 1));
				b[row][col] = input.nextInt();
			}
		displayMatrix(b);
		System.out.println();

		int[][] sum = new int[3][3];
		for (int row = 0; row < sum.length; row++)
			for (int col = 0; col < sum[row].length; col++) {
				sum[row][col] = a[row][col] + b[row][col];
			}
		displayMatrix(sum);
		System.out.println();

		int[][] diff = new int[3][3];
		for (int row = 0; row < diff.length; row++)
			for (int col = 0; col < diff[row].length; col++) {
				diff[row][col] = a[row][col] - b[row][col];
			}
		displayMatrix(diff);
		// 3
		int rowTotal = 0, colTotal = 0;
		System.out.println("What is The Number of Rows?");
		int m = input.nextInt();
		System.out.println("What is the Number of Columns?");
		int x = input.nextInt();
		int c[][] = new int[m][x];
		for (int row = 0; row < c.length; row++)
			for (int col = 0; col < c[row].length; col++) {
				System.out.println("What is the Number For Array C, Row " + (row + 1) + " Column " + (col  + 1));
				c[row][col] = input.nextInt();
			}
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[row].length; col++) {
				rowTotal += c[row][col];
			}
			System.out.println("Total of Row " + row + " is " + rowTotal);
			rowTotal = 0;
		}
		for (int col = 0; col < c[0].length; col++) {
			for (int row = 0; row < c.length; row++) {
				colTotal += c[row][col];
			}
			System.out.println("Total of Column " + col + " is " + colTotal);
			colTotal = 0;
		}
		int var = 0;
		var += diaCalculate(1, c);
		var += diaCalculate(-1, c);
		System.out.println("Sum of Diagonal Elements is " + var);
		System.out.println();
		break;
		}


	// 4
		case(2):{
		int[][] Square = new int[3][3];
		create2DArray(Square);
		displayMatrix(Square);
		SWAP(Square);
		System.out.println();
		displayMatrix(Square);
		}
		}
	}
	}

/*
 What is the Number For Row 1 Column 1
1
What is the Number For Row 1 Column 2
2
What is the Number For Row 1 Column 3
1
What is the Number For Row 2 Column 1
2
What is the Number For Row 2 Column 2
11
What is the Number For Row 2 Column 3
1
What is the Number For Row 3 Column 1
1
What is the Number For Row 3 Column 2
1
What is the Number For Row 3 Column 3
1
1	2	1	
2	11	1	
1	1	1	



Total Value is 21



Total Even Value is 4
Total Even Value is 17
What is the Number For Array B, Row 1 Column 1
1
What is the Number For Array B, Row 1 Column 2
1
What is the Number For Array B, Row 1 Column 3
1
What is the Number For Array B, Row 2 Column 1
1
What is the Number For Array B, Row 2 Column 2
1
What is the Number For Array B, Row 2 Column 3

11
What is the Number For Array B, Row 3 Column 1
1
What is the Number For Array B, Row 3 Column 2
1
What is the Number For Array B, Row 3 Column 3
1
1	1	1	
1	1	11	
1	1	1	

2	3	2	
3	12	12	
2	2	2	

0	1	0	
1	10	-10	
0	0	0	
What is The Number of Rows?
3
What is the Number of Columns?
3
What is the Number For Array C, Row 1 Column 1
1
What is the Number For Array C, Row 1 Column 2
2
What is the Number For Array C, Row 1 Column 3
1
What is the Number For Array C, Row 2 Column 1
2
What is the Number For Array C, Row 2 Column 2
1
What is the Number For Array C, Row 2 Column 3
2
What is the Number For Array C, Row 3 Column 1
1
What is the Number For Array C, Row 3 Column 2
2
What is the Number For Array C, Row 3 Column 3
1
Total of Row 0 is 4
Total of Row 1 is 5
Total of Row 2 is 4
Total of Column 0 is 4
Total of Column 1 is 5
Total of Column 2 is 4
Sum of Diagonal Elements is 5
What Is The Number For an Array Row 1 Column 1
2
What Is The Number For an Array Row 1 Column 2
1
What Is The Number For an Array Row 1 Column 3
2
What Is The Number For an Array Row 2 Column 1
1
What Is The Number For an Array Row 2 Column 2
2
What Is The Number For an Array Row 2 Column 3
1
What Is The Number For an Array Row 3 Column 1
2
What Is The Number For an Array Row 3 Column 2
1
What Is The Number For an Array Row 3 Column 3
2
What 2 Numbers Do You Want To Switch?
1
2
1	2	1	
2	1	2	
1	2	1
 */
