package inheritanceConceptsLoblaws;

public class AddToCart extends Login { //AddToCart - child class of courses, grandchild of StudentInherit
	
	
	private String productName;
	private int noOfUnits;
	private double priceofEachProduct;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public double getPriceofEachProduct() {
		return priceofEachProduct;
	}

	public void setPriceofEachProduct(double priceofEachProduct) {
		this.priceofEachProduct = priceofEachProduct;
	}
	
	
	public double setPriceofProduct(int quantity) {
		
		if (quantity > 10) {
			priceofEachProduct = 5.0;
		}
		else priceofEachProduct = 7.0;
		
		return priceofEachProduct;
	}



	public double totalPrice() {
		double amount = 0;
		amount = priceofEachProduct*noOfUnits;
		System.out.println("Total cart amount is " + amount);
		
		return amount;
	}
	
	
	public void chooseProductName() {
		System.out.println("user chose the product");
		
	}
	
	public void chooseQuantity() {
		System.out.println("user chose the quantity");
		
	}
	
	void AddToCartInfo() {
		System.out.println("user chose " + productName);
		System.out.println("No. of units chosen are " + noOfUnits);
		System.out.println("Price of each unit is " + priceofEachProduct);
		totalPrice();
		System.out.println("==============================================");

	}

}
