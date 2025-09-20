package _06_calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculated {


	JPanel panel = new JPanel();
	public void run() {
		JFrame frame = new JFrame("Calculator");
		JTextField text = new JTextField();
		frame.setSize(500,500);
		frame.add(panel);
		text.setColumns(20);
		panel.add(text);
		frame.setVisible(true);
	}



}
