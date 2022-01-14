package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement17 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
