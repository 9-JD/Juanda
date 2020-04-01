package unidad4;

import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ejercisio2 {
    
    public static void main(String[] args) throws IOException {
		
		   char a =' ';
	        //creamos el bucle y la variable que cumplira la condicion de salida 
	        while ( a!='#'){
	//creamos el escaner
	        Scanner sc = new Scanner(System.in);
	        System.out.println("introducé numero ");
	//la variable num1 y el resultado
	        int num1 = sc.nextInt();
	        sc.nextLine();
	        int resul = 0;
	        //solo numeros positivos
	        if (num1>0){

	        while (num1 > 0) {
	//igualamos num1 a resul
	            resul = num1;
	//reducimos num1 
	            --num1;
	//mientras num1 no sea igual a numero se ejecutara el bucle
	            while (num1 >= 1) {

	                resul = resul * num1;
	                --num1;
	            }

	        }
	        System.out.println("el numero es  " + resul);
	         
	        }else {System.out.println("introduzca datos positivos");
	         //salida
	        
	
	       }
		
		
	
		
	        System.out.println("si quiere salir pulse # si no cualquier otra tecla");
		       a =(char) System.in.read();
		                sc.nextLine(); 
	
		
		
	}

	        System.out.println("programa finalizado");        
	        
}
    
    
    
}
