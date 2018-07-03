package hw.Arrays;

import java.util.Scanner;

public class A8Q3 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int [] num = new int[10];
		System.out.println("Enter 10 Numbers in a row");
		for (int a = 0;a < num.length; ++a) {
			num[a] = input.nextInt();
		}
		int evenNum = 0, oddNum = 0;
		for (int a = 0;a < num.length; ++a) {
			if((num[a] % 2) == 0) {
				evenNum += num[a];
				}
			else if((num[a] % 2) != 0) {
				oddNum += num[a];
				}
	}
		System.out.println("Sum of Even Numbers = " + evenNum);
		System.out.println("Sum of Odd Numbers = " + oddNum);
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
Sum of Even Numbers = 10
Sum of Odd Numbers = 5
*/