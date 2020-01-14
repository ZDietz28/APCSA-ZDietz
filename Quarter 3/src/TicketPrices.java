import java.util.Scanner;
public class TicketPrices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tickets = 0;
		int row = 0;
		int col = 0;
		int[][] seats = new int[9][10];
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats.length+1; j++) {
				if(i<3) {
				seats[i][j] = 10;
				} else if(i> 2 && i < 6) {
					if(j < 2 || j>7) {
						seats[i][j] = 10;
					} else {
						seats[i][j] = 20;
					}
				}else {
					if(i == 6) {
						if(j < 2 || j>7) {
							seats[i][j] = 20;
						} else if((j> 1 && j < 4) || (j>5 && j < 8)) {
							seats[i][j] = 30;
						} else {
							seats[i][j] = 40;
						}
					} else if(i == 7) {
						if(j<1 || j > 8) {
							seats[i][j] = 20;
						} else if((j>0 && j < 3) || (j>6 && j<9)) {
							seats[i][j] = 30;
						} else if((j>2 && j<4) || (j>5 && j<7)){
							seats[i][j] = 40;
						} else {
							seats[i][j] = 50;
						}
					} else {
						if((j < 1) || j>8) {
							seats[i][j] = 30;
						} else if((j>0 && j<3) || (j>6 && j<9)){
							seats[i][j] = 40;
						} else {
							seats[i][j] = 50;
						}
					}
				}
			}
		}
		for(int i = 0; i < seats.length; i++) {
			System.out.print("Row " + (i+1) + ": ");
			for(int j = 0; j < seats.length+1; j++) {
				System.out.print(seats[i][j] + "  ");
			}
		
			System.out.println();
		}
		System.out.println();
		System.out.print("How many tickets you buyin': ");
		tickets = input.nextInt();
		for(int i = 0; i < tickets; i++) {
			System.out.println("Enter the row and column for your seat choice: ");
			System.out.print("Row: ");
			row = input.nextInt();
			System.out.print("Col: ");
			col = input.nextInt();
			if(CheckSeat(row, col, seats) == 0) {
				
			}
		}
	}
	public static int CheckSeat(int row, int col, int[][] seats) {
		if(seats[row][col] == 0) {
			return 0;
		} else {
			return seats[row][col];
		}
		
	}

}
