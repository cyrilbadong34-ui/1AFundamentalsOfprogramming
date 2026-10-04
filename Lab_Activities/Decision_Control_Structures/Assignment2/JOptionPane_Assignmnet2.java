import javax.swing.JOptionPane;

public class JOptionPane_Assignmnet2 {
    public static void main(String[] args) {

        String rateInput = JOptionPane.showInputDialog(null, "Enter hourly pay rate (Php):", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
        double hourlyRate = Double.parseDouble(rateInput);

        String hoursInput = JOptionPane.showInputDialog(null, "Enter total hours worked:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
        double hoursWorked = Double.parseDouble(hoursInput);

        double grossPay = hourlyRate * hoursWorked;

        double taxRate = 0.0;
        if (grossPay >= 0 && grossPay <= 2000.00) {
            taxRate = 0.10;
        } else if (grossPay >= 2001.00 && grossPay <= 4000.00) {
            taxRate = 0.12;
        } else if (grossPay >= 4001.00 && grossPay <= 10000.00) {
            taxRate = 0.15;
        } else if (grossPay > 10000.00) {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String outputMessage = String.format(
                "--- Payroll Summary ---\n\n" +
                        "Gross Pay: ₱%.2f\n" +
                        "Withholding Tax: ₱%.2f (%.0f%%)\n" +
                        "Net Pay: ₱%.2f\n\n" ,
                grossPay, withholdingTax, (taxRate * 100), netPay
        );

        JOptionPane.showMessageDialog(null, outputMessage, "Payroll Results", JOptionPane.INFORMATION_MESSAGE);
    }
}
