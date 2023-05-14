package exceptionHandling;

public class TryCatchFinallyBlock {

	//try - catch
	//try -catch - finally
	//try - finally
	//try - catch1 - catch2 - catch3 - can or cannot have a finally

	// can have multiple try-catch in one java file
	// one try can have multiple catch blocks
	// only 1 finally can be used per try

	public static void main(String[] args) {
		System.out.println("Program started......");
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[6]);
		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
		System.out.println("code after exception occured......");
		System.out.println("-------- 2nd try block-----------"); 



		try {
			String s=null;  
			System.out.println(s.length());
		}catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} finally {
			System.out.println("The 'try catch' is finished.");
		}

		try {
			String x="abc";  
			int i=Integer.parseInt(x);//Unchecked - NumberFormatException 
		} catch (Exception e) {
			System.out.println("Something went wrong.  " + e);
		} 
	}



}
