package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_DataTypes09 {
	
	public static void main(String[] args) {
		
//		 Write a Java program that accepts two integers 
//		 from the user and then prints the sum, the difference,
//		 the product, the average, the distance 
//		 (the difference between integer), 
//		 the maximum (the larger of the two integers),
//		 the minimum (smaller of the two integers).
		
//		Test Data
//		Input 1st integer: 25
//		Input 2nd integer: 5
//		Expected Output :
//		Sum of two integers: 30
//		Difference of two integers: 20
//		Product of two integers: 125
//		Average of two integers: 15.00
//		Distance of two integers: 20
//		Max integer: 25
//		Min integer: 5
		
		int firstNum = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int secondNum = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int sum = firstNum + secondNum;
		double avg =(int) sum / 2;
		int product = firstNum * secondNum;
		int distance = 0;
		int max = 0;
		int min = 0;
		if(firstNum > secondNum) {
			distance += firstNum - secondNum;
			max = firstNum;
			min = secondNum;
		}else {
			distance += secondNum - firstNum;
			max = secondNum;
			min = firstNum;}
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(product);
		System.out.println(distance);
		System.out.println(max);
		System.out.println(min);
		
	}

}
