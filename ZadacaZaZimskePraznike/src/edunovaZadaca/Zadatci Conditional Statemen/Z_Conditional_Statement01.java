package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_Conditional_Statement01 {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if(num % 2 == 0) {
			System.out.println("Broj je paran;");
		}
		else {
			System.out.println("Broj nije paran");
		}
	}

}
