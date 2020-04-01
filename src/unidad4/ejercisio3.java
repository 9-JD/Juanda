package unidad4;

import java.util.Scanner;

public class ejercisio3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double plato_principal = 0;
		double plato_segundo = 0;
		double plato_tercer = 0;

		// potaje
		double potaje = 4.45;
		double c = 0.50;
		double z = 0.36;

		// ensalada
		double ensalada = 4.00;
		double a = 1.25;
		double p = 0.80;

		// pasta
		double pasta = 4.00;
		double ca = 4.35;
		double b = 4.20;

		// bistec;
		double biste = 4.60;
		double papas = 1;
		double col = 1.20;

		// postres

		double bro = 3.20;
		double h = 0.60;

		double tarta = 3;

		double flan = 2.50;
		double nata = 0.20;

		System.out.println("elija el plato principal potaje=1, ensalada=2 pasta=3");

		int opcion = tec.nextInt();
		tec.nextLine();
		switch (opcion) {

		case 1:
			System.out.println("ha elegido potaje");
			System.out.println("si quiere cebolla pulse 1 y si no 0");
			int cebolla = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere zanahoria pulse 1 y si no 0");
			int zanahoria = tec.nextInt();
			tec.nextLine();
			plato_principal = potaje + (c * cebolla) + (z * zanahoria);

			break;

		case 2:
			System.out.println("ha elegido ensalada");
			System.out.println("si quiere agauacate pulse 1 y si no 0");
			int agua = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere piña pulse 1 y si no 0");
			int piña = tec.nextInt();
			tec.nextLine();

			plato_principal = potaje + (a * agua) + (p * piña);
			break;

		case 3:
			System.out.println("ha elegido ensalada");
			System.out.println("si quiere carbonara pulse 1 y si no 0");
			int carbo = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere bolagnesa pulse 1 y si no 0");
			int bola = tec.nextInt();
			tec.nextLine();

			plato_principal = potaje + (ca * carbo) + (b * bola);
			break;

		}

		System.out.println("elija el plato segundo canalones=1, bistec=2");

		opcion = tec.nextInt();
		tec.nextLine();

		switch (opcion) {

		case 1:
			System.out.println("ha elegido canalones");
			System.out.println("si quiere carne pulse 1 y si no 0");
			int carne = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere pescado pulse 1 y si no 0");
			int pes = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere salsa de la casa pulse 1 y si no 0");
			int salsa = tec.nextInt();
			tec.nextLine();

			plato_segundo = carne + pes + salsa;

			break;

		case 2:
			System.out.println("ha elegido bistec");
			System.out.println("si quiere agauacate pulse 1 y si no 0");
			int a1 = tec.nextInt();
			tec.nextLine();
			System.out.println("si quiere piña pulse 1 y si no 0");
			int p1 = tec.nextInt();
			tec.nextLine();

			plato_segundo = biste + (papas * a1) + (col * p1);
		}

		System.out.println("elija el plato tercer brownie=1, tarta=2 flan =3");

		opcion = tec.nextInt();
		tec.nextLine();

		switch (opcion) {

		case 1:
			System.out.println("ha elegido brownie");
			System.out.println("si quiere helado pulse 1 y si no 0");
			int helado = tec.nextInt();
			tec.nextLine();

			plato_tercer = bro + (h * helado);

			break;

		case 2:
			System.out.println("ha elegido tarta");

			plato_tercer = tarta;

			break;

		case 3:

			System.out.println("ha elegido flan");
			System.out.println("si quiere nata pulse 1 y si no 0");
			int nata1 = tec.nextInt();
			tec.nextLine();
			plato_tercer = flan + (nata * nata1);

			break;

		}

		System.out.println("usted a eledido plato principla" + plato_principal + " plato secundario " + plato_segundo
				+ " postres" + plato_tercer);

	}

}
