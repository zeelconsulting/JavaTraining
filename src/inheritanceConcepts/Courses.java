package inheritanceConcepts;

public class Courses extends StudentInherit { // Courses - Child class
	
	private String courseName;
	private String InstructorName;
	private int noOfSeats;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructorName() {
		return InstructorName;
	}
	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	void CourseInfo() {
		System.out.println("Instructor name is " + InstructorName);
		System.out.println("Total no. of seats in course is " + noOfSeats);
		System.out.println("==============================================");

	}

}
