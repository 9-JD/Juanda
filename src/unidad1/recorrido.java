package unidad1;

import java.util.Scanner;

public class recorrido {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// variables de la hora de entrada
		System.out.println("introduce la hora de entrada ");
		int horaE = teclado.nextInt();
		System.out.println("introduce los  minutos de entrada ");
		int minutosE = teclado.nextInt();
		System.out.println("introduce los segundos de entrada");
		int segundosE = teclado.nextInt();

		// variables de la hora de salida
		System.out.println("introduce la hora de salida ");
		int horaS = teclado.nextInt();
		System.out.println("introduce los minutos de salida ");
		int minutosS = teclado.nextInt();
		System.out.println("introduce los segundos de salida  ");
		int segundosS = teclado.nextInt();

		// constantes
		double distancia = 3.2;
		int velocidadpermitida = 80;

		// pasar la hora de entrada todo a horas
		double resulhoraE = (horaE * 3600) + (minutosE * 60) + (segundosE);

		resulhoraE = resulhoraE / 3600;

		// pasar la hora de salida todo a horas
		double resulhoraS = (horaS * 3600) + (minutosS * 60) + (segundosS);

		resulhoraS = resulhoraS / 3600;

		// hora final
		double resulf = resulhoraS - resulhoraE;

		if (resulhoraS > resulhoraE && resulhoraS >0 && resulhoraE>0  ) {

			double VELOCIDAD = distancia / resulf;

			if (VELOCIDAD > velocidadpermitida) {

				System.out.println("Ha sobrepasado el limite de velocidad usted iva a  " + VELOCIDAD
						+ " km/h,  la velocidad permitada es " + velocidadpermitida + " km/h");

			} else
				System.out.println("No ha sobrepasado el limite de velocidad "+VELOCIDAD);

		} else {
			System.out.println("Datos incorectos la hora de entrada es inferior a la hora de salida o igual o los datos introducidos son de tipo negativo ");
		}
		
	
	
		
		teclado.close();
	}
	
} 

