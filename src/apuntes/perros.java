package apuntes;

public class perros {
private static int numperros=0;


private int chip;


private char raza; 


private String nombre;

perros(){
	
chip=0;

raza=' ';
nombre=" ";
nuevoPerros();
	
	
	
	
	
	
}



public int getChip() {
	return chip;
}


public void setChip(int chip) {
	this.chip = chip;
}


public char getRaza() {
	return raza;
}


public void setRaza(char raza) {
	this.raza = raza;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void nuevoPerros() {
	
	numperros++;
	
	
}
public void muestraPerros() {
	
	System.out.println("numero de perros"+ numperros);
	
	
	
	
	
	
}

}
