package polymorphismConcepts;

public class RegisterParent { // Parent Class

	// create variables as private - so that these are not accessible outside the
	// class
	private String userName;
	private String password;
	private String confirmPassword;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public void enterUserName() {
		setUserName(userName);
		
	}
	
	public void enterPassword() {
		setPassword(password);
		
	}
	
	public void enterConfirmPassword() {
		setConfirmPassword(confirmPassword);
		
	}
	
	public boolean checkPassword() {
		
		boolean flag = false;
		
		if (password.equals(confirmPassword)) {
			flag = true;
			System.out.println("correct password is entered");
			
		} else {
			
			System.out.println("Please enter correct password");
			System.out.println("Intial password entered is " + password );
			System.out.println("Confirm password entered is " + confirmPassword );
		}
		
		return flag;
	}
	
	
	public void enterUserNameOnRegisterPage() {
		System.out.println("User entered username on Register page");
	}
	
	public void enterPasswordOnRegisterPage() {
		System.out.println("User entered password on Register page");
	}
	
	public void enterConfirmPasswordOnRegisterPage() {
		System.out.println("User entered confirm password on Register page");
	}
	
	
	void clickOnCreatePcId() {
		System.out.println("USer clicked on CreatePcId button");
		
	}

	void RegisterInfo() {
		System.out.println("User name entered is " + getUserName());
		System.out.println("Password entered is " + getPassword());
		System.out.println("Confirm password entered is " + getConfirmPassword());
		//checkPassword();
		clickOnCreatePcId();
		System.out.println("==============================================");

	}
	
	public void userInfo(String username, String password) {
		System.out.println("User entered details in Parent class as " + username  + "  "+ password);
	}

}
