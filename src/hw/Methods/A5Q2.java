package hw.Methods;
import java.util.Scanner;

public class A5Q2 {

	public static int COUNT(int num) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is Your Integer?");
		num = input.nextInt();
		input.close();
		if(num < 100) {
			int num2 = num / 10;
			System.out.println("First Number is: " + num2);
			num2 *= 10;
			num -= num2;
			System.out.println("Second Number is: " + num);
			}
		else 
			System.out.println("Invalid Input");
		return (num);
	}
//To test the method
	public static void main(String[] args) {
		int a = 0;
		COUNT(a);
	}

}
