package hw.Graphics.Assignment3;
import javax.swing.JOptionPane;
public class TimeCalc {
	public static void main(String[] args) {
		int numTotal = 0;
		String Time1 = JOptionPane.showInputDialog("What is the Time?" + "\nIn HH:MM:SS AM/PM Format");
		String Time2 = JOptionPane.showInputDialog("What is the End Time?");
		int TimeOne = Integer.parseInt(Time1);
		String[] TimeOne = Time1.split("");
		for(int i = 0; i <= TimeOne.length; i++) {
			if(TimeOne[i] == ":")
				TimeOne[i] = "0";
			int num1 = Integer.parseInt(TimeOne[i]);
			numTotal += num1;
			numTotal *= 10;
			JOptionPane.showMessageDialog(null, numTotal);
		
	}

}
