package hw.Methods;

import java.util.Scanner;

public class A5Q1 {

	public static int COMPOSITE(int num) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Number?");
		num = input.nextInt();
		input.close();
		for (int divide = num / 2; divide > 1; divide--) {
			double result = (double) num / divide;
			if (result == (int) result)
				System.out.println("1");

			else
				System.out.println("0");
		}
		return num;
	}
//To test the method
		public static void main(String args[]) {
			int a = 0;
			COMPOSITE(a);
			
		}
}