package hw.ArrayOfObjects;

import java.util.Scanner;

public class ACCOUNT {
	private int ACno;
	private String Name;
	private float Balance;
	static Scanner input = new Scanner(System.in);

	public void ACCOUNT() {
		ACno = 1;
		Name = "I";
		Balance = 500;
	}

	public void ACCOUNT(int newAcno, String newName, float newBalance) {
		ACno = newAcno;
		Name = newName;
		Balance = newBalance;
	}

	public void Init() {
		System.out.println("What is the Account Number?");
		ACno = input.nextInt();
		System.out.println("What is the Name of the Owner of Account?");
		Name = input.next();
		System.out.println("What is the Balance?");
		Balance = input.nextFloat();
	}

	public void Show() {
		System.out.println("Account Number is : " + ACno);
		System.out.println("Name of Account Owner is : " + Name);
		System.out.println("Balance is : " + Balance);
	}

	public void Deposit() {
		int Amt;
		System.out.println("How Much Do You Want To Deposit?");
		Amt = input.nextInt();
		Balance += Amt;
		System.out.println("Your New Balance is : " + Balance);
	}

	public void Withdraw() {
		int tempBal, Amt;
		System.out.println("How Much Would You Like To Withdraw?");
		Amt = input.nextInt();
		tempBal = (int) Balance - 500;
		if (tempBal >= Amt) {
			Balance -= Amt;
			System.out.println("Your New Balance is : " + Balance);
		} else {
			System.out.println("You DO NOT Have Enough Money");
			System.out.println("Your Balance is : " + Balance);
			System.out.println("You MUST HAVE A Minumum Balance of $500");
		}

	}

	public float RBalance() {
		return Balance;
	}
	public int getAcno() {
		return ACno;
	}
}
