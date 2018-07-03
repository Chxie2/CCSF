package hw.Arrays;
import java.util.Scanner;

public class A8Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] num = new int[10];
		System.out.println("Enter 10 Numbers in a row");
		for (int a = 0;a < num.length; ++a) {
			num[a] = input.nextInt();
		}
		System.out.println("What is Your Original Number?");
		int ori = input.nextInt();
		System.out.println("What is Your Replacement Number?");
		int rep = input.nextInt();
		for(int a = 0;a < num.length; ++a) {
			System.out.println("Original Array is " + num[a]);
		}
		for(int a = 0;a < num.length; ++a) {
			if(num[a] == ori) 
				num[a] = rep;
		}
		for(int a = 0;a < num.length; ++a) {
			System.out.println("New Array is " + num[a]);
		}
		input.close();
		}
	}
/*Enter 10 Numbers in a row
1
2
1
2
1
2
1
2
1
2
What is Your Original Number?
1
What is Your Replacement Number?
2
Original Array is 1
Original Array is 2
Original Array is 1
Original Array is 2
Original Array is 1
Original Array is 2
Original Array is 1
Original Array is 2
Original Array is 1
Original Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
New Array is 2
*/
