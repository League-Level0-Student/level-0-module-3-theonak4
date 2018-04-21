package loops;

import java.awt.Color;
import java.lang.reflect.Field;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static Robot robot = new Robot();

	public static void main(String[] args) {

		String shape = JOptionPane.showInputDialog("What shape would you like the robot to draw?");
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");

		Color c;
		try {
			Field f = Class.forName("java.awt.Color").getField(color);
			c = (Color) f.get(null);
		} catch (Exception e) {
			c = null;
		}

		robot.penDown();

		switch (shape.toLowerCase()) {

		case "square":
			drawSquare(c);
			break;
		case "triangle":
			drawTriangle(c);
			break;
		case "circle":
			drawCircle(c);
			break;

		}

	}

	public static void drawSquare(Color color) {
		robot.setPenColor(color);
		robot.setSpeed(90);
		for (int i = 0; i < 4; i++) {
			robot.move(90);
			robot.turn(90);
		}
	}

	public static void drawTriangle(Color color) {
		robot.setPenColor(color);
		robot.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			robot.move(90);
			robot.turn(120);
		}

	}

	public static void drawCircle(Color color) {
		robot.setPenColor(color);
		robot.setSpeed(90);
		for (int i = 0; i < 360; i++) {
			robot.move(1);
			robot.turn(1);
		}
	}
}
