import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EjemploFechas {

	public static void main(String[] args) {

		LocalDate hoy=LocalDate.now();
		System.out.println("Hoy es "+hoy);
		
		System.out.println("Y mañana es "+hoy.plusDays(1));
		
		System.out.println("del mes..."+hoy.getMonth());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("y formateado es..."+hoy.format(formatter));
		
		String fecStr="24/13/2021";
		LocalDate fecha= LocalDate.parse(fecStr, formatter);
		System.out.println("La fecha para acabar el curso es "+fecha.format(formatter));
		
		int año=(Period.between(hoy, fecha)).getYears();
		int meses=(Period.between(hoy, fecha)).getMonths();
		int dias=(Period.between(hoy, fecha)).getDays();
		System.out.println("Y quedan "+año+" años" +meses+ "dias "+dias);
		
		
		
		

	}

}
