package Chapter5;
import java.util.Scanner;
public class FindDistance {
	public static void main(String args[]) {
		
		int houseX, houseY, errand1X, errand1Y, errand2X, errand2Y;
		double errand1Dist, errand2Dist;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.printf("%-20s\n", "The house");
		System.out.printf("%-20s", "Enter X coordinate: ");
		houseX = input.nextInt();
		input.nextLine();
		System.out.printf("%-20s", "Enter Y coordinate: ");
		houseY = input.nextInt();
		input.nextLine();
		System.out.printf("%-20s\n", "Errand 1");
		System.out.printf("%-20s", "Enter X coordinate: ");
		errand1X = input.nextInt();
		input.nextLine();
		System.out.printf("%-20s", "Enter Y coordinate: ");
		errand1Y = input.nextInt();
		input.nextLine();
		System.out.printf("%-20s\n", "Errand 2");
		System.out.printf("%-20s", "Enter X coordinate: ");
		errand2X = input.nextInt();
		input.nextLine();
		System.out.printf("%-20s", "Enter Y coordinate: ");
		errand2Y = input.nextInt();
		input.nextLine();
		errand1Dist = Math.sqrt((Math.pow((((double) errand1X) - ((double) houseX)),2) + Math.pow((((double) errand1Y) - ((double) houseY)), 2)));
		System.out.printf("%-20s%3.1f\n", "Errand 1 distance = ", errand1Dist);
		errand2Dist = Math.sqrt((Math.pow((((double) errand2X) - ((double) houseX)),2) + Math.pow((((double) errand2Y) - ((double) houseY)), 2)));
		System.out.printf("%-20s%3.1f\n", "Errand 2 distance = ", errand2Dist);
		if(Math.abs(errand1Dist - errand2Dist) < 0.5) {
			result = "similar distances";
		}else if(errand1Dist > errand2Dist) {
			result = "Errand 1 is further";
		} else {
			result = "Errand 2 is further";
		}
		System.out.printf("%-20s%s", "Result = ", result);
	}
}
