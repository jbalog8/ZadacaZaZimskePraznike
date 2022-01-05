package edunovaZadaca;

import javax.swing.JOptionPane;

public class Ct_try18 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

		int[][] matrica = new int[n][m];

		int k = 1;
		int c1 = 0; // pocetka stupca
		int c2 = m - 1; // kraj stupca
		int r1 = 0; // pocetak reda
		int r2 = n - 1; // kraj reda
		
		
		while (k <= n * m) {
			if(k >= n*m)
				break;
			for (int i = c2; i >= c1; i--) {
				matrica[r1][i] = k++;
			}
			if(k>= n*m)
				break;
			for (int j = r1 + 1; j <= r2; j++) {
				matrica[j][c1] = k++;
			}
			if(k>=n*m)
				break;
			for (int i = c1 + 1; i <= c2; i++) {
				matrica[r2][i] = k++;
			}
			if(k>=n*m)
				break;
			for (int j = r2 - 1; j >= r1 + 1; j--) {
				matrica[j][c2] = k++;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrica[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
