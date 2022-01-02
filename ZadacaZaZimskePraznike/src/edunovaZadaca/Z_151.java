package edunovaZadaca;

public class Z_151 {
	
	public static void main(String[] args) {
		
//		151. Write a Java program to find the value of specified expression. Go to the editor
//		a) 101 + 0) / 3
//		b) 3.0e-6 * 10000000.1
//		c) true && true
//		d) false && true
//		e) (false && false) || (true && true)
//		f) (false || false) && (true && true)
		
		
		
		int a = (101 + 0) / 3; 
		double b = 3.0e-6 * 10000000.1;
		boolean c = true && true;
		boolean d = false && true;
		boolean e = (false&&false) || (true && true);
		boolean f = (false || false) && (true || true);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
