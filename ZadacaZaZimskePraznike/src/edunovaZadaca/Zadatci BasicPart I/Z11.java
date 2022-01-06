package edunovaZadaca;

public class Z11 {

	public static void main(String[] args) {

//		Write a Java program to print the area and perimeter of a circle. Go to the editor
//		Test Data:
//		Radius = 7.5
//		Expected Output
//		Perimeter is = 47.12388980384689
//		Area is = 176.71458676442586

		double radius = 7.5;
		double perimeter = radius * (2 * Math.PI);
		double area = radius * radius * Math.PI;

		System.out.println("Perimetar of radius " + radius + " is " + perimeter);
		System.out.println("Area of radius " + radius + " is " + area);

	}

}
