package edunovaZadaca;

public class Z_Array_04 {
	
	public static void main(String[] args) {
//		4. Write a Java program to calculate the average value of array elements
		
		int[] niz = {20, 30, 25, 35, -16, 60, -100};
	     
	       int suma = 0;
	       for(int i=0; i < niz.length ; i++)
	        suma = suma + niz[i];
	       
	        double average = suma / niz.length;
	        System.out.println( average); 
		
		
			
		
	}

}
