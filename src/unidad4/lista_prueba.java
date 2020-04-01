package unidad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class lista_prueba {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		//declaramos las variables
				String opcion = "si";
		 String pos_altura=" ";
				int a = 0;
				int b = 0;
				int m=0;
				double numero=0;
				int menores = 0;
				List<Double> listaAltura = new ArrayList<>();
				List<Double> listaAltura2 = new ArrayList<>();
				List<Double> menosmedia = new ArrayList<>();
				int pocision = 0;
				Double[] altura;
				double media = 0;
				String pos =" ";
				System.out.println("-------------------------Bienvenido al calculo de altura---------------------------- ");
		// establecemos un bucle para que el usuario pueda introducir todas las alutra que quiera y salir cuando lo decida
				while (opcion.equalsIgnoreCase("si")) {

					++a;
					System.out.println("->Indique la altura del " + a + "º alumno ");
		//añadimos en la lista
					listaAltura.add(control_numero(tc));
					
					//sumamos en la media
					media = media + listaAltura.get(b);
					++b;
					System.out.println("¿Quiere continuar ? si / no, ya ha registrado la altura de "+listaAltura.size()+" alumnos");
					opcion = tc.next().trim();
					
				}

				media=media/listaAltura.size();
				mostrarlista(listaAltura);	
				
				
				
		Collections.frequency(listaAltura, media);		
				
		
		 listaAltura2=listaAltura;
		 
		 pos = igual_media(listaAltura2, media, pos);
					 
					 
					    
					   
				System.out.println(pos);   
					   
					  
					
				}



















	private static String igual_media(List<Double> listaAltura2, double media, String pos) {
		int index = listaAltura2.indexOf(media);
				while (index!=-1) {
					
				try { 
					    
					 
						
						 index = listaAltura2.indexOf(media);
						 listaAltura2.set(index, 0.0);
						 pos +=index;
						 pos +=" ";
				}catch(IndexOutOfBoundsException e) {
					
					index=-1;
					
				}
				
				
				
				
					 }
		return pos;
	}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

	
	private static double control_numero(Scanner tc) {
		double num = 0;
		for (int s = 0; s < 1; ++s) {
			try {
				num = tc.nextDouble();
				tc.nextLine();
				if (num < 1) {
					System.err.println("Introduzca numeros positivos");
					s--;
				}

			} catch (InputMismatchException e) {

				System.err.println(
						"Introduzca numeros y si los introduce con decimales separa las unidades de los decimales con una coma");
				--s;
				tc.nextLine();

			}
		}
		return num;
	}
//separador
	private static void separador() {
		System.out.println(
				"_______________________________________________________________________________________________________ ");
		System.out.println();
	}
//para mostrar los datos al usuario
	private static void mostrarlista(List<Double> lista) {
		for (Double e : lista) {
			System.out.print(" " + e + "m\t");

		}
		System.out.println();
	}
//mostrar los datos al usuario
	private static void mostrar(Double vector[]) {
		int a = 0;
		for (int i = 0; i < vector.length; ++i) {

			System.out.println("Altura del " + (a = i + 1) + "º alumno es de " + vector[i] + " metros");

		}

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
