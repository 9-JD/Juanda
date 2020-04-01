package examen2_final;

import java.io.BufferedReader;

import java.io.IOException;

import java.util.Scanner;

public class Ofuscado {
	public static void imprimir(String parametro1) {
		System.out.println(parametro1);
	}

	public static int factorial(int parametro1) {
		if (parametro1 == 0) {
			return 1;
		} else {
			int variable1 = 1;
			int variable2 = parametro1;
			do {
				variable1 *= variable2;
				variable2--;
			} while (variable2 > 0);
			return variable1;
		}
	}

	public static String palabra_mas_invertida(String parametro1) {
		String variable1 = "";
		int variable2 = 0;
		do {
			variable1 = parametro1.charAt(variable2) + variable1;
			variable2++;
		} while (variable2 < parametro1.length());
		variable1 = parametro1 + variable1;
		return variable1;
	}

	public static void main(String[] args) throws IOException {
		Scanner tec = new Scanner(System.in);
		int opcion_menu;
		do {
			opcion_menu = imprimir_menu(tec);
			if (opcion_menu== 1) {
				imprimir("Inserte un número:");
				String numeros_string = tec.nextLine();
				int numeros_conversion = Integer.parseInt(numeros_string);
				int factorial_num = factorial(numeros_conversion);
				imprimir("El resultado es:");
				imprimir("" + factorial_num);
			} else {
				if (opcion_menu == 2) {
					imprimir("Inserte una palabra:");
					String palabra = tec.nextLine();
					String palabra_con_invertida = palabra_mas_invertida(palabra);
					imprimir("El resultado es:");
					imprimir("" + palabra_con_invertida);
				}
			}
		} while (opcion_menu != 3);
	}

	private static int imprimir_menu(Scanner tec) {
		int opcion_menu;
		imprimir("BIENVENIDO AL PROGRAMA OFUSCADO");
		imprimir("-------------------------------");
		imprimir("Elija una opcion:");
		imprimir("1) factorial de un numero");
		imprimir("2) Palabra normal y invertida");
		imprimir("3) salir del programa");
		imprimir(">");
		String variable3 = tec.nextLine();
		opcion_menu = Integer.parseInt(variable3);
		return opcion_menu;
	}
}
