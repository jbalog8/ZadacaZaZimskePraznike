package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_ConditionalStatement03 {
	public static void main(String[] args) {
		
//		Take three numbers from the user and print the greatest number. Go to the editor
//
//		Test Data
//		Input the 1st number: 25
//		Input the 2nd number: 78
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		if (a > b && a > c) {
			System.out.println(a);
		}
		else if (b>c && b>a){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
	}

}
