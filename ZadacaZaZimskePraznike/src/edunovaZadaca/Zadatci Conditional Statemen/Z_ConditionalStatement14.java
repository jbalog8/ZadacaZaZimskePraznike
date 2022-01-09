package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement14 {
	
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int mul = 0;
		for(int i = 0; i<x; i++) {
			mul += i*x;
			System.out.println(mul);
		}
		
	}

}
