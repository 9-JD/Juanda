package unidad2;

import java.util.Scanner;

public class area_triangulo {

	public static void main(String[] args) {
		
		double b= 0;
		double a = 0;
		double A=0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.print(" introduzca los datos correspondientes");
		
		System.out.print(" base del triangulo ");
	
		
			b =teclado.nextDouble();
		
		
		System.out.print(" la altura triangulo ");
		
		 a =teclado.nextDouble();
		if (a > 0 && b> 0) {
		 A = calcular_area(b, a); 
		
		System.out.print(" el resultado es " +A);}
	
	teclado.close();

	}

	public static double calcular_area(double b, double a) {
		double A;
		A= (b*a)/2;
		return A;
	}

}
