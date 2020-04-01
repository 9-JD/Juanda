package programacomposicioncono;

/**
 *
 *
 * @author Juan Daniel Sánchez González.
 * @version 27/marzo/2020. 
 * Esta clase contiene el objeto cono y tambien uno de
 *  sus atributos es otro objeto circulo
 */
public class Cono {
	// atributos del objeto cono
	// el objeto circulo es un objeto de cono
	
	private Circulo base;
	private float altura;
	private String color;

	/**
	 * Este es un contructor que introduce todos los datos al los atributos del
	 * objeto.
	 * 
	 * @param cX     es la cordenadas x del circulo.
	 * @param cY     es la coordenadas y derl circulo.
	 * @param r      es el radio del circulo.
	 * @param h      es la altura del cono.
	 * @param color, es el color del cono.
	 * 
	 */
	public Cono(float cX, float cY, float r, float h, String color) { // constructor con el cual introducimos todos los
																		// datos de los atributos
		this.base = new Circulo(cX, cY, r);
		this.altura = h;
		this.color = color;
	}

	/**
	 * 
	 * @return devuelve los atributos de circulo
	 */
	public Circulo getBase() {
		return base;
	}

	/**
	 * 
	 * @param  base se pasa el parametro de base del circulo para añadirlo al atributo de
	 *           base
	 */
	public void setBase(Circulo base) {
		this.base = base;
	}

	/**
	 * 
	 * @return devuelve la altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * 
	 * @param altura  para introducirlo al atributo altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * 
	 * @return devuelve el color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * 
	 * @param color Sirve para dar un valor al atributo color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * En este metodo se imprime toda la informacion del objeto es decir sus
	 * atributos.
	 * 
	 */
	public void imprimir() {
		// imprimos los atributos del circulo
		base.imprimir();
		// imprimir los atributos del cono
		System.out.println(" h=" + altura + " c=" + color);
	}
}