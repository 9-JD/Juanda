package examen2eva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class moneda {
	
//creamos la variable del valor 	
	
double valor=0;
double cantidad;
// le establecemos un valor por defecto
public moneda() {

	this.valor =1.09;
}

// establecemos un constructor para modificar el valor, con esto si establecemos una variable en el lanzador por ejemplo moneda cantidad=new moneda (2.34); cambamos valor que esta definido en el otro constructor.
public moneda(double valor) {
	
	this.valor=valor;
	
	
	
}



// con este metodo verificamos que los datos introducidos son los correctos y tambien si la cantiada es mayor a cero

public boolean control(Scanner tc) {
	int a=0;
	while (a<1) {
	try {
		
	double cantidad=tc.nextDouble();
		
	if (cantidad>0.00) {
		++a;
		this.cantidad=cantidad;
		return true;
		
	}	
		
	return false;	
		
	}catch(InputMismatchException e) {}
	
	}
	return false ;
	
	
	
	
}



//metodo para pasar de euros a dolares 
public double EurosDolares (double cantidad ) {
	
	double valor=this.valor;
	cantidad=cantidad*valor;
	return cantidad;
	
}
//metodo para pasar dolares aeuros 
public double DolaresEuros (double cantidad ) {
	
	double valor=this.valor;
	cantidad=cantidad/valor;
	return cantidad;
	
}

public double getCantidad() {
	return cantidad;
}

public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}





	

}
