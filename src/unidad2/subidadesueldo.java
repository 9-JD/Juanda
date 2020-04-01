package unidad2;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class subidadesueldo {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		System.out.println("inserte salario");
		double a = teclado.nextDouble();
		
		System.out.print("hay subida de sueldo / pulse S ");
		char c =(char) System.in.read();
		
		
		
		
		if (c == 83) {
			
			System.out.print("porcentage de subida ");
			double d = teclado.nextDouble();
			
			double b =(a* d)/100;
			a =a+b;
			int e =LocalDate.now().getYear();
			
			
			
			System.out.print("SU SUELDO ES DE "+a+ " en el año "+e);
			
			
		}else {
			
			System.out.print("SU SUELDO ES DE "+a);
			
			
		}
		
		
		
		
teclado.close();
	}

}
