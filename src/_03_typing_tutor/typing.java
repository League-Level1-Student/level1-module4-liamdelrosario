package _03_typing_tutor;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typing {
	public void runner(){
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Funny...");
	frame.getContentPane().add(panel);
	panel.add(label);
	char currentLetter = 0;
	frame.setSize(500, 500);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	setup(frame, currentLetter);
	}
	void setup(JFrame frame, char currentLetter){
		frame.setVisible(true);		
		currentLetter = generateRandomLetter();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(generateRandomLetter());

	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}
