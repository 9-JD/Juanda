package BUCLE;

public class ejercisio1 {

	public static void main(String[] args) {

		// realizamos el bucle con for
		System.out.println("con for ");

		for (int i = 1; i < 300; i++) {

			multiplos_no5(i);

		}
		// salto de linea
		System.out.println(" ");
// realizamos el bucle con while y cereamos la variable i ya que como en el anterior for esta dentro no es detectada por el while 
		System.out.println("con   while");

		int i = 0;
		while (i < 300) {

			i++;
			multiplos_no5(i);
		}

		// salto de linea
		System.out.println(" ");
//creamos el do while y inicializamos la i a cero ya que vadria 300 debido a l anterior bucle
		System.out.println("con do y  while");
		i = 0;
		do {

			i++;
			multiplos_no5(i);

		} while (i < 300);

	}

//hemos establecido este metodo ya que lo que se repite es que no aparezcan los multiplos de 5.
	private static void multiplos_no5(int i) {
		if (i % 5 != 0)

			System.out.println(i);
	}

}
