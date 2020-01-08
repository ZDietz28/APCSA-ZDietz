package Chapter5;
import java.util.Scanner;
public class SingleDigitRomanNumerals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		String returnVal = "";
		boolean flag = true;
		while(flag) {
			System.out.print("Enter a single digit number that is not 0: ");
			number = input.nextInt();
			if(number < 10 && number > 0) {
				switch (number) {
//					case 3:
//						returnVal += "I";
//					case 2:
//						returnVal += "I";
//					case 1:
//						returnVal += "I";
//						break;
					case 1: 
						returnVal = "I";
						break;
					case 2: 
						returnVal = "II";
						break;
					case 3: 
						returnVal = "III";
						break;
					case 4: 
						returnVal = "IV";
						break;
					case 5: 
						returnVal = "V";
						break;
					case 6: 
						returnVal = "VI";
						break;
					case 7: 
						returnVal = "VII";
						break;
					case 8: 
						returnVal = "VIII";
						break;
					case 9: 
						returnVal = "IX";
						break;
				}
				flag = false;
			}else {
				System.out.println("Enter a valid number");
			}
		}
		System.out.println("Roman Numeral " + returnVal);
	}
}
