package apuntes;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
perros vp;
Scanner teclado;

for (int i=1; i<=5; i++) {
	
System.out.println("introduce un numero de chip");
teclado= new Scanner (System.in);
vp=new perros();
vp.setChip(teclado.nextInt());
System.out.println("has grabado a ek perri");
vp.muestraPerros();
	
	
}



















	}

}
