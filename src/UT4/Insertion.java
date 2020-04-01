package UT4;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Cantidad de elementos: ");
		int elem=sc.nextInt();
		
		int[] vector=new int[elem];
		
		for(int i=0; i<vector.length;i++) {
			vector[i]=Aleatorio();
		}
		
		Mostrar(vector);
		
		for(int i=1; i<vector.length; i++) {
			int valor=vector[i];
			int j=i-1;
			while(j>=0  && vector[j]>valor) {
					vector[j+1]=vector[j];
					j--;
			}
			vector[j+1]=valor;
			}
		
		Mostrar(vector);
	}

	private static void Mostrar(int[] vector) {
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+"  ");
		}
		System.out.println();
		
	}

	private static int Aleatorio() {
		
		return ((int) (Math.random()*100)) ;
	}

}
