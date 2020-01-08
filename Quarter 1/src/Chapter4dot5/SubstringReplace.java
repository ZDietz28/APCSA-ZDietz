package Chapter4dot5;
import java.util.Scanner;
public class SubstringReplace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str, subStr = null, replaceString;
		int carAt = 45;
		System.out.printf("%-30s", "Enter a long string: ");
		str = input.nextLine();
		
		boolean flag = true;
		while(flag) {
			System.out.printf("%-30s", "Enter a substring: ");
			subStr = input.nextLine();
			if(checkSub(subStr, str)) {
				flag = false;
			} else {
				System.out.println("");
				System.out.printf("%-50s", "SubString not part of string");
			}
		}
		System.out.printf("%-30s%2d\n", "Length of long string: ", str.length());
		System.out.printf("%-30s%2d\n", "Length of short string: ", subStr.length());
		System.out.printf("%-30s%2d\n", "Start position of substring: ", str.indexOf(subStr));
		System.out.printf("%-30s%s\n", "Before the substring was: ", str.substring(0,str.indexOf(subStr)));
		System.out.printf("%-30s%s\n", "After the substring was: ", str.substring(str.indexOf(subStr)+subStr.length(), str.length()));
		flag = true;
		while(flag) {
			System.out.print("Enter a position between 0 and " + (str.length()-1) + ": ");
			carAt = input.nextInt();
			input.nextLine();
			//Consumes next line character
			if(carAt >= 0 && carAt <= str.length()-1) {
				flag = false;
			} else if(carAt < 0){
				System.out.println("Position to small");
			} else {
				System.out.println("Position to big");
			}
		}
		System.out.printf("%-30s", "Character at position " + carAt);
		System.out.printf("%-5c\n", str.charAt(carAt));
		System.out.printf("%-30s", "Enter a replacement string: ");
		replaceString = input.nextLine();
		System.out.println("You new string is " + str.replace(subStr, replaceString));
	}
		public static boolean checkSub(String subString, String longString) {
			if(longString.contains(subString)) {
				return true;
			} else {
				return false;
			}
	}

}
