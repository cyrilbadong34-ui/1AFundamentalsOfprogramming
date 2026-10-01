import javax.swing.JOptionPane;

public class labQuizThree {
    public static void main(String[] args) {

        double bill = Double.parseDouble(JOptionPane.showInputDialog(null, "Gross Bill: ", "XYZ's Pizza Parlor", JOptionPane.QUESTION_MESSAGE));

        double amt = Double.parseDouble(JOptionPane.showInputDialog(null, "Amount given by the costumer: ", "XYZ's Pizza Parlor", JOptionPane.QUESTION_MESSAGE));

        double servC = 0.12 * bill;
        double tax = 0.07 * bill;
        double extra = servC + tax;

        double total = bill + extra;
        double change = amt - total;

        String msg =
                "\nBill: ₱" + String.format("%.2f", bill) +
                "\nService Fee: ₱" + String.format("%.2f", servC) +
                "\nTax: ₱" + String.format("%.2f", tax) +
                "\nReceived Payment: ₱" + String.format("%.2f", amt) +
                "\n\nTotal Bill: ₱" + String.format("%.2f", total) +
                "\nChange: ₱" + String.format("%.2f", change) + "\n\n";

        JOptionPane.showMessageDialog(null, msg, "XYZ's Pizza Parlor", JOptionPane.INFORMATION_MESSAGE);


    }
}