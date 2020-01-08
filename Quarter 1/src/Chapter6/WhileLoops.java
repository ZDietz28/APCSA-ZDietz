package Chapter6;
import java.util.Scanner;
public class WhileLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int posInt;
		System.out.print("Gimme a positive integar: ");
		posInt = input.nextInt();
		System.out.print("Squares less than " + posInt + " = ");
		for(int i = 0; (Math.pow(i, 2)) < posInt; i++) {
			System.out.print((int) Math.pow(i, 2) + " ");
		}
		System.out.println("");
		System.out.print("Tens less than " + posInt + " = ");
		for(int i = 10; i < posInt; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.print("Power of 2 less than " + posInt + " = ");
		for(int i = 0; Math.pow(2, i) < posInt; i++) {
			System.out.print((int) Math.pow(2, i) + " ");
		}
	}

}
