package examen2eva;

import java.text.DecimalFormat;
import java.util.Scanner;

public class monedapoolanzador {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
// creamos la variable que nos servira de union con el objeto moneda
		moneda cambio = new moneda();
		DecimalFormat formato = new DecimalFormat("0.00");
		System.out.println("--------------------Bienvenido al programa de conversion de moneda----------------");
//realizamos un control de errores estableciendo que solo se establezcan numeros y que sean mayores o iguales a 0.01
		System.out.println("-->Inserte la cantidad que quiere cambiar a otra moneda ");
		boolean verificar = false;

		while (verificar == false) {

			verificar = cambio.control(tc);

			if (verificar) {

				System.out.println("la cantidad elegida es " + cambio.getCantidad());

				System.out.println(
						"Si quiere cambiar el valor de dolares a euros escriba cambioeuros y si es al contrario cambiodolares, si es otro tipo de cambio de moneda escriba otro");

				int a = 0;

				while (a == 0) {

					String opcion = tc.nextLine();

					if (opcion.equalsIgnoreCase("cambioeuros")) {
//realizamos la conversion de dolares a euros
						a++;
						double conversion = cambio.EurosDolares(cambio.getCantidad());
						System.out.println("el valor es " +formato.format(conversion));

					} else if (opcion.equalsIgnoreCase("cambiodolares")) {
//realizamos la conversion de euros a dolares
						a++;
						double conversion = cambio.DolaresEuros(cambio.getCantidad());
						System.out.println("el valor es "  +formato.format(conversion));

					}

					

				}

			}

		}
		
		
		System.out.println("->programa finalizado.....");	
		
	}

}


