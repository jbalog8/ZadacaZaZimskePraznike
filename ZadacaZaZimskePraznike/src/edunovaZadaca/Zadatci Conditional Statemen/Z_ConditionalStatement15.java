package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement15 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int suma = 0;
		for(int i = 1; i <=n; i++) {
			if(i%2 != 0) {
				suma += i;
				System.out.print(i+ "\n");
			}
			
		}
		System.out.println(suma);
		
		
	}

}
