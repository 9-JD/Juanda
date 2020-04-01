package prueba;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class split {
	static int b = 0;
	static int numero = 0;
	static String nombre = " ";
	static String nombre1 = " ";
	static List<String> ListaA = new ArrayList<>();
	static List<String> ListaH = new ArrayList<>();
	static List<String> ListaO = new ArrayList<>();
	static List<String> ListaR = new ArrayList<>();
	static char[] Comp = { 'A', 'H', 'O', 'R' };
	static int [] ordendelista = {0, 1, 2, 3  };
	static int lista_elegida = 0;
	
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		
		String seguir = "si";
		
		
	//	
		while (seguir.equals("si")) {


			nombre = formato_del_texto(tc);
			averiguar_lista(nombre);
			System.out.println("-->¿Desa introducir mas alumnos a las listas? indique si o no (numero total de alumnos en todas las listas->) ");
			seguir = tc.nextLine();
			
		}

		
		
		SEPARADOR();
		for (int a=0; a<Comp.length; ++a) {
			lista_elegida = a;	
			lista_perteneciente();
			System.out.println();
				
		}

		SEPARADOR();
		
		
		System.out.println("¿Hay algun error en el apellido o en el  nombre indique si o no  ?");
		seguir = tc.nextLine();
		
		if (seguir.equalsIgnoreCase("si")) {
			
			System.out.println("Por favor indique en la lista que hay problemas lista 1, 2 ,3, 4");

		int	listamal = tc.nextInt();

			switch (listamal) {
			case 1:
				correcion(tc, ListaA);
				modificacion(tc, ordendelista[0], ListaA);
				
				
				break;
			case 2:

				correcion(tc, ListaH);
				modificacion(tc, ordendelista[1], ListaH);
				
				break;
			case 3:

				correcion(tc, ListaO);
				modificacion(tc, ordendelista[2], ListaO);
				
				break;
			case 4:

				correcion(tc, ListaR);
				modificacion(tc, ordendelista[3], ListaR);
				
				

			}

		}

		System.out.println("Programa finalizado");

	}
		
		
		
	private static void correcion(Scanner tc, List<String> lista) {

		int index = -1;

		while (index == -1) {
			
			try {
				System.out.println("->Introduzca el apellido y el nombre que esta mal escrito ");
				 nombre = formato_del_texto(tc);
				index = lista.indexOf(nombre);

			} catch (ArrayIndexOutOfBoundsException e1) {

				System.out.println(" mal escrito");
				 tc.nextLine();
			}

		}

	}	
		
		
	private static void modificacion(Scanner tc, int num, List lista) {
		System.out.println("->Introduzca el nombre y appelidos bien escrito ");
		nombre1 = formato_del_texto(tc);
if (num<3) {
		if (nombre1.charAt(0) >= Comp[num] && nombre1.charAt(0) < Comp[num + 1]) {
			lista.set(lista.indexOf(nombre), nombre1);
			 lista_elegida=num;
				lista_perteneciente();	
		

		}

		else {
			System.out.print("!No pertenece a esta lista¡ ");

			lista.remove(lista.indexOf(nombre));
			averiguar_lista(nombre1);
			lista_perteneciente();
		}
	}

else if(num==3) {
	
	if (nombre1.charAt(0) >= Comp[num]) {
		lista.set(lista.indexOf(nombre), nombre1);
		 lista_elegida=num;
		lista_perteneciente();

	}

	else {
		System.out.println("!No pertenece a esta lista¡ ");

		lista.remove(lista.indexOf(nombre));
		averiguar_lista(nombre1);
		lista_perteneciente();
	}
	
	
	
	
	
}




	}	
		
		
		

	
	
	
	
		
		
		
	

	private static String formato_del_texto(Scanner tc) {

		int num_apell = numero_maximo_appell_nombres(tc, 1);
		int nombres = numero_maximo_appell_nombres(tc, 2);
		String nombre=" ";
		int pos = 0;
numero=0;
		while (numero < 3) {
			try {
				System.out.print("Introduce Apellidos y nombre en el siguiente formato--> Apellidos, Nombre ");
			 nombre = tc.nextLine().toUpperCase().trim();
				String[] nombre_split = nombre.split("(\\s+)");
				
				
				if (num_apell == 1) {

					pos = 0;
					letra_antes_coma(nombre_split, pos);
					metodo_split(pos, nombre_split);

				}

				else if (num_apell == 2) {

					pos = 0;
					palabra_sin_coma(pos, nombre_split);
					pos = 1;
					metodo_split(pos, nombre_split);

				}

				if (num_apell == 1 && nombres == 1) {
					pos = 1;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);

				}

				else if (num_apell == 2 && nombres == 1) {
					pos = 2;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);
				} else if (num_apell == 1 && nombres == 2) {

					pos = 1;
					palabra_sin_coma(pos, nombre_split);

					nombre_corre(pos, nombre_split);

					pos = 2;
					palabra_sin_coma(pos, nombre_split);

					nombre_corre(pos, nombre_split);

				} else if (num_apell == 2 && nombres == 2) {

					pos = 2;
					palabra_sin_coma(pos, nombre_split);

					nombre_corre(pos, nombre_split);

					pos = 3;
					palabra_sin_coma(pos, nombre_split);
					nombre_corre(pos, nombre_split);

				}
			} catch (ArrayIndexOutOfBoundsException e1) {

				System.err.println("Revise los elementos recuerde que debe ingresar apellios cant->" + num_apell
						+ " y nombre cant-> " + nombres);
			}
		}
	return nombre;

	}

	private static int numero_maximo_appell_nombres(Scanner tc, int a) {

		if (a == 1) {
			System.out.println("Introduzca el numero de apellidos 1 O 2");
		} else {

			System.out.println("Introduzca el numero de nombres 1 O 2");

		}
		int num = 0;
		while (num < 1 || num > 2) {

			try {
				num = tc.nextInt();

				if (num < 1 || num > 2) {
					System.out.print("Introduzca  numeros de  1 O 2");
				}

				tc.nextLine();
			} catch (InputMismatchException e1) {

				System.err.println("solo numeros 1 o 2");
				tc.nextLine();

			}

		}

		return num;
	}

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
			System.out.println("El apellido solo puede terner letras");
			numero = 0;
		}
	}

	private static void nombre_corre(int pos, String[] nombre_split) {
		if (b == nombre_split[pos].length()) {
			++numero;
		} else {
			System.out.println("Debe de insertar solamente el nombre correctamente " + nombre_split[pos].length());
			numero = 0;
		}
	}

	private static void palabra_sin_coma(int pos, String[] nombre_split) {
		b = 0;
		for (int i = 0; i < nombre_split[pos].length(); ++i) {

			char a = nombre_split[pos].charAt(i);
			if (Character.isLetter(a)) {
				++b;
			}
		}
	}

	private static void letra_antes_coma(String[] nombre_split, int pos) {
		b = 0;
		for (int i = 0; i < nombre_split[pos].length() - 1; ++i) {

			char a = nombre_split[pos].charAt(i);
			if (Character.isLetter(a)) {
				++b;
			}
		}
	
	}
	
	
	private static void averiguar_lista(String nombre) {
		char inicial = nombre.charAt(0);

		if (inicial == 'Ñ') {
			System.out.println("Se ha introducido en la tercera lista ");
			ListaH.add(nombre);
			lista_elegida = 2;
		} else {

			if (inicial >= Comp[0] && inicial < Comp[1]) {
				System.out.println("->Se ha introducido en la primera lista ");
				ListaA.add(nombre);
				lista_elegida = 0;

			} else if (inicial >= Comp[1] && inicial < Comp[2]) {
				ListaH.add(nombre);
				System.out.println("->Se ha introducido en la segunda  lista ");
				lista_elegida = 1;

			} else if (inicial >= Comp[2] && inicial < Comp[3]) {
				ListaO.add(nombre);
				System.out.println("->Se ha introducido en la tercera lista ");
				lista_elegida = 2;

			} else if (inicial >= Comp[3]) {
				ListaR.add(nombre);
				System.out.println("->Se ha introducido en la cuarta lista ");
				lista_elegida = 3;

			}
		}
	}
	
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
	

	private static void SEPARADOR() {
		System.out.println("_______________________________________________________ ");
		System.out.println();
	}
	
	private static void mostrarlistas(List<String> ListaA) {
		for (String a : ListaA) {

			System.out.println("Apellidos y nombre " + a);

		}
	}

	
	private static void lista_perteneciente() {
		if (lista_elegida == 0) {
			System.out.println("--------------Lista A-G--(Primera lista)------*Numero de alumnos*--> "+ListaA.size());	
			mostrarlistas(ListaA);
		} else if (lista_elegida == 1) {
			System.out.println("--------------Lista H-Ñ--(Segunda lista)------*Numero de alumnos*--> "+ListaH.size());	
			mostrarlistas(ListaH);
		} else if (lista_elegida == 2) {
			System.out.println("--------------Lista O-Q--(Tercera lista)------*Numero de alumnos*--> "+ListaO.size());	
			mostrarlistas(ListaO);
		} else if (lista_elegida == 3) {
			System.out.println("--------------Lista R-Z--(Cuarta lista)-------*Numero de alumnos*--> "+ListaR.size());
			mostrarlistas(ListaR);
		}
	}
	
}

