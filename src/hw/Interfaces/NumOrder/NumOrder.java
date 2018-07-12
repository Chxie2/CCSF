package hw.Interfaces.NumOrder;
import java.util.Scanner;

public class NumOrder implements NumInterface{
	Scanner input = new Scanner(System.in);
	int [] nums;
	int x;
	public void numInput() {
		System.out.println("How Many Numbers Do You Want To Input?");
		x = input.nextInt();
		nums = new int[x];
		for(int i = 0; i < x; i++) {
			System.out.println("What is the Number?");
			nums[i] = input.nextInt();
		}
	}
	public void avgNum() {
		int totalValue = 0;
		double avgNum;
		for(int i = 0; i < x; i++) {
			totalValue += nums[i];
		}
		avgNum = totalValue / x;
		System.out.println("Average of the Numbers is " + avgNum);
	}
	public void lowestNumbers() {
		Integer secLowestNumber = null, lowestNum = null;
		for(int i = 0; i < x; i++) {
			if(lowestNum == null)
				lowestNum = nums[i];
			if(nums[i] < lowestNum) {
				if(secLowestNumber == null)
					secLowestNumber = lowestNum;
				secLowestNumber = lowestNum;
				lowestNum = nums[i];
			}
		}
		System.out.println("Lowest Number is " + lowestNum);
		System.out.println("Second Lowest Number is " + secLowestNumber);
	}
}
