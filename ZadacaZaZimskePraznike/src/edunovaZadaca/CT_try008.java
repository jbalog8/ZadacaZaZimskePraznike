package edunovaZadaca;

import javax.swing.JOptionPane;

public class CT_try008 {
	
	public static void main(String[] args) {
		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupac"));

		int[][] matrica = new int[red][stupac];
		
		
		int suma = 1, a = 0, a2 = stupac -1, b = 0, b2 = red -1;
		
		while(suma <= red*stupac) { 						//s desna na lijevo
			for(int i = a2; i >= a; i--) {
				matrica[b2][i] = suma;
				suma ++;
				if(suma > red * stupac) {
					break;
					}
			}
			for (int i= b2 -1; i >= b; i--) {				//od dolje prema gore
				matrica[i][a] = suma;
				suma ++;
				if(suma > red * stupac) {
					break;
				}
			}
			for(int i = a +1; i <= a2; i++) {				//s lijeva na desno
				matrica[a][i] = suma;
				suma ++;
				if(suma > red * stupac) {
					break;
				}
			}
			for (int i = b +1; i < b2; i++) {				//od gore prema dolje
				matrica[i][a2] = suma;
				suma ++;
				if(suma > red * stupac) {
					break;
				}
			}
			
			b2--;
			a2 --;
			b++;
			a++;
		}
		
			for(int i = 0; i < red; i++) {
				for(int j = 0; j < stupac; j++){
				System.out.print(matrica[i][j] + " \t");
			}
			System.out.println();
			
	}
}
}


