package inheritanceConceptsLoblaws;

public class Login extends Register { // Courses - Child class
	
	//variables
	private String username1;
	private String password1;

	
	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}



	
	public void enterUserNameOnLoginPage() {
		System.out.println("User entered username on Login page");
	}
	
	public void enterPasswordOnLoginPage() {
		System.out.println("User entered password on Login page");
	}
	
	public void clickLogin() {
		System.out.println("User Clicked on Login button");
	}
	

}

