package unidad4;

import java.util.Scanner;

public class vector {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		System.out.println("inserte el numero de datos (numeros)");

		int num = tc.nextInt();

		int lista[] = new int[num];
		int AS[] = new int[num];
		String mano =" ";
		int a = 0;
int b =0;
		for (int i = 0; i < num; i++) {

			System.out.print("inserte numero: ");
			a = tc.nextInt();

			lista[i] = a;

		}

		
			
		

			for (int i2 = 0; i2 < num; i2++) {
			
				
				for (int i3 = 0; i3 < num-1; i3++) {
				
				
				if (lista[i3] >lista[i3+1]) {
				
					b=lista[i3];
					lista[i3]=lista[i3+1];
					lista[i3+1]=b;
				}

			}

			}

			for (int i4 = 0; i4 < num; i4++){ {System.out.print(lista[i4]);}   
	
               
			}	}
	
}

