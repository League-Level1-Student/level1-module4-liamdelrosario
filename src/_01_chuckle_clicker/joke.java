package _01_chuckle_clicker;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class joke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Funny...");
		JButton button1= new JButton("joke");
		JButton button2= new JButton("punchline");
		frame.getContentPane().add(panel);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		frame.setSize(500, 500);
		frame.pack();
		button1.addActionListener(e-> System.out.println("imagine clicking joke"));
		button1.addActionListener(e-> JOptionPane.showMessageDialog(null, "Why did the chicken cross the road"));
		button2.addActionListener(e-> System.out.println("hi"));
		button2.addActionListener(e-> JOptionPane.showMessageDialog(null, "Because he saw the miskin."));

		frame.setVisible(true);
	}


}
