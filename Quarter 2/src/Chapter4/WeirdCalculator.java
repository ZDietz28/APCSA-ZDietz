package Chapter4;
import java.util.Scanner;
import java.lang.Math;
public class WeirdCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.printf("%s", "What is the first number?: ");
		n1 = input.nextInt();
		System.out.printf("%s", "What is the second number?: ");
		n2 = input.nextInt();
			
		System.out.printf("%-12s%4d\n", "Sum: ",n1+n2);
		System.out.printf("%-12s%4d\n", "Difference: ", n1-n2);
		System.out.printf("%-12s%4d\n", "Product: ", n1*n2);
		System.out.printf("%-12s%9.4f\n", "Average: ", (double) (((double)n1+n2)/2.0));
		System.out.printf("%-12s%4d\n", "Range: ", Math.abs(n1-n2));
		System.out.printf("%-12s%4d\n", "Maximum: ", Math.max(n1, n2));
		System.out.printf("%-12s%4d\n", "Minimum: ", Math.min(n1, n2));
	}

}
