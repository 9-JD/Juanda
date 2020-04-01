package apuntes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import examen2_final.persona;

public class listas {

	public static void main(String[] args) {
		
	// declarra lista	
		
		List<String> lista = new ArrayList<>();	
		lista.add("hola");
		lista.add("hola1");
		
	
		
		System.out.println("iterator con for  ");	
//con for 
for (Iterator< String >it =lista.iterator();it.hasNext();) {
	String h=it.next();
	
	System.out.println(h);
	
}
		
//con while 

System.out.println("iterator con while ");
Iterator <String> it1=lista.iterator();
while (it1.hasNext()) {
System.out.println(it1.next());
}
		
		
System.out.println("con for each ");		
		
		
	for (String x: lista) {
		
		System.out.println(x);
		
		
	}	
		
	System.out.println("incremetador ");		
	
	
	for (int i=0; i<lista.size(); i++) {
		
		System.out.println(lista.get(i));
		
		
	}			
		


}
}