import java.util.InputMismatchException;
import java.util.Scanner;

public class juegode_tijeras_piedra_papel {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int piedra = 1;
		int papel = 2;
		int tijera = 3;
		int turno_usuario = 1;

		while (turno_usuario != 0) {

			try {
				System.out.println("elija piedra-1, papel-2, tijeras-3/ pulse cero para salir ");
				turno_usuario = tec.nextInt();
				tec.nextLine();

				int turno_maquina = (int) (Math.random() * 3 + 1);

				switch (turno_usuario) {

				case 1:

					System.out.println("usted a elegido piedra ");
					extracted(piedra, papel, turno_maquina);
					turno_usuario = extracted2(piedra, papel, tijera, turno_usuario, turno_maquina);

					break;

				case 2:

					System.out.println("usted a elegido papel ");
					extracted(piedra, papel, turno_maquina);
					turno_usuario = extracted2(piedra, papel, tijera, turno_usuario, turno_maquina);
					break;

				case 3:

					System.out.println("usted a elegido tijeras ");
					extracted(piedra, papel, turno_maquina);
					turno_usuario = extracted2(piedra, papel, tijera, turno_usuario, turno_maquina);
					break;

				default:

					System.out.println("por favor elija los numeros asignados al juego ");

				}

			} catch (InputMismatchException e) {
				System.out.println("introduzca solo numeros");
				tec.nextLine();
			}
		}
		tec.close();
	}

	private static int extracted2(int piedra, int papel, int tijera, int turno_usuario, int turno_maquina) {
		if ((turno_usuario == piedra && turno_maquina == tijera) || (turno_usuario == papel && turno_maquina == piedra)
				|| (turno_usuario == tijera && turno_maquina == papel)) {

			System.out.println("has ganado  ");

			turno_usuario = 0;

		} else if (turno_usuario == turno_maquina) {

			System.out.println("empate  ");

		} else {

			System.out.println("ha ganado la maquina  ");
		}
		return turno_usuario;
	}

	private static void extracted(int piedra, int papel, int turno_maquina) {
		if (turno_maquina == piedra) {

			System.out.println("la maquina a elegido  piedra ");

		} else if (turno_maquina == papel) {

			System.out.println("la maquina a elegido  papel ");

		}

		else

		{

			System.out.println("la maquina a elegido  tijeras ");

		}
	}

}
