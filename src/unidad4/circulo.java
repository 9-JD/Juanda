package unidad4;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class circulo {

	public static void main(String[] args) {
		//declaramos el escaner
		Scanner tec =new Scanner (System.in);//para redondear
		DecimalFormat formato = new DecimalFormat("#.00");
		
		double radio=-1;
		System.out.println("calculo de area de un circulo");
		
		
		while (radio<=0) {
		
		System.out.println("introduzca el radio del circulo");
		///declaramos las variables
		 radio =tec.nextDouble();
		tec.nextLine();}
		
		//funcion en java pra pi
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es "+formato.format(area));
		tec.close();
	}

}
