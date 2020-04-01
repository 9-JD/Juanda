package BUCLE;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		 Scanner tec = new Scanner (System.in);
	        int ladoMayor, ladoMenor, area, perimetro;
	        
	        
	        do{
	        System.out.println("Programa que calcula el area y el perimetro de un rectangulo");
	    System.out.println("introduce el lado mayor");
	    ladoMayor=tec.nextInt();
	    System.out.println("introduce el lado menor");
	    ladoMenor=tec.nextInt();
	   }
	       
	        while (ladoMayor <0 || ladoMenor <0);
	     
	         area= ladoMayor +ladoMenor;
	    perimetro= ladoMayor*ladoMenor;
	    System.out.println("el area del rectangulo " +area);
	    System.out.println("el perimetro del rectangulo " +perimetro);
	    tec.close();
	    
	     

	}
	

}
