package hw.Graphics.Assignment2.TaxCalc;

import javax.swing.JOptionPane;

public class TaxCalculator {
	private static void TaxCalulator2018() {
		String maritalStatus = JOptionPane.showInputDialog("If You Are An Individual Press(1)" + 
															"\nIf You Are Married Press(2)");
		int maritalNum = Integer.parseInt(maritalStatus);
		if(maritalNum == 1 || maritalNum == 2) {
			String income = JOptionPane.showInputDialog("What is Your Income This Year?");
			int incomeValue = Integer.parseInt(income);
			switch (maritalNum) {
			case (1):
				if (incomeValue <= 9525) {
					double taxes = incomeValue * .1;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 38700) && (incomeValue >= 9526)) {
					double taxes = incomeValue * .12;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 82500) && (incomeValue >= 38701)) {
					double taxes = incomeValue * .22;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 157500) && (incomeValue >= 82501)) {
					double taxes = incomeValue * .24;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 200000) && (incomeValue >= 157501)) {
					double taxes = incomeValue * .32;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 500000) && (incomeValue >= 200001)) {
					double taxes = incomeValue * .35;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue >= 500001)) {
					double taxes = incomeValue * .37;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				}
				break;
			
			case (2):
				if (incomeValue <= 19050) {
					double taxes = incomeValue * .1;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 77400) && (incomeValue >= 19051)) {
					double taxes = incomeValue * .12;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 165000) && (incomeValue >= 77401)) {
					double taxes = incomeValue * .22;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 315000) && (incomeValue >= 165001)) {
					double taxes = incomeValue * .24;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 400000) && (incomeValue >= 315001)) {
					double taxes = incomeValue * .32;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue <= 600000) && (incomeValue >= 400001)) {
					double taxes = incomeValue * .35;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				} else if ((incomeValue >= 600001)) {
					double taxes = incomeValue * .37;
					JOptionPane.showMessageDialog(null, "Tax Payment Due Is: " + taxes);
					System.exit(0);
				}
				break;
			}
		}
		else 
			JOptionPane.showMessageDialog(null, "Incorrect Marital Status");
	}

	public static void main(String[] args) {
		TaxCalulator2018();
	}
}
