package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRUEBA_SPLIT {

	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		List<String> ListaA = new ArrayList<>();
        int x=0;
		String nombre="";
		int index=0;
		
		while (x<2){
			int b=0;
			int a=0;
			int c=0;
			int d=0;
		while (c < 1) {

			System.out.print("Introduce Apellidos y nombre en el siguiente formato--> Apellidos, Nombre  ");

			nombre = tc.nextLine().toUpperCase().trim();
			ListaA.add(nombre);
			if (d == 0) {
				a = 0;
				c = 0;

			}
			 index = -1;
			b = 0;

			while (a < 1) {

				try {

					char a1 = nombre.charAt(b);

					if (Character.isSpaceChar(a1)) {
						++d;
						++a;
						++c;

					}
					++b;

				} catch (StringIndexOutOfBoundsException r) {

					++a;
					System.out.println("inserte un espacio");

				}

			}
			index = nombre.indexOf(",");
			if (index == -1) {
				System.out.println("inserte la coma de separacion");
				d=0;
				
			}
		}
		++x;
		}	
		
      String[] nombre_split = nombre.split("(\\s+)");

      System.out.println(ListaA.indexOf("juan"));















	
	
			
		
			
			
			
		
			
		
			
			
			
			

	}

}
