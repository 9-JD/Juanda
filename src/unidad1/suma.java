package unidad1;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("inserte ");
		int n= teclado.nextInt();
		int sum = 0;
		int media=0;
		int a=0;
		
		 
while (n != 0) {
	++a;
	System.out.println("inserte numero para media");
	int num =teclado.nextInt();
	
	
	sum=sum+num;
	 media=sum/a;
	System.out.println("inserte 0 si quiere finalizar");
	 n =teclado.nextInt();
	
}

System.out.println("inserte numero " +sum);
System.out.println("inserte numero " +media);


teclado.close();


	}

}
