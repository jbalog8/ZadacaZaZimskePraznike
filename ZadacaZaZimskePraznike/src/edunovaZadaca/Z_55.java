package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_55 {
	
	public static void main(String[] args) {
		
//		 Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
//		 Sample Output:
//
//		 Input seconds: 86399                                                   
//		 23:59:59
		
		int sekunde = Integer.parseInt(JOptionPane.showInputDialog("Unesi sekunde"));
		int p1 = sekunde % 60;
        int p2 = sekunde / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        
        System.out.println(p2 + ": " + p1 + ": "+ p3);
		
		
	}

}
