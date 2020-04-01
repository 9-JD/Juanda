package unidad2;

import java.util.Random;
import java.util.Scanner;

public class primerfor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Random varRandom =new Random();
		System.out.println("inserta numero");
		
		int a =teclado.nextInt();
		
		
		for (int i=1; i < a; i++ ) {
			
			System.out.println("el numero"+i+ "en la tabla acii es "+(char)i);
			
			
			
			
		}
		
		
		
		

	}

}
