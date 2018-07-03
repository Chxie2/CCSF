package hw.Classes2;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account a = new Account();
		a.Show();
		System.out.println("Would you like to Deposit or Withdraw?");
		String CH = input.next();
		switch(CH) {
		case("Deposit"):
			a.Deposit();
			break;
		case("Withdraw"):
			a.Withdraw();
			break;
		}
		System.out.println(a.RBalance());
		input.close();
	}

}
