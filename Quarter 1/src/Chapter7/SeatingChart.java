package Chapter7;
import java.util.Scanner;
public class SeatingChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int seatNumb;
		System.out.print("How many seats your want?: ");
		seatNumb = input.nextInt();
		boolean[] seats = new boolean[seatNumb];
		for(int i = 0; i < seatNumb; i++) {
			seats[i] = false;
		}
		printArray(seats);
		System.out.print(findSeat(seats));
	}
	private static int findSeat(boolean[] seats) {
		int longest;
		int longestLength;
		int startCurrentLongest = 0;
		int currentLongest = 0;
		boolean flag = true;
		for(int i = 0; i < seats.length; i++) {
			if(!seats[i]) {
				longestLength = 0;
				longest = i;
				for(int j = 0; j < seats.length; j++) {
					if(!seats[longest + j]) {
						longestLength++;
					}else {
						if(longestLength < currentLongest) {
							currentLongest = longestLength;
							startCurrentLongest = longest;
						}
						j = seats.length;
					}
				}
			}
		}
		return startCurrentLongest + ((currentLongest -1)/2);
	}
	private static void printArray(boolean[] seats) {
		for(int i = 0; i < seats.length; i++) {
			if(!seats[i]) {
				System.out.print("-");
			}else {
				System.out.print("X");
			}
		}
	}
}