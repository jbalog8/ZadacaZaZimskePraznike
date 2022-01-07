package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes07 {
	public static void main(String[] args) {
		
//		Write a Java program to takes the user 
//		for a distance (in meters) 
//		and the time was taken
//		(as three numbers: hours, minutes, seconds), and display the speed,
//		in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters)
//		Input distance in meters: 2500
//		Input hour: 5
//		Input minutes: 56
//		Input seconds: 23
		
		double distance = Double.parseDouble(JOptionPane.showInputDialog("Unesi udaljenost"));
		double hour = Double.parseDouble(JOptionPane.showInputDialog("Unesi sate"));
		double minutes = Double.parseDouble(JOptionPane.showInputDialog("Unesi minute"));
		double seconds = Double.parseDouble(JOptionPane.showInputDialog("Unesi sekunde"));
		
		double kmh = 0;
		double ms = 0;
		double mh = 0;
	
		double sec = (hour * 3600) + (minutes * 60) + seconds;
		kmh = (distance * 3600) / (sec * 1000);
		ms = (distance) / sec;
		mh = (distance / sec) * (3600 / 1000) * (1 / 1.609);
		
		System.out.println(kmh);
		System.out.println(ms);
		System.out.println(mh);
	}

}
