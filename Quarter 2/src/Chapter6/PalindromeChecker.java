package Chapter6;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		boolean flag = true;
		boolean flag2 = true;
		Scanner input = new Scanner(System.in);
		String str;
		while(flag) {
			System.out.print("Enter a string: ");
			str = input.nextLine();
			for(int i = 0; i<(str.length()/2); i++) {
				if(str.charAt(i) != str.charAt(str.length()-(i+1))) {
					flag2 = false;
				}else {
					flag2 = true;
				}
			}
			if(!flag2) {
				System.out.println(str + " is not a palindrome");
				flag2 = true;
			}
			else if(str.equals("")) {
				System.out.println("Goodbye!");
				flag = false;
				
			}
			else {
				System.out.println(str + " is a plaindrome");
			}
			
		}
	}

}
