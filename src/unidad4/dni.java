package unidad4;

import java.util.Scanner;

public class dni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		String[] lista = new String[9];
		String[] lista2 = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		String numeros[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String numnif[] = { "0", "1", "2" };
		String letranif[] = { "X", "Y", "Z" };
		String num = "0";
		String num2 = "0";
		int tamano_generador = 8;
		String id = "DNI";
		int num1 = 0;
		int c = 0;
		String primera_letrapasa = " ";
		int numero = 0;

		int acumulador_n = 0;
		String[] numeror = new String[8];
		System.out.println("inicializando programa.....");
		System.out.println("DNI pulse 1 |Pasaporte pulse 2 ");
		c = tec.nextInt();

		switch (c) {
		case 1:

			menu(id);
			c = tec.nextInt();

			switch (c) {
			case 1:
				System.out.println("inserte los 8 digitos del dni");

				for (int i = 0; i < 9; ++i) {

					int a = 1;
					if (i < 8) {

						System.out.println("inserte el " + (a = i + a) + "º nuemro del dni");
						lista[i] = tec.next();

					} else {

						System.out.println("inserte la letra del dni");
						lista[i] = tec.next().toUpperCase();

					}

				}

				System.out.println("Comprobando numero  del dni....");

				num = extracted1(lista, num);

				acumulador_n = validar_numero(num, acumulador_n);

				comprobacion_global(lista, lista2, num, id, acumulador_n);

				break;

			case 2:

				averiguar_letra(tec, lista, id);

				num = extracted1(lista, num);

				num1 = Integer.parseInt(num);

				int letra = extracted(num1);

				System.out.println("su letra es " + lista2[letra]);

				break;
			case 3:
				System.out.println("GENERADOR DE DNIS");

				numeros_aleatorios(numeros, tamano_generador, numeror);

				num2 = aleatorio2(num2, tamano_generador, numeror);
				num1 = Integer.parseInt(num2);

				letra = extracted(num1);

				System.out.println("el dni generado es " + num1 + lista2[letra]);
				break;

			}

		case 2:

			id = "NIF";
			menu(id);
			c = tec.nextInt();

			switch (c) {
			case 1:
				System.out.println("inserte los 8 digitos del nif");

				for (int i = 0; i < 9; ++i) {

					int a = 1;

					System.out.println("inserte el " + (a = i + a) + "º digito");
					lista[i] = tec.next().toUpperCase();

				}

				/*
				 * if (lista[0].equals(letranif[0])) {
				 * 
				 * lista[0]=numnif[0]; }else if (lista[0].equals(letranif[1])) {
				 * 
				 * lista[0]=numnif[1]; }if (lista[0].equals(letranif[2])) {
				 * 
				 * lista[0]=numnif[2]; }
				 */

				pasaporte_modificar_letra(lista, numnif, letranif);

				System.out.println("Comprobando numero  del nif....");
				num = extracted1(lista, num);

				acumulador_n = validar_numero(num, acumulador_n);

				comprobacion_global(lista, lista2, num, id, acumulador_n);
				break;

			case 2:
				averiguar_letra(tec, lista, id);
				pasaporte_modificar_letra(lista, numnif, letranif);
				num = extracted1(lista, num);

				num1 = Integer.parseInt(num);

				int letra = extracted(num1);

				System.out.println("su letra es " + lista2[letra]);

				break;

			case 3:

				for (int b = 0; b < 3; b++) {

					numero = (int) (Math.random() * 2 + 0);

					primera_letrapasa = letranif[numero];

				}
				tamano_generador = 7;
				numeros_aleatorios(numeros, tamano_generador, numeror);
				num2 = aleatorio2(num2, tamano_generador, numeror);
				num1 = Integer.parseInt(num2);

				letra = extracted(num1);

				System.out.println("el NIF generado es " + primera_letrapasa + num1 + lista2[letra]);

				break;
			}

		}

	}

	private static String aleatorio2(String num2, int tamano_generador, String[] numeror) {
		for (int a = 0; a < tamano_generador; ++a) {

			num2 += numeror[a];

		}
		return num2;
	}

	private static void numeros_aleatorios(String[] numeros, int tamano_generador, String[] numeror) {
		int numero;
		for (int a = 0; a < tamano_generador; ++a) {

			numero = (int) (Math.random() * 9 + 0);

			numeror[a] = numeros[numero];

		}
	}

	private static void pasaporte_modificar_letra(String[] lista, String[] numnif, String[] letranif) {
		for (int i = 0; i < 3; ++i) {
			if (lista[0].equals(letranif[i])) {

				lista[0] = numnif[i];

			}

		}
	}

	private static void averiguar_letra(Scanner tec, String[] lista, String id) {
		System.out.println("inserte los 8 primeros  caracter del " + id);

		for (int i = 0; i < 8; ++i) {
			int a = 1;

			System.out.println("inserte el " + (a = i + a) + "º caracter del " + id);
			lista[i] = tec.next().toUpperCase();

		}
	}

	private static void menu(String id) {
		System.out.println("SI quiere comprobar si su " + id
				+ " esta bien escrito pulse 1 | si quiere ver su letra pulse 2| si quiere generar un " + id
				+ " pulse 3");
	}

	private static void comprobacion_global(String[] lista, String[] lista2, String num, String id, int acumulador_n) {
		int num1;
		if (acumulador_n == 8) {

			System.out.println("los numeros  de su " + id + " tienen el tamaño de los digitos son correctos" + num);

			num1 = Integer.parseInt(num);

			int letra = extracted(num1);

			System.out.println("Comprobando letra del " + id + "....");

			if (lista[8].equals(lista2[letra])) {

				System.out.println("la letra de su " + id + "" + lista[8] + " es correcta");

			} else {
				System.out.println("su letra deberia ser  " + lista2[letra] + " USTED A PUESTO " + lista[8]);
			}

		} else {
			System.out.println("los numeros de su " + id + " son incorrectos revise");
		}
	}

	private static int validar_numero(String num, int acumulador_n) {
		for (int a = 1; a < num.length(); ++a) {

			char letra0 = num.charAt(a);

			if (Character.isDigit(letra0)) {

				++acumulador_n;

			}

		}
		return acumulador_n;
	}

	private static int extracted(int num1) {
		int letra = num1 % 23;
		return letra;
	}

	private static String extracted1(String[] lista, String num) {
		for (int i = 0; i < 8; ++i) {

			num += lista[i];

		}
		return num;
	}

}
