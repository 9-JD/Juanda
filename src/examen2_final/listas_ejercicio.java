package examen2_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class listas_ejercicio {

	public static void main(String[] args) {
		
		Scanner tec =new Scanner (System.in);
		List<Double> altura = new ArrayList<>();
		
		int i =0;
		double suma=0.0;
	int	b=0;
		while (i<1) {
			
		System.out.println("inserte la altura");	
			
			altura.add(tec.nextDouble());
			suma=suma+altura.get(b);
			System.out.println("si quiere salir pulse 1");	
			i=tec.nextInt();
			tec.nextLine();
			++b;
		}
		
	double media = (double) suma/altura.size();	
	System.out.println(media);
	System.out.println();
	
	System.out.println("vector ");	
	Double vector []= new Double [altura.size()];
	
altura.toArray(vector);
	
	
for ( Double a:vector) {
	
	System.out.println(a);	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
Collections.sort(altura);	
	
	
	System.out.println();	
		System.out.println("for each ");		
		
		
for ( Double a:altura) {
	
	System.out.println(a);	
	
	
}	
String pos="";
Collections.sort(altura, Collections.reverseOrder());		
System.out.println();		
System.out.println("for con incrementador ");		
for (int t=0; t<altura.size(); t++) {
	
	System.out.println(altura.get(t));	
	if(media>altura.get(t)) {
	String p=Integer.toString(i);
	
	pos+=p;
		
		
		
		
	}
	
}		


System.out.println("numero por debajo de la media son  "+pos.length()+ " en la pos "+pos);

System.out.println();	
System.out.println("iterator ");		
Iterator <Double> it = altura.iterator();
		
while(it.hasNext()) {
	
	
	System.out.println(it.next());	
	
	
	
	
}	
		

int j=Collections.frequency(altura, media);
String vetor="";
String a3="";
int a=5;
int t=0;
while (a>0) {
 try {	
	 a=altura.indexOf(media);
	altura.set(a, 0.0);
	 a3=a3.valueOf(a);
	
	vetor+=a3+"" ;
	
	++t;} catch(ArrayIndexOutOfBoundsException e) {  
		
	a=-1;	
		
		
	}
	
	
	
}


System.out.println("igual a la media son  "+j+ " en la pos "+vetor);















		
		
	}

}
