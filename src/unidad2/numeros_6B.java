package unidad2;

import java.util.Scanner;

public class numeros_6B {

	public static void main(String[] args) {
		// declaracion de variables
		double num1 = 0;
		double comparador = 0;
		
		// el bucle saldra cuando a  sea igual o mayor a 7
		for (int a=0; a< 7; ++a) {
	
			System.out.println("escribe el numero: ");
			Scanner teclado = new Scanner(System.in);

			num1 = teclado.nextDouble();
			teclado.nextLine();

			// almacena y compara el numero introducido

			if (num1 > comparador) {

				comparador = num1;

			}
		
		}

		System.out.println("el numero mayor es  : " +  comparador);

	}

}
