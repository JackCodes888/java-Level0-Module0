package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer1 = JOptionPane.showInputDialog("What is 1+1");
				// 3.  Use an if statement to check if their answer is correct
				if (answer1.equals( "2")) {
					score += 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
				
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
				String answer2 = JOptionPane.showInputDialog("What is 14 * 14");
				// 3.  Use an if statement to check if their answer is correct
				if (answer2.equals( "196")) {
					score += 1;
				}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your score is "+score+" out of 2.");
				}
	}

