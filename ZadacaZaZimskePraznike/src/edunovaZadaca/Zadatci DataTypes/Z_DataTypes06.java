package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes06 {
	
	public static void main(String[] args) {
		
		double weigth = Double.parseDouble(JOptionPane.showInputDialog("Unesi tezinu "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Unesi visinu"));
		double bmi = (weigth / (height * height)) ;
		
		System.out.println("The bmi of " + weigth + " and " + height + " is " + bmi);
	}

}
