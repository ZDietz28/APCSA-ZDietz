package Chapter4;

public class Printf {

	public static void main(String[] args) {
		int numberOfItemsPurchased = 15;
		double subtotal = 142.18;
		final double TAX = 0.075;
		System.out.printf("%s", "Number of items purchased: ");
		System.out.printf("%d%n", numberOfItemsPurchased);
		System.out.printf("%27s", "Subtotal: ");
		System.out.printf("%5.2f%n", subtotal);
		System.out.printf("%27s", "Tax: ");
		System.out.printf("%4.2f%n", (subtotal*TAX));
		System.out.printf("%32s%n", "-----");
		System.out.printf("%27s", "Total: ");
		System.out.printf("%5.2f%n", (subtotal + (subtotal * TAX)));
		System.out.printf("%s%n", " ");
		System.out.printf("%27s" , "Gas points earned: ");
		System.out.printf("%d%n", ((int) subtotal/3)); 
	}

}
