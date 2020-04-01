package unidad4;

import java.util.Scanner;

public class Bonoloto {

	public static void main(String[] args) {
		
		Scanner tec =new Scanner(System.in);
		System.out.println("---------------------Bienbenido a la Bonoloto------------------------------- ");
		// creamos el rango de 1 a 49 de la bonoloto
		int [] rango= new int [49];
		int [] elecion=new int [6];
		rellenar_rango(rango);
		
		
		
		System.out.println("->Introduzca su numero  ");
	
		
		
		
		
	normasde_bonoloto(tec, elecion);
		mostrar_rango(elecion);
	 int b=repeten_numeros(elecion);
		System.out.println(b);
		
        mostrar_rango(rango);
		
        separador();
		
		
	}

	
	private static int repeten_numeros(int [] repite) {
		int b=0;
		for (int i =0; i<repite.length; i++) {
			
			for (int a =1; i<repite.length; a++) {
				
				
				if (repite[i]==repite[a]) {
					
					++b;
					
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		return b;
		
	}


	private static void normasde_bonoloto(Scanner tec, int [] minumero) {
		
		
		for (int i=0; i<6; i++ ) {

	
			System.out.println("->Introduzca su numero  "+i+1);
			
			int numero= tec.nextInt();
			
			if (numero <1 || numero >49) {
				
				System.out.println("los numeros solo puedes ser del 1 al 49 estos incluidos");
				
				--i;
				
			} else {
				
				minumero[i]=numero;}
					
				
		}
				
				
				
			
				
			
			
		
		
	}


	private static void separador() {
		System.out.println("---------------------------------------------------- ");
	}

	private static void mostrar_rango(int [] numero) {
		for (int i=0; i<numero.length; ++i) {
			
			System.out.print(numero[i]+" ");
			
			
			
		}
		System.out.println();
	}

	private static void rellenar_rango(int [] numero) {
	for (int i=0; i<49; ++i) {
		
		numero[i]=i+1;
		
		
		
	}
		
	}

}
