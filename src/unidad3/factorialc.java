package unidad3;

import java.util.Scanner;

public class factorialc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce numero ");
 //declaramos las variables
		int num1 = sc.nextInt();
//llamamos al metodo
		System.out.println("el numero factorial es  " + auxFactorial(num1));
		sc.close();
	}
	//establecemos el metodo con la recursividad 
	public static int auxFactorial(int s) {

		int res = 0;

		if (s > 0) {
			res = s * auxFactorial(s - 1);

		} else if (s == 0) {
			res = 1;

		}
		return res;
	}

}
	










