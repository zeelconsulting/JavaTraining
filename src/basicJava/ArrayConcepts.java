package basicJava;

public class ArrayConcepts {

	public static void main(String[] args) {
	
		// Single dimensional array
		
		// declaration, instantiation, initialization
		
		int[] myNum = {10,20,30,40};
		String[] myStr = {"10","20","30", "40"};
		boolean[] status = {true, false};
		char[] batchName = {'A', 'B', 'C'};
		
		// declaration, instantiation
		int mynum1[] = new int[6];
		String mynum2[] = new String[4];
		boolean mynum3[] = new boolean [4];
		char mynum4[] = new char[4];
		
		// initialization
		mynum1[0] = 15;
		mynum1[1] = 20;
		mynum1[2] = 25;
		mynum1[3] = 30;
		mynum1[4] = 35;
		mynum1[5] = 40;
		
	int size = 	mynum1.length;
//	System.out.println(size);
	
	for (int i=0;i<mynum1.length; i++ ) {
	//	System.out.println(mynum1[i]);
		
	}
		
		// multidimensional array
		int[][] multi = new int[3][3];
		int multi1[][] = new int[3][3];
		
		multi1[0][0] = 10;
		multi1[0][1] = 12;
		multi1[0][2] = 14;
		
		multi1[1][0] = 16;
		multi1[1][1] = 18;
		multi1[1][2] = 20;
		
		multi1[2][0] = 22;
		multi1[2][1] = 24;
		multi1[2][2] = 26;
		
		int rows = multi1.length;
		int col = multi1[0].length;
		
		System.out.println("2D array size is  " + rows +" * " + col);
		
		for (int i=0; i<rows; i++) {
			
			for(int j=0; j<col;j++) {
				System.out.print(multi1[i][j] + " ");
			}
			System.out.println();
		}
	//-----------------------------------------------------------------------------
		
		Object objectArray[] = new Object[5];
		objectArray[0]= 1;
		objectArray[1]= "One";
		objectArray[2]= 'a';
		objectArray[3]= 12.07;
		objectArray[4]= false;
		
		for (int i=0;i<objectArray.length; i++ ) {
				System.out.println(objectArray[i]);		
			}

	}

}
