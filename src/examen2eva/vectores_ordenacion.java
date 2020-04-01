package examen2eva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class vectores_ordenacion {

	public static void main(String[] args) {
		Scanner tc =new Scanner (System.in);
		
		int [] aleatorio= {6, 8, 9, 10, 11, 1};
		int [] numeros= new int [3];
		int numero=0;
		int numb=0;
		/**System.out.println("ordenacion burbuja");	
		
		//ordenacion por burbuja para ordenar de mayor asecendente y decendente 
		
		for (int i=0; i<aleatorio.length; i++ ) {
			
			for (int k=0; k<aleatorio.length; k++   ) {
				
				if (aleatorio[i]<aleatorio[k]) {
					
					int aux=aleatorio[k];
					
					aleatorio[k]=aleatorio[i];
					
					aleatorio[i]=aux;
				
					
					
				}
				
	
			}
			
		}
		
		mostrar(aleatorio);		
			
			
			
		
		
	
	
		System.out.println("ordenacion insecion");	
		
	// metodo insersion 
		
	
	for (int i=1; i<aleatorio.length; i++) {
		
	int valor= aleatorio[i];
	int j=i-1;
	
	while (j>=0 && aleatorio[j]<valor ) {
		
		aleatorio[j+1]=aleatorio[j];
		--j;
		
			
	}
		
	aleatorio[j+1]=valor;	
		
		
		
		
		
		
	}	
		
	mostrar(aleatorio);	

	
	
	System.out.println("ordenacion insecion no admite numeros iguales ");
	
	
	
	
	for (int i =0; i<numeros.length; ++i) {
		
		do {
			
		
			 numero=control_numeros(tc);
			
			
			
			
			
			
		}while (iguales(numeros, numero)!=-1);
		
		
		numeros[i]=numero;
		
		
		
	}
	
	
	mostrar(numeros);	
	
	
	

		
	System.out.println("ordenacion coctel");		
	//metodo coctel
	int ulm=aleatorio.length-1;
	
	int pos=0;
	int aux=0;
	
	while(pos<ulm) {
		
	
	for (int i=pos; i<ulm;  ++i) {
		if (aleatorio[i]>aleatorio[i+1]) {
		
		
		aux=aleatorio[i+1];
		aleatorio[i+1]=aleatorio[i];
		aleatorio[i]=aux;	
		}
	}
	
	--ulm;
	
	for (int i=ulm-1; i>pos;  --i) {
		
		if (aleatorio[i]<aleatorio[i-1]) {
		
		aux=aleatorio[i-1];
		aleatorio[i-1]=aleatorio[i];
		aleatorio[i]=aux;	
	}
	}
	
	pos++;
	
	
	
	
	}
	
	mostrar(aleatorio);	
	*/	
		
	//numero mayor 
	
	System.out.println("mayor y menor ");	
 int mayor=aleatorio[0];
	for (int i=0; i<aleatorio.length; ++i) {
		
		if (mayor<aleatorio[i]) {
			
			mayor=aleatorio[i];
			
			
			
		}
		
		
		
		
	}		
			
	System.out.println("mayor y menor  " +mayor);		
			
	//menor 			
}	
		
		
private static int iguales(int a [], int num ) {
		
	for (int i=0;  i<a.length; i++ ) {
		
	if (a[i]==num) {
		
		return i;
		
		
		
	}	
		
		
		
		
		
		
		
		
	}
	return -1;
	
	
	
	
	
	
	
	
	
	
	
	
		
	}


private static int control_numeros(Scanner tc) {
		int a =1;
		int numero=0;
	while (a==1) {
		
	try {	
		System.out.println("inserte nuemeros");
	 numero=tc.nextInt();
		tc.nextLine();
		
		a=2;
		
	}catch(InputMismatchException e) {
		
		System.out.println("SOLO NUMEROS");	
		tc.nextLine();
		
		
		
	}
		
		
		
	}
	return numero;
	
	
	
	
	
	
		
	}


	
		
		
		
		

	

	private static void mostrar(int[] aleatorio) {
		for (int i=0; i<aleatorio.length; ++i) {
			
			
		System.out.print(aleatorio[i]+" ");	
			
			
			
		}
		
		System.out.println();	
		
	}

}
