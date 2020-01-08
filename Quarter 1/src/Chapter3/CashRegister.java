package Chapter3;


public class CashRegister {
/**
Constructs a cash register with no money in it.
*/
	final double taxRate;
	int numbOfItemsPurchased;
	double total;
	double changeDue;
	public CashRegister() {  
		// The combined sales tax rate for Hilliard, OH is 7.5%. This is the total of state, county and city sales tax rates.

		//variable for number of items purchased

		//variable for the "running total" due
		taxRate = 0.075;
		numbOfItemsPurchased = 0;
		total = 0.0;
}


/**
recordPurchase(double amount)
Records the sale of a NON-TAX item.
Adds the price of the item to the running total due.
@param amount the price of the item
*/
	public void recordPurchase(double amount){
		total += amount;
		numbOfItemsPurchased ++;
	}


/**
recordTaxablePurchase(double amount)
Records the sale of a TAXED item.
Use getItemTax() to calculate the tax for this purchase.
Then, add the price of the item to the running total due.
@param amount the price of the item
*/
	public void recordTaxablePurchase(double amount){
		double amountTax;
		amountTax = amount*taxRate;
		total += (amount + amountTax);
		numbOfItemsPurchased ++;
		
	}


/**
receivePayment(double amount)
Processes a payment received from the customer.
@param amount the amount of the payment
*/
	public void receivePayment(double amount){
		amount -= total;
		changeDue = amount;
	}


/**
giveChange()
Computes the change due and resets the machine for the next customer.
@return the change due to the customer
*/
	public double giveChange(){
		double changeDueTemp;
		total = 0;
		changeDueTemp = changeDue;
		changeDue = 0;
		numbOfItemsPurchased = 0;
		return changeDueTemp;
	}


/**
getItemCount()
Returns number of items purchased.
@return the number of items purchased
*/
	public int getItemCount(){
		return numbOfItemsPurchased;
	}


/**
getItemTax(double itemAmount)
Calculates the total tax collected during recordTaxablePurchase()
Calculate the amount of tax for this item by multiplying itemAmount and the taxrate instance variable
@param itemAmount the pretax price for this item
@return the total tax for this item
*/
	private double getItemTax(double itemAmount){
		return itemAmount *= taxRate;
	}
}