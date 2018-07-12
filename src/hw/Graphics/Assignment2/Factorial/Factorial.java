package hw.Graphics.Assignment2.Factorial;
import javax.swing.JOptionPane;
public class Factorial {
	public void Factorial() {
		int finalValue = 0;
		String wNum = JOptionPane.showInputDialog("What is Your Whole Number?");
		int wholeNm = Integer.parseInt(wNum);
		for(;wholeNm >= 1; wholeNm--) {
			finalValue += wholeNm;
		}
		JOptionPane.showMessageDialog(null, "Factorial of " + wNum + " is " + finalValue);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.Factorial();
	}

}
