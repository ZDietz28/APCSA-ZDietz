package Chapter2;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class MethodMadness {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2, random1, random2,answer, correctAnswers;
		String name;
		double lexResult, lexResult2;
		String str1, str2;
		correctAnswers = 0;
		System.out.print("Enter your 1st number: ");
		n1 = input.nextInt();
		System.out.print("Enter your second number: ");
		n2 = input.nextInt();
		System.out.println(Math.max(n1,n2) + " is larger than " + Math.min(n1, n2));
		System.out.print("Enter your first string: ");
		str1 = input.next();
		System.out.print("Enter your second string: ");
		str2 = input.next();
		lexResult = str1.compareTo(str2);
		lexResult2 = str2.compareTo(str1);
		if(lexResult < 0) {
			System.out.println(str1 + " comes before " + str2 + " lexiographically");
		} else if(lexResult2 < 0){
			System.out.println(str2 + " comes before " + str1 + "lexiographically");
		} else {
			System.out.println("bruh they the same word");
		}
		Random generator = new Random();
		random1 = (generator.nextInt(19) + 1);
		random2 = (generator.nextInt(19) + 1);
		System.out.print("Enter your name: ");
		name = input.next();
		System.out.println("Welcome " + name + "! Please answer the following questions: ");
		System.out.print(random1 + " + " + random2 + " = ");
		answer = input.nextInt();
		if(answer == (random1 + random2)) {
			System.out.println("Correct!");
			correctAnswers ++;
		} else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is " + (random1 + random2));
		}
		System.out.print(random1 +  " * " + random2 + " = ");
		answer = input.nextInt();
		if(answer == (random1 * random2)) {
			System.out.println("Correct!");
			correctAnswers ++;
		} else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is " + (random1 * random2));
		}
		System.out.print(random1 + " / " + random2 + " = ");
		answer = input.nextInt();
		if(answer == (random1 / random2)) {
			System.out.println("Correct!");
			correctAnswers ++;
		} else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is " + (random1 / random2));
		}
		System.out.print(random1 + " % " + random2 + " = ");
		answer = input.nextInt();
		if(answer == (random1 % random2)) {
			System.out.println("Correct!");
			correctAnswers ++;
		} else {
			System.out.println("Incorrect!");
			System.out.println("The correct answer is " + (random1 % random2));
		}
		System.out.println("You got " + correctAnswers + " correct answers!");
		System.out.println("That's " + (((double) correctAnswers/4.0) * 100) + "%!");
	}

}
