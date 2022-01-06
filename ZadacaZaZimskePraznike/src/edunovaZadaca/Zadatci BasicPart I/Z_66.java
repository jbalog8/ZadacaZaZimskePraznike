package edunovaZadaca;

public class Z_66 {

	public static void main(String[] args) {
		
		boolean prim=true;
	    int suma=0;
	    for(int t=2;t<=100;t++) {
	        prim=true;
	        for(int i=2;i<t;i++) {
	        if(t%i==0) {
	            prim=false;
	            break;
	        }
	        }
	        if(prim) {
	            suma+=t;
	        }
	    }
	    System.out.println(suma);
	}
	}
