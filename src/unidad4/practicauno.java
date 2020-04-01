package unidad4;

import java.util.Scanner;

public class practicauno {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
// ESTABLECEMOS LAS STRING QUE VAMOS A UTILIZAR
		String hola = "hola";
		String abc = " ";
		String espacio = " ";
		int a = 0;

//HEMOS DECIDIDO ESTABLECER UN BUCLE PARA QUE SE VEA EL FUNCIONAMIENTO DE TODOS LOS APARTADOS DEÑL EJERCISIO POR ESO SE REPITE TIENE TRES ITERACIONES 
		while (a < 3) {
//LE MOSTRAMOS AL USUARIO LO QU ETIENE QUE ESCRIBIR
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
//LE QUITAMOS LOS ESPACIOS AL PRINCIPIO Y FINAL A LO ESCRITO POR EL UDSUARIO
			s = tec.nextLine().trim();
//CON CONTAINS VEMOS SI EL STRING CONTIENE EL : SI ES ASI ENTRA EN EL IF
			if (s.contains(":")) {
//VEMOS LA POCISION DE : EN LA STRING
				int pos = s.indexOf(':');
				// COGEMOS TODO HASTA :
				String comando = s.substring(0, pos).trim();
//COGEMOS TODO DESPUES DE :
				String valor = s.substring(pos + 1).trim();
//AHORA ESTABLECEMOS QUE SI ES IGUAL QUE SE REALICE UN BUCLE DONDE LO QUE HARA ES INVERTIR LA FRASE Y PONERLA EN MAYUSCULA
				if (comando.equals("Invertir")) {

					for (int i = valor.length() - 1; i > -1; --i) {

						abc += valor.toUpperCase().charAt(i);

					}

					System.out.println(abc.trim());

				}

				else if (comando.equals("Nombre")) {
//CON ESTO CONCATENAMOS EL STRING PARA FORMAR LA FRASE, PODEMOS HABER AÑADIDO UN ESPACIO A HOLA Y ASI NOS AHORRAMOS LA STRING ESPACIO
					String concatenar = hola.concat(espacio).concat(valor).trim();
					System.out.println(concatenar);
				}
//CON REPLACEALL SUSTITUIMOS ESTA POR UNA ES LA LA ESTRING Y LA MOSTRAMOS
				else if (comando.equals("Escribir")) {

					System.out.println(valor.replaceAll("esta", "una"));

				} else {
					// SI NO SE ESTABLECE LA FRASE CORRECTAMENTE EL CONTADOR NO SE INCREMENTARA
					System.out.println("escriba las fraces correctamente");
					--a;
				}

			} else {
				// SI NO SE ESTABLECE LA FRASE CORRECTAMENTE EL CONTADOR NO SE INCREMENTARA
				System.out.println("escriba las fraces correctamente");
				--a;
			}

			++a;

		}
		System.out.println("Programa finalizado");
		tec.close();
	}

}
