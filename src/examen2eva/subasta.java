package examen2eva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class subasta {

	static String nombre_producto;
	static float precios;
	static float cantida_ganadora;

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		boolean h = subasta(tc);

		if (h == true) {

			System.out.println("el objeto a subastar es " + nombre_producto + " y su precio base es " + precios);

			System.out.println("introduzca la cantidad por la que quiere empezar a pujar");

			float puja = (float) tc.nextDouble();
			boolean opcion = cantidad_baja(puja);
			if (opcion == true) {

				float ganador = ganador(puja);
				
				
	System.out.println("ADJUDICADO EL "+nombre_producto+" con un precio de "+ganador);		
				

			} else {

				System.out.print("cantidad demasiado baja");

			}

		} else {
			System.out.print("error en la puja no se ha podido realizar");
		}

	}

	private static float ganador(float puja) {

		float oferta_ganadora = precios;
		if (puja > oferta_ganadora) {

			oferta_ganadora = puja;

		}

		return oferta_ganadora;

	}

	private static float numeros_enteros(Scanner tc) {
		float precio;
		try {
			precio = (float) tc.nextDouble();

		} catch (InputMismatchException e) {

			precio = -1;

		}

		return precio;

	}

	private static boolean cantidad_baja(float cantidad) {
		if (cantidad >= precios) {

			return true;

		}
		return false;
	}

	private static boolean subasta(Scanner tc) {
		System.out.println("introduca los objeto a subastar");

		String objeto = tc.nextLine();

		System.out.println("introduca los el precio base del objeto");

		float precio = numeros_enteros(tc);
		tc.nextLine();
		int b = 0;
		for (int i = 0; i < objeto.length(); ++i) {

			char a = objeto.charAt(i);

			if (Character.isLetter(a)) {
				++b;

			}
		}

		if (b == objeto.length()) {
			nombre_producto = objeto;

			if (precio > 0) {

				precios = precio;

				return true;

			}
		}
		return false;
	}

}
