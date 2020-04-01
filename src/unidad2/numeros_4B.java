package unidad2;

import java.util.Scanner;

public class numeros_4B {

	public static void main(String[] args) {
		// decalaramos variable
		double salario = 1;
		double suma = 0;
		int e = 0;
		int i1 = 0;

		for (int a = 10; a > 0; --a) {
			++e;
			System.out.println("escribe el salario: ");
			Scanner teclado = new Scanner(System.in);

			salario = teclado.nextDouble();
			teclado.nextLine();

			suma = suma + salario;
			// cuando el salario sea igual o superior a 1500 se incrementa i1
			if (salario >= 1500) {

				i1 = i1 + 1;

			}

		}
//mostramos la media y los salarios mayores
		System.out.println("la media total es : " + suma / e);

		System.out.println("el numero de salarios mayor o igual a 1500 son : " + i1);

	}

}
