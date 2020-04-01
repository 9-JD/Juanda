package programacomposicioncono;

/**
 * 
 *@author Juan Daniel Sánchez González
 *@version 27/marzo/2020
 */

public class ProgramaComposicionCono {

	
	/**
	 * 
	 * la clase Object es la superclase de todas las demás es que en cualquier atributo definido con un tipo Object podrá ser inicializado con cualquier tipo.
	 *tambien nos permite utilizar metodos como quals, getClass, hashCode, notify, notifyAll, toString.
	 */
	private static void imprimir (Object datos) {
	
	 System.out.println(datos);
	 }
/**
 * 
 * con este metodo lo que hacemos es imprimir los obejtos de cono y circulos con los datos introducidos.
 */
	public static void main (String[] args) {
		//importamos la clase de random y declaramos una variable
	java.util.Random aleatorio = new java.util.Random();
	//se repite cinco veces el bucle
	 for (int i=1; i<=5; i++) {
		 //valor del uno al nueve
	 int radio = aleatorio.nextInt(9)+1;
	 //cargamos los datos en el construtor de cono
	 Cono cono = new Cono(0, 0, radio, i, "Azul");
	 //imprimimos todos los elementos
	 cono.imprimir();
	}
	
}
	
}