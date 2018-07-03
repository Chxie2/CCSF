package hw.Arrays;
import java.util.Scanner;

public class A8Q1 {
	
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int [] num = new int[10];
	System.out.println("Enter 10 Numbers in a row");
	num[0] = input.nextInt();
	num[1] = input.nextInt();
	num[2] = input.nextInt();
	num[3] = input.nextInt();
	num[4] = input.nextInt();
	num[5] = input.nextInt();
	num[6] = input.nextInt();
	num[7] = input.nextInt();
	num[8] = input.nextInt();
	num[9] = input.nextInt();
	int avg = ((num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + num[8] + num[9]) / 10);
	System.out.println("Average of the Array is " + avg);
	input.close();
}
}
/*Enter 10 Numbers in a row
1
2
3
4
5
6
7
8
9
1
Average of the Array is 4*/
