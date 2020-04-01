package examen2_final;

import javax.swing.JOptionPane;

public class ValidarNombre {

	static String[] apellidosValidos = {"ARTILES", "BLANCO", "RAMOS", "SANTANA", "MOLINA"};
	static String[] nombresValidos = {"CARLOS", "ANA", "CARMEN", "LUIS", "PEDRO"};

	public static boolean tieneLongitudCorrecta(String nombreCompleto) {
		String[] palabras = nombreCompleto.split(" ");
		if (palabras.length == 3)
			return true;
		else
			return false;
	}
	
	public static boolean tieneComaAlFinal(String segundoApellido) {
		char coma = segundoApellido.charAt(segundoApellido.length()-1);
		if (coma == ',')
			return true;
		else
			return false;
	}
	
	public static boolean tieneSoloPrimeraLetraMayuscula(String palabra) {
		if (!Character.isUpperCase(palabra.charAt(0))) {
			return false;}
		for (int i = 1; i < palabra.length(); i++) {
			if (!Character.isLowerCase(palabra.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean existePalabraEnVector(String palabra, String[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].equals(palabra.toUpperCase()))
				return true;
		}
		return false;
	}
	
	public static boolean validarNombre(String nombreCompleto) {
		if (!tieneLongitudCorrecta(nombreCompleto)) {
			return false;
		}
		
		String[] palabras = nombreCompleto.split(" ");
		String primerApellido = palabras[0];
		String segundoApellidoConComa = palabras[1];
		String nombre = palabras[2];
		
		if (!tieneComaAlFinal(segundoApellidoConComa)) {
			return false;}
		
		String segundoApellido = segundoApellidoConComa.substring(0, segundoApellidoConComa.length()-1);
		
		if (!tieneSoloPrimeraLetraMayuscula(primerApellido)
				|| tieneSoloPrimeraLetraMayuscula(segundoApellido)
				|| !tieneSoloPrimeraLetraMayuscula(nombre))
			return false;
		
		if (!existePalabraEnVector(primerApellido, apellidosValidos)
				|| !existePalabraEnVector(segundoApellido, apellidosValidos)
				&& !existePalabraEnVector(nombre, nombresValidos))
			return false;
		
		return true;
	}

	public static void main(String[] args) {		
		do {
			String nombreCompleto = JOptionPane.showInputDialog(null,
                                     "Introduzca un nombre completo con el formato PrimerApellido SegundoApellido, Nombre:");
			if (validarNombre(nombreCompleto) == false) {
				JOptionPane.showMessageDialog(null,
                                       "Nombre completo inválido. \nFormato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
                                        "Nombre completo válido. \nFormato correcto", "OK", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		} while (true);
	}
}
