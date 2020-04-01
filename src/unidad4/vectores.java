package unidad4;

import java.util.Scanner;

public class vectores {

	public static void main(String[] args) {
		// creamos el scanner

		Scanner tec = new Scanner(System.in);
		// creamos el vector que contendra las clases de energia

		int[] energia = { 7, 8, 8, 8, 1};
 String [] letras= {"A", "B", "C", "D", "E"};
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int mayor = 0;
		int mayor1=0;
		int posmayor = 0;
		int igual=0;
		int mas=0;
		int menor = 0;
		int menor1=0;
		int menos=0;
		int mitad=0;
		int posmenor = 0;
		int numero_de_visitas = 0;
		String funcionamiento = "Incio";
String b1=" ";
String b2=" ";
String b3=" ";
		/*int final1 = 0;

		
		  while (final1 != 1) {
		 System.out.println("¿La casa tiene categoría energética ?INIDIQUE SI O NO ");
		  
		  String decision = tec.next().trim();
		  
		  if (decision.equals("SI")) {
		  
		  System.out.println("inserte  la categoría energética al que pertenece la casa A, B, C, D  "
		  );
		  
		  decision = tec.next().trim();
		  
		  switch (decision) {
		  
		  case "A": numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
		  ++a; energia[0] = a; break;
		  
		  case "B": numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
		  ++b; energia[1] = b; break;
		  
		  case "C": numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
		  ++c; energia[2] = c; break;
		  
		  case "D": numero_de_visitas = opcion_elegida(numero_de_visitas, decision);
		  ++d; energia[3] = d; break;
		  
		  default:
		 
		  System.out.println("debe elegir entre A, B , C, D ");
		  
		  }
		  
		  } else if (decision.equals("NO"))  { System.out.
		  println("la casa no tiene categoria energetica a sido registrado como tal ");
		  ++e; energia[4] = e; ++numero_de_visitas; }
		 
		  else {   System.out.println("por favor escriba en mayuscula SI O NO para poder continuar con el programa gracias ");         }
		  System.out.println("si quiere salir escriba Fin en caso contratrio escriba seguir  "
		 ); decision = tec.next().trim(); if (decision.equals("Fin")) {
		  
		  System.out.println("fin del programa"); final1 = 1;
		  
		  } }
		 */
		
		 
		mayor = energia[0];
		mayor=mayor1;
		menor = energia[0];
	menor1=menor;;
		
		
		
		for (int i = 0; i < 5; ++i) {

			if (mayor < energia[i]) {
               mayor=energia[i];
				posmayor=i+1;}
		
			if  (menor > energia[i]) {

				menor=energia[i];
				posmenor=i+1;
			
				}	
				
			
			
		switch (i) {

			case 0:

				System.out.println("Numero de casas vistadas de la categoria (A)  " + energia[i]);
				break;
			case 1:

				System.out.println("Numero de casas vistadas de la categoria  (B)  " + energia[i]);
				break;
			case 2:

				System.out.println("Numero de casas vistadas de la categoria (C)  " + energia[i]);
				break;
			case 3:

				System.out.println(
						"Numero de casas vistadas de la categoria  (D)  " + energia[i]);
				break;
			case 4:

				System.out.println(
						"Numero de casas vistadas son de la categoria  (E)  " + energia[i]);
				break;

			}
			
		}
		
		
		
		
		for (int k = 0; k < 5; ++k) {
			
			if (mayor == energia[k]) {
				 mas=k;
				
				 		 
				 
				 b1 =b1.concat(letras[mas].concat(" "));	
			}
			else if (menor == energia[k]) {
					 menos=k;
					
					 		 
					 
					 b2 =b2.concat(letras[menos].concat(" "));	}
					
              
					 
					 else if (energia[k]<mayor && energia[k]>menor  ) {
				
				mitad=k;
				
		 		 
				 
				 b3 =b3.concat(letras[mitad].concat(" "));	
				
				
				
				
			}	
		}
					 
		
		
		
		
		 System.out.println("El mayor numero de casa visitadas son de las ctegorias:"+b1+"con "+mayor+" visitas" );
		 System.out.println("El menor numero de casa visitadas son de las ctegorias:"+b2 );
		 System.out.println("entre las mayores y menores numero de casa visitadas son de las ctegorias:"+b3 );
		if (mayor ==mayor1) {
			
			posmayor=1;
			
			
			
		}
		
	
if (menor ==menor1) {
			
			posmenor=1;
			
			
			
		}
		
		
		
		
		
		System.out.println("mayor " + mayor+" menor "+menor+ "mas" +mas);	
//LO QUE SE LE MUESTRA AL USUARIO

//numero de visitas
		System.out.println("Numero de visitas realizadas "+numero_de_visitas);

//para el mayor 
		int opcion = posmayor;
		
		String frase = "El mayor numero de ";
		mayor_menor(mayor, posmayor, opcion, frase);
//para el menor
		 opcion = posmenor;
		 posmayor=posmenor;
		 mayor=menor;
		 frase = "El menor numero de ";
		 mayor_menor(mayor, posmayor, opcion, frase);	 
		 
	}
//establecemos un metodo para que nos indique el amyor y menor de las categorias y por otro lado ahorramos codigo.
	private static void mayor_menor(int mayor, int posmayor, int opcion, String frase) {
		switch (opcion) {

		case 1:

			System.out.println(frase + "casas vistadas son las que pertencen a la categoria (A)  " +mayor);
			break;
		case 2:

			System.out.println(frase + "casas vistadas son las que pertencen a la categoria (B)  " + +mayor);
			break;
		case 3:

			System.out.println(frase + "casas vistadas  son las que pertencen a la categoria (C)  " +mayor);
			break;
		case 4:

			System.out.println(
					frase + "casas vistadas son las que pertencen a la categoria (D)  " +mayor);
			break;
		case 5:

			System.out.println(
					frase + "casas vistadas  son las que pertencen a las que no tienen categoria (E)  "+mayor);
			break;

		}
	}
//ahoramos codigo ya que esto se repite
	private static int opcion_elegida(int numero_de_visitas, String decision) {
		System.out.println("la categoría energética al que pertenece la casa es (" + decision
				+ ") HA SIDO REGISTRADO EN EL SISTEMA");
		++numero_de_visitas;
		return numero_de_visitas;
	}

}
