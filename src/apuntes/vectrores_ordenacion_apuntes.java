package apuntes;

import java.util.Scanner;

public class vectrores_ordenacion_apuntes {

	public static void main(String[] args) {

//iniciamos una variable 

		int num[] = { 124, 34, 234, 1293, 345, 234 };
		int numo[] = { 124, 34, 234, 1293, 345, 234 };
		int n[] = new int[4];
		String letras[] = { "hola", "ala", "rojo", "azul" };

		
		  //metdod de ordenacion burbuja System.out.println(" *********metdodo de
		
		  /**
		  for (int i =0; i<numo.length; ++i) {
		  
		  for (int k =0; k<numo.length; ++k) { if (numo[i]<numo[k]) { int aux=numo[k];
		  numo[k]=numo[i]; numo[i]=aux; } }
		  
		  
		  }
		  
		  mostrarvectornumeroos(numo);
		  
		*/
		 /**
		  for (int i=1; i<numo.length; ++i) {
		  
		  int valor=numo[i];
		  
		  int j=i-1;
		  
		  while (j>=0&& valor<numo[j]) {
		  
		 
		 
		  num[j+1]=numo[j]; --j;
		  
		  
		  
		  }
		  
		  numo[j+1]=valor;
		  
		  
		  }
		  
		 
		  mostrarvectornumeroos(numo);
		 */
//metdod de ordenacion coctel
		System.out.println(" *********metdodo de ordenacion coctel****************  ");

		int ult = num.length - 1;
		int pos = 0;

		int aux = 0;

		while (pos < ult) {

			for (int i = pos; i < ult; i++) {

				if (num[i] < num[i + 1]) {

					aux = num[i + 1];
					num[i + 1] = num[i];
					num[i] = aux;

				}

			}
			--ult;

			for (int k = ult - 1; k > pos; --k) {

				if (num[k] > num[k - 1]) {

					aux = num[k - 1];
					num[k - 1] = num[k];
					num[k] = aux;

				}
			}

			++pos;

		}

		mostrarvectornumeroos(num);

//que no se repitan los numeros

		Scanner tec = new Scanner(System.in);
		int num2;

		for (int i = 0; i < n.length; i++) {

			do {

				num2 = tec.nextInt();
				tec.nextLine();

			} while (norepetir(n, num2) != -1);

			n[i] = num2;

		}

		mostrarvectornumeroos(n);

	}

	private static int norepetir(int num[], int num1) {
		for (int i = 0; i < num.length; i++) {

			if (num[i] == num1) {
				return i;
			}

		}
		return -1;

	}

	private static void mostrarvectornumeroos(int[] num) {
		for (int i = 0; i < num.length; ++i) {

			System.out.print(" " + num[i] + " ");

		}
		System.out.println();
	}
}
