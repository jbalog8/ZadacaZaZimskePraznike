package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_153 {

	public static void main(String[] args) {
		
//		153. Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. Go to the editor
//
//		Sample Output:
//		Input first number: 5
//		Input second number: 1
//		false
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		System.out.println(a > 0 && a < 1 && b > 0 && b < 1);
		
		
	}
}
