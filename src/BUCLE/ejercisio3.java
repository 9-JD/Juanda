package BUCLE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercisio3 {

	public static void main(String[] args) {
		System.out.println("introduce numero");
		Scanner teclado = new Scanner(System.in);
//inicializamos la variable que va a recoger el dato recogido del usuario.
		int num1;
		// establecemos el try para los errores de introducion de letras o caracteres.
		try {
			num1 = teclado.nextInt();
			teclado.nextLine();
//establecemos una variable temporal para los siguientes bucles debido a que su valor cambia y queremos que sea el resultado sea igual en los tres bucles
			int num2 = num1;
//establecemos la condicion que establece los limites de la tabla accii
			if (num2 >= 0 && num2 <= 255) {
//establecemos el bucle for 
				System.out.println("con for ");
				for (num1 = num1; num1 >= 0;) {

					num1 = extracted(num1);

				}
//establecemos el bucle while 
				System.out.println("con while");

				num1 = num2;
				while (num1 >= 0) {

					num1 = extracted(num1);
				}

				/// establecemos el bucle do while
				System.out.println("con do while");

				num1 = num2;
				do {

					num1 = extracted(num1);

				} while (num1 >= 0);

			} else {
				System.out.println("inserte numero desde 0 a 255");
			}
		} catch (InputMismatchException e) {

			System.out.println("error debe de introducir numeros " + e.getMessage());

		}
		teclado.close();
	}

//en este metodo cada vez que se inserte un numero se le restara 4 hasta llegar a cero 
	private static int extracted(int num1) {
		System.out.println((char) num1);
		num1 = num1 - 4;
		return num1;
	}
}
