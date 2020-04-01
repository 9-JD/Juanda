package BUCLE;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero,f,f1,i;
        System.out.print("numero fibonaci : ");
        f = sc.nextInt();
        f1=f;
        System.out.print("cuantos numeros quieres representar : ");
        numero = sc.nextInt();
        for(i=1;i<=numero;i++){
             System.out.print(f1 + " ");
             f = f + f1;
             f1 = f - f1;
        }
        System.out.println();
	}

}
