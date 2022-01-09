package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement13 {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int kubik = 0;
		for(int i = 1; i<=x; i++) {
			 kubik = i*i*i;
			System.out.println(kubik);
		}
		
	}

}
