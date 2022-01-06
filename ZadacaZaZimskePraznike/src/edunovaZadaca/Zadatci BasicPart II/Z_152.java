package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_152 {

	public static void main(String[] args) {
//		Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. Go to the editor
//
//		Sample Output:
//		Input first number: 25
//		Input second number: 37
//		Input third number: 45
//		Input fourth number: 23
//		Numbers are not equal

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Unesi cetvrti broj"));

		if (a == b && b == c && c == d) {
			System.out.println("Brojevi su isti");
		}else {
			System.out.println("Brojevi nisu isti");
		}
	}

}
