package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement04 {
	public static void main(String[] args) {
//		Write a Java program that reads 
//		a floating-point number and prints "zero" if the number is zero. 
//		Otherwise, print "positive" or "negative". 
//		Add "small" if the absolute value of the number is less than 1, or "large" 
//		if it exceeds 1,000,000. Go to the editor
//
//		Test Data
//		Input a number: 25
//		Expected Output :
//		Input value: 25
//		Positive number
		
		double input = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		System.out.println("Input is" + input);
		 if (input > 0)
	        {
	            if (input < 1)
	            {
	                System.out.println("Positive small number");
	            }
	            else if (input > 1000000)
	            {
	                System.out.println("Positive large number");
	            }
	            else
	            {
	                System.out.println("Positive number");
	            }
	        }
	        else if (input < 0)
	        {
	            if (Math.abs(input) < 1)
	            {
	                System.out.println("Negative small number");
	            }
	            else if (Math.abs(input) > 1000000)
	            {
	                System.out.println("Negative large number");
	            }
	            else
	            {
	                System.out.println("Negative number");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }
	    }
	
	}


