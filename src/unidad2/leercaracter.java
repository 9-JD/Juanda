package unidad2;

import java.io.IOException;

public class leercaracter {

	public static void main(String[] args) throws IOException {
		System.out.print("intoduzca caracter");
		char c =(char) System.in.read();
		
		
		System.out.print("el caracter introducido; " + (int) c);

	}

}
