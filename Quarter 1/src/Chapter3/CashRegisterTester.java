package Chapter3;

public class CashRegisterTester {
	public static void main(String[] args)
	  {
	    CashRegister foo = new CashRegister();
	    foo.recordPurchase(19.99);
	    foo.receivePayment(25.00);
	    System.out.println(foo.giveChange()); // Expected 5.01
	    System.out.println(foo.getItemCount());
	    foo.recordTaxablePurchase(19.99);
	    foo.receivePayment(25.00);
	    System.out.println(foo.giveChange()); // Expected 3.51
	    
	  }
}
