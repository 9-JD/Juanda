package BUCLE;

import java.util.Scanner;

public class volumen {

	public static void main(String[] args) {
		 Scanner tec = new Scanner (System.in);
	        int largo, ancho, alto, volumen;
	        
	        
	        do{
	        System.out.println("Programa que calcula el volumen de una caja");
	    System.out.println("introduce largo en centrimetros");
	    largo=tec.nextInt();
	    System.out.println("introduce el ancho en centrimetros");
	    ancho=tec.nextInt();
	    System.out.println("introduce el alto en centrimetros");
	    alto=tec.nextInt();
	   }
	       
	        while (largo<0 || ancho <0 || alto<0);
	     
	         volumen =(largo * ancho* alto);
	    
	    System.out.println("el volumen de la caja es " +volumen+ " cm3");
	  
	    tec.close();
	    
	     

	}
	

}
