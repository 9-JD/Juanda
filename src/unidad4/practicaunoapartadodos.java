package unidad4;

import java.util.Scanner;

public class practicaunoapartadodos {

	public static void main(String[] args) {
		//establecemos los string y strinbuffer
		Scanner tec = new Scanner (System.in);
		StringBuffer autor ;
		StringBuffer libro;
		String autor1;
		String libro1;
		String punt_coma =";";
		String espacio=" ";
		
		
		String fer=" escrito por";
	
		System.out.println("Titulo del libro");
		libro1=tec.nextLine().trim();
		//le añadimos un espacio para que al final se vea separado las palabras
		libro1+=espacio;
		//creamos la StringBuffer a traves de la string del teclado
		libro= new StringBuffer(libro1);
		
		System.out.println("autor del libro");
		autor1=tec.nextLine().trim();
		//le añadimos un espacio para que al final se vea separado las palabras
		autor1+=espacio;
		//creamos la StringBuffer a travez de la string del teclado
		autor= new StringBuffer(autor1);
		
		//concatenamos las string de libro punt_coma y autor 
		
		System.out.println("Modifica la primera string añadiendo una coma y el autor (con append).");
			libro=libro.append(punt_coma).append(autor);
			System.out.println(libro);
	// aplicando directamente el reverse
			System.out.println("Invierte la cadena (reverse).");
		libro=libro.reverse();
		System.out.println(libro);
		// lo hacemos a traves de StringBufer
		System.out.println("Sustituye la coma por la substring “ escrito por “ (con replace) metodo Stringbuffer");
		
		StringBuffer libro2 = libro;
			int pos = libro2.indexOf(";");		
		libro2=libro2.replace(pos, pos+1, fer);
		
		System.out.println(libro2 ); 
		// lo hacemos a traves de los metodos de string
		System.out.println("Sustituye la coma por la substring “ escrito por “ (con replace)metodo String ");
		
		String 	t = " escrito por";
		
		t=libro.substring(0, libro.length()).replaceAll(";", t);
			
		System.out.println(t);
	
		tec.close();

	}

}
