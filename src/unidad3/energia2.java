package unidad3;

import java.io.IOException;
import java.util.Scanner;

public class energia2 {

	public static void main(String[] args) throws IOException {

		System.out.println("inicializacion del programa");

		Scanner teclado = new Scanner(System.in);
//inicializacion de variables 
		char i = '#';
		int a = 0;
		int numero_de_visitas = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		char codigo = ' ';
//bucle mientras sea ejecuta i sea diferente a codigo
		while (i != codigo) {

			System.out.println(
					"Escriba el tipo de eficiencia energ�tica:   categor�a  �A�  categor�a �B�  categor�a �C� o si  las viviendas que no poseen estudio energ�tico categor�a  �N�");
			char categoria = (char) System.in.read();
			teclado.nextLine();
			// iniciamos los condiciones cuando sea una de las variable que esta dentro se Sumara uno a su contador personal , hay que decir que los numeros soloas las letras en el codigo acii
			if (categoria == 'A') {
				++a;
			}

			else if (categoria == 'B') {
				++b;
			}

			else if (categoria == 'C') {
				++c;
			}

			else if (categoria == 'N') {
				++d;
			}
//en el supuesto caso de que el usuario tecle una letra que no sea la que este prevista en el programa no contara como visita y le indicara al usuario que vuelva a introducir el dato
			if (categoria == 'A' || categoria == 'B' || categoria == 'C' || categoria == 'N') {

				++numero_de_visitas;
			}

			else {
				System.out.println("se ha equivocado usted, a introducido en la categoria �" + categoria
						+ "� continue con el programa y vuelva a inserta el valor correctamente");
			}
//codigo para salir del bucle
			System.out.println("�Quiere salir del programa pulse #?, para continuar pulse otra tecla  ");
			codigo = (char) System.in.read();
			teclado.nextLine();

		}
//toda las infromacion obtenida del bucle con sus respectivos porcentajes
		System.out.println("numero de casa visitadas " + numero_de_visitas);
		System.out.println(
				"numero de casa de clase A " + a + " su procentaje es " + (a / (double) numero_de_visitas) * 100 + "%");
		System.out.println(
				"numero de casa de clase B " + b + " su procentaje es " + ((double) b / numero_de_visitas) * 100 + "%");
		System.out.println(
				"numero de casa de clase C " + c + " su procentaje es " + (c / (double) numero_de_visitas) * 100 + "%");
		System.out.println("n�mero de las viviendas que no poseen estudio energ�tico " + d + " su procentaje es "
				+ ((double) d / numero_de_visitas) * 100 + "%");

		teclado.close();
	}

}
