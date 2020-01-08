package Chapter2;
import java.lang.StringBuilder;
import java.util.Scanner;
public class StringExercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myStr = "Hello";
		System.out.println(myStr);
		System.out.println(myStr.toUpperCase());
		System.out.println(myStr.replaceAll(myStr, "hello"));
		String miss = "Mississippi";
		System.out.println(miss);
		miss = miss.replace("i", "ii");
		System.out.println(miss);
		miss = miss.replace("ss", "s");
		System.out.println(miss);
		System.out.println("Please enter a string to reverse: ");
		StringBuilder reverse = new StringBuilder(input.next());
		System.out.println(reverse.reverse());
	}

}
