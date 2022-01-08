package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement11 {
	public static void main(String[] args) {
		
	
	int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	int suma = 0;
	for(int i = 1; i<=x; i++) {
		suma += i;
	}
	System.out.println(suma);
	}

	}
	


