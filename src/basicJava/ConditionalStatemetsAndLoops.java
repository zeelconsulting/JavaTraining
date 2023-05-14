package basicJava;

public class ConditionalStatemetsAndLoops {

	public static void main(String[] args) {

		ConditionalStatemetsAndLoops CS = new ConditionalStatemetsAndLoops();

		// Test If statement - if we don't need to check the flow if the condition is not true
		System.out.println("*************Test If statement**************");
		testIfStatement(17, "John");
		testIfStatement(18, "John1");
		testIfStatement(19, "John2");

		// Test If-else statement - used when we need to check when the condition is true and false
		System.out.println("*************Test If-else statement**************");
		testIfElseStatement(17, "John");
		testIfElseStatement(10, "John1");
		testIfElseStatement(60, "John2");

		// Test If-else If - else If - else statement - used when we have multiple conditions to be checked
		System.out.println("*************Test If-else If - else If - else statement**************");
		CS.testElseIfStatement(5);
		CS.testElseIfStatement(10);
		CS.testElseIfStatement(15);
		CS.testElseIfStatement(17);
		CS.testElseIfStatement(18);
		CS.testElseIfStatement(53);
		CS.testElseIfStatement(60);
		CS.testElseIfStatement(65);

		// Test Switch case statement
		System.out.println("************* Test Switch case statement**************");
		CS.testSwitchStatement("Blue");
		CS.testSwitchStatement("Black");
		CS.testSwitchStatement("pink");
		CS.testSwitchStatement("Purple");
		CS.testSwitchStatement("Brown");

		
		// Switch Statement - Assignment question
		System.out.println("************* Switch Statement - Assignment question**************");
		SwitchStatements(0);
		SwitchStatements(1);
		SwitchStatements(2);
		SwitchStatements(3);
		SwitchStatements(4);
		SwitchStatements(5);
		SwitchStatements(6);

		/*
		 * To test Loops
		 * For loop
		 * While Loop
		 * Do While loop
		 * 
		 */
		
		// For loop - when we know the specific no. of times we need the loop to run
		System.out.println("************* Testing For loop**************");
		for (int i = 0; i <= 7; i++) { // i++ means = i= i+1
			SwitchStatements(i);
		}

		// while - it will run till the condition is true.
		System.out.println("************* Testing while loop**************");
		int j = 0;
		while (j <= 7) {
			SwitchStatements(j);
			j++; // j=j+1
		}

		// do while - will run once and check for condition. if the condition is true it will run else not
		System.out.println("************* Testing Do while loop**************");
		int k = 1;
		do {
			SwitchStatements(k);
			k++;
		} while (k <= 7);

		/*
		 To test continue statement
		doesn't break the loop. It skips the specific part of the loop and jumps to the next iteration of the loop immediately.
		*/
		for (int a = 0; a <= 10; a++) {

			if (a == 5) {
				continue;
			}

			if (a == 8) {
				continue;
			}
			System.out.println(a);
		}

	/*
	To test break statement
	used to break the current flow of the program and transfer the control to the next statement 
	outside a loop or switch statement.
	*/
		
	for (int a = 0; a <= 10; a++) {

		if (a == 5) {
			//break;
		}
		System.out.println(a);
	}

}



	public static void testIfStatement(int age, String name) {

		if (age >= 18) {
			System.out.println(name + " is allowed to vote as age is " + age);
		}

	}

	public static void testIfElseStatement(int age, String name) {

		if (age >= 18) {
			System.out.println(name + " is allowed to vote as age is " + age);
		} else {
			System.out.println(name + " is not allowed to vote as age is " + age);
		}

	}

	public void testElseIfStatement(int age) {

		if (age < 10) {
			System.out.println("is not allowed to vote at all as age is " + age);
		}
		// else if (((age >=10 && age <15) && (age !=45)) || (age == 40)){
		else if (age >= 10 && age < 15) {
			System.out.println("will be allowed to vote in next 5 years as age is " + age);
		} else if (age >= 15 && age < 18) {
			System.out.println("will be allowed to vote in next 3 years as age is " + age);
		} else if (age >= 18 && age < 50) {
			System.out.println("can vote as age is " + age);
		} else if (age != 60) {
			System.out.println("Person is 60 years old");
		} else {
			System.out.println("Cannot vote");
		}
	}

	public void testSwitchStatement(String color) {

		// switch(variable name) {
		// case value of variable
		//
		// }
		switch (color) {
		case "Blue":
			System.out.println("The color is Blue");
			break;
		case "Black":
			System.out.println("The color is Black");
			break;
		case "Pink":
			System.out.println("The color is pink");
			break;
		case "Purple":
			System.out.println("The color is purple");
			break;
		default:
			System.out.println("No Matching color");
		}

	}

	// The day count entered is 1 and the day is Monday
	// 0-8

	public static void SwitchStatements(int day) {

		String message;
		switch (day) {
		case 1:
			message = "Monday";
			break;
		case 2:
			message = "Tuesday";
			break;
		case 3:
			message = "Wednesday";
			break;
		case 4:
			message = "Thursday";
			break;
		case 5:
			message = "Friday";
			break;
		case 6:
			message = "Saturday";
			break;
		case 7:
			message = "Sunday";
			break;
		default:
			message = "Invalid day";
			break;
		}

		System.out.println("The day is " + message + " as the count was " + day);

	}
}
