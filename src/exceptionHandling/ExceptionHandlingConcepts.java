package exceptionHandling;

public class ExceptionHandlingConcepts {

	public static void main(String[] args) {
		
		
		try {
		System.out.println("Program started......");
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[4]); // ArrayIndexOutOfBoundsException
		System.out.println("code after exception occured in try block......");
		System.out.println(); 
		}
		catch(Exception e) {
			System.out.println("code after exception occured......");
			System.out.println(e);
			System.out.println("Code inside catch block");
			e.printStackTrace();
		}


	}

}
