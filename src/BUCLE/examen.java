package BUCLE;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// establecemos el scanner y las variables que vamos a utilizar
		Scanner teclado = new Scanner(System.in);
		double peso = 0;
		double altura = 0;
		double imc = 0;
		// establecemos un decimal format para establecer que en el resultado aparezca
		// solo 3 decimales
		DecimalFormat formato = new DecimalFormat("#.00");

		System.out.println("inicializacion del programa ");
		// establecemos que miestras las variables peso o altura sean igual o distintas
		// de cero el bucle se ejecutara
		while (peso >= 0 && altura >= 0) {
			// si se introduce numeros negativos el programa acabara
			System.out.println("cuando introduzca numeros negativos en el peso o en la altura el pograma acabara  ");
			// establecemos un try catch para los errores de intoducion de caracteres y otro
			// para si el divisor es cero.

			try {

				System.out.println("inserte peso  ");
				peso = teclado.nextDouble();
				teclado.nextLine();
				System.out.println("inserte altura ");

				altura = teclado.nextDouble();
				teclado.nextLine();

				// hemos puesto esta instrucion para que si el usuario introduce numeros
				// negativos el programa finalize sin realizar ningun calculo.
				if (peso >= 0 && altura >= 0) {

					// comprobamos si el divisor es cero , si es asi lanzara la exepcion de divisor
					// cero su no continuara el programa
					if (altura == 0) {
						throw new ArithmeticException(); // lanza la excepción
					} else {
						// realizamos la operacion de imc
						imc = extracted(peso, altura);
						// establecemos en los if los rangos que pertenece cada uno de los tipo de peso
						if (imc >= 0 && imc <= 18.49) {

							System.out.println("peso bajo su imc es " + extracted(imc, formato));

						}

						else if (imc >= 18.5 && imc <= 24.9) {

							System.out.println("peso normal su imc es " + extracted(imc, formato));
						}

						else if (imc >= 25 && imc <= 29.9) {

							System.out.println("sobre peso su imc es " + extracted(imc, formato));

						}

						else if (imc >= 30 && imc <= 34.9) {

							System.out
									.println("obsedidad leve, Tipo de obesidad 1 su imc es " + extracted(imc, formato));

						}

						else if (imc >= 35 && imc <= 39.9) {

							System.out.println("obsedidad leve, Tipo de media 2 su imc es " + extracted(imc, formato));

						} else {

							System.out
									.println("obsedidad morbida, Tipo de media 3 su imc es " + extracted(imc, formato));

						}

					}
				} else {
					System.out.println("programa finlaizado");
				}
			} catch (InputMismatchException e) {

				System.err.println("escriba numeros " + e.getMessage());
				teclado.nextLine();

			}

			catch (ArithmeticException e1) {

				System.err.println("divisor dividido es erroneo" + e1.getMessage());
				teclado.nextLine();

			}

		}
		teclado.close();
	}

	// metodo con la ellecion de tres decimales.
	private static String extracted(double imc, DecimalFormat formato) {
		return formato.format(imc);
	}

//lo extraemos en un metodo para el calculo del peso
	private static double extracted(double peso, double altura) {
		double imc;
		imc = peso / (altura * altura);
		return imc;
	}

}
