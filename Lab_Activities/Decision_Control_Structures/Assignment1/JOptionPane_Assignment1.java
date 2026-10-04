import javax.swing.JOptionPane;

public class JOptionPane_Assignment1 {
    public static void main(String[] args) {

        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year: "));

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            JOptionPane.showMessageDialog(null, "Leap Year");}
        else{
            JOptionPane.showMessageDialog(null, "Not a leap year");}

    }
}