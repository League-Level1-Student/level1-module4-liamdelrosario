package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typing implements KeyListener {
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	char currentLetter = 0;
	public void runner(){
		JFrame frame= new JFrame();
		

		frame.getContentPane().add(panel);
		panel.add(label);
		frame.addKeyListener(this);

		frame.setSize(500, 500);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		setup(frame);

	}
	void setup(JFrame frame){
		frame.setVisible(true);		
		currentLetter = generateRandomLetter();
		label.setText( String.valueOf(currentLetter)  );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		char letterPressed=e.getKeyChar();
		if(letterPressed==currentLetter) {
			panel.setBackground(Color.GREEN);
		}else {
			panel.setBackground(Color.RED);
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText( String.valueOf(currentLetter));
		System.out.println(currentLetter);
	}
	
}