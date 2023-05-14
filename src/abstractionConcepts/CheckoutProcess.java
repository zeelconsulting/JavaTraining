package abstractionConcepts;

public class CheckoutProcess {

	public static void main(String[] args) {
		
		
		
		BillingInformation bill = new BillingInformation();
		
		// product details
		bill.productCategory();
		bill.productName("Eggs");
		bill.priceOfProduct(3.79);
		bill.quantityInStock();
		bill.quantity(10);
		bill.productUnit();
		
		
		// billing information
		bill.paymentType ("Credit card");
		bill.cardNumber("123456789123456");
		bill.cardHolderName ("John", "Doe");

	}

	

}
