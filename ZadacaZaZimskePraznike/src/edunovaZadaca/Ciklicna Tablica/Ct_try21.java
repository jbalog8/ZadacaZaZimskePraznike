package edunovaZadaca;

import javax.swing.JOptionPane;

public class Ct_try21 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int m= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		int [][] matrix = new int [n][m];
		
		int k = 1;
		int c1 = 0; // pocetka stupca
		int c2 = m - 1; // kraj stupca
		int r1 = 0; // pocetak reda
		int r2 = n - 1; // kraj reda
		
		
		izlaz:while(k <= n*m) {
			for(int i = r1; i <= r2; i++) {
				matrix[i][c1] = k++;
			if(k > n*m)
				break izlaz;}
			for(int j = c1+1; j <= c2 ; j++) {
				matrix[r2][j] = k++;
			if(k > n*m)
				break izlaz;}
			for(int i = r2-1; i>=r1; i--) {
				matrix[i][c2] = k++;
			if(k > n*m)
				break izlaz;}
			for(int j = c2-1; j >= c1+1; j--) {
				matrix[r1][j] = k++;
			if(k > n*m)
				break izlaz ;}
			

			c1++;
			c2--;
			r1++;
			r2--;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
