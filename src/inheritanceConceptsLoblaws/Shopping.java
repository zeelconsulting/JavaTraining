package inheritanceConceptsLoblaws;

public class Shopping {

	public static void main(String[] args) {
		
		
		Register register = new Register();
		Login login = new Login();
		
		//parent class methods
	//	register.setUserName("abc@gmail.com");
	//	register.setPassword("Test@1234");
	//	register.setConfirmPassword("Test@1234");
	//	register.RegisterInfo();
		
		// child class methods
		login.setUsername1("abc@gmail.com");
		login.setPassword1("Test@1234");
		
		login.setUserName("abc@gmail.com"); //1
		login.setUserName("abcder@gmail.com"); //2
		
		login.setPassword("Test@1234");
		login.setConfirmPassword("Test@1234");
	//	login.RegisterInfo();
	//	login.clickLogin();

	//	System.out.println(login.getUserName());
		login.setUserName("test@gmail.com"); // 3
		System.out.println(login.getUserName());
	//	
		System.out.println("-------------------------------------");
		
		// register page flow
		register.enterUserNameOnRegisterPage();
		register.enterPasswordOnRegisterPage();
		register.enterConfirmPasswordOnRegisterPage();
		register.clickOnCreatePcId();
		
		
		System.out.println();
		// login page flow
		login.enterUserNameOnRegisterPage();
		login.enterPasswordOnRegisterPage();
		login.enterConfirmPasswordOnRegisterPage();
		login.clickOnCreatePcId();
		login.enterUserNameOnLoginPage();
		login.enterPasswordOnLoginPage();
		login.clickLogin();
		
		AddToCart cart = new AddToCart();
		
	//addto cart flow
		cart.enterUserNameOnRegisterPage();
		cart.enterPasswordOnRegisterPage();
		cart.enterConfirmPasswordOnRegisterPage();
		cart.clickOnCreatePcId();
		cart.enterUserNameOnLoginPage();
		cart.enterPasswordOnLoginPage();
		cart.clickLogin();
		cart.chooseProductName();
		cart.chooseQuantity();
		System.out.println();
		
		
		// register -> login -> Add product to cart -> billing info -> order info

	}

}
