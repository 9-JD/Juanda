package apuntes;
import java.util.Scanner;
import java.util.StringTokenizer;

public class string {

	public static void main(String[] args) {

	// separar con string 
		System.out.println("SEPARAR CON SUBSTRING Y INDEOF ");
		String frase = "juan,manuel,pepe,david";
String hola[]=new String[4]; 
		String word;
		int pos = 0, ant;
		int pos1 = frase.indexOf(",");
		do {int a=1;
			ant = pos;
			pos = frase.indexOf(",", ant + 1);

			if (pos1 == pos) {

				word = frase.substring(ant, pos).trim();
				System.out.println(word);
              hola[0]=word;
			}

			else if (pos > 0) {

				word = frase.substring(ant + 1, pos).trim();
				System.out.println(word);
				
				if (a>=1 && a<=2  )
				hola[a]=word;
			}

			else {
				String word1=frase.substring(ant + 1).trim();
				System.out.println(frase.substring(ant + 1).trim());
				hola[a]=word1;
			}
			++a;
		} while (pos >= 0);

		
		
		
		System.out.println();		
		
		//SEPARAR CON SPLIT
		System.out.println("SEPARAR CON SPLIT ");		
		
		
	String vector []=frase.split(",");
	
	for (String a: vector) {
		
		System.out.println(a);
		
		
	}	
		
		
//SEPARAR CON TOKENIZER  
	
	System.out.println();	
	System.out.println("SEPARAR CON tokenizers");		

	StringTokenizer tokens=new StringTokenizer(frase, ",");
        int nDatos=tokens.countTokens();
        String [] datos=new String [nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=str;
            System.out.println(datos[i]);
            i++;
        }	
	
	
	
	
	
	//substring
	
	
	String frase1="hola mi : amigo mio";
	
	int pos2=frase1.indexOf(":");
	
	String primero=frase1.substring(0, pos2);
	String primero1=frase1.substring(pos2+1);
	System.out.println(primero);	
	System.out.println(primero1);
	
	
		
	}

}
