package unidad4;

import java.util.Scanner;

public class vector1 {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		System.out.println("inserte el numero de datos (numeros)");

		int num = tc.nextInt();

		int lista[] = new int[num];
		int AS[] = new int[num];

		int a = 0;

		for (int i = 0; i < num; i++) {

			System.out.print("inserte numero: ");
			a = tc.nextInt();

			lista[i] = a;

		}
		
		
		
		
	

		int b = 0;
		for (int a2 = 0; a2 < num; a2++) {
	
			
			System.out.println("a2 "+a2);

			for (int i2 = 0; i2 < num; i2++) {
				System.out.println("i2 "+i2);
				if (lista[a2] < lista[i2]) {
                    
					b=lista[a2];
                   lista[a2]=lista[i2];
              
                   lista[i2]=b;
				}

			}

		}

		
			System.out.println("numero"+b);
			
			for (int i3 = 0; i3 < num; i3++) {
				System.out.println("i2 "+lista[i3]);
				
  
			}
               
				}
	}


