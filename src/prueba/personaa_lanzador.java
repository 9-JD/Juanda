package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class personaa_lanzador {
	public static void main(String[] args) {
	
		
		Scanner tc = new Scanner(System.in);
		
		List<String> nombre = new ArrayList<>();
		List<String> tefono = new ArrayList<>();
		List<Integer> edad = new ArrayList<>();
		List<Double> Altura = new ArrayList<>();
		int a=1;
		System.out.println("¿cuantas personas desea introducir? ");
		int num =tc.nextInt();
		for (int i=0; i<num; ++i) {
			System.out.println(a+" º persona " );
			System.out.print("nombre ");
			nombre.add(tc.next());
			System.out.print("TELEFONO ");
			tefono.add(tc.next());
			System.out.print("altura ");
			Altura.add(tc.nextDouble());
			tc.nextLine();
			System.out.print("edad ");
			edad.add(tc.nextInt());
			tc.nextLine();
			++a;
			System.out.println("__________________________________");
		}
		System.out.println();
		persona persona1 = new persona();
		a=1;
		for (int i =0; i<num;   ++i) {
			
			System.out.println(a+" º persona " );
			System.out.print("Nombre " );
			persona1.setNombre(nombre.get(i));
			
			System.out.println(persona1.getNombre());
			System.out.print("tfn " );
			persona1.setNumero_tf(tefono.get(i));
			System.out.println(persona1.getNumero_tf());
			System.out.print("edad " );
			persona1.setEdad(edad.get(i));
			System.out.println(persona1.getEdad());
			System.out.print("altura " );
			persona1.setAltura(Altura.get(i));
			System.out.println(persona1.getAltura());
			
			System.out.println("__________________________________");
			++a;
		}
			
			
		
		
		
		
		
	}

}
