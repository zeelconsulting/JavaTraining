package basicJava;

public class ObjectMethodConcepts {

	public static void main(String[] args) {
		
		
		// classname objectname = new classname();
		
				StudentDetails Sri = new StudentDetails();
				StudentDetails Divya = new StudentDetails();
				
				
				Sri.printFullName("Sri", "Sahoo");
				String st1 = Sri.printStudentDetails("Sri", "Sahoo", 12, "Python");
				System.out.println(st1);
				String st2 = Sri.printStudentDetails("Divya", "Nile", 13, "Java");
				System.out.println(st2);
				
				System.out.println(Sri.isStudentLearningJava());
				
				Sri.printName();
				
				Sri.fName = "Sri1";
				Sri.lName = "Sahoo1";
				Divya.batchName = "Java";
				Divya.rollNum = 15;
				System.out.println("======================================");
				String st3 = Sri.printStudentDetails(Sri.fName, Sri.lName, 12, "Java Script");
				System.out.println(st3);
				String st4 = Sri.printStudentDetails("Divya", "Nile", Divya.rollNum, Divya.batchName);
				System.out.println(st4);
				
				Sri.printFullName(Sri.fName, Sri.lName);
				
				System.out.println(Sri);
				System.out.println(Divya);
				
				
			
				System.out.println("static reference with class name " +  StudentDetails.isStudentLearningJava());
				
				
			//	static method inside a static main method can be done without object
//				non static method inside a static main method we need to create object of that class -> objectname.methodname; objectname.variablename
			//	non static -  5 objects = 1mb -> 5mb space used
			//	static - 1 mb -> 1mb
				
				
				// reference  static - direct method/variable name  or classname.method/variable name
						 
		
		

	}

}
