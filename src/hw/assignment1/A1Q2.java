package hw.assignment1;
import java.util.Scanner;
public class A1Q2 {

	public static void main(String[] args) {
		int r;
		Scanner value = new Scanner(System.in);
		System.out.println("What is your Radius?");
		r = value.nextInt();
		System.out.println("Circumfrence=" +(Math.PI * 2));
		System.out.println("Area = "+ Math.PI * Math.pow(r, 2));
		value.close();
	}

}
