package hw.assignment2;
import java.util.Scanner;
public class A2Q2 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your First Number?");
		a = input.nextInt();
		System.out.println("What is your Second Number?");
		b = input.nextInt();
		System.out.println("What is your Third Number?");
		c = input.nextInt();
		if ((a >= b) && (a >= c))
			System.out.println(a + " is the Largest Number");
			else if ((b >= a) && (b >= c))
				System.out.println(b + " is the Largest Number");
				else if ((c >= a) && (c >= b))
					System.out.println(c + " is the Largest Number");
		input.close();
	}
}
			