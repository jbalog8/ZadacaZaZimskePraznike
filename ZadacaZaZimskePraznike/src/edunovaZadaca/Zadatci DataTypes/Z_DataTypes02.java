package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes02 {
	public static void main(String[] args) {

//		Write a Java program that reads a number in inches, converts it to meters. 
//		Note: One inch is 0.0254 meter.

		double inch = Double.parseDouble(JOptionPane.showInputDialog("Unesi velicinu u incima: "));
		double meter = inch * 0.0254;

		System.out.println(inch + " inch "+ " is " + meter + " meters");

	}

}
