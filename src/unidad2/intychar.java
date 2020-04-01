package unidad2;

import java.util.Scanner;

public class intychar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("introduce numero " );
		int a = teclado.nextInt();
		
int i = 0;


while (i< a) {
	
	i++;
	
	if (i % 3 == 0) {
		
		
		System.out.println(+i+    " es multiplo de 3 " );
		
	}
	
	
	teclado.close();
	
	
	
}
		
		
		
		
		
		

	}

}
