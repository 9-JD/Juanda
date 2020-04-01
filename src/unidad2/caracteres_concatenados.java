package unidad2;

import java.io.IOException;

public class caracteres_concatenados {

	public static void main(String[] args) throws IOException {
		char c1, c2, c3, c4, c5;
		
		
		System.out.print("escriba cinco caracteres ");
		
		c1= (char) System.in.read(); 
		c2= (char) System.in.read();
		c3= (char) System.in.read();
		c4= (char) System.in.read();
		c5= (char) System.in.read();

		System.out.print("hola " +c1 +c2 +c3 + c4 +c5);
		
	}

}
