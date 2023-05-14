package encapsulationConcepts;

public class StudentEncap {

	// create variables as private - so that these are not accessible outside the class
	private String fName; 
	private String lName;
	private int rollNum;
	private String course;
	private String batchName;
	private boolean learningJava;
	
	//getter and setter methods
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public boolean isLearningJava() {
		return learningJava;
	}
	public void setLearningJava(boolean learningJava) {
		this.learningJava = learningJava;
	}

	void ProfileInfo() {
		System.out.println("Student full name is " + getfName() + " " + getlName());
		System.out.println("Roll number of the student is " + rollNum);
		System.out.println("Course enrolled is " + course);
		System.out.println("Batch name is " + batchName);
		System.out.println("Is the student learning Java " + learningJava);
		System.out.println("==============================================");

	}
	
	
}


