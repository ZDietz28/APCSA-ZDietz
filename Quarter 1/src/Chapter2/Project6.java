package Chapter2;
import java.util.Random;

public class Project6 {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,n6;
		Random generator = new Random();
		n1 = generator.nextInt(50);
		n2 = generator.nextInt(50);
		n3 = generator.nextInt(50);
		n4 = generator.nextInt(50);
		n5 = generator.nextInt(50);
		n6 = generator.nextInt(50);
		System.out.println("Play this combination—it’ll make you rich! " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}

}
