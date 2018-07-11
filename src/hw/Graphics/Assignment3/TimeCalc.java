package hw.Graphics.Assignment3;
import javax.swing.JOptionPane;
public class TimeCalc {
	public static void main(String[] args) {
		String time1 = JOptionPane.showInputDialog("enter first time\nwith the format:\n11:58:10 PM"),
				time2 = JOptionPane.showInputDialog("enter second time\nwith the format:\n12:02:15 AM");

		if (time1.substring(9, 11).equalsIgnoreCase("PM"))
			time1 = (Integer.parseInt(time1.substring(0, 2)) + 12) + time1.substring(2);
		if (time1.substring(0, 2).equals("12") && time1.substring(9, 11).equalsIgnoreCase("AM"))
			time2 = "00" + time2.substring(2);

		if (time2.substring(9, 11).equalsIgnoreCase("PM"))
			time2 = (Integer.parseInt(time2.substring(0, 2)) + 12) + time2.substring(2);
		if (time2.substring(0, 2).equals("12") && time2.substring(9, 11).equalsIgnoreCase("AM"))
			time2 = "00" + time2.substring(2);

		int second = Integer.parseInt(time2.substring(6, 8)) - Integer.parseInt(time1.substring(6, 8));
		int minute = Integer.parseInt(time2.substring(3, 5)) - Integer.parseInt(time1.substring(3, 5));
		int hour = Integer.parseInt(time2.substring(0, 2)) - Integer.parseInt(time1.substring(0, 2));

		if (second < 0) {
			second += 60;
			minute--;
		}
		if (minute < 0) {
			minute += 60;
			hour--;
		}
		if (hour < -12)
			hour += 24;
		else
			hour += 12;

		JOptionPane.showMessageDialog(null, hour + " hours " + minute + " minutes " + second + " second ");

	}
	}
