package unidad2;

import java.io.IOException;
import java.util.Scanner;

public class clases_notas {

	

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in); 
			
char i= ' ';

System.out.print(" introduce el caracter diferente a  ¿ para iniciar el programa ) ");


i =(char) System.in.read();
teclado.nextLine();



while (i !='¿') {
		
	
	System.out.println("introduzca edad");
	int edad = teclado.nextInt();
	teclado.nextLine();
	System.out.println(" “A” acceso directo, “G” grado medio, “P” prueba de acceso");
	char b =(char) System.in.read();
	teclado.nextLine();
	
	
	if (edad<18 && b==65 ) {
		
		System.out.println("Pase por secretaría");
		
		
	}else if (edad>=18 && b==71 || b ==80 ) {
		
		System.out.println("Solicite código en jefatura");
		
		
	}  else {System.out.println("Las clases son en la R03, gracias");}    
	
	
	System.out.print(" introduce el caracter (prara salir ¿ ) ");
	i =(char) System.in.read();
	teclado.nextLine();
	
				
}	


teclado.close();
	
	
	
	
	}

	}


