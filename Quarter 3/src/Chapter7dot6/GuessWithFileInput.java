package Chapter7dot6;

/*
 * GuessWithFileInput.java
 *
 *   A program that plays simple word guessing game.  In this game the user provides a list of
 *   words to the program.  The program randomly selects one of the words to be guessed from
 *   this list.  The player then guesses letters in an attempt to figure out what the hidden
 *   word might be.  The number of guesses that the user takes are tracked and reported at the
 *   end of the game.
 *
 *   See the write-up for GuessWithFileInput for more details.
 *
 * @author ENTER YOUR NAME HERE
 *
 */
import java.util.*;
import java.io.File;


public class GuessWithFileInput {


	public static void main(String[] args) throws Exception {
		// COMPLETE THE HELPER METHODS BELOW then fill in the main method
		File file = new File("C:\\Users\\871265\\eclipse-workspace\\APCSA-ZDietz\\Quarter 3\\src\\Chapter7dot6\\Fruits.txt");
		Scanner inFile = new Scanner(file);
		Scanner input = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		while(inFile.hasNextLine()) {
			words.add(inFile.nextLine());
			//get the last word
			String temp = words.get(words.size()-1);
			//substring index 1 to length-2
			temp = temp.substring(1, temp.length()-2);
			//set the last word to new substring
			words.set(words.size()-1, temp);
		}
		
		String[][] fruits = makeTwoDimList(words);
		for(int i = 0; i < 3; i++) {
			for(String word:fruits[i]) {
				System.out.print(word + ", ");
			}
			System.out.println();
		}
		// Use the getList method to use the inFile Scanner and create an ArrayList of all words
		// Use the makeTwoDimList method to take the ArrayList of all words and sort it into a 2D array String[][]
		// For example, the sorted 2D array might look like...
		// [[apple, cat, dog], [asteroid, bananas, crossbow], [ballerina, magnesium, phosphorus]]
		// There are three levels, so repeat three times
			// Print the level number
			// Use the getRandomWord method to take the current level's array (within the 2D array) and get a random word
			// Convert the random word to lowercase
			// Use the starWord method to take the random word and get a star string. For example, "***"
			// While true
				// Print the star string
				// Use the getCharacterGuess method to prompt for a guess
				// If the checkChar method returns 0, then continue back to the top of the While loop
				// Use the modifyGuess method to update the star string
				// If the checkWord method returns that the star string is equal to the random word, then break and end this level
	}


	// Given a Scanner as input, returns a List<String> of strings read from the Scanner.
	// The method should read words from the Scanner until there are no more words in the file
	// (i.e. inScanner.hasNext() is false).  The list of strings should be returned to the calling program.
	public static ArrayList<String> getList(Scanner inScanner) {
		// Fill in the body
		ArrayList<String> list = new ArrayList<String>();
		return list;
	}
	public static String[][] makeTwoDimList(ArrayList<String> allWords){
		ArrayList<String> levelZero = new ArrayList<String>();
		ArrayList<String> levelOne = new ArrayList<String>();
		ArrayList<String> levelTwo = new ArrayList<String>();
		for(int i = 0; i < allWords.size(); i++) {
			String word = allWords.get(i);
			if(word.length() < 7) {
				levelZero.add(word);
			} else if(word.length() > 6 && word.length() < 11) {
				levelOne.add(word);
			} else if(word.length() > 10) {
				levelTwo.add(word);
			}
		}
		
		String[][] twoDimList = new String[3][];
		twoDimList[0] = new String[levelZero.size()];
		twoDimList[1] = new String[levelOne.size()];
		twoDimList[2] = new String[levelTwo.size()];

		for(int col = 0; col < twoDimList[0].length; col ++) {
			twoDimList[0][col] = levelZero.get(col);
		}

		for(int col = 0; col < twoDimList[1].length; col ++) {
			twoDimList[1][col] = levelOne.get(col);
		}
		for(int col = 0; col < twoDimList[2].length; col ++) {
			twoDimList[2][col] = levelTwo.get(col);
		}
		return twoDimList;
	}

	// Given two strings as input, compares if the first string (guess) equals the second
	// string (solution).  If the two strings are not exactly the same,
	// return false.  Otherwise return true.
	public static boolean checkWord(String guess, String solution) {
		// Fill in the body
	}


	// Given a String[] of strings as input, randomly selects one of the strings
	// in the list and returns it to the calling program.
	public static String getRandomWord(String[] inList) {
		// Fill in the body
	}


	// Given a Scanner as input, prompt the user to enter a character.  If the character
	// enters anything other than a single character provide an error message and ask
	// the user to input a single character.  Otherwise return the single character to
	// the calling program.
	public static char getCharacterGuess(Scanner inScanner) {
		// Fill in the body
	}

	// Given a String, return a String that is the exact same length but consists of
	// nothing but '*' characters.  For example, given the String DOG as input, return
	// the string ***
	public static String starWord(String inWord) {
		// Fill in the body
	}

	// Given a character and a String, return the count of the number of times the
	// character occurs in that String.
	public static int checkChar(char guessChar, String guessWord) {
		// Fill in the body
	}

	// Given a character, a String containing a word, and a String containing a 'starred'
	// version of that word, return a new String that is a modified version of the 'starred'
	// string where characters equal to the character inChar are uncovered.
	// For example, given the following call:
	//   modfiyGuess('G',"GEOLOGY", "**O*O*Y")
	// This functions should return the String "G*O*OGY".
	public static String modifyGuess(char inChar, String word, String starredWord) {
		// Fill in the body
	}
}
