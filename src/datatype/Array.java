package datatype;

public class Array {

	public static void main(String[] args) {
		
		//1 dimension array
		//in-line array declaration and assignment 
		int [] array = {9,7,0,1,2};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		//array declaration 
		char[] array2 = new char[5];
		//array assignment 
		array2[0] = 'g';
		array2[1] = '^';
		array2[2] = '1';
		array2[3] = '3';
		array2[4] = '4';
		
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);
		System.out.println(array2[4]);
		
		//2 dimensions array
		int [][] array3 = {{9,8},{0,5}};
		System.out.println(array3[0][0]);
		System.out.println(array3[0][1]);
		System.out.println(array3[1][0]);
		System.out.println(array3[1][1]);
		
		//array declaration 
		char[][] array4 = new char[2][2];
		//array assignment 
		array4[0][0] = '%';
		array4[0][1] = '6';
		array4[1][0] = 'h';
		array4[1][1] = 's';
		
		System.out.println(array4[0][0]);
		System.out.println(array4[0][1]);
		System.out.println(array4[1][0]);
		System.out.println(array4[1][1]);
		
		char[][] array5 = new char[2][3];

	}
}
