package unidad1;

import java.time.LocalDate;
import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		// establecemos el escaner para que lea la fecha de nacimiento y lo almacene en la variable 
	Scanner teclado= new Scanner (System.in);
	// almacenamos en la variable, pidiendole el año actual al sistema
	int añoactual  =LocalDate.now().getYear();
	
	System.out.println("introduzca su año de nacimiento ");
	int nacimiento= teclado.nextInt();
	teclado.nextLine();
	//restamos año autual con la fecha de nacimiento
	int edad=añoactual - nacimiento;
	// establecemos la condicion que si la fecha de nacimiento es mayor a la año actual no se mostrara la edad ya que seria negativo el resultado
	if (añoactual > nacimiento) {System.out.println("se edad es   " +edad);}
	
	else  {System.out.println("vuelva a insertar su fecha de naciomento, los datos aportados son erroneos");}
	
	
	
	
	
	
	
	teclado.close();
	

	}
	
}
