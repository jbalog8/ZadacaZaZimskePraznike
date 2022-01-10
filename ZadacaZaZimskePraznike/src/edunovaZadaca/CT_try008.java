package edunovaZadaca;

import javax.swing.JOptionPane;

public class CT_try008 {
	
	public static void main(String[] args) {
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupac"));

		int[][] matrica = new int[red][stupac];
		
		
		int k = 1;
		int c1 = 0; // pocetka stupca
		int c2 = stupac - 1; // kraj stupca
		int r1 = 0; // pocetak reda
		int r2 = red - 1; // kraj reda
		
		
		izlaz: while(k <= red*stupac) { 						//s desna na lijevo
			for(int i = c2; i >= c1; i--) {
				matrica[r2][i] = k++;
				
				if(k > red * stupac) {
					break izlaz;
					}
			}
			for (int i= r2 -1; i >= r1; i--) {				//od dolje prema gore
				matrica[i][c1] = k++;
				
				if(k > red * stupac) {
					break izlaz;
				}
			}
			for(int i = c1 +1; i <= c2; i++) {				//s lijeva na desno
				matrica[c1][i] =k++ ;
				
				if(k > red * stupac) {
					break izlaz;
				}
			}
			for (int i = r1 +1; i < r2; i++) {				//od gore prema dolje
				matrica[i][c2] = k++;
				
				if(k > red * stupac) {
					break izlaz;
				}
			}
			
			c2--;
			r2 --;
			r1++;
			c1++;
		}
		
			for(int i = 0; i < red; i++) {
				for(int j = 0; j < stupac; j++){
				System.out.print(matrica[i][j] + " \t");
			}
			System.out.println();
			
	}
}
}


