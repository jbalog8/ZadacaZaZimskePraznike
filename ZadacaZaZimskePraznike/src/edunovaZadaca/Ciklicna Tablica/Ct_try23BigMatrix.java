package edunovaZadaca;

import javax.swing.JOptionPane;

public class Ct_try23BigMatrix {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		System.out.println("-------------------------------------------");
		System.out.println("Broj redova je: " + " | " + n + " | ");
		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		System.out.println("-------------------------------------------");
		System.out.println("Broj stupaca je: " + " | " + m + " | ");
		System.out.println("-------------------------------------------");

		int pocetakMatrix = Integer.parseInt(
				JOptionPane.showInputDialog(("1. Gore lijevo \n2. Gore desno \n3. Donje lijevo \n4. Donje desno ")));
		if (pocetakMatrix == 1) {
			System.out.println("Pocetak matrice je: Gornji lijevi kut");
		}

		else if (pocetakMatrix == 2) {
			System.out.println("Pocetak matrice je: Gornji desni kut");
		}

		else if (pocetakMatrix == 3) {
			System.out.println("Pocetak matrice je: Donji lijevi kut");
		} else {
			System.out.println("Pocetak matrice je: Dornji desni kut");
		}

		System.out.println("-------------------------------------------");

		System.out.println("Matrica od " + n + " i " + m);

		System.out.println("-------------------------------------------");

		int[][] matrix = new int[n][m];
		int k = 1;
		int c1 = 0; // pocetka stupca
		int c2 = m - 1; // kraj stupca
		int r1 = 0; // pocetak reda
		int r2 = n - 1; // kraj reda

		switch (pocetakMatrix) {
		case 1:
			izlaz: while (k <= n * m) {
				for (int i = c1; i <= c2; i++) {
					matrix[r1][i] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int j = r1 + 1; j <= r2; j++) {
					matrix[j][c2] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = c2 - 1; i >= c1; i--) {
					matrix[r2][i] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int j = r2 - 1; j >= r1 + 1; j--) {
					matrix[j][c1] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}

				c1++;
				c2--;
				r1++;
				r2--;
			}

		case 2:
			izlaz: while (k <= n * m) {
				for (int i = r1; i <= r2; i++) {
					matrix[i][c2] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int j = c2 - 1; j >= c1; j--) {
					matrix[r2][j] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = r2 - 1; i >= r1; i--) {
					matrix[i][c1] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int j = c1 + 1; j <= c2 - 1; j++) {
					matrix[r1][j] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}

				c1++;
				c2--;
				r1++;
				r2--;
			}

		case 3:
			izlaz: while (k <= n * m) {
				for (int j = r2; j >= r1; j--) {
					matrix[j][c1] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = c1 + 1; i <= c2; i++) {
					matrix[r1][i] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int j = r1 + 1; j <= r2; j++) {
					matrix[j][c2] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = c2 - 1; i >= c1 + 1; i--) {
					matrix[r2][i] = k++;
					if (k > n * m) {
						break izlaz;
					}
				}
				c1++;
				c2--;
				r1++;
				r2--;
			}

		case 4:
			izlaz: while (k <= n * m) { // s desna na lijevo
				for (int i = c2; i >= c1; i--) {
					matrix[r2][i] = k++;

					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = r2 - 1; i >= r1; i--) { // od dolje prema gore
					matrix[i][c1] = k++;

					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = c1 + 1; i <= c2; i++) { // s lijeva na desno
					matrix[c1][i] = k++;

					if (k > n * m) {
						break izlaz;
					}
				}
				for (int i = r1 + 1; i < r2; i++) { // od gore prema dolje
					matrix[i][c2] = k++;

					if (k > n * m) {
						break izlaz;
					}
				}

				c2--;
				r2--;
				r1++;
				c1++;
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(

						matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
