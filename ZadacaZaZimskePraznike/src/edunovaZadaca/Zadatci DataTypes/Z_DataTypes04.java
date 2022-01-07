package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes04 {
	
	public static void main(String[] args) {
		
//		Write a Java program to convert minutes into a number of years and days
		
		double minutes = Double.parseDouble(JOptionPane.showInputDialog("Unesi minute"));
		double minutesYear = 60*24*365;
		long year = (long)(minutes /minutesYear);
		int days =(int) (minutes / 60 /24) % 365;
		
		System.out.println((int)minutes + " minutes is approximately " + year + " years and " + days + " days");
		
//		Since double is a bigger data type than int, it needs to be down-casted. See the syntax below:
//
//			int IntValue = (int) DoubleValue;
		
		
		
		
	}

}
