package examen2eva;

import java.util.Scanner;

public class matrices {

	public static void main(String[] args) {
//iniciar matriz	

	int vector[] []= {{1, 2, 3}, {4, 5, 6}};

// tamaño de una matriz sus filas y columnas		
int filas =vector.length;	
int columnas =vector[0].length;		
int suma=0;
int sumac=0;
int [] suma_filas=new int [vector.length];
int [] suma_columnas=new int [vector[0].length];

		System.out.println("mostrar matriz");
// mostrar matriz

		for (int i = 0; i < filas; i++) {

			for (int k = 0; k < vector[0].length; ++k) {

				System.out.print(vector[i][k] + " ");

			}

			System.out.println();

		}

		System.out.println("sumar filas");

//sumar filas 

		for (int i = 0; i < filas; i++) {

			for (int k = 0; k < vector[0].length; ++k) {

				System.out.print(vector[i][k] + " ");
				suma += vector[i][k];

			}
			suma_filas[i] = suma;
			System.out.print(" " + suma_filas[i] + " ");

			System.out.println();

		}

		System.out.println("sumar columnas");
// sumar columnas 

		for (int i = 0; i < vector[0].length; i++) {

			for (int k = 0; k < vector.length; ++k) {

				sumac += vector[k][i];

			}

			suma_columnas[i] = sumac;
			System.out.print(suma_columnas[i] + " ");
			sumac = 0;

		}
		System.out.println();

//invertir 
		System.out.println("invertir");
		int vecto[][] = new int[vector[0].length][vector.length];

		for (int i = 0; i < vecto.length; i++) {

			for (int k = 0; k < vecto[0].length; ++k) {

				vecto[i][k] = vector[k][i];
				System.out.print(vecto[i][k] + " ");

			}
			System.out.println();
		}

// cuadrado 		
		System.out.println("cuadrado");
		int dimencion = 0;
		if (vector.length < vector[0].length) {

			dimencion = vector.length;
		} else {
			dimencion = vector[0].length;
		}

		int vector2[][] = new int[dimencion][dimencion];

		for (int i = 0; i < dimencion; i++) {

			for (int k = 0; k < dimencion; ++k) {

				vecto[i][k] = vector[i][k];
				System.out.print(vecto[i][k] + " ");

			}
			System.out.println();
		}

		System.out.println("diagonal");
		for (int i = 0; i < dimencion; i++) {

			for (int k = 0; k < 1; ++k) {

				System.out.print(vecto[i][i] + " ");

			}
			System.out.println();
		}

//el doble 

		for (int i = 0; i < filas; i++) {

			for (int k = 0; k < vector[0].length; ++k) {

				vector[i][k] = 2 * vector[i][k];
				System.out.print(vector[i][k] + " ");

			}

			System.out.println();

		}

		
		
		
		
		
		
		
		
		
		
		
		
		//insertar valores 	
		Scanner tc =new Scanner (System.in);
		System.out.println("isnserte los modulo");	
		int col=tc.nextInt();
		
		System.out.println("isnserte los modulo");	
		int fila=tc.nextInt();
		
		String nombre="nombre";
		
		
		String todo [][]=new String [fila+1][col+1];
		
		
		for (int i=0; i<todo.length; ++i) {
			
			
			for (int k=0; k<todo[0].length; ++k) {
				
				
			if (i==0 && k==0) {
				
				
			todo[i][k]=nombre;			
			}else if (i==0 && k>=1)	{
				System.out.println(" modulo");	
				String h=tc.next();	
				
				todo[i][k]=h;
				
				
			}else if (i>=1 && k==0 ) {
				
				System.out.println("alumnos");	
				String z=tc.next();	
				
				todo[i][k]=z;
				
				
				
				
				
			}else {
				
				
				System.out.println(" notas");	
				String p=tc.next();	
				
				todo[i][k]=p;	
				
				
				
				
			}
				
				
				
				
				
				
				
		
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < todo.length; i++) {

			for (int k = 0; k < todo[0].length; ++k) {

				
				System.out.print(todo[i][k] + " ");

			}

			System.out.println();

		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
