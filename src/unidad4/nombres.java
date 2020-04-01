package unidad4;

import java.util.Scanner;

public class nombres {

	public static void main(String[] args) {
		Scanner tec= new Scanner(System.in);
		
		String nombres=" ";

		

	
	
		letras(tec);


	
	}

	private static void letras(Scanner tec) {
		String nombres;
		int a= 0;
	
	
for (int b=0; b<1; ++b ) {
		
		
		nombres=tec.next().trim();
		
	for (int k=0; k < nombres.length(); ++k) {
	
	if (Character.isLetter(nombres.charAt(k))){
		++a;	
	}
		
		
	}
	if (a!=nombres.length()) {
		
		System.out.println("introduzca letras no numeros ni caracteres");	
		b=-1;
		a=0;
		
		
	} 
	
}
	}
}
