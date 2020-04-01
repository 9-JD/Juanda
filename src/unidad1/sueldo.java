package unidad1;

import java.util.Scanner;

public class sueldo {

	public static void main(String[] args) {
		//variable constante
		final int dinero = 15;
		
		Scanner teclado = new Scanner(System.in);
		//varibale donde se almacena las horas tabajadas del trabajador
		System.out.println("introduzca las horas trabajadas ");
		double horas= teclado.nextInt();
		teclado.nextLine();
		
		//formula para calcular el sueldo ganado
	double	Salario= dinero * horas;
	
	System.out.println("Usted ha ganado " +Salario+ " euros");
		
		
	teclado.close();
		
		
		
	}

}
