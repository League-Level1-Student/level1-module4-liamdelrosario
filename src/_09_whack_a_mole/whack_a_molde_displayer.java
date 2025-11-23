package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.Date;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class whack_a_molde_displayer implements ActionListener {
	JFrame frame = new JFrame("Whack a mole");
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JLabel label = new JLabel();
	JButton[] buttons = new JButton[24];
	int moleWhacked = 0;
	int guttersWhacked = 0;
	Date moleTimes;
	public whack_a_molde_displayer() {
		frame.setSize(300, 400);

		frame.add(panel);
		for(int i=0; i<24; i++ ) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		drawButton();
		frame.setVisible(true);
		moleTimes = new Date();
	}
	

	public void drawButton() {
		Random random = new Random();
		int randomInt = random.nextInt(24);
//		System.out.println(randomInt);
		for(int i=0; i<24; i++ ) {
			buttons[i].setText("( )"); 
			if(i == randomInt) {
				buttons[i].setText("Mole");
			}
			
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		String moleLabel = buttonPressed.getText();
		if (moleLabel.equals("Mole")) {
			moleWhacked+=1;
			drawButton();
			playSound("me-gusta.wav");
			System.out.println(moleWhacked);
		}
		if (moleLabel.equals("( )")) {
			guttersWhacked += 1;
			drawButton();
			System.out.println("You missed, you apathetic dingleberry");
			if(guttersWhacked ==5) {
				youSuck(guttersWhacked);
			}
		}
			
			if (moleWhacked == 10) {
				endGame(moleTimes, moleWhacked);
			}
		
	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		System.exit(0);
	}
	private void youSuck( int guttersWhacked) {
		JOptionPane.showMessageDialog(null, "You sucked. Do you know how many gutters you hit? Five. You are truly an apathetice dingleberry.");
		System.exit(0);
	}
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}


}
