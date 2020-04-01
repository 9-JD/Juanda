package unidad4;

import java.util.Arrays;

public class vectroeee {

	public static void main(String[] args) {
		 
		    int [] a  = {7,2,4,8,3,9,1,5,10,6};
		    int menor;

		    for(int i = 0; i < 10; i++){
		        menor = a[0];

		        if (a[i] < menor){
		            menor = a[i];
		        }
		        else{
		            if (a[i] > menor){
		              menor = menor;
		            }      
		        }
		    }
		    System.out.println(Arrays.toString(a));
		}
	}


