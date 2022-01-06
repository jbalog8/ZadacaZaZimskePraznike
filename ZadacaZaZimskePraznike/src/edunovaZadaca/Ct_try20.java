package edunovaZadaca;

import javax.swing.JOptionPane;

public class Ct_try20 {

	public static void main(String[] args) {

		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int[][] matrix = new int[m][m];
		int suma = 1;
		

		
		for (int k = 0; k <= m - 1; k++) {
			int i = k;
			int j = 0;

			while (i >= 0) {
				matrix[i][j] = suma++;
				
				i = i - 1;
				j = j + 1;
				
				
				}
			}
			
		

		for (int k = 1; k <= m - 1; k++) {
			int i = m - 1;
			int j = k;

			while (j <= m - 1) {
				matrix[i][j] = suma++;
				
				i = i - 1;
				j = j + 1;
			}
			
		}
		
		
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < m ; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
