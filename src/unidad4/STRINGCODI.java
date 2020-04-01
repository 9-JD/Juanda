package unidad4;

import java.util.Scanner;

public class STRINGCODI {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String frasecodificada = " ";
		int acumulador_n = 0;
		String fraseinicial = " ";
		String continuar = "SI";

		while (continuar.equals("SI")) {

			System.out.println("introduca frase/ si quiere finalizar escirba si");
			fraseinicial = tec.nextLine().trim().toUpperCase();
			int pos = fraseinicial.indexOf("/");

			continuar = fraseinicial.substring(pos + 1).trim();
			String frase = fraseinicial.substring(0, pos).trim();

			for (int a = 0; a < frase.length(); ++a) {

				char letra = frase.charAt(a);

				if (Character.isDigit(letra)) {

					++acumulador_n;

				}
			}

			if (acumulador_n > 0) {

				System.out.println("descodificando frase");
				frasecodificada = frase.replace('4', 'A').replace('3', 'E').replace('1', 'I').replace('5', 'S')
						.replace('7', 'T');

			} else {
				System.out.println("codificando frase");

				frasecodificada = frase.replace('A', '4').replace('E', '3').replace('I', '1').replace('S', '5')
						.replace('T', '7');
			}

			System.out.println(frasecodificada);

		}
	}
}
