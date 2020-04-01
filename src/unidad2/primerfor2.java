package unidad2;

import java.util.Random;
import java.util.Scanner;

public class primerfor2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Random varRandom =new Random();
		
		int a =varRandom.nextInt(100)+48;
		
		
		for (int i=1; i < a; i++ ) {
			
			System.out.println("el numero "+i+ " en la tabla acii es "+(char)i);
			
			
			
			
		}
		
		
		
		

	}

}
