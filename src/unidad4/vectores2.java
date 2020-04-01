package unidad4;

import java.util.Scanner;

public class vectores2 {

	public static void main(String[] args) {
		// creamos el scanner

		Scanner tec = new Scanner(System.in);
		// creamos el vector que contendra las clases de energia

		int[] energia = { 0, 0, 0, 0, 0 };

		// creamos el vector que contendra las clases que usaremos en lo ultimo para que
		// le aparezca al usuario

		char[] letras = { 'A', 'B', 'C', 'D', 'E' };

		// creamos los acumuladores de cada unas de las categorias
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int numero_de_visitas = 0;

		// las variables para ver cual es la categoria que recibe mas visitas y la que
		// menos, por otro lado tabmbien en el caso que sean igual todas las visitas
		int mayor = 0;

	
		int mas = 0;
		int menor = 0;
		int numeros_iguales = 0;
		int menos = 0;
		int mitad = 0;
		int mayor1;

	
//condicion del wile 
		int final1 = 0;
		System.out.println("...........................Iniciando programa...............................................");
		while (final1 != 1) {
			// hemos establecido la variable decision la cual sera la que guarde las
			// deciciones tomadas por el usuario siguiendo las intruciones del programa
			System.out.println("->¿La casa tiene categoría energética ? indique SI O NO ");

			String decision = tec.next().trim();
			// si indica que si debera de indicar que categoria energetica es , en caso
			// contrario se registrara la vista en categoria no energetica
			if (decision.equals("SI")) {

				System.out.println("->Inserte la categoría energética al que pertenece la casa A, B, C, D ");

				decision = tec.next().trim();

				switch (decision) {

				case "A":
					numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
					++a;
					energia[0] = a;
					break;

				case "B":
					numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
					++b;
					energia[1] = b;
					break;

				case "C":
					numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
					++c;
					energia[2] = c;
					break;

				case "D":
					numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
					++d;
					energia[3] = d;
					break;

				default:
/// por si escribe algo que no esta recogido en el programa
					System.out.println("!Debe elegir entre A, B , C, D ¡");

				}

			} else if (decision.equals("NO")) {
				System.out.println("»La casa no tiene categoria energetica a sido registrado como tal ");
				++e;
				energia[4] = e;
				++numero_de_visitas;
			}
//debe indica si o no en mayusculas
			else {
				System.out.println(
						"!Por favor escriba en mayuscula SI O NO para poder continuar con el programa gracias¡");
			}
			// el usuario puede finalizar el programa o continuar con el
			System.out.println("->si quiere salir escriba Fin en caso contrario escriba cualquier caracter");
			decision = tec.next().trim();
			if (decision.equals("Fin")) {

				System.out.println("~~~Fin de recogida de datos mostrando resultados...~~~");
				final1 = 1;

			}
		}
// para coger al mayor y menor debemos tener un punto de referencia que sera el primer dato del vector, lo almacenamos en una variable y luego creamos un bucle donde si es mayor al numero almacenado en la variable se cambiara y asi sabremos el mayor y por el mismo procedimiento tambien el mejor
		mayor = energia[0];

		menor = energia[0];
		numeros_iguales = energia[0];

		int cont = -1;
		System.out.println(
				"****************************NUMERO DE CADA CASAS VISITADAS****************************************");
		System.out.println("->Numero de vistas realizadas en total " + numero_de_visitas);
		for (int i = 0; i < 5; ++i) {

			if (mayor < energia[i]) {
				mayor = energia[i];

			}

			else if (menor > energia[i]) {

				menor = energia[i];

			}
//esto lo realizamos para ver si los diferentes datos almacenados en el vector son iguales
			else if (numeros_iguales == energia[i]) {

				++cont;

			}
//se mostraran todas las visitas realizadas a sus categorias.
			switch (i) {

			case 0:

				System.out.println("█ Numero de casas vistadas de la categoria energetica (A)  " + energia[i]);
				break;
			case 1:

				System.out.println("█ Numero de casas vistadas de la categoria energetica (B)  " + energia[i]);
				break;
			case 2:

				System.out.println("█ Numero de casas vistadas de la categoria energetica (C)  " + energia[i]);
				break;
			case 3:

				System.out.println("█ Numero de casas vistadas de la categoria energetica (D)  " + energia[i]);
				break;
			case 4:

				System.out.println("█ Numero de casas vistadas que no tienen categoria energetica (E)  " + energia[i]);
				break;

			}

		}

		System.out.println("------------------------------------------------------------------------------");
//si cont es menor a 4 sinifica que todos los datos dentro del vector no son iguales 
		if (cont < 4) {
//debemos ahora saber cuantos numeros mayores hay para luego poder crear el vector de numeros mayores igual con los menores y aquellos que estan en la media
			for (int k = 0; k < 5; ++k) {

				if (mayor == energia[k]) {

					++mas;

				} else if (menor == energia[k]) {
					++menos;
				}

				else if (energia[k] < mayor && energia[k] > menor) {

					++mitad;

				}

			}

			System.out.println(
					"*****************************CLASIFICACION DE MAYOR , MENOR Y INTERMEDIAS CASAS VISITADAS***************************************");

			// una vez que sabemos el tamaño de los vectrores que creremos construir , pues
			// lo realizamos y le indicamos el tamaño que tendran.
			char b1[] = new char[mas];
			char b2[] = new char[menos];
			char b3[] = new char[mitad];
			int b4[] = new int[mitad];
			aer(energia, letras, mayor, b1);
//mayor
			System.out.print("· El mayor numero de casa visitadas son de las categorias:");
			mayor_menor(b1);
			System.out.println("con " + mayor + " visitas");
//para ahorrar codigo como la estructura es igual a la anterior solo debemos de cambiar el valor de las variables

//menor			

			mayor1 = mayor;
			mayor = menor;
			b1 = b2;

			aer(energia, letras, mayor, b1);

			System.out.print("· El menor numero de casa visitadas son de las categorias:");
			mayor_menor(b1);
			System.out.println("con " + menor + " visitas");
//con esto vamos a establecer las visitas que estan entre las mayores y inferiores.
			mayor = mayor1;
//con esto optenemos el tipo de categoria y el los numeros de las visitas en dos vectores diferentes 
			int k3 = 0;
			for (int k2 = 0; k2 < energia.length; ++k2) {
				if (energia[k2] < mayor && energia[k2] > menor) {
					mas = k2;

					b3[k3] = letras[mas];
					b4[k3] = energia[mas];
					++k3;
				}
			}
			// con esto optenemos el numero e visitas lo oredenamos de orden de mayor a
			// menor y tambien con su letra correpondiente
			int s = 0;
			char s1 = ' ';
			for (int k4 = 0; k4 < b4.length; ++k4) {

				for (int k5 = 0; k5 < b4.length; ++k5) {

					if (b4[k4] > b4[k5]) {

						s = b4[k4];

						b4[k4] = b4[k5];

						b4[k5] = s;

						s1 = b3[k4];
						b3[k4] = b3[k5];
						b3[k5] = s1;
					}

				}

			}
			// por si solo hay mayores y menores indicamos lo siguiento si la logitud del
			// vector no es mayor que cero que indique que no hay numero de visitas situado
			// en la media
			if (b3.length > 0) {
				System.out.print("·Las casa visitadas entre la media son de categoria :");

				for (int k = 0; k < b4.length; ++k) {
					System.out.print(b3[k] + " con (" + b4[k] + ") visitas ");
				}

			} else {
				System.out.print("++++++++No hay visitas  que este entre el mayor numero y menor vistas ++++++++ ");
			}

		} else {
			System.out.print(
					"+++++++++Las visitas a las casas con difrenetes tipos de categorias energeticas son iguales++++++++ "
							+ energia[0]);
		}
		tec.close();
	}

	private static void mayor_menor(char[] b1) {
		for (int k = 0; k < b1.length; ++k) {
			System.out.print(" " + b1[k] + ", ");
		}
	}

	private static void aer(int[] energia, char[] letras, int mayor, char[] b1) {

		int k2 = 0;
		for (int k1 = 0; k1 < energia.length; ++k1) {

			if (mayor == energia[k1]) {
				b1[k2] = letras[k1];
				++k2;
			}
		}
	}

//ahoramos codigo ya que esto se repite
	private static int opcion_elegida(int numero_de_visitas, String decision) {
		System.out.println("La categoría energética al que pertenece la casa es (" + decision
				+ ") »HA SIDO REGISTRADO EN EL SISTEMA");
		++numero_de_visitas;
		return numero_de_visitas;
	}

}
