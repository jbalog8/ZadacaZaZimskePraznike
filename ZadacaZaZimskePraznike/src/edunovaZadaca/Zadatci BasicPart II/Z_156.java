package edunovaZadaca;

public class Z_156 {
	
	public static void main(String[] args) {
//		
//		Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer. Go to the editor
//
//		Original Number: 2350
//		Result: 11
		
		 int broj = 2350;
			System.out.println(broj);
			int brojac = 0;
	        do {
	            broj >>= 1;
	            brojac++;
	        } while (broj != 0);
	         brojac--;
	        System.out.println(brojac);
	        
	}

}
