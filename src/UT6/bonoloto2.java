package UT6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class bonoloto2 {

	// establecemos las variable sgolobales
	private static JFrame frame = new JFrame("Bonoloto2");
	// Jlabel las etiquetas
	private static JLabel seisnumeros, reintegro, Premios, felicitacion, bonoloto, fecha;
	// Text el texto
	private static JTextField texseis, texreintegro, TEXPremios, TEXAciertos;
	// Jbutton los botones
	private static JButton comprobar, salir;
	// los paneles
	private static JPanel pUp, pDown, pCenter, pWest, pEast;
	// JcomBox es una lista desplegable
	private static JComboBox opciones_premios, proximoevento;
	// cuadro de texto
	private static JTextArea condicionesdeuso;
	// variables donde se van a guardar todos los datos de la bonoloto son lista
	// donde no pueden haber numeros repetidos
	private static HashSet<Integer> listaaleatorios = new HashSet();
	private static HashSet<Integer> listausuario = new HashSet();
	private static List<String> listafechas = new ArrayList<>();
	// en este vector se van a guardar los premios de la pociiento 1 hasta el final
	// y el reintegro (posicion 0)
	private static final double premios_dinero[] = { 2.0, 6.5, 1025.16, 159800.50, 200150.25 };
	// este numero va a marcar la pocision en que se encuentra los premios en el
	// vector
	private static final int pos_premios_dinero = 2;
	// reintegro generado
	private static int num_reintegro;
	// reintegro introducido por el usuario
	private static int num_reintegro1;
	// variable que nos sera de ayuda para saber si el usuario ya recibido el premio
	private static int repetir_acion = 0;

	public static void main(String[] args) {

		// tamaño del panel
		frame.setBounds(400, 400, 500, 400);
		// etiquetas del primer panel
		seisnumeros = new JLabel("Combinacion Ganadora");
		reintegro = new JLabel("Reintegro");
		Premios = new JLabel("Premio");
		felicitacion = new JLabel("Felicidades ha tenido aciertos ");
		bonoloto = new JLabel("BONOLOTO ");
		fecha = new JLabel(fecha());
		// estilo para Jlabel
		seisnumeros.setFont(new Font("Arial", Font.BOLD, 13));
		reintegro.setFont(new Font("Arial", Font.BOLD, 13));
		fecha.setFont(new Font("cooper black", Font.ITALIC, 12));
		// alineamos
		felicitacion.setHorizontalAlignment(JLabel.RIGHT);
		Premios.setHorizontalAlignment(JLabel.RIGHT);
		// texto no modificable del panel
		texseis = new JTextField(crear_seisnum(listaaleatorios));
		texreintegro = new JTextField(crear_reintegro());
		TEXAciertos = new JTextField();
		// modificaciones en el tipo de letra y tamaño y color del fondo
		texseis.setFont(new Font("Arial", Font.BOLD, 17));
		texreintegro.setFont(new Font("Arial", Font.BOLD, 17));
		texreintegro.setBackground(Color.white);
		texseis.setBackground(Color.white);
		// alineamos
		seisnumeros.setHorizontalAlignment(JLabel.RIGHT);
		reintegro.setHorizontalAlignment(JLabel.RIGHT);
		texseis.setHorizontalAlignment(JTextField.CENTER);
		texreintegro.setHorizontalAlignment(JTextField.CENTER);
		// que no se pueda modificar su contenido
		texseis.setEditable(false);
		texreintegro.setEditable(false);
		TEXAciertos.setEditable(false);
		// creamos los botones
		comprobar = new JButton("Insertar numero");
		salir = new JButton("Salir");
		// establecemos el estilo a las letras de los botones y tambien a los botonoes
		comprobar.setFont(new Font("cooper black", Font.BOLD, 15));
		comprobar.setForeground(Color.gray);
		salir.setBackground(Color.LIGHT_GRAY);
		salir.setForeground(Color.red);
		salir.setFont(new Font("cooper black", Font.BOLD, 15));
		// creamos una lista despegable donde el usuario vera los aciertos y sus premios
		opciones_premios = new JComboBox();
		opciones_premios.addItem("Premios");
		opciones_premios.addItem("6 aciertos > " + String.valueOf(premios_dinero[4]) + "$");
		opciones_premios.addItem("5 aciertos > " + String.valueOf(premios_dinero[3]) + "$");
		opciones_premios.addItem("4 aciertos > " + String.valueOf(premios_dinero[2]) + "$");
		opciones_premios.addItem("3 aciertos > " + String.valueOf(premios_dinero[1]) + "$");
		opciones_premios.addItem("Reintegro  > " + String.valueOf(premios_dinero[0]) + "$");

		// cargamos primero la lista para luego que se muestren las fechas
		proximas_fechas();
		proximoevento = new JComboBox();
		proximoevento.addItem("Proximas fechas");
		proximoevento.addItem(listafechas.get(0));
		proximoevento.addItem(listafechas.get(1));
		proximoevento.addItem(listafechas.get(2));
		proximoevento.addItem(listafechas.get(3));
		proximoevento.addItem(listafechas.get(4));
// cambiamos el estilo de las letras 
		opciones_premios.setFont(new Font("Arial", Font.BOLD, 13));
		proximoevento.setFont(new Font("Arial", Font.BOLD, 13));

		// creamos un cuadro de texto no modificanle para dar informarcion al usuario y
		// le damos estilo a las letras
		Font font = new Font("Verdana", Font.ITALIC, 9);
		condicionesdeuso = new JTextArea(
				"Solo habra premio si se tiene 3(combinacion ganadora) o mas aciertos y se sumara el reintregro");
		condicionesdeuso.setFont(font);
//ampliamos sus bordes por todos lados 
		condicionesdeuso.setBorder(new EmptyBorder(10, 10, 10, 10));
		condicionesdeuso.setEditable(false);

		// creamos cmo se va a dividir el jframe que sera en cinco partes
		frame.setLayout(new BorderLayout());

		// partes del panel
		pUp = new JPanel(new FlowLayout());
		pDown = new JPanel(new FlowLayout());
		pCenter = new JPanel(new GridLayout(10, 1));
		pWest = new JPanel();
		// BoxLayout.Y_AXIS que los componentes se ordene en forma vertical
		pWest.setLayout(new BoxLayout(pWest, BoxLayout.Y_AXIS));
		pEast = new JPanel(new FlowLayout());

//añadimos los elementos a los paneles
		pUp.add(bonoloto);
		pUp.add(fecha);
		pCenter.add(seisnumeros);
		pCenter.add(texseis);
		pCenter.add(reintegro);
		pCenter.add(texreintegro);
		pCenter.add(comprobar);

		pWest.add(opciones_premios);
		// establecemos un area entre los dos coponentes para que este separados
		pWest.add(Box.createRigidArea(new Dimension(0, 110)));
		pWest.add(proximoevento);
		pWest.add(Box.createRigidArea(new Dimension(0, 180)));
		pDown.add(condicionesdeuso);

		// establecemos el diseño a los paneles
		pWest.setBorder(new LineBorder(Color.black));
// cremas un objeto para añadir un aimagen y introducirla a unos de los paneles

		// añadimos todos los paneles en su pocision en frame
		frame.add(pUp, BorderLayout.NORTH);
		frame.add(pCenter, BorderLayout.CENTER);
		frame.add(pDown, BorderLayout.SOUTH);
		frame.add(pWest, BorderLayout.WEST);
		frame.add(pEast, BorderLayout.EAST);
		// que sea visible
		frame.setVisible(true);
		// que pueda moverse la ventana
		frame.setLocationRelativeTo(null);
//que la el frame no se pueda cambiar de tamaño
		frame.setResizable(false);
		// eventos del boton comprobar

		comprobar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meterlosnumeros(e);

			}
		});
//eventos del boton salir	
		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				meterlosnumeros(e);

			}
		});

	}

	// con esto se le informa al usuario cuales son las fechas de celabracion de la
	// bolonoto, que es todo los dias menos los domingos
	private static void proximas_fechas() {
		// sacamos la fecha
		LocalDate hoy = LocalDate.now();
		LocalDate valor;
		// lo establecemos para poner como dia mes año
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// iniciamos la lista
		listafechas.clear();
		int cont = 1;
		// cargamos cinco fechas proximas en la lista
		while (listafechas.size() != 5) {
			// vamos avanzando fechas
			valor = hoy.plusDays(cont);
			// la convertimos en string
			String dia = String.valueOf(valor.getDayOfWeek());
			// si no es domingo se cargara en la lista
			if (dia != "SUNDAY") {

				listafechas.add(String.valueOf(hoy.plusDays(cont).format(formatter)));

			}
			++cont;

		}

	}

// le pedimos al sistema la fecha y la ponemos en formato /dia/mes/año y la pasamos a string pero si es domingo nos sumara un dia debido a que la bonoloto no se realiza los domingos
	private static String fecha() {
		LocalDate hoy = LocalDate.now();
		String dia = String.valueOf(hoy.getDayOfWeek());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if (dia == "SUNDAY") {

			return String.valueOf(hoy.plusDays(1).format(formatter));

		}

		return String.valueOf(hoy.format(formatter));
	}

	// con estas acciones establecemos que pasa al ejecutar los botones
	private static void meterlosnumeros(ActionEvent e) {
		Object opcion = e.getSource();
		// se ejecuta todo el programa
		if (opcion == comprobar) {

			proceso_de_introducion();

		}
		// salimos del programa
		if (opcion == salir) {
			frame.dispose();

		}

	}

// con este procedimiento se introduce los datos que nos facilita el usuario utilizamos una lista y hasta que no contenga 6 numeros no dejara de introducir numero , por otro lado si el usuario tiene premio el bonton comprbar le indicara el numero que ha insetado y sus aciertos
	private static void proceso_de_introducion() {
		while (listausuario.size() != 6) {
			frame.setVisible(false);
			// explicado mas abajo el mmetodo
			int valor = entrada_de_numeros();
			// si no es un numero estre el 1 o 49 nos devolvera el cero
			if (valor > 0) {
				// si se repite el numero lo indicara y no lo va introducir porque es una lista
				// hasset
				if (listausuario.add(valor) == false) {
					JOptionPane.showMessageDialog(null, "No se pueden repetir numeros");

				}

			}
			// le indicamos a el usuario el numero insertado y su reintegro
			if (listausuario.size() == 6) {
				num_reintegro1 = usuario_reintegro();
				JOptionPane.showMessageDialog(null, "Numero insertado (" + string_seisnumeros(listausuario)
						+ ") Reintrego (" + String.valueOf(num_reintegro1) + ")");

			}
		}

		int aciertos = aciertos();
//esto saldra a presionar el boton comprobar si el usuario a tenido premio le dara la informacion del numero insertado y los aciertos 
		JOptionPane.showMessageDialog(null, "Numero insertado (" + string_seisnumeros(listausuario) + ") Aciertos "
				+ aciertos + "  Reintrego (" + String.valueOf(num_reintegro1) + ") Acertado " + reintegro_acertado());
		frame.setVisible(true);

		// esto lo establecemos ya que si el usuario ha tenido premio si vuelve a
		// ejecutar el voton no se añadan las celdas de los elementos del premio.
		if (repetir_acion == 0) {
			premios_final(aciertos);
		}
		if (aciertos > 2) {
			repetir_acion = 1;
		}
	}

	// con este metodo determinamos si el reintegro introducido el usuario ha sido
	// acertado
	private static String reintegro_acertado() {
		if (num_reintegro == num_reintegro1) {
			return "si";

		}
		return "no";
	}

	// con este determinamos si se debe premiar o indicarle al usuario que puede
	// introducir otro numero
	private static void premios_final(int aciertos) {

		// si tiene menos de 3 aciertos se le indicara al usuario que no tiene premio y
		// si quiere insertar otro numero
		if (aciertos < 3) {
			// se borrara lo introducido en la lista
			listausuario.clear();
			// se le indica si quiere introducir otro numero en caso afirmativo se realizara
			// el proceso de nuevo si->0 , no->1, cancelar->0
			int input = JOptionPane.showConfirmDialog(null, "¿Quieres introducir otro numero?");

			if (input == 0) {

				proceso_de_introducion();

				// si indica que no se volvera al panel principal y se añadira el boton de salir
				// , aunque podra volver a introducir un numero si cambia de opinio como se le
				// indique en el panel
			} else {
				frame.setVisible(false);
				JOptionPane.showMessageDialog(null,
						"Suerte para la porxima ;), aun puedes insertar un nuevo numero en el panel principal");
				pCenter.add(salir);
				frame.setVisible(true);
			}

		} else {
			// si tiene tres a mas aciertos se le añade al panel princial el premio
			frame.setVisible(false);
			// se añade las etiquetas
			pCenter.add(felicitacion);

			// la cuantia
			TEXAciertos = new JTextField("Combinacion Ganadora (" + String.valueOf(aciertos)
					+ ") |Reintegro adivinado (" + reintegro_acertado() + ")");
			TEXAciertos.setFont(new Font("Arial", Font.BOLD, 12));
			pCenter.add(TEXAciertos);
			pCenter.add(Premios);
			TEXPremios = new JTextField(cuantia(aciertos));
			TEXPremios.setFont(new Font("Arial", Font.BOLD, 17));
			pCenter.add(TEXPremios);
			// el boton para salir
			pCenter.add(salir);

			// añadimo este toltip como informacion al usuario.
			comprobar.setToolTipText("Pulse para ver la informacion de su numero insertado");

// hacemos visible el panel 
			frame.setVisible(true);

		}

	}

//con esto sacaremos el premio ya que todos los premios estan en  un vector de menor a mayor
	private static String cuantia(int aciertos) {
		// hay que restarle dos por que en la pocicion cero esta el reintegro y el
		// vector simpre empieza en cero
		aciertos = aciertos - pos_premios_dinero;
		String premio = "";
		// si coincide el reintegro se suma al premio si no solo se obtiene el premio
		String coincide = reintegro_acertado();
		if (coincide == "si") {

			premio = premio.valueOf(premios_dinero[aciertos] + premios_dinero[0]);

		} else {
			premio = premio.valueOf(premios_dinero[aciertos]);

		}

		return premio;
	}

// con este metodo se mira los aciertos que tiene el usuario ya que se recore una de las lista y se comprueba si se repite cada uno de sus elementos en la otra lista
	private static int aciertos() {
		int cont = 0;
		Iterator<Integer> itr = listaaleatorios.iterator();
		while (itr.hasNext()) {
			// vamos guardando los elementos
			Integer o = itr.next();
			// acumulamos los elementos de la lista en una string
			if (Collections.frequency(listausuario, o) == 1) {

				++cont;

			}

		}

		return cont;

	}

// este metodo es para controlar la introducion de el reintegro donde solo podra ser numeros del 0 al nueve 
	private static int usuario_reintegro() {
		int valor = -1;

		while (valor < 0 || valor > 9) {
			try {

				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el reintegro"));

				if (valor < 0 || valor > 9) {
					JOptionPane.showMessageDialog(null, "Solo numeros del 0 al 9");
				}

			}

			catch (NumberFormatException e1) {

				JOptionPane.showMessageDialog(null, "solo numeros enteros");

			}
		}
		return valor;
	}

	// insertamos los datos de usuario con este metodo se va acontrolar que sean
	// numeros del 1 al 49 inculidos que no se repitan .

	private static int entrada_de_numeros() {
		int cont = listausuario.size();
		int valor = 0;

		try {
			// se le mostrara al usuario que numero a introducido mientras introdue los
			// posteriores
			++cont;
			if (listausuario.size() == 0) {
				valor = Integer.parseInt(JOptionPane.showInputDialog(null, "inserte el nº" + cont));

			} else {
				valor = Integer.parseInt(JOptionPane.showInputDialog(null,
						"inserte el nº" + cont + "   nº intr(" + string_seisnumeros(listausuario) + ")"));

			}

		} catch (NumberFormatException e1) {
			// cuando no introduzca numeros

			JOptionPane.showMessageDialog(null, "Solo numeros enteros");
			--cont;
			return 0;

		}

		if (valor < 1 || valor > 49) {
			JOptionPane.showMessageDialog(null, "Solo numeros enteros del 1 al 49 ");
			--cont;
			return 0;
		}

		return valor;
	}

	// caluclamos el reintegro que es del 0 al 9
	private static String crear_reintegro() {
		num_reintegro = (int) (Math.random() * (9 + 1) + 0);
		return String.valueOf(num_reintegro);

	}

//con esto creamos los seis primeros numeros que no se pueden repetir y es del 1 al 49, hemos ultilizado lista hashet para que no se repitan los numeros
	private static String crear_seisnum(HashSet<Integer> lista) {
		// con esta clase d elista hacemos que no se repitan los numeros generados del
		// random

		String seisnumeros = "";

		while (lista.size() != 6) {

			lista.add((int) (Math.random() * 49 + 1));

		}
		// creamos un iterador para recorrer la lista
		seisnumeros = string_seisnumeros(lista);

		return seisnumeros;

	}

//guardamos los datos en una lista y los separamos con "-" para diferenciar los numeros 
	private static String string_seisnumeros(HashSet<Integer> lista) {
		String seisnumeros = "";
		Iterator<Integer> itr = lista.iterator();
		while (itr.hasNext()) {
			// vamos guardando los elementos
			Integer o = itr.next();
			// acumulamos los elementos de la lista en una string
			seisnumeros += "-" + seisnumeros.valueOf(o);

		}
		seisnumeros = seisnumeros.substring(1, seisnumeros.length());
		return seisnumeros;
	}

}
