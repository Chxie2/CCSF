import java.util.Scanner;

public class New {
	
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
		input.close();
	
	}
		{	
		int r;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter Radius");
		r = value.nextInt();
		System.out.println("Circumfrence=" +(Math.PI * 2) + "Area=" + (Math.PI * Math.pow(0, 2) * r));
		value.close();
		}
}	
	


	
