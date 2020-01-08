package Chapter1;
import java.util.concurrent.ThreadLocalRandom;
class IntegarOverflow{

	public static void main(String[] args){
		System.out.println("Integer Overflow Practice");
		System.out.println("Given that we are working in a language where the following is true, perform each calculation:");
		System.out.println("Integer.MAX_VALUE = 15");
		System.out.println("Integer.MIN_VALUE = -16 \n");

		System.out.println("1.	" + (12 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (4 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("2.	" + (12 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (7 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("3.	" + (10 + ThreadLocalRandom.current().nextInt(0,3)) + " + " + (8 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("4.	" + (-16 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (1 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("5.	" + (-16 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (3 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("6.	" + (-2 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (14 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
		System.out.println("7.	" + (2 + ThreadLocalRandom.current().nextInt(0,3)) + " - " + (22 + ThreadLocalRandom.current().nextInt(0,3)) + " =");
	}

}
