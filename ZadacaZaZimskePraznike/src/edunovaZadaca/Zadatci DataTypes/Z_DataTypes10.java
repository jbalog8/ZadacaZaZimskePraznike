package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes10 {
	
	public static void main(String[] args) {
		
//		Write a Java program to break an integer into a sequence of individual digits
//		Test Data
//		Input six non-negative digits: 123456
//		Expected Output :
//		1 2 3 4 5 6
		
		int number = Integer.parseInt(JOptionPane.showInputDialog("Unesi sestero znamekasti broj"));
		
		int dig1 = number / 100000 % 10;
        int dig2 = number / 10000 % 10;
        int dig3 = number / 1000 % 10;
        int dig4 = number / 100 % 10;
        int dig5 = number / 10 % 10;
        int dig6 = number % 10;
      
        System.out.println(dig1 + " " + dig2 + " " + dig3 + " " + dig4 + " " + dig5 + " " + dig6);
        
	}
}
			
			
		
		
		
	


