package unidad2;

import java.util.Random;

public class numero_aleatorio {

	public static void main(String[] args) {
	
		int i =0;
		while ( i < 2) {
			
			
			int varMath = (int)(Math.random()* 256);
			System.out.println ("numero " +varMath+ " que es " + (char)varMath);
			i++;
		}
		
		
		System.out.println ("OTRO METODO");
		
		
		int a =0;
		while ( a < 10) {
			Random varRandom =new Random();
			int num= varRandom.nextInt(300);
			System.out.println ("numero " +num+ " que es " + (char)num);
			a++;
		
		
		
		
		
		
	}

}


}