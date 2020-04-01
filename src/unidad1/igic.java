package unidad1;


import java.util.Scanner;

public class igic {

	public static void main(String[] args) {
		//agregar  la clase sccaner a teclado
	Scanner teclado= new Scanner (System.in);
	
                    
	// creamos la variable y indicamos que almacene lo leido por pantalla
	System.out.println("introduzca el precio ");
	double precio= teclado.nextDouble();
	teclado.nextLine();
	//operacion para saber igic
	double igic= (precio * 7)/ 100;
	// precio final 
	double preciototal= precio + igic;
	// se muestra por pantalla el igic y el precio final
	System.out.println( "el igic es " +igic+ " el precio final es " +preciototal );
	
	teclado.close();
	}
	
}
