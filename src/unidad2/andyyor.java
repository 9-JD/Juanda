package unidad2;

import java.io.IOException;
import java.util.Scanner;

public class andyyor {

	public static void main(String[] args) throws IOException {
		System.out.print("Escriba un caracter: ");
		char c =(char) System.in.read();
		int asc_c =(int) c;
		
		System.out.print("Escriba entero: ");
        Scanner teclado = new Scanner (System.in);
        int n =teclado.nextInt();
        
        
        if (asc_c != 90 && n<5) {
        	
        	System.out.print("Primero opcion: ");	
        	
        	} else {
        		
    if    	(asc_c != 90 && n<5) {
    	
    	System.out.print("segunda opcion: ");	
    	
    	}	else {System.out.print("no coincide ");}
        		
        		
        	}
        
        
        
      teclado.close();  
        
	}
	
	

}
