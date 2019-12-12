package Chapter5;
import java.util.Scanner;
public class FrenchPreFixes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String country;
		String vowels = ("aeiouAEIOUYy");
		System.out.println("Enter a country: ");
		country = input.nextLine();
		boolean flag = true;
		while(flag) {
			if(country.equals("Etats-Unis") || country.equals("Pays-bas")) {
				country = "les " + country;
				flag = false;
			}
			else if(vowels.contains(country.substring(0,1))) {
				country = "l'" + country;
				flag = false;
			}
			else if(country.substring(country.length()-1,country.length()).equals("e")) {
				if(country.equals("Belize") || country.equals("Cambodge") || country.equals("Mexique") || country.equals("Mozambique") || country.equals("Zaire") || country.equals("Zimbabwe")) {
					country = "le " + country;
					flag = false;
				} else {
					country = "la " + country;
					flag = false;
				}
			}else {
				country = "le " + country;
				flag = false;
			}
		}
		System.out.println(country);

	}
}
