package unidad4;

import java.util.Scanner;

public class pturbs {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
int p [] = {35, 7, 8 ,9, 3, 4};
		String numero = " ";
		String numero1 = " ";
		int b = 0;
		int c = 0;
		int m=0;
int t=0;

int intro =0;
System.out.println("---------------------Bienvenido a la Bonoloto------------------------------- ");


	/*	for (int k = 0; k < 1; k++) {
			b = 0;
			for ( t=t; t < p.length; t++) {
				System.out.print("introduce el " +(m=(t+1))+"º numero " );
				
				
			 intro=tec.nextInt();
				
				if (intro <1 || intro >49) {
					
					System.out.println("los numeros solo puedes ser del 1 al 49 estos incluidos");
					
					--t;
					
				} else {
					
					p[t] = intro;}
						
					
			}
					
				
			

			for (int i = 0; i < p.length; i++) {

				for (int a = i + 1; a < p.length; a++) {

					if (p[i] == p[a]) {

						
						if (c != p[i]) {
							numero += p[i];
							numero += " ";
							c = p[i];
						}
						++b;

					}

				}

			}
			if (b > 0) {
				k = -1;

				System.out.println("No se pueden repetir numeros usted tiene repetido los siguientes numeros" + numero);
				System.out.println("elija si quiere realizar de nuevo la intorucion de numeros (pulse 1) o modificar la numeracion ya introducida pulse 2");
				int option = tec.nextInt();
				switch(option) {
				case 1:
					k = -1;
					t=0;
					
					break;
				case 2: 
					
					 mostrar(p);
					
					System.out.println("¿Cuantos numeros desea cambiar?");
					 option = tec.nextInt();
					 t=p.length;
					 for (int h=0; h<option; ) {
						 System.out.println("--------------------------------------");
						 System.out.println("Selecione el numero que desea cambiar debe poner el que esta dentro de []") ;
						 System.out.println("--------------------------------------");
						 mostrar(p);
						
						int op = tec.nextInt();
						
						 System.out.println("el nuevo numero a introducir");
						 
						 p[op]=tec.nextInt();
						 h++;
						 }
						 
						 
						 
					 }
					 
				
			}else {System.out.println(">>>>>>>>Numero correcto>>>>>>>>>");}
		}

*/
		System.out.println("El numero de la Bolonoto es ");
	
		
		int [] num = new int [6];
		
		
		
		num[0]= (int) (Math.random() * (49-1) + 1);
		
		for (int i=1; i<num.length; ++i ) {
			
			
			num[i]= (int) (Math.random() * (49-1) + 1);
			
			for (int k=0; k<i; ++k) {
				
				
				if (num[i]==num[k]) {
					
				
					
					--i;
					
					
				}
				
				
				
				
			}
		}
		
		
		mostrar(num);	
	
		for (int i = 0; i < p.length; i++) {

			for (int a = 0; a < p.length; a++) {

				if (p[i] == num[a]) {

					
					
						numero1 += p[i];
						numero1 += " ";
						
					}
					

				}

			}
		System.out.print("hola" +numero1); 
		}
		
		

	 

	private static void mostrar(int[] p) {
		for (int a=0; a<p.length; ++a) {
			 
			 System.out.print( "["+a+"]"+p[a]+" ");  
		 }
	}

}
