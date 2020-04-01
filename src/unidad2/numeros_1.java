package unidad2;

import java.util.Scanner;

public class numeros_1 {

	public static void main(String[] args) {
		//declaramos las variables
		double num1=1;
		double suma= 0;
	
		System.out.println ("realizado con while: ");		
	//establecemos el bucle para que vaya realizandose mientras num1 sea distinto de cero	y se vaya realizando la suma
	while (num1 !=0)	{
		
		System.out.println ("escribe un numero: ");
		Scanner teclado = new Scanner (System.in);
		
		 num1= teclado.nextDouble();
		teclado.nextLine();
		
		
 suma=suma +num1;
		
		
		
		
		
	}
//imprimimos el resultado de la suma
	System.out.print("la suma total es : " +suma);
			
	
			
			
			
		

	

	}

}
