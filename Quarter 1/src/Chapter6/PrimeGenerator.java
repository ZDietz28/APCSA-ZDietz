package Chapter6;
/**
This class generates all prime numbers.
*/
public class PrimeGenerator {
// declare your counter instance variable
	public PrimeGenerator() {
	}

/**
	 Checks to see if a given number is prime.
@param n an integer that may or may not be prime
	 @return true or false
*/
	public static boolean isPrime(int n){
		for(int i = 1; i < n; i++) {
			if(n%i != 0)
				return false;
		}
		return true;
	}

/**
   Calculates the next prime number using the isPrime method.
   @return the next prime number
*/
	public int nextPrime(int numb, int upper){
		for(int i = numb; i<=upper; i++) {
			if(isPrime(i)) {
				return(i);
			}
		}
		return(upper);
	}
}

