import javax.swing.JOptionPane;

public class JOptionPane_Assignment4 {
    public static void main(String[] args) {

        int height = Integer.parseInt(
                JOptionPane.showInputDialog("Enter height in cm:")
        );

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:")
        );

        String citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N):"
        );

        String recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N):"
        );

        if (recommendee.equalsIgnoreCase("R") ||
                (height >= 200 &&
                        age >= 21 && age <= 25 &&
                        citizenship.equalsIgnoreCase("C"))) {

            JOptionPane.showMessageDialog(null, "Accepted");
        } else {
            JOptionPane.showMessageDialog(null, "Rejected");
        }
    }
}