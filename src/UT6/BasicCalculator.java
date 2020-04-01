package UT6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasicCalculator extends JFrame {

	JTextField textFieldVal1, textFieldVal2, textFieldResult;
	JLabel label1, label2, label3;
	JButton bPlus, bMinus, bMult, bDiv;
	
	public static void main(String[] args) {

		BasicCalculator c = new BasicCalculator();
		c.pack();
		c.setVisible(true);
	c.setLocationRelativeTo(null);
	c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	
	public BasicCalculator() {
		//Defining components, Label, TextField and Buttons, and the panels or frames
		//Grafic elements and their properties

		label1 = new JLabel("Value 1");
		label2 = new JLabel("Value 2");
		label3 = new JLabel("Result");
		
		textFieldVal1 = new JTextField(4);	//4 characters 
		textFieldVal2 = new JTextField(4);
		textFieldResult = new JTextField(4);
		textFieldResult.setEditable(false); //The user isn't be able to change this result
		
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMult = new JButton("*");
		bDiv = new JButton("/");
	
		Container screen = getContentPane();
		screen.setPreferredSize(new Dimension(200, 150)); //The size of my window, try to put resizable  = false
		screen.setLayout(new FlowLayout());	//With FlowLayout
		
		screen.add(label1);
		screen.add(textFieldVal1);
		screen.add(label2);
		screen.add(textFieldVal2);
		screen.add(label3);
		screen.add(bPlus);
		screen.add(bMinus);
		screen.add(bMult);
		screen.add(bDiv);
		screen.add(label3);
		screen.add(textFieldResult);
		
		bPlus.addActionListener(new event());
		bMinus.addActionListener(new event());
		bMult.addActionListener(new event());
		bDiv.addActionListener(new event());
	}

	private class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int val1, val2, result = 0;
			val1 = Integer.parseInt(textFieldVal1.getText());
			val2 = Integer.parseInt(textFieldVal2.getText());
			if (e.getActionCommand().equals("+")) {
				result = val1 + val2;
			}
			if (e.getActionCommand().equals("-")) {
				result = val1 - val2;
			}
			if (e.getActionCommand().equals("*")) {
				result = val1 * val2;
			}
			if (e.getActionCommand().equals("/")) {
				//you should include control errors for the division ;-) 
				//ArithmeticException.......
				result = val1 / val2;
			}

			textFieldResult.setText(Integer.toString(result));

		}
	}
}
