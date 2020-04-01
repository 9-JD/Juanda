package unidad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prueba {
	static List<String> ListaA  = new ArrayList<>();
	static List<String> ListaH  = new ArrayList<>();
	static List<String> ListaO  = new ArrayList<>();
	static	List<String> ListaR = new ArrayList<>();
	static char [] Comp = {'A', 'H', 'O', 'R'};
	static	int lista_elegida =0;
	static String nombre =" ";
	static String nombre1 =" ";
	public static void main(String[] args) {
		
		
Scanner tc = new Scanner (System.in);
		
		
		String seguir="si";
	
		int listamal=0;




while (seguir.equalsIgnoreCase("si")) {



		System.out.println("introduzca nombre");
		nombre=tc.next().toUpperCase().trim();
		
		averiguar_lista(nombre);
		System.out.println("DESA INTRODUCIR MAS NOMBRES SI / NO");
		seguir=tc.next();	
}
	
		






correcion(tc, ListaA);
modificacion(tc);		
		
	}


	private static void modificacion(Scanner tc) {
		System.out.println("introduzca el nombre y appelidos bien escrito"  );	
		nombre1=tc.next().toUpperCase().trim();
		
		
		
		
		if (nombre1.charAt(0)>=Comp[0] && nombre1.charAt(0)<Comp[1]) {
		
			
			
			
		}else {System.out.println("no pertenece a esta lista "	);	
				
		
		ListaA.remove(ListaA.indexOf(nombre));
		averiguar_lista(nombre1);
		
		}
	}		
		
		
private static void averiguar_lista(String nombre) {
	char inicial =nombre.charAt(0);
	

	
	if (inicial=='Ñ') {
		System.out.println("Se ha introducido en la tercera lista ");
		ListaH.add(nombre);	
		lista_elegida=3;
	} else {
	
	if (inicial>=Comp[0] && inicial<Comp[1]) {
		System.out.println("Se ha introducido en la primera lista ");
		ListaA.add(nombre);
		lista_elegida=1;
	
		
		
	}else if (inicial>=Comp[1] && inicial<Comp[2]) {
		ListaH.add(nombre);
		System.out.println("Se ha introducido en la segunda  lista ");
		lista_elegida=2;
		
		
	}else if (inicial>=Comp[2] && inicial<Comp[3]) {
		ListaO.add(nombre);
		System.out.println("Se ha introducido en la tercera lista ");
		lista_elegida=3;
		
		
	}else if (inicial>=Comp[3]) {
		ListaR.add(nombre);
		System.out.println("Se ha introducido en la cuarta lista ");
		lista_elegida=4;
		
		
	}
	}
}	
		
		
		
private static void correcion(Scanner tc, List<String> lista ) {
	
	
	int index= -1;
	
	while (index ==-1) {
		
		try {
	System.out.println("introduca el apellido y el nombre que esta mal escrito"  );	
		nombre=tc.next().toUpperCase().trim();	
		 index=lista.indexOf(nombre);
				
			
		}catch(ArrayIndexOutOfBoundsException e1) {	
			
			System.out.println(" mal escrito"  );	
			
			
		}	
				
			
		}
	
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
