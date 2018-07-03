package hw.Arrays;

import java.util.Scanner;

public class A8Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] num = new int[10];
		System.out.println("Enter 10 Numbers in a row");
		for (int a = 0;a < num.length; ++a) {
			num[a] = input.nextInt();
		}
		int hiNum = num[0], lowNum = num[0];
		for (int a = 0;a < num.length; ++a) {
			if(num[a] < lowNum)
				lowNum = num[a];
			if(num[a] > hiNum)
				hiNum = num[a];
			}
		System.out.println("Lowest Number = " + lowNum);
		System.out.println("Highest Number = " + hiNum);
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
10
Lowest Number = 1
Highest Number = 10*/