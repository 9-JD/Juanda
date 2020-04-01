package examen;

import java.io.IOException;
import java.util.Scanner;

public class ejercisio3 {

	public static void main(String[] args) throws IOException {
		Scanner tec = new Scanner(System.in);
//inicializamos variables
		
		int tipo = 0;
		int nkm = 0;
		char a = '~';
// establecemos el buble que mientras a sea diferente a # que se ejecute
		while (a != '#') {
// las dos varables el tipo y el num km se lo pedimos al usuario
			System.out.println("inserte el tipo de vehiculo 1(utilitario), 2(gama media) y 3(gama alta)) ");
			tipo = tec.nextInt();
			tec.nextLine();
			System.out.println("numeros de Kilometros ");
			nkm = tec.nextInt();
			tec.nextLine();
// por si se equivoca en la elecion de tips de coches
			if (tipo == 1 || tipo == 2 || tipo == 3) {
// establecemos un switch segun el tipo de vehiculo se haran poeraciones diferentes
				switch (tipo) {
//extramos en metodos diferentes las operaciones
				case 1:

					extracted1(nkm);

					break;

				case 2:

					extracted2(nkm);
					break;

				case 3:

					extracted3(nkm);

				}
			} else {
				System.out.println("dato mal introducio solo hay tres tipo");
			}
// para salir
			System.out.println("inserte # para salir ");

			a = (char) System.in.read();

			tec.nextLine();

		}
	}

	private static void extracted3(int nkm) {
		//establecemos las condiciones 
		double preciofinal;
		if (nkm >= 180) {

			if (nkm >= 300) {

				double nkm2 = nkm - 300;
				nkm = 300;

				preciofinal = (nkm * 1.56) + (nkm2 * 2.29);
				System.out.println("el precio final  " + preciofinal);

			} else {
			
				preciofinal = nkm * 1.56;

				System.out.println("el precio final  " + preciofinal);

			}
//si no se le cumple se le indicara al usario
		} else {
			System.out.println(
					"dato introducido erroneo en este tipo de vehiculo solo se permite entre 120  a 450 km y los km introducidos("
							+ nkm + ") son menor a 180");

		}
	}

	private static void extracted2(int nkm) {
		double preciofinal;
		if (nkm >= 120 && nkm <= 450) {

			if (nkm >= 300) {

				double nkm2 = nkm - 300;
				nkm = 300;

				preciofinal = (nkm * 0.72) + (nkm2 * 1.16);
				System.out.println("el precio final  " + preciofinal);
			} else {
				preciofinal = nkm * 0.72;

				System.out.println("el precio final  " + preciofinal);

			}

		} else {
			if (nkm < 120) {

				System.out.println(
						"dato introducido erroneo en este tipo de vehiculo solo se permite entre 120  a 450 km y los km introducidos("
								+ nkm + ") son menor a 120");

			} else if (nkm > 450) {
				System.out.println(
						"dato introducido erroneo en este tipo de vehiculo solo se permite entre 120  a 450km y los km introducidos("
								+ nkm + ") son mayor a 450");
			}

		}
	}

	private static void extracted1(int nkm) {
		double preciofinal;
		if (nkm >= 80 && nkm <= 400) {

			if (nkm >= 300) {

				double nkm2 = nkm - 300;
				nkm = 300;

				preciofinal = (nkm * 0.26) + (nkm2 * 0.45);
				System.out.println("el precio final  " + preciofinal);

			} else {
				preciofinal = nkm * 0.26;

				System.out.println("el precio final  " + preciofinal);

			}

		} else {
			if (nkm < 80) {

				System.out.println(
						"dato introducido erroneo en este tipo de vehiculo solo se permite entre 80  a 400 km y los km introducidos("
								+ nkm + ") son menor a 80");

			} else if (nkm > 400) {
				System.out.println(
						"dato introducido erroneo en este tipo de vehicuo solo se permite entre 80  a 400km y los km introducidos("
								+ nkm + ") son mayor a 400");
			}

		}
	}
}
