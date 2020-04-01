package examen2_final;

import java.util.List;
import java.util.Scanner;

public class cuentas {
/// CREAMOS LAS VARIABLES
	persona titular;

	String numero_cuenta;

	double saldo;
	double limite_rojo;

//inicializamos las variables
	cuentas() {

		this.saldo = 0;
		this.numero_cuenta = cuenta();

	}

	public persona getTitular() {
		return titular;
	}

	public void setTitular(persona titular) {
		this.titular = titular;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite_rojo() {
		return limite_rojo;
	}

	public void setLimite_rojo(double limite_rojo) {
		this.limite_rojo = limite_rojo;
	}

//establecemos un alatorio para que los numeros no se repitas
	public String cuenta() {
		String numero_cuenta = "ES802038000118";

		int numAleatorio = (int) (Math.random() * 1000000000);
		String aleatorio = Integer.toString(numAleatorio);
		String numero = "";
		if (aleatorio.length() < 10) {

			int relleno = 10 - aleatorio.length();

			for (int i = 0; i < relleno; i++) {

				String cero = "0";

				numero += cero;

			}

			numero_cuenta = numero_cuenta.concat(numero).concat(aleatorio);
			numero = "";
			int pos1 = 0;
			int pos2 = 3;

			for (int i = 0; i < 6; i++) {

				String t1 = numero_cuenta.substring(pos1, pos2 + 1);
				pos1 = pos1 + 4;
				pos2 = pos2 + 4;

				numero += t1 + " ";

			}

			return numero;

		} else {
			numero_cuenta = numero_cuenta.concat(aleatorio);

			numero = "";
			int pos1 = 0;
			int pos2 = 3;

			for (int i = 0; i < 6; i++) {

				String t1 = numero_cuenta.substring(pos1, pos2 + 1);
				pos1 = pos1 + 4;
				pos2 = pos2 + 4;

				numero = t1 + " ";

			}

			return numero_cuenta;

		}
	}












}
