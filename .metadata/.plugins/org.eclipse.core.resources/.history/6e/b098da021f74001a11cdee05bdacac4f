

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreaPrismamain {
	/**
	 * @author Juan Daniel Sanchez Gonzalez
	 * 
	 */
	public static void main(String[] args) {

//inicializacion de variables
		List<AreaPrismaclass> listaprisma = new ArrayList<>();
		List<Float> areatotal = new ArrayList<>();
		List<String> areatotal_string = new ArrayList<>();
		List<String> areatotal1_string = new ArrayList<>();

		// metodos
		añadir_mostrar_datos(listaprisma, areatotal);

		transformacion_lista_string(areatotal, areatotal1_string);

		ordenar_mayor_menor(areatotal);

		transformacion_lista_string(areatotal, areatotal_string);

		imprimir_de_mayor_a_menor(areatotal_string, areatotal1_string, areatotal);

	}

	/**
	 * este metodo muestra el mayor y su posicion que tiene en el orden de
	 * introducion
	 * 
	 * @param areatotal_string  se le pasa el parametro de areatotal_string
	 * @param areatotal1_string se le pasa el parametro de areatotal1_string
	 */
	public static void imprimir_de_mayor_a_menor(List<String> areatotal_string, List<String> areatotal1_string,
			List<Float> areatotal) {
		System.out.println(" Ordenados de mayor a menor");
		List<String> posmayor_menor = new ArrayList<>();
		posmayor_menor = posiciones(areatotal_string, areatotal1_string);
		for (int k = 0; k < posmayor_menor.size(); k++) {
			System.out.println("\t" + "- Prisma" + posmayor_menor.get(k) + ": area total " + areatotal_string.get(k));

		}
	}

	/**
	 * este metodo podemos saber las pociciones y tbm evitamos que los numeros
	 * repetidos causen problemas o errores en la enumeracion
	 * 
	 * @param areatotal_string  se le pasa los argumentos de la lista
	 *                          areatotal_string
	 * @param areatotal1_string se le pasa los argumentos de la lista
	 *                          areatotal1_string
	 * @return retorna la lista que contine las pociones de mayor a menor
	 */
	private static List<String> posiciones(List<String> areatotal_string, List<String> areatotal1_string) {
		List<String> posmayor_menor = new ArrayList<>();
		int index = 0;
		int cont = 0;
		String pos = "";
		while (cont < areatotal1_string.size()) {

			index = areatotal1_string.indexOf(areatotal_string.get(cont));

			pos = pos.valueOf(index + 1);
			posmayor_menor.add(pos);
			areatotal1_string.set(index, "0");

			cont++;

		}

		return posmayor_menor;

	}

	/**
	 * ordena de mayor a menor
	 * @param areatotal se le pasa los parametros de la lista de areatotal 
	 *                  
	 */
	public static void ordenar_mayor_menor(List<Float> areatotal) {
		Collections.sort(areatotal, Collections.reverseOrder());
	}

	/**
	 * pasamos una lista Float a string
	 * 
	 * @param areatotal         se le pasa la lista de areatotal
	 * @param areatotal1_string se le añade los parametros de areatotal al
	 *                          diferencia es que se cambia a string
	 */
	public static void transformacion_lista_string(List<Float> areatotal, List<String> areatotal1_string) {
		for (int k = 0; k < areatotal.size(); k++) {

			areatotal1_string.add(Float.toString(areatotal.get(k)));

		}
	}

	/**
	 * en este metodo se añaden los datos y se muestra al usuario
	 * @param listaprisma se le pasa los atributos la altura y la base y se cargan
	 *                    en la listaprisma que es un objeto
	 * @param areatotal   se le pasa el metodo areaTotal para que calcula el area
	 *                    total esta lista no es un objeto String.
	 */
	public static void añadir_mostrar_datos(List<AreaPrismaclass> listaprisma, List<Float> areatotal) {
		AreaPrismaclass elementos;
		int cont = 0;
		lineas();
		System.out.println("\t" + "CREACION DE OBJETO PRISMA");
		lineas();
		while (cont != 3) {

			elementos = new AreaPrismaclass();
			listaprisma.add(elementos);
			areatotal.add(elementos.areaTotal());

			System.out.println(" Creado el objeto Prisma" + (cont + 1) + " con:  ");
			System.out.println("\t" + "- Base: " + listaprisma.get(cont).getBaseTriangulo());
			System.out.println("\t" + "- Altura: " + listaprisma.get(cont).getAlturaPrisma());
			System.out.println("\t" + "- Area total: " + areatotal.get(cont));
			System.out.println("");
			++cont;

		}
		lineas();

	}

	/**
	 * para poner un diseño mejor
	 */
	private static void lineas() {
		System.out.println("======================================");
	}

}
