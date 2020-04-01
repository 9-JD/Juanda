package unidad3;

public class trycatch {

	public static void main(String[] args) {
		int n1=0, n2= 0, res;
		
		try {
			
			
			res=n1 /n2;
			
			}
		catch(ArithmeticException e) {
			
			System.out.println("error" +e.getMessage());
			return;
			
		}
		System.out.println ("la division es:" +res);
			
			
		}
	
	
	
	}


