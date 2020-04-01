package BUCLE;

import java.util.Random;

public class EJERCIO2 {

	public static void main(String[] args) {
//establecemos el for 
		System.out.println("con for ");

		for (int i = 0; i < 10; i++) {

			aleatorio();

		}
//establecemos el while
		System.out.println("con while ");
		int i = 0;
		while (i < 10) {
			aleatorio();

			++i;
//establcemos el do while
		}
		System.out.println("con do  while ");

		i = 0;

		do {
			aleatorio();

			++i;

		} while (i < 10);
	}

//metemos en el metodo lo  que se repite
	private static void aleatorio() {
		// establecmos los numeros aletarorios y para poder realizar operaciones con el
		// debemos añadirlo en un una valiable para establecerlo como entero
		Random randow = new Random();

		int valor = randow.nextInt(20);
		int resul = valor % 2;
		if (resul == 0) {

			System.out.println("numero es par " + valor);

		}

		else {

			System.out.println("numero es impar " + valor);

		}
	}

}
