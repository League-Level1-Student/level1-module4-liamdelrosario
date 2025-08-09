package _02_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import game_tools.Sound;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	private JButton fourthButton;
	private JButton fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private Sound jeopardyThemeClip;



	public void run() {
		JFrame frame = new JFrame("Jeopardy");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		
	
		

	
		
		secondButton=createButton("400 ");
		
		
		// 1. Make the frame show up
	frame.setVisible(true);
		
		// 2. Give your frame a title

		// 3. Create a JPanel variable to hold the header using the createHeader method
JPanel h= createHeader("loop");
		// 4. Add the header component to the quizPanel
quizPanel.add(h);
		// 5. Add the quizPanel to the frame
frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
firstButton=createButton("500 ");
thirdButton=createButton("300 ");
fourthButton=createButton("200 ");
fifthButton=createButton("100 ");

		// 7. Add the firstButton to the quizPanel
quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
quizPanel.add(secondButton);
		// 10. Add the secondButton to the quizPanel
quizPanel.add(thirdButton);
quizPanel.add(fourthButton);
quizPanel.add(fifthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
firstButton.addActionListener(this);
secondButton.addActionListener(this);
thirdButton.addActionListener(this);
fourthButton.addActionListener(this);
fifthButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {

		// Create a new JButton
		JButton b= new JButton();
		b.setText((dollarAmount)+"dollars");
		JButton b1=new JButton();
		b1.setText((dollarAmount)+"dollars");
		JButton b2=new JButton();
		b2.setText((dollarAmount)+"dollars");
		JButton b3=new JButton();
		b3.setText((dollarAmount)+"dollars");
		JButton b4=new JButton();
		b4.setText((dollarAmount)+"dollars");
		//JButton button1= new JButton("500 money");
		// Set the text of the button to the dollarAmount
		//JButton button2= new JButton("400 money");

		// Increment the buttonCount (this should make the layout vertical)
		buttonCount+=1;
		// Return your new button instead of the temporary button
		
		return b;


	}
	

	@Override
    public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if (firstButton==buttonPressed) {
			askQuestion("What is 5*5+2^2(80+90)-70","635",500);
		}
		if (secondButton==buttonPressed) {
			askQuestion("What year was emperor king Charlemagne crowned","800",400);
		}
		if (thirdButton==buttonPressed) {
			askQuestion("What day of the week did the former ceo of youtube died","friday",300);
		}
		if (fourthButton==buttonPressed) {
			askQuestion("How many kids did John Tyler the president had with his two wifes","15",200);
		}
		if (fifthButton==buttonPressed) {
			askQuestion("Which interstate did I buried Charles McGregor in the year of 2004","interstate 10",100);
		}
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		playJeopardyTheme();
String lalo= JOptionPane.showInputDialog(question);
if(lalo.equals(correctAnswer)) {
	score+=prizeMoney;
	stopJeopardyTheme();
	updateScore();
}else {
	score-=prizeMoney;
	stopJeopardyTheme();
	updateScore();
}
		
		// Stop the theme music when they have entered their response.
		
		// If the answer is correct

			// Increase the score by the prizeMoney

			// Pop up a message to tell the user they were correct

		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer

		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		String fileName = "_02_jeopardy/jeopardy.wav";
		jeopardyThemeClip = new Sound(fileName);
		jeopardyThemeClip.play();
	}

	public void stopJeopardyTheme() {
		jeopardyThemeClip.stop();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
