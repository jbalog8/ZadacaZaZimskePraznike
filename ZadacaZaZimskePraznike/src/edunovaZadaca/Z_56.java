package edunovaZadaca;

import javax.swing.JOptionPane;

public class Z_56 {
	
	
	public static void main(String[] args) {
		
//		 Write a Java program to find the number of values in a given range divisible by a given value.
		
//		 For example x = 5, y=20 and p =3, find the number of integers within the range x..y 
		//and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//		 Sample Output: 5
	
		   int x = Integer.parseInt(
		            JOptionPane.showInputDialog("Unesi broj")
		            );
		    int y = Integer.parseInt(
		            JOptionPane.showInputDialog("Unesi broj")
		            );
		    int z = Integer.parseInt(
		            JOptionPane.showInputDialog("Unesi broj")
		            );
		    int brojac = 0;
		   
		    for(int i=x;i<=y;i++) {
		        if(i%z==0) {
		            brojac++;
		        }
		    }
		    System.out.println(brojac);
		}
		
		
		
		
		
			
		
		
		
	}


