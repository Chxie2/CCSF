package hw.ArrayOfObjects;

import java.util.Scanner;

public class acmain {
	static ACCOUNT[] Details;
	static Scanner input = new Scanner(System.in);

	static void methodRegister() {
		System.out.println("How Many Accounts Do You Want To Register?");
		int numAc = input.nextInt();
		Details = new ACCOUNT[numAc + 1];
		for (int i = 1; i <= numAc; i++) {
			Details[i] = new ACCOUNT();
			System.out.println("Input Information :");
			System.out.println();
			Details[i].Init();
			System.out.println();
		}

	}

	static void methodTransact() {
		System.out.println("What is the Account Number?");
		int find = input.nextInt();
		for (int i = 1; i < Details.length; i++) {
			if (find == Details[i].getAcno()) {
				System.out.println("Do you want to(a)Withdraw or (b)Deposit?");
				String ch = input.next();
				switch (ch) {
				case ("a"):
					Details[i].Withdraw();
					break;
				case ("b"):
					Details[i].Deposit();
					break;
				}
			} else
				System.out.println("Account Number Not Found");

		}
	}

	static void DisplayAll() {
		for (int i = 1; i < Details.length; i++) {
			Details[i].Show();
		}
	}

	public static void main(String[] args) {
		methodRegister();
		methodTransact();
		DisplayAll();
	}
}
/*
How many accounts do you want to register?
1
Input Information :

What is the Account Number?
1
What is the Name of the Owner of Account?
r
What is the Balance?
700

What is the Account Number?
1
Do you want to(a)Withdraw or (b)Deposit?
a
How Much Would You Like To Withdraw?
200
Your New Balance is : 500.0
Account Number is : 1
Name of Account Owner is : r
Balance is : 500.0
*/