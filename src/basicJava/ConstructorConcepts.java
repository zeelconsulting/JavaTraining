package basicJava;

public class ConstructorConcepts {

	public static void main(String[] args) {

		// initialize static variable - className.variableName
		// StudentDetails.lName = "Sahoo";
		
		// declaring an object
		StudentDetails Sri = new StudentDetails();
		// initialize non static variable - objectname.variableName
		Sri.fName = "Sri";
		Sri.lName = "Sahoo";
		Sri.rollNum = 1;
		Sri.course = "Java";
		Sri.learningJava = true;
		Sri.ProfileInfo();

		StudentDetails Divya = new StudentDetails();
		Divya.fName = "Divya";
		Divya.lName = "Nile";
		Divya.rollNum = 2;
		Divya.course = "Python";
		// Divya.batchName = "May";
		Divya.learningJava = false;
		Divya.ProfileInfo();

		StudentDetails student4 = new StudentDetails("John");
		student4.lName = "Doe";
		student4.rollNum = 3;
		student4.course = "Java Script";
		student4.learningJava = false;
		student4.ProfileInfo();

		StudentDetails student3 = new StudentDetails("Virat", "Kohli");
		student3.rollNum = 4;
		student3.course = "Cricket";
		student3.learningJava = false;
		student3.ProfileInfo();

	}

}
