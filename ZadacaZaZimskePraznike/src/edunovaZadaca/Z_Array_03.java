package edunovaZadaca;

public class Z_Array_03 {

	public static void main(String[] args) {
		
		
//		3. Write a Java program to print the following grid. Go to the editor
//
//		Expected Output :
//
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - -                                                                                           
//		- - - - - - - - - - 
		
		int [][] niz= new int [10][10];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(" " + niz[i][j]);
			}
				
			System.out.println();
		}
		
	}

}
