package Chapter7;
import java.util.Scanner;
public class MidTerm {

	public static void main(String[] args) {
		//Zander Dietz 12/19/2019
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		double budget = 0;
		double firstmeal = 0;
		double secondmeal = 0;
		double thirdmeal = 0;
		String firstname, lastname;
		System.out.print("Please enter your daily budget: ");
		while(!input.hasNextDouble()) {
			System.out.println("Error not an integar");
			System.out.print("Please enter your daily budget: ");
			input.next();
		}
		budget = input.nextDouble();
		System.out.print("What is your firstname?: ");
		firstname = input.next();
		System.out.print("What is your lastname?: ");
		lastname = input.next();
		System.out.println("Hello " + firstname + " " + lastname + "!");
		System.out.print("What did you spend on your first meal?: ");
		while(!input.hasNextDouble()) {
			System.out.println("Error not an integar");
			System.out.print("What did you spend on your first meal?: ");
			input.next();
		}
		firstmeal = input.nextDouble();
		budget = budget - firstmeal;
		System.out.println("You have " + (budget) + "$ left in your budget");
		System.out.print("What did you spend on your second meal?: ");
		while(!input.hasNextDouble()) {
			System.out.println("Error not an integar");
			System.out.print("What did you spend on your second meal?: ");
			input.next();
		}
		secondmeal = input.nextDouble();
		budget = budget - secondmeal;
		System.out.println("You have " + (budget) + "$ left in your budget");
		System.out.print("What did you spend on your third meal?: ");
		while(!input.hasNextDouble()) {
			System.out.println("Error not an integar");
			System.out.print("What did you spend on your third meal?: ");
			input.next();
		}
		thirdmeal = input.nextDouble();
		budget = budget - thirdmeal;
		System.out.println("You have " + (budget) + "$ left in your budget");
		System.out.println("You have spent a total of " + (firstmeal + secondmeal + thirdmeal) +"$");
		System.out.println("Your most expensive meal was " + Math.max(thirdmeal, (Math.max(firstmeal, secondmeal)))+ "$");
		System.out.println("Your cheapest meal was " + Math.min(thirdmeal, (Math.min(firstmeal, secondmeal)))+ "$");
		System.out.println("The average cost per meal was " + (firstmeal + secondmeal + thirdmeal)/3 + "$");
	}

}
