package examen2eva;

import java.util.Scanner;

public class ordenacion {

	public static void main(String[] args) {
		
	Scanner tc=new Scanner (System.in);
		
 int orden[]= {1, 97, 73, 7, 8};
		
/**
 
 //burbuja
 
 System.out.print("burbuja ");
 
		for (int i = 0; i < orden.length; i++) {

			for (int k = 0; k < orden.length; ++k) {
				if (orden[i] < orden[k]) {
					int aux = orden[i];

					orden[i] = orden[k];

					orden[k] = aux;

				}

			} 
	 
 }
 
 
		mostrar(orden);
 
 // insersion 
		
		
		
		System.out.print("insercion ");	
		
		
for (int i=1; i<orden.length; ++i ) {
	
	int valor =orden[i];
	
	
	int k=i-1;
	
	
	
	while (k>=0 && valor <orden[k]) {
		
		orden[k+1]=orden[k];
		--k;
	
		
	}
	
	orden[k+1]=valor;
	
	
	
}		
 
mostrar(orden);
 
 
 //coctel

**/
System.out.print("coctel ");	

int ult=orden.length-1;
int pos =0;
int aux=0;
		while (pos < ult) {
			for (int i = pos; i <ult; i++) {

				if (orden[i] >orden[i + 1]) {

					 aux = orden[i + 1];

					orden[i + 1] = orden[i];

					orden[i] = aux;

				}

			}

			--ult;

			for (int k = ult - 1; k > pos; --k) {

				if (orden[k] < orden[k - 1]) {

					 aux = orden[k - 1];

					orden[k - 1] = orden[k];

					orden[k] = aux;

				}

			}

			++pos;

		}

mostrar(orden);

 //ver si son iguales 


int numero;
for (int i=0; i<orden.length; i++) {
	
	do {
		System.out.print("inserte numero ");	
   numero=tc.nextInt();
	tc.nextLine();
		
		
	}while(igula(orden, numero)!=-1);
	
	orden[i]=numero;
	
	
	
	
	
	
	
	
}

mostrar(orden);

 
 
	}

	private static int igula(int [] orden, int num) {
		for (int i=0; i<orden.length; i++) {
			
			if(orden[i]==num) {
				
				
			return i;	
				
			}
			
			
			
			
			
		}
		return -1;
	}

	private static void mostrar(int[] orden) {
		for (int i = 0; i < orden.length; i++) {
			
			
			System.out.print(orden[i]+" ");
			
		}
		
		System.out.println();	
		
	}

}
