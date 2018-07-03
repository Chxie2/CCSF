package hw.Methods;

import java.util.Scanner;

public class A5Q3 {

	public static int POWER(int n) {
		int a,atwo, b;
		Scanner input = new Scanner(System.in);
		System.out.println("What is Your Base Number?");
		a = input.nextInt();
		System.out.println("What is Your Exponet?");
		b = input.nextInt();
		atwo = a;
		for(;b >= 2;--b) {
			atwo *= a;
			}
		System.out.println("Result is: " + atwo);
		input.close();
		return(n);
	}
//To test the method
	public static void main(String[] args) {
		int num = 0;
		POWER(num);

	}

}
