package unidad1;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {

		//introducion de datos en las variable
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduzca las notas de las 3 evaluaciones ");
		
		System.out.println("introduzca las notas de la 1 evaluacion: ");
		double eva1= teclado.nextDouble();
		teclado.nextLine();
		System.out.println("introduzca las notas de la 2 evaluacion: ");
		double eva2= teclado.nextDouble();
		teclado.nextLine();
		System.out.println("introduzca las notas de la 3 evaluacione: ");
		double eva3= teclado.nextDouble();
		teclado.nextLine();
		
		//calculo de nota final
	double	notafinal = (eva1 +eva2+ eva3)/3;
	
	//condicion si es mayor o igual que cinco aprobado y si no supendido
	if (notafinal >=5) {System.out.println("FELICIDADES HA APROBADO CON UN " +notafinal); }
	else {System.out.println("Ha suspendido con un " +notafinal); }
		
		
	teclado.close();

	}

}
