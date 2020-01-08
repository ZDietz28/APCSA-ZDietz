package Chapter3;

public class ShoesTester {

	public static void main(String[] args) {
		Shoes fav = new Shoes();
		fav.setColor("Red");
		fav.setBrand("Addidas");
		fav.setType("Tennis");
		fav.setSize(14);
		System.out.println(fav.toString());
	}
}
