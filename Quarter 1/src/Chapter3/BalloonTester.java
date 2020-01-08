package Chapter3;

public class BalloonTester {

	public static void main(String[] args) {
		Balloon bal1 = new Balloon();
		System.out.println(bal1.getVolume());
		bal1.inflate(3.0);
		System.out.println(bal1.getVolume());
		Balloon bal2 = new Balloon(5.0);
		System.out.println(bal2.getVolume());
		bal2.deflate(2.0);
		System.out.println(bal2.getVolume());
		
	}
}
