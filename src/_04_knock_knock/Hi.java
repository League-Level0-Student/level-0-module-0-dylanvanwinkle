package _04_knock_knock;

import javax.swing.JOptionPane;

public class Hi {
public static void main(String[] args) {
    boolean C = false;
    String A = ("");
    String D = ("");
   D = JOptionPane.showInputDialog("Hi, what's your name.");
    A = JOptionPane.showInputDialog("How's your day");
    if (A.equalsIgnoreCase("good")) {
        JOptionPane.showMessageDialog(null, "Great news " +D+ ".");
        C = true;
    } else {
        JOptionPane.showMessageDialog(null, "I am sorry for you " +D+ "." );
}







}
}