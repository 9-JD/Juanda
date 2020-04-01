package unidad4;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import unidad1.suma;

public class matriz_act3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("#.00");
		// varibales
		String suma[] = { " " };

		String asing[] = { "NOMBRE", "PRO", "BAE", "SSF", "LND" };
		String seguir = "si";
		String dato = " ";
		String nombres = " ";
		double divisormedia;
		double doublesuma = 0.0;

		// estos string son utlizados en los metodos para mostrar texto al usuario
		String alum = "Introduzca el numero de alumnos";
		String mod = "introduzca el numero de modulos ";
		String opciones = "¿Quiere realizar un estudio sobre el ciclo DAW o otro? pulse 1 para DAW , 2 para otro";
		String media_modulo = "Elija mediante su numero el modulo para realizar la media";
		String media_notas = "Elija mediante su numero el alumno para realizar la media de sus notas";
//con este bucle vamos hacer que se repita el programa hasta que el usuario queda salir 
		while (seguir.equals("si")) {

			System.out.println(
					"----------------------------Bienvenido al programa calculador de medias-------------------------------------------  ");

			int opcion = 0;
			// con este metodo nos aseguramos que solo se puedan introducir numeros y que
			// sea del 1 al 10
			opcion = introducion_num_teclado(tec, opcion, opciones);

			switch (opcion) {
			case 2:
				// introducion de alumnos (con este metodo nos aseguramos que solo se puedan
				// introducir numeros y que sea del 1 al 10), evitamos tambien que el tamaño del
				// vectror no sea el deseado
				int alu = 0;

				alu = introducion_num_teclado(tec, alu, alum);
				alu = alu + 1;
				// introducion de modulos
				int modulos = 0;
				modulos = introducion_num_teclado(tec, modulos, mod);
				modulos = modulos + 1;
// creamos el tamaño del vector 
				String info[][] = new String[alu][modulos];
//almacenamos en el vector los datos que va introduciendo el ususario hemos añadido el Nombre para evitar que el usuario lo tenga que hacer
				for (int i = 0; i < info.length; i++) {

					for (int j = 0; j < info[0].length; j++) {

						if (i == 0 && j == 0) {

							info[i][j] = asing[0];
						} else if (i == 0 && j > 0) {

							System.out.println("-> Ingrese los nombres de los modulos");
//con este metodo vemos si el usuario a escrito realmente un nombre 
							nombres = comprobar_nombres(tec, nombres);
							info[i][j] = nombres;

						} else if (i > 0 && j == 0) {

							System.out.println("-> Ingrese el nombre del alumno");

							nombres = comprobar_nombres(tec, nombres);
							info[i][j] = nombres;

						}

						else if (i != 0 && j != 0) {
							System.out.println("-> Ingrese la calificasion de " + info[0][j]);
//con este metodo vemos si el usuario a escrito los numeros corectamente
							dato = string_numero(tec, dato);
							info[i][j] = dato;

						}

					}
				}

				// media de los modulos

				while (seguir.equals("si")) {
					// hemos establecido un separador que consta de un print con
					// ----------------------- para que el programa sea mas vistoso y separar las
					// partes del programa
					separador();
					/// mostramos la matriz
					mostrar_matriz(info);

					separador();
					opcion = 0;
// con este metodo recorremos las filas para que el usuario nos indique de que modulo quiere hacer la media 
					recorrer_columnas(info, opcion);

					suma = new String[info.length - 1];
// con este metodo alamcenamos las notas escritas en el vector en un string, por otro lado tambien tenemos establecido la opcion que elija el usuario tiene que ser un numero y dentro del rango que le indicamos.;
					recoger_numeros1(tec, suma, info, alu, media_modulo);
					// pasamos las notas a una variable double y luego tamben sumamos cada una de
					// las notas
					doublesuma = convertir_string_double(suma, doublesuma);
					divisormedia = info.length - 1;

					// si hay mas de un modulo se realizara la media en caso contrario no
					if (divisormedia > 1) {
						System.out.println(
								" es un " + formato.format(media(doublesuma, divisormedia, info)) + "█            ");
					} else {
						System.out.println("[[[No se puede realizar la media ya que solo hay un modulo]]]");
					}
					separador();

///si quiere repetir o hacer otra media de modulos
					System.out.println("¿Quiere realizar otra media de modulos? escriba si o no");
					seguir = tec.next();
					tec.nextLine().trim();

					separador();

				}
				seguir = "si";
				while (seguir.equals("si")) {
					separador();
					/// mostramos la matriz
					mostrar_matriz(info);

					separador();

					// media del alumno sus notas

					// con este metodo recorremos las columna para que el usuario nos indique de que
					// alumno quiere hacer la media de sus notas
					media_notas_unalumno(info);

					suma = new String[info[0].length - 1];
//con este metodo lo que hacemos es almacenar en un string las notas y pedirle al usuariio que nos diga que nnotas se quieres sumar , tambien hemos añadido exepciones
					suma_denotas_unalumno(tec, suma, info, alu, media_notas);

					doublesuma = 0;
/// convertimos  las notas almacenadas en un string en numeros y los sumamos 
					doublesuma = convertir_string_double(suma, doublesuma);
					divisormedia = info[0].length - 1;
					// si hay mas de una asignatura se realizara la media en caso contrario no
					if (divisormedia > 1) {
						System.out.println(
								" es un " + formato.format(media(doublesuma, divisormedia, info)) + "█            ");
					} else {
						System.out.println("[[[No se puede realizar la media ya que solo hay una nota asignatura]]]");
					}

					separador();

					System.out.println("¿Quiere realizar otra media de las motas de un alumno? escriba si o no");
					seguir = tec.next();
					tec.nextLine().trim();

					separador();
				}

				break;
			case 1:
				System.out.println("->Inserte numero de ALUMNOS ");
				alu = introducion_num_teclado(tec, opcion, alum);
				alu = alu + 1;
				System.out.println("->EL  numero de MODULOS son " + (asing.length - 1));
				modulos = asing.length;

				String info1[][] = new String[alu][asing.length];

				for (int i = 0; i < info1.length; i++) {

					for (int j = 0; j < info1[0].length; j++) {

						if (i == 0 && j >= 0) {

							info1[i][j] = asing[j];
						}

						else if (i > 0 && j == 0) {

							System.out.println("-> Ingrese el nombre del alumno");

							nombres = comprobar_nombres(tec, nombres);
							info1[i][j] = nombres;

						}

						else if (i != 0 && j != 0) {
							System.out.println("-> Ingrese la calificasion de " + info1[0][j]);
							dato = string_numero(tec, dato);
							info1[i][j] = dato;

						}

					}
				}

				// media de los modulos
				while (seguir.equals("si")) {
					separador();

					mostrar_matriz(info1);

					separador();
					opcion = 0;

					recorrer_columnas(info1, opcion);

					suma = new String[info1.length - 1];

					recoger_numeros1(tec, suma, info1, alu, media_modulo);

					doublesuma = convertir_string_double(suma, doublesuma);

					divisormedia = info1.length - 1;

					if (divisormedia > 1) {
						System.out.println(
								" es un " + formato.format(media(doublesuma, divisormedia, info1)) + "█            ");
					} else {
						System.out.println("No se puede realizar la media ya que solo hay un modulo");
					}

					separador();

					System.out.println("¿Quiere realizar otra media de modulos? escriba si o no");
					seguir = tec.next();
					tec.nextLine().trim();

					separador();
				}
				seguir = "si";
				while (seguir.equals("si")) {
					separador();

					mostrar_matriz(info1);

					separador();

					// media de las notas
					media_notas_unalumno(info1);
					suma = new String[info1[0].length - 1];
					divisormedia = info1[0].length - 1;
					doublesuma = 0;
					suma_denotas_unalumno(tec, suma, info1, alu, media_notas);
					doublesuma = convertir_string_double(suma, doublesuma);

					System.out.println(
							" es un " + formato.format(media(doublesuma, divisormedia, info1)) + "█            ");

					separador();

					System.out.println("¿Quiere realizar otra media de modulos? escriba si o no");
					seguir = tec.next();
					tec.nextLine().trim();

				}
				break;

			default:

				System.out.println("!POR FAVOR SIGA LAS INSTRUCIONES DEL PROGRAMA¡");
			}
			System.out.println("¿DESEA REALIZAR UNA NUEVA TABLA? escriba si o no ");
			seguir = tec.next();
			tec.nextLine();

		}
		tec.close();
	}

///  con este metodo comprobamos si los nombres de los alumnos solo contienen letras en ese caso se guarda y si no es asi se repite hasta que el usuario inserte correctamente el nombre
	private static String comprobar_nombres(Scanner tec, String nombres) {
		int a = 0;
		for (int b = 0; b < 1; ++b) {

			nombres = tec.next().trim().toUpperCase();

			for (int k = 0; k < nombres.length(); ++k) {

				if (Character.isLetter(nombres.charAt(k))) {
					++a;
				}

			}
			if (a != nombres.length()) {

				System.err.println("Introduzca letras no numeros ni caracteres");
				b = -1;
				a = 0;

			}
		}
		return nombres;
	}

// con este metodo vemos si las notas han sido insertada de manera correcta,es decir, si se han insertado numeros y si no se repitira hasta que se introduzca los numeros corectamente.
	private static String string_numero(Scanner tec, String dato) {
		for (int a = 0; a < 1; ++a) {

			try {

				dato = tec.next().trim();
				double numero = 0;
				numero = Double.parseDouble(dato);
//con esto evitamos que se introduzcan numeros negativos y mayores de 10 para las notas
				if (numero < 1 || numero > 10) {
					System.err.println("ingrese numeros del 1 al 10");
					a = -1;
				}

			} catch (NumberFormatException ex) {
				System.err.println("No es un número vuelva a introducirlo");
				a = -1;

			}

		}
		return dato;
	}

//este metodo solo es para la introducion de los tamaños tanto de la fila como de columnas
	private static int introducion_num_teclado(Scanner tec, int datos, String texto) {

		for (int a = 0; a < 1; ++a) {

			try {
				System.out.println(texto);
				datos = tec.nextInt();
				tec.nextLine();

				if (datos < 1) {
					System.err.println("Ingrese numeros positivos");
					a = -1;
				}

			}

			catch (InputMismatchException e) {

				System.err.println("!Introduzca solo  numeros por ejemplo 1....¡");
				tec.nextLine();
				a = -1;

			}

		}
		return datos;

	}

//con este metodo recorecorremos las columnas de la matriz y añdimos las notas en un vector de tipo string y evitamos que el usuario elija un numero que este fuera de la matriz
	private static int suma_denotas_unalumno(Scanner tec, String[] suma, String[][] info, int datos, String texto) {

		for (int a = 0; a < 1; ++a) {

			try {

				System.out.println(texto);
				datos = tec.nextInt();

				int g;
				g = 0;
				for (int b = 0; b < info.length - (info.length - 1); ++b) {

					for (int j = 1; j < info[a].length; ++j) {

						suma[g] = info[datos][j];
						++g;
					}

				}
//con esto establecemos que si solo hay un dato no se realizen medias
				if (g > 1) {
					System.out.print("       █Media de las notas del alumno " + info[datos][0]);
				}

			} catch (InputMismatchException e) {

				System.err.println("!Introduzca solo  numeros por ejemplo 1....¡");
				tec.nextLine();
				a = -1;

			} catch (ArrayIndexOutOfBoundsException e1) {

				System.err.println("!Introduzca solol los numeros que salen al lado del alumno o modulo....¡");
				tec.nextLine();
				a = -1;
			}
		}
		return datos;

	}
	// le mostramos al usuario las notas de un alumno concreto

	private static void media_notas_unalumno(String[][] info) {

		int cont = 1;
		for (int a = 0; a < info.length - (info.length - 1); ++a) {

			for (int j = 1; j < info.length; ++j) {

				System.out.println("(" + cont + ")" + info[j][0] + " ");
				++cont;
			}
		}
	}

	// con este metodo recorecorremos las columnas de la matriz y añdimos las notas
	// deun modulo en un vector de tipo string y evitamos que el usuario elija un
	// numero que este fuera de la matriz
	private static int recoger_numeros1(Scanner tec, String[] suma, String[][] info, int datos, String texto) {

		for (int a = 0; a < 1; ++a) {

			try {

				System.out.println(texto);
				datos = tec.nextInt();

				int g = 0;
				for (int i = 0; i < info.length - (info.length - 1); i++) {

					for (int j = 1; j < info.length; j++) {

						suma[g] = info[j][datos];
						++g;

					}

				}
				if (g > 1) {
					System.out.println("   █ Media del modulo  " + info[0][datos] + " es un ");
				}
			}

			catch (InputMismatchException e) {

				System.err.println("!Introduzca solo  numeros por ejemplo 1....¡");
				tec.nextLine();
				a = -1;
//con este metodo si se introduce letras la exepcion salta
			} catch (ArrayIndexOutOfBoundsException e1) {

				System.err.println("!Introduzca solo los numeros que salen al lado del alumno o modulo....¡");
				tec.nextLine();
				a = -1;
			}
		}

		return datos;
	}

//con este metodo mostramos la matriz
	private static void mostrar_matriz(String[][] info) {
		for (int i = 0; i < info.length; i++) {
			for (int j = 0; j < info[i].length; j++) {
				System.out.print(info[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

//para que se vea mas vistoso
	private static void separador() {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
	}

//con este metodo realizamos la division y nos da la media de los modulos o las notas de un alumno
	private static double media(double doublesuma, double divisormedia, String[][] info) {

		divisormedia = doublesuma / divisormedia;
		return divisormedia;
	}

//obtenemos el numero total de la suma de un modulo o las notas de un alumno
	private static double convertir_string_double(String[] suma, double doublesuma) {
		String suma1;
		doublesuma = 0;
		for (int j = 0; j < suma.length; j++) {

			suma1 = suma[j];

			doublesuma = doublesuma + Double.parseDouble(suma1);

		}
		return doublesuma;
	}

//recorremos las columnas para mostrarselo al usuario.
	private static void recorrer_columnas(String[][] info, int opcion) {
		int d = 1;
		for (int a = 0; a < info.length - (info.length - 1); ++a) {

			for (int j = 1; j < info[a].length; ++j) {

				System.out.println("(" + d + ")" + info[opcion][j] + " ");
				++d;
			}

		}
	}
}