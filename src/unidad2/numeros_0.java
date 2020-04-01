package unidad2;

import java.util.Scanner;

public class numeros_0 {

	public static void main(String[] args) {
		
		double num1=0;
		//contador de numeros cada vez que se introduca un numero
		int a=0;
		//ponemos el bucle que se pare en el -1 debido a que el 0 puede ser considerado como un numero positivo
	while (num1 >-1)	{
		
		System.out.println ("escribe un numero decimal: ");
		Scanner teclado = new Scanner (System.in);
		 num1= teclado.nextDouble();
		teclado.nextLine();
		++a;
	
		
		
		
		
		
	}
//restamos un numero ya que para salir hay que introducir uno negativo y se lo quitamos para que solo salga los positivos
	System.out.print("a introducido estos numeros positivos: " +(a-1));
			
	
			
			
			
			
	

	}
	
}
