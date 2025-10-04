package _06_calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculated implements ActionListener{
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
		 addButton = new JButton("add");
		 subButton = new JButton("sub");
		 multiplyButton = new JButton("multiply");
		 divideButton = new JButton("divide");
		frame.add(panel);
		text.setColumns(20);
		text1.setColumns(20);
		panel.add(text);
		panel.add(text1);
		String s1 = text.getText();
		System.out.println(s1);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		panel.add(label);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);

		frame.setVisible(true);
		
	}
	 public void actionPerformed(ActionEvent e) {
		 String s1 = text.getText();
		 System.out.println(s1);
		 String s2 = text1.getText();
		 int ss1 = Integer.parseInt(s1);
		 int ss2 = Integer.parseInt(s2);
		 System.out.println("yup");
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == addButton) {
			add(ss1,ss2);
		}
		if (buttonPressed == subButton) {
			subtract(ss1,ss2);
		}
		if (buttonPressed == multiplyButton) {
			multiply(ss1,ss2);
		}
		if (buttonPressed == divideButton) {
			divide(ss1,ss2);
		}
	 }
	
	 void add(int ss1, int ss2){
	 int adds=ss1+ss2;
	 label.setText(String.valueOf(adds));
	 System.out.println(adds);
	}
	 
	 void subtract(int ss1, int ss2) {
	 	 int minus=ss1-ss2;
	 	 label.setText(String.valueOf(minus));
	 	 System.out.println(minus);
	 }
	 
	 void multiply(int ss1, int ss2) {
	 	 int times=ss1*ss2;
	 	 label.setText(String.valueOf(times));
	 	 System.out.println(times);
	 
	 }
	 
	 void divide(int ss1, int ss2) {
	 	 int over=ss1/ss2;
	 	 label.setText(String.valueOf(over));
	 	 System.out.println(over);
		 
	 }
}
