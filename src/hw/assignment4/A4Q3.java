package hw.assignment4;

import java.util.Scanner;

public class A4Q3 {

	public static void main(String[] args) {
		
		int a, s;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Number?");
		a = input.nextInt();
		s = --a;
		a++;
		for(; s >= 1; s--) {
			a += s;
		}
			
			System.out.println("Sum = " + a);
		input.close();
		

	}

}
