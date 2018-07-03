package hw;
import java.util.Scanner;

public class Start {
	public static int getVara() {
		int a = 0;
		Scanner input = new Scanner(System.in);
			try {
				a = input.nextInt();
			} catch (Exception e) {
				System.out.println("Incorrect Response");
			}
		

		input.close();
		return a;

	}

}
