package unidad1;

import java.util.Scanner;

public class operaciones_matematicas {

	public static void main(String[] args) {
		// establecemos escaner para que lea y almacene en tres variables los 3 numeros
		Scanner teclado = new Scanner(System.in);
		System.out.println("numeros  ");
		teclado.nextLine();
		System.out.println("numero 1 ");
		double numero1 = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("numero 2 ");
		double numero2 = teclado.nextDouble();
		teclado.nextLine();

		// establemos un avariable operacion que segun lo que valga se realizara una
		// operacion o otra
		System.out.println("pulse que operacion queiere realizar suma=1 resta=2 multiplicacion=3 divicion=4  ");
		int operacion = teclado.nextInt();
		teclado.nextLine();
		if (operacion == 1) {

			double suma = numero1 + numero2;

			System.out.println("resultado: " + suma);
		}

		else if (operacion == 2) {
			double resta = numero1 - numero2;

			System.out.println("resultado: " + resta);
		}

		else if (operacion == 3) {
			double multiplicasion = numero1 * numero2;

			System.out.println("resultado: " + multiplicasion);
		}

		else if (operacion == 4) {
			double divicion = numero1 / numero2;

			// mostramos por pantalla el resulatdo
			System.out.println("resultado: " + divicion);
		}
		
		teclado.close();
		
		
		
		
		
		
	}

}
