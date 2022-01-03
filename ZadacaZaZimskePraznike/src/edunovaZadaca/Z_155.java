package edunovaZadaca;

import java.util.Arrays;

public class Z_155 {

	public static void main(String[] args) {
//		155. Write a Java program to print an array after changing the rows and columns of a given two-dimensional array. Go to the editor
//
//		Original Array:
//		10 20 30
//		40 50 60
//		After changing the rows and columns of the said array:10 40
//		20 50
//		30 60

		int[][] niz1 = {
				{10,20,30},
				{40,50,60}
		};
		int[][] niz2 = new int [niz1[0].length][niz1.length];
		
		for(int i = 0;i < niz2.length;i++) {
			for(int j = 0;j < niz2[0].length;j++) {
				niz2[i][j] = niz1[j][i];
			}
		}
		for(int i = 0;i < niz2.length;i++) {
			System.out.println(Arrays.toString(niz2[i]));
		}
}}