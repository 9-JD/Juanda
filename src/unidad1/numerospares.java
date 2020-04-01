package unidad1;

import java.util.Scanner;

public class numerospares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce numero ");

		int numero = teclado.nextInt();
		teclado.nextLine();
		
		if (numero % 2 == 0) {
			System.out.println("el numero: " + numero + " es par");
		} else {
			System.out.println("el numero: " + numero + " es impar");
		}

		teclado.close();
	}

}
