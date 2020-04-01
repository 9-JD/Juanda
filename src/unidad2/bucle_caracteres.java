package unidad2;

import java.io.IOException;
import java.util.Scanner;

public class bucle_caracteres {

	public static void main(String[] args) throws IOException {
		
		
		Scanner teclado = new Scanner (System.in);
		teclado.nextLine();
	
		char car = ' ';
		while (car !='#') {
			
			System.out.println(" introduce el caracter (prara salir # ) ");
			car =(char) System.in.read();
			teclado.nextLine();
			
			System.out.print("su caracter es " +car+ " y es acci equivale a " +(int)car);
			
		}
		
		
		
		
		teclado.close();

	}

}
