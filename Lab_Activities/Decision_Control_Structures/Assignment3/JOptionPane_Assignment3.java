import javax.swing.JOptionPane;

public class JOptionPane_Assignment3 {
    public static void main(String[] args) {

        double nsatScore = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT Score:"));
        double parentsSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter Parents' Monthly Salary:"));
        double entranceScore = Double.parseDouble(JOptionPane.showInputDialog("Enter Entrance Exam Score:"));

        String status;
        if (parentsSalary > 10000 || nsatScore < 90 || entranceScore < 85) {
            status = "Rejected";
        } else if (parentsSalary <= 3500 && ((nsatScore + entranceScore) / 2.0) >= 91) {
            status = "Accepted";
        } else {
            status = "For Further Study";
        }

        JOptionPane.showMessageDialog(null, "Application Status: " + status, "Evaluation Result", JOptionPane.INFORMATION_MESSAGE);
    }
}