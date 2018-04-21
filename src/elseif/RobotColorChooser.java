//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;
import java.lang.reflect.Field;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		while (true) {

			// 3. Ask the user what color they would like the robot to draw

			String c = JOptionPane.showInputDialog("What color would you like the robot to draw?");

			// 5. Use an if/else statement to set the pen color that the user requested
			rob.penDown();
			rob.setPenWidth(10);
			rob.setSpeed(50);

			if (c.isEmpty()) {
				rob.setRandomPenColor();
			} else {
				Color color;
				try {
					Field f = Class.forName("java.awt.Color").getField(c);
					color = (Color) f.get(null);
				} catch (Exception e) {
					color = null;
				}
				rob.setPenColor(color);

			}

			int i;
			for (i = 0; i < 5; i++) {
				rob.move(90);
				rob.turn(90);
			}
		}

		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}
