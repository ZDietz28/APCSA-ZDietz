package Chapter5;
import java.util.Scanner;
public class ErrorTraps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter = null;
		String vowels = "aeiouyAEIOUY";
		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean flag = true;
		while(flag) {
			System.out.println("Please enter a letter: ");
			letter = input.nextLine();
			if(letter.length() <= 0) {
				System.out.println("Please enter a string");
			}else if(letter.length() >1) {
				System.out.println("Please enter only 1 letter");
			}else if(letters.contains(letter) == false) {
				System.out.println("no numbers");
			}else {
				flag = false;
			}
		}
		if(vowels.contains(letter)) {
			System.out.println("Vowel");
		}else {
			System.out.println("Consonant");
		}
	}

}
