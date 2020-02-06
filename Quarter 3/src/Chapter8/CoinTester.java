package Chapter8;
import java.util.Scanner;
public class CoinTester {

	public static void main(String[] args) {
		/*  Prompt the user for the number of coin flips.
		Flip the count the designated number of times - displaying the number of the coin flip and the result
		Display the number of coin heads and number of tails!

		How many flips would you like? 4
		1. heads
		2. tails
		3. heads
		4. heads

		The results:
		3 heads - 75.0%
		1 tails - 25.0%
		*/
		
		Scanner input = new Scanner(System.in);
		Coin coin = new Coin("quarter", 1985);
		System.out.print("How many flips would you like?: ");
		int flips = input.nextInt();
		int heads = 0;
		int tails = 0;
		for(int i = 0; i < flips; i++) {
			String flip = coin.flip();
			if(flip.equals("heads")) {
				heads ++;
			} else {
				tails ++;
			}
			System.out.println((i+1) + ". " + flip);
		}
		System.out.println("The results: ");
		System.out.println(heads + " heads - " + (((double) heads / flips) * 100) + "%");
		System.out.println(tails + " tails - " + (((double) tails / flips) * 100) + "%");
	}

}
