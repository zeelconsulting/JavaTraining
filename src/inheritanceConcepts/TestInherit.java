package inheritanceConcepts;

public class TestInherit {

	public static void main(String[] args) {
		
		StudentInherit inherit = new StudentInherit();
		Courses courses = new Courses();
		
//		inherit.setfName("John");
//		inherit.setlName("Doe");
//		inherit.setBatchName("March");
//		inherit.setLearningJava(true);
//		inherit.setRollNum(1);
//		inherit.setCourse("Java");
		
		
		//parent- child
		
//		courses.setfName("John");
//		courses.setlName("Doe");
//		courses.setBatchName("March");
//		courses.setLearningJava(true);
//		courses.setRollNum(1);
//		courses.setCourse("Java");
//		courses.setInstructorName("Steve");
//		courses.setNoOfSeats(15);
//		
//		courses.ProfileInfo();
//		courses.CourseInfo();
		
		//parent- child - grandchild
		
		CourseDetails sd = new CourseDetails();
		
		sd.setfName("John");
		sd.setlName("Doe");
		sd.setBatchName("March");
		sd.setLearningJava(true);
		sd.setRollNum(1);
		sd.setCourse("Java");
		
		sd.setInstructorName("Steve");
		sd.setNoOfSeats(15);
		
		sd.setCourseDuration(40);
		sd.setCourseTopics("OOPs concepts");
		
		sd.ProfileInfo();
		sd.CourseInfo();
		sd.CourseDetailsInfo();
		
		
		

	//	Encap.setfName("John123");
		
		
		
	
		
		
	//	System.out.println(Encap.getfName() + " " + Encap.getlName());
		
		
		

		

	}

}
