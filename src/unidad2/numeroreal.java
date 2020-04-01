package unidad2;

import java.util.Scanner;

public class numeroreal {

	public static void main(String[] args) {
		
		double n;
		int nredondeado;
		
		System.out.print("escribe un numero decimal: ");
		Scanner teclado = new Scanner (System.in);
		
		n= teclado.nextDouble();
		
		nredondeado = (int) (n + 0.5);
	System.out.print("numero redondeado es: " +nredondeado);
	
	
	teclado.close();
	
	
	}

}
