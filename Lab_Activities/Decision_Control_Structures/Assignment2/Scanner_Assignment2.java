import java.util.Scanner;

public class Scanner_Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly pay rate (Php): ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked: ");
        double hoursWorked = scanner.nextDouble();

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

        System.out.println("\n--- Payroll Summary ---");
        System.out.printf("Gross Pay:       Php %.2f\n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f (%.0f%%)\n", withholdingTax, (taxRate * 100));
        System.out.printf("Net Pay:         Php %.2f\n", netPay);

        scanner.close();
    }
}