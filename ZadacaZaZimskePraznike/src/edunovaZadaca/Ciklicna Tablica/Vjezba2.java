package vjezba;

import java.util.Scanner;

public class Vjezba2 {

	public static void main(String[] args) {

		Scanner broj = new Scanner(System.in);
		System.out.print("Unesi broj redova: ");
		int n = broj.nextInt();
		System.out.println("---------------------------");
		System.out.println("Broj redova je: " + " | " + n + " | ");
		System.out.println("---------------------------");
		System.out.print("Unesi broj stupaca: ");
		int m = broj.nextInt();
		System.out.println("---------------------------");
		System.out.println("Broj stupaca je: " + " | " + m + " | ");
		System.out.println("---------------------------");
		System.out.println("Matrica od " + n + " i " + m);
		System.out.println("---------------------------");
		broj.close();
		int[][] matrix = new int[n][m];
		int c1 = 0;
		int c2 = m - 1;
		int r1 = 0;
		int r2 = n - 1;
		int k = 1;

		izlaz: while (k <= n * m) {
			for (int i = c2; i >= c1; i--) {
				matrix[r2][i] = k++;
				if (k > n * m) {
					break izlaz;
				}
			}
			for (int j = r2 - 1; j >= r1; j--) {
				matrix[j][c1] = k++;
				if (k > n * m) {
					break izlaz;
				}
			}
			for (int i = c1 + 1 ; i <= c2; i++) {
				matrix[r1][i] = k++;
				if (k > n * m) {
					break izlaz;
				}
			}
			for (int j = r1 + 1; j < r2 ; j++) {
				matrix[j][c2] = k++;
				if (k > n * m) {
					break izlaz;
				}
			}
			c1++;
			c2--;
			r1++;
			r2--;

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("%6d", matrix[i][j], "\t");
			}
			System.out.println();
		}
	}

}
