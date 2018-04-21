package loops;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String happy = JOptionPane.showInputDialog("Are you happy?");

		if (happy.equals("Yes")) {

			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");

		} else if (happy.equals("No")) {

			String desire = JOptionPane.showInputDialog("Do you want to be happy?");

			if (desire.equals("Yes")) {

				JOptionPane.showMessageDialog(null, "Change something. ");

			} else if (desire.equals("No")) {

				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");

			}
		}

	}

}
