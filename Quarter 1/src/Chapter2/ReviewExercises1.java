package Chapter2;
import java.awt.Rectangle;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ReviewExercises1 {
	public static void main(String[] args) {
		System.out.println("***E2.1***");
		Scanner input = new Scanner(System.in);
		double heightInput, widthInput;
		System.out.print("What is the height?: ");
		heightInput = input.nextDouble();
		System.out.print("What is the width?: ");
		widthInput = input.nextDouble();
		Rectangle rect = new Rectangle();
		rect.setSize((int) widthInput, (int) heightInput);
		System.out.println("Width is " + rect.getWidth());
		System.out.println("Height is " + rect.getHeight());
		System.out.println("The area is " + rect.height*rect.width);
		System.out.println("");
		System.out.println("***E2.5***");
		System.out.println("estimated X and Y = 0,0");
		System.out.println("Estimated width and height = 5x10");
		Rectangle rect2 = new Rectangle(5, 10, 20, 30);
		rect2.add(0,0);
		System.out.println("The new X = " + rect2.getX());
		System.out.println("The new Y = " + rect2.getY());
		System.out.println("The new width = " + rect2.getWidth());
		System.out.println("The new height = " + rect2.getHeight());
		System.out.println("");
		System.out.println("***E2.14***");
		Point point1 = new Point(-3,-4);
		Point point2 = new Point(3,4);
		System.out.println("The distance is: " + Math.sqrt((Math.pow(point2.getX() - point1.getX(), 2.0) + Math.pow(point2.getY() - point1.getY(), 2.0))));
		System.out.println("The expected value is 10");
	}
}
