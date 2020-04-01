package UT4;

import java.util.Scanner;

public class Coctel {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println("Introduzca la Longitud: ");
		int elem=key.nextInt();
		int vector[]=new int [elem];
		for(int i=0;i<vector.length;i++) {
			vector[i]=Aleatorio();
		}
		Mostrar(vector);
		int p=0;
		int ult=vector.length-1;
		int aux;
		while(p<ult){
			for(int i=p;i<ult;i++) {
				if(vector[i+1]>vector[i]) {
					aux=vector[i+1];
					vector[i+1]=vector[i];
					vector[i]=aux;
				}
			}
			ult--;
			for(int i=ult-1;i>p;i--) {
				if(vector[i-1]<vector[i]) {
					aux=vector[i];
					vector[i]=vector[i-1];
					vector[i-1]=aux;
				}
			}
			p++;
		}
		Mostrar(vector);
		
		
		
		
		
		key.close();
	}
	private static void Mostrar(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
	private static int Aleatorio() {
		return ((int) (Math.random() * 100));
	}
}
