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
		//printArray(seats);
		//seats[findSeat(seats)] = true;
		//System.out.println();
		//printArray(seats);
		for(int i = 0; i < seats.length+1; i++) {
			printArray(seats);
			seats[findSeat(seats)] = true;
			System.out.println();
		}
	}
	private static int findSeat(boolean[] seats) {
		int longest;
		int longestLength;
		int startCurrentLongest = 0;
		int currentLongest = 0;
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == false) {
				longestLength = 0;
				longest = i;
				for(int j = 0; j+i < seats.length; j++) {
					//System.out.println("i = " + i + " j = " + j);
					if(seats[i + j] == false) {
						longestLength++;
						//System.out.println(longestLength);
						if(longestLength > currentLongest) {
							//System.out.println("aoefg");
							currentLongest = longestLength;
							startCurrentLongest = longest;
							//System.out.println(currentLongest + " " + startCurrentLongest);
						} //else {
							//System.out.println(currentLongest + " " + startCurrentLongest);
						//}
					} else {
						j = seats.length;
					}
				}
			}
		}
		//System.out.println();
		//System.out.println("Start " + startCurrentLongest + " Length " + currentLongest);
		return startCurrentLongest + ((currentLongest)/2);
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