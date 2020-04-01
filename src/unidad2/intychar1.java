package unidad2;

import java.util.Scanner;

public class intychar1 {

	public static void main(String[] args) {
		Scanner teclado =new Scanner (System.in);
		
		System.out.print("introduzca numero " );
         int a = teclado.nextInt();
         System.out.print("introduzca numero " +a+ "en accis " +(char)a );
         
         teclado.close();      
         
         
	}

}
