package BUCLE;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class examen2 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		double con = 5.75;
		char a = ' ';
		while (a != 'N') {
			System.out.println(
					"inserte dia de la semana Lunes=L , Mrtes=M, Mircoles=X jueves=J, VIERNES=V, Sabado=S, Domingo=D ");
			char horario = (char) System.in.read();
			teclado.nextLine();

			System.out.println(
					"inserte el horario laboral N horario entr semana de 8-22, T el resto de hors semanales, Sabados y domingos horario 9 a 22 S Y el resto de hora para los fines F ");
			char horariohoras = (char) System.in.read();
			teclado.nextLine();
			System.out.println("inserte horas extra trabajadas ");

			int extra = teclado.nextInt();

			System.out.println("inserte MINUTOS extra trabajadas ");
			double extraM = teclado.nextDouble();
			extraM = extraM / 60;

			System.out.println("inserte segundos extra trabajadas ");
			double extraS = teclado.nextDouble();
			extraS = extraS / 3600;
			double extra2 = (double) extra + extraM + extraS;

			teclado.nextLine();
			if ((horario == 'L' || horario == 'M' || horario == 'X' || horario == 'J' || horario == 'V')
					&& horariohoras == 'N') {
				int por = 5;
				extracted(con, extra2, por);

			}

			else if ((horario == 'L' || horario == 'M' || horario == 'X' || horario == 'J' || horario == 'V')
					&& horariohoras == 'T') {
				int por = 15;
				extracted(con, extra2, por);

			}

			else if ((horario == 'S' || horario == 'D') && horariohoras == 'S') {
				int por = 10;
				extracted(con, extra2, por);
			}

			else if ((horario == 'S' || horario == 'D') && horariohoras == 'F') {
				int por = 25;
				extracted(con, extra2, por);

			}

			System.out.println("inserte N para salir o ota letra para continuar");
			a = (char) System.in.read();
			teclado.nextLine();

		}
		teclado.close();
	}

	private static void extracted(double con, double extra2, int por) {
		double valor = con + (con * por / 100);
		DecimalFormat formato = new DecimalFormat("#.000");
		double semanal = (5.75 * 8) + (extra2 * valor);
		System.out.println("dinero gando por horas extras " + formato.format(semanal)+ "euros");

	}
}
