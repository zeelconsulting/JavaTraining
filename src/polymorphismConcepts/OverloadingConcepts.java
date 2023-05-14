package polymorphismConcepts;

public class OverloadingConcepts {

	public static void main(String[] args) {
		
		
		OverloadingConcepts overload = new OverloadingConcepts();
		
		overload.loginDetails("John@gmail.com", "Test@1234");
		System.out.println();
		loginDetails("John@gmail.com", "Test@1234", "Test@1234");
		System.out.println();
		overload.loginDetails("John@gmail.com", "Test@1234", "Test@1234", 19);
		System.out.println();
		overload.loginDetails(12345, "Test@1234", "Test@1234", 19);
		
	
	}
	
	// same method name with 2 parameters
	 void loginDetails(String email, String password) {
		System.out.println("User entered username as " + email);
		System.out.println("User entered password as " + password);
		
	}
	
	// same method name with 3 parameters - same data type
	static void loginDetails(String email, String password, String confirmPassword) {
		System.out.println("User entered username as " + email);
		System.out.println("User entered password as " + password);
		System.out.println("User confirmed password as " + confirmPassword);
		
	}
	
	// same method name with 4 parameters - diff data type
	 void loginDetails(String email, String password, String confirmPassword, int age) {
		System.out.println("User entered username as " + email);
		System.out.println("User entered password as " + password);
		System.out.println("User confirmed password as " + confirmPassword);
		System.out.println("User's age is " + age);
		
	}
	
	// same method name with 4 parameters - diff data type of the same attribute
	 void loginDetails(int username, String password, String confirmPassword, int age) {
		System.out.println("User entered username as " + username);
		System.out.println("User entered password as " + password);
		System.out.println("User confirmed password as " + confirmPassword);
		System.out.println("User's age is " + age);
		
	}
	
	// if not diing overloading, need to create a separate method
	 void registerDetails(String email, String password, String confirmPassword) {
		System.out.println("User entered username as " + email);
		System.out.println("User entered password as " + password);
		System.out.println("User confirmed password as " + confirmPassword);
		
	}
	
	
	
	

}
