package apuntes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EjemploFechas {

	public static void main(String[] args) {
		LocalTime hora=LocalTime.now();
		LocalDate hoy=LocalDate.now();
		LocalTime limite ;
		System.out.println("Hoy es "+hora);
		
		System.out.println("hora"+hora.getHour());
		
		hoy=hoy.plusDays(1);
		hoy.getDayOfWeek();
		System.out.println(hoy.getDayOfWeek());
		
		proximas_fechas();
		
		System.out.println("del mes..."+hoy.getMonth());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("y formateado es..."+hoy.format(formatter));
		
		String fecStr="20/09/2020";
		LocalDate fecha= LocalDate.parse(fecStr, formatter);
		System.out.println("La fecha para acabar el curso es "+fecha.format(formatter));
		
		int meses=(Period.between(hoy, fecha)).getMonths();

		System.out.println("Y quedan "+meses+" meses");
		
		
		
		

	}

	private static void proximas_fechas() {
		LocalDate hoy=LocalDate.now();
		LocalDate valor;
		List<String> lista = new ArrayList<>();	
  int   cont =1;		
		while (lista.size()!=5) {
		valor=hoy.plusDays(cont);
		
	String dia =String.valueOf(valor.getDayOfWeek());	
	if(dia !="SUNDAY") {
		
	lista.add(String.valueOf(hoy.plusDays(cont)));
			
	}
	++cont;		
			
			
			
			
			
			
		}
		
		
		
		
	}

}
