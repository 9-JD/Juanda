package UT6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class bonoloto {

	// declaramos todos los elementos que necesitamos para establecer el panel
	private static JFrame frame = new JFrame("Bonoloto");
	private static JLabel labelseis, complementario, reintegro;
	private static JTextField textseis, textcomplementario, textreintegro;
	private static JButton generar, borrar;

	public static void main(String[] args) {

		configuracion_panel();

		// las aciones de los botones
		generar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				acciones(e);

			}

		});

		borrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				acciones(e);

			}

		});

	}

	private static void configuracion_panel() {
		// tamaño de nuestro panel
		frame.setBounds(200, 90, 300, 200);
		// creamos las etiquetas
		labelseis = new JLabel("Combinacion Ganadora");
		complementario = new JLabel("Complementario");
		reintegro = new JLabel("Reintregro");
		// creamos las cajas de texto y le establecemos un estilo
		textseis = new JTextField(9);
		textseis.setBorder(new LineBorder(Color.black));
		textseis.setBackground(Color.white);
		textcomplementario = new JTextField(2);
		textcomplementario.setBorder(new LineBorder(Color.black));
		textcomplementario.setBackground(Color.white);
		textreintegro = new JTextField(1);
		textreintegro.setBorder(new LineBorder(Color.black));
		textreintegro.setBackground(Color.white);
		// hacemos que no se puedan editar

		textseis.setEditable(false);
		textcomplementario.setEditable(false);
		textreintegro.setEditable(false);

		// creamos los botones le establecemos un estilo

		generar = new JButton("Generar");
		borrar = new JButton("Salir");
		generar.setBackground(Color.GREEN);
		borrar.setBackground(Color.GRAY);
		// Lo cargamos todo en el panel jframe
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(labelseis);
		frame.getContentPane().add(textseis);
		frame.getContentPane().add(complementario);
		frame.getContentPane().add(textcomplementario);
		frame.getContentPane().add(reintegro);
		frame.getContentPane().add(textreintegro);
		frame.getContentPane().add(generar);
		frame.getContentPane().add(borrar);
		// que sea visible
		frame.setVisible(true);
		// que pueda moverse la ventana
		frame.setLocationRelativeTo(null);
		// que la el frame no se pueda cambiar de tamaño
		frame.setResizable(false);
	}

	public static void acciones(ActionEvent e) {

		Object opcion = e.getSource();
//cuando se pulse este boton se va a generar la bonoloto
		if (opcion == generar) {

			textseis.setText(crear_seisnum());
			textcomplementario.setText(crear_comple());
			textreintegro.setText(crear_reintegro());

		}
		// se cerrarar el programa
		if (opcion == borrar) {
			frame.dispose();

		}

	}

//creamos el randon y los devolvemos en string
	private static String crear_reintegro() {
		int num = (int) (Math.random() * (9 + 1) + 0);

		return String.valueOf(num);

	}

//creamos el randon y los devolvemos en string
	private static String crear_comple() {
		int num = (int) (Math.random() * 49 + 1);

		return String.valueOf(num);
	}

	private static String crear_seisnum() {
		// con esta clase d elista hacemos que no se repitan los numeros generados del
		// random
		HashSet<Integer> listaaleatorios = new HashSet();
		String seisnumeros = "";
		int cont = 0;
		while (listaaleatorios.size() != 6) {

			listaaleatorios.add((int) (Math.random() * 49 + 1));

		}
		// creamos un iterador para recorrer la lista
		Iterator<Integer> itr = listaaleatorios.iterator();
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
