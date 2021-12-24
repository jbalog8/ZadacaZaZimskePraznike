package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z12 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci cijeli broj"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Unesi cetvrti cijeli broj"));
		int f = Integer.parseInt(JOptionPane.showInputDialog("Unesi peti cijeli broj"));
		int average = (a+b+c+d+f)/5;
		System.out.println(average);
	}

}
