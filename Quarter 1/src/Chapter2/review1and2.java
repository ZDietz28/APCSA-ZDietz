package Chapter2;
import java.awt.Rectangle;
import java.util.Random;
import java.lang.StringBuilder;
import java.time.LocalDate;
public class review1and2
{
	public static void main(String[] args)
	{
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("           ");
		System.out.println("  \\_____/  ");
		// 4)Write a series of output statements that will produce a smiley face
		Rectangle rect = new Rectangle(100,100,200,200);
		System.out.println(rect.getBounds());
		rect.grow((int) (-1*(rect.getHeight()/4)),(int) (-1*(rect.getWidth()/4)));
		
		System.out.println(rect.getBounds());
		

		// 5) Write a program that constructs a Rectangle object square with
		//    top-left corner (100, 100) and side length 200, prints its location,
		//    applies the grow and translate methods, and prints the location again.
		//    The calls to grow and translate should modify the square so that it
		//    has half the width and half the length, and is centered in the
		//    original square.
		int n1, n2;
		Random generator = new Random();
		n1 = generator.nextInt(99); 
		n1 ++;
		n2 = generator.nextInt(6);
		n2 += 5;
		System.out.println("Number between 1 and 100 is " + n1);
		System.out.println("Positive integer between 5 and 10 is " + n2);
		// 6) Generate and print a random number between 1 and 100, inclusive.

		// 7) Generate and print a positive integer less than 10.
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(today.getYear(), 6, 15);
		System.out.println("Your brithday was on " + birthday.getDayOfWeek() + " this year");
		// 8) Display the day of the week my birthday, June 15th, was on this year.
		String bradley = "Bradley";
		System.out.println(bradley.length() + " letters in Bradley");
		// 9) Calculate and display the number of letters in the word "Bradley".
	}
}
