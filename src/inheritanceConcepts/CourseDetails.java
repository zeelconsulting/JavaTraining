package inheritanceConcepts;

public class CourseDetails extends Courses { //CourseDetails - child class of courses, grandchild of StudentInherit
	
	private String courseTopics;
	private int courseDuration;
	
	public String getCourseTopics() {
		return courseTopics;
	}
	public void setCourseTopics(String courseTopics) {
		this.courseTopics = courseTopics;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	void CourseDetailsInfo() {
		System.out.println("Course topic is " + courseTopics);
		System.out.println("Course duration is " + courseDuration);
		System.out.println("==============================================");

	}

}
