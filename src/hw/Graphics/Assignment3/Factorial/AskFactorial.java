package hw.Graphics.Assignment3.Factorial;
import javax.swing.JOptionPane;
import hw.Graphics.Assignment2.Factorial.Factorial;

public class AskFactorial {
	public static void ask() {
		Factorial factorial = new Factorial();
	int ask = JOptionPane.showConfirmDialog(null, "Do You Want To Do Factorials?");
	if (ask == JOptionPane.YES_OPTION) {
		factorial.Factorial();
		}
	else if(ask == JOptionPane.NO_OPTION) {
		JOptionPane.showMessageDialog(null, "Maybe Next Time");
	}
	}
	public static void main (String[] args) {
		ask();
		}
}
