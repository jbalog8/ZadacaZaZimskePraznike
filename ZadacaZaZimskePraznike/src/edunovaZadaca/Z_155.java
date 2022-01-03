package edunovaZadaca;

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
		
		int [][] niz = {{10,20,30},
						{40,50,60}};
		
		int row = niz.length;
		int col = niz[0].length;
		
		int [][]novi_niz = new int[niz[0].length][niz.length];
		
		for(int i = 0; i <niz[0].length; i ++) {
			for(int j = 0; j < niz.length; j++){
				novi_niz[j][i]  = niz[i][j];
					
				}
				
				System.out.println();
			}
		}
	}


