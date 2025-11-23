package _10_slot_machine;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine {
	JFrame frame = new JFrame("Machine");
	JPanel panel = new JPanel();
	public void run() {
		frame.add(panel);
		orange = createLabelImage("orange.png");

	}

private JLabel createLabelImage(String fileName) {
	JLabel imageLabel = new JLabel();
	URL imageURL = getClass().getResource(fileName);
	if (imageURL == null) {
		imageLabel.setText("Could not find image " + fileName);
	} else {
		Icon icon = new ImageIcon(imageURL);
		imageLabel.setIcon(icon);
	}
	return imageLabel;
}
}