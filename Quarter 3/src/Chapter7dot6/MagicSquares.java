package Chapter7dot6;

import java.util.ArrayList;

public class MagicSquares {

	public static void main(String[] args) {
		int[][] square = {{2,7,6},{9,5,1},{4,3,8}};
		ArrayList<Integer> magic = new ArrayList<Integer>();
		for(int i = 0; i < square.length; i ++) {
			for(int j = 0; j < square.length; j++) {
				System.out.print(square[i][j] + "   ");
			}
			System.out.println();
			System.out.println();
		}
		for(int i = 0; i < square.length; i++) {
			int sum = 0;
			for(int j = 0; j < square.length; j++) {
				sum += square[i][j];
			}
			magic.add(sum);
		}
		for(int i = 0; i < square.length; i++) {
			int sum = 0;
			for(int j = 0; j < square.length; j++) {
				sum += square[j][i];
			}
			magic.add(sum);
		}
		int sum = 0;
		for(int i = 0; i < square.length; i++) {
			sum += square[i][i];
		}
		magic.add(sum);
		sum = 0;
		for(int i = 2; i > -1; i--) {
			sum += square[i][i];
		}
		magic.add(sum);
		sum = 0;
		for(int i = 0; i < magic.size(); i++) {
			if(magic.get(i) == magic.get(0)) {
				sum ++;
			}
		}
		for(int i = 0; i < square.length; i++) {
			System.out.println("Row " + i + ": " + magic.get(i));
		}
		for(int i = 0; i < square.length; i++) {
			System.out.println("Col " + i + ": " + magic.get(i + square.length));
		}
		System.out.println("NW-SE: " + magic.get(square.length*2));
		System.out.println("SW-NE: " + magic.get((square.length*2) + 1));
		System.out.println();
		if(sum == (square.length + square.length + 2)) {
			System.out.println("Square is magic");
		} else {
			System.out.println("Square is not magic");
		}
		System.out.println();
		
	}

}
