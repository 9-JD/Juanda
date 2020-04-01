package unidad1;

import java.util.Scanner;

public class grados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("introduce grado ");

		double numero = teclado.nextDouble();

		double resultado = (numero * 1.8) + 32;

		System.out.println("Fahrenheit " + resultado);

		teclado.close();
	}

}
