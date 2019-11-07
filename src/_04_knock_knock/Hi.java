package _04_knock_knock;

import javax.swing.JOptionPane;

public class Hi {
public static void main(String[] args) {
    boolean C = false;
    String A = ("");
    String B = ("");
    JOptionPane.showMessageDialog(null, "Hi.");
    A = JOptionPane.showInputDialog("How's your day");
    if (A.equalsIgnoreCase("good")) {
        JOptionPane.showMessageDialog(null, "Great news.");
        C = true;
    } else {
       B = JOptionPane.showInputDialog(null, "Sorry for you what happed.");
        JOptionPane.showMessageDialog(null, "I am sorry about " +B );
}







}
}