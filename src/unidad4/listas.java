package unidad4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class listas {
	// la establecemos aqui para que sea visible dentro de los metodos
	static List<Double> menosmedia = new ArrayList<>();

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
//declaramos las variables
		String opcion = "si";
		DecimalFormat formato = new DecimalFormat("#.##");
		int a = 0;
		int b = 0;
		double numero = 0;
		int menores = 0;
		List<Double> listaAltura = new ArrayList<>();

		Double[] altura;
		double media = 0;
		//
		System.out.println("-------------------------Bienvenido al calculo de altura---------------------------- ");
// establecemos un bucle para que el usuario pueda introducir todas las alutra que quiera y salir cuando lo decida
		while (opcion.equalsIgnoreCase("si")) {

			++a;
			System.out.println("->Indique la altura del " + a + "º alumno ");
//añadimos en la lista
			listaAltura.add(control_numero(tc));

			// sumamos en la media
			media = media + listaAltura.get(b);
			++b;
			System.out.println(
					"¿Quiere continuar ? si / no, ya ha registrado la altura de " + listaAltura.size() + " alumnos");
			opcion = tc.next().trim();
		}

		System.out.println(
				"-------------------------Mostrando los datos guardados en un vector---------------------------- ");
//establemos el vector y le pasamos los datos de la lista
		altura = new Double[listaAltura.size()];

		altura = listaAltura.toArray(altura);

		mostrar(altura);
		separador();
		// mostramos los datos ordenaods de la lista
		System.out.println(
				"-------------------------Mostrando los datos guardados ordenados en  la lista ---------------------------- ");
		System.out.println("[Alturas en orden ascendente]");
		Collections.sort(listaAltura);
		mostrarlista(listaAltura);
		System.out.println("[Alturas en orden decendentes]");
		Collections.sort(listaAltura, Collections.reverseOrder());
		mostrarlista(listaAltura);

		separador();

		System.out.println("-------------------------Alturas por debajo de la media---------------------------- ");
//mostramos las alturas por debajo de la media
		media = media / (double) listaAltura.size();

		menores = pordebajodelamedia(menores, listaAltura, menosmedia, media);
		System.out.println("Nº -->" + menores);
//ordenamos de menor y mayor
		Collections.sort(menosmedia);

		mostrarlista(menosmedia);
		separador();

		System.out.println(
				"-------------------------Altura igual que la media de las alturas---------------------------- ");
		// vemos las veces que se repite la media en las alturas
		numero = Collections.frequency(listaAltura, media);

//explicado en el metodo
		String pos = " ";
		pos = igual_media(listaAltura, media, pos);

//depende del numero de coincidencias tendremos diferentes resultados
		if (numero == 1) {
			System.out.println(
					"-->El alumno con la " + pos + " su altura  es igual que la media de las alturas -> " +formato.format(media));
		}

		else if (numero > 1) {
			System.out.println("-->Los alumnos con la " + pos
					+ " sus alturas  son iguales que la media de las alturas -> " + formato.format(media) + "m");
		} else {

			System.out.println("--> No hay alturas iguales  que la media " + formato.format(media) + "m");

		}
		tc.close();
		System.out.println("--------Fin del programa-------------");
	}

	private static int pordebajodelamedia(int menores, List<Double> listaAltura, List<Double> menosmedia,
			double media) {
		for (int i = 0; i < listaAltura.size(); ++i) {

			if (listaAltura.get(i) < media) {

				menosmedia.add(listaAltura.get(i));
				++menores;

			}

		}
		return menores;
	}

//control de errores por la introducion de un numero negativo o caracter
	private static double control_numero(Scanner tc) {
		double num = 0;
		for (int s = 0; s < 1; ++s) {
			try {
				num = tc.nextDouble();
				tc.nextLine();
				if (num < 1) {
					System.err.println("Introduzca numeros positivos");
					s--;
				}

			} catch (InputMismatchException e) {

				System.err.println(
						"Introduzca numeros y si los introduce con decimales separa las unidades de los decimales con una coma");
				--s;
				tc.nextLine();

			}
		}
		return num;
	}

//separador
	private static void separador() {
		System.out.println(
				"_______________________________________________________________________________________________________ ");
		System.out.println();
	}

//para mostrar los datos al usuario
	private static void mostrarlista(List<Double> lista) {
		for (Double e : lista) {
			System.out.print(" " + e + "m\t");

		}
		System.out.println();
	}

//mostrar los datos al usuario
	private static void mostrar(Double vector[]) {
		int a = 0;
		for (int i = 0; i < vector.length; ++i) {

			System.out.println("Altura del " + (a = i + 1) + "º alumno es de " + vector[i] + " metros");

		}

	}

//con este metodo hacemmos que vaya avanzando el indexof ya que lo vamos modificado cada vez que lo encuentra.
	private static String igual_media(List<Double> listaAltura2, double media, String pos) {
		int index = listaAltura2.indexOf(media);
		while (index != -1) {

			try {

				index = listaAltura2.indexOf(media);
				listaAltura2.set(index, 0.0);

				pos += "pos " + index + ", ";
			} catch (IndexOutOfBoundsException e) {

				index = -1;

			}

		}
		return pos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
