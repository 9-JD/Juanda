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
			int a�o = verificar_num(tc);

			compro = esBisiesto(a�o);
			System.out.println("�el a�o que acabade introducir es bisiesto? eso es " + compro);
			System.out.println("�quiere introducir otro a�o pulse # y para salir pulse @");
			opcion = (char) System.in.read();
			tc.nextLine();
		}
	}

	private static int verificar_num(Scanner tc) {
		int a�o = -1;

		while (a�o < 1) {

			try {
				System.out.println("inserte a�o");
				a�o = tc.nextInt();
				tc.nextLine();
				if (a�o < 1) {
					System.out.println("solo numero positivos");
				}
			} catch (InputMismatchException e) {

				System.out.println("solo numero enteros");
				tc.nextLine();
			}

		}
		return a�o;
	}

	public static boolean esBisiesto(int a�o) {
		if ((a�o % 4 == 0 && a�o % 100 != 0) || a�o % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
