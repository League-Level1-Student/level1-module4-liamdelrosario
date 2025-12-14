package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Random;

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
	Random random = new Random();
	int randomInt = random.nextInt(3);
	int randomInt1 = random.nextInt(3);
	int randomInt2 = random.nextInt(3);
if (randomInt == 0) {
	label=createLabelImage("orange.png");
	panel.add(label);
}
else if (randomInt == 1) {
	label=createLabelImage("cherry.png");
	panel.add(label);
}
else if (randomInt == 2) {
	label=createLabelImage("banana.png");
	panel.add(label);
}
if (randomInt1 == 0) {
	label2=createLabelImage("orange.png");
	panel.add(label2);
}
else if (randomInt1 == 1) {
	label2=createLabelImage("cherry.png");
	panel.add(label2);
}
else if (randomInt1 == 2) {
	label2=createLabelImage("banana.png");
	panel.add(label2);
}
if (randomInt2 == 0) {
	label3=createLabelImage("orange.png");
	panel.add(label3);
}
else if (randomInt2 == 1) {
	label3=createLabelImage("cherry.png");
	panel.add(label3);
}
else if (randomInt2 == 2) {
	label3=createLabelImage("banana.png");
	panel.add(label3);
}
	System.out.println(randomInt);
if(randomInt==randomInt1 && randomInt1==randomInt2) {
	System.out.println("You won!!!! :P");
}
	panel.repaint();
	frame.pack();
}
}