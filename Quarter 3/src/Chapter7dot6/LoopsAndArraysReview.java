package Chapter7dot6;

import java.util.*;

public class LoopsAndArraysReview
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int progNum = 0;
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programZero(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programOne(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programTwo(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programThree(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programFour(in);
		System.out.println("*** Program " + progNum + " ***");
		progNum++;
		programFive(in);
	}



	private static void programZero(Scanner in){
		int num = 0;
		int integer = 0;
		do
		{
			System.out.print("Enter an int in the range [3,8]: "); //NOTE: When checking your program, be sure to check the boundary/edge cases - particulary the value 3 and 8
			//get the next number from scanner
			integer = in.nextInt();
			if(integer < 3)
			{
				System.out.println("Error - number is less than 3 \n");
			}
			else if(integer > 8)
			{
				System.out.println("Error - number is greater than 8 \n");
			}
		} while (integer < 3 || integer > 8); //FIX THIS
		System.out.println("Yay - " + num + " is in the range [3,8] \n");
	}


	
	private static void programOne(Scanner in){
		in.nextLine();
		String answer;
		boolean flag = true;
		do
		{
			System.out.print("Enter a string that does not contain the letter s: ");
			answer = in.nextLine();
			if(answer.contains("s"))
			{
				System.out.println("Error - string should not contain the letter 's' \n");
			} else {
				flag = false;
			}
		} while (flag);
		System.out.println("Yay - a string with no letter 's' \n");
	}



	private static void programTwo(Scanner in){
		System.out.println("Please enter four negative numbers below.");
		System.out.println("The sum of the negative numbers will be calculated and displayed.");
		int num;				//most recent number entered by user
		int sum = 0;			//sum of the negative numbers entered
		int numNegatives = 0; 	//number of negative numbers entered
		do
		{
			System.out.print("Enter int #" + (numNegatives + 1)+ ": ");
			//get the next number from scanner
			num = in.nextInt();
			if(num < 0)
			{
				sum = sum + num;
				numNegatives++;
			}
			else
			{
				System.out.println("Error - number is not negative\n");
			}
		} while (numNegatives < 4); //FIX THIS
		System.out.println("The sum of the negative number is: " + sum + "\n");
	}



	private static void programThree(Scanner in){
		in.nextLine();
		String answer = "";
		char lastCharacter;
		do
		{
			System.out.print("Enter a string that has length of at least 5 and the last letter is an s: ");
			answer = in.nextLine();
			lastCharacter = answer.charAt(answer.length()-1);
			if(answer.length() < 5 && lastCharacter != 's')
			{
				System.out.println("String is too short and the last letter is not an 's' \n");
			}
			else if(answer.length() < 5)
			{
				System.out.println("String is too short \n");
			}
			else if(lastCharacter != 's')
			{
				System.out.println("last letter is not an 's' \n");
			}
		} while (answer.length() < 4 || lastCharacter != 's'); 
		System.out.println("Yay - the length is " + answer.length() + " and last letter is an 's' \n");
	}



	private static void programFour(Scanner in){
		/*
		 * Fill in the code to print the Fibonacci sequence up to a stopping point
		 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc...
		 * The next number is found by adding up the two numbers before it.
		 * The 2 is found by adding the two numbers before it (1+1)
		 * The 3 is found by adding the two numbers before it (1+2),
		 * And the 5 is (2+3) and so on!
		 */
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		myArray.add(0);
		myArray.add(1);
		int stoppingPoint;
		// prompt for an integer to use as a stopping point
		System.out.print("Enter a stopping point: ");
		// while scanner does not have next int
		while(!in.hasNextInt())
		{
			System.out.println("Not an integer number");
			in.nextLine();
			System.out.print("Enter a stopping point: ");
		}
		stoppingPoint = in.nextInt();
		while(myArray.get(myArray.size()-1) < stoppingPoint)//last value of myArray is less than stoppingPoint)
		{
			myArray.add(myArray.get(myArray.size()-2) + myArray.get(myArray.size()-1));
			//add together the last two values of myArray add append the sum to the end of the list
		}
		System.out.print(myArray);
		System.out.println();
		//print myArray
	}



	private static void programFive(Scanner in){
		// Ask the user for several numbers or Q to quit. Then calculate the average of their numbers.
		int count = 0;
		int sum = 0;
		//while true // repeat until the use types Q then break
		while(true)
		{
			// prompt for an integer or Q to quit.
			System.out.println("Please enter an integer or Q to quit");
			//if ??? // if the scanner has next int
			if(in.hasNextInt())
			{
				sum += in.nextInt();
				count++;
				in.nextLine();
				
			}
			//else if ??// the scanner's next line is Q
			else if(in.hasNextLine() && in.nextLine().equals("Q"))
			{
				//exit the loop
				break;
			}
			//else
			else
			{
				System.out.println("Not an integer number");
				// print "Not an integer number"
				in.nextLine(); // throw away everything currently in the scanner
			}
		}
		if(count > 0)
		{
			// calculate and print average
			System.out.println("Average: " + (sum/count));
		}
	}
}
