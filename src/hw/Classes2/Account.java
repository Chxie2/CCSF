package hw.Classes2;

import java.util.Scanner;

public class Account {
	private int Acno;
	private String Name;
	private float Balance = 0;
	Scanner input = new Scanner(System.in);
	
	public void Init() {
	System.out.println("What is the Account Number?");
	Acno = input.nextInt();
	System.out.println("What is the Name of Account?");
	Name = input.next();
	System.out.println("What is the Balance?");
	Balance = input.nextFloat();
	}
	public void Show() {
	System.out.println("Account Number = " + Acno);
	System.out.println("Account Name = " + Name);
	System.out.println("Balance = " + Balance);
	}

	public void Deposit() {
	System.out.println("How Much Would You Like to Deposit?");
	int Amt = input.nextInt();
	Balance =+ Amt;
	}
	public void Withdraw() {
	System.out.println("How Much Would You Like to Withdraw?");
	int Amt = input.nextInt();
	Balance =- Amt;
	}
	public float RBalance() {
	return Balance;
	}
}

