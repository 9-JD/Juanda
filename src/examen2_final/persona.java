package examen2_final;

import java.util.List;
import java.util.Scanner;

public class persona {
	//inicializamos las variables
	String nif;
	String nombre;
	String telefono;

	persona() {

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "nombre " + this.nombre + "dni " + this.nif + "numero de telefono " + this.telefono;
		// return this.nombre
	}

}
