package basicJava;

public class StudentDetails {

	
	String fName; 
	String lName;
	int rollNum;
	String course;
	String batchName;
	boolean learningJava;

	

	StudentDetails(){

		batchName = "March & April";
		System.out.println("This is a default constructor");
	}

	StudentDetails(String fName){

		//= fName -> refers to local variable which is passed in the constructor from the main class
		// this.fName -> refers to global variable which is initialized in the class outside your constructor/method
		// this.globalvaribale = local variable (variables names are same)
		this.fName = fName;
		batchName = "March & April";
		System.out.println("This is a parameterized constructor with 1 paramater");
	}
	
	
	StudentDetails(String fName, String lName1){

		this.fName = fName;
		// global variable = local variable having a different name
		lName = lName1;
		batchName = "March & April";
		System.out.println("This is a parameterized constructor with 2 paramater");

	}



	void ProfileInfo() {
		System.out.println("Student full name is " + fName + " " + lName);
		System.out.println("Roll number of the student is " + rollNum);
		System.out.println("Course enrolled is " + course);
		System.out.println("Batch name is " + batchName);
		System.out.println("Is the student learning Java " + learningJava);
		System.out.println("==============================================");

	}






	//=============================================================================== 

	public void printName() {

		System.out.println("This will print the name of student-1");
		System.out.println("This will print the name of student -2");
	}

	public void printFullName(String fname, String lname) {


		System.out.println("Name of the student is - " + fname + " " + lname);
	}

	public String printStudentDetails(String fname, String lname, int rollNum, String batchName ) {

		String details = fname + " " + lname + " " + rollNum + " " + batchName;
		return details;

	}

	public static boolean isStudentLearningJava() {
		return true;

	}

	public void TestVariables() {
		// Instance variables
		int i =0;
		System.out.println(i);

	}

	public void TestVariables2() {
		int i =1;
		System.out.println("Test Variable2 " + i);


	}


}


