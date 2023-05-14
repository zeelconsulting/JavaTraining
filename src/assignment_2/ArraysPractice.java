package assignment_2;

public class ArraysPractice {

	public static void main(String[] args) {



		System.out.println("-------------Average of Array-----------------");
		int[] numbers = new int[]{10,15,55,20, 30, 25, 35, -16, 60, -100};
		// sum of all array elements
		int sum = 0;
		for(int i=0; i < numbers.length ; i++)
			sum = sum + numbers[i];
		// average value
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average); 



		System.out.println();
		System.out.println("-------------Array reverse-----------------");
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		System.out.println("Original array: ");  
		for (int i = 0; i < arr.length; i++) {  
			System.out.print(arr[i] + " ");  
		}  
		System.out.println();  
		System.out.println("Array in reverse order: ");  
		//Loop through the array in reverse order  
		for (int i = arr.length-1; i >= 0; i--) {  
			System.out.print(arr[i] + " ");  
		}  




		System.out.println();
		System.out.println("-------------Printing 2D Array-----------------");
		int[][] twoDimentional = {{1,1,3,4,5},{2,2,5,6,7},{3,3,5,7,3},{4,4,2,3,6}};
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 5; j++){
				System.out.print(twoDimentional[i][j] + " ");
			}
			System.out.println();
		}
	}






}

