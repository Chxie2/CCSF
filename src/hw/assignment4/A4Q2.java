package hw.assignment4;
import java.util.Scanner;

public class A4Q2 {

	public static void main(String[] args) {
		boolean prime = true;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Number?");
		num = input.nextInt();
		for(int divide = num/2; divide > 1; divide--) 
			{
			double result = (double)num / divide;
			if(result == (int)result) 
				{
				System.out.println("Composite");
				prime = false;
				break;
				}
			}
		System.out.println("Prime " + prime);
		input.close();	
	}

}
