package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement16 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
