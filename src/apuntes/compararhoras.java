package apuntes;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class compararhoras {
	private static List<String> listafechas = new ArrayList<>();
	public static void main(String[] args) {
		
	
		
		LocalDate hoy=LocalDate.now();
		LocalDate valor;
		
		
	Date fecha_hoy= new Date();
	
	
		
		
		
	System.out.println(fecha_hoy);
	
	DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	System.out.println("Hora y fecha: "+hourdateFormat.format(fecha_hoy));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
