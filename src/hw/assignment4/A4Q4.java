package hw.assignment4;

import java.util.Scanner;

public class A4Q4 {

	public static void main(String[] args) {
		int n,s;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Number?");
		n = input.nextInt();
		s = --n;
		n++;
		for(; s >= 1; s--) {
			n *= s;
		}
		System.out.println("Factorial = " + n);
		input.close();

	}

}
