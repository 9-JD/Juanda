package unidad2;

import java.util.Scanner;

public class intercambiarnumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("escribe el valor a");
		
		int a= teclado.nextInt();
		teclado.hasNextLine();
		System.out.println ("escribe el valor b");
		
		int b= teclado.nextInt();
		teclado.hasNextLine();
		
		
	int	tem =b;
	b=a;
	a =tem;
	
	System.out.println ("el valor es a: " +a+ " y b: " +b);
	
teclado.close();
	} 
	
}
