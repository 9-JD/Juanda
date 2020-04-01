package examen2eva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perromain {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		String seguir="si";
		 int b=0;
		List<dueño> amo = new ArrayList<>();
		List<perro> ani= new ArrayList<>();
		dueño a;
		perro p;
	while (seguir.equalsIgnoreCase("si")) {
		a= new dueño();
		p=new perro();
		System.out.print("nombre de animal ");
		p.setNombre(tc.next());
		System.out.print("edad de animal ");
		p.setEdad(tc.nextInt());
		tc.nextLine();
		
		System.out.print("nombre del dueño ");
		String du =tc.nextLine();
		 
	if (amo.size()>0) {	
		b=0;
				for (int i = 0; i < amo.size(); ++i) {

					if (amo.get(i).getNombre().equalsIgnoreCase(du)) {
                  
						System.out.print("dueño ya registrado agragado a mascota");
						p.setAmo(amo.get(i));
						ani.add(p);
                        --b;
					}
	}
			
		} if (b==0) {      
		
		a.setNombre(du);
		
		 System.out.print("tfo del dueño"); 
		
		a.setTelefono(tc.next());
        amo.add(a);
		p.setAmo(a);
		ani.add(p);
		
		
	}	
		
	
	
	
	 System.out.print("salir"); 
	
	seguir=tc.next();
	}
	
		
	
	while (seguir.equalsIgnoreCase("no")) {
		System.out.print("elija un animal ");
		
		for (int i =0; i<ani.size(); i++)	{
			 System.out.println(+i+" "+ani.get(i).getNombre());	
			
			
			
			
		}	
	int n =tc.nextInt()	;
	tc.nextLine();
	System.out.println("esta vacunado"+ ani.get(n).getNombre());	
		String si ="si";
		
		
		if (si.equals("si")) {
			
			ani.get(n).setVacunado(true);
			
			
			
			
		}
		System.out.print("salir"); 
		
		seguir=tc.next();
		
		
	}
	
	
	
	
	
	
	
	
	
		
		
		
		
	
		
		
		 System.out.println(" "+ani.get(0).getNombre()+" "+ani.get(0).getEdad()+" "+ani.get(0).getAmo().getNombre()+" "+ani.get(0).getAmo().getTelefono()+" "+ani.get(0).isVacunado()); 	
		
		 System.out.println(" "+ani.get(1).getNombre()+" "+ani.get(1).getEdad()+" "+ani.get(1).getAmo().getNombre()+" "+ani.get(1).getAmo().getTelefono()+" "+ani.get(1).isVacunado()); 	
		
		
		
		
		
	
		
		
		
		

	}

}
