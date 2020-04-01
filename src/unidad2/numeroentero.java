package unidad2;

import java.util.Scanner;

public class numeroentero {

	public static void main(String[] args) {
	
		int n;
		double nreal;
		
		
		System.out.print("escribe entero ");
		Scanner teclado = new Scanner (System.in);
		n= teclado.nextInt();
		
		nreal= n + 0.2;
		
		System.out.print("numero es   " +nreal );
teclado.close();
	}

}
