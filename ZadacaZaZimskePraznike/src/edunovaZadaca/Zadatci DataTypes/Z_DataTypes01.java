package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes01 {
	
	public static void main(String[] args) {
		
		//Write a Java program to convert temperature from Fahrenheit to Celsius degree
		
		double Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Unesi temperaturu u Fahrenheit: " + "F"));
		
		double Celsius = (( 5 *(Fahrenheit -32)) /9);
		
		System.out.println(Fahrenheit + "F" + " is " +Celsius + "°C");
	}

}
