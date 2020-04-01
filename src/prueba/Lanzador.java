package prueba;

public class Lanzador {

	public static void main(String[] args) {
		
		String ejemplo = new String("Pepa");
		//ejemplo.
		
		Animales mianimalito = new Animales();
		Animales mianimalito2 = new Animales();
		
		mianimalito.setNombre("Poki");
		mianimalito.setChip("777");
		
		mianimalito2.setNombre("Coty");
		mianimalito2.setChip("999999");
		
		System.out.println("El primero en pasar es " + mianimalito.getNombre());
		System.out.println("y luego " + mianimalito2.getNombre() + " chip " + mianimalito2.getChip());

	}

}
