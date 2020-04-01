package unidad4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) throws IOException {
		Scanner tc = new Scanner(System.in);

		char opcion = ' ';
		boolean compro;

		while (opcion != '@') {
			int año = verificar_num(tc);

			compro = esBisiesto(año);
			System.out.println("¿el año que acabade introducir es bisiesto? eso es " + compro);
			System.out.println("¿quiere introducir otro año pulse # y para salir pulse @");
			opcion = (char) System.in.read();
			tc.nextLine();
		}
	}

	private static int verificar_num(Scanner tc) {
		int año = -1;

		while (año < 1) {

			try {
				System.out.println("inserte año");
				año = tc.nextInt();
				tc.nextLine();
				if (año < 1) {
					System.out.println("solo numero positivos");
				}
			} catch (InputMismatchException e) {

				System.out.println("solo numero enteros");
				tc.nextLine();
			}

		}
		return año;
	}

	public static boolean esBisiesto(int año) {
		if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
