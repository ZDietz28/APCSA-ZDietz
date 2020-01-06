package Chapter7;
import java.util.Scanner;
import java.util.Random;
public class PokerDice {

	public static void main(String[] args) {
		int[] dice = new int[5];
		Scanner input = new Scanner(System.in);
		do {
			rollDice(dice);
			while(true) {
				
				System.out.println("Your current dice: " + diceToString(dice));
				System.out.println("Select a die to re-roll (-1 to keep remaining dice): ");
				promptForReroll(dice, input);
				break;
			}
			rollDice(dice);
			System.out.println("Your current dice: " + diceToString(dice));
		} while(promptForPlayAgain(input));
	}
	
	// Given an array of integers as input, sets every element of the array to zero.
	private static void resetDice(int[] dice) {
		for(int i = 0; i < dice.length; i++) {
			dice[i] = 0;
		}
	}
	
	// Given an array of integers as input, checks each element of the array.  If the value
	// of that element is zero, generate a number between 1 and 10 and replace the zero with
	// it.  Otherwise, leave it as is and move to the next element.
	private static void rollDice(int[] dice) {
		// Fill in the body
		for(int i = 0; i < dice.length; i++) {
			if(dice[i] == 0) {
				Random generator = new Random();
				dice[i] = generator.nextInt(6) + 1;
			}
		}
	}
	
	// Given an array of integers as input, create a formatted String that contains the
	// values in the array in the order they appear in the array.  For example, if the 
	// array contains the values [0, 3, 7, 5, 2] then the String returned by this method
	// should be "0 3 7 5 2".
	private static String diceToString(int[] dice) {
		String holder = "";
		for(int i = 0; i < dice.length; i++) {
			holder += dice[i] + " ";
		}
		return holder;
		// Fill in the body
		
	}
	
	
	// Given an array of integers and a Scanner as input, prompt the user with a message
	// to indicate which dice should be re-rolled.  If the user enters a valid index (between
	// 0 and the total number of dice -1) then set the die at that index to zero.  If the 
	// user enters a -1, end the loop and return to the calling program.  If the user enters
	// any other invalid index, provide an error message and ask again for a valid index.
	private static void promptForReroll(int[] dice, Scanner inScanner) {
		do {
			//boolean flag = true;
			//while(flag) {
			int reroll = inScanner.nextInt();
			if(reroll > 0 && reroll < 6) {
				dice[reroll-1] = 0;
				
			} else if (reroll == -1) {
				//flag = true;
				break;
			} else {
				System.out.println("Please enter a number between 1 and 5 or -1 to not reroll any");
			}
			//}
			//break;
			System.out.println("Select a die to re-roll (-1 to keep remaining dice): ");
			System.out.println("Your current dice: " + diceToString(dice));
		} while(inScanner.hasNextInt());
	}
	
	// Given a Scanner as input, prompt the user to play again.  The only valid entries
	// from the user are 'Y' or 'N', in either upper or lower case.  If the user enters
	// a 'Y' the method should return a value of true to the calling program.  If the user
	// enters a 'N' the method should return a value of false.  If the user enters anything
	// other than Y or N (including an empty line), an error message should be displayed
	// and the user should be prompted again until a valid response is received.
	private static boolean promptForPlayAgain(Scanner inScanner) {
		do {
			System.out.println("Would you like to play again? (\"Y\" or \"N\")");
			String answer = inScanner.next();
			if(answer.equals("Y") || answer.equals("y")) {
				return true;
			} else if (answer.equals("N") || answer.equals("n")) {
				return false;
			} else {
				System.out.println("Please enter \"Y\" or \"N\"");
			}
			
		}
		while(true);
		
		// Fill in body
	}
	
	// Given an array of integers, determines the result as a hand of Poker Dice.  The
	// result is determined as:
	//	* Five of a kind - all five integers in the array have the same value
	//	* Four of a kind - four of the five integers in the array have the same value
	//	* Full House - three integers in the array have the same value, and the remaining two
	//					integers have the same value as well (Three of a kind and a pair)
	//	* Three of a kind - three integers in the array have the same value
	//	* Two pair - two integers in the array have the same value, and two other integers
	//					in the array have the same value
	//	* One pair - two integers in the array have the same value
	//	* Highest value - if none of the above hold true, the Highest Value in the array
	//						is used to determine the result
	//
	//	The method should evaluate the array and return back to the calling program a String
	//  containing the score from the array of dice.
	//
	//  EXTRA CHALLENGE: Include in your scoring a Straight, which is 5 numbers in sequence
	//		[1,2,3,4,5] or [2,3,4,5,6] or [3,4,5,6,7] etc..
	private static String getResult(int[] dice) {
		return null;
		// Fill in the body
	}
	
	// Given an array of integers as input, return back an array with the counts of the
	// individual values in it.  You may assume that all elements in the array will have 
	// a value between 1 and 10.  For example, if the array passed into the method were:
	//   [1, 2, 3, 3, 7]
	// Then the array of counts returned back by this method would be:
	// [1, 1, 2, 0, 0, 0, 1, 0, 0, 0]
	// (Where index 0 holds the counts of the value 1, index 1 holds the counts of the value
	//  2, index 2 holds the counts of the value 3, etc.)
	// HINT:  This method is very useful for determining the score of a particular hand
	//  of poker dice.  Use it as a helper method for the getResult() method above.
	private static int[] getCounts(int[] dice) {
		return dice;
		// Fill in the body
	}
	



}
