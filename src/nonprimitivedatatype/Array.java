package nonprimitivedatatype;

public class Array {

	public static void main(String[] args) {
		
		//array is a variable that can hold multiple value of the same type
		//arrayType [] arrayName = {value1, value2, value3};
		
		//in line declaration and assignment 
		int [] array = {7, 4, 8, 0, 1};
		
		System.out.print(array[0]);
		System.out.print(array[1]);
		System.out.print(array[2]);
		System.out.print(array[3]);
		System.out.print(array[4]);
		
		//array declaration 
		int [] array2 = new int [3];
		
		//array assignment
		array2[0] = 7;
		array2[1] = 0;
		array2[2] = 9;
		
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		
		//2D array
		int [][] array3 = new int [2][2];
		array3[0][0] = 7;
		array3[0][1] = 9;
		array3[1][0] = 8;
		array3[1][1] = 4;
	}

}
