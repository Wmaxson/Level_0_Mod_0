package maxsonLevel0;

import javax.swing.JOptionPane;

public class wordLoop {
	public static void main(String[] args) {
		String numb1;
		String word;
		int numb;
		word = JOptionPane.showInputDialog("Say a random word");
		numb1 = JOptionPane.showInputDialog("Say a random number");
		numb = Integer.parseInt(numb1);
		for (int i = 0; i < numb ; i++ ) {
			System.out.println(word);
		}
	}
}
