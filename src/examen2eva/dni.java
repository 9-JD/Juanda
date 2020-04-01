package examen2eva;

import java.util.Scanner;

public class dni {

	public static void main(String[] args) {

		Scanner tec = new Scanner (System.in);
		
		String dni=comprobar_dni(tec);
		String dic ="TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("formmato bien introducido "+dni);
		System.out.println("comprobando letra ");
	verificasion(dni, dic);	

	}

	private static void verificasion(String dni, String dic) {
	String numeros=dni.substring(0, dni.length()-1);
	int numero=0;
	int total=0; 


	 numero =Integer.parseInt(numeros);
	
	
	

	int letra_num=numero%23;


if (dic.charAt(letra_num)==dni.charAt(dni.length()-1)) {
	
	
	System.out.println("su dni es el correcto "+dni);
	
	
	
	
}else { System.out.println("letra mal puesta" );  }









	
	
	}

	private static String comprobar_dni(Scanner tc) {
int b=0;
int t=0;
String dni="";
while (t<1) {

	System.out.println("inserte dni");
	 dni =tc.nextLine().trim().toUpperCase();

		for (int i=0; i<dni.length(); i++ ) {
			
			char a=dni.charAt(i);
			
			
			if (Character.isDigit(a)) {
				
			++b;	
				
				
			}
			
			
		}
		
		
	if (Character.isLetter(dni.charAt(dni.length()-1)) && dni.length()-1==b){
		
		++t;
		
		
		
		
	}
		
		
	}
return dni;
	}

}
