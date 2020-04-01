package UT6;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class CLASEGUI {

	public static void main(String[] args) {
	JFrame frame = new JFrame ("ventanita");
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	JLabel label = new JLabel ("hola mundo Dam");
 frame.getContentPane().add(label);
 frame.pack();
 frame.setLocationRelativeTo(null);
 frame.setBounds(200, 100, 500, 200);
 frame.setResizable(false);
 frame.setVisible(true);
	
	
	
	}

}
