package Chapter5;
import java.util.Scanner;
public class FourDigitRomanNumerals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numb = 0;
		String returnNumb = "";
		System.out.println("Please enter a 4 digit number less than or equal to 3,999: ");
		numb = input.nextInt();
		if(numb > 999 && numb < 2000) {
			returnNumb += "M";
			numb -= 1000;
		}else if(numb > 1999 && numb < 3000) {
			returnNumb += "MM";
			numb -= 2000;
		}else if (numb > 2999 && numb < 4000) {
			returnNumb += "MMM";
			numb -= 3000;
		}
		switch (numb/100) {
			case 1: 
				returnNumb += "C";
				numb -= 100;
				break;
			case 2: 
				returnNumb += "CC";
				numb -= 200;
				break;
			case 3: 
				returnNumb += "CCC";
				numb -= 300;
				break;
			case 4: 
				returnNumb += "CD";
				numb -= 400;
				break;
			case 5: 
				returnNumb += "D";
				numb -= 500;
				break;
			case 6: 
				returnNumb += "DC";
				numb -= 600;
				break;
			case 7: 
				returnNumb += "DCC";
				numb -= 700;
				break;
			case 8: 
				returnNumb += "DCCC";
				numb -= 800;
				break;
			case 9: 
				numb -= 900;
				returnNumb += "CM";
				break;
		}
		switch (numb/10) {
		case 1: 
			returnNumb += "X";
			numb -= 10;
			break;
		case 2: 
			returnNumb += "XX";
			numb -= 20;
			break;
		case 3: 
			returnNumb += "XXX";
			numb -= 30;
			break;
		case 4: 
			returnNumb += "XL";
			numb -= 40;
			break;
		case 5: 
			returnNumb += "L";
			numb -= 50;
			break;
		case 6: 
			returnNumb += "LX";
			numb -= 60;
			break;
		case 7: 
			returnNumb += "LXX";
			numb -= 70;
			break;
		case 8: 
			returnNumb += "LXXX";
			numb -= 80;
			break;
		case 9: 
			returnNumb += "XC";
			numb -= 90;
			break;
	}
		switch (numb) {
		case 1: 
			returnNumb += "I";
			numb -= 1;
			break;
		case 2: 
			returnNumb += "II";
			numb -= 2;
			break;
		case 3: 
			returnNumb += "III";
			numb -= 3;
			break;
		case 4: 
			returnNumb += "IV";
			numb -= 4;
			break;
		case 5: 
			returnNumb += "V";
			numb -= 5;
			break;
		case 6: 
			returnNumb += "VI";
			numb -= 6;
			break;
		case 7: 
			returnNumb += "VII";
			numb -= 7;
			break;
		case 8: 
			returnNumb += "VIII";
			numb -= 8;
			break;
		case 9: 
			returnNumb += "IX";
			numb -= 9;
			break;
	}
		System.out.println(returnNumb);
	}

}
