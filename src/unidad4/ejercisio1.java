package unidad4;

import java.util.Scanner;

public class ejercisio1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		//inicializamos las variables
		
		
		int s=0;
		
		int d=1;
		
	int 	tecla=0;
		// establecemos el primer bucle que mientras sea igual tecla a 0 se va a repetir 
	while(tecla==0) {
	
System.out.println("ingrese numero para calcular sus divisores y si es un numero perfecto");

		
		int n=tec.nextInt();
		tec.nextLine();
		//establecemos otro bucle para que se reita hsta que n sea menor que d
		while (d<n) {
		if (n  %d ==0) {
			//calculamos sus diviores 
			s=s+d;
			d=d+1;
			
		}
		else {
			
			//si no es divisor a  le summos uno 
			d=d+1;
			
		}
		
		}
		
		
		if (n==s) {System.out.println("el numero "+n+" es prefecto y que la uma de sus divisores "+s);}
		else {System.out.println("el numero "+n+" no  es prefecto ya que la uma de sus divisores es"+s);}		
		
		System.out.println("si quiere repetir el proceso pulse 0");
		 tecla=tec.nextInt();
		tec.nextLine();
		
		
	}
	
	tec.close();
	}
}
