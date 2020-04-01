package UT6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Ejemplo3GUI {

	//Trabaja con Paneles
	private static JLabel labelUp, labelDown, labelCenter, labelWest, labelEast;
	private static JPanel pUp, pDown, pCenter, pWest, pEast ;
	

	public static void main(String[] args) {

		//Se define el Frame
		JFrame frame = new JFrame("Controlando eventos");

		//Layout con BorderLayout
		frame.setLayout(new BorderLayout());
		
		//Definimos paneles, que pueden ser del tipo que quieras, otro BorderLayout, Grid, FlowLayout...
		//GridLayout en matriz, modificaremos el Center... y simulamos una matriz de 2x2
		pUp=new JPanel(new FlowLayout());
		pDown=new JPanel(new FlowLayout());
		pCenter=new JPanel(new GridLayout(2,2));
		pWest=new JPanel(new FlowLayout());
		pEast=new JPanel(new FlowLayout());
				
		
		//Añadimos botones en cada celda del Grid y se colocan consecutivamente
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		pCenter.add(b1);
		pCenter.add(b2);
		pCenter.add(b3);
		pCenter.add(b4);
		
		//Añade los JPanel que quieras al Contenedor principal y visualiza
				frame.add(pUp, BorderLayout.NORTH);
				frame.add(pDown, BorderLayout.SOUTH);
				frame.add(pCenter, BorderLayout.CENTER); //Se añade panel Grid completo al rectángulo Center
				frame.add(pWest, BorderLayout.WEST);
				frame.add(pEast, BorderLayout.EAST);
				
		InicializaLabel();
		
		//Añade las etiquetas a los paneles
		pUp.add(labelUp);
		pDown.add(labelDown);
		//pCenter.add(labelCenter);
		pWest.add(labelWest);
		pEast.add(labelEast);
		
		//Aplica colores, bordes u otras propiedades a cada panel
		pUp.setBackground(Color.YELLOW);
		pDown.setBackground(Color.CYAN);
		pCenter.setBorder(new LineBorder(Color.ORANGE));
		pWest.setForeground(Color.RED);
		pEast.setToolTipText("Soy un ToolTip");
					
		frame.pack();
		frame.setVisible(true);
	}
	
	private static void InicializaLabel() {
		labelUp=new JLabel("Up");
		labelDown=new JLabel("Down");
		labelCenter=new JLabel("Center");
		labelWest=new JLabel("West");
		labelEast=new JLabel("East");
		
	}


}
