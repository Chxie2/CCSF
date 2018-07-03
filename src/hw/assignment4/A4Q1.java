package hw.assignment4;
import java.util.Scanner;

public class A4Q1 {

	public static void main(String[] args) {
		
		int num;
		char choice;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Number?");
		num = input.nextInt();
		System.out.println("Do you want multiples, squares, or cubes?");
		choice = input.next().charAt(0);
		
			switch (choice) {
		 		case 'm':
					for(int mul = 1; mul <= 5; mul++)
					System.out.println("First 5 Multiples Are: " + (num * mul));
					break;
		 		case 's':
		 			
					for(int mul = 1; mul <= 5; mul++)
					System.out.println("Square of First 5 Multiples Are: " + (mul * mul * num * num));
					break;	
				case 'c':
					
					for (int mul = 1; mul <= 5; mul++)
					System.out.println("Cubed of First 5 Mulitples Are: " + (mul * mul * mul * num * num * num));
					break;
			}

			
		input.close();
	}

}
