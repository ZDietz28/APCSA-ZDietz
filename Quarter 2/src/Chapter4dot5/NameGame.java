package Chapter4dot5;
import java.util.Scanner;
import java.util.Random;
public class NameGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		String name, lastname;
		int counter = 0;
		System.out.print("Please enter your name: ");
		name = input.next();
		System.out.println("Hello " + name + "!");
		System.out.println("Your name is " + (name.length()) + " letters long");
		if(name.charAt(0) == 'a' || name.charAt(0) == 'A' || name.charAt(0) == 'e' || name.charAt(0) == 'E' || name.charAt(0) == 'o' || name.charAt(0) == 'O' || name.charAt(0) == 'i' || name.charAt(0) == 'I' || name.charAt(0) == 'u' || name.charAt(0) == 'U'  ) {
			System.out.println("The first letter of your name is an " + name.charAt(0));
		} else {
			System.out.println("The first letter of your name is a " + name.charAt(0));
		}
		System.out.println("The letter " + (name.charAt(name.length()/2)) + " is at the center of your name");
		System.out.println("The letter " + name.charAt(name.length()-1) + " is the last letter of your name");
		System.out.println("Goodbye " + name + "!");
		System.out.print("Please enter your last name: ");
		lastname = input.next();
		while(counter < 5) {
			System.out.print((name.substring(0,generator.nextInt(name.length()+1)) + lastname).toLowerCase() + generator.nextInt(10) + ", ");
			counter ++;
		}
		counter = 0;
		while(counter < 5) {
			System.out.print((lastname.substring(0,generator.nextInt(lastname.length()+1)) + name).toLowerCase() + generator.nextInt(100) + ", ");
			counter ++;
		}
		System.out.println("");
		if(lastname.charAt(0) > 64 && lastname.charAt(0) < 91 ) {
			
		}
		//System.out.println((lastname.charAt(0) + 1) + name.substring(1,name.length()) + (lastname.charAt(0) + 1) + lastname.substring(1,lastname.length()));
		System.out.println(lastname.substring(0,(findFirstVowel(lastname))) + name.substring((findFirstVowel(name)), name.length()) + name.substring(0,(findFirstVowel(name))) + lastname.substring((findFirstVowel(lastname)), lastname.length()));
		System.out.println("");
		if(name.charAt(0) == 'b' || name.charAt(0) == 'B') {
			System.out.println(name + " " + name + " bo-" + getVowelName(name));
		} else {
			System.out.println(name + " " + name + " bo-b" + getVowelName(name));
		}
		if(name.charAt(0) == 'f' || name.charAt(0) == 'F') {
			System.out.println("Bonana-fanna fo-" + getVowelName(name));
		} else {
			System.out.println("Bonana-fanna fo-f" + getVowelName(name));
		}
		if(name.charAt(0) == 'm' || name.charAt(0) == 'M') {
			System.out.println("Fee fi mo-" + getVowelName(name));
		} else {
			System.out.println("Fee fi mo-m" + getVowelName(name));
			System.out.println(name + "!");
		}
		
	}
	public static int findFirstVowel(String word) {
		int counter = 0;
		int value = 0;
		String vowels = "aeiouyAEIOUY";
		while(counter < word.length()) {
			if(vowels.contains(word.substring(counter,counter+1))) {
				value = counter;
				return value;
			} 
			counter ++;
			
		}
		return word.length();
	}
	public static String getVowelName(String word) {
		return word.substring(findFirstVowel(word), word.length());
	}
}
