package unidad3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		boolean seguir = true;
		int num1 = 0;
		int num2 = 0;
		System.out.println("calculadora");
		while (seguir) {
			System.out.println("introduzca numeros");
			try {
				System.out.println("num1");
				num1 = sc.nextInt();
				sc.nextLine();
				System.out.println("num2");
				num2 = sc.nextInt();
				sc.nextLine();
			

			System.out.println("operaciom que quiere realizar indique con caracteres");

			char e = (char) System.in.read();
			sc.nextLine();

			if (e == 43 || e == 45 || e == 42 || e == 47) {

				switch (e) {

				case '+':
					System.out.println(num1 + num2);

					break;
				case '-':
					System.out.println(num1 - num2);
					break;
				case '*':
					System.out.println(num1 * num2);
					break;

				case '/':



						System.out.println(num1 / num2);
					

					break;
				}
			}

			else {
				System.out.println("error en la designacion de los operadores");
			}

			System.out.println("si quiere continuar pulse S");
			char d = (char) System.in.read();

			if (d == 83) {
				seguir = true;
			} else {
				System.out.println("fin del programa");
				seguir = false;
			}

			} catch (InputMismatchException e2) {

			System.out.println(" NUMEROS  no caracteres " + e2.getMessage());
			sc.nextLine();}
			
		catch (ArithmeticException e1) {

			System.out.println("error" + e1.getMessage());

		}
			
			
			
			

	}

}
}
