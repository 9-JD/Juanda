package unidad1;

import java.util.Scanner;

public class edad1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		System.out.print("indique la edad ");
		int edad= teclado.nextInt();
		
		if (edad >=18) {System.out.print("es mayor de edad");

	}else {System.out.print("es menor de edad");

}
		teclado.close();
}
}