package edunovaZadaca;



public class Z_154 {
	
	public static void main(String[] args) {
		
//		154. Write a Java program to print the contents of a two-dimensional Boolean array where t will represent true and f will represent false. Go to the editor
//
//		Sample array:
//		array = {{true, false, true},
//		{false, true, false}};
//		Expected Output :
//		t f t
//		f t f
		
		boolean [][] array = {{true, false,true},
							{false, true, false}};
		
		int row = array.length;
		int col = array[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(array[i][j]) {
					System.out.print("t");
				}
				else {
					System.out.print("f");
				}
			}
			System.out.println();
		}
		
		
	}

}
