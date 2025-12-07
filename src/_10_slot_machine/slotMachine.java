package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
public class slotMachine implements MouseListener, ActionListener {
//	 orange = ImageIO.read(getClass().getResource("orange.png"));
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label;
    JLabel label2;
    JLabel label3;
    JButton button = new JButton();
	public void run() {	
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		label = createLabelImage("orange.png");
		panel.add(label);
		label2 = createLabelImage("cherry.png");
		panel.add(label2);
		label3 = createLabelImage("banana.png");
		panel.add(label3);
		frame.pack();
		frame.setVisible(true);

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

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	panel.remove(label);
	panel.remove(label2);
	panel.remove(label3);
	// TODO: use random numbers to switch through diffrnent values you could see
	panel.repaint();
}
}