package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class listas22 {

	// declaramos las variables fuera del main para que sean visibles en todo los
	// metodos
	static int b = 0;
	static int numero = 0;
	static String nombre = " ";
	static String nombre1 = " ";
	static List<String> ListaA = new ArrayList<>();
	static List<String> ListaH = new ArrayList<>();
	static List<String> ListaO = new ArrayList<>();
	static List<String> ListaR = new ArrayList<>();
	static char[] Comp = { 'A', 'H', 'O', 'R' };
	static int[] ordendelista = { 0, 1, 2, 3 };
	static int lista_elegida = 0;

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		int total = 0;
		String seguir = "si";

		// establecemos un bucle para la entrada de datos
		while (seguir.equalsIgnoreCase("si")) {
//explicado en el metodo
			nombre = formato_del_texto(tc);
			// explicado en el metodo
			averiguar_lista(nombre);
			System.out.println(
					"-->¿Desa introducir mas alumnos a las listas? indique si o no (numero total de alumnos en todas las listas->) "
							+ (total = (ListaA.size() + ListaH.size() + ListaO.size() + ListaR.size())));
			seguir = tc.nextLine();

		}

		SEPARADOR();

		System.out.println(
				"__________________________________lISTAS DEL ALUMNADO_______________________________________________");
		// explicado en el metodo
		mostrar_todas_listas();

		SEPARADOR();

		System.out.println("¿Hay algun error en el apellido o en el  nombre indique si o no  ?");
		seguir = tc.nextLine();

		while (seguir.equalsIgnoreCase("si")) {
///le indicamos al usuario si hay problemas en las listas en caso afirmativo debera indicar en cual de ellas hay errores y cuando los subsane se le volvera a preguntar por si queire realizar nuevos cambios 
			System.out.println("Por favor indique en la lista que hay problemas lista 1, 2 ,3, 4");
			// explicado en el metodo
			int listamal = control_de_enteros(tc);
			tc.nextLine();

			// aqui tenemos un menu donde el usuario elegira la lista en donde quiere
			// realizar los cambios
			switch (listamal) {
			case 1:
				// explicado en el metodo
				correcion(tc, ListaA);
				modificacion(tc, ordendelista[0], ListaA);

				break;
			case 2:
				// explicado en el metodo
				correcion(tc, ListaH);
				modificacion(tc, ordendelista[1], ListaH);

				break;
			case 3:
				// explicado en el metodo
				correcion(tc, ListaO);
				modificacion(tc, ordendelista[2], ListaO);

				break;
			case 4:
				// explicado en el metodo
				correcion(tc, ListaR);
				modificacion(tc, ordendelista[3], ListaR);

			}
			SEPARADOR();
			mostrar_todas_listas();

			SEPARADOR();

			System.out.println("-------->¿Hay algun error en el apellido o en el  nombre indique si o no  ?");
			seguir = tc.nextLine();

		}

		System.out.println("Programa finalizado");
		tc.close();
	}

//con este metodo limitamos al usuario que solo meta numeros enteros y que estos sean del uno al 4
	private static int control_de_enteros(Scanner tc) {

		int n = -1;

		while (n < 1 || n > 4) {
			try {
				n = tc.nextInt();
				if (n < 1 || n > 4) {
					System.out.println("Solo numeros del 1 al 4 ");
				}
			} catch (InputMismatchException j) {
				System.out.println("Solo numeros enteros ");
				tc.nextLine();
			}
		}

		return n;
	}

//con este metodo cremos un bucle donde imprima todas las lista de una vez ya que al incerematr la variable a el valor de lista_elegida cambiara y se mostrarla la lista con ese valor
	private static void mostrar_todas_listas() {
		for (int a = 0; a < Comp.length; ++a) {
			lista_elegida = a;
			lista_perteneciente();
			System.out.println();

		}
	}

// con este metodo realizamos la modificasion del nombre y apellidos escritos
	private static void modificacion(Scanner tc, int num, List lista) {
		System.out.println("->Introduzca el nombre y apellidos bien escrito ");
		nombre1 = formato_del_texto(tc);
		// para no tener que estar añadiendo todas las posibilidades hemos establecido
		// num el cual se concuerda con los parametros de las 4 listas en referencia al
		// vector Comp
		if (num < 3) {
			// sacamos la primera inicial del primer apellido y lo comparamos con el del
			// vector comp si esta en ese rango entra en el if
			if (nombre1.charAt(0) >= Comp[num] && nombre1.charAt(0) < Comp[num + 1]) {
				// modifica el nombre mal escrito e introduce el nuevo nombre
				lista.set(lista.indexOf(nombre), nombre1);
				// con esto abes que lista es
				lista_elegida = num;
				// lo insertamos en la lista correspondiente
				lista_perteneciente();
				// ordenamos la lista
				Collections.sort(lista);
			}

			else {
				// en el caso que no pertenezca en la lista lo que haremos es borrala y añadirla
				// a la lista que corresponde
				System.out.println();
				System.out.println("''''''''''!No pertenece a esta lista''''''''''");
				lista.remove(lista.indexOf(nombre));
				averiguar_lista(nombre1);
				lista_perteneciente();
				System.out.println();
				System.out.println("                 *Mostrando listas tras ser modificadas*");
			}
		}

		else if (num == 3) {

			if (nombre1.charAt(0) >= Comp[num]) {
				lista.set(lista.indexOf(nombre), nombre1);
				lista_elegida = num;
				lista_perteneciente();
				Collections.sort(lista);
			}

			else {

				System.out.println();
				System.out.println("''''''''''!No pertenece a esta lista''''''''''");

				lista.remove(lista.indexOf(nombre));
				averiguar_lista(nombre1);
				lista_perteneciente();
				System.out.println();

				System.out.println("                 *Mostrando listas tras ser modificadas*");

			}

		}

	}

//este metodo es el que trata el formato que entra al programa y es la parte mas dificil del programa 
	private static String formato_del_texto(Scanner tc) {

		String nombre = " ";
		int pos = 0;
		String[] nombre_split;
		numero = 0;
//hemos establecido un contado que si se cumple todas las condiciones saldra del bucle el minimo son 3 para salir ya que al menos debe tener un nombre, apellido y coma pero si se imcumple alguna del as anteriores el contador vuelve a cero esto es debido a que tambien se tiene en cuenta que los nombres esten bien escritos que la coma este en su sitio, ya lo explicaremos mas adelante
		while (numero < 3) {

			// en el caso que tenga dos nombres y un appellido.

			int b = 0;
			int a = 0;
			int c = 0;
			int d = 0;
			int index = 0;
// en esta parte vamos a analizar si la entrada de datos tienen que cumplir con la coondicion de terner al menos una coma, un espacio 
			while (c < 1) {

				nombre = nombre(tc);

				if (d == 0) {
					a = 0;

				}
				index = -1;
				b = 0;

				while (a < 1) {

					try {

						char a1 = nombre.charAt(b);

						if (Character.isSpaceChar(a1)) {
							++d;
							++a;
							++c;

						}
						++b;

					} catch (StringIndexOutOfBoundsException r) {

						++a;
						System.out.println("inserte un espacio");

					}

				}
				index = nombre.indexOf(",");
				if (index == -1) {
					System.out.println("inserte la coma de separacion");
					d = 0;
					c = 0;

				}
			}
//realizamos la conversion a un vector a traves del metdo split donde el espacio sera el referente para dicha accion 
			nombre_split = nombre.split("(\\s+)");
// si el vector tiene un tamaño de dos es que hay un apellido y un nombre
			if (nombre_split.length == 2) {

				pos = 0;
				letra_antes_coma(nombre_split, pos);
				metodo_split(pos, nombre_split);

				pos = 1;
				palabra_sin_coma(pos, nombre_split);
				nombre_corre(pos, nombre_split);

			}
// 2 apellidos y dos nombres
			else if (nombre_split.length == 4) {

				pos = 0;
				palabra_sin_coma(pos, nombre_split);
				nombre_corre(pos, nombre_split);

				pos = 1;
				letra_antes_coma(nombre_split, pos);
				metodo_split(pos, nombre_split);

				pos = 2;
				palabra_sin_coma(pos, nombre_split);

				nombre_corre(pos, nombre_split);

				pos = 3;
				palabra_sin_coma(pos, nombre_split);
				nombre_corre(pos, nombre_split);
//tres apellidos, aqui para diferenciar cuando son dos apellidos y dos nombres lo que hemos echo es que se cuanta en que pocision esta la coma y si es mayor del tamaño del primer apellido estammos antes dos apellidos y si no solo uno apellido y dos nombres  
			} else if (nombre_split.length == 3) {
				if (index == nombre_split[0].length() - 1) {

					pos = 0;
					letra_antes_coma(nombre_split, pos);
					metodo_split(pos, nombre_split);
					pos = 1;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);
					pos = 2;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);

				} else {

					pos = 0;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);

					pos = 1;
					letra_antes_coma(nombre_split, pos);
					metodo_split(pos, nombre_split);

					pos = 2;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);

				}

			} else if (nombre_split.length > 4) {
				System.out.println("---->No se ha introducido solo se aceptan dos nombres y dos apellidos como maximo");

			}

		}
		// tras estas comptobaciones se da por bueno y se carga en la variable
		return nombre;

	}

//con este metodo moramos si el nombre escrito por el usuario exite en la lista antes de proceder a la modificasion 
	private static void correcion(Scanner tc, List lista) {

		int index = -1;

		while (index == -1) {
			System.out.println("->Introduzca el nombre y apellidos mal escrito ");
			nombre = formato_del_texto(tc);

			index = lista.indexOf(nombre);

			if (index == -1) {
				System.out.println(
						"--------------------------!error vuelva a introducir el nombre mal escrito¡----------------");
			}

		}

	}

//con este formato es como se deben introducir el los datos por parte del usuario
	private static String nombre(Scanner tc) {
		String nombre;
		System.out.print("Introduce Apellidos y nombre en el siguiente formato--> Apellidos, Nombre  ");

		nombre = tc.nextLine().toUpperCase().trim();
		return nombre;
	}

//con este metodo verificamos que la palabara contiene una coma 
	private static void metodo_split(int pos, String[] nombre_split) {
		if (b == nombre_split[pos].length() - 1) {
			++numero;
			char var = nombre_split[pos].charAt(nombre_split[pos].length() - 1);
			char coma = ',';
			if (var == coma) {

				++numero;

			} else {
				System.out.println("Recuerde que debe de haber coma separando el nombre y el apellido");
				numero = 0;
			}

		} else {
			System.out.println("Error el apellido solo puede tener letras, tambien revise la posision de la coma");
			numero = 0;
		}
	}

//con este metodo comprobamos que la palabra solo tenga letras 
	private static void nombre_corre(int pos, String[] nombre_split) {
		if (b == nombre_split[pos].length()) {
			++numero;
		} else {
			System.out.println("Debe de insertar solamente el nombre con letras sin caracteres ");
			numero = 0;
		}
	}

	// con este metodo comprobamos que la palabra solo tenga letra
	private static void palabra_sin_coma(int pos, String[] nombre_split) {
		b = 0;
		for (int i = 0; i < nombre_split[pos].length(); ++i) {

			char a = nombre_split[pos].charAt(i);
			if (Character.isLetter(a)) {
				++b;
			}
		}
	}

	// con este metodo comprobamos que la palabra solo tenga letra
	private static void letra_antes_coma(String[] nombre_split, int pos) {
		b = 0;
		for (int i = 0; i < nombre_split[pos].length() - 1; ++i) {

			char a = nombre_split[pos].charAt(i);
			if (Character.isLetter(a)) {
				++b;
			}
		}

	}

// con este metodo lo 1que realizamos es ver en que lista va llos datos introducido por el usuario y se los añadimos a dicha lista y en el caso que ya esten añadido se lo informamos al usuario y tambien ordenamos las listas 
	private static void averiguar_lista(String nombre) {
		char inicial = nombre.charAt(0);
		int k = 0;
		if (inicial == 'Ñ') {
			k = evitar_iguales(ListaH, nombre);
			if (k < 2) {
				ListaH.add(nombre);
				System.out.println("->Se ha introducido en la segunda  lista ");
				lista_elegida = 1;
				Collections.sort(ListaH);}
		} else {

			if (inicial >= Comp[0] && inicial < Comp[1]) {

				k = evitar_iguales(ListaA, nombre);
				if (k < 2) {
					System.out.println("->Se ha introducido en la primera lista ");
					ListaA.add(nombre);
					lista_elegida = 0;
					Collections.sort(ListaA);

				}
			} else if (inicial >= Comp[1] && inicial < Comp[2]) {

				k = evitar_iguales(ListaH, nombre);
				if (k < 2) {
					ListaH.add(nombre);
					System.out.println("->Se ha introducido en la segunda  lista ");
					lista_elegida = 1;
					Collections.sort(ListaH);
				}

			} else if (inicial >= Comp[2] && inicial < Comp[3]) {
				k = evitar_iguales(ListaO, nombre);
				if (k < 2) {
					ListaO.add(nombre);
					System.out.println("->Se ha introducido en la tercera lista ");
					lista_elegida = 2;
					Collections.sort(ListaO);
				}

			} else if (inicial >= Comp[3]) {
				k = evitar_iguales(ListaR, nombre);
				if (k < 2) {
					ListaR.add(nombre);
					System.out.println("->Se ha introducido en la cuarta lista ");
					lista_elegida = 3;
					Collections.sort(ListaR);

				}

			}
		}
	}

//con este buclu miramos si se ya se ha introducido ese nombre ya en la lista
	private static int evitar_iguales(List a, String igual) {
		int m = 1;
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i).equals(igual)) {

				System.out.println("->El alumno  " + nombre + " no se ha introducido en la lista porque ya existe");
				++m;
			}

		}
		return m;
	}

	// le mostramos al usuario donde a sido introducido los datos
	private static void averiguar_lista1(String nombre) {
		char inicial = nombre.charAt(0);

		if (inicial == 'Ñ') {
			System.out.println("Se ha introducido en la tercera lista ");

			lista_elegida = 2;
		} else {

			if (inicial >= Comp[0] && inicial < Comp[1]) {
				System.out.println("->Se ha introducido en la primera lista ");

				lista_elegida = 0;

			} else if (inicial >= Comp[1] && inicial < Comp[2]) {

				System.out.println("->Se ha introducido en la segunda  lista ");
				lista_elegida = 1;

			} else if (inicial >= Comp[2] && inicial < Comp[3]) {

				System.out.println("->Se ha introducido en la tercera lista ");
				lista_elegida = 2;

			} else if (inicial >= Comp[3]) {

				System.out.println("->Se ha introducido en la cuarta lista ");
				lista_elegida = 3;

			}
		}
	}

//para separar los datos

	private static void SEPARADOR() {
		System.out.println("_______________________________________________________ ");
		System.out.println();
	}

//METODO PARA MOSTRAR LOS APELLIDOS Y NOMBRE DE LAS LISTAS
	private static void mostrarlistas(List<String> ListaA) {
		for (String a : ListaA) {

			System.out.println("Apellidos y Nombre " + a);

		}
	}

//PARA MOSTAR TODAS LAS LISTAS.
	private static void lista_perteneciente() {

		if (lista_elegida == 0) {
			System.out.println("--------------Lista A-G--(Primera lista)------*Numero de alumnos*--> " + ListaA.size());
			mostrarlistas(ListaA);
		} else if (lista_elegida == 1) {
			System.out.println("--------------Lista H-Ñ--(Segunda lista)------*Numero de alumnos*--> " + ListaH.size());
			mostrarlistas(ListaH);
		} else if (lista_elegida == 2) {
			System.out.println("--------------Lista O-Q--(Tercera lista)------*Numero de alumnos*--> " + ListaO.size());
			mostrarlistas(ListaO);
		} else if (lista_elegida == 3) {
			System.out.println("--------------Lista R-Z--(Cuarta lista)-------*Numero de alumnos*--> " + ListaR.size());
			mostrarlistas(ListaR);
		}

	}

}
