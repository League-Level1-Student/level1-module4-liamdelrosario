package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class uiPigTranslator implements ActionListener {
	JButton submitButton;
	JFrame frame = new JFrame("Tvshow.info");
	JPanel panel = new JPanel();		
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();
	JLabel label = new JLabel("Can you speak pig latin?");

	public uiPigTranslator() {
		frame.setSize(550,100);
		submitButton = new JButton("submit");
		frame.add(panel);
		panel.add(label);
		panel.add(text);
		text.setColumns(20);
		panel.add(submitButton);
		submitButton.setSize(50, 50);
		submitButton.addActionListener(this);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String showEnglish = text.getText();
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == submitButton) {
		System.out.println("wow I know how to code on another device");
		PigLatinTranslator ui = new PigLatinTranslator();
		String ui1 = PigLatinTranslator.translateEnglishToPigLatin(showEnglish);
		JOptionPane.showMessageDialog(null, ui1);
		}
	}
}
