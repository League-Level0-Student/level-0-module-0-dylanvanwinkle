package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		String A = ("");
		boolean C = false;
		while (C == false) {
			A = JOptionPane.showInputDialog("Knock knock.");
			if (A.equalsIgnoreCase("who's there")) {
				JOptionPane.showMessageDialog(null, "Sorry my mom says I can't answer the door to strangesrs.");
				C = true;
			} else {
				JOptionPane.showMessageDialog(null, "Wrong anwser.");
				JOptionPane.showMessageDialog(null, "Answer again.");
			}
		}
	}
}