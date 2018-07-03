package hw.Arrays;

import java.util.Scanner;

public class A8Q4 {
	public static Boolean Prime(int n) {
		int outCome;
		if(n == 0)
			return true;
		double d = n / 2;
		if((int)d == 0)
			return true;
		else{
			do {
			outCome = n / (int)d;
			d--;
		} while (outCome != (int)outCome);
		return true;}
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		int primeTotal = 0;
		System.out.println("Enter 10 Numbers in a row");
		for (int a = 0; a < num.length; ++a) {
			num[a] = input.nextInt();
		}
		for (int a = 0; a < num.length; ++a) {
			Prime(num[a]);
			if (Prime(num[a]) == true) {
				System.out.println("Prime Numbers Are " + num[a]);
				++primeTotal;
				}
		}
		System.out.println("Total of Prime Numbers is " + primeTotal);
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
Prime Numbers Are 1
Prime Numbers Are 2
Prime Numbers Are 1
Prime Numbers Are 2
Prime Numbers Are 1
Prime Numbers Are 2
Prime Numbers Are 1
Prime Numbers Are 2
Prime Numbers Are 1
Prime Numbers Are 2
Total of Prime Numbers is 10
*/
