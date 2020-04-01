package unidad4;

import java.util.Scanner;

public class aleatorios {
	
	
	
	public static void main(String[] args) {
		int [] num = new int [6];
		int numero = (int) (Math.random() * (49-1) + 1);
		
		
		num[0]= (int) (Math.random() * (49-1) + 1);
		
		for (int i=1; i<num.length; ++i ) {
			
			
			num[i]= (int) (Math.random() * (49-1) + 1);
			
			for (int k=0; k<i; ++k) {
				
				
				if (num[i]==num[k]) {
					
				
					
					--i;
					
					
				}
				
				
				
				
			}
		}
		
		
		for (int p=0; p<num.length; ++p) {
			
			
			
			
			System.out.println(num[p]+" ");
		}
		

}


}
