package hw.Arrays;

import java.util.Scanner;

public class A8Q4 {
	public static Boolean Prime(int n) {
		double c = n / 2;
		for(int d = 2; d <= c; d++) {
			if(n % d == 0) {
				return false;
			}
		}
		return true;
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