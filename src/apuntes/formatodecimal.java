package apuntes;

import java.text.DecimalFormat;

public class formatodecimal {

	public static void main(String[] args) {
		
		//redondea hacia arriba cuando es mayor o igual a cionco el decimal
		DecimalFormat formato = new DecimalFormat("#.00");
		double semanal =5.5;
		System.out.println("dinero gando por horas extras " + formato.format(semanal)+ "euros");

	}

}
