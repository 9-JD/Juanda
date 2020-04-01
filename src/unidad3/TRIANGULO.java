package unidad3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TRIANGULO {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
//iniamos las variables
		double a = 1;
		double b = 1;
		double c = 1;
		double perimetro = 0;
		double area = 0;
		int co = 1;
		double semiperimetro = 0;
		// mostraremos solo tres decimales
		DecimalFormat formato = new DecimalFormat("#.000");

//el bucle se realizara mientras sea co = 1
		while (co == 1) {
			System.out.println(
					"inserte los lados sin importar el orden en este programa se puede consultar la siguientes formas (Triángulo Escaleno, triangulo  equilatero o triangulo  isoceles) ");
			
				// introducimos los lados
				System.out.println("inserte  lado 1");
				a = tec.nextDouble();
				tec.nextLine();

				System.out.println("inserte  lado 2");
				b = tec.nextDouble();
				tec.nextLine();

				System.out.println("inserte  lado 3");
				c = tec.nextDouble();
				tec.nextLine();
				//solo se podran insertar numeros positivos
				if (a > 0 && b > 0 && c > 0) {
				
//vemos que tipo de triangulo es para llevar acabo las operaciones
				if (a != b && a != c) {

					perimetro = a + b + c;

					System.out.println("su perimetro es " + perimetro + " triangulo  Escaleno");

					area = extracted(a, b, c, perimetro);

					System.out.println("su area es " + formato.format(area) + " triangulo  Escaleno");

				}

				else if (a == b && a == c) {

					perimetro = 3 * a;

					System.out.println("su perimetro es " + perimetro + " triangulo  equilatero");

					area = extracted(a, b, c, perimetro);

					System.out.println("su perimetro es " + formato.format(area) + " triangulo  equilatero");

				}

				else {

					if (a == b) {

						perimetro = (a * 2) + c;

						extracted2(a, b, c, perimetro);

					}

					if (a == c) {

						perimetro = (a * 2) + b;

						extracted2(a, b, c, perimetro);

					}

					if (b == c) {

						perimetro = (b * 2) + a;

						extracted2(a, b, c, perimetro);

					}

				}

			} else {
				System.out.println("introduzca nuemros positivos por favor ");
			}

			System.out.println("si quieres salir pulse  2, si quiere contiuar pulse 1 ");
			co = tec.nextInt();
			tec.nextLine();

		}

		System.err.println("programa finalizado ");

	}
	// metodos para ahoorar codigo ya que se repite .

	private static void extracted2(double a, double b, double c, double perimetro) {
		double area;
		System.out.println("su perimetro es " + perimetro + " triangulo  isoceles");
		DecimalFormat formato = new DecimalFormat("#.000");
		area = extracted(a, b, c, perimetro);

		System.out.println("su area es " + formato.format(area) + " triangulo  isoceles");
	}

	private static double extracted(double a, double b, double c, double perimetro) {
		double area;
		double semiperimetro;
		semiperimetro = perimetro / 2;
		area = Math.sqrt((semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c)));
		return area;
	}

}
