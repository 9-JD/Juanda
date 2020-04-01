package unidad3;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		boolean seguir = true;
		
		Scanner teclado =new Scanner(System.in);
		
		do {
			System.out.println("Indique la edad ");
			int edad= teclado.nextInt();
			if (edad>18) {
				System.out.println("es mayor de edad puede pasar ");
				seguir= false;
				
				
				
			}
			
			
			
			
		} while (seguir);
teclado.close();
	}

}
