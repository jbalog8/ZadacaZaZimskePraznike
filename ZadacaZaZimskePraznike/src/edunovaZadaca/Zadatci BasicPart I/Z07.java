package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z07 {
	
	public static void main(String[] args) {
		
//		Write a Java program that takes a number as input and prints its multiplication table up to 10. Go to the editor
//		Test Data:
//		Input a number: 8
//		Expected Output :
//		8 x 1 = 8
//		8 x 2 = 16
//		8 x 3 = 24
//		...
//		8 x 10 = 80
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		
		
		for( int i = 0; i<10; i++){
			 
			System.out.println(a + " x " + (i+1) + " = " + (a * (i+1)));;
		}
		
	}

}
