package abstractionConcepts;

public abstract class AddProductToCart {
	
	//This class is to add products to cart using a abstract concepts
	//This class is to add products to cart using a abstract concepts
	
	//This class is to add products to cart using a abstract concepts
	public abstract void productCategory();
	
	public void productName(String productName) {
		System.out.println("Product entered is " + productName );
	}
	
	public double priceOfProduct(double price) {
		System.out.println("price of product is  " + price);
		return price;
	}
	
	public abstract void quantityInStock();
	
	public int quantity(int quantity) {
		System.out.println("quantity of product is  " + quantity);
		return quantity;
	}
	
	public abstract void productUnit();
	
	
	

}
