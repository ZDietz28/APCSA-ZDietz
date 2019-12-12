package Chapter7;
import java.util.Random;
public class ArrayManipulation {

	public static void main(String[] args) {
		Random generator = new Random();
		int sum = 0;
		int[] temp = new int[10];
		int[] arr = new int[10];
		System.out.print("Initial array = ");
		for(int i = 0; i <10; i++) {
			arr[i] = generator.nextInt(99) + 1;
			System.out.print(arr[i] + " ");
		}
		int minVal = arr[0];
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			minVal = Math.min(minVal, arr[i]);
			sum += arr[i];
		}
		System.out.println("Min value = " + minVal + "\nSum = " + sum + "\nSum except for smallest value = " + (sum-minVal));
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr[0] = temp[temp.length-1];
		for(int i = 1; i < arr.length; i++) {
			arr[i] = temp[i-1];
		}
		
		System.out.print("Shifted Array = ");
		for(int e: arr) {
			System.out.print(e + " ");
		}
		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % 2) == 0) {
				arr[i] = 0;
			}
		}
		System.out.println();
		System.out.print("Evan values replaced = ");
		for(int e: arr) {
			System.out.print(e + " ");
		}
	}

}
