package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_runner {
	

	public void setup()
	{JFrame frame = new JFrame("Diglet");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
		frame.add(panel);
		//panel.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
	}
	
	char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
	public static void main(String[] args) {	
	}
}
