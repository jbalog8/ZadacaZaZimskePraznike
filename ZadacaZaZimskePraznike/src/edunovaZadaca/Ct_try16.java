package edunovaZadaca;

import javax.swing.JOptionPane;

public class Ct_try16 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi brojs tupaca"));

		int[][] matrix = new int[n][m];
		int k = 1;
		int c1 = 0; // pocetka stupca
		int c2 = m - 1; // kraj stupca
		int r1 = 0; // pocetak reda
		int r2 = n - 1; // kraj reda

		while (k <= n * m) {
			for (int j = r2; j >= r1; j--) {
				matrix[j][c1] = k++;
			}
			for (int i = c1 + 1; i <= c2; i++) {
				matrix[r1][i] = k++;
			}
			for (int j = r1 + 1; j <= r2; j++) {
				matrix[j][c2] = k++;
			}
			for (int i = c2 - 1; i >= c1 + 1; i--) {
				matrix[r2][i] = k++;
			}
			c1++;
			c2--;
			r1++;
			r2--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();

		}

	}
}
