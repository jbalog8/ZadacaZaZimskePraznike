package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement12 {
	
	public static void main(String[] args) {
		int [] broj = new int [5];
		for (int i =0; i<5; i++) {
			broj[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i+1) + " broj "));
		}
		   int zbroj = 0;

	        for(int i:broj) {
	            System.out.println(i);
	            zbroj +=i;
	        }System.out.println((float)zbroj/5);
		
	}

}
