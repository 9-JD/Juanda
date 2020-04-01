package unidad3;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// establecemos el scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce numero ");
		// establecemos las variables
		int num1 = sc.nextInt();
		int resul = 0;

		// primer bucle mientras sea mayor que cero
		for   (num1=num1; num1>0; ) {

			resul = num1;
 --num1;
		
			// mientras el numero sea mayor a uno o igual
			for  (num1=num1;  num1>=1; --num1) {

				// operracion sucesiva en que se multiplica por el unumor posterior
				resul = resul * num1;
				
			}
			
		}
		System.out.println("el numero factorial  es  " + resul);

		sc.close();

	}

}
	
	
	
	
	
	
	










