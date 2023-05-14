package polymorphismConcepts;

public class OverridingShopping {

	public static void main(String[] args) {


		RegisterParent register = new RegisterParent();
		LoginChild login = new LoginChild();
		
		login.age = 10;
		login.age1 = 10;
		
		System.out.println();
		System.out.println(login.age1);
		

		// Method Overriding
	//	register.userInfo("Parent@gmail.com", "Parent@12345");
		System.out.println();
		
		//objectname.methodname(); -> run your  class method
	//	login.enterPasswordOnLoginPage();
		System.out.println();

		//object of childclass.method of parent class() -> run your parent class method
	//	login.clickOnCreatePcId();

		//object of childclass.method of parent class() -> should run parent class method
		//but it will not run as child class also has the same method with parameters
		// due to method overriding, child class method will be called.
		
		login.userInfo("Child@gmail.com", "Child@12345");
		System.out.println();
		
				
	//	getBillingInfo("XYZ", "1231312", "2022", "123", true);
	//	getBillingInfo("ABC", "9999999", "2024", "456", false);
		
	}
	
	static void getBillingInfo(String name, String cardnumber, String expiry, String CVV, boolean preferred) {
		
		if (preferred == true) {
			System.out.println("Keep this as default and on top of the page");
		}
	}
	
	/* 100 - Home; 100 - food
	 * parent class - Products, which has a method - getProductsByBrandName(String brandName) -> 200 products
	 * it will return all products of a particular brand on loblaws website
	 *  child class (categories) - Grocery/ Home, which has method - getProductsByBrandName(String brandName) -> 100 products
	 *  it will return all products of a particular brand inside/Home Grocery category
	 *  e.g - No name brand -> has products in Food , Home/Kitchen
	 */

}
