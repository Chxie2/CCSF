package hw.assignment1;
import java.util.Scanner;
public class A1Q1 {

	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = input.nextInt();
		System.out.println("Enter Second Number");
		b = input.nextInt();
		System.out.println("Sum=" + (a+b));
		System.out.println("Difference=" + (a-b));
		System.out.println("Product=" + (a*b));
		System.out.println("Quotient=" + (a/b));
		System.out.println("Remainder = " + (a%b));
		input.close();
	}

}