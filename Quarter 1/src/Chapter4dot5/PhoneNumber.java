package Chapter4dot5;
import java.util.Scanner;
import java.lang.String;
public class PhoneNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String phoneNumber = "";
		boolean pass = false;
		while(pass == false) {
			System.out.printf("%s", "Please enter a phone number: ");
			phoneNumber = input.next();
			//phoneNumber = phoneNumber.toString();
			if(phoneNumber.length() == 10) {
				System.out.printf("%s\n", phoneNumber);
				phoneNumber = "(" + phoneNumber.substring(0,3) + ") " + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6,10);
				pass = true;
			} else if (phoneNumber.compareTo("911") == 0){
				phoneNumber = "911 what is your emergency?";
				pass = true;
			}	
			else {
				System.out.printf("%s\n", "Error!");
			}
		}
		System.out.printf("%s\n",phoneNumber);
	}

}
