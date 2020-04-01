package unidad4;

import java.util.Scanner;

public class practicauno2 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		// ESTABLECEMOS LAS STRING QUE VAMOS A UTILIZAR
		String hola = "hola";

		String abc = " ";
		String espacio = " ";
		int a = 0;
		// HEMOS DECIDIDO ESTABLECER UN BUCLE PARA QUE SE VEA EL FUNCIONAMIENTO DE TODOS
		// LOS APARTADOS DEÑL EJERCISIO POR ESO SE REPITE TIENE TRES ITERACIONES
		while (a < 3) {
			// LE MOSTRAMOS AL USUARIO LO QU ETIENE QUE ESCRIBIR

			switch (a) {

			case 0:
				System.out.println(
						"Escriba  la siguente frase sin las comillas (frase " + (a + 1) + ")  “Invertir: ola k ase”");
				break;

			case 1:
				System.out.println(
						"Escriba  la siguente frase sin las comillas (frase " + (a + 1) + ") “Nombre: Pepa Pig”");
				break;

			case 2:
				System.out.println("Escriba la siguente frase sin las comillas (frase " + (a + 1)
						+ ") “Escribir: esta frase la vamos a escribir en esta sección con esta máquina”");
				break;

			}

			String s = new String();
			// LE QUITAMOS LOS ESPACIOS AL PRINCIPIO Y FINAL A LO ESCRITO POR EL UDSUARIO
			s = tec.nextLine().trim();

			int pos = 0;
			// CON CONTAINS VEMOS SI EL STRING CONTIENE EL : SI ES ASI ENTRA EN EL IF
			if (s.contains(":")) {
				// VEMOS LA POCISION DE : EN LA STRING
				pos = s.indexOf(':');
				// COGEMOS TODO HASTA :
				String comando = s.substring(0, pos).trim();
				// COGEMOS TODO DESPUES DE :
				String valor = s.substring(pos + 1).trim();
// ES SWITCH REALIZARA LA FUNCION DE EQUALS
				switch (comando) {
//CON EL BUCLE INVERTIMOS LA FRASE
				case "Invertir":
					for (int i = valor.length() - 1; i > -1; --i) {

						abc += valor.toUpperCase().charAt(i);

					}

					System.out.println(abc.trim());

					break;
//CONCATENAMOS Y LAS STRING 
				case "Nombre":
					String concatenar = hola.concat(espacio).concat(valor).trim();
					System.out.println(concatenar);
					break;
//SUSTITUIMOS PALABRAS
				case "Escribir":

					System.out.println(valor.replaceAll("esta", "una"));
					break;

				default:
					System.out.println("escriba las fraces correctamente");
					--a;
					break;

				}
				++a;

			} else {
				System.out.println("escriba las fraces correctamente");
				--a;
			}

		}

		System.out.println("Programa finalizado");
		tec.close();
	}

}
