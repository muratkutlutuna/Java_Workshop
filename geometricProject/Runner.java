package geometricProject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Runner {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {
		String s = JOptionPane.showInputDialog(
				"****Geometric Calculation Program****\n1.Circle\n2.Rectangle\n3.Square\n4.Exit\n\nMake your choice..:");

		switch (s) {
		case "1":
			String radius = JOptionPane.showInputDialog("****Circle Calculation***\nEnter radius of circle: ");

			Circle circle = new Circle(Double.parseDouble(radius));

			JOptionPane.showMessageDialog(null,
					"Premeter of circle = " + circle.getPremeter() + "\n Space of circle = " + circle.getSpace(),
					"Circles result", JOptionPane.PLAIN_MESSAGE);
			;

			menu();
			break;
		case "2":

			String longSideLength = JOptionPane
					.showInputDialog("****Rectangle Section***\nEnter long side length of the rectangle: ");

			String sideLength1 = JOptionPane
					.showInputDialog("****Rectangle Section***\nEnter side length of the rectangle: ");

			Rectangle rectangle = new Rectangle(Double.parseDouble(sideLength1), Double.parseDouble(longSideLength));

			JOptionPane.showMessageDialog(null, "Premeter of the rectangle = " + rectangle.getPremeter()
					+ "\nSpace of the rectangle = " + rectangle.getSpace(), "Results of the rectangle",
					JOptionPane.PLAIN_MESSAGE);
			;

			menu();

			break;
		case "3":
			String sideLength2 = JOptionPane.showInputDialog("****Square Section***\nEnter side length of the square: ");

			Square square = new Square(Double.parseDouble(sideLength2));

			JOptionPane.showMessageDialog(null,
					"Premeter of the square = " + square.getPremeter() + "\nSpace of the square = " + square.getSpace(),
					"Results of the square", JOptionPane.PLAIN_MESSAGE);
			;

			menu();

			break;
		case "4":
			JOptionPane.showMessageDialog(null, "We hope you come by again", "Exit", JOptionPane.PLAIN_MESSAGE);

			break;

		default:
			System.out.println("Wrong input occured");
			break;
		}

	}

}
