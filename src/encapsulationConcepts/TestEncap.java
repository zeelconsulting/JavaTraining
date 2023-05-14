package encapsulationConcepts;

public class TestEncap {

	public static void main(String[] args) {
		
		StudentEncap Encap = new StudentEncap();
		StudentEncap Encap1 = new StudentEncap();
		
		Encap.setfName("John");
		Encap.setlName("Doe");
		Encap.setBatchName("March");
		Encap.setLearningJava(true);
		Encap.setRollNum(1);
		Encap.setCourse("Java");
		Encap.ProfileInfo();
	//	Encap.setfName("John123");
		
		
		Encap1.setfName("Steve");
		Encap1.setlName("Smith");
		Encap1.setBatchName("April");
		Encap1.setLearningJava(false);
		Encap1.setRollNum(2);
		Encap1.setCourse("Python");
		Encap1.ProfileInfo();
	
		
		
	//	System.out.println(Encap.getfName() + " " + Encap.getlName());
		
		
		

		

	}

}
