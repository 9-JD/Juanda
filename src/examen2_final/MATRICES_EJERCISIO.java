package examen2_final;

import java.util.Scanner;

public class MATRICES_EJERCISIO {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		String nombre = "nombre";
		System.out.println("inserte el numero de modulos ");
		int modulos = tc.nextInt();
		tc.nextLine();
		modulos = modulos + 1;
		System.out.println("inserte el numero de alumnos ");
		int alumnos = tc.nextInt();
		tc.nextLine();
		alumnos = alumnos + 1;

		String a[][] = new String[alumnos][modulos];
		int l = 0;

		for (int i = 0; i < a.length; i++) {

			for (int k = 0; k < a[i].length; k++) {

				if (i == 0 && k == 0) {

					a[i][k] = nombre;

				} else if (i == 0 && k >= 1) {

					System.out.println("inserte el nombre del  modulo ");
					String modulo=nombre_mod(tc);
					a[i][k] =modulo;

				} else if (i >= 1 && k == 0) {
					System.out.println("inserte el nombre del alumno (alunos insertados son" + (l) + ")");
					String no = tc.next();
					a[i][k] = no;
					l++;

				} else {
					System.out.println("inserte la nota del modulo de  " + a[0][k]);

					

					a[i][k] = comprobar_numeros_suma(tc, a);
				}

			}

		}

		double suma_fila_todo []= new double [a.length];
		double suma_columna_todo []= new double [a[0].length];
		suma_filas(a, suma_columna_todo);
		
		suma_coluna( a, suma_fila_todo );
		
		mostrar_matriz(a, suma_columna_todo, suma_fila_todo);
		
		
	//suma media alumno
	int opcion=opcion_media_alu(tc, a);
	
	Double suma_alumno=	opcion_media_alu_suma(opcion, a);
	Double media=	media_alu(a, suma_alumno);
	
	System.out.println("la suma total es "+suma_alumno+" la media "+media);
	
	
	//suma media mod
	opcion=opcion_media_mod(a, tc);
	Double suma_mod=opcion_media_mod_suma(a, opcion);	
	media=media_mod(a, suma_mod);	
	System.out.println("la suma total es "+suma_mod+" la media "+media);	
		
		

		
		
		
		
		
		
		
	}

	private static void suma_filas(String a [][], double suma_columna_todo []) {
		Double suma=0.0;
		double cam=0.0;
		int b=0;
		for (int i=1; i<a.length; ++i) {
			
			
			for (int k=1; k<a[0].length; k++) {
				
				
						
			cam=Double.parseDouble(a[i][k]);
				
			suma+=cam;
				
				
			}
			suma_columna_todo[b]=cam;
			suma=0.0;
			++b;
			
			
			
		}
		
	}
	private static void suma_coluna(String a [][], double suma_fila_todo[] ) {
		double suma=0.0;
		int k=0;
		for (int i=1; i<a[0].length; ++i) {
			
			
			for ( k=1; k<a.length; k++) {
				
				
						
			double cam=Double.parseDouble(a[k][i]);
				
			suma=suma+cam;
			suma_fila_todo[k]=cam;
				
			}
			
		
			 suma=0.0;
			
			
			
			
		}
		
	}
	private static Double media_alu(String a [][], double suma_alumno  ) {
		
		
		Double ma=(double) (a.length-1);
		
		Double media =suma_alumno/ma;
		
		return media;
	}
private static Double media_mod(String a [][], Double suma_alumno) {
		
		
		Double ma=(double) (a[0].length-1);
		
		Double media =suma_alumno/ma;
		
		return media;
	}
	private static Double opcion_media_mod_suma(String a [][], int opcion) {
		
		Double sumatotal=0.0;
		for (int i=1; i<a.length; ++i) {
			
		Double num=Double.parseDouble(a[i][opcion]);	
			
			
		sumatotal+=num;	
			
		}
		
		
		
		
		return sumatotal;
	}

	private static int opcion_media_mod(String a [][], Scanner tc ) {
		System.out.println("elija la media del mod");	
	for (int i=1; i<a.length; ++i) {
		
		System.out.println(i+" "+a[0][i]+"\t");	
		
		
		
		
	}	
		
		
	int opcion =tc.nextInt();
	tc.nextLine();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		return opcion;
	}

	private static Double opcion_media_alu_suma(int opcion, String[] [] a) {
	
		
		Double sumatotal=0.0;
			
		for (int k=1; k<a[0].length; ++k) {
			
			Double suma=Double.parseDouble(a[opcion][k]);
			
		sumatotal+=suma;	
			
			
			
			
			
			
			
			
		}	
			
		
		
		return sumatotal;
		
		
		
		
		
		
		
		
		
		
		
	}

	private static int opcion_media_alu(Scanner tc, String[][] a) {
		System.out.println("elija la media del alumno que auiera realizar");
		
		
		for (int i=1; i<a.length; ++i) {
			
			
			System.out.println(i+" "+a[i][0]+"\t");
			
			
			
			
			
		}
		int opcion =tc.nextInt();
		tc.nextLine();
		return opcion;
	}

	private static String nombre_mod(Scanner tec ) {
		
	int b;
	String nombre="";
	int c=0;
	
	while (c==0) {
	
	
		
		 nombre=tec.next().trim();
		
		 b=0;
		for (int i=0; i<nombre.length(); i++) {
			
			char a= nombre.charAt(i);
			
			
		if (Character.isLetter(a)) {++b;}
		}
		
	
	if (b != nombre.length()) {   System.out.println("error vuelva a introducir nombre ");                  } else {++c;}
	}	
		return nombre;	
			
		}
		
		
		
		


	private static String comprobar_numeros_suma(Scanner tec, String a[][] ) {
	
		int o=0;
		String numeros_double="";
	
		while (o==0) {
try {	
		
	 numeros_double=tec.next();
	Double numeros= Double.parseDouble(numeros_double);	
	++o;
} catch(NumberFormatException e) {
	
	System.out.println("solo numeros por favor");
	tec.nextLine();
	
	
}
		
		
		}	
		return  numeros_double;
			
		
	}

	private static void mostrar_matriz(String[][] a, double suma_columna_todo [], double suma_fila_todo[]) {
	int	b=0;
	
		for (int i = 0; i < a.length; ++i) {

			for (int k = 0; k < a.length; ++k) {

				System.out.print(" " + a[i][k]+ "\t");
				
			}
				
			System.out.print(" "+suma_columna_todo [b] );

			System.out.println();

		}
		
		
		for (int k = 0; k < suma_fila_todo.length; ++k) {
		
		System.out.print(" "+suma_fila_todo [k] +"\t");	
		
		}
		
	}

}


