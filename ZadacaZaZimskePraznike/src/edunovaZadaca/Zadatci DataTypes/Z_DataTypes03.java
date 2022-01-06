package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes03 {

	public static void main(String[] args) {
//		Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

		int randomNum = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izmedju 0-1000"));
		izlaz:while(randomNum <=1000 || randomNum >=0) {
			if (randomNum < 0) {
			System.out.println("Unio si broj manji od 0");
				break izlaz;

		} else if (randomNum > 1000) {
			System.out.println("Unio si broj veci od 1000;");
				break izlaz;

		}
		
		int firstDig = randomNum % 10;
		int remainingDig = randomNum / 10;
		int secondDig = remainingDig % 10;
		remainingDig = remainingDig / 10;
		int thirdDig = remainingDig % 10;
		remainingDig = remainingDig / 10;
		int fourDig = remainingDig % 10;

		int sum = thirdDig + secondDig + firstDig + fourDig;

		System.out.println("The sum of numbers "+ randomNum + " is " + sum);
		break izlaz;
		}
	}

}
