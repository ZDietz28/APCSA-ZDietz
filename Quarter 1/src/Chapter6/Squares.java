package Chapter6;
import java.util.Scanner;
public class Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int side;
		System.out.print("Enter side length: ");
		side = input.nextInt();
		for(int j = 0; j<2; j++) {
			for(int i = 0; i<side; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
		for(int j = 0; j< side-2; j++) {
			for(int i = 0; i<side; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.print("*");
			for(int i = 0; i< side-2; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int j = 0; j<2; j++) {
			for(int i = 0; i<side; i++) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}

}
