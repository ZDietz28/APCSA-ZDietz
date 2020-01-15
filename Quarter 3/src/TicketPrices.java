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
		PrintSeats(seats);
		System.out.println();
		System.out.print("How many tickets you buyin': ");
		tickets = input.nextInt();
		int price = 0;
		for(int i = 0; i < tickets; i++) {
			int numb = 0;
			boolean flag = false;
			while(!flag) {
				System.out.println("Enter the row and column for your seat choice: ");
				System.out.print("Row: ");
				row = input.nextInt();
				System.out.print("Col: ");
				col = input.nextInt();
				if(!CheckSeat(row,col,seats)) {
					System.out.println("That seat is not available");
				} else {
					System.out.println("Seat got");
					price += PriceSeat(row,col,seats);
					flag = true;
					
				}
			}
		}
		PrintSeats(seats);
		System.out.println("Number Tickets Sold: " + tickets);
		System.out.print("Amount Due: $");
		System.out.println(price);
	}
	public static boolean CheckSeat(int row, int col, int[][] seats) {
		if(seats[row][col] == 0) {
			return false;
		} else {
			return true;
		}
		
	}
	public static int PriceSeat(int row, int col, int[][] seats) {
		int price = 0;
		if(CheckSeat(row, col, seats)) {
			price = seats[row][col];
			seats[row][col] = 0;
			return price;
		} else {
			return 0;
		}
	}
	public static void PrintSeats(int[][] seats) {
		for(int i = 0; i < seats.length; i++) {
			System.out.printf("%s%d%s","Row ", (i+1),": ");
			for(int j = 0; j < seats.length+1; j++) {
				System.out.printf("%4d%2s",seats[i][j] + "  ");
			}
	
			System.out.println();
		}
	}

}
