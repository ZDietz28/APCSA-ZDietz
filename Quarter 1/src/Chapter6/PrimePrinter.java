package Chapter6;
import java.util.Scanner;

/**
   This class prints prime numbers.
*/
public class PrimePrinter
{
   public static void main (String[] args)
   {
	   int upper;
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter upper limit: ");
	   upper = input.nextInt();
	   boolean flag = true;
	   while(flag) {
		   for(int i = 1; i < upper; i++) {
			   if(isPrime(i)) {
				   System.out.println(i);
			   }
		   }
		   flag = false;
	   }
   }
   public static boolean isPrime(int n){
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				//System.out.println("j");
				return false;
		}
		//System.out.println("k");
		return true;
	}
}
