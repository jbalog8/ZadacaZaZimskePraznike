package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes08 {

	public static void main(String[] args) {
		// Write a Java program that reads a number and display the square, cube, and
		// fourth power.

		int number = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));

		int sqare = number * number;
		int cube = number * number * number;
		int fourthPower = number*number*number*number;
		
		System.out.println("From number " + number + " sqare is " + sqare + " cube is " + cube + " and fourth power is " + fourthPower);
		
		

	}

}
