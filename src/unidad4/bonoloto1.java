package unidad4;

import java.util.Scanner;

public class bonoloto1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		int[] num_elegido = new int[6];
		int i = 1;
		int cont = 2;
		String numero1 = " ";

		System.out.println("---------------------Bienbenido a la Bonoloto------------------------------- ");

		for (int d = 0; d < 1; ++d) {
			System.out.println("introduca el 1º numero");
			num_elegido[0] = tc.nextInt();
			if (num_elegido[d] < 1 || num_elegido[d] > 49) {
				System.out.println("solo numeros del 1 al 49 estos incluidos");

				--d;
			}

		}

		for (i = i; i < num_elegido.length; i++) {

			System.out.println("introduca el " + cont + "º numero");
			++cont;
			num_elegido[i] = tc.nextInt();
			if (num_elegido[i] < 1 || num_elegido[i] > 49) {

				System.out.println("solo numeros del 1 al 49 estos incluidos");
				--cont;
				--i;

			} else {

				for (int j = 0; j < i; j++) {

					if (num_elegido[i] == num_elegido[j]) {

						System.out.println("ha repetido el numero " + num_elegido[i]);
						--i;
						--cont;

					}

				}

			}
		}
		separador();
		System.out.print("Su numero es ");

		mostrar(num_elegido);

		separador();

		System.out.println("El numero que ha salido en la bonoloto es  ");

		int[] num = new int[6];

		num[0] = (int) (Math.random() * (49 - 1) + 1);

		for (int l = 1; l < num.length; ++l) {

			num[l] = (int) (Math.random() * (49 - 1) + 1);

			for (int k = 0; k < l; ++k) {

				if (num[l] == num[k]) {

					--l;

				}

			}
		}

		mostrar(num);
		separador();

		for (int d = 0; d < num.length; d++) {

			for (int a = 0; a < num.length; a++) {

				if (num_elegido[d] == num[a]) {

					numero1 += num_elegido[d];
					numero1 += " ";

				}

			}

		}

		if (numero1.length() == 1) {

			System.out.print("no hay numeros repetidos");

		} else if (numero1.length() == 3) {

			System.out.print("el numero repetido es " + numero1);

		} else if (numero1.length() > 3) {

			System.out.print("los numeros repetidos son " + numero1);

		}
	}

	private static void separador() {
		System.out.println("---------------------------------------------------- ");
	}

	private static void mostrar(int[] p) {
		for (int a = 0; a < p.length; ++a) {

			System.out.print(+p[a] + " ");
		}

		System.out.println(" ");
	}

}
