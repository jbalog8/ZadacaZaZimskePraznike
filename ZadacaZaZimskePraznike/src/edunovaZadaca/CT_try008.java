package edunovaZadaca;

import javax.swing.JOptionPane;

public class CT_try008 {
	
	public static void main(String[] args) {
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupac"));

		int[][] matrica = new int[red][stupac];
		

		for(int i = 0; i < red; i++) {
			for(int j = 0; j < stupac; j++){
				System.out.print(matrica[i][j] + " \t");
			}
			System.out.println();
			
	}
	}
}


