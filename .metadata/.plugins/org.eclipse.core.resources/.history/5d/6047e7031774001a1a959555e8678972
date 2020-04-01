


public class AreaPrismaclass {

	// declaracion de los atributos del objeto
	int baseTriangulo;
	int alturaPrisma;

	/**
	 * Creacion de un contructor
	 * 
	 * @param no se le pasa parametros si no se le eestbalece un valor a los
	 *           atributos diferentes cada vez que se inicializa
	 *
	 */
	AreaPrismaclass() {

		this.baseTriangulo = aleatorio();
		this.alturaPrisma = aleatorio();

	}

	/**
	 * 
	 * @return en este metodo nos da un numero aleatorio del 1 al 10 y lo devuelve
	 */
	private int aleatorio() {

		return (int) (Math.random() * 10 + 1);
	}

	/**
	 * 
	 * @return este metodo sirve para dar mostrar el valor de la base del triangulo
	 *         (no se utiliza aun en nuestro programa)
	 */
	public int getBaseTriangulo() {
		return baseTriangulo;
	}

	/**
	 * 
	 * @return este metodo sirve para dar el valor de la base del triangulo (no se
	 *         utiliza aun en nuestro programa ya que lo realizamos en el
	 *         constructor)
	 */
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	/**
	 * 
	 * @return este metodo sirve para dar mostrar el valor de la altura del prisma
	 *         (no se utiliza aun en nuestro programa)
	 */
	public int getAlturaPrisma() {
		return alturaPrisma;
	}

	/**
	 * 
	 * @return este metodo sirve para dar mostrar el valor de la altura del prima
	 *         (no se utiliza aun en nuestro programa)
	 */
	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}

	/**
	 * 
	 * @return en este metodo se calcula el area base y lo devuelve
	 */
	public float areaBase() {
		return (alturaPrisma * baseTriangulo) / 2;
	}

	/**
	 * 
	 * @return en este metodo se calcula el preimetro y lo devuelve
	 */
	public float perimetro() {
		return baseTriangulo * 3;
	}

	/**
	 * 
	 * @return en este metodo se calcula el area Lateral y lo devuelve
	 */
	public float areaLateral() {
		return alturaPrisma * perimetro();
	}

	/**
	 * 
	 * @return en este metodo se calcula el area total y lo devuelve
	 */
	public float areaTotal() {

		areaBase();

		return 2 * (baseTriangulo) + areaLateral();

	}

}
