package _06_calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculated {
	 JButton addButton;
	 JButton subButton;
	 JButton multiplyButton;
	 JButton divideButton;

	JPanel panel = new JPanel();		
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();
	JLabel label = new JLabel();
	
	public void run() {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(550,500);
		JButton addButton = new JButton("add");
		JButton subButton = new JButton("sub");
		JButton multiplyButton = new JButton("multiply");
		JButton divideButton = new JButton("divide");

		frame.add(panel);
		text.setColumns(20);
		text1.setColumns(20);
		panel.add(text);
		panel.add(text1);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		panel.add(label);
		frame.setVisible(true);
	}
	 public void actionPerformed(ActionEvent e) {
		 String s1 = text.getText();
		 String s2 = text1.getText();
		 int ss1 = Integer.parseInt(s1);
		 int ss2 = Integer.parseInt(s2);
		JButton buttonPressed = (JButton) e.getSource();
		if (addButton==buttonPressed) {
			add(ss1,ss2);
		}
		 
	 }
	
	 void add(int ss1, int ss2){
	 int adds=ss1+ss2;
	 label.setText(String.valueOf(adds));
	}
	 
	 void subtract() {
	 	 
	 	 
	 }
	 
	 void multiply() {
	 
	 
	 }
	 
	 void divide() {
		 
		 
	 }
}
