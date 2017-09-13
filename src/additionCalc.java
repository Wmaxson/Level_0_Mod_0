package maxsonLevel0;

import javax.swing.JOptionPane;

public class additionCalc {
	public static void main(String[] args) {
		String numb1;
		int numb11;
		int numb22;
		int awnser;
		String numb2;
		numb1 = JOptionPane.showInputDialog("What is the first number you want to add to the second number?");
		numb2 = JOptionPane.showInputDialog("What is the second number you want to add to the first number?");
		numb11 = Integer.parseInt(numb1);
		numb22 = Integer.parseInt(numb2);
		awnser = numb11 + numb22;
		JOptionPane.showMessageDialog(null,"Your awnser is " + awnser);

	}
}
