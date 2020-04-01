package unidad2;

import java.util.Scanner;

public class numeros_3 {

	public static void main(String[] args) {
		//declaramos la variables
		double num1=1;
		double suma= 0;
		int a=0;
		
		//cuando a sea igual a 5 sale de bucle
	while (a <5)	{
		++a;
		System.out.println ("escribe un numero: ");
		Scanner teclado = new Scanner (System.in);
		
		 num1= teclado.nextDouble();
		teclado.nextLine();
		
		
 suma=(suma +num1);
		
		
		
		
		
	}
//realiza la media de la suma
	System.out.println("la media total es : " +suma/a );
	
	
			
	
			
			
			
			
	

	}

}
