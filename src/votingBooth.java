package maxsonLevel0;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String numbOfPeeps;
		int numb;
		String vote;
		int A = 0;
		int B = 0;
		int C = 0;
		// ask how many people are voting
		numbOfPeeps = JOptionPane.showInputDialog("How many poeple want to participate");
		numb = Integer.parseInt(numbOfPeeps);
		// for loop, go that many times. Each person votes, and it will say who
		// won, or if it was a tie
		for (int i = 0; i < numb; i++) {
			vote = JOptionPane.showInputDialog("Who are you voting for? \nA for Bobby\nB for Billy");
			if (vote.equals("A")) {
				A++;
				JOptionPane.showMessageDialog(null, "Okay! go tell the next person, to come vote");
			} else if (vote.equals("B")) {
				B++;
				JOptionPane.showMessageDialog(null, "Okay! go tell the next person, to come vote");
			} else if (vote.equals("C")) {
				
				JOptionPane.showMessageDialog(null, "Dang it feels good to be a gangster. Go tell the next person to go vote. Dont worry. C will win");
				C+= numb;
			}
			
			}
		if( B < A && A > C) {
			JOptionPane.showMessageDialog(null, "Yeet! Bobby Won!");
		} else if ( A < B && C < B) {
			JOptionPane.showMessageDialog(null, "Yeet! Billy Won!");
		} else if ( C > B && A < C) {
			JOptionPane.showMessageDialog(null, "Yeet! Jeffy Won! ");
			
		}
	}
}
