package examen2eva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumnos {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		String seguir="si";
		
		List<alu> alu1 = new ArrayList<>();
		List<curso> ciclo = new ArrayList<>();
		
		alu a;
        curso b;		
		
	while(seguir.equalsIgnoreCase("si")) {
	
	b=new curso();
	System.out.println("inserte el nombre del curso");
	String nombre=tc.next();
	b.setNombre(nombre);
	System.out.println("inserte curso");
	int numero  =tc.nextInt();
	tc.nextLine();
	b.setNombre(nombre);

	
	ciclo.add(b);
	System.out.println("salir");	
	
	seguir=tc.next();	
	}
	
	
	while(!seguir.equalsIgnoreCase("si")) {
		a=new alu();	
		
	System.out.println("inserte el nombre del alumno");
	 String n=tc.next();
	a.setNombre(n);
	System.out.println("inserte años");
	int  numero1  =tc.nextInt();
	 tc.nextLine();
	a.setAños(numero1);
		
	
	System.out.println("en que cilo esta, elijalo");
	mostrar(alu1);	
 int numero2  =tc.nextInt();
	tc.nextLine();
	
	
	a.setCiclo(ciclo.get(numero2));
	alu1.add(a);	
		
	System.out.println("salir");	
		
		seguir=tc.next();		
		
	}	
		
	mostrar(alu1);	
		
	
		
		
		

	}

	private static void mostrar(List<alu> alu1) {
		for (int i=0; i<alu1.size(); i++) {
			
			
			System.out.print(i+" "+alu1.get(i).getNombre()+" "+alu1.get(0).getCial()+" "+alu1.get(i).getCiclo().getNombre());	
			
			
		}
	}

}
