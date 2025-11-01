package _09_whack_a_mole;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	JButton moleButton ;
	 JButton moleButton1;
	 JButton moleButton2;
	 JButton moleButton3;
	 JButton moleButton4;
	 JButton moleButton5;
	public whack_a_molde_displayer(){
		frame.setSize(300,400);
		

		frame.add(panel);
		panel.add(moleButton= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton1= new JButton());
		moleButton1.addActionListener(this);
		panel.add(moleButton2= new JButton());
		moleButton2.addActionListener(this);
		panel.add(moleButton3= new JButton());
		moleButton3.addActionListener(this);
		panel.add(moleButton4= new JButton());
		moleButton4.addActionListener(this);
		panel.add(moleButton5= new JButton());
		moleButton5.addActionListener(this);
		drawButton();
		frame.setVisible(true);
	}
	public void drawButton() {
		Random random = new Random();
		int randomInt = random.nextInt(6);
		System.out.println(randomInt);
		if (randomInt==0) {
		moleButton.setText("Mole");		
		}
		else if (randomInt==1) {
			moleButton1.setText("Mole");		
			}
		else if (randomInt==2) {
			moleButton2.setText("Mole");		
			}
		else if (randomInt==3) {
			moleButton3.setText("Mole");		
			}
		else if (randomInt==4) {
			moleButton4.setText("Mole");		
			}
		else if (randomInt==5) {
			moleButton5.setText("Mole");		
			}
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(moleButton== buttonPressed) {
			System.out.println("I do not know what to do");
			drawButton();
		}
	}
    static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
    private void endGame(Date timeAtStart, int molesWhacked) { 
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                      + " moles per second.");
    }

}
