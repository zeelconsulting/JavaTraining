package inheritanceConceptsLoblaws;

public class Exams extends Register { // it is an example of Hierarchical inheritance - as StudentInherit is extended by Exam and Courses class
	
	int passingMarks;

	public int getPassingMarks() {
		return passingMarks;
	}

	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
	}

}
/*
 * Create class - Register,Login, Addtocart, main class - create full flow of adding product to cart - Register to Add to cart
 * 
 * Register info
 * Login info
 * product info
 * 
 */
