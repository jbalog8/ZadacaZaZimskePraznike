package edunovaZadaca;

public class Z_74 {
	
	public static void main(String[] args) {
		
//		Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2. Go to the editor
//		Sample Output:
//		Test Data: array = 10, -20, 0, 30, 40, 60, 10
//
//		true
		
		int [] array = {10,-20,0,30,40,60,10};
		
		if(array[0] == 10 ||array[array.length-1] == 10){
		System.out.println(true);}
		else {
			System.out.println(false);
		}
		
	}

}
