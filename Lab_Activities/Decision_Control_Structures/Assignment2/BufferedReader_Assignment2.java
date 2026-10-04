import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_Assignment2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate (Php): ");
        double hourlyRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter total hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

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

        System.out.println("\n--- Payroll Summary (BufferedReader) ---");
        System.out.printf("Gross Pay:       Php %.2f\n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f (%.0f%%)\n", withholdingTax, (taxRate * 100));
        System.out.printf("Net Pay:         Php %.2f\n", netPay);
    }
}
