package unidad1;

import java.util.Scanner;

public class compraciondenumeros {

	public static void main(String[] args) {
		
		
		
		//introducion de datos por parte del usuario en la variables creadas
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca  numeros ");

		System.out.println("introduzca  numero 1: ");
		int numero1 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("introduzca  numero 2: ");
		int numero2 = teclado.nextInt();
		teclado.nextLine();
		
		//comparamos los numeros
		if (numero1 > numero2) {
			System.out.print("el numero: " + numero1 + " es mayor");
		} else if (numero1 < numero2) {
			System.out.println("el numero: " + numero2 + " es mayor");} 
		
		else { System.out.println("el numero: " + numero1 + " y el numero: " +numero2+ " son iguales");

		teclado.close();
		
	}
		
		
		
}
}
