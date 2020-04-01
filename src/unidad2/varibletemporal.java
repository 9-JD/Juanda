package unidad2;

import java.util.Scanner;

public class varibletemporal {

	public static void main(String[] args) {
	
		
		System.out.print("introduzca variables ");
		
		 Scanner teclado = new Scanner (System.in);
		 System.out.print("a");
			
		 double a =teclado.nextDouble();

		 System.out.print("b");
		 double b =teclado.nextDouble();
		 
		 System.out.print("c");
			
		 double c =teclado.nextDouble();
		 
		 
		 
		 double temp = c;
            a= temp;		 
		 
		
            System.out.print("varables " +a+ +b +c);
		
            
            teclado.close();
		

	}

}
