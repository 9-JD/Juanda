package examen2_final;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidarNombreTest {

	@Test
	public void testlongitudcorrecta() {
		String nombreCompleto="juan, sanchez gonzalez";
		boolean expResult =true;
		
		boolean result =ValidarNombre.tieneLongitudCorrecta(nombreCompleto);
		
		assertEquals(result, expResult);
		
	}

	@Test
	public void testcomaalfinal() {
		String segundoApellido="gonzalez,";
		boolean expResult =true;
		boolean result =ValidarNombre.tieneComaAlFinal(segundoApellido);
		
		assertEquals(result, expResult);
		
	}
	
	
	@Test
	public void testTieneSoloPrimeraLetraMayuscula() {
		String palabra="GonzAlez";
		boolean expResult =true;
		boolean result =ValidarNombre.tieneSoloPrimeraLetraMayuscula(palabra);
		
		assertEquals(result, expResult);
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
