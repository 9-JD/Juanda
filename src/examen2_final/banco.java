package examen2_final;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import examen2eva.alu;

public class banco {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		List<persona> listaclientes = new ArrayList<>();
		List<cuentas> listacuentas = new ArrayList<>();
		System.out.println("------------------.Bienvenido al banco DAM.------------------------------");

		int seguir = 0;
// las diferentes opciones para llevar que debe de elegir el empleado
		while (seguir == 0) {
			int opcion = control_elecion(tec);
			separador();
			switch (opcion) {
			case 1:
				System.out.println("->Crear clientes");
				crearcliente(tec, listaclientes);
				separador();
				break;

			case 2:
				System.out.println("->Crear cuentas ");
				crear_cuenta(tec, listaclientes, listacuentas);
				separador();
				break;

			case 3:
				System.out.println("->Ingresar dinero  ");
				ingresar_dinero(listacuentas, tec);
				separador();
				break;

			case 4:

				System.out.println("->Sacar dinero  ");

				boolean si = sacar_dinero(listacuentas, tec);

				if (si) {
					System.out.println("Operacion realizada con exito  ");

				} else {
					System.out.println("¡Error no se ha hecho la operacion!");
				}

				separador();
				break;

			case (5):

				System.out.println("->Modificasion de datos del cliente    ");
				modificasion_datos(listaclientes, listacuentas, tec);
				separador();
				break;

			case (6):

				System.out.println("->Modificasion de datos de la cuenta     ");

				modificacion_cuenta(tec, listacuentas);
				break;

			case (7):
				cuentas a = new cuentas();
				persona b = new persona();
				System.out.println("->Mostrar todos los usuarios y todas las cuentas.");
				System.out.println("------------------------------------- Cuentas-----------------------------");
				mostrartodas_cuentas(listacuentas);

				System.out.println(" ------------------------Clientes--------------------");
				mostrar_todos_clientes(listaclientes);

				break;

			case (8):
				System.out.println("->Mostrar un usuario y sus cuentas");

				mostrarsolouno(tec, listacuentas);

			}
			System.out.println(
					"Si quiere volver al panel principal pulse 0 , si a terminado todas las operaciones pulse 1");
			seguir = bucle_while(tec);
			tec.nextLine();
			separador();

		}

	}

// se muestra un cliente solo en concreto
	private static void mostrarsolouno(Scanner tec, List<cuentas> listacuentas) {
		int c = 0;

		if (listacuentas.size() > 0) {
			while (c == 0) {

				String dni = comprobar_dni(tec);

				for (int i = 0; i < listacuentas.size(); ++i) {
					if (dni.equals(listacuentas.get(i).getTitular().getNif())) {
						System.out.println("Nombre " + listacuentas.get(i).getTitular().getNombre() + " dni "
								+ listacuentas.get(i).getTitular().getNif() + " numero de cuenta "
								+ listacuentas.get(i).getNumero_cuenta() + " saldo " + listacuentas.get(i).getSaldo()
								+ " limite de saldo " + listacuentas.get(i).getLimite_rojo());
					}

				}
				System.out.println("-->Para salir pulse 1 y para continuar  0 <-- ");
				c = bucle_while(tec);
				tec.nextLine();

			}
		} else {
			System.out.println("debe ingresar antes clientes y sus cuentas");
		}
	}

// se muestran todos los clientes
	private static void mostrar_todos_clientes(List<persona> listaclientes) {
		for (int i = 0; i < listaclientes.size(); i++) {

			System.out.println("Nombre del cliente " + listaclientes.get(i).getNombre() + " telefono "
					+ listaclientes.get(i).getTelefono() + " dni " + listaclientes.get(i).getNif());

		}
	}

//muestra todas las cuentas
	private static void mostrartodas_cuentas(List<cuentas> listacuentas) {
		for (int i = 0; i < listacuentas.size(); i++) {

			System.out.println("Nombre del cliente " + listacuentas.get(i).getTitular().getNombre()
					+ " Numero de cuenta " + listacuentas.get(i).getNumero_cuenta() + " Saldo actual "
					+ listacuentas.get(i).getSaldo() + " Limite rojo " + listacuentas.get(i).getLimite_rojo());

		}
	}

// menu del programa dode estan las diferentes opciones que puede realizar el usuario
	private static int control_elecion(Scanner tec) {
		int c = 0;
		int opcion = 0;
		while (c < 1) {
			// salto de linea
			try {
				String n = System.getProperty("line.separator");
				System.out.println("Indique que accion quiere realizar(pulsando los numeros indicados): " + n
						+ " (1)Crear cliente " + n + " (2)Crear cuenta" + n + " (3)ingeresar dinero" + n
						+ " (4)sacar dinero" + n + " (5)modificar datos de clientes" + n
						+ " (6)modificar datos de cuentas " + n + " (7)mostrar todos los clientes" + n
						+ " (8)mostrar un cliente concreto");
				opcion = tec.nextInt();
				tec.nextLine();
				// el menu solo tiene sieta opciones si y solo se pueden selecionar esas siete y
				// solo numeros
				if (opcion >= 1 && opcion <= 8) {

					++c;

				} else {
					System.out.println("------->!numeros del 1 al 6¡");
				}

			} catch (InputMismatchException e) {
				System.out.println("!numeros del 1 al 6¡");

				tec.nextLine();

			}

		}
		return opcion;

	}

	// para separra los apartados
	private static void separador() {
		System.out.println("_____________________________________________________________________");

	}

	// con este metodo creamos las cuentas de los clientes, enl programa esta
	// establecido qe si existe un usuario con ese dni no deja que se introduzca de
	// nuevo y avisa al usario de dicho acontecimiento
	private static void crearcliente(Scanner tec, List<persona> listaclientes) {
		persona usuario;
		int pos = 0;
		int continuar = 1;
		while (continuar != 0) {
			usuario = new persona();

			String dni = comprobar_dni(tec);
			if (listaclientes.size() == 0) {

				continuar = crearcliente0(tec, listaclientes, usuario, dni);

			} else {
				int acumulador = 0;
				for (int i = 0; i < listaclientes.size(); i++) {

					if (dni.equals(listaclientes.get(i).getNif())) {
						pos = i;
						++acumulador;

					}

				}

				if (acumulador == 1) {

					System.out.println("El cliente con el dni " + listaclientes.get(pos).getNif() + " ya exisite  ");

				} else {
					continuar = crearcliente0(tec, listaclientes, usuario, dni);
				}

			}
		}
	}

	private static int crearcliente0(Scanner tec, List<persona> listaclientes, persona usuario, String dni) {
		int continuar;
		usuario.setNif(dni);
		String nombre = comprobacion_nombre(tec);
		usuario.setNombre(nombre);
		String tele = comprobar_telefono(tec);
		usuario.setTelefono(tele);
		listaclientes.add(usuario);
		System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
		continuar = bucle_while(tec);
		tec.nextLine();
		return continuar;
	}

//con este controlamos que el usuario solo introduzca el tamaño y el formato correcto para numeros de telefono
	public static String comprobar_telefono(Scanner tec) {

		int c = 0;

		String telefono = "";
		while (c < 1) {
			int b = 0;
			System.out.println("Ingrese el numero de telefono ");
			telefono = tec.nextLine().trim();

			for (int i = 0; i < telefono.length(); i++) {
				char a = telefono.charAt(i);
				if (Character.isDigit(a)) {

					++b;

				}

			}
			if (b == telefono.length() && telefono.length() == 9) {
				c++;

			} else {
				System.out.println("numero de telefono mal introducido ");
			}

		}

		return telefono;
	}

//con este metodo comprobamos que el usuario establezca correctamente el dni ya que comprueba la letra y que todos sus elementos esten corretamente añadidos.
	private static String comprobar_dni(Scanner tec) {
		String dic = "TRWAGMYFPDXBNJZSQVHLCKE";
		int c = 0;
		String dni = "";
		while (c < 1) {
			try {
				System.out.println("Ingrese el dni del usuario ");
				dni = tec.nextLine().trim().toUpperCase();
				String dni_numero = dni.substring(0, dni.length() - 1);

				int dni1 = Integer.parseInt(dni_numero);

				int dni2 = dni1 % 23;
				char ultimo = dni.charAt(dni.length() - 1);
				char ultimo_dic = dic.charAt(dni2);
				if (Character.isLetter(ultimo)) {

					if (ultimo_dic == ultimo) {
						++c;
					} else {
						System.out.println("dni mal introducido ");
					}

				}

			} catch (NumberFormatException e1) {

				System.out.println("dni mal introducido ");
				tec.nextLine();

			}

		}

		return dni;

	}

//con este metodo miramos que el usuario introduzca solo letras y que existan espacios
	private static String comprobacion_nombre(Scanner tec) {

		String nombre = "";

		int c = 0;
		while (c < 1) {
			int b = 0;
			int l = 0;

			System.out.println("Ingrese el nombre del usuario (separe el nombre y los apellidos con espacios ) ");

			nombre = tec.nextLine();
			for (int i = 0; i < nombre.length(); i++) {

				char a = nombre.charAt(i);

				if (Character.isSpaceChar(a)) {

					++b;

				} else if (Character.isLetter(a)) {

					++l;

				}

			}

			if (nombre.length() == b + l && b >= 1) {

				++c;
				return nombre;
			} else {
				System.out.println("Hay fallos vuelva a introducir el nombre y apellidos");

			}

		}

		return nombre;

	}

	// con este metodo vemos creamos las cuentas y añadimos a los clientes a las
	// cuentas.

	private static void crear_cuenta(Scanner tec, List<persona> listaclientes, List<cuentas> listacuentas) {
		int c = 1;
		if (listaclientes.size() > 0) {
			cuentas nueva_cuenta;
			persona persona;

			while (c != 0) {

				nueva_cuenta = new cuentas();

				String dni = comprobar_dni(tec);

				int acumulador = 0;
				for (int i = 0; i < listaclientes.size(); i++) {

					if (dni.equals(listaclientes.get(i).getNif())) {
						++acumulador;
						nueva_cuenta.setTitular(listaclientes.get(i));

						System.out.println("Ingrese el limite rojo");
						double limite = tec.nextDouble();
						nueva_cuenta.setLimite_rojo(limite);
						tec.nextLine();
						listacuentas.add(nueva_cuenta);

						System.out.println("Generando su numero de cuenta ....");
						String cuenta = nueva_cuenta.getNumero_cuenta();
						System.out.println("-->Su numero de cuenta es  " + cuenta);

					}

				}

				if (acumulador == 0) {
					System.out.println(
							"Lo sentimos mucho pero ese dni no existe, primero debe ingeresar los datos del cliente vuelva al menu principal");

				}
				System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
				c = bucle_while(tec);
				tec.nextLine();
			}
		} else {
			System.out.println("Debe de introducir antes a los clientes.");
		}

	}

//CON ESTE METODO INGRESAMOS DINERO en las cuentas, en todos los metdos tenemos en cuenta que deben de tener contenido es decir usuarios y cuantas antes de realizarlos
	private static void ingresar_dinero(List<cuentas> listacuentas, Scanner tec) {

		if (listacuentas.size() > 0) {

			int c = 1;
			while (c != 0) {

				String nif = comprobar_dni(tec);

				int probalidad = busqueda(listacuentas, nif, tec);

				if (probalidad >= 0) {
					System.out.println("su saldo actual es de " + listacuentas.get(probalidad).getSaldo());
					System.out.println("escriba la cantidad que quiere ingresar   ");
					double ingresar = tec.nextDouble();
					tec.nextLine();

					double a = listacuentas.get(probalidad).getSaldo();
					ingresar = a + ingresar;
					listacuentas.get(probalidad).setSaldo(ingresar);
					System.out.println("su saldo actual es de " + listacuentas.get(probalidad).getSaldo());

				} else {
					System.out.println("el dni  " + nif
							+ "no se encuentra en la base de datos compruebe el dni o salga y establezca un nuevo cliente y una cuenta nueva");
				}
				System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
				c = bucle_while(tec);
				tec.nextLine();
			}

		} else {
			System.out.println("debe de crear clientes y cuentas al menos una de ambos  ");
		}

	}

	private static int bucle_while(Scanner tec) {
		int d = 0;
		int c = 0;
		while (d < 1) {

			try {

				c = tec.nextInt();

				if (c >= 0 && c <= 1) {

					++d;

				} else {
					System.out.println("------->!numeros del 0 al 1¡");
					tec.nextLine();
				}
			} catch (InputMismatchException e) {
				System.out.println("!numeros del 0 al 1¡");
				tec.nextLine();

			}

		}
		return c;
	}

// con este metodo lo que hacemos es sacar el dinero y vemos el limite antes de sacarlo ya que si supera dicho limite no se realizara la operacion.
	public static boolean sacar_dinero(List<cuentas> listacuentas, Scanner tec) {

		if (listacuentas.size() > 0) {
			int c = 1;
			while (c != 0) {

				String nif = comprobar_dni(tec);

				double limite = 0;
				double saldo = 0;

				int probalidad = busqueda(listacuentas, nif, tec);
				System.out.println("su saldo actual es de " + listacuentas.get(probalidad).getSaldo()
						+ "su limite de numero rojos es de " + listacuentas.get(probalidad).getLimite_rojo());
				System.out.println("-->escriba la cantidad que quiere sacar   ");

				double sacar = tec.nextDouble();
				tec.nextLine();
				if (probalidad >= 0) {

					limite = listacuentas.get(probalidad).getLimite_rojo();

					saldo = listacuentas.get(probalidad).getSaldo();
					limite = limite * -1;

					if (limite == 0 && saldo - sacar < 0) {

						return false;

					}

					else if (limite > (saldo - sacar)) {

						return false;

					} else {

						listacuentas.get(probalidad).setSaldo(saldo - sacar);
						System.out.println("su saldo actual es de " + listacuentas.get(probalidad).getSaldo()
								+ "su limite de numero rojos es de " + limite);
						return true;

					}

				}
				System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
				c = bucle_while(tec);
				tec.nextLine();
			}
		} else {
			System.out.println("debe de crear clientes y cuentas al menos una de ambos  ");
		}

		return false;
	}

//este metodo es fundamental ya que es el buscador de las dni para luego apliacrlo a los demas metodos.

	private static int busqueda1(List<cuentas> listacuentas, String nif, Scanner tec) {
		String acumulador = "";

		for (int i = 0; i < listacuentas.size(); ++i) {

			if (nif.equals(listacuentas.get(i).getTitular().getNif())) {

				return i;

			}
		}
		return -1;

	}

	private static int busqueda(List<cuentas> listacuentas, String nif, Scanner tec) {
		String acumulador = "";
		int a = 0;
		for (int i = 0; i < listacuentas.size(); ++i) {

			if (nif.equals(listacuentas.get(i).getTitular().getNif())) {

				acumulador += Integer.toString(i);

			}
		}

		if (acumulador.length() == 1) {

			a = Integer.parseInt(acumulador);

			return a;

		} else if (acumulador.length() > 1) {

			System.out.println("El cliente  tiene mas de una  cuenta");
			for (int i = 0; i < acumulador.length(); ++i) {

				String a1 = acumulador.substring(i, i + 1);
				a = Integer.parseInt(a1);
				System.out.println((a1) + "-> " + "DNI " + listacuentas.get(a).getTitular().getNif()
						+ " Numero de cuenta " + listacuentas.get(a).getNumero_cuenta());

			}
			System.out.println("Elije una de las cuentas  indicadas");
			int opcion = tec.nextInt();
			tec.nextLine();
			return opcion;

		}

		return -1;

	}

//con este metodo modificamos los datos tanto en el usuario como los datos de este en la cuenta
	public static void modificasion_datos(List<persona> listaclientes, List<cuentas> listacuentas, Scanner tec) {

		if (listaclientes.size() > 0 && listacuentas.size() > 0) {
			int c = 1;
			while (c != 0) {

				String id = comprobar_dni(tec);
				int pos = busqueda1(listacuentas, id, tec);

				if (pos >= 0) {
					System.out.println("indique una de las siguientes opcion, nombre(1), dni(2) y telefono(3)   ");
					int opcion = tec.nextInt();
					tec.nextLine();

					switch (opcion) {

					case 1:
						System.out.println("indique el nuevo nombre   ");
						String cambio = comprobacion_nombre(tec);
						listaclientes.get(pos).setNombre(cambio);
						listacuentas.get(pos).getTitular().setNombre(cambio);
						break;
					case 2:
						System.out.println("indique el nuevo dni   ");
						String cambio1 = comprobar_dni(tec);
						listaclientes.get(pos).setNif(cambio1);
						listacuentas.get(pos).getTitular().setNif(cambio1);
						;
						break;

					case 3:
						System.out.println("indique el nuevo telefono   ");
						cambio = comprobar_telefono(tec);
						listaclientes.get(pos).setTelefono(cambio);
						listacuentas.get(pos).getTitular().setTelefono(cambio);

					}

				} else {
					System.out.println("ese dni " + id
							+ " no se encuentra registrado por favor vaya al panel principal y registrelo");
				}

				System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
				c = bucle_while(tec);
				tec.nextLine();

			}
		} else {
			System.out.println("debe de crear clientes y cuentas al menos una de ambos  ");
		}

	}

//con este metodo modificamos los datos en la cuenta
	public static void modificacion_cuenta(Scanner tec, List<cuentas> listacuentas) {
		if (listacuentas.size() > 0) {

			int c = 1;

			while (c != 0) {
				cuentas a = new cuentas();
				String id = comprobar_dni(tec);

				int pos = busqueda(listacuentas, id, tec);

				if (pos >= 0) {

					System.out.println(
							"indique una de las siguientes opcion,  Límite números rojos(1), Numero de cuenta(2)  ");
					int opcion = tec.nextInt();
					tec.nextLine();

					switch (opcion) {

					case 1:
						System.out.println("indique el nuevo limite de numero rojos  ");
						String cambio = tec.nextLine();

						double cambio1 = Double.parseDouble(cambio);
						listacuentas.get(pos).setLimite_rojo(cambio1);

						break;
					case 2:

						listacuentas.get(pos).setNumero_cuenta(a.numero_cuenta);
						System.out
								.println("su nuevo numero de cuenta es   " + listacuentas.get(pos).getNumero_cuenta());
						break;

					}

				} else {
					System.out.println("Debe de crear clientes y cuentas al menos una de ambos  ");
				}
				System.out.println("-->Para salir pulse 0 y para continuar  1 <-- ");
				c = bucle_while(tec);
				tec.nextLine();
				;
			}

		}

	}
}
