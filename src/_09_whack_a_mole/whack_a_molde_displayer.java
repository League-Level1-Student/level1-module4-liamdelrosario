package _09_whack_a_mole;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		Random random = new Random();
		int randomInt = random.nextInt(24);
		System.out.println(randomInt);
		frame.add(panel);
		panel.add(moleButton= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton1= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton2= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton3= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton4= new JButton());
		moleButton.addActionListener(this);
		panel.add(moleButton5= new JButton());
		moleButton.addActionListener(this);
		
		frame.setVisible(true);
	}
	public void drawButton() {
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(moleButton== buttonPressed) {
			
		}
	}
}
