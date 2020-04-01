package BUCLE;

import java.util.Scanner;

public class recursivobiona {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = num1;
		System.out.println(+bionaci(num1, num2));

	}

	public static int bionaci(int s, int p) {
		
		if (s == p) {

			System.out.print(s + " ");
			System.out.print(p + " ");

		}

		
		
		
		else if (s>0) {

			System.out.print(s + " ");
			
		}

		bionaci(s = s + p, p = s - p);
       
		return s;

	}

}
